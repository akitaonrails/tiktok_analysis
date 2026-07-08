package com.ss.android.ugc.aweme.inbox.ab;

import X.C09CT;
import X.C2097608Jq;

/* JADX INFO: loaded from: classes25.dex */
public final class InboxSkylightEcLiveEventFrequencyConfig {

    @C09CT("adjust_priority_fc")
    public final LiveEventAdjustPriorityFc adjustPriorityFc;

    @C09CT("exit_fc")
    public final LiveEventExitFc exitFc;

    public InboxSkylightEcLiveEventFrequencyConfig() {
        this(new LiveEventExitFc(true, 7L), new LiveEventAdjustPriorityFc(true, 1, C2097608Jq.LJ(), 3L));
    }

    public InboxSkylightEcLiveEventFrequencyConfig(LiveEventExitFc liveEventExitFc, LiveEventAdjustPriorityFc liveEventAdjustPriorityFc) {
        this.exitFc = liveEventExitFc;
        this.adjustPriorityFc = liveEventAdjustPriorityFc;
    }
}
