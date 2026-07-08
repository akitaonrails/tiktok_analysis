package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.FinancingDetails;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PayRiskControlParam;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentListRequest {

    @C09CT("change_info")
    public final ChangeInfo changeInfo;

    @C09CT("client_template")
    public final int client_template;

    @C09CT("combo_Id")
    public final String comboId;

    @C09CT("financing_details")
    public FinancingDetails financingDetails;

    @C09CT("last_pay_order_id")
    public final String lastPayOrderId;

    @C09CT("order_ids")
    public final List<String> orderIds;

    @C09CT("pay_risk_control_param")
    public final PayRiskControlParam payRiskControlParam;

    @C09CT("pipo_error_code_params")
    public String pipoErrorCodeParams;

    @C09CT("retry_cashier")
    public final Boolean retryCashier;

    @C09CT("with_pre_risk_param")
    public final boolean withPreRiskParam;

    public static PaymentListRequest LIZ(PaymentListRequest paymentListRequest, ChangeInfo changeInfo, FinancingDetails financingDetails, int i) {
        String str;
        List<String> list;
        PayRiskControlParam payRiskControlParam;
        boolean z;
        int i2;
        String str2;
        Boolean bool;
        FinancingDetails financingDetails2 = financingDetails;
        ChangeInfo changeInfo2 = changeInfo;
        String str3 = null;
        if ((i & 1) != 0) {
            str = paymentListRequest.comboId;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            list = paymentListRequest.orderIds;
        } else {
            list = null;
        }
        if ((i & 4) != 0) {
            payRiskControlParam = paymentListRequest.payRiskControlParam;
        } else {
            payRiskControlParam = null;
        }
        if ((i & 8) != 0) {
            z = paymentListRequest.withPreRiskParam;
        } else {
            z = false;
        }
        if ((i & 16) != 0) {
            i2 = paymentListRequest.client_template;
        } else {
            i2 = 0;
        }
        if ((i & 32) != 0) {
            str2 = paymentListRequest.lastPayOrderId;
        } else {
            str2 = null;
        }
        if ((i & 64) != 0) {
            changeInfo2 = paymentListRequest.changeInfo;
        }
        if ((i & 128) != 0) {
            financingDetails2 = paymentListRequest.financingDetails;
        }
        if ((i & 256) != 0) {
            bool = paymentListRequest.retryCashier;
        } else {
            bool = null;
        }
        if ((i & 512) != 0) {
            str3 = paymentListRequest.pipoErrorCodeParams;
        }
        paymentListRequest.getClass();
        return new PaymentListRequest(str, list, payRiskControlParam, z, i2, str2, changeInfo2, financingDetails2, bool, str3);
    }

    public PaymentListRequest(String str, List<String> list, PayRiskControlParam payRiskControlParam, boolean z, int i, String str2, ChangeInfo changeInfo, FinancingDetails financingDetails, Boolean bool, String str3) {
        this.comboId = str;
        this.orderIds = list;
        this.payRiskControlParam = payRiskControlParam;
        this.withPreRiskParam = z;
        this.client_template = i;
        this.lastPayOrderId = str2;
        this.changeInfo = changeInfo;
        this.financingDetails = financingDetails;
        this.retryCashier = bool;
        this.pipoErrorCodeParams = str3;
    }
}
