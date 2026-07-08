package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.EnumC962003pS;

/* JADX INFO: loaded from: classes2.dex */
public final class SaveAddressOption {

    @C09CT("address_save_flow")
    public final Integer addressSaveFlow;

    @C09CT("ignore_weak_error")
    public final boolean ignoreWeakError;

    public SaveAddressOption() {
        this(false, Integer.valueOf(EnumC962003pS.DEFAULT.ordinal()));
    }

    public SaveAddressOption(boolean z, Integer num) {
        this.ignoreWeakError = z;
        this.addressSaveFlow = num;
    }
}
