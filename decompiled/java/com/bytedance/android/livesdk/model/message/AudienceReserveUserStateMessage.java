package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class AudienceReserveUserStateMessage extends AbstractC1136060ffY {

    @C09CT("audience_cancel_content")
    public AudienceCancelContent audienceCancelContent;

    @C09CT("audience_reject_content")
    public AudienceRejectContent audienceRejectContent;

    @C09CT("audience_reply_content")
    public AudienceReplyContent audienceReplyContent;

    @C09CT("audience_reserve_content")
    public AudienceReserveContent audienceReserveContent;

    @C09CT("audience_reserve_user_info")
    public AudienceReserveUserInfo audienceReserveUserInfo;

    @C09CT("room_id")
    public long roomId;

    @C09CT("type")
    public int type;

    public AudienceReserveUserStateMessage() {
        super.type = C001A.AUDIENCE_RESERVE_USER_STATE_MESSAGE;
    }
}
