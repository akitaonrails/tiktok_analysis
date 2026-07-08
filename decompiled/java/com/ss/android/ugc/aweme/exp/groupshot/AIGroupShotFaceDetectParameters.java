package com.ss.android.ugc.aweme.exp.groupshot;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public final class AIGroupShotFaceDetectParameters implements Serializable {

    @C09CT("pitch")
    public final Float pitch;

    @C09CT("roll")
    public final Float roll;

    @C09CT("yaw")
    public final Float yaw;

    public AIGroupShotFaceDetectParameters() {
        this(null, null, null);
    }

    public AIGroupShotFaceDetectParameters(Float f, Float f2, Float f3) {
        this.yaw = f;
        this.pitch = f2;
        this.roll = f3;
    }
}
