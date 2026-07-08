package com.bytedance.android.livesdk.livesetting.starcomment;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_star_comment_edit_text_bug_fix_switch")
public final class LiveStarCommentEditTextBugFixSwitch {
    public static final LiveStarCommentEditTextBugFixSwitch INSTANCE = new LiveStarCommentEditTextBugFixSwitch();
    public static final boolean DEFAULT = true;

    public final boolean getSettingValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_star_comment_edit_text_bug_fix_switch", DEFAULT);
    }
}
