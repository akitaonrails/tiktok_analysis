package com.ss.ugc.android.editor.track.viewmodels;

import X.C01GW;
import X.C098200Yq;
import X.C0PEM;
import X.C13TS;
import X.C13TV;
import X.C189200o6;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C2296908zH;
import X.C23118094a;
import X.C23250099c;
import X.C275420Aqq;
import X.C358440E3m;
import X.C360610EBv;
import X.C370720EgA;
import X.C370820EgK;
import X.C370920EgU;
import X.C370950EgX;
import X.C371390EhF;
import X.C452501pT;
import X.InterfaceC370850EgN;
import X.InterfaceC497601wk;
import android.graphics.Bitmap;
import android.util.Size;
import androidx.lifecycle.ViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: loaded from: classes6.dex */
public final class FrameCacheViewModel extends ViewModel implements InterfaceC497601wk {
    public final CoroutineContext LL;
    public final C01GW LLILLJJLI;
    public String LLILLL;
    public ConcurrentHashMap<C370820EgK, Bitmap> LLILZ;
    public Function0<Unit> LLILZIL;

    public final C370920EgU wQ2() {
        return (C370920EgU) this.LLILLJJLI.getValue();
    }

    public FrameCacheViewModel() {
        C1DFH c1dfh = C0PEM.LIZ;
        this.LL = C2107308Nj.LIZ.plus(C2296908zH.LIZ());
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 970));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C2296808zG.LIZJ(this, null);
        Function0<Unit> function0 = this.LLILZIL;
        if (function0 != null) {
            function0.invoke();
        }
        C370950EgX.LIZIZ.clear();
        this.LLILZ = null;
        C01GW c01gw = C275420Aqq.LIZ;
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            C370920EgU c370920EgUWQ2 = wQ2();
            c370920EgUWQ2.getClass();
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c370920EgUWQ2, C2107308Nj.LIZ, null, new C358440E3m(c370920EgUWQ2, null), 2);
            C23118094a.LIZJ(c370920EgUWQ2.LLILLL, null);
            if (((Boolean) c01gw.getValue()).booleanValue()) {
                c370920EgUWQ2.LLJILLL.LIZIZ(null);
                c370920EgUWQ2.LLJJ.LIZIZ(null);
            }
        }
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LL;
    }

    public static void yQ2(FrameCacheViewModel frameCacheViewModel) {
        frameCacheViewModel.wQ2().LJFF(false);
    }

    public final Bitmap vQ2(int i, String str) {
        boolean z;
        Bitmap bitmapLIZLLL = wQ2().LIZLLL(i, str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrameCacheViewModel getFrameBitmap: is null ");
        boolean z2 = true;
        if (bitmapLIZLLL == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (bitmapLIZLLL == null) {
            C370820EgK c370820EgK = new C370820EgK(str, i, C371390EhF.LIZ(str));
            ConcurrentHashMap<C370820EgK, Bitmap> concurrentHashMap = this.LLILZ;
            if (concurrentHashMap != null) {
                bitmapLIZLLL = concurrentHashMap.get(c370820EgK);
            } else {
                bitmapLIZLLL = null;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("FrameCacheViewModel getFrameBitmap from preloadFrameCache: is null ");
            if (bitmapLIZLLL != null) {
                z2 = false;
            }
            sbLIZ2.append(z2);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        return bitmapLIZLLL;
    }

    public final void xQ2(long j, String str) {
        Object c098200Yq;
        C370920EgU c370920EgUWQ2 = wQ2();
        c370920EgUWQ2.getClass();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int i2 = C360610EBv.LIZ * i;
            if (i2 <= j) {
                arrayList.add(Integer.valueOf(i2));
            }
            i++;
        } while (i < 5);
        if (!arrayList.isEmpty()) {
            C370720EgA c370720EgA = C370720EgA.LIZ;
            String strLJ = C370920EgU.LJ(str);
            Size size = c370920EgUWQ2.LL;
            c370720EgA.getClass();
            synchronized (C370720EgA.LJ) {
                try {
                    C370720EgA.LJFF = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    int iIntValue = ((Number) obj).intValue();
                    C13TV c13tv = C13TS.LIZ;
                    if (C13TS.LIZ(C371390EhF.LIZIZ(iIntValue, strLJ)) == null && c370920EgUWQ2.LIZLLL(iIntValue, str) == null) {
                        arrayList2.add(obj);
                    }
                }
                synchronized (C370720EgA.LIZJ) {
                    try {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            C370720EgA.LIZJ.put(new C370820EgK(str, ((Number) it2.next()).intValue(), strLJ), null);
                        }
                    } finally {
                    }
                }
                final ArrayList arrayList3 = new ArrayList(arrayList);
                C370720EgA.LJFF(C370720EgA.LIZ, str, strLJ, arrayList, size, new InterfaceC370850EgN() { // from class: X.0EgH
                    @Override // X.InterfaceC370850EgN
                    public final void LIZ(C370820EgK c370820EgK, Bitmap bitmap) {
                        InterfaceC370850EgN interfaceC370850EgN;
                        HashMap<C370820EgK, Bitmap> map = C370720EgA.LIZJ;
                        synchronized (map) {
                            try {
                                map.put(c370820EgK, bitmap);
                                HashMap<C370820EgK, InterfaceC370850EgN> map2 = C370720EgA.LIZLLL;
                                interfaceC370850EgN = map2.get(c370820EgK);
                                if (interfaceC370850EgN != null) {
                                    map.remove(c370820EgK);
                                    map2.remove(c370820EgK);
                                }
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                throw th2;
                            }
                        }
                        InterfaceC370850EgN interfaceC370850EgN2 = interfaceC370850EgN;
                        if (interfaceC370850EgN2 != null) {
                            interfaceC370850EgN2.LIZ(c370820EgK, bitmap);
                        }
                        if (C370720EgA.LJFF) {
                            return;
                        }
                        Object obj2 = C370720EgA.LJ;
                        List<Integer> list = arrayList3;
                        synchronized (obj2) {
                            try {
                                list.remove(Integer.valueOf(c370820EgK.LIZIZ));
                                if (list.isEmpty()) {
                                    C370720EgA.LJFF = true;
                                    obj2.notifyAll();
                                }
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                                throw th3;
                            }
                        }
                    }
                }, false, null, true, false, 320);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                HashMap<C370820EgK, Bitmap> map = C370720EgA.LIZJ;
                synchronized (map) {
                    try {
                        map.clear();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                Object obj2 = C370720EgA.LJ;
                synchronized (obj2) {
                    try {
                        C370720EgA.LJFF = true;
                        obj2.notifyAll();
                    } finally {
                    }
                }
            }
        }
    }
}
