package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_comment_tray_group")
public final class LiveCommentComboTraySetting {
    public static final LiveCommentComboTraySetting INSTANCE = new LiveCommentComboTraySetting();
    public static final CommentComboTrayConfig DEFAULT = new CommentComboTrayConfig(2000);

    private final CommentComboTrayConfig config() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        CommentComboTrayConfig commentComboTrayConfig = DEFAULT;
        CommentComboTrayConfig commentComboTrayConfig2 = (CommentComboTrayConfig) settingsManager.getValueSafely("live_comment_tray_group", commentComboTrayConfig);
        return commentComboTrayConfig2 != null ? commentComboTrayConfig2 : commentComboTrayConfig;
    }

    public final long getCommentComboTrayDuration() {
        return config().commentComboTrayDuration;
    }
}
