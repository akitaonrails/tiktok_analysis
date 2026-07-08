package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class BundleAddButton {

    @C09CT("action")
    public final Integer action;

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("secondary_page_schema")
    public final String schema;

    public BundleAddButton(String str, Integer num, String str2) {
        this.buttonText = str;
        this.action = num;
        this.schema = str2;
    }
}
