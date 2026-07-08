package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;

/* JADX INFO: loaded from: classes2.dex */
public final class ElevatorBar {

    @C09CT("content")
    public ECRichText content;

    @C09CT("destination")
    public Integer destination;

    @C09CT("payment_method_id")
    public String pmId;

    @C09CT("payment_method_token")
    public String pmToken;

    public ElevatorBar() {
        this(null, null, null, null);
    }

    public ElevatorBar(ECRichText eCRichText, Integer num, String str, String str2) {
        this.content = eCRichText;
        this.destination = num;
        this.pmId = str;
        this.pmToken = str2;
    }
}
