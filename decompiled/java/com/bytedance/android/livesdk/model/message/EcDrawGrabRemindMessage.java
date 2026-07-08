package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class EcDrawGrabRemindMessage extends AbstractC1136060ffY {

    @C09CT("activity_id")
    public long activityId;

    @C09CT("schema")
    public String schema;

    public EcDrawGrabRemindMessage() {
        this.type = C001A.EC_DRAW_GRAB_REMIND_MESSAGE;
        this.schema = "";
    }
}
