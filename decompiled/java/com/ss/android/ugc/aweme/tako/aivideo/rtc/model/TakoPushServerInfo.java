package com.ss.android.ugc.aweme.tako.aivideo.rtc.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class TakoPushServerInfo {

    @C09CT("biz")
    public final Biz biz;

    @C09CT("performance")
    public final String performance;

    @C09CT("timestamp")
    public final Timestamp timestamp;

    public static final class Timestamp {

        @C09CT("finish_speaking")
        public final long finishSpeaking;

        @C09CT("start_speaking")
        public final long startSpeaking;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Timestamp)) {
                return false;
            }
            Timestamp timestamp = (Timestamp) obj;
            return this.startSpeaking == timestamp.startSpeaking && this.finishSpeaking == timestamp.finishSpeaking;
        }

        public final int hashCode() {
            return (C786410Ut5.Y2(this.startSpeaking) * 31) + C786410Ut5.Y2(this.finishSpeaking);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Timestamp(startSpeaking=");
            sbLIZ.append(this.startSpeaking);
            sbLIZ.append(", finishSpeaking=");
            sbLIZ.append(this.finishSpeaking);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Timestamp() {
            this(-1L, -1L);
        }

        public Timestamp(long j, long j2) {
            this.startSpeaking = j;
            this.finishSpeaking = j2;
        }
    }

    public TakoPushServerInfo() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoPushServerInfo)) {
            return false;
        }
        TakoPushServerInfo takoPushServerInfo = (TakoPushServerInfo) obj;
        return Intrinsics.LJFF(this.performance, takoPushServerInfo.performance) && Intrinsics.LJFF(this.timestamp, takoPushServerInfo.timestamp) && Intrinsics.LJFF(this.biz, takoPushServerInfo.biz);
    }

    public final int hashCode() {
        String str = this.performance;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Timestamp timestamp = this.timestamp;
        int iHashCode2 = (iHashCode + (timestamp == null ? 0 : timestamp.hashCode())) * 31;
        Biz biz = this.biz;
        return iHashCode2 + (biz != null ? biz.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoPushServerInfo(performance=");
        sbLIZ.append(this.performance);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.timestamp);
        sbLIZ.append(", biz=");
        sbLIZ.append(this.biz);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class Biz {

        @C09CT("search_feed_query")
        public final String searchFeedQuery;

        @C09CT("tool_call_info")
        public final String toolCallInfo;

        @C09CT("user_query")
        public final String userQuery;

        public Biz() {
            this(null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Biz)) {
                return false;
            }
            Biz biz = (Biz) obj;
            return Intrinsics.LJFF(this.userQuery, biz.userQuery) && Intrinsics.LJFF(this.searchFeedQuery, biz.searchFeedQuery) && Intrinsics.LJFF(this.toolCallInfo, biz.toolCallInfo);
        }

        public final int hashCode() {
            String str = this.userQuery;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.searchFeedQuery;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.toolCallInfo;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Biz(userQuery=");
            sbLIZ.append(this.userQuery);
            sbLIZ.append(", searchFeedQuery=");
            sbLIZ.append(this.searchFeedQuery);
            sbLIZ.append(", toolCallInfo=");
            sbLIZ.append(this.toolCallInfo);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Biz(String str, String str2, String str3) {
            this.userQuery = str;
            this.searchFeedQuery = str2;
            this.toolCallInfo = str3;
        }
    }

    public TakoPushServerInfo(String str, Timestamp timestamp, Biz biz) {
        this.performance = str;
        this.timestamp = timestamp;
        this.biz = biz;
    }
}
