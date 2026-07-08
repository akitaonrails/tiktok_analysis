package com.bytedance.compression.zstd;

import X.C08RS;
import X.C2188811AlT;
import X.C2252881DFu;
import X.InterfaceC2252891DFv;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes36.dex */
public class ZstdInputStreamNoFinalizer extends FilterInputStream {
    public static final int srcBuffSize;
    public final InterfaceC2252891DFv bufferPool;
    public long dstPos;
    public boolean frameFinished;
    public boolean isClosed;
    public boolean isContinuous;
    public boolean needRead;
    public final byte[] src;
    public final ByteBuffer srcByteBuffer;
    public long srcPos;
    public long srcSize;
    public final long stream;

    public static native long createDStream();

    private native int decompressStream(long j, byte[] bArr, int i, byte[] bArr2, int i2);

    public static native int freeDStream(long j);

    private native int initDStream(long j);

    public static native long recommendedDInSize();

    public static native long recommendedDOutSize();

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        if (this.isClosed) {
            throw new IOException("Stream closed");
        }
        if (!this.needRead) {
            return 1;
        }
        return ((FilterInputStream) this).in.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        this.bufferPool.getClass();
        freeDStream(this.stream);
        ((FilterInputStream) this).in.close();
    }

    public synchronized boolean getContinuous() {
        return this.isContinuous;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int internal;
        byte[] bArr = new byte[1];
        do {
            internal = readInternal(bArr, 0, 1);
        } while (internal == 0);
        if (internal != 1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    static {
        C08RS.LIZ();
        srcBuffSize = (int) recommendedDInSize();
    }

    public ZstdInputStreamNoFinalizer(InputStream inputStream) {
        this(inputStream, C2252881DFu.LIZ);
    }

    public synchronized ZstdInputStreamNoFinalizer setContinuous(boolean z) {
        this.isContinuous = z;
        return this;
    }

    public synchronized ZstdInputStreamNoFinalizer setDict(ZstdDictDecompress zstdDictDecompress) {
        zstdDictDecompress.acquireSharedLock();
        try {
            long jLoadFastDictDecompress = ZstdDecompress.loadFastDictDecompress(this.stream, zstdDictDecompress);
            if (!Zstd.isError(jLoadFastDictDecompress)) {
                zstdDictDecompress.releaseSharedLock();
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Decompression error: ");
                sbLIZ.append(Zstd.getErrorName(jLoadFastDictDecompress));
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            zstdDictDecompress.releaseSharedLock();
            throw th;
        }
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) {
        if (!this.isClosed) {
            if (j <= 0) {
                return 0L;
            }
            int iRecommendedDOutSize = (int) recommendedDOutSize();
            if (iRecommendedDOutSize > j) {
                iRecommendedDOutSize = (int) j;
            }
            ((C2252881DFu) this.bufferPool).getClass();
            try {
                byte[] bArrExtractArray = Zstd.extractArray(ByteBuffer.allocate(iRecommendedDOutSize));
                long j2 = j;
                while (j2 > 0) {
                    int i = read(bArrExtractArray, 0, (int) Math.min(iRecommendedDOutSize, j2));
                    if (i < 0) {
                        break;
                    }
                    j2 -= (long) i;
                }
                this.bufferPool.getClass();
                return j - j2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.bufferPool.getClass();
                throw th;
            }
        }
        throw new IOException("Stream closed");
    }

    public synchronized ZstdInputStreamNoFinalizer setDict(byte[] bArr) {
        long jLoadDictDecompress = ZstdDecompress.loadDictDecompress(this.stream, bArr, bArr.length);
        if (Zstd.isError(jLoadDictDecompress)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Decompression error: ");
            sbLIZ.append(Zstd.getErrorName(jLoadDictDecompress));
            throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return this;
    }

    public ZstdInputStreamNoFinalizer(InputStream inputStream, InterfaceC2252891DFv interfaceC2252891DFv) throws IOException {
        super(inputStream);
        this.needRead = true;
        this.frameFinished = true;
        this.bufferPool = interfaceC2252891DFv;
        int i = srcBuffSize;
        interfaceC2252891DFv.getClass();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        this.srcByteBuffer = byteBufferAllocate;
        if (byteBufferAllocate != null) {
            this.src = Zstd.extractArray(byteBufferAllocate);
            synchronized (this) {
                try {
                    long jCreateDStream = createDStream();
                    this.stream = jCreateDStream;
                    initDStream(jCreateDStream);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot get ByteBuffer of size ");
        sbLIZ.append(i);
        sbLIZ.append(" from the BufferPool");
        throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) {
        int internal;
        if (i >= 0) {
            if (i2 <= bArr.length - i) {
                if (i2 == 0) {
                    return 0;
                }
                do {
                    internal = readInternal(bArr, i, i2);
                } while (internal == 0);
                return internal;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Requested length ");
        sbLIZ.append(i2);
        sbLIZ.append(" from offset ");
        sbLIZ.append(i);
        sbLIZ.append(" in buffer of size ");
        sbLIZ.append(bArr.length);
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c3, code lost:
    
        return (int) (r4 - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int readInternal(byte[] r19, int r20, int r21) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.compression.zstd.ZstdInputStreamNoFinalizer.readInternal(byte[], int, int):int");
    }
}
