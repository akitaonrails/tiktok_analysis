package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class UserVoteInfo implements Serializable {

    @C09CT("poll_id")
    public final Long pollId;

    @C09CT("vote_option")
    public final Integer voteOption;

    @C09CT("vote_text")
    public final String voteText;

    public UserVoteInfo() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserVoteInfo)) {
            return false;
        }
        UserVoteInfo userVoteInfo = (UserVoteInfo) obj;
        return Intrinsics.LJFF(this.pollId, userVoteInfo.pollId) && Intrinsics.LJFF(this.voteOption, userVoteInfo.voteOption) && Intrinsics.LJFF(this.voteText, userVoteInfo.voteText);
    }

    public int hashCode() {
        Long l = this.pollId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.voteOption;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.voteText;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserVoteInfo(pollId=");
        sbLIZ.append(this.pollId);
        sbLIZ.append(", voteOption=");
        sbLIZ.append(this.voteOption);
        sbLIZ.append(", voteText=");
        sbLIZ.append(this.voteText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UserVoteInfo(Long l, Integer num, String str) {
        this.pollId = l;
        this.voteOption = num;
        this.voteText = str;
    }
}
