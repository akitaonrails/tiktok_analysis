package com.ss.android.ugc.aweme.poi.osp.repo;

import X.C040I;
import X.C0X52;
import X.C1172790gcn;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501370pAl;
import X.InterfaceC2177008fw;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.poi.osp.repo.model.OrderStatusResponse;
import com.ss.android.ugc.aweme.poi.osp.repo.model.SubmitOrderRequest;
import com.ss.android.ugc.aweme.poi.osp.repo.model.SubmitOrderResponse;
import com.ss.android.ugc.aweme.slash.data.SlashPage;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public interface PoiOrderSubmitApi {
    public static final C1172790gcn LIZ = C1172790gcn.LIZ;

    @InterfaceC1501200pAU("/tiktok/ls/order/status/get/v1")
    Object LIZ(@InterfaceC1501120pAM("source") Integer num, @InterfaceC1501120pAM("order_id") String str, InterfaceC1364105Vn<? super OrderStatusResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/tiktok/ls/order/submit/v1")
    Object LIZIZ(@C040I SubmitOrderRequest submitOrderRequest, @InterfaceC1501370pAl("x-gec-token") String str, @InterfaceC1501370pAl("Compressed-Bcm-Chain") String str2, InterfaceC1364105Vn<? super SubmitOrderResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/tiktok/ls/order/slash/v1")
    Object getOrderPrepareSlashData(@InterfaceC1501370pAl("page_tag") String str, @InterfaceC1501370pAl("scene_tag") String str2, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) String str3, @InterfaceC1501120pAM("service_type") String str4, @InterfaceC1501120pAM("slash_param") String str5, @InterfaceC1501120pAM("biz_params") String str6, @C040I Map<String, Object> map, @InterfaceC2177008fw Object obj, @InterfaceC1501370pAl("Compressed-Bcm-Chain") String str7, InterfaceC1364105Vn<? super C0X52<SlashPage>> interfaceC1364105Vn);
}
