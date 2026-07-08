package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class AddonDescInfo {

    @C09CT("desc")
    public String desc;

    @C09CT("title")
    public String title;

    public AddonDescInfo() {
        this(null, null);
    }

    public AddonDescInfo(String str, String str2) {
        this.title = str;
        this.desc = str2;
    }
}
