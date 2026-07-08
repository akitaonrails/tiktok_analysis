package com.ss.android.ugc.profile.business.ci.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileViewersExpConfig {

    @C09CT("profile_viewers_enable")
    public Boolean profileViewersEnable;

    @C09CT("profile_viewers_entrance_with_affinity")
    public int profileViewersEntranceWithAffinity;

    @C09CT("profile_viewers_fixed_entrance")
    public Boolean profileViewersFixedEntrance;

    @C09CT("profile_viewers_push_enable")
    public Boolean profileViewersPushEnable;

    public ProfileViewersExpConfig() {
        this(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, 0);
    }

    public ProfileViewersExpConfig(Boolean bool, Boolean bool2, Boolean bool3, int i) {
        this.profileViewersEnable = bool;
        this.profileViewersFixedEntrance = bool2;
        this.profileViewersPushEnable = bool3;
        this.profileViewersEntranceWithAffinity = i;
    }
}
