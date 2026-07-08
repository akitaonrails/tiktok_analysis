package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveAboutMeMergeConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("url_fullscreen")
    public String urlFullscreen;

    @C09CT("url_popup")
    public String urlPopup;

    @C09CT("url_popup_live_sheet")
    public String urlPopupLiveSheet;

    @C09CT("url_upgrade_popup")
    public String urlUpgradePopup;

    @C09CT("url_upgrade_popup_live_sheet")
    public String urlUpgradePopupLiveSheet;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveAboutMeMergeConfig_OptTypeAdapter();
    }

    public LiveAboutMeMergeConfig() {
        this("", "", "", "", "");
    }

    public LiveAboutMeMergeConfig(String str, String str2, String str3, String str4, String str5) {
        this.urlPopup = str;
        this.urlPopupLiveSheet = str2;
        this.urlFullscreen = str3;
        this.urlUpgradePopup = str4;
        this.urlUpgradePopupLiveSheet = str5;
    }
}
