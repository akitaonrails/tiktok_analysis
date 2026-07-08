package com.ss.android.ugc.aweme.plugin.aab;

import X.AbstractC2203321BLe;
import X.AnonymousClass1403;
import X.AnonymousClass1405;
import X.C00BY;
import X.C01GW;
import X.C08PT;
import X.C0B6B;
import X.C0C64;
import X.C0VSJ;
import X.C0W9W;
import X.C0X9Y;
import X.C0X9Z;
import X.C10UI;
import X.C1BLC;
import X.C1BLD;
import X.C1BLE;
import X.C1BLL;
import X.C1BLO;
import X.C1BLP;
import X.C1BLS;
import X.C1BLU;
import X.C1BLV;
import X.C1BLW;
import X.C1BLX;
import X.C1BWL;
import X.C202068144s;
import X.C2108708Nx;
import X.C2188811AlT;
import X.C2203361BLi;
import X.C744270THl;
import X.C744280THm;
import X.ExecutorC2203291BLb;
import X.InterfaceC2121208Ss;
import X.InterfaceC2457409k4;
import Y.ARunnableS107S0000000_34;
import android.app.Application;
import android.os.Looper;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.lynx.hybrid.webkit.ttwebview.TTWebViewHelper;
import com.ss.android.ugc.aweme.aabplugin.core.base.exp.DFTTWebViewData;
import com.ss.android.ugc.aweme.preload.DfPreloadOption;
import com.ss.android.ugc.aweme.preloadv2.DfPreloadOptionV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public class AabPluginServiceImpl implements IPluginService {
    public static Long LIZ;
    public static Long LIZIZ;
    public static boolean LIZJ;
    public static InterfaceC2121208Ss LIZLLL;
    public static boolean LJ;
    public static final boolean LJFF;
    public static final boolean LJI;
    public static final List<C1BLD> LJII;
    public static final AtomicReference<ExecutorC2203291BLb> LJIIIIZZ;

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final void LJ() {
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final void LJIL() {
        LJ = true;
    }

    static {
        C01GW c01gw = C2203361BLi.LIZIZ;
        LJ = !((DFTTWebViewData) c01gw.getValue()).optimizeActivate;
        LJFF = ((DFTTWebViewData) c01gw.getValue()).optimizeExecutor;
        LJI = !((DFTTWebViewData) c01gw.getValue()).optimizeInstall;
        LJII = new CopyOnWriteArrayList();
        LJIIIIZZ = new AtomicReference<>(null);
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final C1BLW LIZLLL() {
        return new C1BLW();
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final List<String> LJFF() {
        return new ArrayList(C08PT.LIZLLL());
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final void LJJII() {
        ExecutorC2203291BLb executorC2203291BLb = LJIIIIZZ.get();
        if (executorC2203291BLb != null) {
            executorC2203291BLb.LL = true;
            if (ExecutorC2203291BLb.LLILLL.isEmpty()) {
                return;
            }
            ExecutorC2203291BLb.LLILLJJLI.execute(new ARunnableS107S0000000_34(10));
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final void LJJIII() {
        C2108708Nx c2108708Nx = C2108708Nx.LIZ;
        synchronized (c2108708Nx) {
            if (!Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                Application applicationLIZ = C1BWL.LIZ();
                if (C2108708Nx.LIZLLL(applicationLIZ)) {
                    String str = applicationLIZ.getApplicationInfo().nativeLibraryDir;
                    C0VSJ c0vsj = C2108708Nx.LJFF;
                    if (!c0vsj.exists()) {
                        c0vsj.mkdirs();
                    }
                    c2108708Nx.LJIIJ(str, true);
                }
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final void LJJIJIIJI() {
        LIZLLL = new InterfaceC2121208Ss() { // from class: X.0WiO
            @Override // X.InterfaceC2121208Ss
            public final void LIZ(long j, boolean z) {
                TTWebViewHelper.doCommonReport$default(TTWebViewHelper.INSTANCE, "TTWebViewInstallExecute", z, j, "zze in invoekd to execute installation of TTWebView", null, false, null, 64, null);
            }
        };
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final void init() {
        List<InterfaceC2457409k4> list = C1BLO.LIZ;
        Map<String, String> map = C1BLV.LIZ;
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final List<C00BY> LJJIIZ() {
        C1BLL c1bllLJ = C1BLL.LJ();
        c1bllLJ.getClass();
        ArrayList arrayList = new ArrayList();
        C1BLC c1blc = c1bllLJ.LLILZLL;
        if (c1blc != null) {
            arrayList.add(C1BLL.LJIILIIL(c1blc));
        }
        Iterator<C1BLC> it2 = c1bllLJ.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            arrayList.add(C1BLL.LJIILIIL(it2.next()));
        }
        Iterator<C1BLC> it3 = c1bllLJ.LLILLL.iterator();
        while (it3.hasNext()) {
            arrayList.add(C1BLL.LJIILIIL(it3.next()));
        }
        return arrayList;
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final Long LJJ() {
        return LIZ;
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final boolean LJJIIJ() {
        return LIZJ;
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final Long LJJIIJZLJL() {
        return LIZIZ;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.1BLE, X.1BLg] */
    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final void LJJI(final C202068144s c202068144s) {
        C1BLC c1blp;
        AbstractC2203321BLe c1blu;
        Locale locale = c202068144s.LJFF;
        String str = c202068144s.LIZ;
        final boolean z = c202068144s.LIZIZ;
        boolean z2 = c202068144s.LIZJ;
        AnonymousClass1405 anonymousClass1405 = c202068144s.LJ;
        if (anonymousClass1405 == null) {
            anonymousClass1405 = new AnonymousClass1405(new AnonymousClass1403());
        }
        ?? r6 = new C1BLE() { // from class: X.1BLg
            @Override // X.C1BLE
            public final void LIZ(String str2) {
                InterfaceC842850X4p interfaceC842850X4p = c202068144s.LIZLLL;
                if (interfaceC842850X4p != null) {
                    interfaceC842850X4p.LIZJ(str2, z);
                }
            }

            @Override // X.C1BLE
            public final void LIZIZ(int i, String str2) {
                InterfaceC842850X4p interfaceC842850X4p = c202068144s.LIZLLL;
                if (interfaceC842850X4p != null) {
                    interfaceC842850X4p.LIZ(i, str2, z);
                }
            }
        };
        if (locale != null) {
            c1blp = new C1BLX(locale, z, false, r6, anonymousClass1405);
        } else {
            c1blp = new C1BLP(str, z, z2, false, r6, anonymousClass1405, 8);
        }
        c1blp.LJII = c202068144s.LJI;
        if (c1blp instanceof C1BLX) {
            c1blu = new C1BLS((C1BLX) c1blp);
        } else {
            c1blu = new C1BLU((C1BLP) c1blp);
        }
        c1blu.LIZ();
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final boolean LJJIFFI(Locale locale) {
        return C1BLS.LIZIZ(locale);
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final void LJJIIZI(int i) {
        if (((Boolean) C0B6B.LIZ.getValue()).booleanValue()) {
            C0X9Y c0x9y = C0X9Y.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateStage start from stage: ");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            final DfPreloadOptionV2 dfPreloadOptionV2 = C744280THm.LIZ;
            DfPreloadOptionV2 dfPreloadOptionV22 = (DfPreloadOptionV2) c0c64LJIILLIIL.LJJIIJ(true, "df_plugin_preload_strategy_v2", 31744, DfPreloadOptionV2.class, dfPreloadOptionV2, 1);
            if (dfPreloadOptionV22 != null) {
                dfPreloadOptionV2 = dfPreloadOptionV22;
            }
            final int i2 = dfPreloadOptionV2.retryCnt;
            if (i == 0) {
                if (dfPreloadOptionV2.nujDelay >= 0) {
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    C0X9Y.LJ.schedule(new C0W9W() { // from class: X.0THe
                        public final void LIZ() {
                            C0X9Y.LIZ.getClass();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("schedule nuj at ");
                            sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            int i3 = i2;
                            if (C0X9Y.LIZIZ) {
                                return;
                            }
                            C0X9Y.LIZIZ = true;
                            if (C10UI.LIZ()) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("preloadInNuj full start, list size: ");
                                Pair<String, Function0<Long>>[] pairArr = C1E59.LIZIZ;
                                sbLIZ3.append(pairArr.length);
                                C2188811AlT.LIZIZ(sbLIZ3);
                                C0X9Y.LIZIZ(pairArr, i3);
                                return;
                            }
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("preloadInNuj start, list size: ");
                            Pair<String, Function0<Long>>[] pairArr2 = C1E59.LIZ;
                            sbLIZ4.append(pairArr2.length);
                            sbLIZ4.append(' ');
                            C2188811AlT.LIZIZ(sbLIZ4);
                            C0X9Y.LIZIZ(pairArr2, i3);
                        }

                        @Override // java.util.TimerTask, java.lang.Runnable
                        public final void run() {
                            C1C7U.LIZ("DfPreloadManagerV2@5128.updateStage$1");
                            boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                            try {
                                LIZ();
                            } finally {
                            }
                            if (zLJ) {
                                C0W9U.LJFF();
                            }
                            C1C7U.LIZIZ("DfPreloadManagerV2@5128.updateStage$1");
                        }
                    }, dfPreloadOptionV2.nujDelay);
                    return;
                }
                return;
            }
            if (i == 1) {
                if (dfPreloadOptionV2.bootDelay < 0) {
                    return;
                }
                final long jCurrentTimeMillis2 = System.currentTimeMillis();
                C0X9Y.LJ.schedule(new C0W9W() { // from class: X.0THf
                    public final void LIZ() {
                        C0X9Y.LIZ.getClass();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("schedule boot at ");
                        sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis2);
                        sbLIZ2.append(' ');
                        sbLIZ2.append(dfPreloadOptionV2);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        int i3 = i2;
                        if (C0X9Y.LIZJ) {
                            return;
                        }
                        C0X9Y.LIZJ = true;
                        if (C10UI.LIZ()) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("preloadBootFinish full start, list size: ");
                            Pair<String, Function0<Long>>[] pairArr = C1E59.LIZLLL;
                            sbLIZ3.append(pairArr.length);
                            C2188811AlT.LIZIZ(sbLIZ3);
                            C0X9Y.LIZIZ(pairArr, i3);
                            return;
                        }
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("preloadBootFinish start, list size: ");
                        Pair<String, Function0<Long>>[] pairArr2 = C1E59.LIZJ;
                        sbLIZ4.append(pairArr2.length);
                        C2188811AlT.LIZIZ(sbLIZ4);
                        C0X9Y.LIZIZ(pairArr2, i3);
                    }

                    @Override // java.util.TimerTask, java.lang.Runnable
                    public final void run() {
                        C1C7U.LIZ("DfPreloadManagerV2@5128.updateStage$2");
                        boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                        try {
                            LIZ();
                        } finally {
                        }
                        if (zLJ) {
                            C0W9U.LJFF();
                        }
                        C1C7U.LIZIZ("DfPreloadManagerV2@5128.updateStage$2");
                    }
                }, dfPreloadOptionV2.bootDelay);
                return;
            }
            if (i != 2 || dfPreloadOptionV2.bgDelay < 0) {
                return;
            }
            final long jCurrentTimeMillis3 = System.currentTimeMillis();
            C0X9Y.LJ.schedule(new C0W9W() { // from class: X.0THg
                public final void LIZ() {
                    C0X9Y.LIZ.getClass();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("schedule background at ");
                    sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis3);
                    sbLIZ2.append(' ');
                    sbLIZ2.append(dfPreloadOptionV2);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    int i3 = i2;
                    if (C0X9Y.LIZLLL) {
                        return;
                    }
                    C0X9Y.LIZLLL = true;
                    if (C10UI.LIZ()) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("preloadBackground full start, list size: ");
                        Pair<String, Function0<Long>>[] pairArr = C1E59.LJFF;
                        sbLIZ3.append(pairArr.length);
                        C2188811AlT.LIZIZ(sbLIZ3);
                        C0X9Y.LIZIZ(pairArr, i3);
                        return;
                    }
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("preloadBackground start, list size: ");
                    Pair<String, Function0<Long>>[] pairArr2 = C1E59.LJ;
                    sbLIZ4.append(pairArr2.length);
                    C2188811AlT.LIZIZ(sbLIZ4);
                    C0X9Y.LIZIZ(pairArr2, i3);
                }

                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("DfPreloadManagerV2@5128.updateStage$3");
                    boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                    try {
                        LIZ();
                    } finally {
                    }
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    C1C7U.LIZIZ("DfPreloadManagerV2@5128.updateStage$3");
                }
            }, dfPreloadOptionV2.bgDelay);
            return;
        }
        if (!C10UI.LIZ()) {
            return;
        }
        C0X9Z c0x9z = C0X9Z.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateStage start from stage: ");
        sbLIZ2.append(i);
        C2188811AlT.LIZIZ(sbLIZ2);
        C0C64 c0c64LJIILLIIL2 = C0C64.LJIILLIIL();
        final DfPreloadOption dfPreloadOption = C744270THl.LIZ;
        DfPreloadOption dfPreloadOption2 = (DfPreloadOption) c0c64LJIILLIIL2.LJJIIJ(true, "ve_effect_so_aab_plugin_preload_after_feed", 31744, DfPreloadOption.class, dfPreloadOption, 1);
        if (dfPreloadOption2 != null) {
            dfPreloadOption = dfPreloadOption2;
        }
        if (i == 0) {
            if (dfPreloadOption.nujDelay < 0) {
                return;
            }
            final long jCurrentTimeMillis4 = System.currentTimeMillis();
            C0X9Z.LJ.schedule(new C0W9W() { // from class: X.0THj
                public final void LIZ() {
                    C0X9Z.LIZ.getClass();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("schedule nuj at ");
                    sbLIZ3.append(System.currentTimeMillis() - jCurrentTimeMillis4);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    int i3 = dfPreloadOption.nujCount;
                    if (C0X9Z.LIZIZ) {
                        return;
                    }
                    C0X9Z.LIZIZ = true;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("preloadInNuj start ");
                    sbLIZ4.append(i3);
                    C2188811AlT.LIZIZ(sbLIZ4);
                    C0X9Z.LIZIZ(i3, C202065144p.LIZ);
                }

                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("DfPreloadManager@8a8f.updateStage$1");
                    boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                    try {
                        LIZ();
                    } finally {
                    }
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    C1C7U.LIZIZ("DfPreloadManager@8a8f.updateStage$1");
                }
            }, dfPreloadOption.nujDelay);
            return;
        }
        if (i == 1) {
            if (dfPreloadOption.bootDelay < 0) {
                return;
            }
            final long jCurrentTimeMillis5 = System.currentTimeMillis();
            C0X9Z.LJ.schedule(new C0W9W() { // from class: X.0THh
                public final void LIZ() {
                    C0X9Z.LIZ.getClass();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("schedule boot at ");
                    sbLIZ3.append(System.currentTimeMillis() - jCurrentTimeMillis5);
                    sbLIZ3.append(' ');
                    sbLIZ3.append(dfPreloadOption);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    int i3 = dfPreloadOption.bootCount;
                    if (C0X9Z.LIZJ) {
                        return;
                    }
                    C0X9Z.LIZJ = true;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("preloadBootFinish start ");
                    sbLIZ4.append(i3);
                    C2188811AlT.LIZIZ(sbLIZ4);
                    C0X9Z.LIZIZ(i3, C202065144p.LIZIZ);
                }

                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("DfPreloadManager@8a8f.updateStage$2");
                    boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                    try {
                        LIZ();
                    } finally {
                    }
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    C1C7U.LIZIZ("DfPreloadManager@8a8f.updateStage$2");
                }
            }, dfPreloadOption.bootDelay);
            return;
        }
        if (i != 2 || dfPreloadOption.bgDelay < 0) {
            return;
        }
        final long jCurrentTimeMillis6 = System.currentTimeMillis();
        C0X9Z.LJ.schedule(new C0W9W() { // from class: X.0THi
            public final void LIZ() {
                C0X9Z.LIZ.getClass();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("schedule background at ");
                sbLIZ3.append(System.currentTimeMillis() - jCurrentTimeMillis6);
                sbLIZ3.append(' ');
                sbLIZ3.append(dfPreloadOption);
                C2188811AlT.LIZIZ(sbLIZ3);
                int i3 = dfPreloadOption.bgCount;
                if (C0X9Z.LIZLLL) {
                    return;
                }
                C0X9Z.LIZLLL = true;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("preloadBackground start ");
                sbLIZ4.append(i3);
                C2188811AlT.LIZIZ(sbLIZ4);
                C0X9Z.LIZIZ(i3, C202065144p.LIZJ);
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("DfPreloadManager@8a8f.updateStage$3");
                boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                try {
                    LIZ();
                } finally {
                }
                if (zLJ) {
                    C0W9U.LJFF();
                }
                C1C7U.LIZIZ("DfPreloadManager@8a8f.updateStage$3");
            }
        }, dfPreloadOption.bgDelay);
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final void LJJIJ(C1BLD c1bld) {
        ((CopyOnWriteArrayList) LJII).add(c1bld);
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.IPluginService
    public final boolean checkPluginInstalled(String str) {
        if (C08PT.LIZIZ.contains(str)) {
            return true;
        }
        return C08PT.LIZLLL().contains(C1BLV.LIZ(str));
    }
}
