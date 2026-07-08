package com.ttnet.org.chromium.net.impl;

import X.C08VH;
import X.InterfaceC1498130p5X;
import Y.ARunnableS6S1110000_23;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ttnet.org.chromium.net.g0;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes24.dex */
public final class TTCronetNetExpRequest extends g0 {
    public static final /* synthetic */ int LJIIJJI = 0;
    public final CronetUrlRequestContext LIZ;
    public final int LIZIZ;
    public final List<String> LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final InterfaceC1498130p5X LJI;
    public final Executor LJII;
    public long LJIIIIZZ;
    public boolean LJIIIZ;
    public final Object LJIIJ = new Object();

    private void onNetExpRequestComplete(String str, boolean z) {
        ARunnableS6S1110000_23 aRunnableS6S1110000_23 = new ARunnableS6S1110000_23(this, z, str, 2);
        try {
            Executor executor = this.LJII;
            if (executor != null) {
                executor.execute(aRunnableS6S1110000_23);
            } else {
                new BPEAThread(aRunnableS6S1110000_23, "NetExpCallback").start();
            }
        } catch (RejectedExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            C08VH.LIZ("Exception posting task to executor", e);
        }
    }

    public TTCronetNetExpRequest(CronetUrlRequestContext cronetUrlRequestContext, InterfaceC1498130p5X interfaceC1498130p5X, Executor executor, int i, List<String> list, int i2, int i3, int i4) {
        this.LIZ = cronetUrlRequestContext;
        this.LJI = interfaceC1498130p5X;
        this.LJII = executor;
        this.LIZIZ = i;
        this.LIZJ = list;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = i4;
    }
}
