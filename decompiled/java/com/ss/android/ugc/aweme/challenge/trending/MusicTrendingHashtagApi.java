package com.ss.android.ugc.aweme.challenge.trending;

import X.C0NRW;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;

/* JADX INFO: loaded from: classes10.dex */
public interface MusicTrendingHashtagApi {
    public static final C0NRW LIZ = C0NRW.LIZ;

    @InterfaceC1501160pAQ("/tiktok/music/hashtag/creation/v1")
    Object getMusicTrendingHashtags(@InterfaceC1501070pAH("meta_song_id") long j, InterfaceC1364105Vn<? super MusicTrendingHashtagResponse> interfaceC1364105Vn);
}
