package com.lynx.canvas;

import X.C1288370jdD;
import X.C1288410jdH;
import X.C1294050jmN;
import X.C2188811AlT;
import X.InterfaceC1288420jdI;
import android.content.res.AssetManager;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Pair;

/* JADX INFO: loaded from: classes21.dex */
public class CanvasFontRegistry {
    public static volatile CanvasFontRegistry LIZLLL;
    public final ArrayList<C1288410jdH> LIZ = new ArrayList<>();
    public boolean LIZIZ = false;
    public final HashSet<InterfaceC1288420jdI> LIZJ = new HashSet<>();

    private native void nativeOnRegisterFontLazyProvider();

    private native boolean nativeRegisterFont(String str, String str2, int i, int i2);

    public static CanvasFontRegistry LIZ() {
        if (LIZLLL == null) {
            synchronized (CanvasFontRegistry.class) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = new CanvasFontRegistry();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public final void LIZJ() {
        C1294050jmN c1294050jmN = new InterfaceC1288420jdI() { // from class: X.0jmN
            @Override // X.InterfaceC1288420jdI
            public final String LIZ(String str) {
                Pair pair;
                boolean zBooleanValue;
                if (Build.VERSION.SDK_INT >= 26) {
                    return "assets://font/TikTokSans-VF.otf";
                }
                String lowerCase = str.toLowerCase(Locale.ENGLISH);
                int iIntValue = 1;
                if (C1300770jxD.LIZIZ.contains(lowerCase)) {
                    pair = new Pair(3, Boolean.FALSE);
                } else if (C1300770jxD.LIZJ.contains(lowerCase)) {
                    pair = new Pair(2, Boolean.FALSE);
                } else if (C1300770jxD.LIZLLL.contains(lowerCase)) {
                    pair = new Pair(1, Boolean.FALSE);
                } else if (C1300770jxD.LJ.contains(lowerCase)) {
                    pair = new Pair(3, Boolean.TRUE);
                } else if (C1300770jxD.LJFF.contains(lowerCase)) {
                    pair = new Pair(2, Boolean.TRUE);
                } else if (C1300770jxD.LJI.contains(lowerCase)) {
                    pair = new Pair(1, Boolean.TRUE);
                } else {
                    pair = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("assets://");
                if (pair != null) {
                    iIntValue = ((Number) pair.getFirst()).intValue();
                    zBooleanValue = ((Boolean) pair.getSecond()).booleanValue();
                } else {
                    zBooleanValue = false;
                }
                sbLIZ.append(C1697600uHG.LIZ(iIntValue, zBooleanValue));
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        };
        synchronized (this) {
            try {
                this.LIZJ.add(c1294050jmN);
                C1288370jdD.LIZJ("CanvasFontRegistry", "register font lazy provider");
                if (this.LIZIZ) {
                    nativeOnRegisterFontLazyProvider();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static AssetManager getAssetManager() {
        Krypton kryptonLIZIZ = Krypton.LIZIZ();
        try {
            if (kryptonLIZIZ.LIZ) {
                return kryptonLIZIZ.LIZIZ.getAssets();
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getAssetManager error ");
            sbLIZ.append(th.toString());
            C1288370jdD.LIZJ("CanvasFontRegistry", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public static void onNativeFirstUseComplexLayout() {
        Krypton.LIZIZ().getClass();
        Krypton.LIZJ("kryptoni18n", true);
    }

    public static void onNativeReady() {
        CanvasFontRegistry canvasFontRegistryLIZ = LIZ();
        synchronized (canvasFontRegistryLIZ) {
            try {
                if (canvasFontRegistryLIZ.LIZIZ) {
                    return;
                }
                canvasFontRegistryLIZ.LIZIZ = true;
                for (C1288410jdH c1288410jdH : canvasFontRegistryLIZ.LIZ) {
                    canvasFontRegistryLIZ.nativeRegisterFont(c1288410jdH.LIZ, c1288410jdH.LIZIZ, c1288410jdH.LIZJ, c1288410jdH.LIZLLL);
                }
                canvasFontRegistryLIZ.LIZ.clear();
                if (canvasFontRegistryLIZ.LIZJ.size() > 0) {
                    canvasFontRegistryLIZ.nativeOnRegisterFontLazyProvider();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static String getLocalFontUrlFromPlatformProvider(String str, int i, int i2) {
        HashSet hashSet;
        CanvasFontRegistry canvasFontRegistryLIZ = LIZ();
        synchronized (canvasFontRegistryLIZ) {
            try {
                hashSet = new HashSet(canvasFontRegistryLIZ.LIZJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            String strLIZ = ((InterfaceC1288420jdI) it2.next()).LIZ(str);
            if (strLIZ != null && strLIZ.length() > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getLocalFontUrlByFamilyName ");
                sbLIZ.append(str);
                sbLIZ.append(" success ");
                sbLIZ.append(strLIZ);
                C1288370jdD.LIZJ("CanvasFontRegistry", C2188811AlT.LIZIZ(sbLIZ));
                return strLIZ;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getLocalFontUrlByFamilyName ");
        sbLIZ2.append(str);
        sbLIZ2.append(" not found ");
        C1288370jdD.LIZJ("CanvasFontRegistry", C2188811AlT.LIZIZ(sbLIZ2));
        return "";
    }

    public final boolean LIZIZ(int i, String str, String str2) {
        if (str.length() != 0 && str2 != null && str2.length() != 0 && i >= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("registerFont ");
            sbLIZ.append(str);
            C1288370jdD.LIZJ("CanvasFontRegistry", C2188811AlT.LIZIZ(sbLIZ));
            synchronized (this) {
                try {
                    if (this.LIZIZ) {
                        return nativeRegisterFont(str, str2, i, 0);
                    }
                    C1288410jdH c1288410jdH = new C1288410jdH();
                    c1288410jdH.LIZ = str;
                    c1288410jdH.LIZIZ = str2;
                    c1288410jdH.LIZJ = i;
                    c1288410jdH.LIZLLL = 0;
                    this.LIZ.add(c1288410jdH);
                    return true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("registerFont ");
        sbLIZ2.append(str);
        sbLIZ2.append(" param error");
        C1288370jdD.LIZIZ("CanvasFontRegistry", C2188811AlT.LIZIZ(sbLIZ2));
        return false;
    }
}
