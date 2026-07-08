package com.bytedance.android.livesdk.interaction.custompoll.shorttouch.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_custom_gift_vote_short_touch_enter_schema")
public final class TtliveCustomGiftVoteShortTouchEnterSchemaSetting {
    public static final String DEFAULT = "aweme://roma_redirect/?roma_group_key=roma_schema_group_gift_vote&roma_page_key=roma_schema_page_short_touch_customized_enter";
    public static final TtliveCustomGiftVoteShortTouchEnterSchemaSetting INSTANCE = new TtliveCustomGiftVoteShortTouchEnterSchemaSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("ttlive_custom_gift_vote_short_touch_enter_schema", DEFAULT);
    }
}
