package com.ss.android.ugc.aweme.music.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class MdpFoldSquareABSwitchConfig {

    @C09CT("studio_mdp_fold_enable")
    public final boolean enable;

    @C09CT("studio_mdp_fold_to")
    public final MdpMusicTypeABSwitchConfig foldThreshold;

    @C09CT("studio_mdp_fold_from")
    public final MdpMusicTypeABSwitchConfig showListCnt;

    public MdpFoldSquareABSwitchConfig() {
        this(false, new MdpMusicTypeABSwitchConfig(4, 4, 4), new MdpMusicTypeABSwitchConfig(100, 10, 10));
    }

    public MdpFoldSquareABSwitchConfig(boolean z, MdpMusicTypeABSwitchConfig mdpMusicTypeABSwitchConfig, MdpMusicTypeABSwitchConfig mdpMusicTypeABSwitchConfig2) {
        this.enable = z;
        this.showListCnt = mdpMusicTypeABSwitchConfig;
        this.foldThreshold = mdpMusicTypeABSwitchConfig2;
    }
}
