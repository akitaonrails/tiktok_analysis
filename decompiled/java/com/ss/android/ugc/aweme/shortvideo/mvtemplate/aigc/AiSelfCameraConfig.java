package com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc;

import X.C09CT;

/* JADX INFO: loaded from: classes26.dex */
public final class AiSelfCameraConfig {

    @C09CT("center_range")
    public final CenterRange centerRange;

    @C09CT("check_neutral_expression")
    public final boolean checkNeutralExpression;

    @C09CT("distance_range")
    public final DetectRange distanceRange;

    @C09CT("front_detect_range")
    public final AiSelfCameraDetectRange frontDetectRange;

    @C09CT("left_detect_range")
    public final AiSelfCameraDetectRange leftDetectRange;

    @C09CT("right_detect_range")
    public final AiSelfCameraDetectRange rightDetectRange;

    public AiSelfCameraConfig(AiSelfCameraDetectRange aiSelfCameraDetectRange, AiSelfCameraDetectRange aiSelfCameraDetectRange2, AiSelfCameraDetectRange aiSelfCameraDetectRange3, CenterRange centerRange, DetectRange detectRange, boolean z) {
        this.frontDetectRange = aiSelfCameraDetectRange;
        this.leftDetectRange = aiSelfCameraDetectRange2;
        this.rightDetectRange = aiSelfCameraDetectRange3;
        this.centerRange = centerRange;
        this.distanceRange = detectRange;
        this.checkNeutralExpression = z;
    }
}
