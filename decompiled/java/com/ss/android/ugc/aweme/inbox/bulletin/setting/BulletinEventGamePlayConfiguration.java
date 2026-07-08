package com.ss.android.ugc.aweme.inbox.bulletin.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEventGamePlayConfiguration {
    public static final int $stable = 0;

    @C09CT("enable_base_interaction")
    public final Integer enableBaseInteraction;

    @C09CT("enable_creator_interaction")
    public final Integer enableCreatorInteraction;

    @C09CT("enable_activity_post_guidance_opt")
    public final Integer enablePostGuidanceOpt;

    public BulletinEventGamePlayConfiguration() {
        this(0, 0, 0);
    }

    public BulletinEventGamePlayConfiguration(Integer num, Integer num2, Integer num3) {
        this.enableBaseInteraction = num;
        this.enableCreatorInteraction = num2;
        this.enablePostGuidanceOpt = num3;
    }
}
