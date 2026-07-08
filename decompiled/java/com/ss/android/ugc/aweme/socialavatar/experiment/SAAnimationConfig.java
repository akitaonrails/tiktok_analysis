package com.ss.android.ugc.aweme.socialavatar.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes7.dex */
public final class SAAnimationConfig {

    @C09CT("camera_border_lottie")
    public final String cameraBorder;

    @C09CT("avatar_generation_lottie")
    public final String generatingAnimation;

    public SAAnimationConfig() {
        this("", "");
    }

    public SAAnimationConfig(String str, String str2) {
        this.generatingAnimation = str;
        this.cameraBorder = str2;
    }
}
