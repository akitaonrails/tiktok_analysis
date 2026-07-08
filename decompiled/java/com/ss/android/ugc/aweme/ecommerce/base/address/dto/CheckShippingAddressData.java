package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class CheckShippingAddressData {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("errors")
    public final List<Error> errors;

    @C09CT("tips")
    public final List<DisplayTip> tips;

    @C09CT("verify_data")
    public final AddressVerifyData verifyData;

    public CheckShippingAddressData(List<Error> list, List<DisplayTip> list2, AddressVerifyData addressVerifyData, String str) {
        this.errors = list;
        this.tips = list2;
        this.verifyData = addressVerifyData;
        this.daInfo = str;
    }
}
