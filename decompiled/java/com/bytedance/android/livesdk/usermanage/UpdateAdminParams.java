package com.bytedance.android.livesdk.usermanage;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class UpdateAdminParams {

    @C09CT("update_type")
    public int adminType;

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("permissions")
    public Map<Integer, Integer> permissions;

    @C09CT("current_room_id")
    public long roomId;

    @C09CT("to_user_id")
    public long userId;

    public UpdateAdminParams(int i, long j, long j2, long j3, Map<Integer, Integer> map) {
        this.adminType = i;
        this.userId = j;
        this.anchorId = j2;
        this.roomId = j3;
        this.permissions = map;
    }
}
