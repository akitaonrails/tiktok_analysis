package com.bytedance.compression.zstd;

import X.C08RS;
import X.C2188811AlT;
import X.C2252881DFu;
import X.InterfaceC2252891DFv;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes36.dex */
public class ZstdOutputStreamNoFinalizer extends FilterOutputStream {
    public static final int dstSize;
    public final InterfaceC2252891DFv bufferPool;
    public boolean closeFrameOnFlush;
    public final byte[] dst;
    public final ByteBuffer dstByteBuffer;
    public long dstPos;
    public boolean frameClosed;
    public boolean isClosed;
    public long srcPos;
    public final long stream;

    private native int compressStream(long j, byte[] bArr, int i, byte[] bArr2, int i2);

    public static native long createCStream();

    private native int endStream(long j, byte[] bArr, int i);

    private native int flushStream(long j, byte[] bArr, int i);

    public static native int freeCStream(long j);

    public static native long recommendedCOutSize();

    private native int resetCStream(long j);

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        close(true);
    }

    public synchronized void closeWithoutClosingParentStream() {
        close(false);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public synchronized void flush() {
        int iFlushStream;
        int iEndStream;
        if (this.isClosed) {
            throw new IOException("Stream closed");
        }
        if (!this.frameClosed) {
            if (this.closeFrameOnFlush) {
                do {
                    iEndStream = endStream(this.stream, this.dst, dstSize);
                    long j = iEndStream;
                    if (Zstd.isError(j)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Compression error: ");
                        sbLIZ.append(Zstd.getErrorName(j));
                        throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    ((FilterOutputStream) this).out.write(this.dst, 0, (int) this.dstPos);
                } while (iEndStream > 0);
                this.frameClosed = true;
            } else {
                do {
                    iFlushStream = flushStream(this.stream, this.dst, dstSize);
                    long j2 = iFlushStream;
                    if (Zstd.isError(j2)) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Compression error: ");
                        sbLIZ2.append(Zstd.getErrorName(j2));
                        throw new IOException(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    ((FilterOutputStream) this).out.write(this.dst, 0, (int) this.dstPos);
                } while (iFlushStream > 0);
            }
            ((FilterOutputStream) this).out.flush();
        }
    }

    static {
        C08RS.LIZ();
        dstSize = (int) recommendedCOutSize();
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream) {
        this(outputStream, C2252881DFu.LIZ);
    }

    private void close(boolean z) {
        int iEndStream;
        if (this.isClosed) {
            return;
        }
        try {
            if (!this.frameClosed) {
                do {
                    iEndStream = endStream(this.stream, this.dst, dstSize);
                    long j = iEndStream;
                    if (!Zstd.isError(j)) {
                        ((FilterOutputStream) this).out.write(this.dst, 0, (int) this.dstPos);
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Compression error: ");
                        sbLIZ.append(Zstd.getErrorName(j));
                        throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } while (iEndStream > 0);
            }
            if (z) {
                ((FilterOutputStream) this).out.close();
            }
            this.isClosed = true;
            this.bufferPool.getClass();
            freeCStream(this.stream);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.isClosed = true;
            this.bufferPool.getClass();
            freeCStream(this.stream);
            throw th;
        }
    }

    public synchronized ZstdOutputStreamNoFinalizer setChecksum(boolean z) {
        if (this.frameClosed) {
            long compressionChecksums = ZstdCompress.setCompressionChecksums(this.stream, z);
            if (Zstd.isError(compressionChecksums)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Compression param: ");
                sbLIZ.append(Zstd.getErrorName(compressionChecksums));
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            throw new IOException("Change of parameter on initialized stream");
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setCloseFrameOnFlush(boolean z) {
        if (this.frameClosed) {
            this.closeFrameOnFlush = z;
        } else {
            throw new IOException("Change of parameter on initialized stream");
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setDict(byte[] bArr) {
        if (this.frameClosed) {
            long jLoadDictCompress = ZstdCompress.loadDictCompress(this.stream, bArr, bArr.length);
            if (Zstd.isError(jLoadDictCompress)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Compression param: ");
                sbLIZ.append(Zstd.getErrorName(jLoadDictCompress));
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            throw new IOException("Change of parameter on initialized stream");
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setLevel(int i) {
        if (this.frameClosed) {
            long compressionLevel = ZstdCompress.setCompressionLevel(this.stream, i);
            if (Zstd.isError(compressionLevel)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Compression param: ");
                sbLIZ.append(Zstd.getErrorName(compressionLevel));
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            throw new IOException("Change of parameter on initialized stream");
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setLong(int i) {
        if (this.frameClosed) {
            long compressionLong = ZstdCompress.setCompressionLong(this.stream, i);
            if (Zstd.isError(compressionLong)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Compression param: ");
                sbLIZ.append(Zstd.getErrorName(compressionLong));
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            throw new IOException("Change of parameter on initialized stream");
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setWorkers(int i) {
        if (this.frameClosed) {
            long compressionWorkers = ZstdCompress.setCompressionWorkers(this.stream, i);
            if (Zstd.isError(compressionWorkers)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Compression param: ");
                sbLIZ.append(Zstd.getErrorName(compressionWorkers));
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            throw new IOException("Change of parameter on initialized stream");
        }
        return this;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    public synchronized ZstdOutputStreamNoFinalizer setDict(ZstdDictCompress zstdDictCompress) {
        if (this.frameClosed) {
            long jLoadFastDictCompress = ZstdCompress.loadFastDictCompress(this.stream, zstdDictCompress);
            if (Zstd.isError(jLoadFastDictCompress)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Compression param: ");
                sbLIZ.append(Zstd.getErrorName(jLoadFastDictCompress));
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            throw new IOException("Change of parameter on initialized stream");
        }
        return this;
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream, InterfaceC2252891DFv interfaceC2252891DFv) throws IOException {
        super(outputStream);
        this.frameClosed = true;
        this.stream = createCStream();
        this.bufferPool = interfaceC2252891DFv;
        int i = dstSize;
        interfaceC2252891DFv.getClass();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        this.dstByteBuffer = byteBufferAllocate;
        if (byteBufferAllocate != null) {
            this.dst = Zstd.extractArray(byteBufferAllocate);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot get ByteBuffer of size ");
        sbLIZ.append(i);
        sbLIZ.append(" from the BufferPool");
        throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream, int i) {
        this(outputStream, C2252881DFu.LIZ);
        ZstdCompress.setCompressionLevel(this.stream, i);
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream, InterfaceC2252891DFv interfaceC2252891DFv, int i) {
        this(outputStream, interfaceC2252891DFv);
        ZstdCompress.setCompressionLevel(this.stream, i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        if (!this.isClosed) {
            if (this.frameClosed) {
                long jResetCStream = resetCStream(this.stream);
                if (!Zstd.isError(jResetCStream)) {
                    this.frameClosed = false;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Compression error: cannot create header: ");
                    sbLIZ.append(Zstd.getErrorName(jResetCStream));
                    throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            int i3 = i2 + i;
            this.srcPos = i;
            while (this.srcPos < i3) {
                long jCompressStream = compressStream(this.stream, this.dst, dstSize, bArr, i3);
                if (!Zstd.isError(jCompressStream)) {
                    long j = this.dstPos;
                    if (j > 0) {
                        ((FilterOutputStream) this).out.write(this.dst, 0, (int) j);
                    }
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Compression error: ");
                    sbLIZ2.append(Zstd.getErrorName(jCompressStream));
                    throw new IOException(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        } else {
            throw new IOException("Stream closed");
        }
    }
}
