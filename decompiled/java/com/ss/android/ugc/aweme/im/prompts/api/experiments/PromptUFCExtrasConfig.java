package com.ss.android.ugc.aweme.im.prompts.api.experiments;

import X.C09CT;
import X.C0I0B;
import X.C894660Z7w;

/* JADX INFO: loaded from: classes3.dex */
public final class PromptUFCExtrasConfig {

    @C09CT("buffer_duration")
    public final long bufferDuration;

    @C09CT("enable_logs")
    public final boolean enableLogs;

    @C09CT("max_wait_duration")
    public final long maxWaitDuration;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PromptUFCExtrasConfig() {
        this(2200L, 400L, C894660Z7w.LIZJ());
        C0I0B.LJFF.LIZJ();
    }

    public PromptUFCExtrasConfig(long j, long j2, boolean z) {
        this.maxWaitDuration = j;
        this.bufferDuration = j2;
        this.enableLogs = z;
    }
}
