package com.bytedance.geckox.buffer.impl;

import X.C2222008nC;
import X.C2222108nD;
import X.InterfaceC1550870qSb;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class MemoryBuffer implements InterfaceC1550870qSb {
    private native long nCreate(String str, long j);

    private native void nFlush(long j, String str, long j2);

    private native void nRead(long j, long j2, byte[] bArr, int i, int i2);

    private native void nRelease(long j, long j2);

    private native void nWrite(long j, long j2, byte[] bArr, int i, int i2);

    @Override // X.InterfaceC1550870qSb
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1550870qSb
    public final File LIZIZ() {
        return null;
    }

    @Override // X.InterfaceC1550870qSb
    public final long length() {
        return 0L;
    }

    static {
        C2222108nD.LIZ("buffer");
    }

    public final void finalize() throws Throwable {
        super.finalize();
        try {
            throw null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2222008nC.LIZ(e);
        }
    }

    @Override // X.InterfaceC1550870qSb
    public final void LIZJ() {
        throw null;
    }

    @Override // X.InterfaceC1550870qSb
    public final long position() {
        throw null;
    }

    @Override // X.InterfaceC1550870qSb
    public final int read() {
        throw null;
    }

    @Override // X.InterfaceC1550870qSb
    public final void release() {
        throw null;
    }

    @Override // X.InterfaceC1550870qSb
    public final void position(long j) {
        throw null;
    }

    @Override // X.InterfaceC1550870qSb
    public final int read(byte[] bArr) {
        throw null;
    }

    @Override // X.InterfaceC1550870qSb
    public final synchronized long skip(long j) {
        throw null;
    }

    @Override // X.InterfaceC1550870qSb
    public final void write(int i) {
        throw null;
    }

    @Override // X.InterfaceC1550870qSb
    public final void write(byte[] bArr) {
        throw null;
    }

    @Override // X.InterfaceC1550870qSb
    public final int LJJIII(int i, byte[] bArr, int i2) {
        throw null;
    }

    @Override // X.InterfaceC1550870qSb
    public final int read(byte[] bArr, int i, int i2) {
        throw null;
    }
}
