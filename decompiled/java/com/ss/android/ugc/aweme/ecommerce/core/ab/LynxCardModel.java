package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class LynxCardModel {

    @C09CT("name")
    public final String cardName;

    @C09CT("gs_scroll_distance")
    public final Integer distance;

    @C09CT("first_screen")
    public final Integer firstScreen;

    @C09CT("schema")
    public final String schema;

    public LynxCardModel() {
        this(null, null, null, null);
    }

    public LynxCardModel(String str, Integer num, String str2, Integer num2) {
        this.cardName = str;
        this.firstScreen = num;
        this.schema = str2;
        this.distance = num2;
    }
}
