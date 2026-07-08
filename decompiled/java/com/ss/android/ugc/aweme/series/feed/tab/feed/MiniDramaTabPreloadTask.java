package com.ss.android.ugc.aweme.series.feed.tab.feed;

import X.AbstractC848400XPy;
import X.C00ZD;
import X.C01GW;
import X.C0AQW;
import X.C0AQX;
import X.C0CCZ;
import X.C0DMM;
import X.C0NFP;
import X.C0S4U;
import X.C0VU1;
import X.C0VZ0;
import X.C0XIR;
import X.C0XQ7;
import X.C1155310gAb;
import X.C13BV;
import X.C13LP;
import X.C1483340ohg;
import X.C1510050pOl;
import X.C15438062q;
import X.C1576710r8H;
import X.C1576780r8O;
import X.C1576900r8a;
import X.C1576920r8c;
import X.C1576960r8g;
import X.C1576990r8j;
import X.C1578350rAv;
import X.C1697810uHb;
import X.C1906580ziK;
import X.C19EG;
import X.C20684815ws;
import X.C2188811AlT;
import X.C23112093u;
import X.C2344009Gk;
import X.C2421209eE;
import X.C286880BMg;
import X.C296910BkP;
import X.C297580BlU;
import X.C297590BlV;
import X.C452501pT;
import X.C609810Nvv;
import X.C786410Ut5;
import X.EnumC1576910r8b;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.EnumC800320VaQ;
import X.InterfaceC1152700g6O;
import X.InterfaceC1475300oUi;
import X.InterfaceC1576940r8e;
import X.InterfaceC1583870rJp;
import X.InterfaceC799590VYf;
import Y.ARunnableS0S0101200_9;
import Y.ARunnableS78S0200000_9;
import Y.AfS178S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.arch.SeriesFeedResp;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.series.feed.api.SeriesCenterListResponse;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterSceneEnum;
import com.ss.android.ugc.aweme.series.feed.tab.common.repo.SeriesFeedRepository;
import com.ss.android.ugc.aweme.series.feed.tab.feed.MiniDramaTabCacheWrapper;
import com.ss.android.ugc.aweme.series.feed.tab.feed.MiniDramaTabPreloadTask;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public class MiniDramaTabPreloadTask implements C0CCZ, InterfaceC799590VYf, InterfaceC1576940r8e {
    public final long LL;
    public long LLILLJJLI;
    public final AtomicBoolean LLILLL = new AtomicBoolean(false);
    public final AtomicBoolean LLILZ = new AtomicBoolean(false);
    public final AtomicBoolean LLILZIL = new AtomicBoolean(false);
    public final AtomicBoolean LLILZLL = new AtomicBoolean(false);
    public C1576900r8a LLIZ;
    public final AtomicReference<EnumC1576910r8b> LLIZLLLIL;
    public final AtomicLong LLJ;
    public final AtomicInteger LLJI;
    public final AtomicBoolean LLJIJIL;
    public final AtomicBoolean LLJILJIL;
    public final C01GW LLJILJILJ;
    public final AtomicReference<EnumC800320VaQ> LLJILLL;
    public volatile List<? extends Aweme> LLJJ;
    public final C01GW LLJJI;

    public final void LJIILLIIL() {
        ((Handler) this.LLJILJILJ.getValue()).removeCallbacksAndMessages(null);
        final long jIncrementAndGet = this.LLJ.incrementAndGet();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start fetch data runId=");
        sbLIZ.append(jIncrementAndGet);
        C2188811AlT.LIZIZ(sbLIZ);
        C1576990r8j.LIZ.getClass();
        C1576990r8j.LJFF = "start_fetch_data";
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        C786410Ut5.LJJZZIII((Handler) this.LLJILJILJ.getValue(), new Runnable() { // from class: X.0N6P
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MiniDramaTabPreloadTask@ba56.realPreload$1");
                try {
                    this.LL.LJIL(0, jIncrementAndGet, jElapsedRealtime);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MiniDramaTabPreloadTask@ba56.realPreload$1");
            }
        });
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "MiniDramaTabPreloadTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return 2;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    public final SeriesFeedResp LIZ() {
        Object value = this.LLJJI.getValue();
        boolean zLIZ = C296910BkP.LIZ();
        value.getClass();
        SeriesFeedRepository.AppDiffProtocol.LIZ.getClass();
        SeriesFeedResp seriesFeedRespLIZIZ = C1576920r8c.LIZIZ.getValue().LIZIZ(new C1578350rAv(zLIZ));
        if (seriesFeedRespLIZIZ != null) {
            return seriesFeedRespLIZIZ;
        }
        throw new RuntimeException("preload-> resp is null");
    }

    public final void LJ() {
        if (this.LLILZ.compareAndSet(false, true)) {
            boolean zAsyncEmitEventToGlobalStrategyEventStream = TTMStrategyCenterManager.asyncEmitEventToGlobalStrategyEventStream("mini_drama_tab_preload_check", new JSONObject(), (ExecutorService) null);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("emit prediction check event success=");
            sbLIZ.append(zAsyncEmitEventToGlobalStrategyEventStream);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public final void LJIIL() {
        List<? extends Aweme> list;
        C1155310gAb.LIZ.getClass();
        if (C1155310gAb.LIZJ() && (list = this.LLJJ) != null) {
            Set<String> setLIZJ = C1576990r8j.LIZ.LIZJ();
            ArrayList arrayList = new ArrayList();
            for (Aweme aweme : list) {
                Aweme aweme2 = aweme;
                if (aweme2.getAid() != null && !setLIZJ.contains(aweme2.getAid())) {
                    arrayList.add(aweme);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onReturnToForeground: schedule resume download for ");
            sbLIZ.append(arrayList.size());
            sbLIZ.append(" pending aids after 3000ms");
            C2188811AlT.LIZIZ(sbLIZ);
            C786410Ut5.LJLIIL(3000L, (Handler) this.LLJILJILJ.getValue(), new ARunnableS78S0200000_9(arrayList, this, 40));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [X.0g6O, X.0r8a] */
    public final void LJIILIIL() {
        C19EG c19eg;
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        List listL32;
        LJIJJ(EnumC1576910r8b.RUN);
        this.LLILLJJLI = SystemClock.elapsedRealtime();
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            EnumC1576910r8b enumC1576910r8b = EnumC1576910r8b.NOT_LOGIN;
            LJIJ(enumC1576910r8b, null, null);
            LJIJJ(enumC1576910r8b);
            return;
        }
        Activity activityLIZ = C2421209eE.LIZ();
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg)) != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) != null && (listL32 = homeTabAbilityLIZ.l32()) != null) {
            Iterator it2 = listL32.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.LJFF(((InterfaceC1583870rJp) next).tag(), "Drama")) {
                    if (next != null) {
                        C1576990r8j.LIZ.getClass();
                        if (C1576990r8j.LJ) {
                            EnumC1576910r8b enumC1576910r8b2 = EnumC1576910r8b.HAS_SWITCH_TO_DRAMA_TAB;
                            LJIJ(enumC1576910r8b2, null, null);
                            LJIJJ(enumC1576910r8b2);
                            return;
                        }
                        C1576780r8O.LIZ.getClass();
                        MiniDramaTabCacheWrapper miniDramaTabCacheWrapperLIZJ = C1576780r8O.LIZJ();
                        if (miniDramaTabCacheWrapperLIZJ != null && miniDramaTabCacheWrapperLIZJ.LIZIZ(C297590BlV.LIZ())) {
                            LJIILJJIL(miniDramaTabCacheWrapperLIZJ.resp, false);
                            if (!C286880BMg.LIZ()) {
                                EnumC1576910r8b enumC1576910r8b3 = EnumC1576910r8b.HAS_UN_CONSUME_VALID_DATA;
                                LJIJ(enumC1576910r8b3, null, null);
                                LJIJJ(enumC1576910r8b3);
                                return;
                            }
                        }
                        if (C1576990r8j.LIZIZ(C297580BlU.LIZ()) == null && LJIIJ()) {
                            MiniDramaTabCacheWrapper miniDramaTabCacheWrapperLJIIIIZZ = C1576990r8j.LJIIIIZZ(false);
                            if (miniDramaTabCacheWrapperLJIIIIZZ != null) {
                                LJIILJJIL(miniDramaTabCacheWrapperLJIIIIZZ.resp, true);
                            }
                            EnumC1576910r8b enumC1576910r8b4 = EnumC1576910r8b.HAS_PRELOAD_VALID_DATA;
                            LJIJ(enumC1576910r8b4, null, null);
                            LJIJJ(enumC1576910r8b4);
                            return;
                        }
                        if (!C297580BlU.LIZIZ()) {
                            EnumC1576910r8b enumC1576910r8b5 = EnumC1576910r8b.STOP_PRELOAD;
                            LJIJ(enumC1576910r8b5, null, null);
                            LJIJJ(enumC1576910r8b5);
                            return;
                        } else {
                            if (!((Boolean) C0AQW.LIZ.getValue()).booleanValue()) {
                                LJIILLIIL();
                                return;
                            }
                            LJIJJ(EnumC1576910r8b.CAI_CHECK_START);
                            if (this.LLILZIL.compareAndSet(false, true)) {
                                FeatureServiceManager.Companion.getClass();
                                FeatureServiceManager featureServiceManagerLIZ = C1510050pOl.LIZ();
                                ?? r0 = new InterfaceC1152700g6O() { // from class: X.0r8a
                                    @Override // X.InterfaceC1152700g6O
                                    public final Map<String, List<String>> LIZIZ() {
                                        return C2097908Jt.LIZJ(new Pair("ttm_drama", Collections.singletonList("ttls_drama_tab_prediction_result")));
                                    }

                                    @Override // X.InterfaceC1152700g6O
                                    public final void LIZ(int i, String str, String str2) {
                                        C1576900r8a c1576900r8a;
                                        if (Intrinsics.LJFF(str, "ttm_drama") && Intrinsics.LJFF(str2, "ttls_drama_tab_prediction_result")) {
                                            if (i != 1) {
                                                if (i == 2) {
                                                    this.LIZ.getClass();
                                                    FeatureServiceManager.Companion.getClass();
                                                    FeatureProducer producer = C1510050pOl.LIZ().getProducer("ttm_drama", 2);
                                                    if (producer != null) {
                                                        Boolean booleanFeature$default = FeatureProducer.getBooleanFeature$default(producer, "ttls_drama_tab_prediction_result", null, "ttm_drama_ttls_drama_tab_prediction_result", null, 10, null);
                                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                        sbLIZ.append("prediction result=");
                                                        sbLIZ.append(booleanFeature$default);
                                                        C2188811AlT.LIZIZ(sbLIZ);
                                                        if (booleanFeature$default != null) {
                                                            boolean zBooleanValue = booleanFeature$default.booleanValue();
                                                            MiniDramaTabPreloadTask miniDramaTabPreloadTask = this.LIZ;
                                                            if (miniDramaTabPreloadTask.LLILLL.compareAndSet(false, true)) {
                                                                if (miniDramaTabPreloadTask.LLILZLL.compareAndSet(false, true) && (c1576900r8a = miniDramaTabPreloadTask.LLIZ) != null) {
                                                                    C1510050pOl.LIZ().removeGlobalFeatureChangeListener(c1576900r8a);
                                                                    miniDramaTabPreloadTask.LLIZ = null;
                                                                }
                                                                if (zBooleanValue) {
                                                                    EnumC1576910r8b enumC1576910r8b6 = EnumC1576910r8b.CAI_CHECK_SUCCESS;
                                                                    miniDramaTabPreloadTask.LJIJ(enumC1576910r8b6, null, null);
                                                                    miniDramaTabPreloadTask.LJIJJ(enumC1576910r8b6);
                                                                    miniDramaTabPreloadTask.LJIILLIIL();
                                                                    return;
                                                                }
                                                                EnumC1576910r8b enumC1576910r8b7 = EnumC1576910r8b.CAI_CHECK_FAIL;
                                                                miniDramaTabPreloadTask.LJIJ(enumC1576910r8b7, "-1", null);
                                                                miniDramaTabPreloadTask.LJIJJ(enumC1576910r8b7);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            this.LIZ.LJ();
                                        }
                                    }
                                };
                                this.LLIZ = r0;
                                featureServiceManagerLIZ.addGlobalFeatureChangeListener(r0);
                                if (featureServiceManagerLIZ.isFeatureRegisterAlready("ttm_drama", "ttls_drama_tab_prediction_result")) {
                                    LJ();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        EnumC1576910r8b enumC1576910r8b6 = EnumC1576910r8b.NO_DRAMA_TAB;
        LJIJ(enumC1576910r8b6, null, null);
        LJIJJ(enumC1576910r8b6);
    }

    public MiniDramaTabPreloadTask() {
        EnumC1576910r8b enumC1576910r8b = EnumC1576910r8b.START;
        this.LLIZLLLIL = new AtomicReference<>(enumC1576910r8b);
        this.LLJ = new AtomicLong(0L);
        this.LLJI = new AtomicInteger(0);
        this.LLJIJIL = new AtomicBoolean(false);
        this.LLJILJIL = new AtomicBoolean(false);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1469));
        this.LLJILLL = new AtomicReference<>(EnumC800320VaQ.BOOT_FINISH);
        this.LL = SystemClock.elapsedRealtime();
        LJIJ(enumC1576910r8b, null, null);
        LJIJJ(enumC1576910r8b);
        this.LLJJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(302));
    }

    public static boolean LJIIJ() {
        if (C296910BkP.LIZ()) {
            return true;
        }
        C1576990r8j.LIZ.getClass();
        MiniDramaThreeColumnCacheWrapper miniDramaThreeColumnCacheWrapperLJIIJ = C1576990r8j.LJIIJ();
        if (miniDramaThreeColumnCacheWrapperLJIIJ != null) {
            return C1576710r8H.LIZ(miniDramaThreeColumnCacheWrapperLJIIJ.timeStamp, C297580BlU.LIZ(), miniDramaThreeColumnCacheWrapperLJIIJ);
        }
        return false;
    }

    public final void LJIILL() {
        int iIntValue;
        if (C00ZD.LIZ() > 1) {
            iIntValue = Integer.MAX_VALUE;
        } else {
            C1155310gAb.LIZ.getClass();
            Integer num = ((MiniDramaTabPreloadTaskConfigModel) C1155310gAb.LIZJ.getValue()).maxBackgroundRetryCount;
            if (num == null || (iIntValue = num.intValue()) < 0 || iIntValue <= 0) {
                return;
            }
        }
        EnumC1576910r8b enumC1576910r8b = this.LLIZLLLIL.get();
        if (enumC1576910r8b == null || !enumC1576910r8b.isFinal()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("skip reactivate: stage=");
            sbLIZ.append(enumC1576910r8b != null ? enumC1576910r8b.getStage() : null);
            sbLIZ.append(" not final");
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        C1576780r8O.LIZ.getClass();
        MiniDramaTabCacheWrapper miniDramaTabCacheWrapperLIZJ = C1576780r8O.LIZJ();
        if (miniDramaTabCacheWrapperLIZJ == null || !miniDramaTabCacheWrapperLIZJ.LIZIZ(C297590BlV.LIZ()) || C286880BMg.LIZ()) {
            C1576990r8j c1576990r8j = C1576990r8j.LIZ;
            long jLIZ = C297580BlU.LIZ();
            c1576990r8j.getClass();
            if (!(C1576990r8j.LIZIZ(jLIZ) == null && LJIIJ()) && this.LLJI.get() < iIntValue && this.LLJILJIL.compareAndSet(false, true)) {
                try {
                    this.LLJI.incrementAndGet();
                    this.LLJILLL.set(EnumC800320VaQ.APP_BACKGROUND);
                    this.LLILLL.set(false);
                    this.LLILZ.set(false);
                    this.LLILZIL.set(false);
                    this.LLILZLL.set(false);
                    this.LLIZ = null;
                    ((Handler) this.LLJILJILJ.getValue()).removeCallbacksAndMessages(null);
                    this.LLJ.incrementAndGet();
                    LJIILIIL();
                } finally {
                    try {
                    } catch (Throwable th) {
                    }
                }
                this.LLJILJIL.set(false);
            }
        }
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.IO;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    public final boolean LJIIIZ(long j) {
        if (j != this.LLJ.get()) {
            return true;
        }
        return false;
    }

    public final void LJIJJ(EnumC1576910r8b enumC1576910r8b) {
        this.LLIZLLLIL.set(enumC1576910r8b);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("stage", enumC1576910r8b.getStage());
        c2344009Gk.LJFF("trigger_source", this.LLJILLL.get().getValue());
        c2344009Gk.LIZJ(this.LLJI.get(), "retry_index");
        c2344009Gk.LIZLLL(jElapsedRealtime - this.LL, "duration");
        C20684815ws.LJIILLIIL("mini_drama_tab_preload_stage", c2344009Gk.LIZ);
        C1576990r8j c1576990r8j = C1576990r8j.LIZ;
        String stage = enumC1576910r8b.getStage();
        c1576990r8j.getClass();
        C1576990r8j.LJFF = stage;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        this.LLJILLL.set(EnumC800320VaQ.BOOT_FINISH);
        LJIILIIL();
        C1155310gAb.LIZ.getClass();
        Boolean bool = ((MiniDramaTabPreloadTaskConfigModel) C1155310gAb.LIZJ.getValue()).enableBackgroundRequest;
        if (bool != null && bool.booleanValue() && this.LLJIJIL.compareAndSet(false, true)) {
            try {
                C1906580ziK.LIZJ().LIZ().LJLLLLLL(new AfS178S0100000_9(this, 2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LJIILJJIL(SeriesFeedResp seriesFeedResp, boolean z) {
        Object objLJJJLL;
        List<? extends Aweme> listLJIIL;
        if (!((Boolean) C0AQX.LIZ.getValue()).booleanValue() || seriesFeedResp == null) {
            return;
        }
        if (z) {
            listLJIIL = seriesFeedResp.feedItemList;
            if (listLJIIL == null) {
                listLJIIL = C13BV.INSTANCE;
            }
        } else {
            List<? extends Aweme> list = seriesFeedResp.feedItemList;
            if (list != null) {
                objLJJJLL = C13LP.LJJJLL(list);
            } else {
                objLJJJLL = null;
            }
            listLJIIL = C1697810uHb.LJIIL(objLJJJLL);
        }
        if (listLJIIL.isEmpty()) {
            return;
        }
        C1155310gAb.LIZ.getClass();
        if (C1155310gAb.LIZJ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Drama video preloadVideo: offline-play branch, awemeCount=");
            sbLIZ.append(listLJIIL.size());
            C2188811AlT.LIZIZ(sbLIZ);
            LJJI(listLJIIL, z);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Drama video preloadVideo: legacy branch, awemeCount=");
        sbLIZ2.append(listLJIIL.size());
        C2188811AlT.LIZIZ(sbLIZ2);
        for (Aweme aweme : listLJIIL) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("video preload started ");
            sbLIZ3.append(aweme.getAid());
            C2188811AlT.LIZIZ(sbLIZ3);
            C1483340ohg.LJIL(819200, aweme);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    public final void LJJI(List<? extends Aweme> list, boolean z) {
        ?? arrayList;
        List<BitRate> rawBitRate;
        String urlKey;
        this.LLJJ = list;
        for (Aweme aweme : list) {
            Video video = aweme.getVideo();
            if (video != null) {
                C609810Nvv.LIZ.getClass();
                C609810Nvv.LIZ(aweme, video);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Drama cover preload triggered, count=");
        sbLIZ.append(list.size());
        C2188811AlT.LIZIZ(sbLIZ);
        final String strLIZLLL = C0NFP.LIZLLL();
        boolean z2 = false;
        if (strLIZLLL != null && strLIZLLL.length() != 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Drama video preload cacheDir=");
            sbLIZ2.append(strLIZLLL);
            sbLIZ2.append(" awemeCount=");
            sbLIZ2.append(list.size());
            sbLIZ2.append(" isPreloadCache=");
            sbLIZ2.append(z);
            C2188811AlT.LIZIZ(sbLIZ2);
            for (final Aweme aweme2 : list) {
                final String aid = aweme2.getAid();
                if (aid != null) {
                    Video video2 = aweme2.getVideo();
                    if (video2 != null && (rawBitRate = video2.getRawBitRate()) != null) {
                        arrayList = new ArrayList(C15438062q.LJIJJ(rawBitRate, 10));
                        for (BitRate bitRate : rawBitRate) {
                            if (bitRate != null) {
                                urlKey = bitRate.getUrlKey();
                            } else {
                                urlKey = null;
                            }
                            arrayList.add(urlKey);
                        }
                    } else {
                        arrayList = C13BV.INSTANCE;
                    }
                    ?? LIZ = C2188811AlT.LIZ();
                    LIZ.append("Drama video preload start aid=");
                    LIZ.append(aid);
                    LIZ.append(" bitRateSize=");
                    LIZ.append(arrayList.size());
                    LIZ.append(" urlKeys=");
                    LIZ.append(arrayList);
                    LIZ.append(" isPreloadCache=");
                    LIZ.append(z);
                    C2188811AlT.LIZIZ(LIZ);
                    final AtomicReference atomicReference = new AtomicReference(null);
                    final AtomicBoolean atomicBoolean = new AtomicBoolean(z2);
                    C1483340ohg.LJJIFFI(aweme2, Integer.MAX_VALUE, strLIZLLL, new InterfaceC1475300oUi() { // from class: X.0NIK
                        @Override // X.InterfaceC1475300oUi
                        public final void LLLLZLLIL(String str) {
                        }

                        @Override // X.InterfaceC1475300oUi
                        public final void Sm() {
                        }

                        @Override // X.InterfaceC1475300oUi
                        public final void Z9() {
                        }

                        @Override // X.InterfaceC1475300oUi
                        public final void ck() {
                        }

                        @Override // X.InterfaceC1475300oUi
                        public final void T8(List<SimVideoUrlModel> list2) {
                            ArrayList arrayList2;
                            String urlKey2;
                            if (list2 != null) {
                                list2.size();
                            }
                            Integer numValueOf = null;
                            if (list2 != null) {
                                arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                                for (SimVideoUrlModel simVideoUrlModel : list2) {
                                    if (simVideoUrlModel != null) {
                                        urlKey2 = simVideoUrlModel.getUrlKey();
                                    } else {
                                        urlKey2 = null;
                                    }
                                    arrayList2.add(urlKey2);
                                }
                            } else {
                                arrayList2 = null;
                            }
                            Objects.toString(arrayList2);
                            MiniDramaTabPreloadTask miniDramaTabPreloadTask = this;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("onDownloadCancel(size=");
                            if (list2 != null) {
                                numValueOf = Integer.valueOf(list2.size());
                            }
                            sbLIZ3.append(numValueOf);
                            sbLIZ3.append(')');
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                            Aweme aweme3 = aweme2;
                            String str = aid;
                            String str2 = strLIZLLL;
                            AtomicBoolean atomicBoolean2 = atomicBoolean;
                            miniDramaTabPreloadTask.getClass();
                            MiniDramaTabPreloadTask.LJIJJLI(strLIZIZ, aweme3, str, str2, this, atomicBoolean2);
                        }

                        @Override // X.InterfaceC1475300oUi
                        public final void qc(long j, long j2, String str) {
                            if (atomicReference.get() == null && str.length() > 0) {
                                atomicReference.set(str);
                            }
                        }

                        @Override // X.InterfaceC1475300oUi
                        public final void Dd(int i, String str, String str2, String str3) {
                            MiniDramaTabPreloadTask miniDramaTabPreloadTask = this;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("onDownloadError(error=");
                            sbLIZ3.append(i);
                            sbLIZ3.append(')');
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                            Aweme aweme3 = aweme2;
                            String str4 = aid;
                            String str5 = strLIZLLL;
                            AtomicBoolean atomicBoolean2 = atomicBoolean;
                            miniDramaTabPreloadTask.getClass();
                            MiniDramaTabPreloadTask.LJIJJLI(strLIZIZ, aweme3, str4, str5, this, atomicBoolean2);
                        }

                        @Override // X.InterfaceC1475300oUi
                        public final void Xi(String str, String str2, long j, long j2) {
                            if (atomicReference.get() == null && str2.length() > 0) {
                                atomicReference.set(str2);
                            }
                        }

                        @Override // X.InterfaceC1475300oUi
                        public final void t8(String str, long j, long j2, String str2) {
                            if (atomicReference.get() == null && str.length() > 0) {
                                atomicReference.set(str);
                            }
                        }

                        @Override // X.InterfaceC1475300oUi
                        public final void tf(long j, long j2, String str, String str2) {
                            boolean z3;
                            String str3 = atomicReference.get();
                            if (str3 != null) {
                                str = str3;
                            }
                            MiniDramaTabPreloadTask miniDramaTabPreloadTask = this;
                            String str4 = aid;
                            miniDramaTabPreloadTask.getClass();
                            try {
                                String strLIZLLL2 = C0NFP.LIZLLL();
                                if (strLIZLLL2 != null && strLIZLLL2.length() != 0) {
                                    if (str2 == null) {
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append(str);
                                        sbLIZ3.append(".mdl");
                                        str2 = C0NFP.LIZJ(C2188811AlT.LIZIZ(sbLIZ3));
                                    }
                                    String strLIZJ = C0NFP.LIZJ(str4);
                                    if (str2 != null && str2.length() != 0) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    if (!z3 && strLIZJ != null && strLIZJ.length() != 0) {
                                        if (!u.LJJIIJZLJL(str2, strLIZLLL2, false)) {
                                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                            sbLIZ4.append("Drama video renameMdlToAid skip: oldPath outside feedCache oldPath=");
                                            sbLIZ4.append(str2);
                                            sbLIZ4.append(" targetDir=");
                                            sbLIZ4.append(strLIZLLL2);
                                            sbLIZ4.append(" aid=");
                                            sbLIZ4.append(str4);
                                            C2188811AlT.LIZIZ(sbLIZ4);
                                            return;
                                        }
                                        C0VSJ c0vsj = new C0VSJ(str2);
                                        if (!c0vsj.exists()) {
                                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                            sbLIZ5.append("Drama video renameMdlToAid skip: oldFile missing oldPath=");
                                            sbLIZ5.append(str2);
                                            sbLIZ5.append(" aid=");
                                            sbLIZ5.append(str4);
                                            C2188811AlT.LIZIZ(sbLIZ5);
                                            return;
                                        }
                                        C0VSJ c0vsj2 = new C0VSJ(strLIZJ);
                                        if (c0vsj2.exists()) {
                                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                            sbLIZ6.append("Drama video renameMdlToAid: newFile already exists, skipping rename aid=");
                                            sbLIZ6.append(str4);
                                            sbLIZ6.append(" newPath=");
                                            sbLIZ6.append(strLIZJ);
                                            C2188811AlT.LIZIZ(sbLIZ6);
                                        } else {
                                            boolean zRenameTo = c0vsj.renameTo(c0vsj2);
                                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                            sbLIZ7.append("Drama video renameMdlToAid done aid=");
                                            sbLIZ7.append(str4);
                                            sbLIZ7.append(" urlKey=");
                                            sbLIZ7.append(str);
                                            sbLIZ7.append(" oldPath=");
                                            sbLIZ7.append(str2);
                                            sbLIZ7.append(" newPath=");
                                            sbLIZ7.append(strLIZJ);
                                            sbLIZ7.append(" success=");
                                            sbLIZ7.append(zRenameTo);
                                            C2188811AlT.LIZIZ(sbLIZ7);
                                            if (!zRenameTo) {
                                                return;
                                            }
                                        }
                                        C1576990r8j c1576990r8j = C1576990r8j.LIZ;
                                        String str5 = aid;
                                        synchronized (c1576990r8j) {
                                            if (str5.length() == 0) {
                                                return;
                                            }
                                            Set<String> setLIZ = c1576990r8j.LIZ();
                                            if (setLIZ.add(str5)) {
                                                Iterator it2 = ((ArrayList) C13LQ.LJIJI(C1576990r8j.LIZIZ)).iterator();
                                                while (it2.hasNext()) {
                                                    ((MiniDramaTabCacheWrapper) it2.next()).LIZ = C13LP.LLIIJI(setLIZ);
                                                }
                                                Set setLLIIIZ = C13LP.LLIIIZ(C1576990r8j.LJII());
                                                setLLIIIZ.add(str5);
                                                C1576990r8j.LJI(setLLIIIZ);
                                                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                                sbLIZ8.append("[OfflinePlay] markAidFullyCached aid=");
                                                sbLIZ8.append(str5);
                                                sbLIZ8.append(" sessionMem=");
                                                sbLIZ8.append(setLIZ.size());
                                                sbLIZ8.append(" disk=");
                                                sbLIZ8.append(setLLIIIZ.size());
                                                C2188811AlT.LIZIZ(sbLIZ8);
                                            }
                                            return;
                                        }
                                    }
                                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                    sbLIZ9.append("Drama video renameMdlToAid skip: invalid path oldPath=");
                                    sbLIZ9.append(str2);
                                    sbLIZ9.append(" newPath=");
                                    sbLIZ9.append(strLIZJ);
                                    sbLIZ9.append(" aid=");
                                    sbLIZ9.append(str4);
                                    C2188811AlT.LIZIZ(sbLIZ9);
                                    return;
                                }
                                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                                sbLIZ10.append("Drama video renameMdlToAid skip: feedCache dir unavailable aid=");
                                sbLIZ10.append(str4);
                                C2188811AlT.LIZIZ(sbLIZ10);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                                sbLIZ11.append("Drama video renameMdlToAid failed aid=");
                                sbLIZ11.append(str4);
                                C2188811AlT.LIZIZ(sbLIZ11);
                            }
                        }
                    }, null);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Drama video preloadForFeedCache invoked aid=");
                    sbLIZ3.append(aid);
                    C2188811AlT.LIZIZ(sbLIZ3);
                }
                z2 = false;
            }
        }
    }

    public final void LJIIIIZZ(long j, long j2, Throwable th) {
        String strValueOf;
        String message;
        if (LJIIIZ(j)) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch data fail, ");
        sbLIZ.append(th.getMessage());
        C2188811AlT.LIZIZ(sbLIZ);
        boolean z = th instanceof C0XIR;
        if (z) {
            strValueOf = String.valueOf(((C23112093u) th).getErrorCode());
        } else {
            strValueOf = "-1";
        }
        if (z) {
            message = ((C0XIR) th).getErrorMsg();
        } else {
            message = th.getMessage();
        }
        EnumC1576910r8b enumC1576910r8b = EnumC1576910r8b.PRELOAD_FAILED;
        LJIJ(enumC1576910r8b, strValueOf, message);
        LJIJJ(enumC1576910r8b);
        LJIIZILJ(0, strValueOf, false, message, 0, jElapsedRealtime, -1);
    }

    public final void LJIJ(EnumC1576910r8b enumC1576910r8b, String str, String str2) {
        this.LLIZLLLIL.set(enumC1576910r8b);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("end_stage", enumC1576910r8b.getStage());
        c2344009Gk.LJFF("trigger_source", this.LLJILLL.get().getValue());
        c2344009Gk.LIZJ(this.LLJI.get(), "retry_index");
        if (str != null) {
            c2344009Gk.LJFF("error_code", str);
        }
        if (str2 != null) {
            c2344009Gk.LJFF("error_message", str2);
        }
        if (enumC1576910r8b != EnumC1576910r8b.START) {
            long j = this.LLILLJJLI;
            c2344009Gk.LIZLLL(j - this.LL, "init_run_duration");
            c2344009Gk.LIZLLL(jElapsedRealtime - j, "run_end_duration");
        }
        C20684815ws.LJIILLIIL("mini_drama_tab_preload", c2344009Gk.LIZ);
    }

    public final void LJIL(int i, long j, long j2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("runFetchFeedAttempt(attempt=");
        sbLIZ.append(i);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        if (LJIIIZ(j)) {
            return;
        }
        C1155310gAb.LIZ.getClass();
        int iLIZ = C1155310gAb.LIZ();
        long jLIZIZ = C1155310gAb.LIZIZ();
        if (i > 0) {
            try {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("fetchFeedResp retry attempt=");
                sbLIZ2.append(i);
                sbLIZ2.append('/');
                sbLIZ2.append(iLIZ);
                sbLIZ2.append(" runId=");
                sbLIZ2.append(j);
                C2188811AlT.LIZIZ(sbLIZ2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("fetchFeedResp attempt=");
                sbLIZ3.append(i);
                sbLIZ3.append(" failed: ");
                sbLIZ3.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ3);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("runFetchFeedAttempt.catch(attempt=");
                sbLIZ4.append(i);
                sbLIZ4.append(')');
                C2188811AlT.LIZIZ(sbLIZ4);
                if (LJIIIZ(j)) {
                    return;
                }
                if (i < iLIZ) {
                    C786410Ut5.LJLIIL(jLIZIZ, (Handler) this.LLJILJILJ.getValue(), new ARunnableS0S0101200_9(this, j, i, j2, 0));
                    return;
                } else {
                    LJIIIIZZ(j, j2, e);
                    return;
                }
            }
        }
        SeriesFeedResp seriesFeedRespLIZ = LIZ();
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("runFetchFeedAttempt.success(attempt=");
        sbLIZ5.append(i);
        sbLIZ5.append(')');
        C2188811AlT.LIZIZ(sbLIZ5);
        if (LJIIIZ(j)) {
            return;
        }
        LJJ(j, seriesFeedRespLIZ, i, j2);
    }

    public final void LJJ(long j, SeriesFeedResp seriesFeedResp, int i, long j2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("runFetchThreeColumnAttempt(attempt=");
        sbLIZ.append(i);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        if (LJIIIZ(j)) {
            return;
        }
        if (!C296910BkP.LIZ()) {
            C1155310gAb.LIZ.getClass();
            int iLIZ = C1155310gAb.LIZ();
            long jLIZIZ = C1155310gAb.LIZIZ();
            try {
                SeriesCenterSceneEnum seriesCenterSceneEnum = SeriesCenterSceneEnum.TREND;
                SeriesCenterListResponse seriesCenterListResponse = (SeriesCenterListResponse) C1576960r8g.LIZ(seriesCenterSceneEnum, "", String.valueOf(seriesCenterSceneEnum.getValue()), 1, Boolean.TRUE, null, 72).LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("runFetchThreeColumnAttempt.success(attempt=");
                sbLIZ2.append(i);
                sbLIZ2.append(')');
                C2188811AlT.LIZIZ(sbLIZ2);
                if (LJIIIZ(j)) {
                    return;
                }
                LJFF(j, seriesFeedResp, seriesCenterListResponse, i, j2);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("fetchThreeColumn attempt=");
                sbLIZ3.append(i);
                sbLIZ3.append(" failed: ");
                sbLIZ3.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ3);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("runFetchThreeColumnAttempt.catch(attempt=");
                sbLIZ4.append(i);
                sbLIZ4.append(')');
                C2188811AlT.LIZIZ(sbLIZ4);
                if (LJIIIZ(j)) {
                    return;
                }
                if (i < iLIZ) {
                    C786410Ut5.LJLIIL(jLIZIZ, (Handler) this.LLJILJILJ.getValue(), new ARunnableS0S0101200_9(this, j, i, j2, 2));
                    return;
                } else {
                    LJIIIIZZ(j, j2, e);
                    return;
                }
            }
        }
        LJFF(j, seriesFeedResp, null, i, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(long r21, com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.arch.SeriesFeedResp r23, com.ss.android.ugc.aweme.series.feed.api.SeriesCenterListResponse r24, int r25, long r26) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.feed.tab.feed.MiniDramaTabPreloadTask.LJFF(long, com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.arch.SeriesFeedResp, com.ss.android.ugc.aweme.series.feed.api.SeriesCenterListResponse, int, long):void");
    }

    public static void LJIJJLI(String str, Aweme aweme, String str2, String str3, InterfaceC1475300oUi interfaceC1475300oUi, AtomicBoolean atomicBoolean) {
        if (!atomicBoolean.compareAndSet(false, true)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Drama video retry skip (");
            sbLIZ.append(str);
            sbLIZ.append(") aid=");
            sbLIZ.append(str2);
            sbLIZ.append(": already retried");
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Drama video retry start (");
        sbLIZ2.append(str);
        sbLIZ2.append(") aid=");
        sbLIZ2.append(str2);
        C2188811AlT.LIZIZ(sbLIZ2);
        try {
            C1483340ohg.LJJIFFI(aweme, Integer.MAX_VALUE, str3, interfaceC1475300oUi, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Drama video retry failed to invoke (");
            sbLIZ3.append(str);
            sbLIZ3.append(") aid=");
            sbLIZ3.append(str2);
            C2188811AlT.LIZIZ(sbLIZ3);
        }
    }

    public static void LJIIZILJ(int i, String str, boolean z, String str2, int i2, long j, int i3) {
        int i4;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("drama_request_type", "init_preload");
        if (z) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        c2344009Gk.LIZJ(i4, "is_success");
        c2344009Gk.LIZLLL(j, "duration");
        c2344009Gk.LIZJ(i, "video_count");
        c2344009Gk.LJFF("error_code", str);
        c2344009Gk.LJFF("error_message", str2);
        c2344009Gk.LIZJ(i2, "ads_count");
        c2344009Gk.LIZJ(i3, "ad_first_index");
        C20684815ws.LJIILLIIL("mini_drama_tab_feed_response", c2344009Gk.LIZ);
    }
}
