package com.ss.android.ugc.aweme.prop.api;

import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501290pAd;
import X.InterfaceC1501320pAg;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.prop.model.StickerPropAwemeList;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;

/* JADX INFO: loaded from: classes30.dex */
public interface StickerPropApi {
    @InterfaceC1501200pAU("/tiktok/notice/sticker/items/v1")
    ListenableFuture<StickerPropAwemeList> LIZ(@InterfaceC1501120pAM("sticker_id") String str, @InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") int i);

    @InterfaceC1501200pAU("/aweme/v1/sticker/detail/")
    ListenableFuture<NewFaceStickerListBean> LIZIZ(@InterfaceC1501120pAM("sticker_ids") String str, @InterfaceC1501120pAM("source") int i, @InterfaceC1501120pAM("app_version") String str2);

    @InterfaceC1501200pAU("/aweme/v1/sticker/discover/")
    ListenableFuture<StickerPropAwemeList> LIZJ(@InterfaceC1501120pAM("sticker_id") String str, @InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") int i, @InterfaceC1501120pAM("feed_session_id") String str2, @InterfaceC1501120pAM("media_type") int i2, @InterfaceC1501120pAM("allow_list") String str3);

    @InterfaceC1501200pAU("/aweme/v1/sticker/aweme/")
    ListenableFuture<StickerPropAwemeList> LIZLLL(@InterfaceC1501120pAM("sticker_id") String str, @InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") int i, @InterfaceC1501120pAM("source") int i2, @InterfaceC1501120pAM("media_type") int i3, @InterfaceC1501120pAM("video_cover_shrink") String str2, @InterfaceC1501120pAM("experiment_params") String str3);

    @InterfaceC1501200pAU("/aweme/v1/sticker/aweme/")
    ListenableFuture<StickerPropAwemeList> LJ(@InterfaceC1501120pAM("sticker_id") String str, @InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") int i, @InterfaceC1501120pAM("media_type") int i2, @InterfaceC1501120pAM("video_cover_shrink") String str2, @InterfaceC1501120pAM("experiment_params") String str3);

    @InterfaceC1501200pAU("/aweme/v1/sticker/discover/")
    ListenableFuture<StickerPropAwemeList> LJFF(@InterfaceC1501120pAM("sticker_id") String str, @InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") int i, @InterfaceC1501120pAM("feed_session_id") String str2, @InterfaceC1501120pAM("media_type") int i2);

    @InterfaceC1501200pAU("/tiktok/v1/sticker/featured_video/candidates/")
    ListenableFuture<StickerPropAwemeList> LJI(@InterfaceC1501120pAM("effect_id") String str);

    @InterfaceC1501200pAU("/aweme/v1/sticker/detail/")
    ListenableFuture<NewFaceStickerListBean> getStickerDetail(@InterfaceC1501120pAM("sticker_ids") String str, @InterfaceC1501120pAM("app_version") String str2);

    @InterfaceC1501290pAd(4)
    @InterfaceC1501200pAU("/aweme/v1/sticker/detail/")
    @InterfaceC1501320pAg(3)
    ListenableFuture<NewFaceStickerListBean> getStickerDetailHighPriority(@InterfaceC1501120pAM("sticker_ids") String str, @InterfaceC1501120pAM("app_version") String str2);

    @InterfaceC1501290pAd(4)
    @InterfaceC1501200pAU("/aweme/v1/sticker/aweme/")
    @InterfaceC1501320pAg(3)
    ListenableFuture<StickerPropAwemeList> queryStickerAwemeListHighPriority(@InterfaceC1501120pAM("sticker_id") String str, @InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") int i, @InterfaceC1501120pAM("media_type") int i2, @InterfaceC1501120pAM("video_cover_shrink") String str2, @InterfaceC1501120pAM("experiment_params") String str3);
}
