package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C01GW;
import X.C09CT;
import X.C123100dR;
import X.C452501pT;
import X.C912203hQ;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.text.u;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoPaymentStatusPollingConfigSettings {
    public static final PollingConfigModel LIZ = new PollingConfigModel(0, 0, false, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(64));

    public static PollingConfigModel LIZIZ() {
        return (PollingConfigModel) LIZIZ.getValue();
    }

    public static C912203hQ LIZ(String str) {
        boolean z;
        PaymentPollingConfig next;
        C912203hQ c912203hQ = new C912203hQ();
        c912203hQ.LIZ = LIZIZ().pollingInterval;
        c912203hQ.LIZIZ = LIZIZ().pollingMaxTimes;
        c912203hQ.LIZJ = LIZIZ().enableParallelPolling;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (LIZIZ().pollingInterval <= 0 || LIZIZ().pollingMaxTimes <= 0) {
                return null;
            }
            return c912203hQ;
        }
        List<PaymentPollingConfig> list = LIZIZ().extra;
        if (list != null) {
            Iterator<PaymentPollingConfig> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    PaymentPollingConfig paymentPollingConfig = next;
                    if (C123100dR.LIZ(paymentPollingConfig.key) && u.LJJIIJZLJL(str, paymentPollingConfig.key, false)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            PaymentPollingConfig paymentPollingConfig2 = next;
            if (paymentPollingConfig2 != null) {
                C912203hQ c912203hQ2 = new C912203hQ();
                c912203hQ2.LIZ = paymentPollingConfig2.pollingInterval;
                c912203hQ2.LIZIZ = paymentPollingConfig2.pollingMaxTimes;
                c912203hQ2.LIZJ = paymentPollingConfig2.enableParallelPolling;
                return c912203hQ2;
            }
        }
        if (LIZIZ().pollingInterval <= 0 || LIZIZ().pollingMaxTimes <= 0) {
            return null;
        }
        return c912203hQ;
    }

    public static final class PaymentPollingConfig {

        @C09CT("enable_parallel_polling")
        public final boolean enableParallelPolling;

        @C09CT("key")
        public final String key;

        @C09CT("polling_interval")
        public final int pollingInterval;

        @C09CT("polling_max_times")
        public final int pollingMaxTimes;

        public PaymentPollingConfig() {
            this(0, 0, "", false);
        }

        public PaymentPollingConfig(int i, int i2, String str, boolean z) {
            this.pollingInterval = i;
            this.pollingMaxTimes = i2;
            this.key = str;
            this.enableParallelPolling = z;
        }
    }

    public static final class PollingConfigModel {

        @C09CT("enable_parallel_polling")
        public final boolean enableParallelPolling;

        @C09CT("extra")
        public final List<PaymentPollingConfig> extra;

        @C09CT("polling_interval")
        public final int pollingInterval;

        @C09CT("polling_max_times")
        public final int pollingMaxTimes;

        public PollingConfigModel() {
            this(0, 0, false, null);
        }

        public PollingConfigModel(int i, int i2, boolean z, List<PaymentPollingConfig> list) {
            this.pollingInterval = i;
            this.pollingMaxTimes = i2;
            this.enableParallelPolling = z;
            this.extra = list;
        }
    }
}
