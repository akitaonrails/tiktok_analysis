package com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Set;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_adapt_epi_to_feature_center")
public final class LiveAdaptEpiToFeatureCenterExp {
    public static final AdaptFeatureConfig DEFAULT;
    public static final LiveAdaptEpiToFeatureCenterExp INSTANCE = new LiveAdaptEpiToFeatureCenterExp();
    public static final C01GW adaptKeyList$delegate;
    public static final C01GW enable$delegate;
    public static final AdaptFeatureConfig expValue;

    static {
        AdaptFeatureConfig adaptFeatureConfig = new AdaptFeatureConfig(false, null, 3, null);
        DEFAULT = adaptFeatureConfig;
        AdaptFeatureConfig adaptFeatureConfig2 = (AdaptFeatureConfig) SettingsManager.INSTANCE.getValueSafely(LiveAdaptEpiToFeatureCenterExp.class);
        if (adaptFeatureConfig2 != null) {
            adaptFeatureConfig = adaptFeatureConfig2;
        }
        expValue = adaptFeatureConfig;
        enable$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(82));
        adaptKeyList$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(81));
    }

    public final Set<String> getAdaptKeyList() {
        return (Set) adaptKeyList$delegate.getValue();
    }

    public final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }
}
