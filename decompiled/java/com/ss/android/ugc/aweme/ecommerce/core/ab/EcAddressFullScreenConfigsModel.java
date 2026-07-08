package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class EcAddressFullScreenConfigsModel {

    @C09CT("address_edit_full_screen")
    public final Boolean addressEditFullScreen;

    @C09CT("address_list_full_screen")
    public final Boolean addressListFullScreen;

    public EcAddressFullScreenConfigsModel() {
        this(Boolean.FALSE, Boolean.FALSE);
    }

    public EcAddressFullScreenConfigsModel(Boolean bool, Boolean bool2) {
        this.addressEditFullScreen = bool;
        this.addressListFullScreen = bool2;
    }
}
