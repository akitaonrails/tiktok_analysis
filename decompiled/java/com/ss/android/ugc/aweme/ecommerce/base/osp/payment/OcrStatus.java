package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes2.dex */
public final class OcrStatus {

    @C09CT("card_number")
    public final String cardNumber;

    @C09CT("date")
    public final String date;

    @C09CT("holder_name")
    public final String holder;

    public OcrStatus() {
        this("-1", "-1", "-1");
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('{');
        sbLIZ.append(this.cardNumber);
        sbLIZ.append(',');
        sbLIZ.append(this.date);
        sbLIZ.append(',');
        sbLIZ.append(this.holder);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public OcrStatus(String str, String str2, String str3) {
        this.cardNumber = str;
        this.date = str2;
        this.holder = str3;
    }

    public static OcrStatus LIZ(OcrStatus ocrStatus, String str, String str2, int i) {
        String str3;
        if ((i & 1) != 0) {
            str = ocrStatus.cardNumber;
        }
        if ((i & 2) != 0) {
            str2 = ocrStatus.date;
        }
        if ((i & 4) != 0) {
            str3 = ocrStatus.holder;
        } else {
            str3 = null;
        }
        ocrStatus.getClass();
        return new OcrStatus(str, str2, str3);
    }
}
