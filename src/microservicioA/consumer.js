const { Kafka, CompressionTypes, logLevel } = require('kafkajs')

const kafka = new Kafka({
  logLevel: logLevel.DEBUG,
  brokers: ['broker1:9092', 'broker2:9092', 'broker3:9092'],
  clientId: 'example-consumer',
})

const consumer = kafka.consumer({ groupId: 'test-group' })
const producer = kafka.producer()


const init = async () => {
    await consumer.connect().then(() => console.log('se ha conectado el consumer'));
    await producer.connect().then(() => console.log('se ha conectado el producer'));
    await consumer.subscribe({ topic: 'A', fromBeginning: true })
    await consumer.subscribe({ topic: 'B' })

    await consumer.run({
        eachMessage: async ({ topic, partition, message }) => {
            // switch(topic) {
            //     case 'A': producer.send({topic: 'B', messages: [message,],}); break;
            //     case 'B': producer.send({topic: 'A', messages: [message,],}); break;
            // }
            console.log({ topic, partition, message });
        },
    })
}

init().then(console.log('se ha iniciado'));