package com.ss.android.ugc.aweme.music.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class MdpMusicTypeABSwitchConfig {

    @C09CT("pgc")
    public final int pgcCount;

    @C09CT("pugc")
    public final int pugcCount;

    @C09CT("ugc")
    public final int ugcCount;

    public MdpMusicTypeABSwitchConfig() {
        this(0, 0, 0);
    }

    public MdpMusicTypeABSwitchConfig(int i, int i2, int i3) {
        this.ugcCount = i;
        this.pgcCount = i2;
        this.pugcCount = i3;
    }
}
