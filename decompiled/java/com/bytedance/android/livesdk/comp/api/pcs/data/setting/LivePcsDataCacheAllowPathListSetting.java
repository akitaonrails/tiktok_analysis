package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_data_cache_allow_path_list")
public final class LivePcsDataCacheAllowPathListSetting {
    public static final LivePcsDataCacheAllowPathListSetting INSTANCE = new LivePcsDataCacheAllowPathListSetting();
    public static final String[] DEFAULT = {"/webcast/sub/privilege/get_sub_privilege_detail/", "/webcast/sub/gift/send_subscription_panel/", "/webcast/sub/smb/creator_info/", "/webcast/sub/smb/service_stat/", "/webcast/sub/smb/qualification/", "/webcast/sub/upsell/industry_list/", "/webcast/sub/upsell/one_stop_shop_setup/info/", "/webcast/smb/course/detail/", "/webcast/sub/smb/preview/", "/webcast/smb/opt_in/progress/", "/webcast/sub/smb/service_switch_info/"};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_pcs_data_cache_allow_path_list", DEFAULT);
    }
}
