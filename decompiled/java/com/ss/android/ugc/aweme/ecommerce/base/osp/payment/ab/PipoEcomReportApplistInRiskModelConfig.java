package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoEcomReportApplistInRiskModelConfig {

    @C09CT("appName")
    public final String appName;

    @C09CT("packageName")
    public final String packageName;

    @C09CT("schema")
    public final String schema;

    public PipoEcomReportApplistInRiskModelConfig() {
        this(null, null, null);
    }

    public PipoEcomReportApplistInRiskModelConfig(String str, String str2, String str3) {
        this.appName = str;
        this.packageName = str2;
        this.schema = str3;
    }
}
