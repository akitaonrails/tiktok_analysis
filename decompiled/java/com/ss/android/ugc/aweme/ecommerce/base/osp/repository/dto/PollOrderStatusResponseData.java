package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;

/* JADX INFO: loaded from: classes2.dex */
public final class PollOrderStatusResponseData {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("debug_info")
    public final String debugInfo;

    @C09CT("exception_ux")
    public final ExceptionUX exceptionUX;

    @C09CT("jump_schema_url")
    public final String jumpSchema_url;

    @C09CT("logid")
    public final String logId;

    @C09CT("poll_order_display_info")
    public final PollOrderDisplayInfo pollOrderDisplayInfo;

    @C09CT("order_status")
    public final Integer status;

    public PollOrderStatusResponseData(Integer num, String str, ExceptionUX exceptionUX, String str2, String str3, String str4, PollOrderDisplayInfo pollOrderDisplayInfo) {
        this.status = num;
        this.jumpSchema_url = str;
        this.exceptionUX = exceptionUX;
        this.daInfo = str2;
        this.debugInfo = str3;
        this.logId = str4;
        this.pollOrderDisplayInfo = pollOrderDisplayInfo;
    }
}
