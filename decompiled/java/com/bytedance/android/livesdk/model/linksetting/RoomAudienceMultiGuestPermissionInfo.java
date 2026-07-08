package com.bytedance.android.livesdk.model.linksetting;

import X.C09CT;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestPermissionInfo;

/* JADX INFO: loaded from: classes.dex */
public final class RoomAudienceMultiGuestPermissionInfo {

    @C09CT("permission_info")
    public MultiGuestPermissionInfo permissionInfo;

    @C09CT("room_pack_succ_flag")
    public boolean roomPackSuccessFlag;

    public RoomAudienceMultiGuestPermissionInfo() {
        this(false, null);
    }

    public RoomAudienceMultiGuestPermissionInfo(boolean z, MultiGuestPermissionInfo multiGuestPermissionInfo) {
        this.roomPackSuccessFlag = z;
        this.permissionInfo = multiGuestPermissionInfo;
    }
}
