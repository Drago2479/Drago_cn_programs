import socket,zlib

s=socket.socket();s.bind(('localhost',9999));s.listen(1)
c,a=s.accept();d=c.recv(1024)
msg,crc=d[:-4],d[-4:]
print(f"From {a}\nMessage: {msg.decode()}\nCRC Received: {int.from_bytes(crc,'big')}")
print("✅ Correct" if zlib.crc32(msg).to_bytes(4,'big')==crc else "❌ Error")
c.close();s.close()
