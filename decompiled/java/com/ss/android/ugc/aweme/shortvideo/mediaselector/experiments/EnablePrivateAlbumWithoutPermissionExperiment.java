package com.ss.android.ugc.aweme.shortvideo.mediaselector.experiments;

import X.C0C64;

/* JADX INFO: loaded from: classes9.dex */
public final class EnablePrivateAlbumWithoutPermissionExperiment {
    public static final int $stable = 0;
    public static final boolean DISABLED = false;
    public static final boolean ENABLED = true;
    public static final EnablePrivateAlbumWithoutPermissionExperiment INSTANCE = new EnablePrivateAlbumWithoutPermissionExperiment();

    public static final boolean isEnabled() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "private_album_without_permission", true, false);
    }
}
