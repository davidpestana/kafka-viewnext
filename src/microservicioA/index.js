const { Kafka } = require('kafkajs')

const kafka = new Kafka({
  clientId: 'microserviceA',
  brokers: ['broker1:9092', 'broker2:9092', 'broker3:9092'],
});

const schema = {
    name: "string",
    subName: "string"
}

const user = {
    name: "david",
    subName: "pestana"
}

const producer = kafka.producer()

const send = (producer, counter) => {
   producer.send({
    topic: 'A',
        messages: [
            { value: JSON.stringify(user) },
        ],
    })
    .then((response)=>{console.log(response)})
    .catch((error)=>{console.log(error)})
}


const main = async () => {
    await producer.connect()
    let i = 0;
    setInterval(()=>{send(producer, i++)},1000);
}


main().then(() => {}).catch(()=>{})