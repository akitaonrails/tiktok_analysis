package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("multi_guest_hangout_page_data")
public final class MultiGuestHangoutPageDataSetting {
    public static final MultiGuestHangoutPageDataSetting INSTANCE = new MultiGuestHangoutPageDataSetting();
    public static final MultiGuestHangoutPageData DEFAULT = new MultiGuestHangoutPageData(C1697810uHb.LJIIJJI(new InteractionModule(3, "ttlive_hangoutMulti_randomChat_topicName", "ttlive_hangoutMulti_join_btn", "#1763E8", 0, "hangout_mg_agg_playlabel_random_chat"), new InteractionModule(1, "ttlive_hangoutMulti_dating_topicName", "ttlive_hangoutMulti_join_btn", "#D416A2", 1005, "hangout_mg_agg_playlabel_dating"), new InteractionModule(5, "ttlive_hangoutMulti_discussion_topicName", "ttlive_hangoutMulti_join_btn", "#6220E6", 1002, "hangout_mg_agg_playlabel_debating"), new InteractionModule(2, "ttlive_hangoutMulti_onlineFriends_topicName", "ttlive_hangoutMulti_goLIVE_btn", "#1763E8", 0, "hangout_mg_agg_playlabel_friends_online")), C1697810uHb.LJIIJJI(new TabModule("hangout_live_cell_all", "ttlive_hangoutMulti_all_topicPill", 0), new TabModule("hangout_live_cell_talent_show", "ttlive_hangoutMulti_talentShow_topicPill", 1004), new TabModule("hangout_live_cell_boxbattle", "ttlive_hangoutMulti_boxBattle_topicPill", 1001)));

    public final MultiGuestHangoutPageData getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MultiGuestHangoutPageData multiGuestHangoutPageData = DEFAULT;
        MultiGuestHangoutPageData multiGuestHangoutPageData2 = (MultiGuestHangoutPageData) settingsManager.getValueSafely("multi_guest_hangout_page_data", multiGuestHangoutPageData);
        return multiGuestHangoutPageData2 != null ? multiGuestHangoutPageData2 : multiGuestHangoutPageData;
    }
}
