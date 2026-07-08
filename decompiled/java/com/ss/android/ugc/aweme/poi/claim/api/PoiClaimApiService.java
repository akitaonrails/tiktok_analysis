package com.ss.android.ugc.aweme.poi.claim.api;

import X.C040I;
import X.C1499850p8J;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501370pAl;
import X.InterfaceC2177008fw;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.google.gson.n;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.image.LsResBystander;
import com.ss.android.ugc.aweme.net.LocationNetRequestInfoCommonInterceptor;
import com.ss.android.ugc.aweme.net.LsPreloadCheckerBystander;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.claim.api.IPoiClaimApi;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiClaimApiService implements IPoiClaimApi {
    public static final PoiClaimApiService LIZIZ = new PoiClaimApiService();
    public final /* synthetic */ IPoiClaimApi LIZ;

    @Override // com.ss.android.ugc.aweme.poi.claim.api.IPoiClaimApi
    @InterfaceC1501240pAY("/tiktok/ls/merchant/claim/poi/check/")
    public final Object LIZ(@C040I IPoiClaimApi.PoiClaimCheckRequestBody poiClaimCheckRequestBody, InterfaceC1364105Vn<? super IPoiClaimApi.PoiClaimCheckResponse> interfaceC1364105Vn) {
        return this.LIZ.LIZ(poiClaimCheckRequestBody, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.poi.claim.api.IPoiClaimApi
    @InterfaceC1501240pAY("/tiktok/poi/api/place/search")
    public final Object LIZIZ(@InterfaceC1501370pAl("Content-Type") String str, @InterfaceC1501370pAl("sgn") String str2, @InterfaceC1501370pAl("biz") String str3, @C040I n nVar, InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapperV2> interfaceC1364105Vn) {
        return this.LIZ.LIZIZ(str, str2, str3, nVar, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.poi.claim.api.IPoiClaimApi
    @InterfaceC1501240pAY("/tiktok/poi/api/place/recommend")
    public Object recommendPoi(@InterfaceC1501370pAl("Content-Type") String str, @InterfaceC1501370pAl("sgn") String str2, @InterfaceC1501370pAl("biz") String str3, @C040I n nVar, @InterfaceC2177008fw Object obj, InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapperV2> interfaceC1364105Vn) {
        return this.LIZ.recommendPoi(str, str2, str3, nVar, obj, interfaceC1364105Vn);
    }

    public PoiClaimApiService() {
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(Api.LIZ);
        c1499850p8JCreateBuilder.LIZ(new LocationNetRequestInfoCommonInterceptor());
        c1499850p8JCreateBuilder.LIZIZ(LsResBystander.LIZ);
        c1499850p8JCreateBuilder.LIZIZ(LsPreloadCheckerBystander.LIZ);
        c1499850p8JCreateBuilder.LJIIIZ = 0;
        this.LIZ = (IPoiClaimApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(IPoiClaimApi.class);
    }
}
