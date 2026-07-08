package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.LinkMicAudienceNoticeMessage;

/* JADX INFO: loaded from: classes.dex */
public final class CapsuleBizParamsMultiGuestInviteGuide {

    @C09CT("display_strategy")
    public int displayStrategy;

    @C09CT("group_chat_member_invite_guide")
    public LinkmicAudienceInviteGroupChatMemberGuide groupChatMemberInviteGuide;

    @C09CT("invitee_user")
    public User inviteeUser;

    @C09CT("linkmic_audience_invite_notice_reason")
    public String linkmicAudienceInviteNoticeReason = "";

    @C09CT("notice_guide")
    public LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide noticeGuide;

    @C09CT("notice_type")
    public int noticeType;

    @C09CT("turn_on_guide")
    public LinkMicAudienceNoticeMessage.LinkMicAudienceTurnOnGuide turnOnGuide;
}
