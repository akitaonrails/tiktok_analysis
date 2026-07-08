package com.ss.android.ugc.profile.business.effect;

import X.C01GW;
import X.C452501pT;
import com.ss.android.ugc.aweme.model.EffectCreatorCenterConfig;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class EffectCreatorCenterConfigSetting {
    public static final EffectCreatorCenterConfigSetting INSTANCE = new EffectCreatorCenterConfigSetting();
    public static final EffectCreatorCenterConfig DEFAULT = new EffectCreatorCenterConfig("", "&container_bg_color=000000&use_spark=1&hide_nav_bar=1", "https%3A%2F%2Finapp.tiktokv.com%2Fttep%2Finapp%2Fcreator-center%3F_pia_%3D1", "");
    public static final C01GW VALUE$delegate = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(296));
    public static final int $stable = 8;

    public static final EffectCreatorCenterConfig get() {
        return INSTANCE.getVALUE();
    }

    private final EffectCreatorCenterConfig getVALUE() {
        return (EffectCreatorCenterConfig) VALUE$delegate.getValue();
    }

    public final EffectCreatorCenterConfig getDEFAULT() {
        return DEFAULT;
    }
}
