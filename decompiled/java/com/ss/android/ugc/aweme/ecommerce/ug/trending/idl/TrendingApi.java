package com.ss.android.ugc.aweme.ecommerce.ug.trending.idl;

import X.C0NSL;
import X.C0X52;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501060pAG;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.ChannelData;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;

/* JADX INFO: loaded from: classes27.dex */
public interface TrendingApi {
    public static final API LIZ = API.LIZJ;

    public static final class API implements TrendingApi {
        public static final /* synthetic */ API LIZJ = new API();
        public final /* synthetic */ TrendingApi LIZIZ = (TrendingApi) C0NSL.LIZ().create(TrendingApi.class);

        @Override // com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.TrendingApi
        @InterfaceC1501170pAR("/api/v1/mall/western/channel/auction/get")
        public Object getWesternAuctionChannel(@InterfaceC1485405rg GetCommonChannelRequest getCommonChannelRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<ChannelData>>> interfaceC1364105Vn) {
            return this.LIZIZ.getWesternAuctionChannel(getCommonChannelRequest, interfaceC1364105Vn);
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.TrendingApi
        @InterfaceC1501170pAR("/api/v{version}/mall/western/channel/trending/get")
        public Object getWesternTrendingChannel(@InterfaceC1501060pAG("version") String str, @InterfaceC1485405rg GetCommonChannelRequest getCommonChannelRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<ChannelData>>> interfaceC1364105Vn) {
            return this.LIZIZ.getWesternTrendingChannel(str, getCommonChannelRequest, interfaceC1364105Vn);
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.TrendingApi
        @InterfaceC1501170pAR("/api/v1/mall/western/channel/impression/write")
        public Object westernChannelImpressionWrite(@InterfaceC1485405rg WriteImpressionRequest writeImpressionRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<ChannelData>>> interfaceC1364105Vn) {
            return this.LIZIZ.westernChannelImpressionWrite(writeImpressionRequest, interfaceC1364105Vn);
        }
    }

    @InterfaceC1501170pAR("/api/v1/mall/western/channel/auction/get")
    Object getWesternAuctionChannel(@InterfaceC1485405rg GetCommonChannelRequest getCommonChannelRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<ChannelData>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/v{version}/mall/western/channel/trending/get")
    Object getWesternTrendingChannel(@InterfaceC1501060pAG("version") String str, @InterfaceC1485405rg GetCommonChannelRequest getCommonChannelRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<ChannelData>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/v1/mall/western/channel/impression/write")
    Object westernChannelImpressionWrite(@InterfaceC1485405rg WriteImpressionRequest writeImpressionRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<ChannelData>>> interfaceC1364105Vn);
}
