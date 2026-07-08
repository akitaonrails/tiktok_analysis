package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class CohostSubtitleBanMessage extends AbstractC1136060ffY {

    @C09CT("subtitle_ban_type")
    public int subtitleBanType;

    @C09CT("toast_text")
    public Text toastText;

    public CohostSubtitleBanMessage() {
        this.type = C001A.COHOST_SUBTITLE_BAN_MESSAGE;
    }
}
