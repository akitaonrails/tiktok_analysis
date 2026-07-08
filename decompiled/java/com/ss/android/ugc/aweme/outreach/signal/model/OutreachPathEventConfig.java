package com.ss.android.ugc.aweme.outreach.signal.model;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class OutreachPathEventConfig {

    @C09CT("outreach_callback")
    public final boolean outreachCallback;

    @C09CT("outreach_fetch_request")
    public final boolean outreachFetchRequest;

    @C09CT("outreach_fetch_response")
    public final boolean outreachFetchResponse;

    @C09CT("outreach_psp_result")
    public final boolean outreachPSPResult;

    @C09CT("outreach_timing_coming")
    public final boolean outreachTimingComing;

    @C09CT("outreach_trigger_psp_actively")
    public final boolean outreachTriggerPSPActively;

    public OutreachPathEventConfig() {
        this(false, false, false, false, false, false);
    }

    public OutreachPathEventConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.outreachPSPResult = z;
        this.outreachTriggerPSPActively = z2;
        this.outreachTimingComing = z3;
        this.outreachFetchRequest = z4;
        this.outreachFetchResponse = z5;
        this.outreachCallback = z6;
    }
}
