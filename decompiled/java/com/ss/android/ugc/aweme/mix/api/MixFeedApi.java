package com.ss.android.ugc.aweme.mix.api;

import X.AbstractC19484711Kz;
import X.C080U;
import X.C1169360gXG;
import X.C11NZ;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC2174808fa;
import X.InterfaceC2177008fw;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.mix.api.response.CheckPlayResponse;
import com.ss.android.ugc.aweme.mix.api.response.ManageResponse;
import com.ss.android.ugc.aweme.mix.api.response.MixDetailResponse;
import com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse;
import com.ss.android.ugc.aweme.mix.model.MixCandidateVideosResponse;
import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface MixFeedApi {
    public static final C1169360gXG LIZ = C1169360gXG.LIZ;

    @InterfaceC1501160pAQ("/tiktok/v1/mix/check/")
    C11NZ<CheckPlayResponse> checkPlaylistName(@InterfaceC1501070pAH("check_type") int i, @InterfaceC1501070pAH("name") String str);

    @InterfaceC1501160pAQ("/tiktok/v1/mix/candidate/")
    AbstractC19484711Kz<MixCandidateVideosResponse> getMixCandidateFeeds(@InterfaceC1501070pAH("cursor") long j);

    @InterfaceC1501160pAQ("/tiktok/v1/mix/detail/")
    AbstractC19484711Kz<MixDetailResponse> getMixDetail(@InterfaceC1501070pAH("mix_id") String str, @InterfaceC1501070pAH("uid") String str2, @InterfaceC1501070pAH("sec_uid") String str3, @InterfaceC1501070pAH("from_share") boolean z, @InterfaceC1501070pAH("need_cover") boolean z2, @InterfaceC1501070pAH("need_total_play_count") boolean z3, @InterfaceC2177008fw Object obj, @InterfaceC2174808fa List<C080U> list);

    @InterfaceC1501160pAQ("/tiktok/v1/mix/videos/")
    Object getMixVideoList(@InterfaceC1501070pAH("mix_id") String str, @InterfaceC1501070pAH("item_id") String str2, @InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("pull_type") int i, @InterfaceC1501070pAH("uid") String str3, @InterfaceC1501070pAH("sec_uid") String str4, @InterfaceC1501070pAH("from_share") boolean z, @InterfaceC1501070pAH("count") Integer num, @InterfaceC1501070pAH("default_page_type") int i2, InterfaceC1364105Vn<? super MixVideosResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/mix/videos/")
    AbstractC19484711Kz<MixVideosResponse> getMixVideos(@InterfaceC1501070pAH("mix_id") String str, @InterfaceC1501070pAH("item_id") String str2, @InterfaceC1501070pAH("cursor") int i, @InterfaceC1501070pAH("pull_type") int i2);

    @InterfaceC1501160pAQ("/tiktok/v1/mix/videos/")
    C11NZ<MixVideosResponse> getMixVideos(@InterfaceC1501070pAH("mix_id") String str, @InterfaceC1501070pAH("item_id") String str2, @InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("pull_type") int i, @InterfaceC1501070pAH("uid") String str3, @InterfaceC1501070pAH("sec_uid") String str4);

    @InterfaceC1501160pAQ("/tiktok/v1/mix/videos/")
    C11NZ<MixVideosResponse> getMixVideos2(@InterfaceC1501070pAH("mix_id") String str, @InterfaceC1501070pAH("item_id") String str2, @InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("pull_type") int i, @InterfaceC1501070pAH("uid") String str3, @InterfaceC1501070pAH("sec_uid") String str4, @InterfaceC1501070pAH("from_share") boolean z, @InterfaceC1501070pAH("count") Integer num, @InterfaceC1501070pAH("default_page_type") int i2, @InterfaceC2177008fw Object obj, @InterfaceC2174808fa List<C080U> list);

    @InterfaceC1501160pAQ("/tiktok/v1/mix/list/")
    AbstractC19484711Kz<MixListResponse> getUserMixList(@InterfaceC1501070pAH("uid") String str, @InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("sec_uid") String str2, @InterfaceC1501070pAH("need_cover") boolean z, @InterfaceC1501070pAH("mix_id") String str3, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) Integer num);

    @InterfaceC1501160pAQ("/tiktok/v1/mix/list/")
    Object getUserPlaylist(@InterfaceC1501070pAH("uid") String str, @InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("sec_uid") String str2, @InterfaceC1501070pAH("need_cover") boolean z, @InterfaceC1501070pAH("mix_id") String str3, InterfaceC1364105Vn<? super MixListResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/mix/manage/")
    AbstractC19484711Kz<ManageResponse> manageMixFeed(@InterfaceC1501050pAF("operation") int i, @InterfaceC1501050pAF("mix_id") String str, @InterfaceC1501050pAF("item_ids") String str2, @InterfaceC1501050pAF("add_ids") String str3, @InterfaceC1501050pAF("remove_ids") String str4, @InterfaceC1501050pAF("name") String str5, @InterfaceC1501050pAF("reverse_item_ids") String str6);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/mix/reorder/")
    AbstractC19484711Kz<BaseResponse> reorderMixList(@InterfaceC1501050pAF("mix_ids") String str);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/search/loadmore/")
    AbstractC19484711Kz<MixListResponse> searchLodeMore(@InterfaceC1501050pAF(FollowStatusChangeMethod.PARAM_UID) String str, @InterfaceC1501050pAF("cursor") long j, @InterfaceC1501050pAF("count") int i, @InterfaceC1501050pAF("type") int i2, @InterfaceC1501050pAF("keyword") String str2);
}
