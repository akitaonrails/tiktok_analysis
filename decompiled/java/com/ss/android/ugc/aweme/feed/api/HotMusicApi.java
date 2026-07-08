package com.ss.android.ugc.aweme.feed.api;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;

/* JADX INFO: loaded from: classes4.dex */
public interface HotMusicApi {
    @InterfaceC1501160pAQ("/tiktok/v1/hot/music/by/feed/")
    C11NZ<HotMusicListResp> getCurHotMusicList(@InterfaceC1501070pAH("count") int i);
}
