package com.ttnet.org.chromium.net.impl;

import X.InterfaceC1498510p69;
import Y.ARunnableS6S1110000_23;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ttnet.org.chromium.net.f0;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class TTCronetMpaService extends f0 {
    public static final /* synthetic */ int LJFF = 0;
    public final CronetUrlRequestContext LIZ;
    public long LIZIZ;
    public final Object LIZJ = new Object();
    public InterfaceC1498510p69 LIZLLL;
    public InterfaceC1498510p69 LJ;

    private native void nativeCommand(long j, String str, String str2);

    private native long nativeCreateMpaServiceAdapter(long j);

    private native void nativeInit(long j);

    private native void nativeSetAccAddress(long j, String[] strArr);

    private native void nativeStart(long j);

    private native void nativeStop(long j);

    @Override // com.ttnet.org.chromium.net.f0
    public final void LIZLLL() {
        synchronized (this.LIZJ) {
            try {
                long j = this.LIZIZ;
                if (j == 0) {
                    return;
                }
                nativeStart(j);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.f0
    public final void LJ() {
        synchronized (this.LIZJ) {
            try {
                long j = this.LIZIZ;
                if (j == 0) {
                    return;
                }
                nativeStop(j);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public TTCronetMpaService(CronetUrlRequestContext cronetUrlRequestContext) {
        this.LIZ = cronetUrlRequestContext;
    }

    @Override // com.ttnet.org.chromium.net.f0
    public final void LIZIZ(InterfaceC1498510p69 interfaceC1498510p69) {
        synchronized (this.LIZJ) {
            try {
                if (this.LIZIZ == 0) {
                    this.LIZIZ = nativeCreateMpaServiceAdapter(this.LIZ.LJJL());
                }
                this.LIZLLL = interfaceC1498510p69;
                nativeInit(this.LIZIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private void onInitFinish(boolean z, String str) {
        BPEAThread bPEAThread = new BPEAThread(new ARunnableS6S1110000_23(this, z, str, 0));
        ThreadMethodProxy.setName(bPEAThread, "TTCronetMpaService_Thread");
        bPEAThread.start();
    }

    private void onSetAccAddressFinish(boolean z, String str) {
        BPEAThread bPEAThread = new BPEAThread(new ARunnableS6S1110000_23(this, z, str, 1));
        ThreadMethodProxy.setName(bPEAThread, "TTCronetMpaService_Thread");
        bPEAThread.start();
    }

    @Override // com.ttnet.org.chromium.net.f0
    public final void LIZ(String str, String str2) {
        synchronized (this.LIZJ) {
            try {
                long j = this.LIZIZ;
                if (j == 0) {
                    return;
                }
                nativeCommand(j, str, str2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.f0
    public final void LIZJ(List<String> list, InterfaceC1498510p69 interfaceC1498510p69) {
        synchronized (this.LIZJ) {
            try {
                long j = this.LIZIZ;
                if (j == 0) {
                    return;
                }
                this.LJ = interfaceC1498510p69;
                nativeSetAccAddress(j, (String[]) list.toArray(new String[list.size()]));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
