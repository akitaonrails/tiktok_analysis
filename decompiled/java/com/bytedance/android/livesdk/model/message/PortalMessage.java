package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.AnonymousClass0006;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.Portal;
import com.bytedance.android.livesdkapi.message.CommonMessageData;

/* JADX INFO: loaded from: classes.dex */
public class PortalMessage extends AbstractC1136060ffY {

    @C09CT("next_ping_time")
    public Long nextPingTime;

    @C09CT("payload")
    public AnonymousClass0006 payload;

    @C09CT("type")
    public int payloadType;

    @C09CT("portal")
    public Portal portal;

    @C09CT("portal_buy")
    public PortalBuy portalBuy;

    @C09CT("portal_finish")
    public PortalFinish portalFinish;

    @C09CT("portal_id")
    public long portalId;

    @C09CT("portal_invite")
    public PortalInvite portalInvite;

    @C09CT("room_id")
    public long roomId;

    public static class PortalBuy implements AnonymousClass0006 {

        @C09CT("sugar_daddy")
        public User sugarDaddy;
    }

    public static class PortalFinish implements AnonymousClass0006 {

        @C09CT("lucky_person")
        public User luckyPerson;
    }

    public static class PortalInvite implements AnonymousClass0006 {

        @C09CT("anchor")
        public User anchor;

        @C09CT("cover")
        public ImageModel cover;

        @C09CT("invite_count_down")
        public long inviteCountDown;

        @C09CT("reward_count_down")
        public long rewardCountDown;

        @C09CT("sugar_daddy")
        public User sugarDaddy;
    }

    @Override // X.AbstractC1136060ffY
    public final boolean supportDisplayText() {
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        CommonMessageData commonMessageData = this.baseMessage;
        return (commonMessageData == null || commonMessageData.displayText == null) ? false : true;
    }

    public PortalMessage() {
        this.type = C001A.PORTAL_MESSAGE;
    }
}
