package com.ss.android.ugc.aweme.im.contacts.impl.serviceimpl;

import X.C1489350orN;
import X.C786410Ut5;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.contacts.api.util.ContactLocaleUtilBase;
import java.util.Locale;

/* JADX INFO: loaded from: classes24.dex */
public final class ContactLocaleUtilBase1 implements ContactLocaleUtilBase {
    public final boolean LIZ;

    public ContactLocaleUtilBase1() {
        this.LIZ = TextUtils.equals(C786410Ut5.t2(Locale.getDefault()), C786410Ut5.t2(Locale.CHINESE)) || TextUtils.equals(C786410Ut5.t2(Locale.getDefault()), C786410Ut5.t2(Locale.ENGLISH));
    }

    @Override // com.ss.android.ugc.aweme.im.contacts.api.util.ContactLocaleUtilBase
    public final String LIZ(String str) {
        int iCharAt;
        if (TextUtils.isEmpty(str)) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        do {
            if (i2 < str.length()) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    iCharAt = str.charAt(i2) - 'A';
                } else if (Character.isLowerCase(cCharAt)) {
                    iCharAt = (str.charAt(i2) - 'a') + 26;
                    if (i2 == 0) {
                        iCharAt -= 26;
                    }
                } else if (Character.isDigit(cCharAt)) {
                    iCharAt = (str.charAt(i2) - '0') + 52;
                } else {
                    if (C1489350orN.LJFF(cCharAt)) {
                        iCharAt = 62;
                    } else {
                        iCharAt = 63;
                    }
                    sb.append(String.valueOf(iCharAt));
                    i++;
                    i2++;
                }
                if (iCharAt >= 10) {
                    if (iCharAt == 64) {
                        i2++;
                    }
                }
                sb.append(String.valueOf(iCharAt));
                i++;
                i2++;
            } else {
                iCharAt = 0;
            }
            sb.append(CardStruct.IStatusCode.DEFAULT);
            sb.append(String.valueOf(iCharAt));
            i++;
            i2++;
        } while (i < 12);
        return sb.toString();
    }

    @Override // com.ss.android.ugc.aweme.im.contacts.api.util.ContactLocaleUtilBase
    public final String LIZIZ(String str) {
        return C1489350orN.LIZIZ(str, this.LIZ);
    }
}
