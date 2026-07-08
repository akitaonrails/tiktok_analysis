package webcast.api.pgc_sub;

import X.C09CT;
import com.bytedance.android.pgcsdk.subscribe.model.PGCSubsTransitionPeriodInfo;

/* JADX INFO: loaded from: classes29.dex */
public final class PGCPostPinActionResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("transition_period_info")
        public PGCSubsTransitionPeriodInfo transitionPeriodInfo;
    }
}
