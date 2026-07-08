package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PayResultTrackData {

    @C09CT("payment_action_type")
    public final String actionType;

    @C09CT("cost_da_info")
    public final String costDaInfo;

    @C09CT("create_order_time")
    public final Long createOrderTime;

    @C09CT("paylink_handle_pay_info_finish_ts")
    public final Long handlePayInfoFinishTs;

    @C09CT("paylink_handle_pay_info_start_ts")
    public final Long handlePayInfoStartTs;

    @C09CT("is_create_order")
    public final Integer isCreateOrder;

    @C09CT("paylink_open_pay_success_schema_ts")
    public Long openPaySuccessSchemaTs;

    @C09CT("paylink_order_create_resp_ts")
    public final Long orderCreateRespTs;

    @C09CT("pay_commute_type")
    public final CommuteType payCommuteType;

    @C09CT("pay_order_time")
    public final Long payOrderTime;

    @C09CT("pay_request_id")
    public final String payRequestId;

    @C09CT("paylink_ec_common_pay_result_recv_ts")
    public Long payResultRecvTs;

    @C09CT("paylink_pay_success_callback_ts")
    public Long paySuccessCallbackTs;

    @C09CT("payment_method_id")
    public final String paymentMethodId;

    @C09CT("payment_method_name")
    public final String paymentMethodName;

    @C09CT("paylink_poll_order_result_success_ts")
    public Long pollOrderResultSuccessTs;

    @C09CT("source_page_type")
    public final String sourcePageType;

    @C09CT("start_time")
    public final Long startTime;

    public PayResultTrackData(String str, Long l, Long l2, Long l3, String str2, String str3, Integer num, String str4, CommuteType commuteType, String str5, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, String str6) {
        this.payRequestId = str;
        this.startTime = l;
        this.createOrderTime = l2;
        this.payOrderTime = l3;
        this.paymentMethodId = str2;
        this.paymentMethodName = str3;
        this.isCreateOrder = num;
        this.sourcePageType = str4;
        this.payCommuteType = commuteType;
        this.actionType = str5;
        this.orderCreateRespTs = l4;
        this.handlePayInfoStartTs = l5;
        this.handlePayInfoFinishTs = l6;
        this.paySuccessCallbackTs = l7;
        this.payResultRecvTs = l8;
        this.pollOrderResultSuccessTs = l9;
        this.openPaySuccessSchemaTs = l10;
        this.costDaInfo = str6;
    }
}
