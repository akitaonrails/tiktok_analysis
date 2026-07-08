package com.ss.android.ugc.aweme.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveEntranceAnimCurveConfig {

    @C09CT("modify_multi_avatar_normal_anim")
    public final boolean modifyMultiAvatarNormalAnim;

    @C09CT("modify_single_avatar_normal_anim")
    public final boolean modifySingleAvatarNormalAnim;

    public LiveEntranceAnimCurveConfig() {
        this(false, false);
    }

    public LiveEntranceAnimCurveConfig(boolean z, boolean z2) {
        this.modifySingleAvatarNormalAnim = z;
        this.modifyMultiAvatarNormalAnim = z2;
    }
}
