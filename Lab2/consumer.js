import { connect } from 'amqplib';

async function receive() {
  console.log('🚀 Consumer đang khởi động...');

  const connection = await connect('amqp://localhost:5672');
  const channel = await connection.createChannel();

  const queue = 'email_queue';

  await channel.assertQueue(queue, { durable: true });

  console.log('📬 Consumer đang CHỜ message...');

  channel.consume(queue, (msg) => {
    if (msg !== null) {
      const data = JSON.parse(msg.content.toString());
      console.log('📧 Nhận được job:', data);

      setTimeout(() => {
        console.log('✅ Gửi mail xong cho:', data.email);
        channel.ack(msg);
      }, 3000);
    }
  });
}

receive().catch(err => console.error('❌ Lỗi consumer:', err));