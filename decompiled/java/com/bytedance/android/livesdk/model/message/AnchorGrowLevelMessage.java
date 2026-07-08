package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import kotlin.text.a0;
import webcast.data.AnchorGrowLevelImMsg;
import webcast.data.AnchorGrowLevelImMsgNotification;
import webcast.data.AnchorGrowLevelImMsgV2;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorGrowLevelMessage extends AbstractC1136060ffY {

    @C09CT("anchor_grow_level_im_msg")
    public AnchorGrowLevelImMsg anchorGrowLevelImMsg;

    @C09CT("anchor_grow_level_im_msg_v2")
    public AnchorGrowLevelImMsgV2 anchorGrowLevelImMsgV2;

    @Override // X.AbstractC1136060ffY
    public final boolean supportDisplayText() {
        AnchorGrowLevelImMsgNotification anchorGrowLevelImMsgNotification;
        String str;
        AnchorGrowLevelImMsgNotification anchorGrowLevelImMsgNotification2;
        String str2;
        AnchorGrowLevelImMsgV2 anchorGrowLevelImMsgV2 = this.anchorGrowLevelImMsgV2;
        if (anchorGrowLevelImMsgV2 != null && anchorGrowLevelImMsgV2.msgType == 2 && (anchorGrowLevelImMsgNotification2 = anchorGrowLevelImMsgV2.notificationData) != null && (str2 = anchorGrowLevelImMsgNotification2.content) != null) {
            a0.LJJJIL(str2);
        }
        AnchorGrowLevelImMsgV2 anchorGrowLevelImMsgV22 = this.anchorGrowLevelImMsgV2;
        return (anchorGrowLevelImMsgV22 == null || anchorGrowLevelImMsgV22.msgType != 2 || (anchorGrowLevelImMsgNotification = anchorGrowLevelImMsgV22.notificationData) == null || (str = anchorGrowLevelImMsgNotification.content) == null || a0.LJJJIL(str)) ? false : true;
    }

    public AnchorGrowLevelMessage() {
        this.type = C001A.ANCHOR_GROW_LEVEL_MESSAGE;
    }

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return supportDisplayText();
    }
}
