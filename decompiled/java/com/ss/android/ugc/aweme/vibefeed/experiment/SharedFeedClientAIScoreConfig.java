package com.ss.android.ugc.aweme.vibefeed.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes4.dex */
public final class SharedFeedClientAIScoreConfig {

    @C09CT("enable_consume_intent_score")
    public final boolean enableConsumeIntentScore;

    @C09CT("enable_open_intent_score")
    public final boolean enableOpenIntentScore;

    public SharedFeedClientAIScoreConfig() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedFeedClientAIScoreConfig)) {
            return false;
        }
        SharedFeedClientAIScoreConfig sharedFeedClientAIScoreConfig = (SharedFeedClientAIScoreConfig) obj;
        return this.enableOpenIntentScore == sharedFeedClientAIScoreConfig.enableOpenIntentScore && this.enableConsumeIntentScore == sharedFeedClientAIScoreConfig.enableConsumeIntentScore;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.enableOpenIntentScore) * 31) + C786410Ut5.Z2(this.enableConsumeIntentScore);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SharedFeedClientAIScoreConfig(enableOpenIntentScore=");
        sbLIZ.append(this.enableOpenIntentScore);
        sbLIZ.append(", enableConsumeIntentScore=");
        sbLIZ.append(this.enableConsumeIntentScore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SharedFeedClientAIScoreConfig(boolean z, boolean z2) {
        this.enableOpenIntentScore = z;
        this.enableConsumeIntentScore = z2;
    }
}
