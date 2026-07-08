package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class MultiGuestUpdateSkylightMessage extends AbstractC1136060ffY {

    @C09CT("out_room_apply_status")
    public OutRoomApply outRoomApplyStatus;

    @C09CT("update_skylight_type")
    public int updateSkylightType;

    public MultiGuestUpdateSkylightMessage() {
        this.type = C001A.MULTI_GUEST_UPDATE_SKYLIGHT_MESSAGE;
    }
}
