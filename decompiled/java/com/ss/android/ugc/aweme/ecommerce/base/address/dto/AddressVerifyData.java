package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes27.dex */
public final class AddressVerifyData {

    @C09CT("shipping_address")
    public final Address shippingAddress;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("tip_info")
    public final AddressTipInfo tipInfo;

    public AddressVerifyData(Integer num, AddressTipInfo addressTipInfo, Address address) {
        this.status = num;
        this.tipInfo = addressTipInfo;
        this.shippingAddress = address;
    }
}
