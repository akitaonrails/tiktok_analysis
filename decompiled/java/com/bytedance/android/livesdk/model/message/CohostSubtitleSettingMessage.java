package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.interact.SubtitleSettings;

/* JADX INFO: loaded from: classes.dex */
public final class CohostSubtitleSettingMessage extends AbstractC1136060ffY {

    @C09CT("settings")
    public SubtitleSettings settings;

    public CohostSubtitleSettingMessage() {
        this.type = C001A.COHOST_SUBTITLE_SETTING_MESSAGE;
    }
}
