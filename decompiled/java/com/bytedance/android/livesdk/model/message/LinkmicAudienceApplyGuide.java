package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.LinkMicAudienceNoticeMessage;

/* JADX INFO: loaded from: classes.dex */
public final class LinkmicAudienceApplyGuide {

    @C09CT("button_content")
    public LinkMicAudienceNoticeMessage.LinkMicAudienceNoticeText buttonContent;

    @C09CT("content")
    public LinkMicAudienceNoticeMessage.LinkMicAudienceNoticeText content;

    @C09CT("display_position")
    public long displayPosition;

    @C09CT("display_strategy")
    public int displayStrategy;

    @C09CT("user")
    public User user;

    @C09CT("linkmic_audience_apply_notice_reason")
    public String linkmicAudienceApplyNoticeReason = "";

    @C09CT("trigger_type")
    public String triggerType = "";

    @C09CT("request_id")
    public String requestId = "";

    @C09CT("linkmic_id")
    public String linkmicId = "";
}
