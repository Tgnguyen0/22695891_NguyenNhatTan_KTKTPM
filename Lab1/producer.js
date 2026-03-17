import { connect } from 'amqplib';

async function send() {
  console.log('🚀 Producer đang gửi message...');

  const connection = await connect('amqp://localhost:5672');
  const channel = await connection.createChannel();

  const queue = 'email_queue';
  const msg = {
    orderId: 1,
    email: 'test@gmail.com'
  };

  await channel.assertQueue(queue, { durable: true });
  channel.sendToQueue(queue, Buffer.from(JSON.stringify(msg)));

  console.log('📤 Đã gửi:', msg);

  setTimeout(() => {
    connection.close();
    process.exit(0);
  }, 500);
}

send().catch(err => console.error('❌ Lỗi producer:', err));
