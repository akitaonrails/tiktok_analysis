package com.ss.android.ugc.aweme.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes12.dex */
public final class LiveEntranceAnimConfig {

    @C09CT("feed_live_avatar")
    public final boolean feedLiveAvatar;

    @C09CT("list_avatar_anim")
    public final boolean listAvatarAnim;

    @C09CT("preview_living_icon")
    public final boolean previewLivingIcon;

    public LiveEntranceAnimConfig() {
        this(false, false, false);
    }

    public LiveEntranceAnimConfig(boolean z, boolean z2, boolean z3) {
        this.listAvatarAnim = z;
        this.feedLiveAvatar = z2;
        this.previewLivingIcon = z3;
    }
}
