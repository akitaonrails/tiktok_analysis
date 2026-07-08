package com.ss.android.ugc.aweme.ml.common;

import X.AbstractC1509490pNr;
import X.AbstractC19994813Le;
import X.C00ET;
import X.C00UJ;
import X.C01GW;
import X.C04RL;
import X.C08JS;
import X.C08TN;
import X.C09JN;
import X.C0C2Q;
import X.C0CN5;
import X.C0NA0;
import X.C0NA7;
import X.C0NAF;
import X.C0QQG;
import X.C0R1F;
import X.C0XEN;
import X.C1086000eMo;
import X.C1150504el;
import X.C1196304m9;
import X.C1217604pa;
import X.C1244904tz;
import X.C1337780kuu;
import X.C1349505Px;
import X.C13LQ;
import X.C1505530pHT;
import X.C1508860pMq;
import X.C1509430pNl;
import X.C1509850pOR;
import X.C1509900pOW;
import X.C1510050pOl;
import X.C1510130pOt;
import X.C1510150pOv;
import X.C1510260pP6;
import X.C1510330pPD;
import X.C1510520pPW;
import X.C1510530pPX;
import X.C1510720pPq;
import X.C1510730pPr;
import X.C1510740pPs;
import X.C1510750pPt;
import X.C1510760pPu;
import X.C1510770pPv;
import X.C1510860pQ4;
import X.C1510980pQG;
import X.C1510990pQH;
import X.C1511140pQW;
import X.C1511150pQX;
import X.C1511230pQf;
import X.C1511390pQv;
import X.C1511420pQy;
import X.C1511440pR0;
import X.C1511450pR1;
import X.C1511980pRs;
import X.C1512160pSA;
import X.C1512230pSH;
import X.C1512790pTB;
import X.C1513180pTo;
import X.C1513230pTt;
import X.C1519460pdw;
import X.C15438062q;
import X.C15O7;
import X.C1602200rnO;
import X.C1697810uHb;
import X.C1906580ziK;
import X.C1AF0;
import X.C1BCA;
import X.C1EE1;
import X.C202098145w;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C279420AxI;
import X.C285090BFj;
import X.C296300BjQ;
import X.C581560MrS;
import X.C589440N9y;
import X.C609230Nuz;
import X.C609910Nw5;
import X.C609920Nw6;
import X.C786410Ut5;
import X.C823050WQl;
import X.C844470XAv;
import X.CallableC1510670pPl;
import X.EnumC312610CNf;
import X.InterfaceC1006670cIr;
import X.InterfaceC1510920pQA;
import X.InterfaceC1513600pUU;
import X.InterfaceC582820MtU;
import X.InterfaceC588340N5s;
import Y.ARunnableS109S0100000_9;
import Y.ARunnableS14S1200000_9;
import Y.ARunnableS27S1200000_23;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.keva.Keva;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.api.ClientAIConfigCenter;
import com.ss.android.ugc.aweme.ml.api.IMLDataCenterService;
import com.ss.android.ugc.aweme.ml.api.ISmartIdleDetectionService;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.aweme.ml.api.MLDataCenterService;
import com.ss.android.ugc.aweme.ml.api.PitayaFeatureCenterService;
import com.ss.android.ugc.aweme.ml.api.SmartDataCollectorService;
import com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService;
import com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService;
import com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService;
import com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService;
import com.ss.android.ugc.aweme.ml.api.SmartHARService;
import com.ss.android.ugc.aweme.ml.api.SmartIdleDetectionService;
import com.ss.android.ugc.aweme.ml.common.MLCommonServiceImpl;
import com.ss.android.ugc.aweme.ml.feature.FeatureServiceManagerImpl;
import com.ss.android.ugc.aweme.ml.feature.expriment.FeatureCheckConfig;
import com.ss.android.ugc.aweme.ml.feature.flash.FeatureInsertHandler;
import com.ss.android.ugc.aweme.ml.feature.flash.FlashCommonFreeRideApiConfig;
import com.ss.android.ugc.aweme.ml.feature.flash.FlashFreeRideConfig;
import com.ss.android.ugc.aweme.ml.feature.flash.FlashFreeRideFeatureConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService;
import com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService;
import com.ss.android.ugc.aweme.ml.request.meta.ApplogConfig;
import com.ss.android.ugc.aweme.ml.request.meta.FeatureSetInfo;
import com.ss.android.ugc.aweme.ml.request.meta.FeatureSetRawInfo;
import com.ss.android.ugc.aweme.ml.request.meta.FilterConfig;
import com.ss.android.ugc.aweme.ml.request.meta.FlashCommonConfig;
import com.ss.android.ugc.aweme.ml.request.meta.FlashFeatureSetConfig;
import com.ss.android.ugc.aweme.ml.request.meta.UrlConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.BrightnessInfo;
import com.ss.android.ugc.aweme.utils.OHRPredictResultParams;
import com.ss.android.ugc.aweme.utils.RealTimeClientInfo;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.FeatureGroup;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import com.ss.ugc.clientai.core.api.meta.FeatureSetConfig;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class MLCommonServiceImpl extends MLCommonService {
    public static final /* synthetic */ int LJFF = 0;
    public InterfaceC582820MtU LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    public final void LIZ() throws JSONException {
        int i;
        synchronized (this) {
            try {
                if (this.LJ) {
                    return;
                }
                this.LJ = true;
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    C00UJ.LIZIZ();
                    PitayaFeatureCenterService.Companion.getClass();
                    C1510980pQG.LIZ.checkAndInit();
                    SmartCommonPreloadService.Companion.getClass();
                    C1510750pPt.LIZ.checkAndInit();
                    C1511440pR0 c1511440pR0 = C1511440pR0.LIZ;
                    c1511440pR0.getClass();
                    if (C1511440pR0.LIZJ()) {
                        c1511440pR0.preloadEnv();
                    }
                    C1511440pR0.LJFF = true;
                    SmartDataTrackerService.Companion.getClass();
                    C1512160pSA.LIZ.checkAndInit();
                    SmartDataCollectorService.LIZ.getClass();
                    SmartDataCollectorService value = C1510760pPu.LIZIZ.getValue();
                    if (value != null) {
                        value.init();
                    }
                    i = 0;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJFF(th, "checkAndInitNonEmergency error, please check!!");
                    i = -3;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                C1510740pPs.LIZ.getClass();
                C1510740pPs.LJFF = jCurrentTimeMillis2;
                C1510740pPs.LJI = i;
                if (AbstractC19994813Le.Default.nextFloat() < 0.001f) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(Scene.SCENE_SERVICE, "ml_common_service");
                    jSONObject.put("model_name", "common");
                    jSONObject.put("sdk_duration", C1510740pPs.LIZIZ);
                    jSONObject.put("sdk_success", C1510740pPs.LIZJ);
                    jSONObject.put("model_cost", (int) C1510740pPs.LIZLLL);
                    jSONObject.put("model_load_suc", C1510740pPs.LJ);
                    jSONObject.put("download_cost", (int) C1510740pPs.LJFF);
                    jSONObject.put("download_suc", C1510740pPs.LJI);
                    C20684815ws.LJIJ("ml_scene_init", jSONObject);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public final synchronized void LIZIZ() {
        if (this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        System.currentTimeMillis();
        if (((FeatureCheckConfig) C1510530pPX.LIZIZ.getValue()).open) {
            C1510520pPW.LIZ.getClass();
            C1510520pPW.LIZJ();
        }
        FeatureServiceManagerImpl.INSTANCE.checkAndInit();
        C1509850pOR.LIZ.LIZJ();
        List list = (List) C0C2Q.LIZIZ.getValue();
        Set<String> set = C1510260pP6.LIZ;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1510260pP6.LIZ.add((String) it2.next());
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService
    public final void runInMainActivityOnCreate() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService
    public final void runInMainActivityOnDestroy() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final JSONObject getCacheFeatureSetVersion() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (FeatureSetConfig featureSetConfig : C1508860pMq.LIZ.values()) {
            jSONObject.put(featureSetConfig.featureSetName, featureSetConfig.version);
        }
        return jSONObject;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService
    public final String getFeedRequestParam() {
        String strLJIILL;
        if ((((Number) C04RL.LIZ.getValue()).intValue() & 1) == 1) {
            try {
                C1512790pTB c1512790pTB = C1512790pTB.LIZIZ;
                BrightnessInfo brightnessInfo = new BrightnessInfo(((Float) FeatureProducer.getFeature$default(c1512790pTB, "screen_brightness", (JSONObject) null, "feed_carry", (ReturnCode) null, 10, (Object) null)).floatValue(), ((Integer) FeatureProducer.getFeature$default(c1512790pTB, "screen_brightness_auto_mode", (JSONObject) null, "feed_carry", (ReturnCode) null, 10, (Object) null)).intValue());
                int iIntValue = ((Integer) FeatureProducer.getFeature$default(c1512790pTB, "drak_mode", (JSONObject) null, "feed_carry", (ReturnCode) null, 10, (Object) null)).intValue();
                float fFloatValue = ((Float) FeatureProducer.getFeature$default(c1512790pTB, "font_scale", (JSONObject) null, "feed_carry", (ReturnCode) null, 10, (Object) null)).floatValue();
                OHRPredictResultParams oHRPredictResultParams = (OHRPredictResultParams) FeatureProducer.getFeature$default(C1510330pPD.LIZIZ, "cur_ohr", (JSONObject) null, "feed_carry", (ReturnCode) null, 10, (Object) null);
                C01GW c01gw = C296300BjQ.LIZ;
                if (C296300BjQ.LIZJ) {
                    strLJIILL = C08JS.LIZIZ().LJIILL(C1510770pPv.LIZIZ.LIZ());
                    strLJIILL.toString();
                } else {
                    strLJIILL = null;
                }
                return C08JS.LIZIZ().LJIILL(new RealTimeClientInfo(brightnessInfo, iIntValue, fFloatValue, oHRPredictResultParams, strLJIILL));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService
    public final void onAppLaunch() {
        onNotifyCommonEvent("app_launch", null);
    }

    public static void LIZJ() {
        if (C609920Nw6.LIZ().open) {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            System.currentTimeMillis();
            C0NAF.LIZ();
            C00ET c00et = new C00ET();
            c00et.LIZ.put("sub_type", "boot_cold_start_duration|boot_first_video_duration");
            C0NA0 c0na0 = new C0NA0((C0NA7) C609230Nuz.LIZIZ.getValue(), C2097608Jq.LJIIIIZZ(new Pair("boot", c00et), new Pair("performance", null), new Pair("video", null), new Pair("bytebench", null), new Pair(Scene.SCENE_SERVICE, null)), Boolean.FALSE);
            c0na0.LJFF = new String[]{"boot", "page_open", "request_update"};
            c0na0.LIZLLL = C609920Nw6.LIZ().minInterval;
            c0na0.LJ = C609920Nw6.LIZ().triggerPeriod;
            c0na0.LJII = C609920Nw6.LIZ().recentPoolSize;
            c0na0.LJIIIIZZ = C609920Nw6.LIZ().stableWindowSize;
            ArrayList<String> arrayList = new ArrayList<>();
            c0na0.LJIIIZ = arrayList;
            arrayList.add("main");
            c0na0.LJI = C13LQ.LJLIIL(new String[]{"source_enter_foregound", "source_open_pageXXX", "play_prepare"});
            if (C0NAF.LIZIZ == null) {
                synchronized (C0NAF.class) {
                    try {
                        if (C0NAF.LIZIZ == null) {
                            C589440N9y c589440N9y = C0NAF.LIZ;
                            if (c589440N9y == null) {
                                c589440N9y = new C589440N9y();
                            }
                            c589440N9y.LIZ(contextLIZ, c0na0);
                            C0NAF.LIZIZ = c589440N9y;
                            if (C0NAF.LIZ == null) {
                                C0NAF.LIZ = c589440N9y;
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            C609230Nuz.LIZ = true;
            System.currentTimeMillis();
            MLDataCenterService.Companion.getClass();
            IMLDataCenterService iMLDataCenterService = C1349505Px.LIZ;
            HashMap map = new HashMap();
            if (C1150504el.LIZ().LJII) {
                C202098145w c202098145wLIZ = C08TN.LIZ();
                Long l = (Long) ((ConcurrentHashMap) c202098145wLIZ.LJI).get("app_start_to_main_focus");
                if (l != null || (l = (Long) ((ConcurrentHashMap) c202098145wLIZ.LJFF).get("app_start_to_main_focus")) != null) {
                    map.put("boot_cold_start_duration", Long.valueOf(l.longValue()));
                }
                C202098145w c202098145wLIZ2 = C08TN.LIZ();
                Long l2 = (Long) ((ConcurrentHashMap) c202098145wLIZ2.LJI).get("feed_total");
                if (l2 != null || (l2 = (Long) ((ConcurrentHashMap) c202098145wLIZ2.LJFF).get("feed_total")) != null) {
                    map.put("boot_first_video_duration", Long.valueOf(l2.longValue()));
                }
            } else {
                Long l3 = (Long) ((ConcurrentHashMap) C1150504el.LIZ().LJI).get("app_start_to_main_focus");
                if (l3 != null) {
                    map.put("boot_cold_start_duration", Long.valueOf(l3.longValue()));
                }
                Long l4 = (Long) ((ConcurrentHashMap) C1150504el.LIZ().LJI).get("feed_total");
                if (l4 != null) {
                    map.put("boot_first_video_duration", Long.valueOf(l4.longValue()));
                }
            }
            iMLDataCenterService.onPythiaEvent("boot", map);
        }
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_live_game", 0, 2, null);
        if (producer$default != null) {
            producer$default.enableProducer((List<FeatureItem>) null);
        }
        FeatureProducer producer$default2 = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_creation", 0, 2, null);
        if (producer$default2 != null) {
            producer$default2.enableProducer((List<FeatureItem>) null);
        }
        FeatureProducer producer$default3 = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_ug", 0, 2, null);
        if (producer$default3 != null) {
            producer$default3.enableProducer((List<FeatureItem>) null);
        }
        if (C609920Nw6.LIZ().open) {
            C1906580ziK.LIZJ().LJIIIZ().LJLLLLLL(new C09JN() { // from class: X.0NAK
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("MLCommonServiceImpl@9ab3.initFeatureCenterNotEmergencyTask$1");
                    C589280N9i c589280N9i = new C589280N9i("page_open", null);
                    C589440N9y c589440N9y2 = C0NAF.LIZIZ;
                    if (c589440N9y2 != null) {
                        c589440N9y2.LJ.LIZIZ(c589280N9i);
                    }
                    C1C7U.LIZIZ("MLCommonServiceImpl@9ab3.initFeatureCenterNotEmergencyTask$1");
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void tryInitFeatureCetnerAndFlashCommonConfig() {
        LIZIZ();
        FeatureInsertHandler.LIZ.LIZIZ(false);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final InterfaceC582820MtU getAwemeAdapter() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final NetworkPartner.RequestHandler getFeatureInsertHandler() {
        return FeatureInsertHandler.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService
    public final void tryInitFeatureCenter() {
        LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void checkAndInit(int i) throws JSONException {
        ScheduledExecutorService scheduledExecutorServiceLIZIZ;
        if (i == 0) {
            C1509900pOW.LIZ();
            C609910Nw5.LIZ.getClass();
            C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0C9z
                public static void LIZ() throws JSONException {
                    if (((Boolean) C282610B5v.LIZ.getValue()).booleanValue()) {
                        C609910Nw5.LIZ.getClass();
                        if (C609910Nw5.LIZ()) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("dynamic_perf_stable_score", Float.valueOf(((Keva) C609910Nw5.LIZJ.getValue()).getFloat("stable_value_v2", 0.0f)));
                            C609910Nw5.LIZIZ(1, null, jSONObject);
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("UploadHelper@98b9.uploadStablePythiaFeatures$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("UploadHelper@98b9.uploadStablePythiaFeatures$1");
                }
            });
            if (!((Boolean) C279420AxI.LIZIZ.getValue()).booleanValue() && (scheduledExecutorServiceLIZIZ = C1510720pPq.LIZIZ()) != null) {
                scheduledExecutorServiceLIZIZ.execute(new ARunnableS109S0100000_9(this, 98));
            }
            C1513180pTo.LIZ = true;
            return;
        }
        synchronized (this) {
            try {
                if (!this.LIZLLL) {
                    this.LIZLLL = true;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i2 = 0;
                    try {
                        if (((Boolean) C279420AxI.LIZIZ.getValue()).booleanValue()) {
                            LIZIZ();
                        }
                        FeatureInsertHandler.LIZ.LIZIZ(false);
                        C1EE1.LIZIZ.LJJJJL();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1AF0.LJFF(th, "featureCenterCheckAndInit error, please check!!");
                    }
                    try {
                        if (((Boolean) C1244904tz.LIZIZ.getValue()).booleanValue()) {
                            C844470XAv.LIZ.getClass();
                            C1512230pSH.LIZ(C844470XAv.LIZ());
                        }
                        C1086000eMo.LIZ(new Runnable() { // from class: X.00kD
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("AppLogHookMagicChangeHandler@ac1e.checkAndInit$1");
                                try {
                                    C00UJ.LIZIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("AppLogHookMagicChangeHandler@ac1e.checkAndInit$1");
                            }
                        });
                        MLDataCenterService.Companion.getClass();
                        C1349505Px.LIZ.checkAndInit();
                        if (!((Boolean) C1217604pa.LIZ.getValue()).booleanValue()) {
                            C1510860pQ4.LIZ = new InterfaceC1510920pQA() { // from class: X.0N9A
                                @Override // X.InterfaceC1510920pQA
                                public final Object getFeature(String str) {
                                    if (str == null) {
                                        return null;
                                    }
                                    FeatureProducer featureProducer = C0N99.LIZ;
                                    FeatureProducer featureProducer2 = C0N99.LIZ;
                                    if (featureProducer2 == null) {
                                        return null;
                                    }
                                    return FeatureProducer.getFeature$default(featureProducer2, str, (JSONObject) null, "mlsdk_static", (ReturnCode) null, 10, (Object) null);
                                }
                            };
                        }
                        SmartPlaytimePredictService.Companion.getClass();
                        C1511150pQX.LIZ.checkAndInit();
                        ClientAIConfigCenter.LIZ.getClass();
                        ClientAIConfigCenter value = C0QQG.LIZIZ.getValue();
                        if (value != null) {
                            value.init();
                        }
                        SmartFeedPreloadService.Companion.getClass();
                        C1505530pHT.LIZ.checkAndInit();
                        SmartFeedLoadMoreService.Companion.getClass();
                        C1510990pQH.LIZ.checkAndInit();
                        C1511450pR1 c1511450pR1 = C1511450pR1.LIZ;
                        C1511450pR1.LIZIZ();
                        C1511440pR0.LIZ.LIZIZ();
                        SmartFeedAdUIService.Companion.getClass();
                        C1511140pQW.LIZ.checkAndInit();
                        C1519460pdw.LIZ();
                        C1511230pQf.LIZ.LIZIZ();
                        InterfaceC1513600pUU interfaceC1513600pUU = C1513230pTt.LIZIZ;
                        interfaceC1513600pUU.initialize();
                        interfaceC1513600pUU.LIZLLL();
                        SmartHARService.Companion.getClass();
                        C1511980pRs.LIZ().checkAndInit();
                        C1196304m9.LIZ = true;
                        SmartIdleDetectionService.Companion.getClass();
                        C1510730pPr.LIZ.getClass();
                        ISmartIdleDetectionService iSmartIdleDetectionService = C1510730pPr.LIZIZ;
                        if (iSmartIdleDetectionService != null) {
                            iSmartIdleDetectionService.start();
                        }
                        C2214201BlK.LIZLLL().LJJLJLI(new C09JN() { // from class: X.0NAM
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("MLCommonServiceImpl@9ab3.checkAndInitEmergency$background$1");
                                MLCommonServiceImpl mLCommonServiceImpl = this.LL;
                                ((Boolean) obj).booleanValue();
                                mLCommonServiceImpl.onNotifyCommonEvent("app_background", null);
                                C1C7U.LIZIZ("MLCommonServiceImpl@9ab3.checkAndInitEmergency$background$1");
                            }
                        });
                        onAppLaunch();
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C1AF0.LJFF(th2, "checkAndInit error, please check!!");
                        i2 = -2;
                    }
                    LIZJ();
                    C1513180pTo.LIZ = true;
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    C1510740pPs.LIZ.getClass();
                    C1510740pPs.LIZLLL = jCurrentTimeMillis2;
                    C1510740pPs.LJ = i2;
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                throw th3;
            }
        }
        if (i != 2) {
            return;
        }
        LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final boolean containFlashFeedConfig(String str) {
        C1509850pOR.LIZ.getClass();
        return C1509850pOR.LJ.containsKey(str);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final boolean containTTMFeatureScene(String str) {
        return C0XEN.LJIIIIZZ.LJI.contains(str);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onBeforeLoadMore(String str) {
        MLCommonService.Companion.getClass();
        if (TextUtils.equals("homepage_hot", str)) {
            C1510130pOt c1510130pOt = new C1510130pOt();
            c1510130pOt.LJ(str, "enterType");
            onNotifyCommonEvent("before_recommend_load_more", c1510130pOt);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void addCommonEventListener(String str, InterfaceC588340N5s interfaceC588340N5s) {
        C1511390pQv c1511390pQvLIZ = C1511420pQy.LIZ();
        if (c1511390pQvLIZ.LIZIZ.get(str) == null) {
            c1511390pQvLIZ.LIZIZ.put(str, new ArrayList<>());
        }
        ArrayList<InterfaceC588340N5s> arrayList = c1511390pQvLIZ.LIZIZ.get(str);
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    if (!arrayList.contains(interfaceC588340N5s)) {
                        arrayList.add(interfaceC588340N5s);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onNotifyCommonEvent(String str, C1510130pOt c1510130pOt) {
        ArrayList<InterfaceC588340N5s> arrayList = C1511420pQy.LIZ().LIZIZ.get(str);
        if (arrayList != null && (!arrayList.isEmpty())) {
            ArrayList arrayList2 = new ArrayList();
            synchronized (arrayList) {
                try {
                    arrayList2.addAll(arrayList);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C1510720pPq.LIZ(new ARunnableS14S1200000_9(arrayList2, c1510130pOt, str, 11));
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayFinishFirst(Aweme aweme, String str) {
        String aid;
        User author;
        MLCommonService.Companion.getClass();
        if (MLCommonService.debug) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPlayFinish enterType: ");
            sbLIZ.append(str);
            sbLIZ.append(" aweme:");
            String nickname = null;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            sbLIZ.append('-');
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                nickname = author.getNickname();
            }
            sbLIZ.append(nickname);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C1510720pPq.LIZ(new ARunnableS27S1200000_23(aweme, this, str, 5));
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayFirstFrame(final Aweme aweme, final String str) {
        String aid;
        User author;
        MLCommonService.Companion.getClass();
        if (MLCommonService.debug) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPlayFirstFrame enterType: ");
            sbLIZ.append(str);
            sbLIZ.append(" aweme:");
            String nickname = null;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            sbLIZ.append('-');
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                nickname = author.getNickname();
            }
            sbLIZ.append(nickname);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C1510720pPq.LIZ(new Runnable() { // from class: X.0pPj
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MLCommonServiceImpl@9ab3.onPlayFirstFrame$1");
                try {
                    this.onNotifyCommonEvent("play_first_frame", C1510150pOv.LIZIZ(aweme, str));
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MLCommonServiceImpl@9ab3.onPlayFirstFrame$1");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayResume(final Aweme aweme, final String str) {
        String aid;
        User author;
        MLCommonService.Companion.getClass();
        if (MLCommonService.debug) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPlayResume enterType: ");
            sbLIZ.append(str);
            sbLIZ.append(" aweme:");
            String nickname = null;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            sbLIZ.append('-');
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                nickname = author.getNickname();
            }
            sbLIZ.append(nickname);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C1510720pPq.LIZ(new Runnable() { // from class: X.0pPm
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MLCommonServiceImpl@9ab3.onPlayResume$1");
                try {
                    this.onNotifyCommonEvent("play_resume", C1510150pOv.LIZIZ(aweme, str));
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MLCommonServiceImpl@9ab3.onPlayResume$1");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void parseFeatureSet(HashMap<String, String> map, n nVar) {
        String str;
        Map<String, Set<String>> map2;
        Map<String, Set<String>> map3;
        Set<Integer> set;
        Set<String> set2;
        Map<String, Set<String>> map4;
        Map<String, Set<String>> map5;
        Set<Integer> set3;
        Set<String> set4;
        ApplogConfig applogConfig;
        String str2;
        List<FeatureGroup> list;
        try {
            HashMap map6 = new HashMap();
            HashMap map7 = new HashMap();
            k kVarLJJIIZ = nVar.LJJIIZ("feature_sets");
            char c = 0;
            int i = 1;
            if (kVarLJJIIZ != null) {
                Map map8 = (Map) C08JS.LIZIZ().LIZLLL(kVarLJJIIZ.LJIILIIL(), new TypeToken<Map<String, ? extends FeatureSetInfo>>() { // from class: X.04Y2
                }.getType());
                boolean z = false;
                for (String str3 : map8.keySet()) {
                    FeatureSetInfo featureSetInfo = (FeatureSetInfo) map8.get(str3);
                    if (featureSetInfo != null) {
                        int i2 = featureSetInfo.type;
                        if (i2 != 1) {
                            if (i2 == 3) {
                                C1508860pMq.LIZ.remove(str3);
                                map6.put(str3, "delete");
                            }
                        } else {
                            C1508860pMq.LIZ.put(str3, featureSetInfo.info);
                            map6.put(str3, featureSetInfo.info.version);
                        }
                        z = true;
                    }
                }
                map.put("featureset_incremental_detail", C786410Ut5.J3(new JSONObject(map6)));
                System.currentTimeMillis();
                for (String str4 : C1508860pMq.LIZ.keySet()) {
                    FeatureSetConfig featureSetConfig = C1508860pMq.LIZ.get(str4);
                    if (featureSetConfig != null && (list = featureSetConfig.features) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (FeatureGroup featureGroup : list) {
                            List<FeatureItem> list2 = featureGroup.features;
                            if (list2 != null) {
                                for (FeatureItem featureItem : list2) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(featureGroup.groupName);
                                    sbLIZ.append('.');
                                    sbLIZ.append(featureItem.name);
                                    arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
                                }
                            }
                        }
                        map7.put(str4, arrayList);
                    }
                }
                map.put("featureset_detail", C786410Ut5.J3(new JSONObject(map7)));
                if (z) {
                    String strLJIILL = C08JS.LIZIZ().LJIILL(C1508860pMq.LIZ);
                    if (strLJIILL != null) {
                        C0R1F.LIZLLL("feature_set_info", strLJIILL);
                    }
                    C1509850pOR.LIZ.LIZ();
                }
            }
            k kVarLJJIIZ2 = nVar.LJJIIZ("client_ai_feature_upload_configs");
            if (kVarLJJIIZ2 != null) {
                h hVarLJIIL = kVarLJJIIZ2.LJIIL();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                Iterator<k> it2 = hVarLJIIL.iterator();
                while (it2.hasNext()) {
                    FlashCommonConfig flashCommonConfig = (FlashCommonConfig) C08JS.LIZIZ().LIZLLL(it2.next().LJIILIIL(), new TypeToken<FlashCommonConfig>() { // from class: X.04Zj
                    }.getType());
                    int i3 = flashCommonConfig.type;
                    if (i3 != 0) {
                        if (i3 != i) {
                            if (i3 == 2 && (applogConfig = flashCommonConfig.applogConfig) != null && (str2 = applogConfig.event) != null) {
                                if (linkedHashMap4.get(str2) == null) {
                                    FlashCommonConfig[] flashCommonConfigArr = new FlashCommonConfig[i];
                                    flashCommonConfigArr[c] = flashCommonConfig;
                                    linkedHashMap4.put(str2, C1697810uHb.LJIILJJIL(flashCommonConfigArr));
                                } else {
                                    List list3 = (List) linkedHashMap4.get(str2);
                                    if (list3 != null) {
                                        list3.add(flashCommonConfig);
                                    }
                                }
                            }
                        } else {
                            UrlConfig urlConfig = flashCommonConfig.urlConfig;
                            if (urlConfig != null) {
                                String str5 = urlConfig.url;
                                String str6 = urlConfig.paramsKey;
                                if (urlConfig.changeType == i) {
                                    str = "String";
                                } else {
                                    str = null;
                                }
                                linkedHashMap2.put(str5, new FlashCommonFreeRideApiConfig(str5, str6, str, urlConfig.positionType, urlConfig.reWriteField));
                                FilterConfig filterConfig = flashCommonConfig.filterConfig;
                                if (filterConfig != null) {
                                    map2 = filterConfig.headerFilter;
                                    map3 = filterConfig.queryFilter;
                                    set = filterConfig.indexFilter;
                                    set2 = filterConfig.customFilter;
                                } else {
                                    map2 = null;
                                    map3 = null;
                                    set = null;
                                    set2 = null;
                                }
                                com.ss.android.ugc.aweme.ml.feature.flash.FilterConfig filterConfig2 = new com.ss.android.ugc.aweme.ml.feature.flash.FilterConfig(map2, map3, set, set2);
                                FilterConfig filterConfig3 = flashCommonConfig.notFilterConfig;
                                if (filterConfig3 != null) {
                                    map4 = filterConfig3.headerFilter;
                                    map5 = filterConfig3.queryFilter;
                                    set3 = filterConfig3.indexFilter;
                                    set4 = filterConfig3.customFilter;
                                } else {
                                    map4 = null;
                                    map5 = null;
                                    set3 = null;
                                    set4 = null;
                                }
                                com.ss.android.ugc.aweme.ml.feature.flash.FilterConfig filterConfig4 = new com.ss.android.ugc.aweme.ml.feature.flash.FilterConfig(map4, map5, set3, set4);
                                ArrayList arrayList2 = new ArrayList();
                                for (FlashFeatureSetConfig flashFeatureSetConfig : flashCommonConfig.featureSetConfig) {
                                    arrayList2.add(new FlashFreeRideFeatureConfig(flashFeatureSetConfig.paramsKey, flashFeatureSetConfig.featureSet, false));
                                }
                                String str7 = flashCommonConfig.name;
                                if (str7 != null) {
                                    linkedHashMap3.put(str7, new FlashFreeRideConfig(str5, filterConfig2, filterConfig4, arrayList2));
                                    List<FlashFeatureSetConfig> list4 = flashCommonConfig.featureSetConfig;
                                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list4, 10));
                                    Iterator<FlashFeatureSetConfig> it3 = list4.iterator();
                                    while (it3.hasNext()) {
                                        arrayList3.add(it3.next().featureSet);
                                    }
                                    linkedHashMap5.put(str7, arrayList3);
                                }
                            }
                        }
                    } else {
                        String str8 = flashCommonConfig.name;
                        if (str8 != null) {
                            linkedHashMap.put(str8, flashCommonConfig.featureSetConfig);
                            List<FlashFeatureSetConfig> list5 = flashCommonConfig.featureSetConfig;
                            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list5, 10));
                            Iterator<FlashFeatureSetConfig> it4 = list5.iterator();
                            while (it4.hasNext()) {
                                arrayList4.add(it4.next().featureSet);
                            }
                            linkedHashMap5.put(str8, arrayList4);
                        }
                    }
                    c = 0;
                    i = 1;
                }
                map.put("feature_upload_details", C786410Ut5.J3(new JSONObject(linkedHashMap5)));
                String strLJIILL2 = C08JS.LIZIZ().LJIILL(linkedHashMap);
                if (strLJIILL2 != null) {
                    C0R1F.LIZLLL("flash_feed_feature_set", strLJIILL2);
                    C1509850pOR.LIZ.LJFF(i);
                }
                String strLJIILL3 = C08JS.LIZIZ().LJIILL(linkedHashMap2);
                if (strLJIILL3 != null) {
                    C0R1F.LIZLLL("flash_link_config", strLJIILL3);
                }
                String strLJIILL4 = C08JS.LIZIZ().LJIILL(linkedHashMap3);
                if (strLJIILL4 != null) {
                    C0R1F.LIZLLL("flash_free_ride_config", strLJIILL4);
                    FeatureInsertHandler featureInsertHandler = FeatureInsertHandler.LIZ;
                    featureInsertHandler.LJ(i);
                    featureInsertHandler.LIZIZ(i);
                }
                String strLJIILL5 = C08JS.LIZIZ().LJIILL(linkedHashMap4);
                if (strLJIILL5 != null) {
                    C0R1F.LIZLLL("flash_applog_config", strLJIILL5);
                }
            }
            k kVarLJJIIZ3 = nVar.LJJIIZ("client_ai_feature_set_raw_configs");
            if (kVarLJJIIZ3 != null) {
                h hVarLJIIL2 = kVarLJJIIZ3.LJIIL();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                Iterator<k> it5 = hVarLJIIL2.iterator();
                while (it5.hasNext()) {
                    FeatureSetRawInfo featureSetRawInfo = (FeatureSetRawInfo) C08JS.LIZIZ().LIZLLL(it5.next(), new TypeToken<FeatureSetRawInfo>() { // from class: X.0pQ2
                    }.getType());
                    linkedHashMap6.put(featureSetRawInfo.name, featureSetRawInfo.featureSetName);
                }
                String strLJIILL6 = C08JS.LIZIZ().LJIILL(linkedHashMap6);
                if (strLJIILL6 != null) {
                    C0R1F.LIZLLL("raw_dataset", strLJIILL6);
                }
                map.put("feature_set_raw_details", C786410Ut5.J3(new JSONObject(linkedHashMap6)));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1337780kuu.LIZ(e, null, 6);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void removeCommonEventListener(String str, InterfaceC588340N5s interfaceC588340N5s) {
        ArrayList<InterfaceC588340N5s> arrayList = C1511420pQy.LIZ().LIZIZ.get(str);
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    arrayList.remove(interfaceC588340N5s);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void reportEvent(String str, JSONObject jSONObject) {
        C20684815ws.LJIJ(str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void updateFeedItemFeatureInfo(Aweme aweme, Map<String, ? extends Object> map) throws JSONException {
        if (map.containsKey("block_count") || map.containsKey("video_bitrate") || map.containsKey("start_playing_timestamp")) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.put("group_id", aweme.getAid());
            C1513180pTo.LIZ("feed_item_extra_info", jSONObject);
        }
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            AbstractC1509490pNr abstractC1509490pNrLIZ = C1509430pNl.LIZ(aweme);
            if (abstractC1509490pNrLIZ != null) {
                abstractC1509490pNrLIZ.setFeature(key, value);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayPause(final Aweme aweme, final String str, final boolean z) {
        String aid;
        User author;
        MLCommonService.Companion.getClass();
        if (MLCommonService.debug) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPlayPause enterType: ");
            sbLIZ.append(str);
            sbLIZ.append(" isPagePaused:");
            sbLIZ.append(z);
            sbLIZ.append(" aweme:");
            String nickname = null;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            sbLIZ.append('-');
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                nickname = author.getNickname();
            }
            sbLIZ.append(nickname);
            sbLIZ.append(" isAppBackground:");
            sbLIZ.append(C2214201BlK.LJIIJJI);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C1510720pPq.LIZ(new Runnable() { // from class: X.0pPi
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MLCommonServiceImpl@9ab3.onPlayPause$1");
                try {
                    C1510130pOt c1510130pOtLIZIZ = C1510150pOv.LIZIZ(aweme, str);
                    c1510130pOtLIZIZ.LJ(Boolean.valueOf(z), "pauseEventIsPagePaused");
                    this.onNotifyCommonEvent("play_pause", c1510130pOtLIZIZ);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MLCommonServiceImpl@9ab3.onPlayPause$1");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayStop(final String str, final Aweme aweme, final String str2) {
        String nickname;
        String aid;
        User author;
        Aweme awemeLIZ;
        User author2;
        MLCommonService.Companion.getClass();
        if (MLCommonService.debug) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPlayStop enterType: ");
            sbLIZ.append(str2);
            sbLIZ.append(" stopAweme:");
            sbLIZ.append(str);
            sbLIZ.append('-');
            String nickname2 = null;
            if (this.LIZ != null && (awemeLIZ = C581560MrS.LIZ(str)) != null && (author2 = awemeLIZ.getAuthor()) != null) {
                nickname = author2.getNickname();
            } else {
                nickname = null;
            }
            sbLIZ.append(nickname);
            sbLIZ.append(" curAweme:");
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            sbLIZ.append('-');
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                nickname2 = author.getNickname();
            }
            sbLIZ.append(nickname2);
            sbLIZ.append("  isAppBackground:");
            sbLIZ.append(C2214201BlK.LJIIJJI);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C1510720pPq.LIZ(new Runnable() { // from class: X.0pPg
            public final void LIZ() {
                C1510130pOt c1510130pOtLIZIZ = C1510150pOv.LIZIZ(this.LIZ != null ? C581560MrS.LIZ(str) : null, str2);
                c1510130pOtLIZIZ.LJ(aweme, "stopEventCurAweme");
                this.onNotifyCommonEvent("play_stop", c1510130pOtLIZIZ);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MLCommonServiceImpl@9ab3.onPlayStop$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MLCommonServiceImpl@9ab3.onPlayStop$1");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayStopCallPlayTime(final Aweme aweme, final long j, final String str) {
        String aid;
        User author;
        MLCommonService.Companion.getClass();
        if (MLCommonService.debug) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPlayStopCallPlayTime enterType: ");
            sbLIZ.append(str);
            sbLIZ.append(" duration:");
            sbLIZ.append(j);
            sbLIZ.append(" aweme:");
            String nickname = null;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            sbLIZ.append('-');
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                nickname = author.getNickname();
            }
            sbLIZ.append(nickname);
            sbLIZ.append(" isAppBackground:");
            sbLIZ.append(C2214201BlK.LJIIJJI);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C1510720pPq.LIZ(new Runnable() { // from class: X.0pPh
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MLCommonServiceImpl@9ab3.onPlayStopCallPlayTime$1");
                try {
                    C1510130pOt c1510130pOtLIZIZ = C1510150pOv.LIZIZ(aweme, str);
                    c1510130pOtLIZIZ.LJ(Long.valueOf(j), "playTimeEventDuration");
                    this.onNotifyCommonEvent("play_call_playtime", c1510130pOtLIZIZ);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MLCommonServiceImpl@9ab3.onPlayStopCallPlayTime$1");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayPrepare(final Aweme aweme, final String str, final String str2, InterfaceC582820MtU interfaceC582820MtU) {
        String aid;
        User author;
        this.LIZIZ++;
        if (!Intrinsics.LJFF(interfaceC582820MtU, this.LIZ)) {
            this.LIZ = interfaceC582820MtU;
        }
        MLCommonService.Companion.getClass();
        if (MLCommonService.debug) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPlayPrepare enterType: ");
            sbLIZ.append(str);
            sbLIZ.append(" aweme:");
            String nickname = null;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            sbLIZ.append('-');
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                nickname = author.getNickname();
            }
            sbLIZ.append(nickname);
            sbLIZ.append(" hasEmergencyInited:");
            sbLIZ.append(this.LIZLLL);
            sbLIZ.append(" prepareCount:");
            sbLIZ.append(this.LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (!this.LIZLLL) {
            if (((Boolean) C285090BFj.LJJJJLI.getValue()).booleanValue()) {
                if (C0CN5.LJII()) {
                    C15O7.LIZJ(new CallableC1510670pPl(aweme, this, str, str2));
                    return;
                } else {
                    C1BCA.LJIJJLI(EnumC312610CNf.SATRTUP, new InterfaceC1006670cIr<C1602200rnO>() { // from class: X.0pPn
                        @Override // X.InterfaceC1006670cIr
                        public final void LJIIJ(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
                            if (c1602200rnO2.LIZJ()) {
                                MLCommonServiceImpl mLCommonServiceImpl = this;
                                Aweme aweme2 = aweme;
                                String str3 = str;
                                String str4 = str2;
                                mLCommonServiceImpl.getClass();
                                C15O7.LIZJ(new CallableC1510670pPl(aweme2, mLCommonServiceImpl, str3, str4));
                                C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, this);
                            }
                        }
                    });
                    return;
                }
            }
            C15O7.LIZJ(new CallableC1510670pPl(aweme, this, str, str2));
            return;
        }
        C1510130pOt c1510130pOtLIZIZ = C1510150pOv.LIZIZ(aweme, str);
        if (str2 != null) {
            c1510130pOtLIZIZ.LJ(str2, "enter_from");
        }
        onNotifyCommonEvent("play_prepare", c1510130pOtLIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onViewPagerSelected(Aweme aweme, String str, int i, JSONObject jSONObject) {
        String aid;
        User author;
        MLCommonService.Companion.getClass();
        if (MLCommonService.debug) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onViewPagerSelected enterType: ");
            sbLIZ.append(str);
            sbLIZ.append(" aweme:");
            String nickname = null;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            sbLIZ.append('-');
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                nickname = author.getNickname();
            }
            sbLIZ.append(nickname);
            sbLIZ.append(" position:");
            sbLIZ.append(i);
            sbLIZ.append(" slideTouchInfo:");
            sbLIZ.append(jSONObject);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C1510130pOt c1510130pOt = new C1510130pOt();
        c1510130pOt.LJ(str, "enterType");
        c1510130pOt.LJ(Integer.valueOf(i), "pageSelectedPosition");
        c1510130pOt.LJ(jSONObject, "pageSelectedSlideTouchInfo");
        onNotifyCommonEvent("on_view_pager_selected", c1510130pOt);
    }
}
