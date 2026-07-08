package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.NewPayInfo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class CreateOrderData {

    @C09CT("cashier")
    public final n cashier;

    @C09CT("combo_id")
    public final String comboId;

    @C09CT("cost_da_info")
    public final String costDaInfo;

    @C09CT("create_order_lock_conflict")
    public final Boolean createOrderLockConflict;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("debug_info")
    public final String debugInfo;

    @C09CT("delay_time")
    public final Long delayTime;

    @C09CT("exception_ux")
    public final ExceptionUX exceptionUX;

    @C09CT("jump_schema_url")
    public final String jumpSchema_url;

    @C09CT("logid")
    public final String logId;

    @C09CT("miss_cashback")
    public final Boolean missCashback;

    @C09CT("new_pay_info")
    public final NewPayInfo newPayInfo;

    @C09CT("order_ids")
    public final List<String> orderIds;

    @C09CT("pipo_error_action")
    public final String pipoErrorAction;

    @C09CT("post_order_diversion_config")
    public final PostOrderDiversionConfig postOrderDiversionConfig;

    @C09CT("post_order_schemas")
    public final List<PostOrderSchema> postOrderSchemas;

    @C09CT("tips_text")
    public final String tipsText;

    public CreateOrderData(List<String> list, String str, n nVar, ExceptionUX exceptionUX, NewPayInfo newPayInfo, String str2, Boolean bool, Long l, String str3, String str4, String str5, String str6, PostOrderDiversionConfig postOrderDiversionConfig, String str7, List<PostOrderSchema> list2, Boolean bool2, String str8) {
        this.orderIds = list;
        this.jumpSchema_url = str;
        this.cashier = nVar;
        this.exceptionUX = exceptionUX;
        this.newPayInfo = newPayInfo;
        this.comboId = str2;
        this.missCashback = bool;
        this.delayTime = l;
        this.tipsText = str3;
        this.daInfo = str4;
        this.logId = str5;
        this.debugInfo = str6;
        this.postOrderDiversionConfig = postOrderDiversionConfig;
        this.pipoErrorAction = str7;
        this.postOrderSchemas = list2;
        this.createOrderLockConflict = bool2;
        this.costDaInfo = str8;
    }
}
