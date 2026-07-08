package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class PartnershipDropsUpdateMessage extends AbstractC1136060ffY {

    @C09CT("anchor_uid")
    public long anchorUid;

    @C09CT("change_mode")
    public int changeMode;

    @C09CT("drops_id")
    public String dropsId;

    @C09CT("event_id")
    public String eventId;

    @C09CT("task_id")
    public String taskId;

    public PartnershipDropsUpdateMessage() {
        this.type = C001A.PARTNERSHIP_DROPS_UPDATE_MESSAGE;
        this.dropsId = "";
        this.taskId = "";
        this.eventId = "";
    }
}
