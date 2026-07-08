package com.ss.android.ugc.aweme.ecommerce.base.address.map.libra;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class AddressMapDetailConfigModel {

    @C09CT("api_timeout")
    public final Long apiTimeOut;

    public AddressMapDetailConfigModel() {
        this(10000L);
    }

    public AddressMapDetailConfigModel(Long l) {
        this.apiTimeOut = l;
    }
}
