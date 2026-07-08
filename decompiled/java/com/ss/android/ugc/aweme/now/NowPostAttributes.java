package com.ss.android.ugc.aweme.now;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class NowPostAttributes implements Serializable {

    @C09CT("now_creation_type")
    public int creationType;

    @C09CT("expired_at")
    public long expiredAt;

    @C09CT("now_post_camera_type")
    public int nowPostCameraType;

    public NowPostAttributes() {
    }

    public NowPostAttributes(long j, int i, int i2) {
        this.expiredAt = j;
        this.nowPostCameraType = i;
        this.creationType = i2;
    }
}
