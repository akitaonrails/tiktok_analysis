package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class PartnershipCardChangeMessage extends AbstractC1136060ffY {

    @C09CT("change_mode")
    public int changeMode;

    @C09CT("game_id")
    public String gameId = "";

    @C09CT("sequence_id")
    public Integer sequenceId;

    @C09CT("task_id")
    public String taskId;

    @C09CT("task_type")
    public int taskType;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", change_mode=");
        sb.append(this.changeMode);
        if (this.sequenceId != null) {
            sb.append(", sequence_id=");
            sb.append(this.sequenceId);
        }
        if (this.taskId != null) {
            sb.append(", task_id=");
            sb.append(this.taskId);
        }
        sb.replace(0, 2, "PartnershipCardChangeMessage{");
        sb.append('}');
        return sb.toString();
    }

    public PartnershipCardChangeMessage() {
        this.type = C001A.PARTNERSHIP_CARD_CHANGE_MESSAGE;
    }
}
