package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class BenefitInfo implements Serializable {

    @C09CT("description")
    public final String description;

    @C09CT("dialog_description")
    public final Description dialogDescription;

    @C09CT("page_url")
    public final String pageLink;

    @C09CT("subtitle")
    public final String subtitle;

    @C09CT("title")
    public final String title;

    @C09CT("type")
    public final String type;

    public BenefitInfo(String str, String str2, String str3, String str4, String str5, Description description) {
        this.type = str;
        this.title = str2;
        this.subtitle = str3;
        this.description = str4;
        this.pageLink = str5;
        this.dialogDescription = description;
    }
}
