package com.ss.android.ugc.aweme.poi.content.poicampaign;

import X.C040I;
import X.C1499850p8J;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501320pAg;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.image.LsResBystander;
import com.ss.android.ugc.aweme.net.LocationNetRequestInfoCommonInterceptor;
import com.ss.android.ugc.aweme.net.LsPreloadCheckerBystander;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCampaignApi implements IPoiCampaignApi {
    public static final PoiCampaignApi LIZIZ = new PoiCampaignApi();
    public final /* synthetic */ IPoiCampaignApi LIZ;

    @Override // com.ss.android.ugc.aweme.poi.content.poicampaign.IPoiCampaignApi
    @InterfaceC1501170pAR("/tiktok/poi/api/campaign/yearly_user_poi_track/query_video_un_poi")
    @InterfaceC1501320pAg(2)
    public Object fetchAddLocationData(@C040I MyMomentsVideoListRequest myMomentsVideoListRequest, InterfaceC1364105Vn<? super MyMomentsVideoListResponse> interfaceC1364105Vn) {
        return this.LIZ.fetchAddLocationData(myMomentsVideoListRequest, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.poi.content.poicampaign.IPoiCampaignApi
    @InterfaceC1501170pAR("/tiktok/poi/api/campaign/yearly_user_poi_track/query_highlight_video")
    @InterfaceC1501320pAg(2)
    public Object fetchMyMomentsHighlightsVideo(@C040I MyMomenetsHighlightVideoRequest myMomenetsHighlightVideoRequest, InterfaceC1364105Vn<? super MyMomenetsHighlightVideoResponse> interfaceC1364105Vn) {
        return this.LIZ.fetchMyMomentsHighlightsVideo(myMomenetsHighlightVideoRequest, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.poi.content.poicampaign.IPoiCampaignApi
    @InterfaceC1501170pAR("/tiktok/poi/api/campaign/yearly_user_poi_track/query_poi_campaign")
    @InterfaceC1501320pAg(2)
    public Object fetchMyMomentsMainData(@C040I MyMomentsMainRequest myMomentsMainRequest, InterfaceC1364105Vn<? super MyMomentsMainResponse> interfaceC1364105Vn) {
        return this.LIZ.fetchMyMomentsMainData(myMomentsMainRequest, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.poi.content.poicampaign.IPoiCampaignApi
    @InterfaceC1501170pAR("/tiktok/poi/api/campaign/yearly_user_poi_track/query_poi_trace")
    @InterfaceC1501320pAg(2)
    public Object fetchPoiListOnly(@C040I PoiListRequest poiListRequest, InterfaceC1364105Vn<? super PoiListResponse> interfaceC1364105Vn) {
        return this.LIZ.fetchPoiListOnly(poiListRequest, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.poi.content.poicampaign.IPoiCampaignApi
    @InterfaceC1501170pAR("/tiktok/poi/api/campaign/yearly_user_poi_track/query_video_on_poi")
    @InterfaceC1501320pAg(2)
    public Object fetchVideoListWithPoi(@C040I FetchVideoRequest fetchVideoRequest, InterfaceC1364105Vn<? super FetchVideoResponse> interfaceC1364105Vn) {
        return this.LIZ.fetchVideoListWithPoi(fetchVideoRequest, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.poi.content.poicampaign.IPoiCampaignApi
    @InterfaceC1501170pAR("/tiktok/poi/api/campaign/yearly_user_poi_track/attach_poi")
    @InterfaceC1501320pAg(2)
    public Object postInvitationData(@C040I MyMomentsInvitingRequest myMomentsInvitingRequest, InterfaceC1364105Vn<? super MyMomentsInvitingResponse> interfaceC1364105Vn) {
        return this.LIZ.postInvitationData(myMomentsInvitingRequest, interfaceC1364105Vn);
    }

    public PoiCampaignApi() {
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(Api.LIZ);
        c1499850p8JCreateBuilder.LIZ(new LocationNetRequestInfoCommonInterceptor());
        c1499850p8JCreateBuilder.LIZIZ(LsResBystander.LIZ);
        c1499850p8JCreateBuilder.LIZIZ(LsPreloadCheckerBystander.LIZ);
        c1499850p8JCreateBuilder.LJIIIZ = 0;
        this.LIZ = (IPoiCampaignApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(IPoiCampaignApi.class);
    }
}
