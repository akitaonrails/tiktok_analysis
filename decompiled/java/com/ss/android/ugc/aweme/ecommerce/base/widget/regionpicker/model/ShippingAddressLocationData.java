package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Error;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class ShippingAddressLocationData {

    @C09CT("shipping_address")
    public final Address address;

    @C09CT("errors")
    public final List<Error> errors;

    public ShippingAddressLocationData(Address address, List<Error> list) {
        this.address = address;
        this.errors = list;
    }
}
