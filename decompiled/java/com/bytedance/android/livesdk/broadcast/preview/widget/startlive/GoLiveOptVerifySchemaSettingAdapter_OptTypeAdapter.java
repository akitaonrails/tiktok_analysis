package com.bytedance.android.livesdk.broadcast.preview.widget.startlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class GoLiveOptVerifySchemaSettingAdapter_OptTypeAdapter extends TypeAdapter<GoLiveOptVerifySchemaSettingAdapter> {
    @Override // com.google.gson.TypeAdapter
    public final GoLiveOptVerifySchemaSettingAdapter read(C09CU c09cu) {
        GoLiveOptVerifySchemaSettingAdapter goLiveOptVerifySchemaSettingAdapter = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            goLiveOptVerifySchemaSettingAdapter = new GoLiveOptVerifySchemaSettingAdapter("aweme://webview_popup/?container_bg_color_dark=000000&container_bg_color_light=FFFFFF&disable_outside_click_close=0&enable_pull_down_close=1&enable_relative_calculation=1&gravity=bottom&height=300&keyboard_adjust=2&keyboard_compat=1&landscape_gravity=bottom&landscape_height=300&landscape_width=100%25&min_margin_top=10%25&radius=12&show_mask=1", "url=https%3A%2F%2Finapp.tiktokv.com%2Fucenter_web%2Fidv_core%2Fwallet%3Fpassport_ticket%3Ddefault_1p_bind_scene%26page%3Dpublish%26use_spark%3D1%26view%3Dmobile_only");
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "pre_fix")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        goLiveOptVerifySchemaSettingAdapter.preFix = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "origin_url")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        goLiveOptVerifySchemaSettingAdapter.originUrl = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return goLiveOptVerifySchemaSettingAdapter;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GoLiveOptVerifySchemaSettingAdapter goLiveOptVerifySchemaSettingAdapter) {
        GoLiveOptVerifySchemaSettingAdapter goLiveOptVerifySchemaSettingAdapter2 = goLiveOptVerifySchemaSettingAdapter;
        if (goLiveOptVerifySchemaSettingAdapter2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("pre_fix");
        c09dl.LJJJJJ(goLiveOptVerifySchemaSettingAdapter2.preFix);
        c09dl.LJIILLIIL("origin_url");
        c09dl.LJJJJJ(goLiveOptVerifySchemaSettingAdapter2.originUrl);
        c09dl.LJII();
    }
}
