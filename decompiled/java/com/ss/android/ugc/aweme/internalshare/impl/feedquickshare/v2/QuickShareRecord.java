package com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.v2;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class QuickShareRecord {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("candidates")
    public final List<Candidate> candidates;

    @C09CT("item_id")
    public final String itemID;

    @C09CT("share_rate")
    public final Double shareRate;

    @C09CT("storage_timestamp")
    public final Long storageTimestamp;

    public QuickShareRecord() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickShareRecord)) {
            return false;
        }
        QuickShareRecord quickShareRecord = (QuickShareRecord) obj;
        return Intrinsics.LJFF(this.itemID, quickShareRecord.itemID) && Intrinsics.LJFF(this.shareRate, quickShareRecord.shareRate) && Intrinsics.LJFF(this.candidates, quickShareRecord.candidates) && Intrinsics.LJFF(this.storageTimestamp, quickShareRecord.storageTimestamp);
    }

    public final int hashCode() {
        String str = this.itemID;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.shareRate;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        List<Candidate> list = this.candidates;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.storageTimestamp;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickShareRecord(itemID=");
        sbLIZ.append(this.itemID);
        sbLIZ.append(", shareRate=");
        sbLIZ.append(this.shareRate);
        sbLIZ.append(", candidates=");
        sbLIZ.append(this.candidates);
        sbLIZ.append(", storageTimestamp=");
        sbLIZ.append(this.storageTimestamp);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class Candidate {

        @C09CT("candidate_id")
        public final String candidateId;

        @C09CT("rate_score")
        public final Double rateScore;

        @C09CT("type")
        public final Long type;

        public Candidate() {
            this(null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Candidate)) {
                return false;
            }
            Candidate candidate = (Candidate) obj;
            return Intrinsics.LJFF(this.candidateId, candidate.candidateId) && Intrinsics.LJFF(this.type, candidate.type) && Intrinsics.LJFF(this.rateScore, candidate.rateScore);
        }

        public final int hashCode() {
            String str = this.candidateId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l = this.type;
            int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
            Double d = this.rateScore;
            return iHashCode2 + (d != null ? d.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Candidate(candidateId=");
            sbLIZ.append(this.candidateId);
            sbLIZ.append(", type=");
            sbLIZ.append(this.type);
            sbLIZ.append(", rateScore=");
            sbLIZ.append(this.rateScore);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Candidate(String str, Long l, Double d) {
            this.candidateId = str;
            this.type = l;
            this.rateScore = d;
        }
    }

    public QuickShareRecord(String str, Double d, List<Candidate> list, Long l) {
        this.itemID = str;
        this.shareRate = d;
        this.candidates = list;
        this.storageTimestamp = l;
    }
}
