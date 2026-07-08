package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS185S0000000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentSdkAsyncInitSettings {
    public static final PaymentSdkInitConfig LIZ = new PaymentSdkInitConfig(false, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(60));

    public static final class PaymentSdkInitConfig {

        @C09CT("delay_time")
        public final long delayTime;

        @C09CT("enable")
        public final boolean enable;

        public PaymentSdkInitConfig() {
            this(false, 0L);
        }

        public PaymentSdkInitConfig(boolean z, long j) {
            this.enable = z;
            this.delayTime = j;
        }
    }
}
