package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C098200Yq;
import X.C189200o6;
import X.C2188811AlT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_dsa_url")
public final class LiveDSAUrlSetting {
    public static final String DEFAULT = "sslocal://webcast_webview_popup?height=60%25&radius=16rpx&show_mask=1&use_spark=1&container_color_auto_dark=1&loading_bg_color_light=ffffff&loading_bg_color_dark=000000&url=https%3A%2F%2Finapp.tiktokv.com%2Ffalcon%2Ftiktok_livesafety%2Fpages%2Fperception%2Fsub_feature%2Findex.html%3Fsource%3Dinapp";
    public static final LiveDSAUrlSetting INSTANCE = new LiveDSAUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_dsa_url", DEFAULT);
    }

    public final String appendQuery(String str, String str2) {
        Object c098200Yq;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(INSTANCE.getValue());
            sbLIZ.append("&enter_from=live_text_sticker&");
            sbLIZ.append(str);
            sbLIZ.append('=');
            sbLIZ.append(str2);
            c098200Yq = C2188811AlT.LIZIZ(sbLIZ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (String) c098200Yq;
    }
}
