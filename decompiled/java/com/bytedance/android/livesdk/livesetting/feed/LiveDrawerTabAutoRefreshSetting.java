package com.bytedance.android.livesdk.livesetting.feed;

import X.C098200Yq;
import X.C189200o6;
import X.C2097908Jt;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_drawer_tab_auto_refresh_policy")
public final class LiveDrawerTabAutoRefreshSetting {
    public static final LiveDrawerTabAutoRefreshSetting INSTANCE = new LiveDrawerTabAutoRefreshSetting();
    public static final Map<String, Integer> DEFAULT = C2097908Jt.LIZJ(new Pair("music_spotlight", Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL)));

    public final int getValue() {
        Object c098200Yq;
        Integer num;
        try {
            c098200Yq = (Map) SettingsManager.INSTANCE.getValueSafely("live_drawer_tab_auto_refresh_policy", DEFAULT);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Map<String, Integer> map = DEFAULT;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = map;
        }
        Map map2 = (Map) c098200Yq;
        if (map2 == null || (num = (Integer) map2.get("music_spotlight")) == null) {
            return -1;
        }
        return num.intValue();
    }
}
