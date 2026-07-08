package com.ss.android.ugc.aweme.ml.impl;

import X.C0N33;
import X.C0R1F;
import X.C13LP;
import X.C1511150pQX;
import X.C1511180pQa;
import X.C1511200pQc;
import X.C1511690pRP;
import X.C15O7;
import X.C238400w2;
import X.InterfaceC1511190pQb;
import Y.ACallableS428S0100000_23;
import Y.ARunnableS92S0200000_23;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUIModel;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUIPlayTime;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUIStrategyConfig;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUITasks;
import com.ss.android.ugc.aweme.feed.model.commercialize.PlanConfig;
import com.ss.android.ugc.aweme.feed.model.commercialize.UrlPackage;
import com.ss.android.ugc.aweme.ml.ab.CommerceSmartUIModelV2;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictConfig;
import com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService;
import com.ss.android.ugc.aweme.ml.impl.SmartFeedAdUIServiceImpl;
import com.ss.android.ugc.aweme.ml.infra.FeaturePlayTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.MLSdkConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartClassifySceneConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService;
import com.ss.android.ugc.aweme.ml.infra.SmartSdkConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartFeedAdUIServiceImpl extends SmartFeedAdUIService {
    public static final /* synthetic */ int LJFF = 0;
    public boolean LIZ;
    public boolean LIZIZ;
    public CommerceSmartUIModelV2 LIZJ;
    public String LIZLLL = "";
    public float LJ = -1.0f;

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService, com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final CommerceSmartUITasks getPredictTaskIndex() {
        CommerceSmartUIModelV2 commerceSmartUIModelV2;
        CommerceSmartUIStrategyConfig uiStrategy;
        PlanConfig[] plans;
        PlanConfig planConfig;
        List<CommerceSmartUITasks> task;
        List<String> lableIndexMapping;
        try {
            String predictLabelResult = getPredictLabelResult();
            if (predictLabelResult == null) {
                return null;
            }
            SmartFeedAdUIService.Companion.getClass();
            if (!TextUtils.isEmpty(predictLabelResult) && (commerceSmartUIModelV2 = C1511180pQa.LIZ) != null && (uiStrategy = commerceSmartUIModelV2.getUiStrategy()) != null && (plans = uiStrategy.getPlans()) != null && plans.length != 0) {
                CommerceSmartUIStrategyConfig uiStrategy2 = commerceSmartUIModelV2.getUiStrategy();
                Integer numValueOf = uiStrategy2 != null ? Integer.valueOf(uiStrategy2.getDefaultIndex()) : null;
                CommerceSmartUIStrategyConfig uiStrategy3 = commerceSmartUIModelV2.getUiStrategy();
                if (uiStrategy3 != null && (lableIndexMapping = uiStrategy3.getLableIndexMapping()) != null && (true ^ lableIndexMapping.isEmpty()) && C13LP.LJJJJ(predictLabelResult, lableIndexMapping) && lableIndexMapping.indexOf(predictLabelResult) < plans.length) {
                    numValueOf = Integer.valueOf(lableIndexMapping.indexOf(predictLabelResult));
                }
                if (numValueOf != null && (planConfig = plans[numValueOf.intValue()]) != null && (task = planConfig.getTask()) != null) {
                    return task.get(0);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C15O7.LIZJ(new ACallableS428S0100000_23(th, 0));
            SmartFeedAdUIService.Companion.getClass();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService, com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final void checkAndInit() {
        CommerceSmartUIPlayTime playTime;
        List<Integer> params;
        int iIntValue;
        MLSdkConfig mlSdkConfig;
        CommerceSmartUIPlayTime playTime2;
        UrlPackage packageUrl;
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        CommerceSmartUIModelV2 commerceSmartUIModelV2 = C1511180pQa.LIZ;
        CommerceSmartUIModelV2 commerceSmartUIModelV22 = C1511180pQa.LIZ;
        if (commerceSmartUIModelV22 == null) {
            return;
        }
        this.LIZJ = commerceSmartUIModelV22;
        OnePlaytimePredictConfig onePlaytimePredictConfig = new OnePlaytimePredictConfig();
        SmartClassifySceneConfig smartClassifySceneConfig = new SmartClassifySceneConfig();
        smartClassifySceneConfig.setScene("commerce_ml_ui_model");
        CommerceSmartUIModelV2 commerceSmartUIModelV23 = this.LIZJ;
        if ((commerceSmartUIModelV23 != null ? commerceSmartUIModelV23.getFeatures() : null) != null) {
            CommerceSmartUIModelV2 commerceSmartUIModelV24 = this.LIZJ;
            smartClassifySceneConfig.setFeatures(commerceSmartUIModelV24 != null ? commerceSmartUIModelV24.getFeatures() : null);
        } else {
            CommerceSmartUIModelV2 commerceSmartUIModelV25 = this.LIZJ;
            if (commerceSmartUIModelV25 == null || (playTime = commerceSmartUIModelV25.getPlayTime()) == null || (params = playTime.getParams()) == null || !(!params.isEmpty()) || (iIntValue = ((Number) ListProtector.get(params, 0)).intValue()) <= 0) {
                return;
            }
            InputFeaturesConfig inputFeaturesConfig = new InputFeaturesConfig();
            FeaturePlayTypeConfig featurePlayTypeConfig = new FeaturePlayTypeConfig();
            featurePlayTypeConfig.setEnable(true);
            featurePlayTypeConfig.setRange(iIntValue);
            featurePlayTypeConfig.setSubType("");
            inputFeaturesConfig.setFTypePlay(featurePlayTypeConfig);
            smartClassifySceneConfig.setFeatures(inputFeaturesConfig);
        }
        smartClassifySceneConfig.setSdkConfig(new SmartSdkConfig());
        SmartSdkConfig sdkConfig = smartClassifySceneConfig.getSdkConfig();
        if (sdkConfig != null) {
            sdkConfig.setMlSdkConfig(new MLSdkConfig());
        }
        SmartSdkConfig sdkConfig2 = smartClassifySceneConfig.getSdkConfig();
        if (sdkConfig2 != null && (mlSdkConfig = sdkConfig2.getMlSdkConfig()) != null) {
            CommerceSmartUIModelV2 commerceSmartUIModelV26 = this.LIZJ;
            mlSdkConfig.setPackageUrl((commerceSmartUIModelV26 == null || (playTime2 = commerceSmartUIModelV26.getPlayTime()) == null || (packageUrl = playTime2.getPackageUrl()) == null) ? null : packageUrl.getAndroidUrl());
        }
        CommerceSmartUIModelV2 commerceSmartUIModelV27 = this.LIZJ;
        smartClassifySceneConfig.setTrack(commerceSmartUIModelV27 != null ? commerceSmartUIModelV27.getTrack() : null);
        onePlaytimePredictConfig.setSceneConfig(smartClassifySceneConfig);
        CommerceSmartUIModelV2 commerceSmartUIModelV28 = this.LIZJ;
        onePlaytimePredictConfig.setRealConfig(commerceSmartUIModelV28 != null ? commerceSmartUIModelV28.getRealConfig() : null);
        onePlaytimePredictConfig.setTrigger(0);
        SmartPlaytimePredictService.Companion.getClass();
        C1511150pQX.LIZ.configOneNewService(onePlaytimePredictConfig);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService, com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final boolean enable() {
        if (this.LIZJ == null) {
            return false;
        }
        SmartPlaytimePredictService.Companion.getClass();
        return C1511150pQX.LIZ.enable("commerce_ml_ui_model");
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService
    public final void ensureEvaluatorAvailable() {
        if (this.LIZJ != null) {
            SmartPlaytimePredictService.Companion.getClass();
            C1511150pQX.LIZ.ensureEnvAvailable("commerce_ml_ui_model");
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService, com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final String getPredictLabelResult() {
        SmartFeedAdUIService.Companion.getClass();
        return (this.LIZJ == null || !TextUtils.isEmpty(this.LIZLLL)) ? this.LIZLLL : C0R1F.LIZIZ("use_last_predict_label");
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService, com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final CommerceSmartUIModel getSmartAdUIExperimentValue() {
        CommerceSmartUIModelV2 commerceSmartUIModelV2 = C1511180pQa.LIZ;
        return C1511180pQa.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService, com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final void startSmartAdUIJudge(final Aweme aweme) {
        if (aweme == null) {
            return;
        }
        C1511200pQc c1511200pQc = SmartFeedAdUIService.Companion;
        c1511200pQc.getClass();
        if (enable()) {
            if (!this.LIZ) {
                this.LIZ = true;
                C238400w2 c238400w2 = new C238400w2();
                c1511200pQc.getClass();
                if (SmartFeedAdUIService.debug) {
                    c238400w2.element = System.currentTimeMillis();
                }
                C1511690pRP.LIZIZ(new ARunnableS92S0200000_23(this, c238400w2, 27));
            }
            C0N33 c0n33 = new C0N33();
            c0n33.LJIIJ = aweme;
            SmartPlaytimePredictService.Companion.getClass();
            C1511150pQX.LIZ.predict("commerce_ml_ui_model", c0n33, null, new InterfaceC1511190pQb() { // from class: X.0pQR
                @Override // X.InterfaceC1511190pQb
                public final void LIZ(boolean z, int i, C1511340pQq c1511340pQq, C0N33 c0n332) {
                    String nickname;
                    String str;
                    this.LIZ.getClass();
                    float fFloatValue = -1.0f;
                    if (z && c1511340pQq != null && (str = c1511340pQq.LIZIZ) != null) {
                        Float fLIZJ = c1511340pQq.LIZJ();
                        if (fLIZJ != null) {
                            fFloatValue = fLIZJ.floatValue();
                        }
                        SmartFeedAdUIServiceImpl smartFeedAdUIServiceImpl = this.LIZ;
                        smartFeedAdUIServiceImpl.LIZLLL = str;
                        smartFeedAdUIServiceImpl.LJ = fFloatValue;
                        C15O7.LIZJ(new ACallableS428S0100000_23(smartFeedAdUIServiceImpl, 1));
                    } else {
                        SmartFeedAdUIServiceImpl smartFeedAdUIServiceImpl2 = this.LIZ;
                        smartFeedAdUIServiceImpl2.LIZLLL = "";
                        smartFeedAdUIServiceImpl2.LJ = -1.0f;
                    }
                    SmartFeedAdUIService.Companion.getClass();
                    if (SmartFeedAdUIService.debug) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("startSmartAdUIJudge end aid:");
                        sbLIZ.append(aweme.getAid());
                        sbLIZ.append('-');
                        User author = aweme.getAuthor();
                        if (author != null) {
                            nickname = author.getNickname();
                        } else {
                            nickname = null;
                        }
                        sbLIZ.append(nickname);
                        sbLIZ.append(" predictLabelResult:");
                        sbLIZ.append(this.LIZ.LIZLLL);
                        sbLIZ.append(" predictProbabilityResult:");
                        sbLIZ.append(this.LIZ.LJ);
                        sbLIZ.append(" success:");
                        sbLIZ.append(z);
                        sbLIZ.append(" errorCode:");
                        sbLIZ.append(i);
                        sbLIZ.append(" output:");
                        sbLIZ.append(c1511340pQq);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
            });
        }
    }
}
