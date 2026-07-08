package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoEcomReportApplistInRiskModel {

    @C09CT("config")
    public final List<PipoEcomReportApplistInRiskModelConfig> config;

    @C09CT("enable")
    public final Boolean enable;

    public PipoEcomReportApplistInRiskModel() {
        this(Boolean.FALSE, null);
    }

    public PipoEcomReportApplistInRiskModel(Boolean bool, List<PipoEcomReportApplistInRiskModelConfig> list) {
        this.enable = bool;
        this.config = list;
    }
}
