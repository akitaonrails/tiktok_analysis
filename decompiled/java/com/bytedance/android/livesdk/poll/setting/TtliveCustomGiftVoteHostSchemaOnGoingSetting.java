package com.bytedance.android.livesdk.poll.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_custom_gift_vote_host_schema_on_going")
public final class TtliveCustomGiftVoteHostSchemaOnGoingSetting {
    public static final String DEFAULT = "aweme://roma_redirect/?roma_group_key=roma_schema_group_gift_vote&roma_page_key=roma_schema_page_customized_gift_vote_detail";
    public static final TtliveCustomGiftVoteHostSchemaOnGoingSetting INSTANCE = new TtliveCustomGiftVoteHostSchemaOnGoingSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("ttlive_custom_gift_vote_host_schema_on_going", DEFAULT);
    }
}
