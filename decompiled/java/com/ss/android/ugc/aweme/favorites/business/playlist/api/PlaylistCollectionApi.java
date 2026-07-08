package com.ss.android.ugc.aweme.favorites.business.playlist.api;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.favorites.business.playlist.model.GetPlaylistCollectionListResp;

/* JADX INFO: loaded from: classes10.dex */
public interface PlaylistCollectionApi {
    @InterfaceC1501170pAR("/tiktok/v1/mix/click_record/")
    Object clickPlaylist(@InterfaceC1501070pAH("mix_id") String str, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/v1/mix/collect/")
    Object collectPlaylist(@InterfaceC1501070pAH("mix_id") String str, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/mix/collect_list/")
    Object getPlaylistCollectionList(@InterfaceC1501070pAH("cursor") int i, @InterfaceC1501070pAH("count") int i2, InterfaceC1364105Vn<? super GetPlaylistCollectionListResp> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/v1/mix/uncollect/")
    Object unCollectPlaylist(@InterfaceC1501070pAH("mix_id") String str, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
