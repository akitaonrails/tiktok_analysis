package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.network;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC2175608fi;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.ReviewInteractResponseDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.dto.RecommendApiResponseDto;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface PdpReviewApiService {
    @InterfaceC1501160pAQ("/api/ad/v1/landingpage/comments")
    Object getRealReviews(@InterfaceC2175608fi Map<String, String> map, @InterfaceC1501130pAN Map<String, String> map2, InterfaceC1364105Vn<? super ReviewInteractResponseDto> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/ad/v1/ac/related_product")
    Object getRelatedProducts(@InterfaceC2175608fi Map<String, String> map, @InterfaceC1501130pAN Map<String, String> map2, InterfaceC1364105Vn<? super RecommendApiResponseDto> interfaceC1364105Vn);
}
