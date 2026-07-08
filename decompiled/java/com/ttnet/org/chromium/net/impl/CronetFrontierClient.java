package com.ttnet.org.chromium.net.impl;

import J.N;
import X.C847240XLm;
import X.C847310XLt;
import X.EnumC847220XLk;
import X.InterfaceC847340XLw;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public class CronetFrontierClient {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final Map<String, String> LJIIIZ;
    public final EnumC847220XLk LJIIJ;
    public final Map<Integer, C847310XLt> LJIIJJI = new ConcurrentHashMap();
    public final InterfaceC847340XLw LJIIL;
    public final List<Integer> LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final boolean LJIILLIIL;
    public long LJIIZILJ;
    public final Object LJIJ;
    public final AtomicInteger LJIJI;

    public CronetFrontierClient(C847240XLm c847240XLm) throws Throwable {
        this.LJIIJ = EnumC847220XLk.UNKNOWN;
        Object obj = new Object();
        this.LJIJ = obj;
        this.LJIJI = new AtomicInteger(0);
        this.LIZ = c847240XLm.LIZ;
        this.LIZIZ = c847240XLm.LIZIZ;
        this.LIZJ = c847240XLm.LIZJ;
        this.LIZLLL = c847240XLm.LIZLLL;
        this.LJ = c847240XLm.LJ;
        this.LJFF = c847240XLm.LJFF;
        this.LJI = c847240XLm.LJI;
        this.LJII = c847240XLm.LJII;
        this.LJIIIIZZ = c847240XLm.LJIIIIZZ;
        Map<String, String> map = c847240XLm.LJIIIZ;
        this.LJIIIZ = map;
        this.LJIIJ = c847240XLm.LJIIJ;
        this.LJIIL = c847240XLm.LJIIJJI;
        this.LJIILIIL = c847240XLm.LJIIL;
        this.LJIILJJIL = c847240XLm.LJIILIIL;
        this.LJIILL = c847240XLm.LJIILJJIL;
        this.LJIILLIIL = c847240XLm.LJIILL;
        synchronized (obj) {
            try {
                if (this.LJIIZILJ == 0) {
                    this.LJIIZILJ = N.MagNlhNv(this);
                }
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        N.MwZrRAIG(this.LJIIZILJ, this, entry.getKey(), entry.getValue());
                    }
                }
                List<Integer> list = this.LJIILIIL;
                if (list != null) {
                    Iterator<Integer> it2 = list.iterator();
                    while (it2.hasNext()) {
                        N.Msf3H5kQ(this.LJIIZILJ, this, it2.next().intValue());
                    }
                }
                try {
                    N.Mhk1t9AY(this.LJIIZILJ, this, this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, null, this.LJII, this.LJIIIIZZ, this.LJIIJ.getValue(), this.LJIILLIIL, this.LJIILJJIL, this.LJIILL);
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    private void onConnectionStateChanged(int i, String str) {
        this.LJIJI.set(i);
        try {
            this.LJIIL.onConnectionStateChanged(i, str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    private void onServiceReady(int i, String str) {
        C847310XLt c847310XLt = (C847310XLt) ((ConcurrentHashMap) this.LJIIJJI).get(Integer.valueOf(i));
        if (c847310XLt == null) {
            return;
        }
        c847310XLt.LIZJ.onServiceReady(i, str);
    }

    private void onConnectionError(int i, String str, String str2) {
        this.LJIJI.set(i);
        try {
            this.LJIIL.onConnectionError(i, str, str2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    private void onError(int i, int i2, String str) {
        C847310XLt c847310XLt = (C847310XLt) ((ConcurrentHashMap) this.LJIIJJI).get(Integer.valueOf(i));
        if (c847310XLt == null) {
            return;
        }
        c847310XLt.LIZJ.onError(i, i2, str);
    }

    public final void LIZ(int i, ByteBuffer byteBuffer, String[] strArr) {
        synchronized (this.LJIJ) {
            try {
                if (this.LJIIZILJ == 0) {
                    return;
                }
                N.MKYiSehZ(this.LJIIZILJ, this, i, strArr, byteBuffer);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private void onReceivedAck(int i, long j, String str, boolean z) {
        if (z) {
            return;
        }
        C847310XLt c847310XLt = (C847310XLt) ((ConcurrentHashMap) this.LJIIJJI).get(Integer.valueOf(i));
        if (c847310XLt == null) {
            return;
        }
        c847310XLt.LIZJ.onReceivedAck(i, j, str, Boolean.valueOf(z));
    }

    private void onReceivedMessage(int i, String[] strArr, ByteBuffer byteBuffer, int i2) {
        C847310XLt c847310XLt = (C847310XLt) ((ConcurrentHashMap) this.LJIIJJI).get(Integer.valueOf(i));
        if (c847310XLt == null) {
            return;
        }
        int length = strArr.length;
        if (length % 2 != 0) {
            return;
        }
        HashMap map = new HashMap();
        for (int i3 = 0; i3 < length; i3 += 2) {
            if (!TextUtils.isEmpty(strArr[i3])) {
                int i4 = i3 + 1;
                if (!TextUtils.isEmpty(strArr[i4])) {
                    map.put(strArr[i3], strArr[i4]);
                }
            }
        }
        byte[] bArr = new byte[byteBuffer.capacity()];
        byteBuffer.get(bArr);
        if (i2 >= 0) {
            i = i2;
        }
        c847310XLt.LIZJ.onReceivedMessage(i, map, bArr);
    }

    private void onTrafficChanged(String str, long j, long j2, boolean z) {
        try {
            this.LJIIL.onTrafficChanged(str, j, j2, z);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
