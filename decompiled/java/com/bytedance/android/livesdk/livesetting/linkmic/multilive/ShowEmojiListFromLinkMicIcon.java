package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("show_emoji_panel_from_linkmic_icon")
public final class ShowEmojiListFromLinkMicIcon {
    public static final int DEFAULT = 0;
    public static final ShowEmojiListFromLinkMicIcon INSTANCE = new ShowEmojiListFromLinkMicIcon();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("show_emoji_panel_from_linkmic_icon", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
