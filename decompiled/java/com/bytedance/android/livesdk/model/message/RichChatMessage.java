package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.message.CommonMessageData;

/* JADX INFO: loaded from: classes.dex */
public class RichChatMessage extends AbstractC1136060ffY {

    @C09CT("action_content")
    public String actionContent;

    @C09CT("action_type")
    public String actionType;

    @C09CT("color")
    public String color;

    @C09CT("content")
    public String content;

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("push_message_display_time")
    public long pushDisplayTime;

    @C09CT("traceid")
    public String traceId;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    @Override // X.AbstractC1136060ffY
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        return (commonMessageData == null || commonMessageData.displayText == null) ? false : true;
    }

    public RichChatMessage() {
        this.type = C001A.ROOM_RICH_CHAT_MESSAGE;
    }
}
