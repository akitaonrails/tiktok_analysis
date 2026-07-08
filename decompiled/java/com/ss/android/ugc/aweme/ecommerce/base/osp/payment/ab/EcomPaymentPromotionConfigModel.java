package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomPaymentPromotionConfigModel {

    @C09CT("extra_promotion_flow_pmids")
    public final List<String> extraPromotionFlowPmids;

    @C09CT("refresh_summary_auto")
    public final Boolean refreshSummaryAuto;

    public EcomPaymentPromotionConfigModel() {
        this(null, Boolean.FALSE);
    }

    public EcomPaymentPromotionConfigModel(List<String> list, Boolean bool) {
        this.extraPromotionFlowPmids = list;
        this.refreshSummaryAuto = bool;
    }
}
