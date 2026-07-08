package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorGuideTriggerMessage extends AbstractC1136060ffY {

    @C09CT("biz_info")
    public AnchorGuideTriggerBizInfo bizInfo;

    @C09CT("guide_target")
    public GuideTarget guideTarget;

    @C09CT("trigger_name")
    public String triggerName;

    @C09CT("trigger_time")
    public long triggerTime;

    public AnchorGuideTriggerMessage() {
        this.type = C001A.ANCHOR_GUIDE_TRIGGER_MESSAGE;
        this.triggerName = "";
    }
}
