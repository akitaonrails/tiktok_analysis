package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C01GW;
import X.C09CT;
import X.C13LP;
import X.C452501pT;
import X.EnumC036100At;
import X.EnumC988903tn;
import java.util.List;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ECLatamOspFlowOpt {
    public static final ECLatamOspFlowData LIZ = new ECLatamOspFlowData(Boolean.FALSE, null, null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(129));
    public static boolean LIZJ;

    public static boolean LIZ() {
        return LIZJ && Intrinsics.LJFF(LIZJ().disableAddressHintDialog, Boolean.TRUE);
    }

    public static ECLatamOspFlowData LIZJ() {
        return (ECLatamOspFlowData) LIZIZ.getValue();
    }

    public static boolean LJ() {
        if (!LIZJ) {
            return false;
        }
        Integer num = LIZJ().autoOpenAddressPage;
        int value = EnumC988903tn.FULL_PAGE.getValue();
        if (num != null && num.intValue() == value) {
            return true;
        }
        Integer num2 = LIZJ().autoOpenAddressPage;
        return num2 != null && num2.intValue() == EnumC988903tn.SEVEN_SPLIT_PAGE.getValue();
    }

    public static boolean LJFF() {
        if (!LIZJ) {
            return false;
        }
        Integer num = LIZJ().autoOpenAddressPage;
        return num != null && num.intValue() == EnumC988903tn.SEVEN_SPLIT_PAGE.getValue();
    }

    public static boolean LIZIZ() {
        Integer num = LIZJ().entranceStyle;
        return num != null && num.intValue() == EnumC036100At.RED_TEXT_LINK.getValue();
    }

    public static void LIZLLL(String str) {
        Object objLJJJLL;
        List<String> list;
        boolean z = false;
        if (str.length() != 0) {
            List<String> list2 = LIZJ().allowList;
            if (list2 != null) {
                objLJJJLL = C13LP.LJJJLL(list2);
            } else {
                objLJJJLL = null;
            }
            if (Intrinsics.LJFF(objLJJJLL, "all") || ((list = LIZJ().allowList) != null && list.contains(str))) {
                z = true;
            }
        }
        LIZJ = z;
    }

    public static final class ECLatamOspFlowData {

        @C09CT("allow_source_page_type_list")
        public final List<String> allowList;

        @C09CT("auto_open_address_edit_page_style")
        public final Integer autoOpenAddressPage;

        @C09CT("disable_address_hint_dialog")
        public final Boolean disableAddressHintDialog;

        @C09CT("add_address_or_identity_style")
        public final Integer entranceStyle;

        public ECLatamOspFlowData() {
            this(Boolean.FALSE, null, null, null);
        }

        public ECLatamOspFlowData(Boolean bool, Integer num, Integer num2, List<String> list) {
            this.disableAddressHintDialog = bool;
            this.autoOpenAddressPage = num;
            this.entranceStyle = num2;
            this.allowList = list;
        }
    }
}
