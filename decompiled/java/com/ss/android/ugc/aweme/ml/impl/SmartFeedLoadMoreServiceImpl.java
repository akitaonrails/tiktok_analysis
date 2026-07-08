package com.ss.android.ugc.aweme.ml.impl;

import X.C0C64;
import X.C0N33;
import X.C1217604pa;
import X.C1337780kuu;
import X.C1511050pQN;
import X.C1511110pQT;
import X.C1511150pQX;
import X.C1511160pQY;
import X.C1511690pRP;
import X.C1512970pTT;
import X.C2188811AlT;
import X.C2280591EOj;
import X.C238400w2;
import X.EnumC1512990pTV;
import X.InterfaceC1511020pQK;
import X.InterfaceC1511190pQb;
import Y.ARunnableS23S0101000_12;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ml.ab.FeedLoadMorePlan;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictConfig;
import com.ss.android.ugc.aweme.ml.ab.SmartFeedLoadMoreExperiment$FeedLoadMoreMLModel;
import com.ss.android.ugc.aweme.ml.ab.SmartFeedLoadMoreStrategyConfig;
import com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService;
import com.ss.android.ugc.aweme.ml.impl.SmartFeedLoadMoreServiceImpl;
import com.ss.android.ugc.aweme.ml.infra.FeaturePhoneTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.FeaturePlayTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.MLSdkConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartClassifySceneConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService;
import com.ss.android.ugc.aweme.ml.infra.SmartSdkConfig;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartFeedLoadMoreServiceImpl extends SmartFeedLoadMoreService {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public boolean LIZIZ;
    public boolean LIZLLL;
    public boolean LJ;
    public int LJFF;
    public boolean LJI;
    public SmartFeedLoadMoreExperiment$FeedLoadMoreMLModel LJII;
    public final int LIZ = 3;
    public final LruCache<String, C1511050pQN> LIZJ = new LruCache<>(4);

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService, com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public final void checkAndInit() {
        MLSdkConfig mlSdkConfig;
        SmartFeedLoadMoreExperiment$FeedLoadMoreMLModel smartFeedLoadMoreExperiment$FeedLoadMoreMLModel;
        if (this.LJI) {
            return;
        }
        this.LJI = true;
        SmartFeedLoadMoreExperiment$FeedLoadMoreMLModel smartFeedLoadMoreExperiment$FeedLoadMoreMLModel2 = null;
        if (!C1511160pQY.LIZ) {
            SmartFeedLoadMoreExperiment$FeedLoadMoreMLModel smartFeedLoadMoreExperiment$FeedLoadMoreMLModel3 = (SmartFeedLoadMoreExperiment$FeedLoadMoreMLModel) C0C64.LJIILLIIL().LJJII(SmartFeedLoadMoreExperiment$FeedLoadMoreMLModel.class, null, "feed_load_more_ml", true);
            C1511160pQY.LIZIZ = smartFeedLoadMoreExperiment$FeedLoadMoreMLModel3;
            if (smartFeedLoadMoreExperiment$FeedLoadMoreMLModel3 == null) {
                C2280591EOj.LIZ.getClass();
                C1511110pQT.LIZ.getClass();
                if (C1511110pQT.LIZ() && C2280591EOj.LIZJ.contains(C2280591EOj.LIZIZ)) {
                    smartFeedLoadMoreExperiment$FeedLoadMoreMLModel = new SmartFeedLoadMoreExperiment$FeedLoadMoreMLModel();
                    smartFeedLoadMoreExperiment$FeedLoadMoreMLModel.scene = "feed_load_more_ml";
                    smartFeedLoadMoreExperiment$FeedLoadMoreMLModel.packageUrl = "https://sf16-va.tiktokcdn.com/obj/ml-obj/loadmore_540_v3.zip";
                    smartFeedLoadMoreExperiment$FeedLoadMoreMLModel.params = new int[]{10};
                    smartFeedLoadMoreExperiment$FeedLoadMoreMLModel.type = 3;
                    smartFeedLoadMoreExperiment$FeedLoadMoreMLModel.countWhenExecute = 5;
                    smartFeedLoadMoreExperiment$FeedLoadMoreMLModel.runDelay = 0;
                } else {
                    smartFeedLoadMoreExperiment$FeedLoadMoreMLModel = null;
                }
                C1511160pQY.LIZIZ = smartFeedLoadMoreExperiment$FeedLoadMoreMLModel;
            }
            SmartFeedLoadMoreExperiment$FeedLoadMoreMLModel smartFeedLoadMoreExperiment$FeedLoadMoreMLModel4 = C1511160pQY.LIZIZ;
            if (smartFeedLoadMoreExperiment$FeedLoadMoreMLModel4 != null) {
                int[] iArr = smartFeedLoadMoreExperiment$FeedLoadMoreMLModel4.params;
                if (iArr != null && iArr.length > 0) {
                    C1511160pQY.LIZJ = iArr[0];
                }
                C1511160pQY.LIZLLL = smartFeedLoadMoreExperiment$FeedLoadMoreMLModel4.countWhenExecute;
                C1511160pQY.LJ = smartFeedLoadMoreExperiment$FeedLoadMoreMLModel4.runDelay;
                C1511160pQY.LJFF = smartFeedLoadMoreExperiment$FeedLoadMoreMLModel4.loadModelBefore;
                C1511160pQY.LJI = smartFeedLoadMoreExperiment$FeedLoadMoreMLModel4.skipCount;
                if (smartFeedLoadMoreExperiment$FeedLoadMoreMLModel4.features == null) {
                    InputFeaturesConfig inputFeaturesConfig = new InputFeaturesConfig();
                    FeaturePlayTypeConfig featurePlayTypeConfig = new FeaturePlayTypeConfig();
                    featurePlayTypeConfig.setEnable(true);
                    featurePlayTypeConfig.setRange(C1511160pQY.LIZJ);
                    featurePlayTypeConfig.setSubType("");
                    inputFeaturesConfig.setFTypePlay(featurePlayTypeConfig);
                    featurePlayTypeConfig.setRangeExcludeThis(true);
                    if (((Boolean) C1217604pa.LIZ.getValue()).booleanValue()) {
                        FeaturePhoneTypeConfig featurePhoneTypeConfig = new FeaturePhoneTypeConfig();
                        featurePhoneTypeConfig.setEnable(true);
                        featurePhoneTypeConfig.setSubType("country|hour|loadmore_latency");
                        inputFeaturesConfig.setFTypePhone(featurePhoneTypeConfig);
                    }
                    C1511160pQY.LIZIZ.features = inputFeaturesConfig;
                }
            }
            C1511160pQY.LIZ = true;
        }
        SmartFeedLoadMoreExperiment$FeedLoadMoreMLModel smartFeedLoadMoreExperiment$FeedLoadMoreMLModel5 = C1511160pQY.LIZIZ;
        if (smartFeedLoadMoreExperiment$FeedLoadMoreMLModel5 != null) {
            SmartClassifySceneConfig smartClassifySceneConfig = new SmartClassifySceneConfig();
            smartClassifySceneConfig.setScene("feed_load_more_ml");
            smartClassifySceneConfig.setFeatures(smartFeedLoadMoreExperiment$FeedLoadMoreMLModel5.features);
            smartClassifySceneConfig.setSdkConfig(new SmartSdkConfig());
            smartClassifySceneConfig.setTrack(smartFeedLoadMoreExperiment$FeedLoadMoreMLModel5.track);
            String str = smartFeedLoadMoreExperiment$FeedLoadMoreMLModel5.engineType;
            if (Intrinsics.LJFF(str, "mlsdk")) {
                SmartSdkConfig sdkConfig = smartClassifySceneConfig.getSdkConfig();
                if (sdkConfig != null) {
                    sdkConfig.setMlSdkConfig(new MLSdkConfig());
                }
                SmartSdkConfig sdkConfig2 = smartClassifySceneConfig.getSdkConfig();
                if (sdkConfig2 != null && (mlSdkConfig = sdkConfig2.getMlSdkConfig()) != null) {
                    mlSdkConfig.setPackageUrl(smartFeedLoadMoreExperiment$FeedLoadMoreMLModel5.packageUrl);
                }
                SmartSdkConfig sdkConfig3 = smartClassifySceneConfig.getSdkConfig();
                if (sdkConfig3 != null) {
                    sdkConfig3.setEngineType("mlsdk");
                }
            } else {
                if (!Intrinsics.LJFF(str, "pitaya_ml")) {
                    return;
                }
                SmartSdkConfig sdkConfig4 = smartClassifySceneConfig.getSdkConfig();
                if (sdkConfig4 != null) {
                    sdkConfig4.setPitayaMLConfig(smartFeedLoadMoreExperiment$FeedLoadMoreMLModel5.pitayaMLConfig);
                }
                SmartSdkConfig sdkConfig5 = smartClassifySceneConfig.getSdkConfig();
                if (sdkConfig5 != null) {
                    sdkConfig5.setEngineType("pitaya_ml");
                }
            }
            OnePlaytimePredictConfig onePlaytimePredictConfig = new OnePlaytimePredictConfig();
            onePlaytimePredictConfig.setSceneConfig(smartClassifySceneConfig);
            onePlaytimePredictConfig.setRealConfig(smartFeedLoadMoreExperiment$FeedLoadMoreMLModel5.realConfig);
            onePlaytimePredictConfig.setTrigger(0);
            onePlaytimePredictConfig.setRunDelay(smartFeedLoadMoreExperiment$FeedLoadMoreMLModel5.runDelay);
            SmartPlaytimePredictService.Companion.getClass();
            C1511150pQX.LIZ.configOneNewService(onePlaytimePredictConfig);
            smartFeedLoadMoreExperiment$FeedLoadMoreMLModel2 = smartFeedLoadMoreExperiment$FeedLoadMoreMLModel5;
        }
        this.LJII = smartFeedLoadMoreExperiment$FeedLoadMoreMLModel2;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService
    public final boolean enable() {
        if (this.LJII == null) {
            return false;
        }
        SmartPlaytimePredictService.Companion.getClass();
        return C1511150pQX.LIZ.enable("feed_load_more_ml");
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService
    public final void ensureEvaluatorAvailable() {
        if (this.LJII != null) {
            SmartPlaytimePredictService.Companion.getClass();
            C1511150pQX.LIZ.ensureEnvAvailable("feed_load_more_ml");
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService, com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public final boolean isSmartFeedLoadMoreScene(String str) {
        return Intrinsics.LJFF("homepage_hot", str);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService, com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public final void startSmartFeedLoadMoreJudge(final Aweme aweme, final InterfaceC1511020pQK interfaceC1511020pQK) {
        final int countWhenExecute;
        if (aweme == null) {
            return;
        }
        SmartFeedLoadMoreService.Companion.getClass();
        if (enable()) {
            this.LIZIZ = true;
            this.LIZLLL = false;
            C0N33 c0n33 = new C0N33();
            c0n33.LJIIJ = aweme;
            if (C1512970pTT.LIZ(((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).getEffectiveConnectionType())) {
                countWhenExecute = ((EnumC1512990pTV) C1512970pTT.LIZIZ.getValue()).getCountWhenExecute();
            } else {
                countWhenExecute = C1511160pQY.LIZLLL;
            }
            SmartPlaytimePredictService.Companion.getClass();
            C1511150pQX.LIZ.predict("feed_load_more_ml", c0n33, null, new InterfaceC1511190pQb() { // from class: X.0pQL
                @Override // X.InterfaceC1511190pQb
                public final void LIZ(boolean z, int i, C1511340pQq c1511340pQq, C0N33 c0n332) {
                    long jCurrentTimeMillis;
                    float fFloatValue;
                    FeedLoadMorePlan plan;
                    String str;
                    HashMap<Boolean, String> map;
                    SmartFeedLoadMoreServiceImpl smartFeedLoadMoreServiceImpl = this.LIZ;
                    smartFeedLoadMoreServiceImpl.LIZIZ = false;
                    if (z && c1511340pQq != null && c1511340pQq.LIZIZ != null) {
                        SmartFeedLoadMoreService.Companion.getClass();
                        boolean z2 = SmartFeedLoadMoreService.debug;
                        if (z2) {
                            jCurrentTimeMillis = System.currentTimeMillis();
                        } else {
                            jCurrentTimeMillis = 0;
                        }
                        String str2 = c1511340pQq.LIZIZ;
                        if (str2 == null) {
                            str2 = "";
                        }
                        Float fLIZJ = c1511340pQq.LIZJ();
                        if (fLIZJ != null) {
                            fFloatValue = fLIZJ.floatValue();
                        } else {
                            fFloatValue = -1.0f;
                        }
                        C1511050pQN c1511050pQN = this.LIZ.LIZJ.get(aweme.getAid());
                        if (c1511050pQN != null) {
                            c1511050pQN.LIZ = fFloatValue;
                            c1511050pQN.LIZIZ = str2;
                        }
                        SmartFeedLoadMoreStrategyConfig smartFeedLoadMoreStrategyConfigLIZ = C1485730olX.LIZ();
                        String nickname = null;
                        if (smartFeedLoadMoreStrategyConfigLIZ != null) {
                            plan = smartFeedLoadMoreStrategyConfigLIZ.getPlan(str2);
                        } else {
                            plan = null;
                        }
                        InterfaceC1511020pQK interfaceC1511020pQK2 = interfaceC1511020pQK;
                        if (interfaceC1511020pQK2 != null && plan != null) {
                            boolean preload = plan.getPreload();
                            int delay = plan.getDelay();
                            int i2 = countWhenExecute;
                            FullFeedFragmentPanel fullFeedFragmentPanel = ((C1511060pQO) interfaceC1511020pQK2).LIZ;
                            if (fullFeedFragmentPanel.LLLII != null) {
                                SmartFeedLoadMoreService.getDebug();
                                if (preload) {
                                    fullFeedFragmentPanel.postDelayed(new ARunnableS23S0101000_12(i2, fullFeedFragmentPanel, 19), delay);
                                    if (C1485730olX.LIZJ && (map = C1485730olX.LIZLLL) != null) {
                                        str = map.get(Boolean.valueOf(preload));
                                    } else {
                                        str = null;
                                    }
                                    if (!TextUtils.isEmpty(str)) {
                                        C1478160oZK.LIZ().LJI(str);
                                    }
                                    SmartFeedLoadMoreService.getDebug();
                                }
                            }
                        }
                        if (z2) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("startSmartFeedLoadMoreJudge aid:");
                            sbLIZ.append(aweme.getAid());
                            sbLIZ.append('-');
                            User author = aweme.getAuthor();
                            if (author != null) {
                                nickname = author.getNickname();
                            }
                            sbLIZ.append(nickname);
                            sbLIZ.append(" out:");
                            sbLIZ.append(str2);
                            sbLIZ.append(" probability:");
                            sbLIZ.append(fFloatValue);
                            sbLIZ.append(" outCost:");
                            sbLIZ.append(jCurrentTimeMillis2);
                            sbLIZ.append(" plan:");
                            sbLIZ.append(plan);
                            C2188811AlT.LIZIZ(sbLIZ);
                            return;
                        }
                        return;
                    }
                    smartFeedLoadMoreServiceImpl.LIZLLL = true;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService, com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public final void addVideoPlayEndReportData(HashMap<String, Object> map, Aweme aweme, Integer num) {
        if (aweme == null || num == null || !enable() || num.intValue() != 0 || aweme.getAid() == null) {
            return;
        }
        C1511050pQN c1511050pQN = this.LIZJ.get(aweme.getAid());
        if (c1511050pQN != null) {
            float f = c1511050pQN.LIZ;
            if (f >= 0.0f) {
                map.put("lp_predict", Float.valueOf(f));
            }
            String str = c1511050pQN.LIZIZ;
            if (str != null) {
                map.put("lp_predictL", str);
            }
            int i = c1511050pQN.LIZJ;
            if (i >= 0) {
                map.put("left_videos_cnt", Integer.valueOf(i));
            }
        }
        SmartFeedLoadMoreService.Companion.getClass();
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService
    public final void addVideoPlayEndReportData(JSONObject jSONObject, Aweme aweme, Integer num) throws JSONException {
        if (aweme != null && num != null && enable() && num.intValue() == 0) {
            C1511050pQN c1511050pQN = this.LIZJ.get(aweme.getAid());
            if (c1511050pQN != null) {
                float f = c1511050pQN.LIZ;
                if (f >= 0.0f) {
                    jSONObject.put("lp_predict", Float.valueOf(f));
                }
                String str = c1511050pQN.LIZIZ;
                if (str != null) {
                    jSONObject.put("lp_predictL", str);
                }
                int i = c1511050pQN.LIZJ;
                if (i >= 0) {
                    jSONObject.put("left_videos_cnt", i);
                }
            }
            SmartFeedLoadMoreService.Companion.getClass();
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService, com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public final boolean needCheckLoadMore(int i, int i2, Aweme aweme, Aweme aweme2) {
        String nickname;
        boolean z;
        String nickname2;
        int i3;
        if (aweme == null) {
            return false;
        }
        try {
            if (enable()) {
                int i4 = i2 - i;
                int i5 = C1511160pQY.LIZLLL;
                int i6 = C1511160pQY.LJI;
                boolean z2 = true;
                if (i6 > 0 && (i3 = this.LJFF) < i6) {
                    this.LJFF = i3 + 1;
                    z = true;
                } else {
                    z = false;
                }
                if (!this.LIZIZ && i5 > 0 && !z) {
                    if (i4 != i5) {
                        if (i4 != i5 + 1 && i4 != i5 + 2) {
                            if (i4 >= i5 || !this.LIZLLL || i4 <= this.LIZ) {
                            }
                        } else if (C1511160pQY.LJFF && !this.LJ) {
                            this.LJ = true;
                            final C238400w2 c238400w2 = new C238400w2();
                            SmartFeedLoadMoreService.Companion.getClass();
                            if (SmartFeedLoadMoreService.debug) {
                                c238400w2.element = System.currentTimeMillis();
                            }
                            C1511690pRP.LIZJ(C1511160pQY.LJ, new Runnable() { // from class: X.0pQI
                                public final void LIZ() {
                                    C1511010pQJ c1511010pQJ = SmartFeedLoadMoreService.Companion;
                                    c1511010pQJ.getClass();
                                    boolean z3 = SmartFeedLoadMoreService.debug;
                                    long jCurrentTimeMillis = z3 ? System.currentTimeMillis() : 0L;
                                    this.LL.ensureEvaluatorAvailable();
                                    c1511010pQJ.getClass();
                                    if (z3) {
                                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                        long jCurrentTimeMillis3 = System.currentTimeMillis() - c238400w2.element;
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("checkAndEnsureEvaluatorAvailable called cost:");
                                        sbLIZ.append(jCurrentTimeMillis2);
                                        sbLIZ.append(" costTotal:");
                                        sbLIZ.append(jCurrentTimeMillis3);
                                        C2188811AlT.LIZIZ(sbLIZ);
                                    }
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("SmartFeedLoadMoreServiceImpl@eee.checkAndEnsureEvaluatorAvailable$1");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("SmartFeedLoadMoreServiceImpl@eee.checkAndEnsureEvaluatorAvailable$1");
                                }
                            });
                        }
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                String aid = aweme.getAid();
                if (aid == null) {
                    return false;
                }
                C1511050pQN c1511050pQN = this.LIZJ.get(aid);
                if (c1511050pQN == null) {
                    c1511050pQN = new C1511050pQN();
                    c1511050pQN.LIZJ = i4;
                    this.LIZJ.put(aid, c1511050pQN);
                } else if (c1511050pQN.LIZ >= 0.0f) {
                    z2 = false;
                }
                SmartFeedLoadMoreService.Companion.getClass();
                if (SmartFeedLoadMoreService.debug) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("needCheckLoadMore aid:");
                    sbLIZ.append(aid);
                    sbLIZ.append('-');
                    User author = aweme.getAuthor();
                    if (author != null) {
                        nickname2 = author.getNickname();
                    } else {
                        nickname2 = null;
                    }
                    sbLIZ.append(nickname2);
                    sbLIZ.append(" enable:true remainder:");
                    sbLIZ.append(i4);
                    sbLIZ.append(" need:");
                    sbLIZ.append(z2);
                    sbLIZ.append(" skipTimes:");
                    sbLIZ.append(this.LJFF);
                    sbLIZ.append(" skipCount:");
                    sbLIZ.append(i6);
                    sbLIZ.append(" lastRunFailed:");
                    sbLIZ.append(this.LIZLLL);
                    sbLIZ.append(" curIndex:");
                    sbLIZ.append(i);
                    sbLIZ.append(" count:");
                    sbLIZ.append(i2);
                    sbLIZ.append(" isRunning:");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(" lpPredict:");
                    sbLIZ.append(c1511050pQN.LIZ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    return z2;
                }
                return z2;
            }
            SmartFeedLoadMoreService.Companion.getClass();
            if (!SmartFeedLoadMoreService.debug) {
                return false;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("needCheckLoadMore aid:");
            sbLIZ2.append(aweme.getAid());
            sbLIZ2.append('-');
            User author2 = aweme.getAuthor();
            if (author2 != null) {
                nickname = author2.getNickname();
            } else {
                nickname = null;
            }
            sbLIZ2.append(nickname);
            sbLIZ2.append(" enable:false hasCheckAndInited:");
            sbLIZ2.append(this.LJI);
            C2188811AlT.LIZIZ(sbLIZ2);
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1337780kuu.LIZ(th, null, 6);
            return false;
        }
    }
}
