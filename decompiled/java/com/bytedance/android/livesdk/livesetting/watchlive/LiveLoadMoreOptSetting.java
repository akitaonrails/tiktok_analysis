package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C036E;
import X.C497740JfY;
import android.content.Context;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("ttlive_webcast_feed_load_more_opt")
public final class LiveLoadMoreOptSetting {
    public static final boolean DEFAULT = false;
    public static final LiveLoadMoreOptSetting INSTANCE = new LiveLoadMoreOptSetting();
    public static boolean isHasTry;

    public final void resetHasTry() {
        isHasTry = false;
    }

    public final boolean isExp() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_webcast_feed_load_more_opt", DEFAULT);
    }

    public final boolean isTry() {
        if (isHasTry || !isExp() || !INVOKESTATIC_com_bytedance_android_livesdk_livesetting_watchlive_LiveLoadMoreOptSetting_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailable(C497740JfY.LJII())) {
            return false;
        }
        isHasTry = true;
        return true;
    }

    public static boolean INVOKESTATIC_com_bytedance_android_livesdk_livesetting_watchlive_LiveLoadMoreOptSetting_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailable(Context context) {
        try {
            return C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
