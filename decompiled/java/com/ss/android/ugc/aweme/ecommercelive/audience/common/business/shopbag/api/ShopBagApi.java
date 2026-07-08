package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.shopbag.api;

import X.C0X52;
import X.C598490Ndf;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.ecommercebase.network.StatusResponse;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public interface ShopBagApi {
    public static final C598490Ndf LIZ = C598490Ndf.LIZ;

    @InterfaceC1501160pAQ("/aweme/v1/oec/bag/preview/assemble")
    Object getLiveBagPreview(@InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("author_id") String str2, @InterfaceC1501070pAH("is_owner") boolean z, @InterfaceC1501070pAH("promotion_response_style") int i, @InterfaceC1501070pAH("offset") Integer num, @InterfaceC1501070pAH("page_size") Integer num2, @InterfaceC1501070pAH("need_new_user_voucher") boolean z2, @InterfaceC1501070pAH("use_new_promotion") int i2, @InterfaceC1501070pAH("is_retry") boolean z3, @InterfaceC1501070pAH("request_scene") int i3, @InterfaceC1501130pAN Map<String, String> map, InterfaceC1364105Vn<? super C0X52<StatusResponse<Object>>> interfaceC1364105Vn);
}
