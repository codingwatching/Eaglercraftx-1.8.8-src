
# Eagler Context Redacted Diff
# Copyright (c) 2025 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> CHANGE  3 : 4  @  3 : 6

~ 

> DELETE  3  @  3 : 4

> CHANGE  8 : 12  @  8 : 12

~ //	public C01PacketEncryptionResponse(SecretKey secretKey, PublicKey publicKey, byte[] verifyToken) {
~ //		this.secretKeyEncrypted = CryptManager.encryptData(publicKey, secretKey.getEncoded());
~ //		this.verifyTokenEncrypted = CryptManager.encryptData(publicKey, verifyToken);
~ //	}

> CHANGE  2 : 4  @  2 : 4

~ 		this.secretKeyEncrypted = parPacketBuffer.readByteArray(1024);
~ 		this.verifyTokenEncrypted = parPacketBuffer.readByteArray(1024);

> CHANGE  11 : 14  @  11 : 14

~ //	public SecretKey getSecretKey(PrivateKey key) {
~ //		return CryptManager.decryptSharedKey(key, this.secretKeyEncrypted);
~ //	}

> CHANGE  1 : 4  @  1 : 4

~ //	public byte[] getVerifyToken(PrivateKey key) {
~ //		return key == null ? this.verifyTokenEncrypted : CryptManager.decryptData(key, this.verifyTokenEncrypted);
~ //	}

> EOF
