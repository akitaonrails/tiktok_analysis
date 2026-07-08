package com.ss.android.ugc.aweme.inbox.bulletin.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCreateProcessOptConfiguration {
    public static final int $stable = 0;

    @C09CT("enable_create_process_opt")
    public final Integer enableCreateProcessOpt;

    @C09CT("enable_inbox_banner_opt")
    public final Integer enableInboxBannerOpt;

    @C09CT("enable_post_guidance_opt")
    public final Integer enablePostGuidanceOpt;

    @C09CT("enable_profile_banner_opt")
    public final Integer enableProfileBannerOpt;

    @C09CT("profile_banner_frequency_interval")
    public final Long profileBannerFrequencyInterval;

    @C09CT("profile_banner_max_show_count")
    public final Integer profileBannerMaxShowCount;

    public BulletinCreateProcessOptConfiguration() {
        this(1, 1, 1, 1, 172800L, 2);
    }

    public BulletinCreateProcessOptConfiguration(Integer num, Integer num2, Integer num3, Integer num4, Long l, Integer num5) {
        this.enableInboxBannerOpt = num;
        this.enableProfileBannerOpt = num2;
        this.enableCreateProcessOpt = num3;
        this.enablePostGuidanceOpt = num4;
        this.profileBannerFrequencyInterval = l;
        this.profileBannerMaxShowCount = num5;
    }
}
