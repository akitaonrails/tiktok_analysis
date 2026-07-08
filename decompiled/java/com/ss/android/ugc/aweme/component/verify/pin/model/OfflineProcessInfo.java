package com.ss.android.ugc.aweme.component.verify.pin.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class OfflineProcessInfo implements Serializable {

    @C09CT("deal_url")
    public final String customerCenterUrl;

    @C09CT("pipo_product_code")
    public final String pipoProductCode;

    public OfflineProcessInfo(String str, String str2) {
        this.pipoProductCode = str;
        this.customerCenterUrl = str2;
    }
}
