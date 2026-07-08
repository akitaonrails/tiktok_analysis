package com.ss.android.ugc.aweme.music.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class MdpShowSquareABSwitchConfig {

    @C09CT("studio_mdp_square_enable")
    public final boolean enable;

    @C09CT("studio_mdp_square_header_spacing_type")
    public final int headerSpacingType;

    @C09CT("studio_mdp_square_request_video_threshold")
    public final int requestThreshold;

    @C09CT("studio_mdp_square_video_is_muted")
    public final boolean videoMuted;

    public MdpShowSquareABSwitchConfig() {
        this(false, 0, true, 10);
    }

    public MdpShowSquareABSwitchConfig(boolean z, int i, boolean z2, int i2) {
        this.enable = z;
        this.headerSpacingType = i;
        this.videoMuted = z2;
        this.requestThreshold = i2;
    }
}
