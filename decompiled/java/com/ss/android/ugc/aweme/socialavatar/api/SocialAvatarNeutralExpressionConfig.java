package com.ss.android.ugc.aweme.socialavatar.api;

import X.C09CT;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarNeutralExpressionConfig {

    @C09CT("angry")
    public final float angry;

    @C09CT("disgust")
    public final float disgust;

    @C09CT("fear")
    public final float fear;

    @C09CT("happy")
    public final float happy;

    @C09CT("neutral")
    public final float neutral;

    @C09CT("sad")
    public final float sad;

    @C09CT("surprise")
    public final float surprise;

    public SocialAvatarNeutralExpressionConfig() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    public SocialAvatarNeutralExpressionConfig(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.angry = f;
        this.disgust = f2;
        this.fear = f3;
        this.happy = f4;
        this.sad = f5;
        this.surprise = f6;
        this.neutral = f7;
    }
}
