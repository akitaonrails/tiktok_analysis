package com.ss.android.ugc.aweme.experiment;

import X.C0C64;

/* JADX INFO: loaded from: classes13.dex */
public final class LivePodcastApiPreRequestExperiment {
    public static final int DEFAULT = 0;
    public static final LivePodcastApiPreRequestExperiment INSTANCE = new LivePodcastApiPreRequestExperiment();

    public static final boolean isEnable() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "live_podcast_api_pre_request_exp", true) > 0;
    }

    public static final boolean isV2() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "live_podcast_api_pre_request_exp", true) == 2;
    }
}
