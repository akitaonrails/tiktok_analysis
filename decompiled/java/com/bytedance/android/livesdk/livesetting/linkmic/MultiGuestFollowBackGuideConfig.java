package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class MultiGuestFollowBackGuideConfig {
    public static final TypeAdapter ADAPTER = new MultiGuestFollowBackGuideConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_manage_panel_follow_opt")
    public boolean enableManagePanelFollowOpt;

    @C09CT("host_panel_follow_button_style")
    public int followButtonStyle;

    public MultiGuestFollowBackGuideConfig() {
        this(false, 0);
    }

    public MultiGuestFollowBackGuideConfig(boolean z, int i) {
        this.enableManagePanelFollowOpt = z;
        this.followButtonStyle = i;
    }
}
