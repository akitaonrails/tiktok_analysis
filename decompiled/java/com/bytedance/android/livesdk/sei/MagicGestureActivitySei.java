package com.bytedance.android.livesdk.sei;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes18.dex */
public final class MagicGestureActivitySei {

    @C09CT("action_schema")
    public String actionSchema;

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("animation_duration")
    public int animDuration;

    @C09CT("point_x")
    public double pointX;

    @C09CT("point_y")
    public double pointY;

    @C09CT("radius_x")
    public double radiusX;

    @C09CT("radius_y")
    public double radiusY;

    @C09CT("resource_id")
    public String resourceId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    public MagicGestureActivitySei() {
        this(0, 0.0d, 0.0d, 0.0d, 0.0d, 3, "", 0L, "");
    }

    public MagicGestureActivitySei(int i, double d, double d2, double d3, double d4, int i2, String str, long j, String str2) {
        this.status = i;
        this.pointX = d;
        this.pointY = d2;
        this.radiusX = d3;
        this.radiusY = d4;
        this.animDuration = i2;
        this.resourceId = str;
        this.anchorId = j;
        this.actionSchema = str2;
    }
}
