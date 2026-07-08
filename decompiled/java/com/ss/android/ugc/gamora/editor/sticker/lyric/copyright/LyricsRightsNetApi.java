package com.ss.android.ugc.gamora.editor.sticker.lyric.copyright;

import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.ss.android.ugc.aweme.tools.music.music.recent.apis.RecentMusicListRequest;

/* JADX INFO: loaded from: classes23.dex */
public interface LyricsRightsNetApi {
    @InterfaceC1501170pAR("/aweme/v1/music/detail/list/")
    C11NZ<MusicList> getMusicDetailByIdList(@InterfaceC1485405rg RecentMusicListRequest recentMusicListRequest);
}
