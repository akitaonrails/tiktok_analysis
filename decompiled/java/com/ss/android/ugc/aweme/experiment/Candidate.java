package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class Candidate {

    @C09CT("entrance_key")
    public final String entranceKey;

    @C09CT("filter_rules")
    public final Map<String, Boolean> filterRules;

    @C09CT("item_key")
    public final String itemKey;

    @C09CT("request_slot_lock")
    public final Integer requestSlotLock;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Candidate)) {
            return false;
        }
        Candidate candidate = (Candidate) obj;
        return Intrinsics.LJFF(this.entranceKey, candidate.entranceKey) && Intrinsics.LJFF(this.requestSlotLock, candidate.requestSlotLock) && Intrinsics.LJFF(this.filterRules, candidate.filterRules) && Intrinsics.LJFF(this.itemKey, candidate.itemKey);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Candidate(entranceKey=");
        sbLIZ.append(this.entranceKey);
        sbLIZ.append(", requestSlotLock=");
        sbLIZ.append(this.requestSlotLock);
        sbLIZ.append(", filterRules=");
        sbLIZ.append(this.filterRules);
        sbLIZ.append(", itemKey=");
        sbLIZ.append(this.itemKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static Candidate LIZ(Candidate candidate, String str) {
        return new Candidate(str, candidate.requestSlotLock, candidate.filterRules, candidate.itemKey);
    }

    public Candidate(String str, Integer num, Map<String, Boolean> map, String str2) {
        this.entranceKey = str;
        this.requestSlotLock = num;
        this.filterRules = map;
        this.itemKey = str2;
    }
}
