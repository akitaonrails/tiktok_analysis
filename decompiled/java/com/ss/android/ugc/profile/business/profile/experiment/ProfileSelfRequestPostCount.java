package com.ss.android.ugc.profile.business.profile.experiment;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileSelfRequestPostCount implements Serializable {
    public static final int $stable = 0;

    @C09CT("private_post_request_count")
    public final int privatePostRequestCount;

    @C09CT("public_post_request_count")
    public final int publicPostRequestCount;

    public ProfileSelfRequestPostCount() {
        this(20, 20);
    }

    public ProfileSelfRequestPostCount(int i, int i2) {
        this.publicPostRequestCount = i;
        this.privatePostRequestCount = i2;
    }
}
