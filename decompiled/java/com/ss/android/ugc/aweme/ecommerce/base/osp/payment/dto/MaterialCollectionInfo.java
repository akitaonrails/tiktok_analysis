package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class MaterialCollectionInfo {

    @C09CT("action")
    public final String action;

    @C09CT("action_url")
    public final String actionUrl;

    @C09CT("material_content")
    public final String materialContent;

    public MaterialCollectionInfo() {
        this(null, null, null);
    }

    public MaterialCollectionInfo(String str, String str2, String str3) {
        this.action = str;
        this.actionUrl = str2;
        this.materialContent = str3;
    }
}
