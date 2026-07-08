package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class PrivacySetting implements Serializable {

    @C09CT("following_visibility")
    public final int followingVisibility;

    public PrivacySetting() {
        this(0);
    }

    public final int getFollowingVisibility() {
        return this.followingVisibility;
    }

    public PrivacySetting(int i) {
        this.followingVisibility = i;
    }
}
