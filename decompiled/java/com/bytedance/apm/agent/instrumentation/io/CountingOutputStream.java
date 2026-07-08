package com.bytedance.apm.agent.instrumentation.io;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes14.dex */
public final class CountingOutputStream extends OutputStream implements StreamCompleteListenerSource {
    public long mCount;
    public final StreamCompleteListenerManager mListenerManager = new StreamCompleteListenerManager();
    public final OutputStream mRealImpl;

    private void notifyComplete() {
        if (this.mListenerManager.isComplete()) {
            return;
        }
        this.mListenerManager.notifyStreamComplete(new StreamCompleteEvent(this, this.mCount));
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            OutputStream outputStream = this.mRealImpl;
            if (outputStream != null) {
                outputStream.close();
            }
            notifyComplete();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            notifyError(e);
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            OutputStream outputStream = this.mRealImpl;
            if (outputStream != null) {
                outputStream.flush();
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            notifyError(e);
            throw e;
        }
    }

    public long getCount() {
        return this.mCount;
    }

    public CountingOutputStream(OutputStream outputStream) {
        this.mRealImpl = outputStream;
    }

    private void notifyError(Exception exc) {
        if (!this.mListenerManager.isComplete()) {
            this.mListenerManager.notifyStreamError(new StreamCompleteEvent(this, this.mCount, exc));
        }
    }

    @Override // com.bytedance.apm.agent.instrumentation.io.StreamCompleteListenerSource
    public void addStreamCompleteListener(StreamCompleteListener streamCompleteListener) {
        this.mListenerManager.addStreamCompleteListener(streamCompleteListener);
    }

    @Override // com.bytedance.apm.agent.instrumentation.io.StreamCompleteListenerSource
    public void removeStreamCompleteListener(StreamCompleteListener streamCompleteListener) {
        this.mListenerManager.removeStreamCompleteListener(streamCompleteListener);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        try {
            OutputStream outputStream = this.mRealImpl;
            if (outputStream != null) {
                this.mCount++;
                outputStream.write(i);
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            notifyError(e);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            OutputStream outputStream = this.mRealImpl;
            if (outputStream != null) {
                outputStream.write(bArr);
                this.mCount += (long) bArr.length;
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            notifyError(e);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            OutputStream outputStream = this.mRealImpl;
            if (outputStream != null) {
                outputStream.write(bArr, i, i2);
                this.mCount += (long) i2;
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            notifyError(e);
            throw e;
        }
    }
}
