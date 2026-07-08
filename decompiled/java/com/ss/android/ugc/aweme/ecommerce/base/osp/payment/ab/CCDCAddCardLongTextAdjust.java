package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CCDCAddCardLongTextAdjust {
    public static final CCDCAddCardLongTextConfig LIZ;

    public static final class CCDCAddCardLongTextConfig {

        @C09CT("enable_long_text_adjust")
        public final Boolean enableLongTextAdjust;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CCDCAddCardLongTextConfig) && Intrinsics.LJFF(this.enableLongTextAdjust, ((CCDCAddCardLongTextConfig) obj).enableLongTextAdjust);
        }

        public final int hashCode() {
            Boolean bool = this.enableLongTextAdjust;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CCDCAddCardLongTextConfig(enableLongTextAdjust=");
            sbLIZ.append(this.enableLongTextAdjust);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public CCDCAddCardLongTextConfig() {
            this(Boolean.FALSE);
        }

        public CCDCAddCardLongTextConfig(Boolean bool) {
            this.enableLongTextAdjust = bool;
        }
    }

    static {
        new CCDCAddCardLongTextAdjust();
        LIZ = new CCDCAddCardLongTextConfig(Boolean.FALSE);
    }

    public static final boolean LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        CCDCAddCardLongTextConfig cCDCAddCardLongTextConfig = LIZ;
        CCDCAddCardLongTextConfig cCDCAddCardLongTextConfig2 = (CCDCAddCardLongTextConfig) settingsManagerLIZLLL.LJIIIIZZ("ccdc_add_card_long_text_adjust", CCDCAddCardLongTextConfig.class, cCDCAddCardLongTextConfig);
        if (cCDCAddCardLongTextConfig2 != null) {
            cCDCAddCardLongTextConfig = cCDCAddCardLongTextConfig2;
        }
        return Intrinsics.LJFF(cCDCAddCardLongTextConfig.enableLongTextAdjust, Boolean.TRUE);
    }
}
