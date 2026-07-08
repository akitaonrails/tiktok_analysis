package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MultiGuestBubbleMessage extends AbstractC1136060ffY {

    @C09CT("display_position")
    public int displayPosition;

    @C09CT("message_type")
    public int messageType;

    @C09CT("request_id")
    public String requestId;

    @C09CT("trigger_type")
    public String triggerType;

    @C09CT("user")
    public List<User> user;

    public MultiGuestBubbleMessage() {
        this.type = C001A.MULTI_GUEST_BUBBLE_MESSAGE;
        this.user = new ArrayList();
        this.triggerType = "";
        this.requestId = "";
    }
}
