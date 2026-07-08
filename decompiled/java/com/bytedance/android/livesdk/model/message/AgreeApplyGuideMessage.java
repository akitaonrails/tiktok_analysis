package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public final class AgreeApplyGuideMessage extends AbstractC1136060ffY {

    @C09CT("display_position")
    public long displayPosition;

    @C09CT("request_id")
    public String requestId;

    @C09CT("trigger_type")
    public String triggerType;

    @C09CT("user")
    public User user;

    public AgreeApplyGuideMessage() {
        this.type = C001A.AGREE_APPLY_GUIDE_MESSAGE;
        this.triggerType = "";
        this.requestId = "";
    }
}
