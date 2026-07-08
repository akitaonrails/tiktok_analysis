package com.ss.android.ugc.aweme.wallet;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class BalancePageSchemaModel {

    @C09CT("page_charge_schema")
    public String pageChargeUrl;

    @C09CT("page_index_schema")
    public String pageIndexUrl;

    public BalancePageSchemaModel() {
        this("aweme://webview/?url=https%3A%2F%2Finapp.tiktokv.com%2Ffalcon%2Fmain%2Fwallet%2Frecharge%3Fhide_status_bar%3D0%26flag%3D%252Fwallet%252Fhome%26entry%3Dsettings%26hide_nav_bar%3D1%26no_hw%3D1&hide_status_bar=0&flag=%2Fwallet%2Fhome&entry=settings&hide_nav_bar=1&no_hw=1&awe_falcon=sh", "aweme://roma_redirect/?spark_page=balance_home&roma_group_key=spark_page_balance_home&roma_page_key=p");
    }

    public BalancePageSchemaModel(String str, String str2) {
        this.pageChargeUrl = str;
        this.pageIndexUrl = str2;
    }
}
