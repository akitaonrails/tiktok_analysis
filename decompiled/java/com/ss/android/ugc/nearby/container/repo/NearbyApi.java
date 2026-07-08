package com.ss.android.ugc.nearby.container.repo;

import X.C040I;
import X.C11NZ;
import X.C1499850p8J;
import X.C1515820pY4;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501320pAg;
import X.InterfaceC2174608fY;
import X.InterfaceC2177008fw;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.image.LsResBystander;
import com.ss.android.ugc.aweme.net.LocationNetRequestInfoCommonInterceptor;
import com.ss.android.ugc.aweme.net.LsPreloadCheckerBystander;
import com.ss.android.ugc.nearby.container.model.NearbyRevampResponse;
import com.ss.android.ugc.nearby.container.repo.INearbyApi;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyApi implements INearbyApi {
    public static final NearbyApi LIZIZ = new NearbyApi();
    public final /* synthetic */ INearbyApi LIZ;

    @Override // com.ss.android.ugc.nearby.container.repo.INearbyApi
    @InterfaceC1501240pAY("/tiktok/feed/nearby/revamp")
    @InterfaceC1501320pAg(2)
    public Object fetchNearbyData(@C040I INearbyApi.NearbyRequestBody nearbyRequestBody, @InterfaceC2177008fw Object obj, InterfaceC1364105Vn<? super NearbyRevampResponse> interfaceC1364105Vn) {
        return this.LIZ.fetchNearbyData(nearbyRequestBody, obj, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.nearby.container.repo.INearbyApi
    @InterfaceC2174608fY
    @InterfaceC1501240pAY("/tiktok/feed/nearby/chunk")
    @InterfaceC1501320pAg(2)
    public C11NZ<C1515820pY4<NearbyRevampResponse>> fetchNearbyDataChunk(@C040I INearbyApi.NearbyRequestBodyForChunk nearbyRequestBodyForChunk, @InterfaceC2177008fw Object obj) {
        return this.LIZ.fetchNearbyDataChunk(nearbyRequestBodyForChunk, obj);
    }

    @Override // com.ss.android.ugc.nearby.container.repo.INearbyApi
    @InterfaceC1501240pAY("/tiktok/feed/nearby/revamp")
    @InterfaceC1501320pAg(2)
    public Object fetchNearbyInnerFeedData(@C040I INearbyApi.NearbyRequestBodyForInnerFeed nearbyRequestBodyForInnerFeed, @InterfaceC2177008fw Object obj, InterfaceC1364105Vn<? super NearbyRevampResponse> interfaceC1364105Vn) {
        return this.LIZ.fetchNearbyInnerFeedData(nearbyRequestBodyForInnerFeed, obj, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.nearby.container.repo.INearbyApi
    @InterfaceC1501240pAY("/tiktok/feed/nearby/revamp/preload")
    @InterfaceC1501320pAg(2)
    public Object fetchPreloadNearbyData(@C040I INearbyApi.NearbyRequestBodyForInitTaskPreload nearbyRequestBodyForInitTaskPreload, InterfaceC1364105Vn<? super NearbyRevampResponse> interfaceC1364105Vn) {
        return this.LIZ.fetchPreloadNearbyData(nearbyRequestBodyForInitTaskPreload, interfaceC1364105Vn);
    }

    public NearbyApi() {
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(Api.LIZ);
        c1499850p8JCreateBuilder.LIZ(new LocationNetRequestInfoCommonInterceptor());
        c1499850p8JCreateBuilder.LIZIZ(LsResBystander.LIZ);
        c1499850p8JCreateBuilder.LIZIZ(LsPreloadCheckerBystander.LIZ);
        c1499850p8JCreateBuilder.LJIIIZ = 0;
        this.LIZ = (INearbyApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(INearbyApi.class);
    }
}
