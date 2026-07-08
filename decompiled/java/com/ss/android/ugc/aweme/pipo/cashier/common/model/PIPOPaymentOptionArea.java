package com.ss.android.ugc.aweme.pipo.cashier.common.model;

import X.C09CT;
import X.C15438062q;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PIPOPaymentOptionArea {

    @C09CT("default_display_amount")
    public String defaultDisplayAmount;

    @C09CT("display_amount")
    public String displayAmount;

    @C09CT("key")
    public final String key;

    @C09CT("payment_options")
    public final List<PaymentOption> paymentOptions;

    @C09CT("title")
    public String title;

    public PIPOPaymentOptionArea() {
        this(null, null, null, null, new ArrayList());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PIPOPaymentOptionArea)) {
            return false;
        }
        PIPOPaymentOptionArea pIPOPaymentOptionArea = (PIPOPaymentOptionArea) obj;
        return Intrinsics.LJFF(this.key, pIPOPaymentOptionArea.key) && Intrinsics.LJFF(this.title, pIPOPaymentOptionArea.title) && Intrinsics.LJFF(this.defaultDisplayAmount, pIPOPaymentOptionArea.defaultDisplayAmount) && Intrinsics.LJFF(this.displayAmount, pIPOPaymentOptionArea.displayAmount) && Intrinsics.LJFF(this.paymentOptions, pIPOPaymentOptionArea.paymentOptions);
    }

    public final int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.defaultDisplayAmount;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.displayAmount;
        return ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.paymentOptions.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PIPOPaymentOptionArea(key=");
        sbLIZ.append(this.key);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", defaultDisplayAmount=");
        sbLIZ.append(this.defaultDisplayAmount);
        sbLIZ.append(", displayAmount=");
        sbLIZ.append(this.displayAmount);
        sbLIZ.append(", paymentOptions=");
        sbLIZ.append(this.paymentOptions);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final PIPOPaymentOptionArea LIZ() {
        List<PaymentOption> list = this.paymentOptions;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<PaymentOption> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZLLL());
        }
        return LIZIZ(this, new ArrayList(arrayList));
    }

    public final PaymentOption LIZJ(String str) {
        PaymentOption paymentOption = null;
        if (str == null) {
            return null;
        }
        loop0: for (PaymentOption paymentOption2 : this.paymentOptions) {
            PaymentOption paymentOption3 = paymentOption2;
            if (!Intrinsics.LJFF(paymentOption3.LIZ, str)) {
                List<PaymentOption> list = paymentOption3.LIZLLL;
                if (list != null && !list.isEmpty()) {
                    Iterator<PaymentOption> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next().LIZ, str)) {
                        }
                    }
                }
            }
            paymentOption = paymentOption2;
        }
        return paymentOption;
    }

    public static PIPOPaymentOptionArea LIZIZ(PIPOPaymentOptionArea pIPOPaymentOptionArea, List list) {
        String str = pIPOPaymentOptionArea.key;
        String str2 = pIPOPaymentOptionArea.title;
        String str3 = pIPOPaymentOptionArea.defaultDisplayAmount;
        String str4 = pIPOPaymentOptionArea.displayAmount;
        pIPOPaymentOptionArea.getClass();
        return new PIPOPaymentOptionArea(str, str2, str3, str4, list);
    }

    public PIPOPaymentOptionArea(String str, String str2, String str3, String str4, List<PaymentOption> list) {
        this.key = str;
        this.title = str2;
        this.defaultDisplayAmount = str3;
        this.displayAmount = str4;
        this.paymentOptions = list;
    }
}
