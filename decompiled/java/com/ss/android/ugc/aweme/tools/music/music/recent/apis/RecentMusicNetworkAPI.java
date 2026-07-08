package com.ss.android.ugc.aweme.tools.music.music.recent.apis;

import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.shortvideo.model.MusicList;

/* JADX INFO: loaded from: classes23.dex */
public interface RecentMusicNetworkAPI {
    @InterfaceC1501170pAR("/aweme/v1/music/detail/list/")
    C11NZ<MusicList> getMusicDetailByIdList(@InterfaceC1485405rg RecentMusicListRequest recentMusicListRequest);
}
