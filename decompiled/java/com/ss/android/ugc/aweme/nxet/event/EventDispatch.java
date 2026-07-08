package com.ss.android.ugc.aweme.nxet.event;

import X.C01GW;
import X.C0VP2;
import X.C1489040oqs;
import X.C1845130y7D;
import X.C1846580y9Y;
import X.C1846620y9c;
import X.C1847610yBD;
import X.C1847720yBO;
import X.C1847740yBQ;
import X.C1847770yBT;
import X.C1847780yBU;
import X.C1847800yBW;
import X.C1847820yBY;
import X.C1847930yBj;
import X.C1847960yBm;
import X.C1848030yBt;
import X.C1848140yC4;
import X.C1848150yC5;
import X.C1954807lC;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import X.C787070Uu9;
import X.EnumC1847910yBh;
import X.EnumC1847970yBn;
import X.EnumC1848020yBs;
import X.InterfaceC1848340yCO;
import Y.ARunnableS21S1300000_27;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.nxet.vtree.v2.VTreeBuildManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class EventDispatch {
    public static final ExposureHandler LIZ;
    public static final ArrayList<WeakReference<InterfaceC1848340yCO>> LIZIZ;
    public static final C01GW LIZJ;

    static {
        HandlerThread handlerThread = new HandlerThread("exposure_thread");
        LIZIZ = new ArrayList<>();
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(154));
        LIZJ = c01gwLIZIZ;
        handlerThread.start();
        LIZ = new ExposureHandler(C786410Ut5.W2(handlerThread));
        ((C1489040oqs) c01gwLIZIZ.getValue()).LIZ(C1846580y9Y.LIZ);
    }

    public static final class ExposureHandler extends BPEAHandler {
        public ExposureHandler(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Removed duplicated region for block: B:251:0x0158 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:262:0x0117 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:273:0x0299 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:288:0x023e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0151  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0169  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void handleMessage(android.os.Message r24) {
            /*
                Method dump skipped, instruction units count: 830
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.nxet.event.EventDispatch.ExposureHandler.handleMessage(android.os.Message):void");
        }
    }

    public static void LIZ(C1847930yBj c1847930yBj) {
        View view;
        WeakHashMap<View, C1847770yBT> weakHashMap;
        C1847770yBT c1847770yBT;
        String event = c1847930yBj.getEvent();
        if (event.length() == 0 || (view = c1847930yBj.LIZLLL.get()) == null || C1846620y9c.LIZIZ(view) == null) {
            return;
        }
        if (C1847960yBm.LJIIIIZZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("doLog: event=");
            sbLIZ.append(event);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C1847800yBW c1847800yBWLJIIIIZZ = VTreeBuildManager.LJIIIIZZ();
        if (c1847800yBWLJIIIIZZ != null && (weakHashMap = c1847800yBWLJIIIIZZ.LIZIZ) != null && (c1847770yBT = weakHashMap.get(view)) != null) {
            LIZIZ(c1847930yBj.LIZ, c1847770yBT, event);
            C1847780yBU.LIZ(c1847930yBj, c1847770yBT, c1847930yBj.LIZ);
        } else if (C1845130y7D.LIZ(view) != null) {
            ((ArrayList) VTreeBuildManager.LJIIIIZZ).add(c1847930yBj);
            VTreeBuildManager.LJIIL(false);
        }
    }

    public static void LIZIZ(EnumC1847910yBh enumC1847910yBh, C1847770yBT c1847770yBT, String str) {
        Iterator<WeakReference<InterfaceC1848340yCO>> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            InterfaceC1848340yCO interfaceC1848340yCO = it2.next().get();
            if (interfaceC1848340yCO == null) {
                it2.remove();
            } else {
                C786410Ut5.LJJZZIII(C787070Uu9.LIZ, new ARunnableS21S1300000_27(interfaceC1848340yCO, str, enumC1847910yBh, c1847770yBT, 3));
            }
        }
    }

    public static void LIZJ(View view, EnumC1847910yBh enumC1847910yBh, String str, boolean z) {
        boolean z2;
        WeakHashMap<View, C1847770yBT> weakHashMap;
        C1847770yBT c1847770yBT;
        EnumC1847970yBn enumC1847970yBn;
        int i;
        C1847800yBW c1847800yBWLJIIIIZZ;
        WeakHashMap<View, C1847770yBT> weakHashMap2;
        if (!z) {
            return;
        }
        C1847740yBQ c1847740yBQLIZIZ = C1846620y9c.LIZIZ(view);
        if (c1847740yBQLIZIZ != null && c1847740yBQLIZIZ.LJIJJ) {
            z2 = true;
        } else {
            z2 = false;
        }
        Boolean boolValueOf = null;
        if (z2 && (((c1847800yBWLJIIIIZZ = VTreeBuildManager.LJIIIIZZ()) == null || (weakHashMap2 = c1847800yBWLJIIIIZZ.LIZIZ) == null || weakHashMap2.get(view) == null) && view.getVisibility() == 0 && C787070Uu9.LIZ())) {
            boolean z3 = C1847960yBm.LJIIIIZZ;
            VTreeBuildManager.LJIIJ = 0L;
            VTreeBuildManager.LJ = 1;
            VTreeBuildManager.LJIIJJI();
        } else if (C1847960yBm.LJIIIIZZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preLog skip vtree build props.isValid=");
            C1847740yBQ c1847740yBQLIZIZ2 = C1846620y9c.LIZIZ(view);
            if (c1847740yBQLIZIZ2 != null) {
                boolValueOf = Boolean.valueOf(c1847740yBQLIZIZ2.LJIJJ);
            }
            sbLIZ.append(boolValueOf);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C1847800yBW c1847800yBWLJIIIIZZ2 = VTreeBuildManager.LJIIIIZZ();
        if (c1847800yBWLJIIIIZZ2 != null && (weakHashMap = c1847800yBWLJIIIIZZ2.LIZIZ) != null && (c1847770yBT = weakHashMap.get(view)) != null) {
            if (enumC1847910yBh != null) {
                str = c1847770yBT.LIZ.LIZIZ(enumC1847910yBh);
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            EnumC1848020yBs enumC1848020yBs = c1847770yBT.LIZ.LIZJ;
            if (enumC1848020yBs != null && (i = C1848030yBt.LIZ[enumC1848020yBs.ordinal()]) != -1) {
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            str2 = "e";
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        str2 = "m";
                    }
                } else {
                    str2 = "p";
                }
            }
            C1847720yBO c1847720yBO = new C1847720yBO();
            c1847720yBO.LJII((String) C1848140yC4.LIZJ.getValue());
            c1847720yBO.LJIIIZ(str2);
            c1847720yBO.LJFF(String.valueOf(C1847610yBD.LIZ.LIZ()));
            c1847720yBO.LIZLLL(str);
            c1847720yBO.LJIIIIZZ(c1847770yBT.LJII());
            Pair<String, Boolean> pair = c1847770yBT.LJIIL;
            c1847720yBO.LJI(pair.getFirst());
            if (pair.getSecond().booleanValue()) {
                c1847720yBO.LJ(11, "er");
            }
            String strLIZ = c1847720yBO.LIZ();
            if (enumC1847910yBh == EnumC1847910yBh.CLICK) {
                enumC1847970yBn = EnumC1847970yBn.CLICK_EVENT;
            } else {
                enumC1847970yBn = EnumC1847970yBn.CUSTOM_EVENT;
            }
            C1847820yBY.LIZ.LIZIZ(new C0VP2(strLIZ, enumC1847970yBn));
            if (C1847960yBm.LJIIIIZZ) {
                C1847820yBY.LIZ();
                return;
            }
            return;
        }
        C1848150yC5 c1848150yC5 = C1847820yBY.LIZLLL;
        synchronized (c1848150yC5) {
            if (view != null) {
                StringBuilder sb = new StringBuilder();
                do {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(view.getClass().getSimpleName());
                    sbLIZ2.append('.');
                    sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                    Object parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    } else {
                        view = (View) parent;
                    }
                } while (view != null);
                C0VP2 c0vp2 = new C0VP2(sb.substring(0, sb.length() - 1), System.currentTimeMillis(), EnumC1847970yBn.UNDEFINED_XPATH);
                if (c1848150yC5.LIZ.size() > 10) {
                    c1848150yC5.LIZ.removeLast();
                }
                c1848150yC5.LIZ.addFirst(c0vp2);
            }
        }
        if (C1847960yBm.LJIIIIZZ) {
            C1848150yC5 c1848150yC52 = C1847820yBY.LIZLLL;
            c1848150yC52.getClass();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("xpathList: ");
            sbLIZ3.append(c1848150yC52.LIZ);
            C2188811AlT.LIZIZ(sbLIZ3);
        }
    }
}
