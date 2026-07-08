package com.ss.android.ugc.aweme.pipo.settings;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoEcomContainerPaymentSubTitleConfig {
    public static final PipoEcomContainerPaymentConfigModel LIZ = new PipoEcomContainerPaymentConfigModel(null, 1, null);

    public static final class PipoEcomContainerPaymentConfigModel {

        @C09CT("url_black_list")
        public final List<String> urlBlackList;

        public PipoEcomContainerPaymentConfigModel() {
            this(null, 1, null);
        }

        public PipoEcomContainerPaymentConfigModel(List<String> list) {
            this.urlBlackList = list;
        }

        public PipoEcomContainerPaymentConfigModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
