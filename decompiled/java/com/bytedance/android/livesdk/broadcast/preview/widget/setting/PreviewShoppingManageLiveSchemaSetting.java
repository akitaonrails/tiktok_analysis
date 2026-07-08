package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "gbl_ec_live_console_schema")
public final class PreviewShoppingManageLiveSchemaSetting {
    public static final String DEFAULT = "aweme://lynxview_popup/?disable_tea_intercept=1&radius=10&hide_nav_bar=1&use_forest=1&target_handler=ecom&container_bgcolor=app_theme&close_by_mask=1&need_out_animation=bottom&channel=reactlynx_talent_live_showcase&self_sale=0&use_bdx=1&close_by_gesture=0&ec_inject_data_spark_router_redirect=1&use_gecko_first=1&dynamic=1&show_mask=1&live_status=before_live&drag_by_gesture=0&height_percent=73&bundle=app%2Ftemplate.js&keyboard_adjust=0&trans_status_bar=0&tea_init_time=1724309360505&popup_enter_type=bottom&surl=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fteu%2Fclient-t%2Flynx%2Freactlynx_talent_live_showcase%2Fapp%2Ftemplate.js&toggle=0";
    public static final PreviewShoppingManageLiveSchemaSetting INSTANCE = new PreviewShoppingManageLiveSchemaSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("gbl_ec_live_console_schema", DEFAULT);
    }
}
