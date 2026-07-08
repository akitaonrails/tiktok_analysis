package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;

/* JADX INFO: loaded from: classes2.dex */
public final class RefundableSampleModule {

    @C09CT("content")
    public ECRichText content;

    @C09CT("module_status")
    public Integer moduleStatus;

    @C09CT("schema")
    public String schema;

    @C09CT("select_status")
    public Integer selectStatus;

    @C09CT("title")
    public ECRichText title;

    public RefundableSampleModule() {
        this(null, null, null, null, null);
    }

    public RefundableSampleModule(ECRichText eCRichText, ECRichText eCRichText2, Integer num, Integer num2, String str) {
        this.title = eCRichText;
        this.content = eCRichText2;
        this.moduleStatus = num;
        this.selectStatus = num2;
        this.schema = str;
    }
}
