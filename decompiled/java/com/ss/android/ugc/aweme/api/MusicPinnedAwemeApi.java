package com.ss.android.ugc.aweme.api;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.music.model.MusicBaseResponse;

/* JADX INFO: loaded from: classes10.dex */
public interface MusicPinnedAwemeApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/music/pinned_aweme/delete/v1/")
    Object deletePinnedAweme(@InterfaceC1501050pAF("music_id") String str, @InterfaceC1501050pAF("aweme_id") String str2, InterfaceC1364105Vn<? super MusicBaseResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/music/aweme/list/")
    Object getArtistMusicAwemeList(@InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("filter_mid") String str, InterfaceC1364105Vn<? super ArtistMusicAwemeResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/music/pinned_aweme/update/v1/")
    Object updatePinnedAweme(@InterfaceC1501050pAF("music_id") String str, @InterfaceC1501050pAF("aweme_id") String str2, InterfaceC1364105Vn<? super MusicBaseResponse> interfaceC1364105Vn);
}
