package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_undisclosed_market_scheme")
public final class LiveUndisclosedCCToggleSchemeSetting {
    public static final String DEFAULT = "aweme://lynxview_popup/?keyboard_adjust=0&hide_nav_bar=1&live_status=during_live&is_living=true&dynamic=1&popup_enter_type=bottom&height_percent=73&radius=10&channel=reactlynx_talent_live_showcase&bundle=app/template.js&close_by_mask=1&need_out_animation=bottom&close_by_gesture=0&drag_by_gesture=0&use_gecko_first=1&use_bdx=1&container_bgcolor=app_theme&surl=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fteu%2Fclient-t%2Flynx%2Freactlynx_talent_live_showcase%2Fapp%2Ftemplate.js&ab_params=oec_affiliate_incident_toast_configuration,live_tts_pin_not_check_inventory&enable_code_cache=1&group=-1&disable_share=1&share_group=0&user_type=author";
    public static final LiveUndisclosedCCToggleSchemeSetting INSTANCE = new LiveUndisclosedCCToggleSchemeSetting();

    public static final String getSchema() {
        String value = INSTANCE.getValue();
        return a0.LJJJIL(value) ? "aweme://lynxview_popup/?keyboard_adjust=0&hide_nav_bar=1&live_status=during_live&is_living=true&dynamic=1&popup_enter_type=bottom&height_percent=73&radius=10&channel=reactlynx_talent_live_showcase&bundle=app/template.js&close_by_mask=1&need_out_animation=bottom&close_by_gesture=0&drag_by_gesture=0&use_gecko_first=1&use_bdx=1&container_bgcolor=app_theme&surl=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fteu%2Fclient-t%2Flynx%2Freactlynx_talent_live_showcase%2Fapp%2Ftemplate.js&ab_params=oec_affiliate_incident_toast_configuration,live_tts_pin_not_check_inventory&enable_code_cache=1&group=-1&disable_share=1&share_group=0&user_type=author" : value;
    }

    private final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_undisclosed_market_scheme", DEFAULT);
    }
}
