package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C01GW;
import X.C1161920gLG;
import X.C452501pT;
import X.EnumC452301pR;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "tiktok_live_top_live_architecture_opt")
public final class TiktokLiveTopLiveArchitectureOptSetting {
    public static final TiktokLiveTopLiveArchitectureOptSetting INSTANCE = new TiktokLiveTopLiveArchitectureOptSetting();
    public static final Config DEFAULT = new Config(false, 0, 0, 0, false, false, false, true, true);
    public static final C01GW _value$delegate = C452501pT.LIZ(EnumC452301pR.NONE, AFwS193S0000000_7.get$arr$(67));

    private final Config get_value() {
        return (Config) _value$delegate.getValue();
    }

    public final Config getValue() {
        if (!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
            return get_value();
        }
        if (get_value().enable || get_value().forTest) {
            return get_value();
        }
        Config config = new Config(false, 0, 0, 0, false, false, false, true, true);
        config.enable = true;
        config.preloadTiming = 1;
        config.preloadType = 0;
        config.measureTiming = 1;
        config.alignOnline = false;
        config.optOnline = true;
        return config;
    }

    public final boolean isArchOpt() {
        return getValue().enable;
    }
}
