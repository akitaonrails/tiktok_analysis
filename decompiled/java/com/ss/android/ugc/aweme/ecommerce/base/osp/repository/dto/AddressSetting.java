package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressSetting {

    @C09CT("pin_to_top_address")
    public Integer pinToTopAddress;

    public AddressSetting() {
        this(null);
    }

    public AddressSetting(Integer num) {
        this.pinToTopAddress = num;
    }
}
