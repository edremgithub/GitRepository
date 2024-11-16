const express = require('express');
const Pusher = require('pusher');

const app = express();
const port = 5500;

app.use(express.json());

const pusher = new Pusher({
    appId: '1841927',
    key: '3c2f30d30f23f9189fff',
    secret: '03e79905282762eebf93',
    cluster: 'ap1',
    useTLS: true
});

// Route to handle GET requests at root URL
app.get('/', (req, res) => {
    res.send('Welcome to the Pusher Express Server!');
});


app.post('/trigger-watermark', (req, res) => {
    const { duration } = req.body;

    pusher.trigger('web-project', 'watermark', {
        duration: duration || 5000
    });

    res.sendStatus(200);
});

app.listen(port, () => {
    console.log(`Server is running on http://localhost:${port}`);
});