package com.ss.android.ugc.aweme.series.common.serviceimpl;

import X.C786410Ut5;
import X.EnumC1612760s4Q;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.series.common.interceptor.SeriesInterceptor;
import com.ss.android.ugc.aweme.series.deeplink.DramaTabRouterInterceptor;
import com.ss.android.ugc.aweme.series.innerfeed.interceptor.SeriesInnerFeedInterceptor;
import com.ss.android.ugc.aweme.series.innerfeed.interceptor.SeriesInnerFeedMonitorInterceptor;
import com.ss.android.ugc.aweme.series.seriesdetail.fragment.SeriesDetailFragment;
import com.ss.android.ugc.aweme.service.IPaidContentNavigatorService;

/* JADX INFO: loaded from: classes25.dex */
public class SeriesNavigatorImpl implements IPaidContentNavigatorService {
    @Override // com.ss.android.ugc.aweme.service.IPaidContentNavigatorService
    public final void LJFF() {
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentNavigatorService
    public final SeriesInnerFeedMonitorInterceptor LIZ() {
        return new SeriesInnerFeedMonitorInterceptor();
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentNavigatorService
    public final SeriesInterceptor LIZLLL() {
        return new SeriesInterceptor();
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentNavigatorService
    public final DramaTabRouterInterceptor LJ() {
        return new DramaTabRouterInterceptor();
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentNavigatorService
    public final SeriesInnerFeedInterceptor LJI() {
        return new SeriesInnerFeedInterceptor();
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentNavigatorService
    public final void LIZJ(Context context, String str, CollectionDetailModel collectionDetailModel) {
        String uid;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://paidcontent/innerfeed");
        smartRouteBuildRoute.withParam("collection_detail", collectionDetailModel);
        smartRouteBuildRoute.withParam("category", collectionDetailModel.category.name());
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.withParam("collection_id", collectionDetailModel.collectionId);
        User user = collectionDetailModel.collectionCreator;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        smartRouteBuildRoute.withParam("collection_user_id", uid);
        smartRouteBuildRoute.withParam("collection_name", collectionDetailModel.collectionName);
        smartRouteBuildRoute.withParam("num_videos", String.valueOf(collectionDetailModel.collectionVideoNum));
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentNavigatorService
    public final SeriesDetailFragment LIZIZ(String str, long j, String str2, long j2, EnumC1612760s4Q enumC1612760s4Q) {
        String str3 = SeriesDetailFragment._pnsPageId;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_from", str, bundle);
        bundle.putLong("collection_id", j);
        C786410Ut5.LJJJI("owner_id", str2, bundle);
        bundle.putLong("room_id", j2);
        bundle.putBoolean("hide_back_button", true);
        bundle.putInt("purchase_button_text", 2131847369);
        C786410Ut5.LJJIZ(bundle, "entry_source", enumC1612760s4Q);
        SeriesDetailFragment seriesDetailFragment = new SeriesDetailFragment();
        seriesDetailFragment.setArguments(bundle);
        return seriesDetailFragment;
    }
}
