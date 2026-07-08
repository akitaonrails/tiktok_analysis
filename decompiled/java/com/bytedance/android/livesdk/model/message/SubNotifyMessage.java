package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.message.CommonMessageData;

/* JADX INFO: loaded from: classes.dex */
public final class SubNotifyMessage extends AbstractC1136060ffY {

    @C09CT("event_tracking")
    public EventTracking eventTracking;

    @C09CT("exhibition_type")
    public int exhibitionType;

    @C09CT("gift_source")
    public int giftSource;

    @C09CT("is_custom")
    public boolean isCustom;

    @C09CT("is_send")
    public boolean isSend;

    @C09CT("message_display_style")
    public int messageDisplayStyle;

    @C09CT("old_subscribe_status")
    public int oldSubscribeStatus;

    @C09CT("package_id")
    public String packageId = "";

    @C09CT("public_area_message_common")
    public PublicAreaMessageCommon publicAreaMessageCommon;

    @C09CT("sub_month")
    public Long subMonth;

    @C09CT("message_type")
    public int subscribeMessageType;

    @C09CT("subscribe_type")
    public int subscribeType;

    @C09CT("subscribing_status")
    public int subscribingStatus;

    @C09CT("user")
    public User user;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return this.baseMessage != null;
    }

    @Override // X.AbstractC1136060ffY
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        return (commonMessageData == null || commonMessageData.displayText == null) ? false : true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        sb.append(", exhibition_type=");
        sb.append(this.exhibitionType);
        if (this.subMonth != null) {
            sb.append(", sub_month=");
            sb.append(this.subMonth);
        }
        sb.append(", subscribe_type=");
        sb.append(this.subscribeType);
        sb.append(", old_subscribe_status=");
        sb.append(this.oldSubscribeStatus);
        sb.replace(0, 2, "SubNotifyMessage{");
        sb.append('}');
        return sb.toString();
    }

    public SubNotifyMessage() {
        this.type = C001A.SUB_NOTIFY_MESSAGE;
    }
}
