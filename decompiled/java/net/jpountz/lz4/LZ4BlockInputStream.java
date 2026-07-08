package net.jpountz.lz4;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Checksum;
import net.jpountz.util.SafeUtils;
import net.jpountz.xxhash.XXHashFactory;

/* JADX INFO: loaded from: classes36.dex */
public final class LZ4BlockInputStream extends FilterInputStream {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public byte[] buffer;
    public final Checksum checksum;
    public byte[] compressedBuffer;
    public final LZ4FastDecompressor decompressor;
    public boolean finished;
    public int o;
    public int originalLen;
    public final boolean stopOnEmptyBlock;

    private void refill() throws IOException {
        try {
            readFully(this.compressedBuffer, LZ4BlockOutputStream.HEADER_LENGTH);
            int i = 0;
            while (true) {
                int i2 = LZ4BlockOutputStream.MAGIC_LENGTH;
                if (i >= i2) {
                    byte[] bArr = this.compressedBuffer;
                    int i3 = bArr[i2] & 255;
                    int i4 = i3 & 240;
                    int i5 = (i3 & 15) + 10;
                    if (i4 != 16 && i4 != 32) {
                        throw new IOException("Stream is corrupted");
                    }
                    int intLE = SafeUtils.readIntLE(bArr, i2 + 1);
                    this.originalLen = SafeUtils.readIntLE(this.compressedBuffer, i2 + 5);
                    int intLE2 = SafeUtils.readIntLE(this.compressedBuffer, i2 + 9);
                    int i6 = this.originalLen;
                    if (i6 > (1 << i5) || i6 < 0 || intLE < 0 || (i6 != 0 ? intLE == 0 : intLE != 0) || (i4 == 16 && i6 != intLE)) {
                        throw new IOException("Stream is corrupted");
                    }
                    if (i6 == 0 && intLE == 0) {
                        if (intLE2 != 0) {
                            throw new IOException("Stream is corrupted");
                        }
                        if (this.stopOnEmptyBlock) {
                            this.finished = true;
                            return;
                        } else {
                            refill();
                            return;
                        }
                    }
                    byte[] bArr2 = this.buffer;
                    if (bArr2.length < i6) {
                        this.buffer = new byte[Math.max(i6, (bArr2.length * 3) / 2)];
                    }
                    if (i4 == 16) {
                        readFully(this.buffer, this.originalLen);
                    } else {
                        if (i4 != 32) {
                            throw new AssertionError();
                        }
                        byte[] bArr3 = this.compressedBuffer;
                        if (bArr3.length < intLE) {
                            this.compressedBuffer = new byte[Math.max(intLE, (bArr3.length * 3) / 2)];
                        }
                        readFully(this.compressedBuffer, intLE);
                        try {
                            if (intLE != this.decompressor.decompress(this.compressedBuffer, 0, this.buffer, 0, this.originalLen)) {
                                throw new IOException("Stream is corrupted");
                            }
                        } catch (LZ4Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            throw new IOException("Stream is corrupted", e);
                        }
                    }
                    this.checksum.reset();
                    this.checksum.update(this.buffer, 0, this.originalLen);
                    if (((int) this.checksum.getValue()) != intLE2) {
                        throw new IOException("Stream is corrupted");
                    }
                    this.o = 0;
                    return;
                }
                if (this.compressedBuffer[i] != LZ4BlockOutputStream.MAGIC[i]) {
                    throw new IOException("Stream is corrupted");
                }
                i++;
            }
        } catch (EOFException e2) {
            TryCatchGuardChecker.doCheck(e2);
            if (this.stopOnEmptyBlock) {
                throw e2;
            }
            this.finished = true;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return this.originalLen - this.o;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.finished) {
            return -1;
        }
        if (this.o == this.originalLen) {
            refill();
        }
        if (this.finished) {
            return -1;
        }
        byte[] bArr = this.buffer;
        int i = this.o;
        this.o = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new IOException("mark/reset not supported");
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LZ4BlockInputStream");
        sbLIZ.append("(in=");
        sbLIZ.append(((FilterInputStream) this).in);
        sbLIZ.append(", decompressor=");
        sbLIZ.append(this.decompressor);
        sbLIZ.append(", checksum=");
        sbLIZ.append(this.checksum);
        sbLIZ.append(")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LZ4BlockInputStream(InputStream inputStream) {
        this(inputStream, LZ4Factory.fastestInstance().fastDecompressor());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        if (j <= 0 || this.finished) {
            return 0L;
        }
        if (this.o == this.originalLen) {
            refill();
        }
        if (this.finished) {
            return 0L;
        }
        int iMin = (int) Math.min(j, this.originalLen - this.o);
        this.o += iMin;
        return iMin;
    }

    public LZ4BlockInputStream(InputStream inputStream, boolean z) {
        this(inputStream, LZ4Factory.fastestInstance().fastDecompressor(), XXHashFactory.fastestInstance().newStreamingHash32(-1756908916).asChecksum(), z);
    }

    private void readFully(byte[] bArr, int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = ((FilterInputStream) this).in.read(bArr, i2, i - i2);
            if (i3 >= 0) {
                i2 += i3;
            } else {
                throw new EOFException("Stream ended prematurely");
            }
        }
    }

    public LZ4BlockInputStream(InputStream inputStream, LZ4FastDecompressor lZ4FastDecompressor) {
        this(inputStream, lZ4FastDecompressor, XXHashFactory.fastestInstance().newStreamingHash32(-1756908916).asChecksum(), true);
    }

    public LZ4BlockInputStream(InputStream inputStream, LZ4FastDecompressor lZ4FastDecompressor, Checksum checksum) {
        this(inputStream, lZ4FastDecompressor, checksum, true);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        SafeUtils.checkRange(bArr, i, i2);
        if (this.finished) {
            return -1;
        }
        if (this.o == this.originalLen) {
            refill();
        }
        if (this.finished) {
            return -1;
        }
        int iMin = Math.min(i2, this.originalLen - this.o);
        System.arraycopy(this.buffer, this.o, bArr, i, iMin);
        this.o += iMin;
        return iMin;
    }

    public LZ4BlockInputStream(InputStream inputStream, LZ4FastDecompressor lZ4FastDecompressor, Checksum checksum, boolean z) {
        super(inputStream);
        this.decompressor = lZ4FastDecompressor;
        this.checksum = checksum;
        this.stopOnEmptyBlock = z;
        this.buffer = new byte[0];
        this.compressedBuffer = new byte[LZ4BlockOutputStream.HEADER_LENGTH];
        this.originalLen = 0;
        this.o = 0;
    }
}
