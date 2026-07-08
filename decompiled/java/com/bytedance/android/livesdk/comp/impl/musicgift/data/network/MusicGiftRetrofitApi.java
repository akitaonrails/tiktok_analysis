package com.bytedance.android.livesdk.comp.impl.musicgift.data.network;

import X.C470590Icr;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174608fY;
import X.InterfaceC2174708fZ;
import com.bytedance.android.livesdk.gift.model.MusicGiftFavouriteUpdateParams;
import com.bytedance.android.livesdk.gift.model.MusicGiftFavouriteUpdateResponse;
import com.bytedance.android.livesdk.gift.model.MusicGiftListPaginationResponse;
import com.bytedance.android.livesdk.gift.model.MusicGiftListResponse;
import com.bytedance.android.livesdk.gift.model.MusicGiftMoodsResponse;
import com.bytedance.retrofit2.mime.TypedInput;

/* JADX INFO: loaded from: classes18.dex */
public interface MusicGiftRetrofitApi {
    @InterfaceC2174608fY
    @InterfaceC1501160pAQ
    Object getLyrics(@InterfaceC2174708fZ String str, InterfaceC1364105Vn<? super TypedInput> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/gift/music/list/")
    Object getMusicGiftList(@InterfaceC1501070pAH("mood_id") long j, @InterfaceC1501070pAH("room_id") long j2, @InterfaceC1501070pAH("gift_id") long j3, InterfaceC1364105Vn<? super C470590Icr<MusicGiftListResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/gift/music/list_pagination/")
    Object getMusicGiftListPagination(@InterfaceC1501070pAH("mood_id") long j, @InterfaceC1501070pAH("tab_id") long j2, @InterfaceC1501070pAH("pagination_token") String str, InterfaceC1364105Vn<? super C470590Icr<MusicGiftListPaginationResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/gift/music/moods/")
    Object getMusicGiftMoods(InterfaceC1364105Vn<? super C470590Icr<MusicGiftMoodsResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/gift/music/favourite_update/")
    Object updateMusicGiftFavourite(@InterfaceC1485405rg MusicGiftFavouriteUpdateParams musicGiftFavouriteUpdateParams, InterfaceC1364105Vn<? super C470590Icr<MusicGiftFavouriteUpdateResponse.Data>> interfaceC1364105Vn);
}
