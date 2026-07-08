package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.text.u;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoTtsPaymentResultNativeQuerySettings {
    public static final PipoTtsPaymentResultNativeQueryModel LIZ = new PipoTtsPaymentResultNativeQueryModel(false, null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(65));

    public static boolean LIZ(String str) {
        C01GW c01gw = LIZIZ;
        if (((PipoTtsPaymentResultNativeQueryModel) c01gw.getValue()).activate && str != null && str.length() != 0) {
            List<String> list = ((PipoTtsPaymentResultNativeQueryModel) c01gw.getValue()).piBlackList;
            if (list != null && !list.isEmpty() && (!(list instanceof Collection) || !list.isEmpty())) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (u.LJJIIJZLJL(str, it2.next(), false)) {
                        return false;
                    }
                }
            }
            List<String> list2 = ((PipoTtsPaymentResultNativeQueryModel) LIZIZ.getValue()).enablePiList;
            if (list2 != null && !list2.isEmpty() && (!(list2 instanceof Collection) || !list2.isEmpty())) {
                Iterator<String> it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (u.LJJIIJZLJL(str, it3.next(), false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final class PipoTtsPaymentResultNativeQueryModel {

        @C09CT("activate")
        public final boolean activate;

        @C09CT("enable_pi_list")
        public final List<String> enablePiList;

        @C09CT("pi_black_list")
        public final List<String> piBlackList;

        public PipoTtsPaymentResultNativeQueryModel() {
            this(false, null, null);
        }

        public PipoTtsPaymentResultNativeQueryModel(boolean z, List<String> list, List<String> list2) {
            this.activate = z;
            this.enablePiList = list;
            this.piBlackList = list2;
        }
    }
}
