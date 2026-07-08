package com.ss.android.ugc.aweme.comment.poll.repository;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PollOption {

    @C09CT("index")
    public final Integer index;

    @C09CT("text")
    public final String text;

    public PollOption() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollOption)) {
            return false;
        }
        PollOption pollOption = (PollOption) obj;
        return Intrinsics.LJFF(this.index, pollOption.index) && Intrinsics.LJFF(this.text, pollOption.text);
    }

    public final int hashCode() {
        Integer num = this.index;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.text;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PollOption(index=");
        sbLIZ.append(this.index);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PollOption(Integer num, String str) {
        this.index = num;
        this.text = str;
    }
}
