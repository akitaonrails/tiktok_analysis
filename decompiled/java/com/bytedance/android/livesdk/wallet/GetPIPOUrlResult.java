package com.bytedance.android.livesdk.wallet;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GetPIPOUrlResult {

    @C09CT("data")
    public UrlData data;

    public static final class UrlData {

        @C09CT("merchant_id")
        public String merchantId;

        @C09CT("pipo_url")
        public String pipoUrl;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.pipoUrl != null) {
                sb.append(", pipo_url=");
                sb.append(this.pipoUrl);
            }
            if (this.merchantId != null) {
                sb.append(", merchant_id=");
                sb.append(this.merchantId);
            }
            sb.replace(0, 2, "UrlData{");
            sb.append('}');
            return sb.toString();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        sb.replace(0, 2, "GetPIPOUrlResult{");
        sb.append('}');
        return sb.toString();
    }
}
