package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class RoomStreamAdaptationMessage extends AbstractC1136060ffY {

    @C09CT("action")
    public long action;

    @C09CT("is_empty")
    public boolean isEmpty;

    @C09CT("subject_position_info")
    public SubjectPositionInfo subjectPositionInfo;

    public RoomStreamAdaptationMessage() {
        this.type = C001A.ROOM_STREAM_ADAPTATION_MESSAGE;
    }
}
