package com.ss.android.ugc.aweme.search.ecom.data;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class CreatorShowcaseText {

    @C09CT("products_number")
    public final String productsNumber;

    @C09CT("showcase")
    public final String showcase;

    @C09CT("showcase_full")
    public final String showcaseFull;

    @C09CT("view_all")
    public final String viewAll;

    public CreatorShowcaseText() {
        this(null, null, null, null);
    }

    public CreatorShowcaseText(String str, String str2, String str3, String str4) {
        this.showcaseFull = str;
        this.showcase = str2;
        this.viewAll = str3;
        this.productsNumber = str4;
    }
}
