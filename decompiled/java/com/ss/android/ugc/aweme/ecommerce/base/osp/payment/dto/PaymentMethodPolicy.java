package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentMethodPolicy {

    @C09CT("link")
    public List<String> links;

    @C09CT("raw_text")
    public String rawText;

    public PaymentMethodPolicy() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodPolicy)) {
            return false;
        }
        PaymentMethodPolicy paymentMethodPolicy = (PaymentMethodPolicy) obj;
        return Intrinsics.LJFF(this.rawText, paymentMethodPolicy.rawText) && Intrinsics.LJFF(this.links, paymentMethodPolicy.links);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentMethodPolicy(rawText=");
        sbLIZ.append(this.rawText);
        sbLIZ.append(", links=");
        sbLIZ.append(this.links);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PaymentMethodPolicy(String str, List<String> list) {
        this.rawText = str;
        this.links = list;
    }
}
