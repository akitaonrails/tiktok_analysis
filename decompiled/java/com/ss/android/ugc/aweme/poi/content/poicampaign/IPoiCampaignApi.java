package com.ss.android.ugc.aweme.poi.content.poicampaign;

import X.C040I;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501320pAg;

/* JADX INFO: loaded from: classes19.dex */
public interface IPoiCampaignApi {
    @InterfaceC1501170pAR("/tiktok/poi/api/campaign/yearly_user_poi_track/query_video_un_poi")
    @InterfaceC1501320pAg(2)
    Object fetchAddLocationData(@C040I MyMomentsVideoListRequest myMomentsVideoListRequest, InterfaceC1364105Vn<? super MyMomentsVideoListResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/poi/api/campaign/yearly_user_poi_track/query_highlight_video")
    @InterfaceC1501320pAg(2)
    Object fetchMyMomentsHighlightsVideo(@C040I MyMomenetsHighlightVideoRequest myMomenetsHighlightVideoRequest, InterfaceC1364105Vn<? super MyMomenetsHighlightVideoResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/poi/api/campaign/yearly_user_poi_track/query_poi_campaign")
    @InterfaceC1501320pAg(2)
    Object fetchMyMomentsMainData(@C040I MyMomentsMainRequest myMomentsMainRequest, InterfaceC1364105Vn<? super MyMomentsMainResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/poi/api/campaign/yearly_user_poi_track/query_poi_trace")
    @InterfaceC1501320pAg(2)
    Object fetchPoiListOnly(@C040I PoiListRequest poiListRequest, InterfaceC1364105Vn<? super PoiListResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/poi/api/campaign/yearly_user_poi_track/query_video_on_poi")
    @InterfaceC1501320pAg(2)
    Object fetchVideoListWithPoi(@C040I FetchVideoRequest fetchVideoRequest, InterfaceC1364105Vn<? super FetchVideoResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/poi/api/campaign/yearly_user_poi_track/attach_poi")
    @InterfaceC1501320pAg(2)
    Object postInvitationData(@C040I MyMomentsInvitingRequest myMomentsInvitingRequest, InterfaceC1364105Vn<? super MyMomentsInvitingResponse> interfaceC1364105Vn);
}
