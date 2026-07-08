package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class CohostReserveMessage extends AbstractC1136060ffY {

    @C09CT("reply_content")
    public ReplyContent replyContent;

    @C09CT("reservation_id")
    public long reservationId;

    @C09CT("reserve_content")
    public ReserveContent reserveContent;

    @C09CT("reserve_type")
    public int reserveType;

    public CohostReserveMessage() {
        this.type = C001A.COHOST_RESERVE_MESSAGE;
    }
}
