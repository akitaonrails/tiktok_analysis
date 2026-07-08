package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PhoneInputDefaultSaveSettings {
    public static final PhoneInputDefaultSaveConfig LIZ = new PhoneInputDefaultSaveConfig(false, null, 3, null);

    public static final class PhoneInputDefaultSaveConfig {

        @C09CT("allow_pm_ids")
        public final List<String> allowPaymentMethodIds;

        @C09CT("enable_switch")
        public final boolean enable;

        public PhoneInputDefaultSaveConfig() {
            this(false, null, 3, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PhoneInputDefaultSaveConfig)) {
                return false;
            }
            PhoneInputDefaultSaveConfig phoneInputDefaultSaveConfig = (PhoneInputDefaultSaveConfig) obj;
            return this.enable == phoneInputDefaultSaveConfig.enable && Intrinsics.LJFF(this.allowPaymentMethodIds, phoneInputDefaultSaveConfig.allowPaymentMethodIds);
        }

        public final int hashCode() {
            return (C786410Ut5.Z2(this.enable) * 31) + this.allowPaymentMethodIds.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PhoneInputDefaultSaveConfig(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", allowPaymentMethodIds=");
            sbLIZ.append(this.allowPaymentMethodIds);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PhoneInputDefaultSaveConfig(boolean z, List<String> list) {
            this.enable = z;
            this.allowPaymentMethodIds = list;
        }

        public PhoneInputDefaultSaveConfig(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
