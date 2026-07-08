package com.bytedance.android.livesdk.broadcast.preview.widget.startlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
public final class GoLiveOptVerifySchemaSettingAdapter {
    public static final TypeAdapter ADAPTER;

    @C09CT("origin_url")
    public String originUrl;

    @C09CT("pre_fix")
    public String preFix;

    static {
        NormalGson.singleton();
        ADAPTER = new GoLiveOptVerifySchemaSettingAdapter_OptTypeAdapter();
    }

    public GoLiveOptVerifySchemaSettingAdapter() {
        this("aweme://webview_popup/?container_bg_color_dark=000000&container_bg_color_light=FFFFFF&disable_outside_click_close=0&enable_pull_down_close=1&enable_relative_calculation=1&gravity=bottom&height=300&keyboard_adjust=2&keyboard_compat=1&landscape_gravity=bottom&landscape_height=300&landscape_width=100%25&min_margin_top=10%25&radius=12&show_mask=1", "url=https%3A%2F%2Finapp.tiktokv.com%2Fucenter_web%2Fidv_core%2Fwallet%3Fpassport_ticket%3Ddefault_1p_bind_scene%26page%3Dpublish%26use_spark%3D1%26view%3Dmobile_only");
    }

    public GoLiveOptVerifySchemaSettingAdapter(String str, String str2) {
        this.preFix = str;
        this.originUrl = str2;
    }
}
