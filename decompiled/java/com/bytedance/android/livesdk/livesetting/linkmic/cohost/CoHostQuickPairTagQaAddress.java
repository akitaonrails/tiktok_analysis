package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_quick_pair_tag_qa_address")
public final class CoHostQuickPairTagQaAddress {
    public static final CoHostQuickPairTagQaAddress INSTANCE = new CoHostQuickPairTagQaAddress();
    public static final String DEFAULT = "sslocal://webcast_webview_popup?url=https://sf19-draftcdn-sg.ibytedtos.com/obj/ies-hotsoon-draft-sg/tiktok-live-faq/quick_pair_tag.html&height=50%&mask_bg_color=#FFFFFF&radius=8";
    public static final String value = SettingsManager.INSTANCE.getStringValue("cohost_quick_pair_tag_qa_address", DEFAULT);

    public final String getValue() {
        return value;
    }
}
