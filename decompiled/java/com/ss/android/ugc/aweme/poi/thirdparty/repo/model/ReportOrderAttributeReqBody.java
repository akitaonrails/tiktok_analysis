package com.ss.android.ugc.aweme.poi.thirdparty.repo.model;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class ReportOrderAttributeReqBody {

    @C09CT("biz_line")
    public final Integer bizLine;

    @C09CT("event")
    public final String event;

    @C09CT("order_attribute")
    public final String orderAttribute;

    @C09CT("tto_clid")
    public final String ttoClid;

    @C09CT("url")
    public final String url;

    public ReportOrderAttributeReqBody(Integer num, String str, String str2, String str3, String str4) {
        this.bizLine = num;
        this.ttoClid = str;
        this.event = str2;
        this.orderAttribute = str3;
        this.url = str4;
    }
}
