package com.ss.mediakit.image;

import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes14.dex */
public class MIONativeInputStream extends InputStream {
    public final AtomicBoolean mClosed = new AtomicBoolean(false);
    public final long mLength;
    public final AVMDLDataLoader mLoader;
    public long mPosition;
    public final String mTaskId;

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) <= 0) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public int available() {
        if (this.mClosed.get()) {
            return 0;
        }
        long j = this.mLength - this.mPosition;
        if (j <= 0) {
            return 0;
        }
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.mClosed.compareAndSet(false, true)) {
            AVMDLDataLoader aVMDLDataLoader = this.mLoader;
            if (aVMDLDataLoader != null) {
                aVMDLDataLoader.closeImageStream(this.mTaskId);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("native stream closed, task: ");
            sbLIZ.append(this.mTaskId);
            AVMDLLog.d("MIO_IMG", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    private void closeQuietly() {
        try {
            close();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public MIONativeInputStream(AVMDLDataLoader aVMDLDataLoader, String str, long j) {
        this.mLoader = aVMDLDataLoader;
        this.mTaskId = str;
        this.mLength = j;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.mClosed.get()) {
            if (bArr != null) {
                if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
                    if (i2 == 0) {
                        return 0;
                    }
                    long j = this.mLength;
                    if (j > 0) {
                        long j2 = this.mPosition;
                        if (j2 >= j) {
                            AVMDLLog.d("MIO_IMG", C786410Ut5.k4(Locale.US, "native stream read EOF, task: %s, position: %d, length: %d", new Object[]{this.mTaskId, Long.valueOf(j2), Long.valueOf(this.mLength)}));
                            return -1;
                        }
                    }
                    AVMDLDataLoader aVMDLDataLoader = this.mLoader;
                    if (aVMDLDataLoader != null) {
                        long imageStream = aVMDLDataLoader.readImageStream(this.mTaskId, bArr, i, this.mPosition, i2);
                        Locale locale = Locale.US;
                        AVMDLLog.d("MIO_IMG", C786410Ut5.k4(locale, "native stream read, task: %s, position: %d, want: %d, ret: %d, length: %d", new Object[]{this.mTaskId, Long.valueOf(this.mPosition), Integer.valueOf(i2), Long.valueOf(imageStream), Long.valueOf(this.mLength)}));
                        if (imageStream > 0) {
                            this.mPosition += imageStream;
                            return (int) imageStream;
                        }
                        if (imageStream == 0) {
                            return -1;
                        }
                        AVMDLLog.d("MIO_IMG", C786410Ut5.k4(locale, "native stream read error, task: %s, position: %d, code: %d", new Object[]{this.mTaskId, Long.valueOf(this.mPosition), Long.valueOf(imageStream)}));
                        closeQuietly();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("readImageStream failed, task: ");
                        sbLIZ.append(this.mTaskId);
                        sbLIZ.append(", code: ");
                        sbLIZ.append(imageStream);
                        throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("loader is null, task: ");
                    sbLIZ2.append(this.mTaskId);
                    throw new IOException(C2188811AlT.LIZIZ(sbLIZ2));
                }
                throw new IndexOutOfBoundsException();
            }
            throw new NullPointerException("buffer is null");
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("MIONativeInputStream already closed, task: ");
        sbLIZ3.append(this.mTaskId);
        throw new IOException(C2188811AlT.LIZIZ(sbLIZ3));
    }
}
