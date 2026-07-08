package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.C004I;

/* JADX INFO: loaded from: classes9.dex */
public abstract class OpeningChooseMediaPageState implements C004I {
    public static final int $stable = 0;

    public static final class NoSceneAnimation extends OpeningChooseMediaPageState {
        public static final int $stable = 0;
        public static final NoSceneAnimation INSTANCE = new NoSceneAnimation();
    }

    public static final class OnSceneAnimationEnded extends OpeningChooseMediaPageState {
        public static final int $stable = 0;
        public static final OnSceneAnimationEnded INSTANCE = new OnSceneAnimationEnded();
    }

    public static final class OnSceneAnimationStarted extends OpeningChooseMediaPageState {
        public static final int $stable = 0;
        public static final OnSceneAnimationStarted INSTANCE = new OnSceneAnimationStarted();
    }
}
