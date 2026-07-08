package com.ss.android.ugc.aweme.ecommerce.anchor.api;

import X.C0X52;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes27.dex */
public interface RecommendProductApi {
    @InterfaceC1501170pAR("/aweme/v1/oec/affiliate/creator/video/detect")
    Object detectVideo(@InterfaceC1485405rg DetectVideoRequest detectVideoRequest, InterfaceC1364105Vn<? super C0X52<RecommendResponse<DetectVideoData>>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/oec/affiliate/creator/recommended_products")
    Object getRecommendedProduct(@InterfaceC1501070pAH("recommendation_id") String str, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("version") int i2, InterfaceC1364105Vn<? super C0X52<RecommendResponse<GetRecommendedProductsData>>> interfaceC1364105Vn);
}
