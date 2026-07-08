package com.ss.android.ugc.aweme.ml.impl;

import X.C070Q;
import X.C0C2O;
import X.C0C64;
import X.C0CAM;
import X.C0N33;
import X.C0VTN;
import X.C1217604pa;
import X.C13BV;
import X.C13LQ;
import X.C1505490pHP;
import X.C1511110pQT;
import X.C1511120pQU;
import X.C1511130pQV;
import X.C1511150pQX;
import X.C1511690pRP;
import X.C15O7;
import X.C2104708Mj;
import X.C2280591EOj;
import X.C238400w2;
import X.InterfaceC1511190pQb;
import Y.ACallableS428S0100000_23;
import Y.ARunnableS92S0200000_23;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictConfig;
import com.ss.android.ugc.aweme.ml.ab.SmartPreloadExperiment$SmartPreloadModel;
import com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadResultListener;
import com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService;
import com.ss.android.ugc.aweme.ml.impl.SmartFeedPreloadServiceImpl;
import com.ss.android.ugc.aweme.ml.infra.FeatureFeedTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.FeaturePhoneTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.FeaturePlayTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.MLSdkConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartClassifySceneConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService;
import com.ss.android.ugc.aweme.ml.infra.SmartSdkConfig;
import com.ss.android.ugc.aweme.ml.model.PreloadStrategyV2Config;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;
import com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartFeedPreloadServiceImpl extends SmartFeedPreloadService {
    public static final /* synthetic */ int LJIIJ = 0;
    public List<? extends PreloadStrategyConfig> LIZ;
    public int LIZIZ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public SmartPreloadExperiment$SmartPreloadModel LJI;
    public final LruCache<String, Boolean> LIZJ = new LruCache<>(8);
    public volatile String LJII = "";
    public float LJIIIIZZ = -1.0f;
    public final HashSet<ISmartFeedPreloadResultListener> LJIIIZ = new HashSet<>();

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final PreloadStrategyConfig getCurrentSmartPreloadStrategyConfig() {
        String predictLabelResult;
        try {
            predictLabelResult = getPredictLabelResult();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C15O7.LIZJ(new ACallableS428S0100000_23(th, 2));
            SmartFeedPreloadService.Companion.getClass();
        }
        if (TextUtils.isEmpty(predictLabelResult)) {
            SmartFeedPreloadService.Companion.getClass();
            return null;
        }
        PreloadStrategyV2Config smartPreloadStrategyV2ExperimentValue = getSmartPreloadStrategyV2ExperimentValue();
        if (smartPreloadStrategyV2ExperimentValue != null && smartPreloadStrategyV2ExperimentValue.plans != null) {
            PreloadStrategyConfig[] preloadStrategyConfigArr = smartPreloadStrategyV2ExperimentValue.plans;
            if (preloadStrategyConfigArr.length != 0) {
                int iIndexOf = smartPreloadStrategyV2ExperimentValue.defaultIndex;
                List<String> list = smartPreloadStrategyV2ExperimentValue.lableIndexMapping;
                if (list != null && list.size() > 0 && list.contains(predictLabelResult) && list.indexOf(predictLabelResult) < preloadStrategyConfigArr.length) {
                    iIndexOf = list.indexOf(predictLabelResult);
                }
                PreloadStrategyConfig preloadStrategyConfig = preloadStrategyConfigArr[iIndexOf];
                SmartFeedPreloadService.Companion.getClass();
                return preloadStrategyConfig;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final void checkAndInit() {
        MLSdkConfig mlSdkConfig;
        SmartPreloadExperiment$SmartPreloadModel smartPreloadExperiment$SmartPreloadModel;
        if (this.LJFF) {
            return;
        }
        this.LJFF = true;
        SmartPreloadExperiment$SmartPreloadModel smartPreloadExperiment$SmartPreloadModel2 = null;
        if (!C1511120pQU.LIZ) {
            SmartPreloadExperiment$SmartPreloadModel smartPreloadExperiment$SmartPreloadModel3 = (SmartPreloadExperiment$SmartPreloadModel) C0C64.LJIILLIIL().LJJII(SmartPreloadExperiment$SmartPreloadModel.class, null, "playtime_ml", true);
            C1511120pQU.LIZIZ = smartPreloadExperiment$SmartPreloadModel3;
            if (smartPreloadExperiment$SmartPreloadModel3 == null) {
                C2280591EOj.LIZ.getClass();
                C1511110pQT.LIZ.getClass();
                C1511130pQV.LIZ.getClass();
                if (C070Q.LIZ() && ((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJJIJIL() && ((((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJFF() || C1511130pQV.LIZ() == 1 || C1511130pQV.LIZ() == 3) && C2280591EOj.LIZLLL.contains(C2280591EOj.LIZIZ))) {
                    try {
                        smartPreloadExperiment$SmartPreloadModel = (SmartPreloadExperiment$SmartPreloadModel) C2104708Mj.LIZ.LJII("{\"params\":[10],\"type\":3,\"scene\":\"playtime_ml\",\"package\":\"https://sf16-va.tiktokcdn.com/obj/ml-obj/global_10s_con_v3_70.zip?9205e03105620a400f1f0cfd6154f108\"}", SmartPreloadExperiment$SmartPreloadModel.class);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        smartPreloadExperiment$SmartPreloadModel = null;
                    }
                    C1511120pQU.LIZIZ = smartPreloadExperiment$SmartPreloadModel;
                } else {
                    smartPreloadExperiment$SmartPreloadModel = null;
                    C1511120pQU.LIZIZ = smartPreloadExperiment$SmartPreloadModel;
                }
            }
            SmartPreloadExperiment$SmartPreloadModel smartPreloadExperiment$SmartPreloadModel4 = C1511120pQU.LIZIZ;
            if (smartPreloadExperiment$SmartPreloadModel4 != null) {
                int[] iArr = smartPreloadExperiment$SmartPreloadModel4.params;
                if (iArr != null && iArr.length > 0) {
                    C1511120pQU.LIZJ = iArr[0];
                }
                C1511120pQU.LIZLLL = smartPreloadExperiment$SmartPreloadModel4.embeddingRange;
                C1511120pQU.LJ = smartPreloadExperiment$SmartPreloadModel4.skipCount;
                C1511120pQU.LJFF = smartPreloadExperiment$SmartPreloadModel4.notRunWhenPause;
                C1511120pQU.LJI = smartPreloadExperiment$SmartPreloadModel4.notRepeat;
                C1511120pQU.LJII = smartPreloadExperiment$SmartPreloadModel4.runDelay;
                if (smartPreloadExperiment$SmartPreloadModel4.features == null) {
                    InputFeaturesConfig inputFeaturesConfig = new InputFeaturesConfig();
                    FeaturePlayTypeConfig featurePlayTypeConfig = new FeaturePlayTypeConfig();
                    featurePlayTypeConfig.setEnable(true);
                    featurePlayTypeConfig.setRange(C1511120pQU.LIZJ);
                    featurePlayTypeConfig.setSubType("");
                    inputFeaturesConfig.setFTypePlay(featurePlayTypeConfig);
                    featurePlayTypeConfig.setRangeExcludeThis(false);
                    if (C1511120pQU.LIZLLL > 0) {
                        FeatureFeedTypeConfig featureFeedTypeConfig = new FeatureFeedTypeConfig();
                        featureFeedTypeConfig.setEnable(true);
                        featureFeedTypeConfig.setRange(C1511120pQU.LIZLLL);
                        featureFeedTypeConfig.setSubType("embeddings");
                    }
                    if (((Boolean) C1217604pa.LIZ.getValue()).booleanValue()) {
                        FeaturePhoneTypeConfig featurePhoneTypeConfig = new FeaturePhoneTypeConfig();
                        featurePhoneTypeConfig.setEnable(true);
                        featurePhoneTypeConfig.setSubType("country|hour|loadmore_latency");
                        inputFeaturesConfig.setFTypePhone(featurePhoneTypeConfig);
                    }
                    C1511120pQU.LIZIZ.features = inputFeaturesConfig;
                }
            }
            C1511120pQU.LIZ = true;
        }
        SmartPreloadExperiment$SmartPreloadModel smartPreloadExperiment$SmartPreloadModel5 = C1511120pQU.LIZIZ;
        if (smartPreloadExperiment$SmartPreloadModel5 != null) {
            SmartClassifySceneConfig smartClassifySceneConfig = new SmartClassifySceneConfig();
            smartClassifySceneConfig.setScene("playtime_ml");
            smartClassifySceneConfig.setFeatures(smartPreloadExperiment$SmartPreloadModel5.features);
            smartClassifySceneConfig.setSdkConfig(new SmartSdkConfig());
            smartClassifySceneConfig.setTrack(smartPreloadExperiment$SmartPreloadModel5.track);
            String str = smartPreloadExperiment$SmartPreloadModel5.engineType;
            if (Intrinsics.LJFF(str, "mlsdk")) {
                SmartSdkConfig sdkConfig = smartClassifySceneConfig.getSdkConfig();
                if (sdkConfig != null) {
                    sdkConfig.setMlSdkConfig(new MLSdkConfig());
                }
                SmartSdkConfig sdkConfig2 = smartClassifySceneConfig.getSdkConfig();
                if (sdkConfig2 != null && (mlSdkConfig = sdkConfig2.getMlSdkConfig()) != null) {
                    mlSdkConfig.setPackageUrl(smartPreloadExperiment$SmartPreloadModel5.packageUrl);
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
                    sdkConfig4.setPitayaMLConfig(smartPreloadExperiment$SmartPreloadModel5.pitayaMLConfig);
                }
                SmartSdkConfig sdkConfig5 = smartClassifySceneConfig.getSdkConfig();
                if (sdkConfig5 != null) {
                    sdkConfig5.setEngineType("pitaya_ml");
                }
            }
            OnePlaytimePredictConfig onePlaytimePredictConfig = new OnePlaytimePredictConfig();
            onePlaytimePredictConfig.setSceneConfig(smartClassifySceneConfig);
            onePlaytimePredictConfig.setRunDelay(smartPreloadExperiment$SmartPreloadModel5.runDelay);
            onePlaytimePredictConfig.setTrigger(0);
            onePlaytimePredictConfig.setRealConfig(smartPreloadExperiment$SmartPreloadModel5.realConfig);
            SmartPlaytimePredictService.Companion.getClass();
            C1511150pQX.LIZ.configOneNewService(onePlaytimePredictConfig);
            smartPreloadExperiment$SmartPreloadModel2 = smartPreloadExperiment$SmartPreloadModel5;
        }
        this.LJI = smartPreloadExperiment$SmartPreloadModel2;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final boolean enable() {
        if (this.LJI == null) {
            return false;
        }
        SmartPlaytimePredictService.Companion.getClass();
        return C1511150pQX.LIZ.enable("playtime_ml");
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService
    public final void ensureEvaluatorAvailable() {
        if (this.LJI != null) {
            SmartPlaytimePredictService.Companion.getClass();
            C1511150pQX.LIZ.ensureEnvAvailable("playtime_ml");
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final String getPredictLabelResult() {
        SmartFeedPreloadService.Companion.getClass();
        return this.LJII;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final List<PreloadStrategyConfig> getSmartPreloadStrategyExperimentValue() {
        if (this.LIZ == null) {
            try {
                PreloadStrategyConfig[] preloadStrategyConfigArr = C0C2O.LIZ;
                if (preloadStrategyConfigArr != null) {
                    this.LIZ = C13LQ.LJLI(preloadStrategyConfigArr);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                SmartFeedPreloadService.Companion.getClass();
            }
            if (this.LIZ == null) {
                this.LIZ = C13BV.INSTANCE;
            }
        }
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final String getSmartPreloadStrategyV2ExperimentJsonString() {
        C0CAM.LIZ();
        if (C0CAM.LIZJ == null) {
            return null;
        }
        n nVar = new n();
        nVar.LJJIFFI("smart_preload_strategy_v2", C0CAM.LIZJ);
        return nVar.toString();
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService
    public final PreloadStrategyV2Config getSmartPreloadStrategyV2ExperimentValue() {
        return C0CAM.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final int obtainAiFastSlowPredict() {
        String predictLabelResult = getPredictLabelResult();
        if (predictLabelResult != null) {
            Locale locale = Locale.ROOT;
            if (a0.LJJIIZI(predictLabelResult.toLowerCase(locale), "gt", false) || a0.LJJIIZI(predictLabelResult.toLowerCase(locale), "slow", false)) {
                return 2;
            }
            if (a0.LJJIIZI(predictLabelResult.toLowerCase(locale), "lt", false) || a0.LJJIIZI(predictLabelResult.toLowerCase(locale), "fast", false)) {
                return 1;
            }
            if (a0.LJJIIZI(predictLabelResult.toLowerCase(locale), "nor", false)) {
                return 3;
            }
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService
    public final float getPredictProbabilityResult() {
        return this.LJIIIIZZ;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final void addResultListener(ISmartFeedPreloadResultListener iSmartFeedPreloadResultListener) {
        if (iSmartFeedPreloadResultListener != null) {
            synchronized (this.LJIIIZ) {
                try {
                    this.LJIIIZ.add(iSmartFeedPreloadResultListener);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService
    public final void removeResultListener(ISmartFeedPreloadResultListener iSmartFeedPreloadResultListener) {
        if (iSmartFeedPreloadResultListener != null) {
            synchronized (this.LJIIIZ) {
                try {
                    this.LJIIIZ.remove(iSmartFeedPreloadResultListener);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService, com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final void startSmartPreloadV2Judge(final Aweme aweme) {
        int i;
        if (aweme == null) {
            return;
        }
        C1505490pHP c1505490pHP = SmartFeedPreloadService.Companion;
        c1505490pHP.getClass();
        C0VTN.LIZJ().LIZLLL();
        if (enable()) {
            int i2 = C1511120pQU.LJ;
            if (i2 > 0 && (i = this.LIZIZ) < i2) {
                int i3 = i + 1;
                this.LIZIZ = i3;
                if (i3 == i2 && !this.LJ) {
                    this.LJ = true;
                    C238400w2 c238400w2 = new C238400w2();
                    c1505490pHP.getClass();
                    if (SmartFeedPreloadService.debug) {
                        c238400w2.element = System.currentTimeMillis();
                    }
                    C1511690pRP.LIZJ(C1511120pQU.LJII, new ARunnableS92S0200000_23(this, c238400w2, 28));
                }
                c1505490pHP.getClass();
                return;
            }
            if (C1511120pQU.LJII > 0 && this.LIZLLL) {
                c1505490pHP.getClass();
                return;
            }
            if (C1511120pQU.LJI) {
                String aid = aweme.getAid();
                if (this.LIZJ.get(aid) != null) {
                    c1505490pHP.getClass();
                    return;
                }
                this.LIZJ.put(aid, Boolean.TRUE);
            }
            this.LIZLLL = true;
            C0N33 c0n33 = new C0N33();
            c0n33.LJIIJ = aweme;
            SmartPlaytimePredictService.Companion.getClass();
            C1511150pQX.LIZ.predict("playtime_ml", c0n33, null, new InterfaceC1511190pQb() { // from class: X.0pQP
                @Override // X.InterfaceC1511190pQb
                public final void LIZ(boolean z, int i4, C1511340pQq c1511340pQq, C0N33 c0n332) {
                    String nickname;
                    String str;
                    long jCurrentTimeMillis;
                    SmartFeedPreloadServiceImpl smartFeedPreloadServiceImpl = this.LIZ;
                    smartFeedPreloadServiceImpl.LIZLLL = false;
                    float fFloatValue = -1.0f;
                    if (z && c1511340pQq != null && (str = c1511340pQq.LIZIZ) != null) {
                        Float fLIZJ = c1511340pQq.LIZJ();
                        if (fLIZJ != null) {
                            fFloatValue = fLIZJ.floatValue();
                        }
                        this.LIZ.LJII = str;
                        SmartFeedPreloadServiceImpl smartFeedPreloadServiceImpl2 = this.LIZ;
                        smartFeedPreloadServiceImpl2.LJIIIIZZ = fFloatValue;
                        if (!smartFeedPreloadServiceImpl2.LJIIIZ.isEmpty()) {
                            SmartFeedPreloadService.Companion.getClass();
                            if (SmartFeedPreloadService.debug) {
                                jCurrentTimeMillis = System.currentTimeMillis();
                            } else {
                                jCurrentTimeMillis = 0;
                            }
                            String str2 = "";
                            if (!TextUtils.isEmpty(str)) {
                                if (u.LJJIIJZLJL(str, "lt", false)) {
                                    str2 = "lt";
                                } else if (u.LJJIIJZLJL(str, "gt", false)) {
                                    str2 = "gt";
                                } else {
                                    str2 = "nor";
                                }
                            }
                            synchronized (smartFeedPreloadServiceImpl2.LJIIIZ) {
                                try {
                                    Iterator<ISmartFeedPreloadResultListener> it2 = smartFeedPreloadServiceImpl2.LJIIIZ.iterator();
                                    while (it2.hasNext()) {
                                        it2.next().onSmartFeedPreloadResult(str2, str, fFloatValue);
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                            SmartFeedPreloadService.Companion.getClass();
                            if (SmartFeedPreloadService.debug) {
                                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("onResultUpdate labelShort:");
                                sbLIZ.append(str2);
                                sbLIZ.append(" label:");
                                sbLIZ.append(str);
                                sbLIZ.append(" probability:");
                                sbLIZ.append(fFloatValue);
                                sbLIZ.append(" cost:");
                                sbLIZ.append(jCurrentTimeMillis2);
                                C2188811AlT.LIZIZ(sbLIZ);
                            }
                        }
                    } else {
                        smartFeedPreloadServiceImpl.LJII = "";
                        this.LIZ.LJIIIIZZ = -1.0f;
                    }
                    SmartFeedPreloadService.Companion.getClass();
                    if (SmartFeedPreloadService.debug) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("startSmartPreloadV2Judge end aid:");
                        sbLIZ2.append(aweme.getAid());
                        sbLIZ2.append('-');
                        User author = aweme.getAuthor();
                        if (author != null) {
                            nickname = author.getNickname();
                        } else {
                            nickname = null;
                        }
                        sbLIZ2.append(nickname);
                        sbLIZ2.append(" predictLabelResult:");
                        sbLIZ2.append(this.LIZ.LJII);
                        sbLIZ2.append(" predictProbabilityResult:");
                        sbLIZ2.append(this.LIZ.LJIIIIZZ);
                        sbLIZ2.append(" success:");
                        sbLIZ2.append(z);
                        sbLIZ2.append(" errorCode:");
                        sbLIZ2.append(i4);
                        sbLIZ2.append(" output:");
                        sbLIZ2.append(c1511340pQq);
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }
                }
            });
        }
    }
}
