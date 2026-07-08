package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_dynamic_list_section_array")
public final class LiveCoHostInviteListDynamicListSectionSettings {
    public static final String[] DEFAULT;
    public static final String[] DEFAULT_LIST;
    public static final LiveCoHostInviteListDynamicListSectionSettings INSTANCE = new LiveCoHostInviteListDynamicListSectionSettings();

    static {
        String[] strArr = {"status_section", "match_pair_section", "native_banner_section", "recap_banner_section", "new_user_education_section", "quick_pair_section", "nudge_section", "friends_section", "may_know_section", "recommend_section"};
        DEFAULT_LIST = strArr;
        DEFAULT = strArr;
    }

    public final String[] getSectionList() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_cohost_dynamic_list_section_array", DEFAULT);
    }

    public final String[] getDEFAULT_LIST() {
        return DEFAULT_LIST;
    }
}
