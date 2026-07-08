package com.bytedance.android.livesdk.model.message;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GuestApplyInfo {

    @C09CT("apply_status")
    public int applyStatus;

    @C09CT("apply_time")
    public long applyTime;

    @C09CT("channel_id")
    public long channelId;

    @C09CT("permit_expire_time")
    public long permitExpireTime;

    @C09CT("permit_time")
    public long permitTime;

    @C09CT("room_id")
    public long roomId;

    @C09CT("pre_linkmic_id")
    public String preLinkmicId = "";

    @C09CT("owner_nick_name")
    public String ownerNickName = "";
}
