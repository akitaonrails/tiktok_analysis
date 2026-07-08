package com.ss.android.ugc.aweme.comment.poll.repository;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class DeletePollRequest {

    @C09CT("item_id")
    public final String itemId;

    @C09CT("poll_id")
    public final String pollId;

    public DeletePollRequest() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeletePollRequest)) {
            return false;
        }
        DeletePollRequest deletePollRequest = (DeletePollRequest) obj;
        return Intrinsics.LJFF(this.pollId, deletePollRequest.pollId) && Intrinsics.LJFF(this.itemId, deletePollRequest.itemId);
    }

    public final int hashCode() {
        String str = this.pollId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.itemId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeletePollRequest(pollId=");
        sbLIZ.append(this.pollId);
        sbLIZ.append(", itemId=");
        sbLIZ.append(this.itemId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DeletePollRequest(String str, String str2) {
        this.pollId = str;
        this.itemId = str2;
    }
}
