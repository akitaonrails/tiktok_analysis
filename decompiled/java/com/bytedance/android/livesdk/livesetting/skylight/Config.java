package com.bytedance.android.livesdk.livesetting.skylight;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class Config {
    public static final TypeAdapter ADAPTER = new Config_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_go_live")
    public boolean enableGoLive;

    @C09CT("enable_style_v2")
    public boolean enableStyleV2;

    @C09CT("show_follow_btn")
    public boolean showFollowBtn;

    @C09CT("show_title")
    public boolean showTitle;

    public Config() {
        this(false, false, true, false);
    }

    public Config(boolean z, boolean z2, boolean z3, boolean z4) {
        this.enableStyleV2 = z;
        this.enableGoLive = z2;
        this.showTitle = z3;
        this.showFollowBtn = z4;
    }
}
