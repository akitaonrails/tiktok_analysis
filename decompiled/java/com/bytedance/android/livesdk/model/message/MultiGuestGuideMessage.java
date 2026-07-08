package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MultiGuestGuideMessage extends AbstractC1136060ffY {

    @C09CT("display_position")
    public long displayPosition;

    @C09CT("linkmic_id")
    public String linkmicId;

    @C09CT("message_type")
    public int messageType;

    @C09CT("request_id")
    public String requestId;

    @C09CT("trigger_type")
    public String triggerType;

    @C09CT("user")
    public List<User> user;

    public MultiGuestGuideMessage() {
        this.type = C001A.MULTI_GUEST_GUIDE_MESSAGE;
        this.user = new ArrayList();
        this.triggerType = "";
        this.requestId = "";
        this.linkmicId = "";
    }
}
