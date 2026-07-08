package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class ClickableComponent {

    @C09CT("schema")
    public final String schema;

    @C09CT("text")
    public final String text;

    public ClickableComponent() {
        this(null, null);
    }

    public ClickableComponent(String str, String str2) {
        this.text = str;
        this.schema = str2;
    }
}
