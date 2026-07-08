package com.bytedance.android.livesdk.sei;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes34.dex */
public final class SeiEmptyRegion {

    @C09CT("h")
    public final double h;

    @C09CT("r")
    public final double radius;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final int spotId;

    @C09CT("w")
    public final double w;

    @C09CT("x")
    public final double x;

    @C09CT("y")
    public final double y;

    @C09CT("z")
    public final int z;

    public SeiEmptyRegion(int i, double d, double d2, double d3, double d4, int i2, double d5) {
        this.spotId = i;
        this.w = d;
        this.h = d2;
        this.x = d3;
        this.y = d4;
        this.z = i2;
        this.radius = d5;
    }
}
