package com.ss.android.ugc.aweme.poi.revisit.api;

import X.C1499850p8J;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.image.LsResBystander;
import com.ss.android.ugc.aweme.net.LocationNetRequestInfoCommonInterceptor;
import com.ss.android.ugc.aweme.net.LsPreloadCheckerBystander;
import com.ss.android.ugc.aweme.poi.PoiRevisitBannerRelatedResponse;
import com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitApi;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRevisitApiService implements PoiRevisitApi {
    public static final PoiRevisitApiService LIZIZ = new PoiRevisitApiService();
    public final /* synthetic */ PoiRevisitApi LIZ;

    @Override // com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitApi
    @InterfaceC1501160pAQ("/tiktok/ls/collection/items/related_poi_list/v1")
    public Object getBannerInfo(@InterfaceC1501070pAH("item_archive_id") String str, InterfaceC1364105Vn<? super PoiRevisitBannerRelatedResponse> interfaceC1364105Vn) {
        return this.LIZ.getBannerInfo(str, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitApi
    @InterfaceC1501160pAQ("/tiktok/ls/collection/related_poi_card/v1")
    public Object getPoiCardList(@InterfaceC1501070pAH("poi_list") String str, @InterfaceC1501070pAH("enc_lat") String str2, @InterfaceC1501070pAH("enc_lng") String str3, InterfaceC1364105Vn<? super PoiRevisitApi.PoiRevisitCardListResponse> interfaceC1364105Vn) {
        return this.LIZ.getPoiCardList(str, str2, str3, interfaceC1364105Vn);
    }

    public PoiRevisitApiService() {
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(Api.LIZ);
        c1499850p8JCreateBuilder.LIZ(new LocationNetRequestInfoCommonInterceptor());
        c1499850p8JCreateBuilder.LIZIZ(LsResBystander.LIZ);
        c1499850p8JCreateBuilder.LIZIZ(LsPreloadCheckerBystander.LIZ);
        c1499850p8JCreateBuilder.LJIIIZ = 0;
        this.LIZ = (PoiRevisitApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(PoiRevisitApi.class);
    }
}
