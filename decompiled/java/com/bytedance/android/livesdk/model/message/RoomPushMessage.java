package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: loaded from: classes.dex */
public class RoomPushMessage extends AbstractC1136060ffY {

    @C09CT("action_content")
    public String actionContent;

    @C09CT("action_icon")
    public ImageModel actionIcon;

    @C09CT("action_type")
    public String actionType = CardStruct.IStatusCode.DEFAULT;

    @C09CT("background_image")
    public FlexImageModel backgroundImage;

    @C09CT("color")
    public String color;

    @C09CT("content")
    public String content;

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("new_background_image")
    public FlexImageModel newBackgroundImage;

    @C09CT("push_message_display_time")
    public long pushDisplayTime;

    @C09CT("source")
    public String source;

    @C09CT("traceid")
    public String traceId;

    @Override // X.AbstractC1136060ffY
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        return (commonMessageData == null || commonMessageData.displayText == null) ? false : true;
    }

    public RoomPushMessage() {
        this.type = C001A.ROOM_PUSH;
    }
}
