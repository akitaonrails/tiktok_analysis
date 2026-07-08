package com.ss.android.ugc.aweme.vibefeed.clientai.cache;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class VibeIntentScoreCacheItem {

    @C09CT("conversation_id")
    public final String conversationId;

    @C09CT("intent_type")
    public final String intentType;

    @C09CT("model_result")
    public final int modelResult;

    @C09CT("pitaya_trace_id")
    public final String pitayaTraceId;

    @C09CT("score")
    public final double score;

    @C09CT("timestamp")
    public final long timestamp;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VibeIntentScoreCacheItem)) {
            return false;
        }
        VibeIntentScoreCacheItem vibeIntentScoreCacheItem = (VibeIntentScoreCacheItem) obj;
        return Intrinsics.LJFF(this.conversationId, vibeIntentScoreCacheItem.conversationId) && Intrinsics.LJFF(this.intentType, vibeIntentScoreCacheItem.intentType) && Double.compare(this.score, vibeIntentScoreCacheItem.score) == 0 && this.modelResult == vibeIntentScoreCacheItem.modelResult && Intrinsics.LJFF(this.pitayaTraceId, vibeIntentScoreCacheItem.pitayaTraceId) && this.timestamp == vibeIntentScoreCacheItem.timestamp;
    }

    public final int hashCode() {
        return (((((((((this.conversationId.hashCode() * 31) + this.intentType.hashCode()) * 31) + C786410Ut5.X2(this.score)) * 31) + this.modelResult) * 31) + this.pitayaTraceId.hashCode()) * 31) + C786410Ut5.Y2(this.timestamp);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VibeIntentScoreCacheItem(conversationId=");
        sbLIZ.append(this.conversationId);
        sbLIZ.append(", intentType=");
        sbLIZ.append(this.intentType);
        sbLIZ.append(", score=");
        sbLIZ.append(this.score);
        sbLIZ.append(", modelResult=");
        sbLIZ.append(this.modelResult);
        sbLIZ.append(", pitayaTraceId=");
        sbLIZ.append(this.pitayaTraceId);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.timestamp);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VibeIntentScoreCacheItem() {
        this("", "", 0.0d, 0, "", 0L);
    }

    public VibeIntentScoreCacheItem(String str, String str2, double d, int i, String str3, long j) {
        this.conversationId = str;
        this.intentType = str2;
        this.score = d;
        this.modelResult = i;
        this.pitayaTraceId = str3;
        this.timestamp = j;
    }
}
