package com.bytedance.android.livesdk.livesetting.other;

import X.C1161920gLG;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.livesdkapi.host.IHostPerformanceOpt;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_opt_player_fluency_exp")
public final class LiveOptPlayerFluencyExp {
    public static final int DEFAULT = 0;
    public static final LiveOptPlayerFluencyExp INSTANCE = new LiveOptPlayerFluencyExp();
    public static int value = -1;
    public static final int $stable = 8;

    public static final boolean enableOpt() {
        if (value < 0) {
            value = ((Number) ((IHostPerformanceOpt) C1161920gLG.LIZJ(IHostPerformanceOpt.class)).JW(AFwS193S0000000_7.get$arr$(69), 1)).intValue();
        }
        return value == 1;
    }
}
