package net.jpountz.lz4;

import X.C786410Ut5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import net.jpountz.lz4.LZ4FrameOutputStream;
import net.jpountz.xxhash.XXHash32;
import net.jpountz.xxhash.XXHashFactory;

/* JADX INFO: loaded from: classes36.dex */
public class LZ4FrameInputStream extends FilterInputStream {
    public ByteBuffer buffer;
    public final XXHash32 checksum;
    public byte[] compressedBuffer;
    public final LZ4SafeDecompressor decompressor;
    public long expectedContentSize;
    public LZ4FrameOutputStream.FrameInfo frameInfo;
    public final byte[] headerArray;
    public final ByteBuffer headerBuffer;
    public int maxBlockSize;
    public byte[] rawBuffer;
    public final ByteBuffer readNumberBuff;
    public long totalContentSize;

    private boolean nextFrameInfo() throws IOException {
        while (true) {
            int i = 0;
            do {
                int i2 = ((FilterInputStream) this).in.read(this.readNumberBuff.array(), i, 4 - i);
                if (i2 < 0) {
                    return false;
                }
                i += i2;
            } while (i < 4);
            int i3 = this.readNumberBuff.getInt(0);
            if (i3 == 407708164) {
                readHeader();
                return true;
            }
            if ((i3 >>> 4) != 25481893) {
                throw new IOException("Stream unsupported");
            }
            skippableFrame();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        throw new UnsupportedOperationException("reset not supported");
    }

    private void readBlock() throws IOException {
        int i = readInt(((FilterInputStream) this).in);
        boolean z = (Integer.MIN_VALUE & i) == 0;
        int iDecompress = i & Integer.MAX_VALUE;
        if (iDecompress == 0) {
            if (this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_CHECKSUM) && readInt(((FilterInputStream) this).in) != this.frameInfo.currentStreamHash()) {
                throw new IOException("Content checksum mismatch");
            }
            if (this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_SIZE) && this.expectedContentSize != this.totalContentSize) {
                throw new IOException("Size check mismatch");
            }
            this.frameInfo.finish();
            return;
        }
        byte[] bArr = z ? this.compressedBuffer : this.rawBuffer;
        if (iDecompress > this.maxBlockSize) {
            throw new IOException(C786410Ut5.k4(Locale.ROOT, "Block size %s exceeded max: %s", new Object[]{Integer.valueOf(iDecompress), Integer.valueOf(this.maxBlockSize)}));
        }
        int i2 = 0;
        while (i2 < iDecompress) {
            int i3 = ((FilterInputStream) this).in.read(bArr, i2, iDecompress - i2);
            if (i3 < 0) {
                throw new IOException("Stream ended prematurely");
            }
            i2 += i3;
        }
        if (this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.BLOCK_CHECKSUM) && readInt(((FilterInputStream) this).in) != this.checksum.hash(bArr, 0, iDecompress, 0)) {
            throw new IOException("Block checksum mismatch");
        }
        if (z) {
            try {
                LZ4SafeDecompressor lZ4SafeDecompressor = this.decompressor;
                byte[] bArr2 = this.rawBuffer;
                iDecompress = lZ4SafeDecompressor.decompress(bArr, 0, iDecompress, bArr2, 0, bArr2.length);
            } catch (LZ4Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw new IOException(e);
            }
        }
        if (this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_CHECKSUM)) {
            this.frameInfo.updateStreamHash(this.rawBuffer, 0, iDecompress);
        }
        this.totalContentSize += (long) iDecompress;
        this.buffer.limit(iDecompress);
        this.buffer.rewind();
    }

    private void readHeader() throws IOException {
        this.headerBuffer.rewind();
        int i = ((FilterInputStream) this).in.read();
        if (i < 0) {
            throw new IOException("Stream ended prematurely");
        }
        int i2 = ((FilterInputStream) this).in.read();
        if (i2 < 0) {
            throw new IOException("Stream ended prematurely");
        }
        byte b = (byte) (i & 255);
        LZ4FrameOutputStream.FLG flgFromByte = LZ4FrameOutputStream.FLG.fromByte(b);
        this.headerBuffer.put(b);
        byte b2 = (byte) (i2 & 255);
        LZ4FrameOutputStream.BD bdFromByte = LZ4FrameOutputStream.BD.fromByte(b2);
        this.headerBuffer.put(b2);
        this.frameInfo = new LZ4FrameOutputStream.FrameInfo(flgFromByte, bdFromByte);
        if (flgFromByte.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_SIZE)) {
            long j = readLong(((FilterInputStream) this).in);
            this.expectedContentSize = j;
            this.headerBuffer.putLong(j);
        }
        this.totalContentSize = 0L;
        byte bHash = (byte) ((this.checksum.hash(this.headerArray, 0, this.headerBuffer.position(), 0) >> 8) & 255);
        int i3 = ((FilterInputStream) this).in.read();
        if (i3 < 0) {
            throw new IOException("Stream ended prematurely");
        }
        if (bHash != ((byte) (i3 & 255))) {
            throw new IOException("Stream frame descriptor corrupted");
        }
        int blockMaximumSize = this.frameInfo.getBD().getBlockMaximumSize();
        this.maxBlockSize = blockMaximumSize;
        this.compressedBuffer = new byte[blockMaximumSize];
        byte[] bArr = new byte[blockMaximumSize];
        this.rawBuffer = bArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.buffer = byteBufferWrap;
        byteBufferWrap.limit(0);
    }

    private void skippableFrame() throws IOException {
        int i = readInt(((FilterInputStream) this).in);
        byte[] bArr = new byte[1024];
        while (i > 0) {
            int i2 = ((FilterInputStream) this).in.read(bArr, 0, Math.min(i, 1024));
            if (i2 < 0) {
                throw new IOException("Stream ended prematurely");
            }
            i -= i2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return this.buffer.remaining();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        while (this.buffer.remaining() == 0) {
            if (this.frameInfo.isFinished() && !nextFrameInfo()) {
                return -1;
            }
            readBlock();
        }
        return this.buffer.get() & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
    }

    public LZ4FrameInputStream(InputStream inputStream) {
        this(inputStream, LZ4Factory.fastestInstance().safeDecompressor(), XXHashFactory.fastestInstance().hash32());
    }

    private int readInt(InputStream inputStream) throws IOException {
        int i = 0;
        do {
            int i2 = inputStream.read(this.readNumberBuff.array(), i, 4 - i);
            if (i2 >= 0) {
                i += i2;
            } else {
                throw new IOException("Stream ended prematurely");
            }
        } while (i < 4);
        return this.readNumberBuff.getInt(0);
    }

    private long readLong(InputStream inputStream) throws IOException {
        int i = 0;
        do {
            int i2 = inputStream.read(this.readNumberBuff.array(), i, 8 - i);
            if (i2 >= 0) {
                i += i2;
            } else {
                throw new IOException("Stream ended prematurely");
            }
        } while (i < 8);
        return this.readNumberBuff.getLong(0);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        throw new UnsupportedOperationException("mark not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        if (j <= 0) {
            return 0L;
        }
        while (this.buffer.remaining() == 0) {
            if (this.frameInfo.isFinished() && !nextFrameInfo()) {
                return 0L;
            }
            readBlock();
        }
        long jMin = Math.min(j, this.buffer.remaining());
        ByteBuffer byteBuffer = this.buffer;
        byteBuffer.position(byteBuffer.position() + ((int) jMin));
        return jMin;
    }

    public LZ4FrameInputStream(InputStream inputStream, LZ4SafeDecompressor lZ4SafeDecompressor, XXHash32 xXHash32) throws IOException {
        super(inputStream);
        byte[] bArr = new byte[15];
        this.headerArray = bArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.headerBuffer = byteBufferWrap.order(byteOrder);
        this.buffer = null;
        this.rawBuffer = null;
        this.maxBlockSize = -1;
        this.expectedContentSize = -1L;
        this.totalContentSize = 0L;
        this.frameInfo = null;
        this.readNumberBuff = ByteBuffer.allocate(8).order(byteOrder);
        this.decompressor = lZ4SafeDecompressor;
        this.checksum = xXHash32;
        nextFrameInfo();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            while (this.buffer.remaining() == 0) {
                if (this.frameInfo.isFinished() && !nextFrameInfo()) {
                    return -1;
                }
                readBlock();
            }
            int iMin = Math.min(i2, this.buffer.remaining());
            this.buffer.get(bArr, i, iMin);
            return iMin;
        }
        throw new IndexOutOfBoundsException();
    }
}
