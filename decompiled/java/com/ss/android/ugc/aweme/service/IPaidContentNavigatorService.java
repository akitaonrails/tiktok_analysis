package com.ss.android.ugc.aweme.service;

import X.EnumC1612760s4Q;
import android.content.Context;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.series.common.interceptor.SeriesInterceptor;
import com.ss.android.ugc.aweme.series.deeplink.DramaTabRouterInterceptor;
import com.ss.android.ugc.aweme.series.innerfeed.interceptor.SeriesInnerFeedInterceptor;
import com.ss.android.ugc.aweme.series.innerfeed.interceptor.SeriesInnerFeedMonitorInterceptor;
import com.ss.android.ugc.aweme.series.seriesdetail.fragment.SeriesDetailFragment;

/* JADX INFO: loaded from: classes25.dex */
public interface IPaidContentNavigatorService {
    SeriesInnerFeedMonitorInterceptor LIZ();

    SeriesDetailFragment LIZIZ(String str, long j, String str2, long j2, EnumC1612760s4Q enumC1612760s4Q);

    void LIZJ(Context context, String str, CollectionDetailModel collectionDetailModel);

    SeriesInterceptor LIZLLL();

    DramaTabRouterInterceptor LJ();

    void LJFF();

    SeriesInnerFeedInterceptor LJI();
}
