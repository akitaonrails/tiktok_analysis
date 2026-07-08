package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class MultiGuestPreApproveMessage extends AbstractC1136060ffY {

    @C09CT("audience_user_id")
    public long audienceUserId;

    @C09CT("host_user_id")
    public long hostUserId;

    @C09CT("message_type")
    public int messageType;

    @C09CT("people_ahead_num")
    public long peopleAheadNum;

    @C09CT("pre_approve_source")
    public int preApproveSource;

    @C09CT("recipient_type")
    public int recipientType;

    public MultiGuestPreApproveMessage() {
        this.type = C001A.MULTI_GUEST_PRE_APPROVE_MESSAGE;
    }
}
