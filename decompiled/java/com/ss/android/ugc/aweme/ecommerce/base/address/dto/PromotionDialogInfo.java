package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PromotionDialogInfo {

    @C09CT("dialog_data")
    public final String dialogData;

    @C09CT("dialog_schema")
    public final String dialogSchema;

    public PromotionDialogInfo() {
        this(null, null);
    }

    public PromotionDialogInfo(String str, String str2) {
        this.dialogSchema = str;
        this.dialogData = str2;
    }
}
