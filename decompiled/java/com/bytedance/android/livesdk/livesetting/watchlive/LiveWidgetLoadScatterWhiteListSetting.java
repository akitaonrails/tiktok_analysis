package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C13LQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_widget_scatter_white_list")
public final class LiveWidgetLoadScatterWhiteListSetting {
    public static final String[] DEFAULT;
    public static final LiveWidgetLoadScatterWhiteListSetting INSTANCE = new LiveWidgetLoadScatterWhiteListSetting();
    public static final List<String> whiteList;

    static {
        String[] strArr = new String[0];
        DEFAULT = strArr;
        whiteList = C13LQ.LJJLL(SettingsManager.INSTANCE.getStringArrayValue("live_widget_scatter_white_list", strArr));
    }

    public final List<String> getWhiteList() {
        return whiteList;
    }
}
