package com.ss.android.ugc.aweme.ml.feature.pitaya;

import X.C0C64;
import X.C2188811AlT;
import com.bytedance.pitaya.api.PTYNormalCallback;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.feature.store.PTYFeatureStoreInstance;
import com.ss.android.ugc.aweme.ml.api.PitayaFeatureCenterService;
import com.ss.android.ugc.aweme.ml.feature.pitaya.group.AWEFeaturePTYGroup;
import com.ss.android.ugc.aweme.ml.feature.pitaya.producer.IESBasicFeaturePTYProducer;
import com.ss.android.ugc.aweme.ml.feature.pitaya.producer.PortraitFeaturePTYProducer;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class PitayaFeatureCenterServiceImpl extends PitayaFeatureCenterService {
    public static final /* synthetic */ int LIZLLL = 0;
    public boolean LIZ;
    public boolean LIZIZ;
    public int LIZJ;

    @Override // com.ss.android.ugc.aweme.ml.api.PitayaFeatureCenterService, com.ss.android.ugc.aweme.ml.api.IPitayaFeatureCenterService
    public final void checkAndInit() {
        if (this.LIZ) {
            return;
        }
        System.currentTimeMillis();
        this.LIZ = true;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "feature_center_pitaya_switch", true, true)) {
            PTYFeatureStoreInstance pTYFeatureStoreInstance = PTYFeatureStoreInstance.INSTANCE;
            pTYFeatureStoreInstance.getFeatureStore().registerFeatureProducer(IESBasicFeaturePTYProducer.INSTANCE, new PTYNormalCallback() { // from class: com.ss.android.ugc.aweme.ml.feature.pitaya.PitayaFeatureCenterServiceImpl.checkAndInit.1
                @Override // com.bytedance.pitaya.api.PTYNormalCallback
                public void onResult(boolean z, PTYError pTYError) {
                    Integer numValueOf;
                    Integer numValueOf2;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("basic onResult: success:");
                    sbLIZ.append(z);
                    sbLIZ.append(" error:");
                    sbLIZ.append(pTYError);
                    sbLIZ.append(" code-");
                    List<String> stacks = null;
                    if (pTYError != null) {
                        numValueOf = Integer.valueOf(pTYError.getCode());
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ.append(numValueOf);
                    sbLIZ.append(" subCode-");
                    if (pTYError != null) {
                        numValueOf2 = Integer.valueOf(pTYError.getSubCode());
                    } else {
                        numValueOf2 = null;
                    }
                    sbLIZ.append(numValueOf2);
                    sbLIZ.append(" stacks-");
                    if (pTYError != null) {
                        stacks = pTYError.getStacks();
                    }
                    sbLIZ.append(stacks);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            });
            pTYFeatureStoreInstance.getFeatureStore().registerFeatureProducer(PortraitFeaturePTYProducer.INSTANCE, new PTYNormalCallback() { // from class: com.ss.android.ugc.aweme.ml.feature.pitaya.PitayaFeatureCenterServiceImpl.checkAndInit.2
                @Override // com.bytedance.pitaya.api.PTYNormalCallback
                public void onResult(boolean z, PTYError pTYError) {
                    Integer numValueOf;
                    Integer numValueOf2;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("portrait onResult: success:");
                    sbLIZ.append(z);
                    sbLIZ.append(" error:");
                    sbLIZ.append(pTYError);
                    sbLIZ.append(" code-");
                    List<String> stacks = null;
                    if (pTYError != null) {
                        numValueOf = Integer.valueOf(pTYError.getCode());
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ.append(numValueOf);
                    sbLIZ.append(" subCode-");
                    if (pTYError != null) {
                        numValueOf2 = Integer.valueOf(pTYError.getSubCode());
                    } else {
                        numValueOf2 = null;
                    }
                    sbLIZ.append(numValueOf2);
                    sbLIZ.append(" stacks-");
                    if (pTYError != null) {
                        stacks = pTYError.getStacks();
                    }
                    sbLIZ.append(stacks);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.PitayaFeatureCenterService, com.ss.android.ugc.aweme.ml.api.IPitayaFeatureCenterService
    public final void onSlideSpeedUpdate(Float f, Float f2, Float f3) {
        int i;
        if (!this.LIZIZ && (i = this.LIZJ) < 32) {
            this.LIZJ = i + 1;
            PTYFeatureStoreInstance.INSTANCE.getFeatureStore().registerFeatureGroup(AWEFeaturePTYGroup.INSTANCE, new PTYNormalCallback() { // from class: com.ss.android.ugc.aweme.ml.feature.pitaya.PitayaFeatureCenterServiceImpl.onSlideSpeedUpdate.1
                @Override // com.bytedance.pitaya.api.PTYNormalCallback
                public void onResult(boolean z, PTYError pTYError) {
                    Integer numValueOf;
                    Integer numValueOf2;
                    PitayaFeatureCenterServiceImpl.this.LIZIZ = z;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("slide onResult: success:");
                    sbLIZ.append(z);
                    sbLIZ.append(" error:");
                    sbLIZ.append(pTYError);
                    sbLIZ.append(" code-");
                    List<String> stacks = null;
                    if (pTYError != null) {
                        numValueOf = Integer.valueOf(pTYError.getCode());
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ.append(numValueOf);
                    sbLIZ.append(" subCode-");
                    if (pTYError != null) {
                        numValueOf2 = Integer.valueOf(pTYError.getSubCode());
                    } else {
                        numValueOf2 = null;
                    }
                    sbLIZ.append(numValueOf2);
                    sbLIZ.append(" stacks-");
                    if (pTYError != null) {
                        stacks = pTYError.getStacks();
                    }
                    sbLIZ.append(stacks);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            });
        }
        if (this.LIZIZ && f != null && f2 != null && f3 != null) {
            PTYFeatureStoreInstance pTYFeatureStoreInstance = PTYFeatureStoreInstance.INSTANCE;
            pTYFeatureStoreInstance.getFeatureStore().addFeature("sliding_velocity", f.floatValue(), "ies_pty");
            pTYFeatureStoreInstance.getFeatureStore().addFeature("sliding_velocity_x", f2.floatValue(), "ies_pty");
            pTYFeatureStoreInstance.getFeatureStore().addFeature("sliding_velocity_y", f3.floatValue(), "ies_pty");
        }
    }
}
