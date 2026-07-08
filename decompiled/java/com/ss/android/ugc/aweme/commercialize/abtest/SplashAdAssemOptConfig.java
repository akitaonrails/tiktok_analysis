package com.ss.android.ugc.aweme.commercialize.abtest;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class SplashAdAssemOptConfig {

    @C09CT("interactive_gesture_assem_opt_enable")
    public Boolean interactiveGestureOpt;

    @C09CT("play_fun_assem_opt_enable")
    public Boolean playFunOpt;

    @C09CT("play_fun_assem_opt_enable_v2")
    public Boolean playFunOptV2;

    public SplashAdAssemOptConfig() {
        this(null, null, null);
    }

    public SplashAdAssemOptConfig(Boolean bool, Boolean bool2, Boolean bool3) {
        this.interactiveGestureOpt = bool;
        this.playFunOpt = bool2;
        this.playFunOptV2 = bool3;
    }
}
