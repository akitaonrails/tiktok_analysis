package com.bytedance.android.livesdk.broadcast.preview.widget.startlive;

import X.C098200Yq;
import X.C189200o6;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "go_live_opt_verify_schema")
public final class GoLiveOptVerifySchemaSetting {
    public static final GoLiveOptVerifySchemaSettingAdapter DEFAULT;
    public static final GoLiveOptVerifySchemaSetting INSTANCE = new GoLiveOptVerifySchemaSetting();
    public static final GoLiveOptVerifySchemaSettingAdapter value;

    static {
        GoLiveOptVerifySchemaSettingAdapter goLiveOptVerifySchemaSettingAdapter = new GoLiveOptVerifySchemaSettingAdapter("aweme://webview_popup/?container_bg_color_dark=000000&container_bg_color_light=FFFFFF&disable_outside_click_close=0&enable_pull_down_close=1&enable_relative_calculation=1&gravity=bottom&height=300&keyboard_adjust=2&keyboard_compat=1&landscape_gravity=bottom&landscape_height=300&landscape_width=100%25&min_margin_top=10%25&radius=12&show_mask=1", "url=https%3A%2F%2Finapp.tiktokv.com%2Fucenter_web%2Fidv_core%2Fwallet%3Fpassport_ticket%3Ddefault_1p_bind_scene%26page%3Dpublish%26use_spark%3D1%26view%3Dmobile_only");
        DEFAULT = goLiveOptVerifySchemaSettingAdapter;
        GoLiveOptVerifySchemaSettingAdapter goLiveOptVerifySchemaSettingAdapter2 = (GoLiveOptVerifySchemaSettingAdapter) SettingsManager.INSTANCE.getValueSafely("go_live_opt_verify_schema", goLiveOptVerifySchemaSettingAdapter);
        if (goLiveOptVerifySchemaSettingAdapter2 != null) {
            goLiveOptVerifySchemaSettingAdapter = goLiveOptVerifySchemaSettingAdapter2;
        }
        value = goLiveOptVerifySchemaSettingAdapter;
    }

    public final String getSchema(String str, String str2, String str3) {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        try {
            c098200Yq = URLEncoder.encode(str, "UTF-8");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Object obj = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str4 = (String) c098200Yq;
        if (str4 != null) {
            str = str4;
        }
        try {
            c098200Yq2 = URLEncoder.encode(str2, "UTF-8");
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = null;
        }
        String str5 = (String) c098200Yq2;
        if (str5 != null) {
            str2 = str5;
        }
        try {
            c098200Yq3 = URLEncoder.encode(str3, "UTF-8");
            C189200o6.m2constructorimpl(c098200Yq3);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq3 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq3);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq3)) {
            obj = c098200Yq3;
        }
        String str6 = (String) obj;
        if (str6 != null) {
            str3 = str6;
        }
        StringBuilder sb = new StringBuilder();
        GoLiveOptVerifySchemaSettingAdapter goLiveOptVerifySchemaSettingAdapter = value;
        sb.append(goLiveOptVerifySchemaSettingAdapter.preFix);
        sb.append('&');
        sb.append(goLiveOptVerifySchemaSettingAdapter.originUrl);
        sb.append("%26phoneTitle%3D");
        sb.append(str);
        sb.append("%26phoneDescription%3D");
        sb.append(str2);
        sb.append("%26phoneBtnText%3D");
        sb.append(str3);
        return sb.toString();
    }
}
