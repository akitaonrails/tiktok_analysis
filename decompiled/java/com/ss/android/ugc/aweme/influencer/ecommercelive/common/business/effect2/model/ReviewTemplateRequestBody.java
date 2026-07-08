package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class ReviewTemplateRequestBody {

    @C09CT("author_id")
    public final String authorId;

    @C09CT("field_list")
    public final List<TemplateField> fieldList;

    @C09CT("template_id")
    public final String templateId;

    @C09CT("template_type")
    public final int templateType;

    public ReviewTemplateRequestBody(String str, String str2, int i, List<TemplateField> list) {
        this.authorId = str;
        this.templateId = str2;
        this.templateType = i;
        this.fieldList = list;
    }
}
