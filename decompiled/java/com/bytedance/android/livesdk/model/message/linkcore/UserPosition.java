package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class UserPosition {

    @C09CT("pos")
    public MicPositionData position;

    @C09CT("user_id")
    public long uid;

    public UserPosition() {
        this(0L, null);
    }

    public UserPosition(long j, MicPositionData micPositionData) {
        this.uid = j;
        this.position = micPositionData;
    }
}
