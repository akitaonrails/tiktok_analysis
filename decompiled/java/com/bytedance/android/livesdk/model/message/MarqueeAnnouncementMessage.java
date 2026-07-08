package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MarqueeAnnouncementMessage extends AbstractC1136060ffY {

    @C09CT("message_entity")
    public List<MessageEntity> messageEntity;

    @C09CT("message_scene")
    public String messageScene;

    public static class MessageEntity {

        @C09CT("notify")
        public RoomNotifyMessage notifyMessage;
    }

    public MarqueeAnnouncementMessage() {
        this.type = C001A.MARQUEE_ANNOUNCEMENT_MESSAGE;
    }
}
