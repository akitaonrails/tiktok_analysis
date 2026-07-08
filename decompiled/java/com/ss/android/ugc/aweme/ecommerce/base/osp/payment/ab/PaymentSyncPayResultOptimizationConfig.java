package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C01GW;
import X.C09CT;
import X.C123100dR;
import X.C452501pT;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentSyncPayResultOptimizationConfig {
    public static final PaymentSyncPayResultOptimizationConfigModel LIZ = new PaymentSyncPayResultOptimizationConfigModel(false, null, 3, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(61));

    public static boolean LIZ(String str) {
        if (C123100dR.LIZ(str)) {
            C01GW c01gw = LIZIZ;
            if (((PaymentSyncPayResultOptimizationConfigModel) c01gw.getValue()).enableSwitch && !((PaymentSyncPayResultOptimizationConfigModel) c01gw.getValue()).disablePMList.contains(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final class PaymentSyncPayResultOptimizationConfigModel {

        @C09CT("disable_pm_list")
        public final List<String> disablePMList;

        @C09CT("enable_switch")
        public final boolean enableSwitch;

        public PaymentSyncPayResultOptimizationConfigModel() {
            this(false, null, 3, null);
        }

        public PaymentSyncPayResultOptimizationConfigModel(boolean z, List<String> list) {
            this.enableSwitch = z;
            this.disablePMList = list;
        }

        public PaymentSyncPayResultOptimizationConfigModel(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? Collections.singletonList("") : list);
        }
    }
}
