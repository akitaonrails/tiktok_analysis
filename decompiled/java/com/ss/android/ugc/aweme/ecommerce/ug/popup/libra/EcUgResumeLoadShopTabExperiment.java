package com.ss.android.ugc.aweme.ecommerce.ug.popup.libra;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class EcUgResumeLoadShopTabExperiment {
    public static final EcUgResumeLoadShopTabModel LIZ = new EcUgResumeLoadShopTabModel(0L, 0L, Boolean.FALSE);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(181));

    public static final class EcUgResumeLoadShopTabModel {

        @C09CT("expand_resume_load")
        public final Long expandResumeLoad;

        @C09CT("opt_web_client_lister")
        public final Boolean optWebClientLister;

        @C09CT("timeout_resume_load")
        public final Long timeoutResumeLoad;

        public EcUgResumeLoadShopTabModel() {
            this(0L, 0L, Boolean.FALSE);
        }

        public EcUgResumeLoadShopTabModel(Long l, Long l2, Boolean bool) {
            this.timeoutResumeLoad = l;
            this.expandResumeLoad = l2;
            this.optWebClientLister = bool;
        }
    }
}
