package com.ss.android.ugc.aweme.creative.model.landscape;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class FakeLandscapeInfo implements Serializable {

    @C09CT("fake_landscape_video_type")
    public final Integer blackLevel;

    @C09CT("bottom")
    public final Float borderBottom;

    @C09CT("left")
    public final Float borderLeft;

    @C09CT("right")
    public final Float borderRight;

    @C09CT("top")
    public final Float borderTop;

    public FakeLandscapeInfo(Integer num, Float f, Float f2, Float f3, Float f4) {
        this.blackLevel = num;
        this.borderTop = f;
        this.borderBottom = f2;
        this.borderLeft = f3;
        this.borderRight = f4;
    }
}
