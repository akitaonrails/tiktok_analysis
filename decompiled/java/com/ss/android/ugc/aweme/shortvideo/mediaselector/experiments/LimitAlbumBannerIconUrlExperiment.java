package com.ss.android.ugc.aweme.shortvideo.mediaselector.experiments;

import X.C0C64;

/* JADX INFO: loaded from: classes5.dex */
public final class LimitAlbumBannerIconUrlExperiment {
    public static final int $stable = 0;
    public static final String DEFAULT = "https://p16-amd-va.tiktokcdn.com/obj/creation-obj-us/album.png";
    public static final LimitAlbumBannerIconUrlExperiment INSTANCE = new LimitAlbumBannerIconUrlExperiment();

    public static final String getValue() {
        return C0C64.LJIILLIIL().LJJ(31744, "limit_album_banner_icon_url", DEFAULT, true);
    }
}
