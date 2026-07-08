package com.ss.android.ugc.aweme.repostfeed.repo;

import X.C080U;
import X.C0CQT;
import X.C5418029g;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC2174808fa;
import X.InterfaceC2177008fw;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.repostfeed.model.RepostFeedEntranceResponse;
import com.ss.android.ugc.aweme.repostfeed.model.RepostFeedResponse;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class RepostFeedApi implements IRepostFeedApi {
    public static final RepostFeedApi LIZJ = new RepostFeedApi();
    public final /* synthetic */ IRepostFeedApi LIZIZ = (IRepostFeedApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(IRepostFeedApi.class);

    @Override // com.ss.android.ugc.aweme.repostfeed.repo.IRepostFeedApi
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v2/share/feed")
    public ListenableFuture<ComposePbAndJson<C5418029g, RepostFeedResponse>> getRepostFeedList(@InterfaceC1501050pAF("is_non_personalized") int i, @InterfaceC1501050pAF("source") int i2, @InterfaceC1501050pAF("max_count") int i3, @InterfaceC1501050pAF("pull_type") int i4, @InterfaceC1501050pAF("insert_ids") String str, @InterfaceC1501050pAF("insert_item_metas") String str2, @InterfaceC1501050pAF("client_read_gids") String str3, @InterfaceC1501050pAF("client_read_gids_all") String str4, @InterfaceC1501050pAF("client_unread_gids") String str5, @InterfaceC1501050pAF("dislike_viewed_gids") String str6, @InterfaceC1501050pAF("page_token") String str7, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj) {
        return this.LIZIZ.getRepostFeedList(i, i2, i3, i4, str, str2, str3, str4, str5, str6, str7, list, obj);
    }

    @Override // com.ss.android.ugc.aweme.repostfeed.repo.IRepostFeedApi
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v2/repost/feed/entrance")
    public Object requestRepostFeedEntranceInfo(@InterfaceC1501050pAF("need_init_tab_status") boolean z, @InterfaceC1501050pAF("client_read_gids_all") String str, @InterfaceC1501050pAF("is_non_personalized") boolean z2, @InterfaceC1501050pAF("entrance_source") int i, InterfaceC1364105Vn<? super RepostFeedEntranceResponse> interfaceC1364105Vn) {
        return this.LIZIZ.requestRepostFeedEntranceInfo(z, str, z2, i, interfaceC1364105Vn);
    }
}
