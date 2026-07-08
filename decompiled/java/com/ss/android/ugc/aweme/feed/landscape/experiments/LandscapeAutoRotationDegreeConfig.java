package com.ss.android.ugc.aweme.feed.landscape.experiments;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class LandscapeAutoRotationDegreeConfig {

    @C09CT("downMaxDegree")
    public final int downMaxDegree;

    @C09CT("upMaxDegree")
    public final int upMaxDegree;

    @C09CT("zOrientation")
    public final int zOrientation;

    public LandscapeAutoRotationDegreeConfig() {
        this(5, 1, 45);
    }

    public LandscapeAutoRotationDegreeConfig(int i, int i2, int i3) {
        this.upMaxDegree = i;
        this.downMaxDegree = i2;
        this.zOrientation = i3;
    }
}
