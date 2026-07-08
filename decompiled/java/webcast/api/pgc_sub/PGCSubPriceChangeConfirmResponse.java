package webcast.api.pgc_sub;

import X.C09CT;
import com.bytedance.android.pgcsdk.subscribe.model.PGCSubsTransitionPeriodInfo;

/* JADX INFO: loaded from: classes29.dex */
public final class PGCSubPriceChangeConfirmResponse {

    @C09CT("data")
    public SubPriceChangeConfirmData data;

    public static final class SubPriceChangeConfirmData {

        @C09CT("iap_id")
        public String iapId = "";

        @C09CT("transition_period_info")
        public PGCSubsTransitionPeriodInfo transitionPeriodInfo;
    }
}
