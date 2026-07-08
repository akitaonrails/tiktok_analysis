package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public final class MultiGuestRandomMatchMessage extends AbstractC1136060ffY {

    @C09CT("author_user")
    public User authorUser;

    @C09CT("match_status")
    public int matchStatus;

    @C09CT("room_id")
    public long roomId;

    public MultiGuestRandomMatchMessage() {
        this.type = C001A.MULTI_GUEST_RANDOM_MATCH_MESSAGE;
    }
}
