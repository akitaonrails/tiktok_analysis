package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.AddressBase;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class BillInfoClientParam implements Serializable {
    public static final int $stable = 8;

    @C09CT("pre_address_base")
    public final AddressBase preAddressBase;

    public BillInfoClientParam() {
        this(null);
    }

    public BillInfoClientParam(AddressBase addressBase) {
        this.preAddressBase = addressBase;
    }
}
