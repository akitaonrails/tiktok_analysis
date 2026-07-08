package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.generalpostpayment;

import X.C0X52;
import X.C1717050umd;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501350pAj;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InitializeAgreementRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InitializeAgreementResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ReportUserActionRequest;

/* JADX INFO: loaded from: classes27.dex */
public interface GeneralPostPaymentApi {
    public static final C1717050umd LIZ = C1717050umd.LIZ;

    @InterfaceC1501170pAR("/cashier/client/v1/initialize_agreement")
    Object initializeAgreement(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1501350pAj("request-time") long j, @InterfaceC1485405rg InitializeAgreementRequest initializeAgreementRequest, InterfaceC1364105Vn<? super C0X52<InitializeAgreementResponse>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/cashier/client/v1/report_user_action")
    Object reportUserAction(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1485405rg ReportUserActionRequest reportUserActionRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse>> interfaceC1364105Vn);
}
