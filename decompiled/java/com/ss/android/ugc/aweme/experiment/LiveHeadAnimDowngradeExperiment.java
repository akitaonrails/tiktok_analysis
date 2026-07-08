package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C0C64;
import X.C452501pT;
import X.EnumC452301pR;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class LiveHeadAnimDowngradeExperiment {
    public static final C01GW downgradeFraction$delegate;
    public static final C01GW downgradeFreqCtrTimeIntervalMs$delegate;
    public static final C01GW downgradeSourceConfig$delegate;
    public static final C01GW isDowngradeEnable$delegate;
    public static final C01GW isSoftDowngradeEnable$delegate;
    public static final LiveHeadAnimDowngradeExperiment INSTANCE = new LiveHeadAnimDowngradeExperiment();
    public static final LiveHeadAnimDowngradeConfig DEFAULT = new LiveHeadAnimDowngradeConfig(false, 2, false, 40000, new LinkedHashMap());

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.SYNCHRONIZED;
        isDowngradeEnable$delegate = C452501pT.LIZ(enumC452301pR, AFwS225S0000000_34.get$arr$(61));
        isSoftDowngradeEnable$delegate = C452501pT.LIZ(enumC452301pR, AFwS225S0000000_34.get$arr$(62));
        downgradeSourceConfig$delegate = C452501pT.LIZ(enumC452301pR, AFwS225S0000000_34.get$arr$(60));
        downgradeFraction$delegate = C452501pT.LIZ(enumC452301pR, AFwS225S0000000_34.get$arr$(58));
        downgradeFreqCtrTimeIntervalMs$delegate = C452501pT.LIZ(enumC452301pR, AFwS225S0000000_34.get$arr$(59));
    }

    public final int getDowngradeFraction() {
        return ((Number) downgradeFraction$delegate.getValue()).intValue();
    }

    public final long getDowngradeFreqCtrTimeIntervalMs() {
        return ((Number) downgradeFreqCtrTimeIntervalMs$delegate.getValue()).longValue();
    }

    public final Map<String, LiveHeadAnimDowngradeSourceConfig> getDowngradeSourceConfig() {
        return (Map) downgradeSourceConfig$delegate.getValue();
    }

    public final boolean isDowngradeEnable() {
        return ((Boolean) isDowngradeEnable$delegate.getValue()).booleanValue();
    }

    public final boolean isSoftDowngradeEnable() {
        return ((Boolean) isSoftDowngradeEnable$delegate.getValue()).booleanValue();
    }

    public final LiveHeadAnimDowngradeConfig value() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        LiveHeadAnimDowngradeConfig liveHeadAnimDowngradeConfig = DEFAULT;
        LiveHeadAnimDowngradeConfig liveHeadAnimDowngradeConfig2 = (LiveHeadAnimDowngradeConfig) c0c64LJIILLIIL.LJJII(LiveHeadAnimDowngradeConfig.class, liveHeadAnimDowngradeConfig, "live_avatar_animation_downgrade_config", true);
        return liveHeadAnimDowngradeConfig2 != null ? liveHeadAnimDowngradeConfig2 : liveHeadAnimDowngradeConfig;
    }
}
