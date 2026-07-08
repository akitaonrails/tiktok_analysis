package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;

/* JADX INFO: loaded from: classes2.dex */
public final class AddonOrderButton {

    @C09CT("button_name")
    public ECRichText buttonName;

    public AddonOrderButton() {
    }

    public AddonOrderButton(ECRichText eCRichText) {
        this.buttonName = eCRichText;
    }
}
