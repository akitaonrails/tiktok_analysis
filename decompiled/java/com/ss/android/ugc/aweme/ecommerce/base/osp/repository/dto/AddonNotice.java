package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class AddonNotice {

    @C09CT("click_toast")
    public List<AddonClickToast> clickToast;

    @C09CT("expand_text")
    public String tipsText;

    public AddonNotice() {
    }

    public AddonNotice(List<AddonClickToast> list, String str) {
        this.clickToast = list;
        this.tipsText = str;
    }
}
