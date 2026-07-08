package com.bytedance.apm.agent.instrumentation.io;

import X.C2188811AlT;
import X.C792400V6o;
import X.C792910V8n;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes14.dex */
public abstract class CInputStreamParent extends CInputStreamPParent {
    private boolean isEmpty() {
        return !this.buf.hasRemaining();
    }

    public void callComplete() {
        if (this.callback.isComplete()) {
            return;
        }
        this.callback.notifyStreamComplete(new StreamCompleteEvent(this, this.c));
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.impl.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.cac) {
            synchronized (this.buf) {
                try {
                    if (bufLT(1L)) {
                        int iRb = rb();
                        if (iRb >= 0) {
                            this.c++;
                        }
                        return iRb;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        try {
            int i = this.impl.read();
            if (i >= 0) {
                this.c++;
                return i;
            }
            callComplete();
            return i;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            callError(e);
            throw e;
        }
    }

    public int rb() {
        if (isEmpty()) {
            return -1;
        }
        return this.buf.get();
    }

    public CInputStreamParent(InputStream inputStream) {
        this(inputStream, false);
    }

    private int rb(byte[] bArr) {
        return rb(bArr, 0, bArr.length);
    }

    @Override // com.bytedance.apm.agent.instrumentation.io.StreamCompleteListenerSource
    public void addStreamCompleteListener(StreamCompleteListener streamCompleteListener) {
        this.callback.addStreamCompleteListener(streamCompleteListener);
    }

    public boolean bufLT(long j) {
        if (this.buf.remaining() >= j) {
            return true;
        }
        return false;
    }

    public void callError(Exception exc) {
        if (!this.callback.isComplete()) {
            this.callback.notifyStreamError(new StreamCompleteEvent(this, this.c, exc));
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int length = bArr.length;
        int iRb = 0;
        if (this.cac) {
            synchronized (this.buf) {
                try {
                    if (bufLT(length)) {
                        int iRb2 = rb(bArr);
                        if (iRb2 >= 0) {
                            this.c += (long) iRb2;
                            return iRb2;
                        }
                        throw new IOException("CountingInputStream wrong");
                    }
                    int iRemaining = this.buf.remaining();
                    if (iRemaining > 0) {
                        iRb = rb(bArr, 0, iRemaining);
                        if (iRb >= 0) {
                            length -= iRb;
                            this.c += (long) iRb;
                        } else {
                            throw new IOException("CountingInputStream wrong2");
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        try {
            int i = this.impl.read(bArr, iRb, length);
            if (i >= 0) {
                this.c += (long) i;
                return i + iRb;
            }
            if (iRb <= 0) {
                callComplete();
                return i;
            }
            return iRb;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            CInputStreamPParent.sLog.error(e.toString());
            if (C792400V6o.LJIIIIZZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("notify system err: ");
                sbLIZ.append(e);
                C792910V8n.LIZLLL("APM-Counting", C2188811AlT.LIZIZ(sbLIZ));
            }
            callError(e);
            throw e;
        }
    }

    public void setBufferingEnabled(boolean z) {
        this.cac = z;
    }

    public CInputStreamParent(InputStream inputStream, boolean z) {
        super(inputStream, z);
    }

    private int rb(byte[] bArr, int i, int i2) {
        if (isEmpty()) {
            return -1;
        }
        int iRemaining = this.buf.remaining();
        this.buf.get(bArr, i, i2);
        return iRemaining - this.buf.remaining();
    }
}
