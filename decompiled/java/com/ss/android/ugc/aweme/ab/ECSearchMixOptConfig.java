package com.ss.android.ugc.aweme.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class ECSearchMixOptConfig {

    @C09CT("auto_play_check_interval")
    public final Integer autoPlayCheckInterval;

    @C09CT("auto_play_time")
    public final Integer autoPlayTime;

    @C09CT("enable_direct_attach_lynx_cart")
    public final Integer directAttachLynxCard;

    @C09CT("enable_anti_exposure")
    public final Boolean enableAntiExposure;

    @C09CT("enable_preempt_play")
    public final Boolean enablePreemptPlay;

    @C09CT("enable_re_search_gc")
    public final Integer enableReSearchGC;

    @C09CT("enable_request_after_created")
    public final Integer requestAfterCreated;

    public ECSearchMixOptConfig() {
        this(0, 0, 0, 0, 0, Boolean.FALSE, Boolean.FALSE);
    }

    public ECSearchMixOptConfig(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, Boolean bool2) {
        this.enableReSearchGC = num;
        this.directAttachLynxCard = num2;
        this.requestAfterCreated = num3;
        this.autoPlayTime = num4;
        this.autoPlayCheckInterval = num5;
        this.enableAntiExposure = bool;
        this.enablePreemptPlay = bool2;
    }
}
