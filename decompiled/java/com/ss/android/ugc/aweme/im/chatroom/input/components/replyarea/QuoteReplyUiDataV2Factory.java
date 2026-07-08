package com.ss.android.ugc.aweme.im.chatroom.input.components.replyarea;

import X.C0I0B;
import X.C0I5A;
import X.C0I5B;
import X.C0I83;
import X.C0I84;
import X.C0I88;
import X.C0I8A;
import X.C0I8C;
import X.C0I8J;
import X.C0I8M;
import X.C0I8N;
import X.C0I8R;
import X.C0I8V;
import X.C1400340mXo;
import X.C1954807lC;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C460940I5s;
import X.C814420VxA;
import X.C892130YzD;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.common.service.IQuoteReplyUiDataV2Factory;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class QuoteReplyUiDataV2Factory implements IQuoteReplyUiDataV2Factory {
    public static String LIZLLL(IMUser iMUser, String str, String str2, String str3) {
        boolean z;
        if (iMUser != null && iMUser.getDisplayName() != null) {
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                if (!((C1400340mXo) C0I0B.LJFF.LIZ()).LIZJ(iMUser.getUid())) {
                    if (str3 == null) {
                        str3 = "";
                    }
                    str2 = C892130YzD.LIZ(iMUser, str3);
                }
                sbLIZ.append(str2);
                sbLIZ.append(':');
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            if (!((C1400340mXo) C0I0B.LJFF.LIZ()).LIZJ(iMUser.getUid())) {
                if (str3 == null) {
                    str3 = "";
                }
                str2 = C892130YzD.LIZ(iMUser, str3);
            }
            sbLIZ2.append(str2);
            sbLIZ2.append(": ");
            sbLIZ2.append(str);
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.im.common.service.IQuoteReplyUiDataV2Factory
    public final C0I8N LIZ(String str, String str2, Function0<Unit> function0, IMUser iMUser, String str3) {
        C0I8R c0i8r = new C0I8R(str);
        String strLIZLLL = LIZLLL(iMUser, str, str3, str2);
        c0i8r.LIZIZ = strLIZLLL;
        return new C0I8N(new C0I8J(str, c0i8r.LIZ, strLIZLLL), function0);
    }

    @Override // com.ss.android.ugc.aweme.im.common.service.IQuoteReplyUiDataV2Factory
    public final C0I8N LIZJ(String str, String str2, AwS407S0200000_6 awS407S0200000_6, IMUser iMUser, String str3) {
        C0I8M c0i8m = new C0I8M(str);
        C0I8R c0i8r = new C0I8R("");
        c0i8r.LIZ = c0i8m;
        String strLIZLLL = LIZLLL(iMUser, "", str3, str2);
        c0i8r.LIZIZ = strLIZLLL;
        return new C0I8N(new C0I8J("", c0i8r.LIZ, strLIZLLL), awS407S0200000_6);
    }

    @Override // com.ss.android.ugc.aweme.im.common.service.IQuoteReplyUiDataV2Factory
    public final C0I8N LIZIZ(String str, String str2, final UrlModel urlModel, C0I8V c0i8v, C0I8A c0i8a, C0I5A c0i5a, C0I88 c0i88, C0I8C c0i8c, Function0<Unit> function0, IMUser iMUser, String str3) {
        int iLIZIZ;
        int iLIZIZ2;
        if (c0i5a instanceof C0I5B) {
            C0I5B c0i5b = (C0I5B) c0i5a;
            int i = c0i5b.LIZ;
            int i2 = c0i5b.LIZIZ;
            if (i > 0 && i2 > 0) {
                if (i > i2) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
                    iLIZIZ2 = (int) ((C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42)) / i) * i2);
                } else {
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
                    iLIZIZ = (int) ((C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42)) / i2) * i);
                }
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
            }
        } else if (Intrinsics.LJFF(c0i5a, C460940I5s.LIZ)) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
        } else if (Intrinsics.LJFF(c0i5a, C0I83.LIZ)) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
        } else {
            throw new C1954807lC();
        }
        Pair pair = new Pair(Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ2));
        new Object(urlModel) { // from class: X.0I8T
            {
                new C0I8H(null);
            }
        };
        C0I84 c0i84 = new C0I84(urlModel, c0i8v, c0i8a, c0i5a, c0i88, c0i8c, pair);
        C0I8R c0i8r = new C0I8R(str);
        c0i8r.LIZ = c0i84;
        String strLIZLLL = LIZLLL(iMUser, str, str3, str2);
        c0i8r.LIZIZ = strLIZLLL;
        return new C0I8N(new C0I8J(str, c0i8r.LIZ, strLIZLLL), function0);
    }
}
