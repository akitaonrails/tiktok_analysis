package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.api;

import X.C040F;
import X.C040I;
import X.C11NZ;
import X.C966503qB;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501240pAY;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryRequest;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public interface DeliveryApi {
    public static final C966503qB LIZ = C966503qB.LIZ;

    @InterfaceC1501240pAY("/api/v1/shop/logistic/list")
    Object fetchLogistics(@C040I DeliveryRequest deliveryRequest, @C040F HashMap<String, String> map, InterfaceC1364105Vn<? super Response<DeliveryData>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/shop/logistic/list")
    C11NZ<Response<DeliveryData>> getLogistics(@C040I DeliveryRequest deliveryRequest, @C040F HashMap<String, String> map);
}
