package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class AnimationStyleInfo {

    @C09CT("animation_lottie_url")
    public String animationLottieUrl;

    @C09CT("preload_animation_type")
    public Integer preloadAnimationType;

    public AnimationStyleInfo() {
        this(null, null);
    }

    public AnimationStyleInfo(String str, Integer num) {
        this.animationLottieUrl = str;
        this.preloadAnimationType = num;
    }
}
