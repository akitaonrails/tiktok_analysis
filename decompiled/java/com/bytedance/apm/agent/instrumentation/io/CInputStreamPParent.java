package com.bytedance.apm.agent.instrumentation.io;

import com.bytedance.apm.agent.logging.AgentLog;
import com.bytedance.apm.agent.logging.AgentLogManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes14.dex */
public abstract class CInputStreamPParent extends InputStream implements StreamCompleteListenerSource {
    public static final AgentLog sLog = AgentLogManager.getAgentLog();
    public final ByteBuffer buf;
    public long c;
    public boolean cac;
    public final StreamCompleteListenerManager callback;
    public final InputStream impl;

    private boolean isBufferEmpty() {
        return !this.buf.hasRemaining();
    }

    private void notifyComplete() {
        if (this.callback.isComplete()) {
            return;
        }
        this.callback.notifyStreamComplete(new StreamCompleteEvent(this, this.c));
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        try {
            return (this.cac ? this.buf.remaining() : 0) + this.impl.available();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            notifyError(e);
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            InputStream inputStream = this.impl;
            if (inputStream != null) {
                inputStream.close();
            }
            notifyComplete();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            notifyError(e);
            throw e;
        }
    }

    public void fillBuffer() {
        int i;
        ByteBuffer byteBuffer = this.buf;
        if (byteBuffer == null || !byteBuffer.hasArray()) {
            return;
        }
        synchronized (this.buf) {
            try {
                try {
                    i = this.impl.read(this.buf.array(), 0, this.buf.capacity());
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    sLog.error(e.toString());
                }
                if (i <= 0) {
                    this.buf.limit(0);
                } else if (i < this.buf.capacity()) {
                    this.buf.limit(i);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public String getBufferAsString() {
        String str;
        ByteBuffer byteBuffer = this.buf;
        if (byteBuffer == null) {
            return "";
        }
        synchronized (byteBuffer) {
            try {
                byte[] bArr = new byte[this.buf.limit()];
                for (int i = 0; i < this.buf.limit(); i++) {
                    bArr[i] = this.buf.get(i);
                }
                str = new String(bArr);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return str;
    }

    private int readBuffer() {
        if (isBufferEmpty()) {
            return -1;
        }
        return this.buf.get();
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        if (markSupported()) {
            try {
                this.impl.reset();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                notifyError(e);
                throw e;
            }
        }
    }

    public CInputStreamPParent(InputStream inputStream) {
        this(inputStream, false);
    }

    private boolean isBufferLargerThan(long j) {
        if (this.buf.remaining() >= j) {
            return true;
        }
        return false;
    }

    private void notifyError(Exception exc) {
        if (!this.callback.isComplete()) {
            this.callback.notifyStreamError(new StreamCompleteEvent(this, this.c, exc));
        }
    }

    private int readBuffer(byte[] bArr) {
        return readBuffer(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        if (!markSupported()) {
            return;
        }
        this.impl.mark(i);
    }

    @Override // com.bytedance.apm.agent.instrumentation.io.StreamCompleteListenerSource
    public void removeStreamCompleteListener(StreamCompleteListener streamCompleteListener) {
        this.callback.removeStreamCompleteListener(streamCompleteListener);
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        if (this.cac) {
            synchronized (this.buf) {
                try {
                    if (isBufferLargerThan(j)) {
                        this.buf.position((int) j);
                        this.c += j;
                        return j;
                    }
                    j -= (long) this.buf.remaining();
                    if (j > 0) {
                        ByteBuffer byteBuffer = this.buf;
                        byteBuffer.position(byteBuffer.remaining());
                    } else {
                        throw new IOException("Failed to partial read from buffer (skip)");
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        try {
            long jSkip = this.impl.skip(j);
            this.c += jSkip;
            return jSkip;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            notifyError(e);
            throw e;
        }
    }

    public CInputStreamPParent(InputStream inputStream, boolean z) {
        ByteBuffer byteBufferAllocate;
        this.callback = new StreamCompleteListenerManager();
        this.impl = inputStream;
        this.cac = z;
        if (!z) {
            byteBufferAllocate = null;
        } else {
            byteBufferAllocate = ByteBuffer.allocate(SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
        }
        this.buf = byteBufferAllocate;
        fillBuffer();
    }

    private int readBuffer(byte[] bArr, int i, int i2) {
        if (isBufferEmpty()) {
            return -1;
        }
        int iRemaining = this.buf.remaining();
        this.buf.get(bArr, i, i2);
        return iRemaining - this.buf.remaining();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int buffer;
        int i3 = 0;
        if (this.cac) {
            synchronized (this.buf) {
                try {
                    if (isBufferLargerThan(i2)) {
                        int buffer2 = readBuffer(bArr, i, i2);
                        if (buffer2 >= 0) {
                            this.c += (long) buffer2;
                            return buffer2;
                        }
                        throw new IOException("Failed to readBuffer()");
                    }
                    int iRemaining = this.buf.remaining();
                    if (iRemaining > 0) {
                        buffer = readBuffer(bArr, i, iRemaining);
                        if (buffer >= 0) {
                            i2 -= buffer;
                            this.c += (long) buffer;
                        } else {
                            throw new IOException("Failed to partial read from buffer");
                        }
                    } else {
                        buffer = 0;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            buffer = 0;
        }
        try {
            InputStream inputStream = this.impl;
            if (inputStream != null && (i3 = inputStream.read(bArr, i + buffer, i2)) < 0) {
                if (buffer <= 0) {
                    notifyComplete();
                    return i3;
                }
                return buffer;
            }
            this.c += (long) i3;
            return i3 + buffer;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            notifyError(e);
            throw e;
        }
    }
}
