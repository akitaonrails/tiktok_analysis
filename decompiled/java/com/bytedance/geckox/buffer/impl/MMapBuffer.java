package com.bytedance.geckox.buffer.impl;

import X.C0VSJ;
import X.C2222008nC;
import X.C2222108nD;
import X.InterfaceC1550870qSb;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class MMapBuffer implements InterfaceC1550870qSb {
    public final long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public File LJ;
    public final String LJFF;

    private native long nCreate(String str, long j);

    private native int nFlush(long j, long j2);

    private native void nRead(long j, long j2, byte[] bArr, int i, int i2);

    private native int nRelease(long j, long j2);

    private native void nWrite(long j, long j2, byte[] bArr, int i, int i2);

    @Override // X.InterfaceC1550870qSb
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) <= 0) {
            return -1;
        }
        return bArr[0];
    }

    static {
        C2222108nD.LIZ("buffer");
    }

    @Override // X.InterfaceC1550870qSb
    public final boolean LIZ() {
        if (this.LJFF == null) {
            return false;
        }
        C0VSJ c0vsj = new C0VSJ(this.LJFF);
        boolean zRenameTo = this.LJ.renameTo(c0vsj);
        if (zRenameTo) {
            this.LJ = c0vsj;
        }
        return zRenameTo;
    }

    @Override // X.InterfaceC1550870qSb
    public final void LIZJ() throws IOException {
        if (this.LIZLLL.get()) {
            throw new IOException("released!");
        }
        nFlush(this.LIZIZ, this.LIZ);
    }

    @Override // X.InterfaceC1550870qSb
    public final long position() throws IOException {
        if (this.LIZLLL.get()) {
            throw new IOException("released!");
        }
        return this.LIZJ;
    }

    @Override // X.InterfaceC1550870qSb
    public final void release() {
        if (this.LIZLLL.getAndSet(true)) {
            return;
        }
        nRelease(this.LIZIZ, this.LIZ);
        this.LIZIZ = 0L;
    }

    public final void finalize() throws Throwable {
        super.finalize();
        try {
            release();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2222008nC.LIZ(e);
        }
    }

    @Override // X.InterfaceC1550870qSb
    public final File LIZIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1550870qSb
    public final long length() {
        return this.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014 A[PHI: r1
      0x0014: PHI (r1v2 long) = (r1v1 long), (r1v3 long) binds: [B:5:0x000c, B:7:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1550870qSb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void position(long r4) throws java.io.IOException {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.LIZLLL
            boolean r0 = r0.get()
            if (r0 != 0) goto L18
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L14
            long r1 = r3.LIZ
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L15
        L14:
            r4 = r1
        L15:
            r3.LIZJ = r4
            return
        L18:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = "released!"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.buffer.impl.MMapBuffer.position(long):void");
    }

    @Override // X.InterfaceC1550870qSb
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // X.InterfaceC1550870qSb
    public final synchronized long skip(long j) {
        if (!this.LIZLLL.get()) {
            if (j <= 0) {
                return 0L;
            }
            long j2 = this.LIZJ;
            long j3 = j + j2;
            this.LIZJ = j3;
            if (j3 >= 0) {
                long j4 = this.LIZ;
                if (j3 > j4) {
                    this.LIZJ = j4;
                }
            } else {
                this.LIZJ = 0L;
            }
            return this.LIZJ - j2;
        }
        throw new IOException("released!");
    }

    @Override // X.InterfaceC1550870qSb
    public final void write(int i) throws IOException {
        LJJIII(0, new byte[]{(byte) i}, 1);
    }

    @Override // X.InterfaceC1550870qSb
    public final void write(byte[] bArr) throws IOException {
        LJJIII(0, bArr, bArr.length);
    }

    public MMapBuffer(File file, String str, long j) {
        this.LIZ = j;
        this.LJ = file;
        this.LJFF = str;
        file.getParentFile().mkdirs();
        this.LIZIZ = nCreate(file.getAbsolutePath(), j);
    }

    @Override // X.InterfaceC1550870qSb
    public final int LJJIII(int i, byte[] bArr, int i2) throws IOException {
        int length = i2;
        if (!this.LIZLLL.get()) {
            if (bArr == null || bArr.length == 0 || length < 1 || i < 0 || i >= bArr.length) {
                return 0;
            }
            if (i + length > bArr.length) {
                length = bArr.length - i;
            }
            synchronized (this) {
                try {
                    long j = this.LIZJ;
                    long j2 = this.LIZ;
                    if (j == j2) {
                        return 0;
                    }
                    if (((long) length) + j > j2) {
                        length = (int) (j2 - j);
                    }
                    nWrite(this.LIZIZ, j, bArr, i, length);
                    this.LIZJ += (long) length;
                    return length;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        throw new IOException("released!");
    }

    @Override // X.InterfaceC1550870qSb
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int length = i2;
        if (!this.LIZLLL.get()) {
            if (bArr != null && length >= 1 && i >= 0 && i < bArr.length) {
                if (i + length > bArr.length) {
                    length = bArr.length - i;
                }
                synchronized (this) {
                    try {
                        long j = this.LIZJ;
                        long j2 = this.LIZ;
                        if (j == j2) {
                            return -1;
                        }
                        if (((long) length) + j > j2) {
                            length = (int) (j2 - j);
                        }
                        nRead(this.LIZIZ, j, bArr, i, length);
                        this.LIZJ += (long) length;
                        return length;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            return 0;
        }
        throw new IOException("released!");
    }
}
