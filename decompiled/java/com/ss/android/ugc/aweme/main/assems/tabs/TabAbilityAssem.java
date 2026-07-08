package com.ss.android.ugc.aweme.main.assems.tabs;

import X.AbstractC1583710rJZ;
import X.AbstractC1583720rJa;
import X.AbstractC1591090rVT;
import X.C01GW;
import X.C08TU;
import X.C08TW;
import X.C098200Yq;
import X.C0B5R;
import X.C0C8J;
import X.C0CAU;
import X.C0CXC;
import X.C0CXE;
import X.C0CXL;
import X.C0S4F;
import X.C1058550deX;
import X.C1150504el;
import X.C13LP;
import X.C15438062q;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1564470qoX;
import X.C1564630qon;
import X.C1564700qou;
import X.C1582020rGq;
import X.C1583570rJL;
import X.C1584320rKY;
import X.C1584540rKu;
import X.C1585070rLl;
import X.C1585130rLr;
import X.C1585150rLt;
import X.C1585160rLu;
import X.C1585200rLy;
import X.C1585230rM1;
import X.C1585240rM2;
import X.C1585280rM6;
import X.C1591880rWk;
import X.C1619940sG0;
import X.C189200o6;
import X.C19EG;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C2513809tA;
import X.C2514509tH;
import X.C2514709tJ;
import X.C2515709tT;
import X.C277200Ati;
import X.C286370BKh;
import X.C296200BjG;
import X.C343780Ddo;
import X.C452501pT;
import X.C687700QyG;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C799570VYd;
import X.EnumC1585090rLn;
import X.EnumC1585100rLo;
import X.InterfaceC1570590qyP;
import X.InterfaceC1570900qyu;
import X.InterfaceC1583600rJO;
import X.InterfaceC1583870rJp;
import X.InterfaceC1585180rLw;
import X.InterfaceC1585190rLx;
import X.InterfaceC1589850rTT;
import X.InterfaceC586170Myt;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import Y.ACallableS182S0300000_24;
import Y.ARunnableS32S0400000_24;
import Y.ARunnableS57S0300000_24;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountFeatureFlagService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.experiment.TabConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.spi.HomePageTabCompatService;
import com.ss.android.ugc.aweme.spi.IHomeTabStabilityService;
import com.ss.android.ugc.aweme.tabicon.ITabIconService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public class TabAbilityAssem extends BaseMainContainerAssem implements HomeTabAbility, InterfaceC586170Myt, InterfaceC1585180rLw, InterfaceC737790Swr {
    public static final Object LLJJJIL = new Object();
    public static final Object LLJJJJ = new Object();
    public static final Object LLJJJJJIL = new Object();
    public final CopyOnWriteArrayList<InterfaceC1583870rJp> LL = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<InterfaceC1583870rJp> LLILLJJLI = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<TopTabProtocol> LLILLL = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<BottomTabProtocol> LLILZ = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<InterfaceC1570590qyP> LLILZIL = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<InterfaceC1570590qyP> LLILZLL = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<InterfaceC1583600rJO> LLIZ = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<C1585150rLt> LLIZLLLIL = new CopyOnWriteArrayList<>();
    public Pair<? extends List<? extends InterfaceC1570900qyu>, ? extends List<? extends InterfaceC1570900qyu>> LLJ;
    public FutureTask<Pair<List<InterfaceC1583870rJp>, List<TopTabProtocol>>> LLJI;
    public FutureTask<Pair<List<InterfaceC1583870rJp>, List<BottomTabProtocol>>> LLJIJIL;
    public FutureTask<Pair<List<InterfaceC1570900qyu>, List<InterfaceC1570900qyu>>> LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public C19EG LLJJIJI;
    public View LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final TabAbilityAssem LLJJJ;

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{getClass().getSimpleName(), "onCreate"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate();
        C786410Ut5.LJJZZIII(C0CAU.LIZ, new Runnable() { // from class: X.087N
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TabAbilityAssem@1a05.postRegisterLoginListener$1");
                try {
                    ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(this.LL);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TabAbilityAssem@1a05.postRegisterLoginListener$1");
            }
        });
        ITabIconService iTabIconService = (ITabIconService) PluggableExtentionKt.pluggableSpi$default(ITabIconService.class, false, false, false, 14, null);
        if (iTabIconService != null) {
            iTabIconService.releaseResource();
        }
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void FX1() {
        C1619940sG0 c1619940sG0 = C1619940sG0.LL;
        for (C1585150rLt c1585150rLt : this.LLIZLLLIL) {
            if (Intrinsics.LJFF(c1585150rLt.LL, c1619940sG0)) {
                if (c1585150rLt != null) {
                    ko().LLJ.remove(c1585150rLt);
                    lo().remove(c1585150rLt);
                    return;
                }
                return;
            }
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void Lb0() {
        C1585280rM6.LIZ.LIZ().execute(new Runnable() { // from class: X.0rM5
            public static void LIZ() {
                TabConfig tabConfigLIZIZ;
                JSONObject jSONObject;
                try {
                    if (C343780Ddo.LIZIZ()) {
                        C0CXN.LIZ.getClass();
                        tabConfigLIZIZ = C0CXN.LIZJ();
                    } else {
                        tabConfigLIZIZ = C343730Ddj.LIZIZ();
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(EnumC1585300rM8.HIT_FCP_TAB_EXP.getCateGoryStr(), true);
                    jSONObject2.put(EnumC1585300rM8.USE_PRELOAD_SUCCESS.getCateGoryStr(), C1585280rM6.LJI);
                    jSONObject2.put(EnumC1585300rM8.USE_FCP_SUCCESS.getCateGoryStr(), C1585280rM6.LJ);
                    ConcurrentHashMap<String, Object> concurrentHashMap = C1585280rM6.LIZIZ;
                    if (concurrentHashMap != null) {
                        for (Map.Entry<String, Object> entry : concurrentHashMap.entrySet()) {
                            jSONObject2.put(entry.getKey(), entry.getValue());
                        }
                        jSONObject = new JSONObject();
                        jSONObject.put(EnumC1585300rM8.FCP_ORIGIN_DATA.getCateGoryStr(), tabConfigLIZIZ);
                        if (C1585280rM6.LJII) {
                            jSONObject.put(EnumC1585300rM8.TAB_DUPLICATE_LOG.getCateGoryStr(), ((StringBuffer) C1585280rM6.LJIIJJI.getValue()).toString());
                        }
                    } else {
                        jSONObject = null;
                    }
                    String str = "fcp tab result: " + jSONObject2 + ", isGroupV3: " + C343780Ddo.LIZIZ() + ", commonLogId:" + C0CXQ.LIZ() + ", fcp origin data: " + tabConfigLIZIZ;
                    if (str != null) {
                        int i = C2187451AjH.LIZ;
                        C1720106oR.LJI("fcp_tab_monitor", str);
                    }
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sb = new StringBuilder();
                    sb.append("fcp record log: ");
                    sb.append(C1585280rM6.LJIIIZ.getValue());
                    C1720106oR.LJI("fcp_tab_monitor", sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("fcp filter log: ");
                    sb2.append(C1585280rM6.LJIIJ.getValue());
                    C1720106oR.LJI("fcp_tab_monitor", sb2.toString());
                    C793770VBv.LJII("fcp_tab_monitor", jSONObject2, null, jSONObject);
                    ConcurrentHashMap<String, Object> concurrentHashMap2 = C1585280rM6.LIZIZ;
                    if (concurrentHashMap2 != null) {
                        concurrentHashMap2.clear();
                    }
                    C1585280rM6.LIZJ = true;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("monitor exception: ");
                    sbLIZ.append(e.getMessage());
                    C1720106oR.LJI("fcp_tab_monitor", C2188811AlT.LIZIZ(sbLIZ));
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TabProcessMonitor@51ee.monitorEvent$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TabProcessMonitor@51ee.monitorEvent$1");
            }
        });
        C0C8J.LIZ.getClass();
        if (C0C8J.LIZJ || !C343780Ddo.LIZIZ()) {
            return;
        }
        C0CXL.LIZ.getClass();
        if (C0CXL.LIZIZ()) {
            return;
        }
        C0CXE.LIZ.getClass();
        if (C0CXE.LIZ()) {
            return;
        }
        C0CXC.LIZ.getClass();
        if (C0CXC.LIZIZ()) {
            return;
        }
        C0C8J.LIZJ = true;
        C786410Ut5.LJLIIL(1000L, C799570VYd.LIZIZ(), new Runnable() { // from class: X.0C8K
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TabEnableDiffMonitor@4e18.tryToReportLog$1");
                try {
                    try {
                        C0C8J.LIZ.getClass();
                        C0C8J.LIZ();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C805380Via.LIZJ(e, "report v3 diff error");
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TabEnableDiffMonitor@4e18.tryToReportLog$1");
            }
        });
    }

    public final void bo() {
        Pair<List<InterfaceC1583870rJp>, List<BottomTabProtocol>> pairLIZIZ;
        FutureTask<Pair<List<InterfaceC1583870rJp>, List<BottomTabProtocol>>> futureTask;
        Pair<List<InterfaceC1583870rJp>, List<BottomTabProtocol>> pairLIZIZ2;
        if (((Number) C08TW.LIZ.getValue()).intValue() == 2) {
            m263do();
        } else {
            synchronized (LLJJJJ) {
                try {
                    if (!this.LLJJI) {
                        C1582020rGq.LIZJ("scene_get_bottom_tab");
                        if (C2515709tT.LIZ) {
                            FutureTask<Pair<List<InterfaceC1583870rJp>, List<BottomTabProtocol>>> futureTask2 = this.LLJIJIL;
                            if (futureTask2 == null || !futureTask2.isDone()) {
                                C1585280rM6.LJI = false;
                                try {
                                    FutureTask<Pair<List<InterfaceC1583870rJp>, List<BottomTabProtocol>>> futureTask3 = this.LLJIJIL;
                                    C189200o6.m2constructorimpl(futureTask3 != null ? Boolean.valueOf(futureTask3.cancel(C2513809tA.LIZ)) : null);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C189200o6.m2constructorimpl(new C098200Yq(th));
                                }
                                C1585230rM1 c1585230rM1Mo = mo();
                                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                                if (c19egLIZ == null) {
                                    "Required value was null.".toString();
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                pairLIZIZ2 = c1585230rM1Mo.LIZIZ(c19egLIZ, C1558520qew.LJIIL(this), 2);
                            } else {
                                try {
                                    FutureTask<Pair<List<InterfaceC1583870rJp>, List<BottomTabProtocol>>> futureTask4 = this.LLJIJIL;
                                    if (futureTask4 != null) {
                                        pairLIZIZ2 = futureTask4.get();
                                    }
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                }
                            }
                            if (pairLIZIZ2 != null) {
                                oo(EnumC1585090rLn.COLD_LAUNCH, pairLIZIZ2.getFirst(), pairLIZIZ2.getSecond());
                            }
                        } else {
                            try {
                                futureTask = this.LLJIJIL;
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                                C1585280rM6.LJI = false;
                                try {
                                    FutureTask<Pair<List<InterfaceC1583870rJp>, List<BottomTabProtocol>>> futureTask5 = this.LLJIJIL;
                                    C189200o6.m2constructorimpl(futureTask5 != null ? Boolean.valueOf(futureTask5.cancel(true)) : null);
                                } catch (Throwable th4) {
                                    TryCatchGuardChecker.doCheck(th4);
                                    C189200o6.m2constructorimpl(new C098200Yq(th4));
                                }
                                C1585230rM1 c1585230rM1Mo2 = mo();
                                C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
                                if (c19egLIZ2 == null) {
                                    "Required value was null.".toString();
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                pairLIZIZ = c1585230rM1Mo2.LIZIZ(c19egLIZ2, C1558520qew.LJIIL(this), 2);
                            }
                            if (futureTask != null) {
                                pairLIZIZ = futureTask.get(500L, TimeUnit.MILLISECONDS);
                                if (pairLIZIZ != null) {
                                    oo(EnumC1585090rLn.COLD_LAUNCH, pairLIZIZ.getFirst(), pairLIZIZ.getSecond());
                                }
                            }
                        }
                        this.LLJJI = true;
                        C1582020rGq.LIZ("scene_get_bottom_tab");
                    }
                } catch (Throwable th5) {
                    TryCatchGuardChecker.doCheck(th5);
                    throw th5;
                }
            }
        }
        C2344809Gs.LJFF("saf-init", "ensureBottomTask");
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m263do() {
        Pair<List<InterfaceC1583870rJp>, List<BottomTabProtocol>> pairLIZIZ;
        synchronized (LLJJJJ) {
            try {
                if (this.LLJJI) {
                    return;
                }
                C1582020rGq.LIZJ("scene_get_bottom_tab");
                FutureTask<Pair<List<InterfaceC1583870rJp>, List<BottomTabProtocol>>> futureTask = this.LLJIJIL;
                if (futureTask != null && futureTask.isDone()) {
                    C2344809Gs.LJ("get bottom tabs from preload");
                    FutureTask<Pair<List<InterfaceC1583870rJp>, List<BottomTabProtocol>>> futureTask2 = this.LLJIJIL;
                    if (futureTask2 != null) {
                        pairLIZIZ = futureTask2.get();
                    }
                    this.LLJJI = true;
                    C1582020rGq.LIZ("scene_get_bottom_tab");
                }
                C1585280rM6.LJI = false;
                C2344809Gs.LJ("bottom tabs preload is not ready, cancel and rerun it");
                try {
                    FutureTask<Pair<List<InterfaceC1583870rJp>, List<BottomTabProtocol>>> futureTask3 = this.LLJIJIL;
                    C189200o6.m2constructorimpl(futureTask3 != null ? Boolean.valueOf(futureTask3.cancel(true)) : null);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                C19EG c19eg = this.LLJJIJI;
                C1585230rM1 c1585230rM1Mo = mo();
                if (c19eg == null) {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                pairLIZIZ = c1585230rM1Mo.LIZIZ(c19eg, C1558360qeg.LJI(c19eg, null), 2);
                if (pairLIZIZ != null) {
                    oo(EnumC1585090rLn.COLD_LAUNCH, pairLIZIZ.getFirst(), pairLIZIZ.getSecond());
                }
                this.LLJJI = true;
                C1582020rGq.LIZ("scene_get_bottom_tab");
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public final void fo() {
        Pair<List<InterfaceC1583870rJp>, List<TopTabProtocol>> pairLIZLLL;
        FutureTask<Pair<List<InterfaceC1583870rJp>, List<TopTabProtocol>>> futureTask;
        Pair<List<InterfaceC1583870rJp>, List<TopTabProtocol>> pairLIZLLL2;
        if (((Number) C08TW.LIZ.getValue()).intValue() == 2) {
            ho();
            return;
        }
        synchronized (LLJJJIL) {
            try {
                if (this.LLJJ) {
                    return;
                }
                C1582020rGq.LIZJ("scene_get_top_tab");
                if (C2514709tJ.LIZ) {
                    FutureTask<Pair<List<InterfaceC1583870rJp>, List<TopTabProtocol>>> futureTask2 = this.LLJI;
                    if (futureTask2 == null || !futureTask2.isDone()) {
                        C1585280rM6.LJI = false;
                        try {
                            FutureTask<Pair<List<InterfaceC1583870rJp>, List<TopTabProtocol>>> futureTask3 = this.LLJI;
                            C189200o6.m2constructorimpl(futureTask3 != null ? Boolean.valueOf(futureTask3.cancel(C2513809tA.LIZ)) : null);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                        C1585230rM1 c1585230rM1Mo = mo();
                        C19EG c19egLIZ = C724240Sb0.LIZ(this);
                        if (c19egLIZ == null) {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        C1558520qew.LJIIL(this);
                        pairLIZLLL2 = c1585230rM1Mo.LIZLLL(c19egLIZ, 2);
                    } else {
                        try {
                            FutureTask<Pair<List<InterfaceC1583870rJp>, List<TopTabProtocol>>> futureTask4 = this.LLJI;
                            if (futureTask4 != null) {
                                pairLIZLLL2 = futureTask4.get();
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    }
                    if (pairLIZLLL2 != null) {
                        so(this, EnumC1585090rLn.COLD_LAUNCH, pairLIZLLL2.getFirst(), pairLIZLLL2.getSecond());
                    }
                } else {
                    try {
                        futureTask = this.LLJI;
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        C1585280rM6.LJI = false;
                        try {
                            FutureTask<Pair<List<InterfaceC1583870rJp>, List<TopTabProtocol>>> futureTask5 = this.LLJI;
                            C189200o6.m2constructorimpl(futureTask5 != null ? Boolean.valueOf(futureTask5.cancel(true)) : null);
                        } catch (Throwable th4) {
                            TryCatchGuardChecker.doCheck(th4);
                            C189200o6.m2constructorimpl(new C098200Yq(th4));
                        }
                        C1585230rM1 c1585230rM1Mo2 = mo();
                        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
                        if (c19egLIZ2 == null) {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        C1558520qew.LJIIL(this);
                        pairLIZLLL = c1585230rM1Mo2.LIZLLL(c19egLIZ2, 2);
                    }
                    if (futureTask != null) {
                        pairLIZLLL = futureTask.get(500L, TimeUnit.MILLISECONDS);
                        if (pairLIZLLL != null) {
                            so(this, EnumC1585090rLn.COLD_LAUNCH, pairLIZLLL.getFirst(), pairLIZLLL.getSecond());
                        }
                    }
                }
                this.LLJJ = true;
                C1582020rGq.LIZ("scene_get_top_tab");
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
                throw th5;
            }
        }
    }

    public final void ho() {
        Pair<List<InterfaceC1583870rJp>, List<TopTabProtocol>> pairLIZLLL;
        synchronized (LLJJJIL) {
            try {
                if (this.LLJJ) {
                    return;
                }
                C1582020rGq.LIZJ("scene_get_top_tab");
                FutureTask<Pair<List<InterfaceC1583870rJp>, List<TopTabProtocol>>> futureTask = this.LLJI;
                if (futureTask == null || !futureTask.isDone()) {
                    C1585280rM6.LJI = false;
                    C2344809Gs.LJ("top tabs preload is not ready, cancel and rerun it");
                    try {
                        FutureTask<Pair<List<InterfaceC1583870rJp>, List<TopTabProtocol>>> futureTask2 = this.LLJI;
                        C189200o6.m2constructorimpl(futureTask2 != null ? Boolean.valueOf(futureTask2.cancel(true)) : null);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                    C19EG c19eg = this.LLJJIJI;
                    C1585230rM1 c1585230rM1Mo = mo();
                    if (c19eg == null) {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    C1558360qeg.LJI(c19eg, null);
                    pairLIZLLL = c1585230rM1Mo.LIZLLL(c19eg, 2);
                } else {
                    C2344809Gs.LJ("get top tabs from preload");
                    pairLIZLLL = futureTask.get();
                }
                if (pairLIZLLL != null) {
                    so(this, EnumC1585090rLn.COLD_LAUNCH, pairLIZLLL.getFirst(), pairLIZLLL.getSecond());
                }
                C1582020rGq.LIZ("scene_get_top_tab");
                this.LLJJ = true;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public final Hox ko() {
        return (Hox) this.LLJJIJIL.getValue();
    }

    public final CopyOnWriteArrayList<C1585150rLt> lo() {
        return (CopyOnWriteArrayList) this.LLJILLL.getValue();
    }

    public final C1585230rM1 mo() {
        return (C1585230rM1) this.LLJILJILJ.getValue();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final Pair<List<InterfaceC1570900qyu>, List<InterfaceC1570900qyu>> pI() {
        Pair<List<InterfaceC1570900qyu>, List<InterfaceC1570900qyu>> pairLIZJ;
        FutureTask<Pair<List<InterfaceC1570900qyu>, List<InterfaceC1570900qyu>>> futureTask;
        Pair<List<InterfaceC1570900qyu>, List<InterfaceC1570900qyu>> pairLIZJ2;
        synchronized (LLJJJJJIL) {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
            if (!this.LLJJIII) {
                C1582020rGq.LIZJ("scene_get_top_icon");
                if (!C2514509tH.LIZ) {
                    try {
                        futureTask = this.LLJILJIL;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C1585280rM6.LJI = false;
                        try {
                            FutureTask<Pair<List<InterfaceC1570900qyu>, List<InterfaceC1570900qyu>>> futureTask2 = this.LLJILJIL;
                            C189200o6.m2constructorimpl(futureTask2 != null ? Boolean.valueOf(futureTask2.cancel(true)) : null);
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            C189200o6.m2constructorimpl(new C098200Yq(th3));
                        }
                        pairLIZJ = mo().LIZJ(2);
                    }
                    if (futureTask != null) {
                        pairLIZJ = futureTask.get(500L, TimeUnit.MILLISECONDS);
                        if (pairLIZJ != null) {
                            this.LLJ = pairLIZJ;
                            C1585070rLl.LIZ.getClass();
                            C1585070rLl.LIZLLL = pairLIZJ;
                        }
                    }
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
                FutureTask<Pair<List<InterfaceC1570900qyu>, List<InterfaceC1570900qyu>>> futureTask3 = this.LLJILJIL;
                if (futureTask3 != null && futureTask3.isDone()) {
                    try {
                        FutureTask<Pair<List<InterfaceC1570900qyu>, List<InterfaceC1570900qyu>>> futureTask4 = this.LLJILJIL;
                        if (futureTask4 != null) {
                            pairLIZJ2 = futureTask4.get();
                        }
                    } catch (Throwable th4) {
                        TryCatchGuardChecker.doCheck(th4);
                    }
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
                C1585280rM6.LJI = false;
                try {
                    FutureTask<Pair<List<InterfaceC1570900qyu>, List<InterfaceC1570900qyu>>> futureTask5 = this.LLJILJIL;
                    C189200o6.m2constructorimpl(futureTask5 != null ? Boolean.valueOf(futureTask5.cancel(C2513809tA.LIZ)) : null);
                } catch (Throwable th5) {
                    TryCatchGuardChecker.doCheck(th5);
                    C189200o6.m2constructorimpl(new C098200Yq(th5));
                }
                pairLIZJ2 = mo().LIZJ(2);
                if (pairLIZJ2 != null) {
                    this.LLJ = pairLIZJ2;
                    C1585070rLl.LIZ.getClass();
                    C1585070rLl.LIZLLL = pairLIZJ2;
                }
                this.LLJJIII = true;
                C1582020rGq.LIZ("scene_get_top_icon");
            }
        }
        return this.LLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final boolean qM1() {
        if (this.LL.isEmpty()) {
            return false;
        }
        return !Intrinsics.LJFF(((InterfaceC1583870rJp) C13LP.LJJLIIIJL(this.LL)) != null ? r0.tag() : null, "For You");
    }

    public TabAbilityAssem() {
        new CopyOnWriteArrayList();
        this.LLJILJILJ = C452501pT.LIZIZ(new C1585130rLr());
        this.LLJILLL = C452501pT.LIZIZ(new C1564700qou());
        this.LLJJIJIL = C452501pT.LIZIZ(new C1564630qon(this));
        this.LLJJJ = this;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final String Ct0() {
        return ko().DQ2("HOME", false);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final Hox HC0() {
        return ko();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final C0S4F QF() {
        return ((C1585240rM2) mo().LJIIIIZZ().LIZJ.getValue()).LJIIJJI;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final List<BottomTabProtocol> Sz() {
        bo();
        if (this.LLILZ.isEmpty()) {
            HomePageTabCompatService homePageTabCompatService = C1585280rM6.LIZ;
            CopyOnWriteArrayList<TopTabProtocol> copyOnWriteArrayList = this.LLILLL;
            CopyOnWriteArrayList<BottomTabProtocol> copyOnWriteArrayList2 = this.LLILZ;
            Pair<? extends List<? extends InterfaceC1570900qyu>, ? extends List<? extends InterfaceC1570900qyu>> pair = this.LLJ;
            EnumC1585100rLo enumC1585100rLo = EnumC1585100rLo.BOTTOM_TAB;
            if (!C1585280rM6.LIZLLL) {
                C1585280rM6.LIZ.LIZ().execute(new ARunnableS32S0400000_24(enumC1585100rLo, copyOnWriteArrayList, copyOnWriteArrayList2, pair, 6));
            }
        }
        return this.LLILZ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final List<InterfaceC1583870rJp> Tz() {
        bo();
        return this.LLILLJJLI;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final InterfaceC1583870rJp UB() {
        InterfaceC1583870rJp next;
        fo();
        Iterator<InterfaceC1583870rJp> it2 = this.LLILLJJLI.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (TextUtils.equals("SHOP_MALL", next.tag())) {
                break;
            }
        }
        return next;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final String Zj2() {
        return ko().DQ2("page_feed", false);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final List<TopTabProtocol> b9() {
        fo();
        if (this.LLILLL.isEmpty()) {
            HomePageTabCompatService homePageTabCompatService = C1585280rM6.LIZ;
            CopyOnWriteArrayList<TopTabProtocol> copyOnWriteArrayList = this.LLILLL;
            CopyOnWriteArrayList<BottomTabProtocol> copyOnWriteArrayList2 = this.LLILZ;
            Pair<? extends List<? extends InterfaceC1570900qyu>, ? extends List<? extends InterfaceC1570900qyu>> pair = this.LLJ;
            EnumC1585100rLo enumC1585100rLo = EnumC1585100rLo.TOP_TAB;
            if (!C1585280rM6.LIZLLL) {
                C1585280rM6.LIZ.LIZ().execute(new ARunnableS32S0400000_24(enumC1585100rLo, copyOnWriteArrayList, copyOnWriteArrayList2, pair, 6));
            }
        }
        return this.LLILLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final Fragment h62() {
        Hox hoxKo = ko();
        return hoxKo.Ki(hoxKo.DQ2("page_feed", false));
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final List l32() {
        fo();
        return this.LL;
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJI(this);
        if (C1564470qoX.LIZ()) {
            return;
        }
        C1585070rLl.LIZ.getClass();
        C1585070rLl.LIZIZ.clear();
        C1585070rLl.LIZJ.clear();
        C1585070rLl.LIZLLL = null;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final int qr2() {
        Hox hoxKo = ko();
        return hoxKo.FQ2(hoxKo.DQ2("page_feed", false));
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final Fragment tK0() {
        Hox hoxKo = ko();
        return hoxKo.Ki(hoxKo.DQ2("HOME", false));
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final List<String> vI0() {
        return mo().LIZ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final boolean zd1() {
        return UB() != null;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final View w31() {
        return this.LLJJIJIIJIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void Ci2(InterfaceC1583600rJO interfaceC1583600rJO) {
        this.LLIZ.remove(interfaceC1583600rJO);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void GM0(InterfaceC1570590qyP interfaceC1570590qyP) {
        this.LLILZIL.addIfAbsent(interfaceC1570590qyP);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void Gx0(EnumC1585090rLn enumC1585090rLn) {
        Pair<List<InterfaceC1583870rJp>, List<BottomTabProtocol>> pairLIZIZ;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (pairLIZIZ = mo().LIZIZ(c19egLIZ, C1558520qew.LJIIL(this), 3)) != null) {
            oo(enumC1585090rLn, pairLIZIZ.getFirst(), pairLIZIZ.getSecond());
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void Ik0(InterfaceC1585190rLx interfaceC1585190rLx) {
        for (C1585150rLt c1585150rLt : lo()) {
            if (Intrinsics.LJFF(c1585150rLt.LL, interfaceC1585190rLx)) {
                if (c1585150rLt != null) {
                    ((CopyOnWriteArrayList) ((AbstractC1583710rJZ) ko().GQ2("page_feed")).LLJ.getValue()).remove(c1585150rLt);
                    lo().remove(c1585150rLt);
                    return;
                }
                return;
            }
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final Fragment Ki(String str) {
        return ko().Ki(str);
    }

    @Override // X.InterfaceC1585180rLw
    public final void Sf(final C19EG c19eg) {
        this.LLJJIJI = c19eg;
        final InterfaceC665370Q7z interfaceC665370Q7zLJI = C1558360qeg.LJI(c19eg, null);
        if (C296200BjG.LIZ()) {
            pQ(interfaceC665370Q7zLJI);
        } else {
            C1558520qew.LJII(interfaceC665370Q7zLJI, this, HomeTabAbility.class, null, null);
        }
        this.LLJI = new FutureTask<>(new Callable() { // from class: X.0rLp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("TabAbilityAssem@1a05.commitPreLoadTask$1");
                C1582020rGq.LIZJ("scene_collect_top_tab");
                Pair pairLIZLLL = this.LL.mo().LIZLLL(c19eg, 1);
                C1582020rGq.LIZ("scene_collect_top_tab");
                C1582020rGq.LIZIZ("stage_fcp_calculate");
                C1C7U.LIZIZ("TabAbilityAssem@1a05.commitPreLoadTask$1");
                return pairLIZLLL;
            }
        });
        this.LLJIJIL = new FutureTask<>(new ACallableS182S0300000_24(this, c19eg, interfaceC665370Q7zLJI, 1));
        this.LLJILJIL = new FutureTask<>(new Callable() { // from class: X.0rLq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("TabAbilityAssem@1a05.commitPreLoadTask$3");
                C1582020rGq.LIZJ("scene_collect_top_icon");
                Pair<List<InterfaceC1570900qyu>, List<InterfaceC1570900qyu>> pairLIZJ = this.LL.mo().LIZJ(1);
                C1582020rGq.LIZ("scene_collect_top_icon");
                C1582020rGq.LIZIZ("stage_fcp_calculate");
                C1C7U.LIZIZ("TabAbilityAssem@1a05.commitPreLoadTask$3");
                return pairLIZJ;
            }
        });
        C08TU.LIZ().execute(this.LLJI);
        C08TU.LIZ().execute(this.LLJIJIL);
        C08TU.LIZ().execute(this.LLJILJIL);
        C1582020rGq.LIZIZ("stage_cold_boot");
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void Ss2(InterfaceC1585190rLx interfaceC1585190rLx) {
        Hox hoxKo = ko();
        C1585150rLt c1585150rLt = new C1585150rLt(interfaceC1585190rLx);
        this.LLIZLLLIL.add(c1585150rLt);
        hoxKo.LLJ.addIfAbsent(c1585150rLt);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void UC1(InterfaceC1585190rLx interfaceC1585190rLx) {
        AbstractC1583720rJa abstractC1583720rJaGQ2 = ko().GQ2("page_feed");
        if (abstractC1583720rJaGQ2 == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addBottomTabChangeObserver: ");
            sbLIZ.append(ko());
            C2344809Gs.LJFF("saf-init", C2188811AlT.LIZIZ(sbLIZ));
        }
        C1585150rLt c1585150rLt = new C1585150rLt(interfaceC1585190rLx);
        lo().add(c1585150rLt);
        ((AbstractC1583710rJZ) abstractC1583720rJaGQ2).LJJI(c1585150rLt);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void UF0(InterfaceC1583600rJO interfaceC1583600rJO) {
        this.LLIZ.addIfAbsent(interfaceC1583600rJO);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final String Vn0(boolean z) {
        return ko().DQ2("HOME", z);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void YO2(C1583570rJL c1583570rJL) {
        this.LLILZLL.remove(c1583570rJL);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void Yp0(EnumC1585090rLn enumC1585090rLn) {
        IHomeTabStabilityService iHomeTabStabilityService;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (iHomeTabStabilityService = (IHomeTabStabilityService) C1585160rLu.LIZ.getValue()) != null) {
            iHomeTabStabilityService.LIZIZ(c19egLIZ, enumC1585090rLn);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void aM2(EnumC1585090rLn enumC1585090rLn) {
        IHomeTabStabilityService iHomeTabStabilityService;
        List<? extends InterfaceC1570900qyu> first;
        List<? extends InterfaceC1570900qyu> second;
        Pair<List<InterfaceC1570900qyu>, List<InterfaceC1570900qyu>> pairLIZJ = mo().LIZJ(3);
        if (pairLIZJ != null) {
            Pair<? extends List<? extends InterfaceC1570900qyu>, ? extends List<? extends InterfaceC1570900qyu>> pair = this.LLJ;
            if (pair != null && (first = pair.getFirst()) != null && first.size() == pairLIZJ.getFirst().size() && (second = pair.getSecond()) != null && second.size() == pairLIZJ.getSecond().size()) {
                int size = pairLIZJ.getFirst().size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        if (!Intrinsics.LJFF(((InterfaceC1570900qyu) ListProtector.get(pair.getFirst(), i)).getTag(), ((InterfaceC1570900qyu) ListProtector.get(pairLIZJ.getFirst(), i)).getTag())) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        int size2 = pairLIZJ.getSecond().size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            if (Intrinsics.LJFF(((InterfaceC1570900qyu) ListProtector.get(pair.getSecond(), i2)).getTag(), ((InterfaceC1570900qyu) ListProtector.get(pairLIZJ.getSecond(), i2)).getTag())) {
                            }
                        }
                        return;
                    }
                }
            }
            this.LLJ = pairLIZJ;
            C1585070rLl.LIZ.getClass();
            C1585070rLl.LIZLLL = pairLIZJ;
            Iterator<InterfaceC1583600rJO> it2 = this.LLIZ.iterator();
            while (it2.hasNext()) {
                it2.next().Ja();
            }
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (this.LLJ != null && c19egLIZ != null && (iHomeTabStabilityService = (IHomeTabStabilityService) PluggableExtentionKt.pluggableSpi$default(IHomeTabStabilityService.class, false, false, false, 14, null)) != null) {
                iHomeTabStabilityService.LJ(c19egLIZ, enumC1585090rLn, pairLIZJ);
            }
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void ao(InterfaceC1585190rLx interfaceC1585190rLx) {
        AbstractC1583710rJZ abstractC1583710rJZ;
        AbstractC1583720rJa abstractC1583720rJaGQ2 = ko().GQ2("HOME");
        if ((abstractC1583720rJaGQ2 instanceof AbstractC1583710rJZ) && (abstractC1583710rJZ = (AbstractC1583710rJZ) abstractC1583720rJaGQ2) != null) {
            C1585150rLt c1585150rLt = new C1585150rLt(interfaceC1585190rLx);
            lo().add(c1585150rLt);
            abstractC1583710rJZ.LJJI(c1585150rLt);
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MainActivityScope.class}).unbindAbility(this.LLJJJ, HomeTabAbility.class);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final boolean cZ(String str) {
        Pair<List<InterfaceC1570900qyu>, List<InterfaceC1570900qyu>> pairPI = pI();
        boolean z = false;
        if (pairPI != null) {
            List<InterfaceC1570900qyu> first = pairPI.getFirst();
            if (first != null) {
                Iterator<InterfaceC1570900qyu> it2 = first.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(str, it2.next().getTag())) {
                        z = true;
                    }
                }
            }
            List<InterfaceC1570900qyu> second = pairPI.getSecond();
            if (second != null) {
                Iterator<InterfaceC1570900qyu> it3 = second.iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.LJFF(str, it3.next().getTag())) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final boolean dR(String str) {
        if (vR1(str) != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void eF1(InterfaceC1570590qyP interfaceC1570590qyP) {
        this.LLILZLL.addIfAbsent(interfaceC1570590qyP);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final boolean ft0(String str) {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return false;
        }
        return C1058550deX.LIZIZ(c19egLIZ, str);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void g62(EnumC1585090rLn enumC1585090rLn) {
        C01GW c01gw = C277200Ati.LIZ;
        boolean z = true;
        if (((Number) c01gw.getValue()).intValue() != 0 && ((Number) c01gw.getValue()).intValue() != 1) {
            z = false;
        }
        int i = 3;
        if (z) {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null) {
                C1585070rLl.LIZ.getClass();
                if (Intrinsics.LJFF(C1585070rLl.LJI, Boolean.TRUE)) {
                    mo().LJFF = null;
                    i = 2;
                }
                C1585230rM1 c1585230rM1Mo = mo();
                C1558520qew.LJIIL(this);
                Pair pairLIZLLL = c1585230rM1Mo.LIZLLL(c19egLIZ, i);
                if (pairLIZLLL != null) {
                    if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                        C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS57S0300000_24(this, enumC1585090rLn, pairLIZLLL, 19));
                        return;
                    } else {
                        so(this, enumC1585090rLn, (List) pairLIZLLL.getFirst(), (List) pairLIZLLL.getSecond());
                        return;
                    }
                }
                return;
            }
            return;
        }
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if (c19egLIZ2 == null) {
            return;
        }
        C1585230rM1 c1585230rM1Mo2 = mo();
        C1558520qew.LJIIL(this);
        Pair pairLIZLLL2 = c1585230rM1Mo2.LIZLLL(c19egLIZ2, 3);
        if (pairLIZLLL2 == null) {
            return;
        }
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS57S0300000_24(this, enumC1585090rLn, pairLIZLLL2, 20));
        } else {
            so(this, enumC1585090rLn, (List) pairLIZLLL2.getFirst(), (List) pairLIZLLL2.getSecond());
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final AbstractC1591090rVT hQ1(C19EG c19eg) {
        return C1591880rWk.LIZIZ.LJIILL(c19eg).y01();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void nJ1(InterfaceC1570590qyP interfaceC1570590qyP) {
        this.LLILZIL.remove(interfaceC1570590qyP);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MainActivityScope.class}).bindAbility(this.LLJJJ, HomeTabAbility.class);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final String pz(Fragment fragment) {
        if (fragment == null) {
            return null;
        }
        for (TopTabProtocol topTabProtocol : this.LLILLL) {
            if (topTabProtocol.LLJIJIL().isInstance(fragment)) {
                return topTabProtocol.getTag();
            }
        }
        for (BottomTabProtocol bottomTabProtocol : this.LLILZ) {
            Class<? extends Fragment> clsLLJIJIL = bottomTabProtocol.LLJIJIL();
            if (clsLLJIJIL != null && clsLLJIJIL.isInstance(fragment)) {
                return bottomTabProtocol.getTag();
            }
        }
        return null;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void qP1(EnumC1585090rLn enumC1585090rLn) {
        ((LinkedHashMap) C1585280rM6.LJIIIIZZ).clear();
        boolean z = true;
        C1585280rM6.LJ = true;
        C1585280rM6.LJFF = null;
        C1585280rM6.LJI = true;
        C1585280rM6.LJII = false;
        C1585230rM1 c1585230rM1Mo = mo();
        c1585230rM1Mo.LIZLLL.setValue(c1585230rM1Mo, C1585230rM1.LJII[0], Boolean.valueOf(c1585230rM1Mo.LJIIJJI()));
        c1585230rM1Mo.LJFF = null;
        if (!c1585230rM1Mo.LJ(true) && !c1585230rM1Mo.LIZ() && !c1585230rM1Mo.LJIIL()) {
            z = false;
        }
        c1585230rM1Mo.LJFF = Boolean.valueOf(z);
        Gx0(enumC1585090rLn);
        aM2(enumC1585090rLn);
        g62(enumC1585090rLn);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void tx0(InterfaceC1585190rLx interfaceC1585190rLx) {
        AbstractC1583710rJZ abstractC1583710rJZ;
        for (C1585150rLt c1585150rLt : lo()) {
            if (Intrinsics.LJFF(c1585150rLt.LL, interfaceC1585190rLx)) {
                if (c1585150rLt != null) {
                    AbstractC1583720rJa abstractC1583720rJaGQ2 = ko().GQ2("HOME");
                    if ((abstractC1583720rJaGQ2 instanceof AbstractC1583710rJZ) && (abstractC1583710rJZ = (AbstractC1583710rJZ) abstractC1583720rJaGQ2) != null) {
                        ((CopyOnWriteArrayList) abstractC1583710rJZ.LLJ.getValue()).remove(c1585150rLt);
                    }
                    lo().remove(c1585150rLt);
                    return;
                }
                return;
            }
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final <T> Fragment ty1(Class<T> cls) {
        Hox hoxKo = ko();
        String strZj2 = Zj2();
        Fragment fragmentKi = hoxKo.Ki(strZj2);
        while (!cls.isInstance(fragmentKi) && strZj2.length() != 0) {
            strZj2 = hoxKo.DQ2(strZj2, false);
            fragmentKi = hoxKo.Ki(strZj2);
        }
        if (!cls.isInstance(fragmentKi)) {
            return null;
        }
        return fragmentKi;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final InterfaceC1583870rJp vR1(String str) {
        InterfaceC1583870rJp next;
        fo();
        Iterator<InterfaceC1583870rJp> it2 = this.LL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (TextUtils.equals(str, next.tag())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void vz1(View view) {
        this.LLJJIJIIJIL = view;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final boolean wd0(String str) {
        C1585200rLy c1585200rLyLJIIIZ = mo().LJIIIZ();
        c1585200rLyLJIIIZ.LJFF();
        if (C286370BKh.LIZ()) {
            return c1585200rLyLJIIIZ.LIZIZ().containsKey(str);
        }
        return ((ConcurrentHashMap) c1585200rLyLJIIIZ.LIZLLL.getValue()).containsKey(str);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
    public final void fw0(Bundle bundle, String str) {
        ko().TQ2(bundle, str, false);
    }

    public final void oo(EnumC1585090rLn enumC1585090rLn, List<? extends InterfaceC1583870rJp> list, List<? extends BottomTabProtocol> list2) {
        IHomeTabStabilityService iHomeTabStabilityService;
        Objects.toString(enumC1585090rLn);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<? extends InterfaceC1583870rJp> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().tag());
        }
        if (!Intrinsics.LJFF(this.LLILLJJLI, list)) {
            ArrayList arrayList2 = new ArrayList(this.LLILLJJLI);
            this.LLILLJJLI.clear();
            this.LLILLJJLI.addAll(list);
            this.LLILZ.clear();
            this.LLILZ.addAll(list2);
            C1584320rKY c1584320rKY = C1584320rKY.LIZ;
            CopyOnWriteArrayList<BottomTabProtocol> copyOnWriteArrayList = this.LLILZ;
            c1584320rKY.getClass();
            C1584320rKY.LIZIZ = copyOnWriteArrayList;
            if (!arrayList2.isEmpty()) {
                Objects.toString(enumC1585090rLn);
                CopyOnWriteArrayList<InterfaceC1583870rJp> copyOnWriteArrayList2 = this.LLILLJJLI;
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(copyOnWriteArrayList2, 10));
                Iterator<InterfaceC1583870rJp> it3 = copyOnWriteArrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(it3.next().tag());
                }
                arrayList3.toString();
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<? extends InterfaceC1583870rJp> it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(it4.next().tag());
                }
                ArrayList arrayList5 = new ArrayList(arrayList2);
                ArrayList arrayList6 = new ArrayList(this.LLILLJJLI);
                Iterator<InterfaceC1570590qyP> it5 = this.LLILZLL.iterator();
                while (it5.hasNext()) {
                    it5.next().x5(arrayList5, arrayList6);
                }
            }
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null && (iHomeTabStabilityService = (IHomeTabStabilityService) PluggableExtentionKt.pluggableSpi$default(IHomeTabStabilityService.class, false, false, false, 14, null)) != null) {
                iHomeTabStabilityService.LIZLLL(c19egLIZ, enumC1585090rLn, arrayList2, this.LL);
            }
            C1585070rLl.LIZ.getClass();
            CopyOnWriteArrayList<InterfaceC1583870rJp> copyOnWriteArrayList3 = C1585070rLl.LIZJ;
            copyOnWriteArrayList3.clear();
            copyOnWriteArrayList3.addAll(list);
            if (enumC1585090rLn == EnumC1585090rLn.COLD_LAUNCH && C1584540rKu.LIZIZ()) {
                Iterator<BottomTabProtocol> it6 = this.LLILZ.iterator();
                while (it6.hasNext()) {
                    InterfaceC1589850rTT interfaceC1589850rTTLJ = it6.next().LJ();
                    if (interfaceC1589850rTTLJ != null) {
                        interfaceC1589850rTTLJ.LJ();
                    }
                }
            }
        }
    }

    public static void so(TabAbilityAssem tabAbilityAssem, EnumC1585090rLn enumC1585090rLn, List list, List list2) {
        IHomeTabStabilityService iHomeTabStabilityService;
        tabAbilityAssem.getClass();
        Objects.toString(enumC1585090rLn);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((InterfaceC1583870rJp) it2.next()).tag());
        }
        if (!Intrinsics.LJFF(tabAbilityAssem.LL, list)) {
            ArrayList arrayList2 = new ArrayList(tabAbilityAssem.LL);
            tabAbilityAssem.LL.clear();
            tabAbilityAssem.LL.addAll(list);
            C1584320rKY c1584320rKY = C1584320rKY.LIZ;
            WeakReference<List<InterfaceC1583870rJp>> weakReference = new WeakReference<>(tabAbilityAssem.LL);
            c1584320rKY.getClass();
            C1584320rKY.LIZJ = weakReference;
            tabAbilityAssem.LLILLL.clear();
            tabAbilityAssem.LLILLL.addAll(list2);
            if (!arrayList2.isEmpty()) {
                Objects.toString(enumC1585090rLn);
                CopyOnWriteArrayList<InterfaceC1583870rJp> copyOnWriteArrayList = tabAbilityAssem.LL;
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(copyOnWriteArrayList, 10));
                Iterator<InterfaceC1583870rJp> it3 = copyOnWriteArrayList.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(it3.next().tag());
                }
                arrayList3.toString();
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(((InterfaceC1583870rJp) it4.next()).tag());
                }
                ArrayList arrayList5 = new ArrayList(arrayList2);
                ArrayList arrayList6 = new ArrayList(tabAbilityAssem.LL);
                Iterator<InterfaceC1570590qyP> it5 = tabAbilityAssem.LLILZIL.iterator();
                while (it5.hasNext()) {
                    it5.next().x5(arrayList5, arrayList6);
                }
            }
            C1585070rLl c1585070rLl = C1585070rLl.LIZ;
            CopyOnWriteArrayList<InterfaceC1583870rJp> copyOnWriteArrayList2 = tabAbilityAssem.LL;
            c1585070rLl.getClass();
            CopyOnWriteArrayList<InterfaceC1583870rJp> copyOnWriteArrayList3 = C1585070rLl.LIZIZ;
            copyOnWriteArrayList3.clear();
            copyOnWriteArrayList3.addAll(copyOnWriteArrayList2);
            C19EG c19egLIZ = C724240Sb0.LIZ(tabAbilityAssem);
            if (c19egLIZ != null && (iHomeTabStabilityService = (IHomeTabStabilityService) PluggableExtentionKt.pluggableSpi$default(IHomeTabStabilityService.class, false, false, false, 14, null)) != null) {
                iHomeTabStabilityService.LIZ(c19egLIZ, enumC1585090rLn, arrayList2, tabAbilityAssem.LL);
            }
            if (enumC1585090rLn == EnumC1585090rLn.COLD_LAUNCH && C1584540rKu.LIZIZ()) {
                Iterator<TopTabProtocol> it6 = tabAbilityAssem.LLILLL.iterator();
                while (it6.hasNext()) {
                    InterfaceC1589850rTT interfaceC1589850rTTLJ = it6.next().LJ();
                    if (interfaceC1589850rTTLJ != null) {
                        interfaceC1589850rTTLJ.LJ();
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        EnumC1585090rLn enumC1585090rLn;
        IAccountFeatureFlagService iAccountFeatureFlagService;
        if (i == 2 && (iAccountFeatureFlagService = (IAccountFeatureFlagService) PluggableExtentionKt.pluggableSpi$default(IAccountFeatureFlagService.class, false, false, false, 14, null)) != null && iAccountFeatureFlagService.LIZIZ()) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    enumC1585090rLn = EnumC1585090rLn.LOGIN_END;
                } else {
                    enumC1585090rLn = EnumC1585090rLn.LOGOUT;
                }
            } else {
                enumC1585090rLn = EnumC1585090rLn.SWITCH_ACCOUNT;
            }
        } else {
            enumC1585090rLn = EnumC1585090rLn.LOGIN;
        }
        Gx0(enumC1585090rLn);
        g62(enumC1585090rLn);
        if (((Boolean) C0B5R.LIZ.getValue()).booleanValue()) {
            aM2(enumC1585090rLn);
        }
        if (i != 2 && i != 3) {
            return;
        }
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("fromStart", "MainFragment", bundle);
        fw0(bundle, "For You");
    }
}
