package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;

/* JADX INFO: loaded from: classes2.dex */
public final class DigitalDelivery {

    @C09CT("content")
    public ECRichText content;

    @C09CT("title")
    public ECRichText title;

    public DigitalDelivery() {
        this(null, null);
    }

    public DigitalDelivery(ECRichText eCRichText, ECRichText eCRichText2) {
        this.title = eCRichText;
        this.content = eCRichText2;
    }
}
