package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorTaskReminderMessage extends AbstractC1136060ffY {

    @C09CT("task_record_id")
    public String taskRecordId;

    public AnchorTaskReminderMessage() {
        this.type = C001A.ANCHOR_TASK_REMINDER_MESSAGE;
        this.taskRecordId = "";
    }
}
