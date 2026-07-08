package com.ss.android.ugc.aweme.series.feed.tab.common.repo;

import X.C0CQT;
import X.C1578400rB0;
import X.C1578410rB1;
import X.InterfaceC1501060pAG;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501320pAg;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightResponse;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesFeedApi implements ISeriesFeedApi {
    public static final SeriesFeedApi LIZIZ = new SeriesFeedApi();
    public final /* synthetic */ ISeriesFeedApi LIZ = (ISeriesFeedApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(ISeriesFeedApi.class);

    @Override // com.ss.android.ugc.aweme.series.feed.tab.common.repo.ISeriesFeedApi
    @InterfaceC1501160pAQ("tiktok/v1/paid_content/mini_drama/feed")
    @InterfaceC1501320pAg(2)
    public ListenableFuture<ComposePbAndJson<C1578400rB0, FeedItemList>> fetchSeriesFeedList(@InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("need_load_skylight") boolean z, @InterfaceC1501070pAH("first_enter_tab_time") long j, @InterfaceC1501070pAH("drama_recommend_params") String str, @InterfaceC1501070pAH("force_insert_last_watch") int i2, @InterfaceC1501070pAH("force_insert_id") String str2, @InterfaceC1501070pAH("drama_request_type") String str3, @InterfaceC1501070pAH("cache_count") int i3, @InterfaceC1501070pAH("drama_current_items") String str4, @InterfaceC1501070pAH("last_feed_items") String str5, @InterfaceC1501070pAH("last_feed_ad_items") String str6, @InterfaceC1501070pAH("is_mixed_column_page") boolean z2, @InterfaceC1501070pAH("is_non_personalized") boolean z3, @InterfaceC1501070pAH("inner_feed_collection_id") String str7, @InterfaceC1501070pAH("is_from_inner_feed_recommend") boolean z4, @InterfaceC1501070pAH("is_validate") int i4, @InterfaceC1501070pAH("need_nav_list") boolean z5) {
        return this.LIZ.fetchSeriesFeedList(i, z, j, str, i2, str2, str3, i3, str4, str5, str6, z2, z3, str7, z4, i4, z5);
    }

    @Override // com.ss.android.ugc.aweme.series.feed.tab.common.repo.ISeriesFeedApi
    @InterfaceC1501160pAQ("{path}")
    @InterfaceC1501320pAg(2)
    public ListenableFuture<SkylightResponse> fetchSkylightList(@InterfaceC1501060pAG(encode = false, value = "path") String str, @InterfaceC1501070pAH("first_enter_tab_time") long j, @InterfaceC1501070pAH("is_mixed_column_page") boolean z, @InterfaceC1501070pAH("need_nav_list") boolean z2) {
        return this.LIZ.fetchSkylightList(str, j, z, z2);
    }

    @Override // com.ss.android.ugc.aweme.series.feed.tab.common.repo.ISeriesFeedApi
    @InterfaceC1501160pAQ("tiktok/v1/paid_content/mini_drama/feed_preload")
    @InterfaceC1501320pAg(2)
    public ListenableFuture<ComposePbAndJson<C1578410rB1, FeedItemList>> preloadSeriesFeedList(@InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("need_load_skylight") boolean z, @InterfaceC1501070pAH("first_enter_tab_time") long j, @InterfaceC1501070pAH("drama_recommend_params") String str, @InterfaceC1501070pAH("force_insert_last_watch") int i2, @InterfaceC1501070pAH("drama_request_type") String str2, @InterfaceC1501070pAH("is_mixed_column_page") boolean z2, @InterfaceC1501070pAH("need_nav_list") boolean z3) {
        return this.LIZ.preloadSeriesFeedList(i, z, j, str, i2, str2, z2, z3);
    }
}
