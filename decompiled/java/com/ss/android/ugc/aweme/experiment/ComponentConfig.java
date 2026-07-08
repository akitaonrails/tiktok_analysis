package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class ComponentConfig {

    @C09CT("enable_fyp_button")
    public final boolean enableFYPButton;

    @C09CT("enable_fyp_label")
    public final boolean enableFYPLabel;

    @C09CT("enable_profile_button")
    public final boolean enableProfileButton;

    @C09CT("fyp_config")
    public final FYPComponentConfig fypConfig;

    @C09CT("offline_after_show_count")
    public final int offlineAfterShowCount;

    @C09CT("offline_after_show_duration")
    public final int offlineDuration;

    @C09CT("profile_config")
    public final ProfileComponentConfig profileConfig;

    @C09CT("show_frequent_control_range")
    public final int showFrequentControlRange;

    public ComponentConfig() {
        this(false, false, false, new ProfileComponentConfig(20, 30), new FYPComponentConfig(1, 0), 259200, 3, 1209600);
    }

    public ComponentConfig(boolean z, boolean z2, boolean z3, ProfileComponentConfig profileComponentConfig, FYPComponentConfig fYPComponentConfig, int i, int i2, int i3) {
        this.enableProfileButton = z;
        this.enableFYPButton = z2;
        this.enableFYPLabel = z3;
        this.profileConfig = profileComponentConfig;
        this.fypConfig = fYPComponentConfig;
        this.showFrequentControlRange = i;
        this.offlineAfterShowCount = i2;
        this.offlineDuration = i3;
    }
}
