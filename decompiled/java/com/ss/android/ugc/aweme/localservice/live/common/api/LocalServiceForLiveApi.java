package com.ss.android.ugc.aweme.localservice.live.common.api;

import X.C1173130gdL;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501350pAj;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.localservice.live.common.api.model.PinedProductsResponse;
import com.ss.android.ugc.aweme.localservice.live.common.api.model.ProductNumResponse;

/* JADX INFO: loaded from: classes29.dex */
public interface LocalServiceForLiveApi {
    public static final C1173130gdL LIZ = C1173130gdL.LIZ;

    @InterfaceC1501160pAQ("/tiktok/ls/live/pined_products")
    Object getPinedProducts(@InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("pined_product_id") String str2, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) String str3, @InterfaceC1501070pAH("author_id") String str4, @InterfaceC1501070pAH("live_extra") String str5, @InterfaceC1501070pAH("room_info") String str6, @InterfaceC1501350pAj("Compressed-Bcm-Chain") String str7, InterfaceC1364105Vn<? super PinedProductsResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/ls/live/room_product_num")
    Object getRoomProductNum(@InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("author_id") String str2, @InterfaceC1501350pAj("Compressed-Bcm-Chain") String str3, InterfaceC1364105Vn<? super ProductNumResponse> interfaceC1364105Vn);
}
