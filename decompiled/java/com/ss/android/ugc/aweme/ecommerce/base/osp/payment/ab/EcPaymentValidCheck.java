package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class EcPaymentValidCheck {
    public static final EcPaymentValidCheckModel LIZ = new EcPaymentValidCheckModel(null, null, 3, null);

    public static final EcPaymentValidCheckModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcPaymentValidCheckModel ecPaymentValidCheckModel = LIZ;
        EcPaymentValidCheckModel ecPaymentValidCheckModel2 = (EcPaymentValidCheckModel) settingsManagerLIZLLL.LJIIIIZZ("ec_payment_valid_check", EcPaymentValidCheckModel.class, ecPaymentValidCheckModel);
        return ecPaymentValidCheckModel2 != null ? ecPaymentValidCheckModel2 : ecPaymentValidCheckModel;
    }

    public static final class EcPaymentValidCheckModel {

        @C09CT("enable_opti")
        public final Boolean enableOpti;

        @C09CT("pmid_prefix")
        public final List<String> pmIdPrefix;

        public EcPaymentValidCheckModel() {
            this(null, null, 3, null);
        }

        public EcPaymentValidCheckModel(Boolean bool, List<String> list) {
            this.enableOpti = bool;
            this.pmIdPrefix = list;
        }

        public EcPaymentValidCheckModel(Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? Collections.singletonList("") : list);
        }
    }
}
