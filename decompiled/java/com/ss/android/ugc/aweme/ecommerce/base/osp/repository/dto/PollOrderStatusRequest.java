package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PollOrderStatusRequest {
    public String LIZ;

    @C09CT("combo_id")
    public final String comboId;

    @C09CT("flow_type")
    public final Integer flowType;

    @C09CT("create_order_info_from_bill")
    public final String info;

    @C09CT("last_logid")
    public final String lastLogId;

    @C09CT("order_ids")
    public final List<String> orderIds;

    @C09CT("payment_method_id")
    public final String payMethodId;

    @C09CT("poll_scene")
    public final Integer pollScene;

    @C09CT("retry_time")
    public final int retryTime;

    @C09CT("ve_info_param")
    public final String veInfoParam;

    public PollOrderStatusRequest() {
        this(null, null, 0, null, null, null, null, null, null);
    }

    public static PollOrderStatusRequest LIZ(PollOrderStatusRequest pollOrderStatusRequest, int i, String str, Integer num, int i2) {
        String str2;
        List<String> list;
        String str3;
        String str4;
        Integer num2;
        String str5 = str;
        Integer num3 = num;
        int i3 = i;
        String str6 = null;
        if ((i2 & 1) != 0) {
            str2 = pollOrderStatusRequest.comboId;
        } else {
            str2 = null;
        }
        if ((i2 & 2) != 0) {
            list = pollOrderStatusRequest.orderIds;
        } else {
            list = null;
        }
        if ((i2 & 4) != 0) {
            i3 = pollOrderStatusRequest.retryTime;
        }
        if ((i2 & 8) != 0) {
            str5 = pollOrderStatusRequest.lastLogId;
        }
        if ((i2 & 16) != 0) {
            str3 = pollOrderStatusRequest.info;
        } else {
            str3 = null;
        }
        if ((i2 & 32) != 0) {
            str4 = pollOrderStatusRequest.payMethodId;
        } else {
            str4 = null;
        }
        if ((i2 & 64) != 0) {
            num2 = pollOrderStatusRequest.flowType;
        } else {
            num2 = null;
        }
        if ((i2 & 128) != 0) {
            num3 = pollOrderStatusRequest.pollScene;
        }
        if ((i2 & 256) != 0) {
            str6 = pollOrderStatusRequest.veInfoParam;
        }
        return new PollOrderStatusRequest(str2, list, i3, str5, str3, str4, num2, num3, str6);
    }

    public PollOrderStatusRequest(String str, List<String> list, int i, String str2, String str3, String str4, Integer num, Integer num2, String str5) {
        this.comboId = str;
        this.orderIds = list;
        this.retryTime = i;
        this.lastLogId = str2;
        this.info = str3;
        this.payMethodId = str4;
        this.flowType = num;
        this.pollScene = num2;
        this.veInfoParam = str5;
    }
}
