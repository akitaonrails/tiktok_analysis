package com.ss.android.ugc.aweme.commercialize.anchor.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class BusinessData implements Serializable {

    @C09CT("enable_report")
    public Boolean enableReport;

    @C09CT("use_pia")
    public Boolean usePIA;

    public final Boolean getEnableReport() {
        return this.enableReport;
    }

    public final Boolean getUsePIA() {
        return this.usePIA;
    }

    public final void setEnableReport(Boolean bool) {
        this.enableReport = bool;
    }

    public final void setUsePIA(Boolean bool) {
        this.usePIA = bool;
    }
}
