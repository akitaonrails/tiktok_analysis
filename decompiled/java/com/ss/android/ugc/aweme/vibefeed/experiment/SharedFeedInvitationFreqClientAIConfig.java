package com.ss.android.ugc.aweme.vibefeed.experiment;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SharedFeedInvitationFreqClientAIConfig {

    @C09CT("buckets")
    public final List<Map<String, Object>> buckets;

    @C09CT("client_ai_enabled")
    public final boolean clientAIEnabled;

    @C09CT("no_score_bucket")
    public final Map<String, Object> noScoreBucket;

    public SharedFeedInvitationFreqClientAIConfig() {
        this(false, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedFeedInvitationFreqClientAIConfig)) {
            return false;
        }
        SharedFeedInvitationFreqClientAIConfig sharedFeedInvitationFreqClientAIConfig = (SharedFeedInvitationFreqClientAIConfig) obj;
        return this.clientAIEnabled == sharedFeedInvitationFreqClientAIConfig.clientAIEnabled && Intrinsics.LJFF(this.buckets, sharedFeedInvitationFreqClientAIConfig.buckets) && Intrinsics.LJFF(this.noScoreBucket, sharedFeedInvitationFreqClientAIConfig.noScoreBucket);
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.clientAIEnabled) * 31) + this.buckets.hashCode()) * 31) + this.noScoreBucket.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SharedFeedInvitationFreqClientAIConfig(clientAIEnabled=");
        sbLIZ.append(this.clientAIEnabled);
        sbLIZ.append(", buckets=");
        sbLIZ.append(this.buckets);
        sbLIZ.append(", noScoreBucket=");
        sbLIZ.append(this.noScoreBucket);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SharedFeedInvitationFreqClientAIConfig(boolean z, List<? extends Map<String, ? extends Object>> list, Map<String, ? extends Object> map) {
        this.clientAIEnabled = z;
        this.buckets = list;
        this.noScoreBucket = map;
    }

    public SharedFeedInvitationFreqClientAIConfig(boolean z, List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C2097608Jq.LJ() : map);
    }
}
