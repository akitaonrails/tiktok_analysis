package com.ss.android.ugc.effectmanager.disklrucache;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes31.dex */
public class StrictLineReader implements Closeable {
    public byte[] buf;
    public final Charset charset;
    public int end;
    public final InputStream in;
    public int pos;

    private void fillBuf() throws IOException {
        InputStream inputStream = this.in;
        byte[] bArr = this.buf;
        int i = inputStream.read(bArr, 0, bArr.length);
        if (i == -1) {
            throw new EOFException();
        }
        this.pos = 0;
        this.end = i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.in) {
            try {
                if (this.buf != null) {
                    this.buf = null;
                    this.in.close();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public boolean hasUnterminatedLine() {
        return this.end == -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String readLine() {
        /*
            r8 = this;
            java.io.InputStream r4 = r8.in
            monitor-enter(r4)
            byte[] r0 = r8.buf     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L81
            int r1 = r8.pos     // Catch: java.lang.Throwable -> L89
            int r0 = r8.end     // Catch: java.lang.Throwable -> L89
            if (r1 < r0) goto L10
            r8.fillBuf()     // Catch: java.lang.Throwable -> L89
        L10:
            int r7 = r8.pos     // Catch: java.lang.Throwable -> L89
        L12:
            int r0 = r8.end     // Catch: java.lang.Throwable -> L89
            r6 = 10
            if (r7 == r0) goto L42
            byte[] r5 = r8.buf     // Catch: java.lang.Throwable -> L89
            r0 = r5[r7]     // Catch: java.lang.Throwable -> L89
            if (r0 != r6) goto L3e
            int r3 = r8.pos     // Catch: java.lang.Throwable -> L89
            if (r7 == r3) goto L3c
            int r2 = r7 + (-1)
            r1 = r5[r2]     // Catch: java.lang.Throwable -> L89
            r0 = 13
            if (r1 != r0) goto L3c
        L2a:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L89
            int r2 = r2 - r3
            java.nio.charset.Charset r0 = r8.charset     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = r0.name()     // Catch: java.lang.Throwable -> L89
            r1.<init>(r5, r3, r2, r0)     // Catch: java.lang.Throwable -> L89
            int r0 = r7 + 1
            r8.pos = r0     // Catch: java.lang.Throwable -> L89
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L89
            goto L41
        L3c:
            r2 = r7
            goto L2a
        L3e:
            int r7 = r7 + 1
            goto L12
        L41:
            return r1
        L42:
            com.ss.android.ugc.effectmanager.disklrucache.StrictLineReader$1 r5 = new com.ss.android.ugc.effectmanager.disklrucache.StrictLineReader$1     // Catch: java.lang.Throwable -> L89
            int r1 = r8.end     // Catch: java.lang.Throwable -> L89
            int r0 = r8.pos     // Catch: java.lang.Throwable -> L89
            int r1 = r1 - r0
            int r0 = r1 + 80
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L89
        L4e:
            byte[] r2 = r8.buf     // Catch: java.lang.Throwable -> L89
            int r1 = r8.pos     // Catch: java.lang.Throwable -> L89
            int r0 = r8.end     // Catch: java.lang.Throwable -> L89
            int r0 = r0 - r1
            r5.write(r2, r1, r0)     // Catch: java.lang.Throwable -> L89
            r0 = -1
            r8.end = r0     // Catch: java.lang.Throwable -> L89
            r8.fillBuf()     // Catch: java.lang.Throwable -> L89
            int r3 = r8.pos     // Catch: java.lang.Throwable -> L89
        L60:
            int r0 = r8.end     // Catch: java.lang.Throwable -> L89
            if (r3 == r0) goto L4e
            byte[] r2 = r8.buf     // Catch: java.lang.Throwable -> L89
            r0 = r2[r3]     // Catch: java.lang.Throwable -> L89
            if (r0 != r6) goto L7d
            int r1 = r8.pos     // Catch: java.lang.Throwable -> L89
            if (r3 == r1) goto L73
            int r0 = r3 - r1
            r5.write(r2, r1, r0)     // Catch: java.lang.Throwable -> L89
        L73:
            int r0 = r3 + 1
            r8.pos = r0     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L89
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L89
            goto L80
        L7d:
            int r3 = r3 + 1
            goto L60
        L80:
            return r0
        L81:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = "LineReader is closed"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L89
            throw r1     // Catch: java.lang.Throwable -> L89
        L89:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L89
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L89
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.disklrucache.StrictLineReader.readLine():java.lang.String");
    }

    public StrictLineReader(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public StrictLineReader(InputStream inputStream, int i, Charset charset) {
        if (inputStream != null && charset != null) {
            if (i >= 0) {
                if (charset.equals(Util.US_ASCII)) {
                    this.in = inputStream;
                    this.charset = charset;
                    this.buf = new byte[i];
                    return;
                }
                throw new IllegalArgumentException("Unsupported encoding");
            }
            throw new IllegalArgumentException("capacity <= 0");
        }
        throw null;
    }
}
