package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomPayAuthNonceRefreshSettings {
    public static final PayAuthNonceRefreshConfig LIZ = new PayAuthNonceRefreshConfig(false, 0, null, 7, null);

    public static final class PayAuthNonceRefreshConfig {

        @C09CT("allow_pm_ids")
        public final List<String> allowPaymentMethodIds;

        @C09CT("enable_switch")
        public final boolean enable;

        @C09CT("refresh_interval_seconds")
        public final int refreshIntervalSeconds;

        public PayAuthNonceRefreshConfig() {
            this(false, 0, null, 7, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PayAuthNonceRefreshConfig)) {
                return false;
            }
            PayAuthNonceRefreshConfig payAuthNonceRefreshConfig = (PayAuthNonceRefreshConfig) obj;
            return this.enable == payAuthNonceRefreshConfig.enable && this.refreshIntervalSeconds == payAuthNonceRefreshConfig.refreshIntervalSeconds && Intrinsics.LJFF(this.allowPaymentMethodIds, payAuthNonceRefreshConfig.allowPaymentMethodIds);
        }

        public final int hashCode() {
            return (((C786410Ut5.Z2(this.enable) * 31) + this.refreshIntervalSeconds) * 31) + this.allowPaymentMethodIds.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PayAuthNonceRefreshConfig(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", refreshIntervalSeconds=");
            sbLIZ.append(this.refreshIntervalSeconds);
            sbLIZ.append(", allowPaymentMethodIds=");
            sbLIZ.append(this.allowPaymentMethodIds);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PayAuthNonceRefreshConfig(boolean z, int i, List<String> list) {
            this.enable = z;
            this.refreshIntervalSeconds = i;
            this.allowPaymentMethodIds = list;
        }

        public PayAuthNonceRefreshConfig(boolean z, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL : i, (i2 & 4) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
