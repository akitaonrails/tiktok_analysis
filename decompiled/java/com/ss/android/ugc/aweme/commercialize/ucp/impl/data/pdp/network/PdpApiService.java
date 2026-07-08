package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.network;

import X.C0X8N;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174708fZ;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.JsonRpcRequestDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.JsonRpcResponseDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.dto.RecommendApiResponseDto;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@C0X8N
public interface PdpApiService {
    @InterfaceC1501170pAR
    Object getProductDetails(@InterfaceC2174708fZ String str, @InterfaceC1485405rg JsonRpcRequestDto jsonRpcRequestDto, InterfaceC1364105Vn<? super JsonRpcResponseDto> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("api/ad/v1/ac/related_product")
    Object getRelatedProducts(@InterfaceC1501130pAN Map<String, String> map, InterfaceC1364105Vn<? super RecommendApiResponseDto> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("global/v1/search")
    Object searchUniversalProducts(@InterfaceC1501130pAN Map<String, String> map, InterfaceC1364105Vn<? super List<UniversalProductDto>> interfaceC1364105Vn);
}
