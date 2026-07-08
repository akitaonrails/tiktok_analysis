package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.LinkMicAudienceNoticeMessage;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LinkmicAudienceInviteGroupChatMemberGuide {

    @C09CT("button_content")
    public LinkMicAudienceNoticeMessage.LinkMicAudienceNoticeText buttonContent;

    @C09CT("content")
    public LinkMicAudienceNoticeMessage.LinkMicAudienceNoticeText content;

    @C09CT("group_member_user_ids")
    public List<Long> groupMemberUserIds = new ArrayList();
}
