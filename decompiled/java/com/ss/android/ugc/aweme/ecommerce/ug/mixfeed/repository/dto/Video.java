package com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class Video {

    @C09CT("aweme_struct")
    public final String awemeStruct;

    @C09CT("item_id")
    public final String itemID;

    public Video() {
        this(null, null);
    }

    public Video(String str, String str2) {
        this.itemID = str;
        this.awemeStruct = str2;
    }
}
