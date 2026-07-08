package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class LynxCardInfo {

    @C09CT("card_type")
    public final int cardType;

    @C09CT("lynx_card_id")
    public final String lynxCardId;

    @C09CT("lynx_card_schema")
    public final String lynxCardSchema;

    @C09CT("popup_schema_bottom_right")
    public final String popupSchemaBottomRight;

    @C09CT("popup_schema_middle")
    public final String popupSchemaMiddle;

    public LynxCardInfo() {
        this(null, null, 0, null, null);
    }

    public LynxCardInfo(String str, String str2, int i, String str3, String str4) {
        this.lynxCardSchema = str;
        this.lynxCardId = str2;
        this.cardType = i;
        this.popupSchemaMiddle = str3;
        this.popupSchemaBottomRight = str4;
    }
}
