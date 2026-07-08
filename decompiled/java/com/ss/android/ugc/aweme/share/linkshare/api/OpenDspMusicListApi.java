package com.ss.android.ugc.aweme.share.linkshare.api;

import X.AbstractC19484711Kz;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501310pAf;
import com.ss.android.ugc.aweme.share.linkshare.model.DspMusicListResponse;

/* JADX INFO: loaded from: classes35.dex */
public interface OpenDspMusicListApi {
    @InterfaceC1501200pAU("/tiktok/music/dsp_to_tt/music/list/v1")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    AbstractC19484711Kz<DspMusicListResponse> getMusicList(@InterfaceC1501120pAM("share_url") String str, @InterfaceC1501120pAM("entity_uri") String str2, @InterfaceC1501120pAM("music_metadata") String str3);
}
