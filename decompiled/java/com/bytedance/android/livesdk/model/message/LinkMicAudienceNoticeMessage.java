package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public class LinkMicAudienceNoticeMessage extends AbstractC1136060ffY {

    @C09CT("apply_guide")
    public LinkmicAudienceApplyGuide applyGuide;

    @C09CT("group_chat_member_invite_guide")
    public LinkmicAudienceInviteGroupChatMemberGuide groupChatMemberInviteGuide;

    @C09CT("notice_guide")
    public LinkMicAudienceInviteGuide inviteGuide;

    @C09CT("notice_type")
    public int noticeType;

    @C09CT("turn_on_guide")
    public LinkMicAudienceTurnOnGuide turnOnGuide;

    public static class LinkMicAudienceInviteGuide {

        @C09CT("button_content")
        public LinkMicAudienceNoticeText buttonContent;

        @C09CT("content")
        public LinkMicAudienceNoticeText content;

        @C09CT("display_strategy")
        public int displayStrategy;

        @C09CT("linkmic_audience_invite_notice_reason")
        public String linkmicAudienceInviteNoticeReason = "";

        @C09CT("user")
        public User user;
    }

    public static class LinkMicAudienceNoticeText {

        @C09CT("text")
        public String text;
    }

    public static class LinkMicAudienceTurnOnGuide {

        @C09CT("button_content")
        public LinkMicAudienceNoticeText buttonContent;

        @C09CT("content")
        public LinkMicAudienceNoticeText content;
    }

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    public LinkMicAudienceNoticeMessage() {
        this.type = C001A.LINK_AUDIENCE_NOTICE;
    }
}
