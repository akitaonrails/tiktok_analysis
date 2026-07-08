package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class AddonClickToast {

    @C09CT("icon")
    public String iconRes;

    @C09CT("toast_content")
    public String toastContent;

    @C09CT("toast_type")
    public Integer toastType;

    public AddonClickToast() {
    }

    public AddonClickToast(Integer num, String str, String str2) {
        this.toastType = num;
        this.toastContent = str;
        this.iconRes = str2;
    }
}
