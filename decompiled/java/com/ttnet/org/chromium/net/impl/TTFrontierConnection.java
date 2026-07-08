package com.ttnet.org.chromium.net.impl;

import J.N;
import X.AbstractC847290XLr;
import X.C847260XLo;
import Y.ARunnableS0S2101000_13;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ttnet.org.chromium.net.impl.TTFrontierConnection;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public class TTFrontierConnection {
    public long LIZ;
    public final Object LIZIZ;
    public final List<String> LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final long LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final long LJIIIZ;
    public final Map<String, String> LJIIJ;
    public final Map<String, String> LJIIJJI;
    public final List<Integer> LJIIL;
    public final boolean LJIILIIL;
    public final AbstractC847290XLr LJIILJJIL;
    public final Executor LJIILL;
    public final AtomicInteger LJIILLIIL;

    public final void LIZ() {
        synchronized (this.LIZIZ) {
            try {
                if (this.LIZ == 0) {
                    return;
                }
                N.MZz7QbJB(this.LIZ, this);
                this.LIZ = 0L;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private void onAllServiceReady(boolean z) {
        try {
            this.LJIILJJIL.onAllServiceReady(this, z);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    private void onConnectionMode(int i) {
        try {
            this.LJIILJJIL.onConnectionMode(this, i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    private void onConnectionError(int i, String str, String str2) {
        this.LJIILLIIL.set(i);
        try {
            this.LJIILL.execute(new ARunnableS0S2101000_13(i, str, str2, this, 1));
        } catch (RejectedExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    private void onConnectionStateChanged(int i, String str, String str2) {
        this.LJIILLIIL.set(i);
        try {
            this.LJIILL.execute(new ARunnableS0S2101000_13(i, str, str2, this, 0));
        } catch (RejectedExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZIZ(int i, ByteBuffer byteBuffer, String[] strArr) {
        synchronized (this.LIZIZ) {
            try {
                if (this.LIZ == 0) {
                    return;
                }
                N.M4sZKn6G(this.LIZ, this, i, strArr, byteBuffer);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public TTFrontierConnection(CronetUrlRequestContext cronetUrlRequestContext, AbstractC847290XLr abstractC847290XLr, Executor executor, C847260XLo c847260XLo) {
        Object obj = new Object();
        this.LIZIZ = obj;
        this.LJIILLIIL = new AtomicInteger(0);
        this.LJIILJJIL = abstractC847290XLr;
        this.LJIILL = executor;
        List<String> list = c847260XLo.LIZ;
        this.LIZJ = list;
        this.LIZLLL = c847260XLo.LIZIZ;
        this.LJ = c847260XLo.LIZJ;
        this.LJFF = c847260XLo.LIZLLL;
        this.LJI = c847260XLo.LJ;
        this.LJII = c847260XLo.LJFF;
        this.LJIIIIZZ = c847260XLo.LJI;
        this.LJIIIZ = c847260XLo.LJII;
        this.LJIIJ = c847260XLo.LJIIIZ;
        this.LJIIJJI = c847260XLo.LJIIIIZZ;
        this.LJIIL = c847260XLo.LJIIJ;
        this.LJIILIIL = c847260XLo.LJIIJJI;
        synchronized (obj) {
            try {
                if (this.LIZ == 0) {
                    this.LIZ = N.MEtRyDGt(this, cronetUrlRequestContext.LJJL());
                }
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    N.MCKjYI5n(this.LIZ, this, it2.next());
                }
                Map<String, String> map = this.LJIIJ;
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        N.MnYmJ$eY(this.LIZ, this, entry.getKey(), entry.getValue());
                    }
                }
                Map<String, String> map2 = this.LJIIJJI;
                if (map2 != null) {
                    for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                        N.MaMeYR_Y(this.LIZ, this, entry2.getKey(), entry2.getValue());
                    }
                }
                List<Integer> list2 = this.LJIIL;
                if (list2 != null) {
                    Iterator<Integer> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        N.MWzrTdcn(this.LIZ, this, it3.next().intValue());
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private void onReceivedMessage(int i, String[] strArr, ByteBuffer byteBuffer, boolean z) {
        if (strArr == null) {
            return;
        }
        int length = strArr.length;
        if (length % 2 != 0) {
            return;
        }
        HashMap map = new HashMap();
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i3 < length) {
                if (!TextUtils.isEmpty(strArr[i2]) && !TextUtils.isEmpty(strArr[i3])) {
                    map.put(strArr[i2], strArr[i3]);
                }
                i2 += 2;
            } else {
                try {
                    this.LJIILJJIL.onMessageReceived(this, i, byteBuffer, map, z);
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
        }
    }

    private void onTrafficChanged(final String str, final long j, final long j2, final boolean z) {
        try {
            this.LJIILL.execute(new Runnable() { // from class: X.0XLs
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TTFrontierConnection@4ff9.onTrafficChanged$1");
                    try {
                        try {
                            TTFrontierConnection tTFrontierConnection = this.LLILZIL;
                            tTFrontierConnection.LJIILJJIL.onTrafficChanged(tTFrontierConnection, str, j, j2, z);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TTFrontierConnection@4ff9.onTrafficChanged$1");
                }
            });
        } catch (RejectedExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
