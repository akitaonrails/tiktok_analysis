package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;

/* JADX INFO: loaded from: classes2.dex */
public final class ShippingAddressSwitch {

    @C09CT("address_switch_type")
    public final Integer addressSwitchType;

    @C09CT("text")
    public final ECRichText text;

    public ShippingAddressSwitch(ECRichText eCRichText, Integer num) {
        this.text = eCRichText;
        this.addressSwitchType = num;
    }
}
