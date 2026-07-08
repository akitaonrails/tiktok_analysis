package com.ss.android.ugc.aweme.socialavatar.saas.mixstudio;

import X.C09CT;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioUseFriendsIDExpConfig {

    @C09CT("enabled")
    public final int enabled;

    @C09CT("generate_without_sa_limit")
    public final int generateMixStickerWithoutSALimit;

    public MixStudioUseFriendsIDExpConfig() {
        this(0, 3);
    }

    public MixStudioUseFriendsIDExpConfig(int i, int i2) {
        this.enabled = i;
        this.generateMixStickerWithoutSALimit = i2;
    }
}
