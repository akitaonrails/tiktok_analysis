package com.bytedance.android.pgc.wallet.base;

import X.C09CT;
import com.bytedance.android.pgcsdk.subscribe.model.PGCSubsTransitionPeriodInfo;

/* JADX INFO: loaded from: classes29.dex */
public final class PGCPolingContractStatusResponse {

    @C09CT("data")
    public PGCPolingContractStatusResult data;

    @C09CT("extra")
    public ResponseExtra extra;

    @C09CT("transition_period_info")
    public PGCSubsTransitionPeriodInfo transitionPeriodInfo;

    public static final class ResponseExtra {

        @C09CT("now")
        public long now;
    }
}
