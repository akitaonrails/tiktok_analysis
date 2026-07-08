package com.ss.android.vesdk;

import X.C0VSP;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes4.dex */
public class TECryptStream extends InputStream {
    public long cryptor;
    public FileInputStream fileInputStream;
    public long fileSize;
    public int pos;

    public static native long nativeCreateCryptor(String str);

    public static native int nativeDecrypt(long j, byte[] bArr, int i, long j2);

    public static native void nativeDestroyCryptor(long j);

    public static native int nativeGetBdveTagSize(long j, long j2);

    public static native int nativeMatch(long j, byte[] bArr, int i);

    @Override // java.io.InputStream
    public int available() {
        return (int) (this.fileSize - ((long) this.pos));
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        FileInputStream fileInputStream = this.fileInputStream;
        if (fileInputStream != null) {
            fileInputStream.close();
        }
        long j = this.cryptor;
        if (j != 0) {
            nativeDestroyCryptor(j);
        }
        this.cryptor = 0L;
        this.pos = 0;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.pos + 1 >= this.fileSize) {
            return -1;
        }
        int i = this.fileInputStream.read();
        long j = this.cryptor;
        if (j == 0 || i == -1) {
            return i;
        }
        byte[] bArr = {(byte) i};
        nativeDecrypt(j, bArr, 1, this.pos);
        this.pos++;
        return bArr[0];
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public TECryptStream(String str, String str2) throws Exception {
        init(new RandomAccessFile(str, "r").getFD(), str2);
    }

    private void init(FileDescriptor fileDescriptor, String str) throws Exception {
        int iNativeGetBdveTagSize;
        this.fileInputStream = new C0VSP(fileDescriptor);
        this.fileSize = r0.available();
        long jNativeCreateCryptor = nativeCreateCryptor(str);
        this.cryptor = jNativeCreateCryptor;
        if (jNativeCreateCryptor > 0 && (iNativeGetBdveTagSize = nativeGetBdveTagSize(jNativeCreateCryptor, this.fileSize)) > 0) {
            FileChannel channel = this.fileInputStream.getChannel();
            long jPosition = channel.position();
            long j = iNativeGetBdveTagSize;
            channel.position(this.fileSize - j);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iNativeGetBdveTagSize);
            channel.read(byteBufferAllocate);
            if (nativeMatch(this.cryptor, byteBufferAllocate.array(), iNativeGetBdveTagSize) == 0) {
                channel.position(jPosition);
                this.fileSize -= j;
            } else {
                close();
                final String str2 = "Crypt not match!!!";
                throw new Exception(str2) { // from class: X.09Z4
                };
            }
        }
    }

    public TECryptStream(FileDescriptor fileDescriptor, String str) throws Exception {
        init(fileDescriptor, str);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.pos;
        long j = i3 + i2;
        long j2 = this.fileSize;
        if (j >= j2 && (i2 = (int) (j2 - ((long) i3))) <= 0) {
            return -1;
        }
        int i4 = this.fileInputStream.read(bArr, i, i2);
        if (i4 > 0) {
            int i5 = this.pos;
            this.pos = i5 + i4;
            long j3 = this.cryptor;
            if (j3 != 0) {
                return nativeDecrypt(j3, bArr, i4, i5);
            }
            return i4;
        }
        return i4;
    }
}
