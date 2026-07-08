package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS185S0000000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoPaymentFailedPopupMessage {
    public static final PopupMessage LIZ = new PopupMessage(null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(63));

    public static PopupMessage LIZ() {
        return (PopupMessage) LIZIZ.getValue();
    }

    public static final class PopupMessage {

        @C09CT("popup_action")
        public String action;

        @C09CT("popup_title")
        public String title;

        public PopupMessage() {
            this(null, null);
        }

        public PopupMessage(String str, String str2) {
            this.title = str;
            this.action = str2;
        }
    }
}
