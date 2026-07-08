package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomPaymentPromotionMergeModel {

    @C09CT("bind_pay_configs")
    public final List<String> bindPayConfigs;

    @C09CT("payment_origin_data_configs")
    public final List<EcomPaymentOriginDataConfigItem> paymentOriginDataConfigs;

    @C09CT("promotion_configs")
    public final EcomPaymentPromotionConfigModel promotionConfigs;

    public EcomPaymentPromotionMergeModel() {
        this(null, null, null);
    }

    public EcomPaymentPromotionMergeModel(List<EcomPaymentOriginDataConfigItem> list, EcomPaymentPromotionConfigModel ecomPaymentPromotionConfigModel, List<String> list2) {
        this.paymentOriginDataConfigs = list;
        this.promotionConfigs = ecomPaymentPromotionConfigModel;
        this.bindPayConfigs = list2;
    }
}
