package com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc;

import X.C09CT;

/* JADX INFO: loaded from: classes26.dex */
public final class AiSelfCameraDetectRange {

    @C09CT("pitch_range")
    public final DetectRange pitchRange;

    @C09CT("roll_range")
    public final DetectRange rollRange;

    @C09CT("yaw_range")
    public final DetectRange yawRange;

    public AiSelfCameraDetectRange(DetectRange detectRange, DetectRange detectRange2, DetectRange detectRange3) {
        this.pitchRange = detectRange;
        this.rollRange = detectRange2;
        this.yawRange = detectRange3;
    }
}
