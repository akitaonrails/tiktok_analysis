package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public class RoomVerifyMessage extends AbstractC1136060ffY {

    @C09CT("close_room")
    public Boolean closeRoom;

    @C09CT("content")
    public String content;

    @C09CT("notice_type")
    public Long noticeType;

    @C09CT("action")
    public int verifyAction;

    public RoomVerifyMessage() {
        this.type = C001A.ROOM_VERIFY;
    }
}
