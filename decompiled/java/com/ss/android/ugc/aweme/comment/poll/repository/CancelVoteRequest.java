package com.ss.android.ugc.aweme.comment.poll.repository;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CancelVoteRequest {

    @C09CT("item_id")
    public final String itemId;

    @C09CT("option_index")
    public final Integer optionIndex;

    @C09CT("poll_id")
    public final String pollId;

    public CancelVoteRequest() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelVoteRequest)) {
            return false;
        }
        CancelVoteRequest cancelVoteRequest = (CancelVoteRequest) obj;
        return Intrinsics.LJFF(this.itemId, cancelVoteRequest.itemId) && Intrinsics.LJFF(this.pollId, cancelVoteRequest.pollId) && Intrinsics.LJFF(this.optionIndex, cancelVoteRequest.optionIndex);
    }

    public final int hashCode() {
        String str = this.itemId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pollId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.optionIndex;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CancelVoteRequest(itemId=");
        sbLIZ.append(this.itemId);
        sbLIZ.append(", pollId=");
        sbLIZ.append(this.pollId);
        sbLIZ.append(", optionIndex=");
        sbLIZ.append(this.optionIndex);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CancelVoteRequest(String str, String str2, Integer num) {
        this.itemId = str;
        this.pollId = str2;
        this.optionIndex = num;
    }
}
