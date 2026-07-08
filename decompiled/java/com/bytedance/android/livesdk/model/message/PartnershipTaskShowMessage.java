package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class PartnershipTaskShowMessage extends AbstractC1136060ffY {

    @C09CT("change_mode")
    public int changeMode;

    @C09CT("has_show_task")
    public boolean hasShowTask;

    @C09CT("task_type")
    public int taskType;

    @C09CT("task_id")
    public String taskId = "";

    @C09CT("game_id")
    public String gameId = "";

    public PartnershipTaskShowMessage() {
        this.type = C001A.PARTNERSHIP_TASK_SHOW_MESSAGE;
    }
}
