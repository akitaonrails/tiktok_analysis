package com.bytedance.android.livesdk.wallet;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class NoticesRequestParams {

    @C09CT("view_name")
    public String viewName;

    @C09CT("currency")
    public String currency = "";

    @C09CT("app_store_region")
    public String appStoreRegion = "";

    @C09CT("extra")
    public String extra = "";

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.viewName != null) {
            sb.append(", view_name=");
            sb.append(this.viewName);
        }
        sb.replace(0, 2, "NoticesRequestParams{");
        sb.append('}');
        return sb.toString();
    }
}
