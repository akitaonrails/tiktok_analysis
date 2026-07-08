package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.message.CommonMessageData;

/* JADX INFO: loaded from: classes.dex */
public final class GiftGalleryMessage extends AbstractC1136060ffY {

    @C09CT("all_sponsored")
    public boolean allSponsored;

    @C09CT("gift_info")
    public GiftInfo giftInfo;

    @C09CT("log_id")
    public String logId;

    @C09CT("msg_type")
    public int msgType;

    @C09CT("priority")
    public GiftIMPriority priority;

    @C09CT("public_area_msg_common")
    public PublicAreaMessageCommon publicAreaMsgCommon;

    @C09CT("to_user")
    public User toUser;

    @C09CT("user")
    public User user;

    public static final class GiftInfo {

        @C09CT("gift")
        public Gift gift;

        @C09CT("high_value")
        public boolean highValue;

        @C09CT("lighted_up_gift_id")
        public long lightedUpGiftId;

        @C09CT("unlighted_gift_icon")
        public String unlightedGiftIcon = "";
    }

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        CommonMessageData commonMessageData = this.baseMessage;
        return (commonMessageData == null || commonMessageData.displayText == null) ? false : true;
    }

    @Override // X.AbstractC1136060ffY
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        return (commonMessageData == null || commonMessageData.displayText == null) ? false : true;
    }

    public GiftGalleryMessage() {
        this.type = C001A.GIFT_GALLERY_MESSAGE;
        this.logId = "";
    }
}
