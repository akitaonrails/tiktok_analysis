package com.ttnet.org.chromium.net.impl;

import J.N;
import X.AbstractC1498430p61;
import X.C08VH;
import X.C2188811AlT;
import Y.ARunnableS28S1100000_23;
import Y.ARunnableS29S0201000_23;
import Y.ARunnableS6S1101000_23;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ttnet.org.chromium.net.impl.CronetWebsocketConnection;
import com.ttnet.org.chromium.net.k0;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes24.dex */
public final class CronetWebsocketConnection extends k0 {
    public static final /* synthetic */ int LJIJI = 0;
    public long LIZ;
    public final AbstractC1498430p61 LIZIZ;
    public final Executor LIZJ;
    public final List<String> LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final long LJI;
    public final int LJII;
    public final long LJIIIIZZ;
    public final String LJIIIZ;
    public final int LJIIJ;
    public final String LJIIJJI;
    public final Map<String, String> LJIIL;
    public final Map<String, String> LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;
    public final CronetUrlRequestContext LJIILLIIL;
    public final Object LJIIZILJ;
    public final AtomicInteger LJIJ;

    @Override // com.ttnet.org.chromium.net.k0
    public final void LIZIZ() {
        synchronized (this.LJIIZILJ) {
            try {
                if (this.LIZ == 0) {
                    return;
                }
                N.MCzpxGQD(this.LIZ, this);
                this.LIZ = 0L;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.k0
    public final void LIZJ() throws Throwable {
        synchronized (this.LJIIZILJ) {
            try {
                try {
                    if (this.LIZ == 0) {
                        this.LIZ = N.MRAGjNeT(this, this.LJIILLIIL.LJJL());
                    }
                    Iterator<String> it2 = this.LIZLLL.iterator();
                    while (it2.hasNext()) {
                        N.MgN9hn8A(this.LIZ, this, it2.next());
                    }
                    Map<String, String> map = this.LJIIL;
                    if (map != null) {
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            N.Mzisx1kZ(this.LIZ, this, entry.getKey(), entry.getValue());
                        }
                    }
                    Map<String, String> map2 = this.LJIILIIL;
                    if (map2 != null) {
                        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                            N.MKmGe$35(this.LIZ, this, entry2.getKey(), entry2.getValue());
                        }
                    }
                    if (this.LJIILL) {
                        N.MWq0tMul(this.LIZ, this, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIILJJIL);
                    } else {
                        N.MVrBbeuj(this.LIZ, this, this.LJIILJJIL);
                    }
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.k0
    public final void LIZLLL() {
        synchronized (this.LJIIZILJ) {
            try {
                if (this.LIZ == 0) {
                    return;
                }
                N.M14GZgiH(this.LIZ, this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private void onFeedbackLog(String str) {
        LJ(new ARunnableS28S1100000_23(this, str, 8));
    }

    @Override // com.ttnet.org.chromium.net.k0
    public final void LIZ(ByteBuffer byteBuffer) {
        synchronized (this.LJIIZILJ) {
            try {
                if (this.LIZ == 0) {
                    return;
                }
                N.MRfZ_7V_(this.LIZ, this, byteBuffer);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJ(Runnable runnable) {
        try {
            this.LIZJ.execute(runnable);
        } catch (RejectedExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            C08VH.LIZ("Exception posting task to executor", e);
        }
    }

    private void onConnectionStateChanged(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onConnectionStateChanged: state = ");
        sbLIZ.append(i);
        sbLIZ.append(", url = ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LJIJ.set(i);
        LJ(new ARunnableS6S1101000_23(this, i, str, 0));
    }

    private void onMessageReceived(ByteBuffer byteBuffer, int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.capacity());
        byteBuffer.rewind();
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.flip();
        LJ(new ARunnableS29S0201000_23(i, byteBufferAllocate, this, 0));
    }

    private void onConnectionError(final int i, final String str, final String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onConnectionError: ");
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LJIJ.set(i);
        LJ(new Runnable() { // from class: X.0p5v
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CronetWebsocketConnection@25f3.onConnectionError$1");
                try {
                    try {
                        CronetWebsocketConnection cronetWebsocketConnection = this.LLILZ;
                        cronetWebsocketConnection.LIZIZ.onConnectionError(cronetWebsocketConnection, i, str, str2);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C08VH.LIZ("Exception in callback: ", e);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CronetWebsocketConnection@25f3.onConnectionError$1");
            }
        });
    }

    private void onTrafficChanged(final String str, final long j, final long j2, final boolean z) {
        LJ(new Runnable() { // from class: X.0p5w
            public final void LIZ() {
                try {
                    CronetWebsocketConnection cronetWebsocketConnection = this.LLILZIL;
                    cronetWebsocketConnection.LIZIZ.onTrafficChanged(cronetWebsocketConnection, str, j, j2, z);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C08VH.LIZ("Exception in callback: ", e);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CronetWebsocketConnection@25f3.onTrafficChanged$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CronetWebsocketConnection@25f3.onTrafficChanged$1");
            }
        });
    }

    public CronetWebsocketConnection(CronetUrlRequestContext cronetUrlRequestContext, AbstractC1498430p61 abstractC1498430p61, Executor executor, List<String> list, Map<String, String> map, Map<String, String> map2, boolean z) {
        this.LJIILL = true;
        this.LJIIZILJ = new Object();
        this.LJIJ = new AtomicInteger(-1);
        this.LJIILLIIL = cronetUrlRequestContext;
        this.LIZIZ = abstractC1498430p61;
        this.LIZJ = executor;
        this.LIZLLL = list;
        this.LJIIL = map;
        this.LJIILIIL = map2;
        this.LJIILJJIL = z;
        this.LJIILL = false;
    }

    public CronetWebsocketConnection(CronetUrlRequestContext cronetUrlRequestContext, AbstractC1498430p61 abstractC1498430p61, Executor executor, List list, int i, String str, long j, int i2, long j2, String str2, int i3, Map map, Map map2, boolean z) {
        this.LJIILL = true;
        this.LJIIZILJ = new Object();
        this.LJIJ = new AtomicInteger(-1);
        this.LJIILLIIL = cronetUrlRequestContext;
        this.LIZIZ = abstractC1498430p61;
        this.LIZJ = executor;
        this.LIZLLL = list;
        this.LJ = i;
        this.LJFF = str;
        this.LJI = j;
        this.LJII = i2;
        this.LJIIIIZZ = j2;
        this.LJIIIZ = str2;
        this.LJIIJ = i3;
        this.LJIIJJI = null;
        this.LJIIL = map;
        this.LJIILIIL = map2;
        this.LJIILJJIL = z;
    }
}
