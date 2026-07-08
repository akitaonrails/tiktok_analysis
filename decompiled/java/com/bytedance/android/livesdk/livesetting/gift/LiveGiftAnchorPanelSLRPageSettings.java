package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_anchor_panel_slr_page")
public final class LiveGiftAnchorPanelSLRPageSettings {
    public static final String DEFAULT = "aweme://roma_redirect/?spark_page=diamond_rewards_reward_goal_popup";
    public static final LiveGiftAnchorPanelSLRPageSettings INSTANCE = new LiveGiftAnchorPanelSLRPageSettings();

    public final String slrPageSchema() {
        return SettingsManager.INSTANCE.getStringValue("live_gift_anchor_panel_slr_page", DEFAULT);
    }
}
