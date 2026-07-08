package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TakoBubbleSugStruct implements Serializable, IVisualSearchTagItem {

    @C09CT("bubble_sug")
    public final String bubbleText;

    @C09CT("end")
    public final Integer end;

    @C09CT("sug_prompt")
    public final String longText;

    @C09CT("sort_score")
    public final Float sortScore;

    @C09CT("start")
    public final Integer start;

    @C09CT("sug_id")
    public final String sugId;

    public TakoBubbleSugStruct() {
        this(null, null, null, null, null, null);
    }

    public final TakoBubbleSugStruct copy(Float f, Integer num, Integer num2, String str, String str2, String str3) {
        return new TakoBubbleSugStruct(f, num, num2, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoBubbleSugStruct)) {
            return false;
        }
        TakoBubbleSugStruct takoBubbleSugStruct = (TakoBubbleSugStruct) obj;
        return Intrinsics.LJFF(this.sortScore, takoBubbleSugStruct.sortScore) && Intrinsics.LJFF(this.start, takoBubbleSugStruct.start) && Intrinsics.LJFF(this.end, takoBubbleSugStruct.end) && Intrinsics.LJFF(this.longText, takoBubbleSugStruct.longText) && Intrinsics.LJFF(this.bubbleText, takoBubbleSugStruct.bubbleText) && Intrinsics.LJFF(this.sugId, takoBubbleSugStruct.sugId);
    }

    public int hashCode() {
        Float f = this.sortScore;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Integer num = this.start;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.end;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.longText;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bubbleText;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sugId;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoBubbleSugStruct(sortScore=");
        sbLIZ.append(this.sortScore);
        sbLIZ.append(", start=");
        sbLIZ.append(this.start);
        sbLIZ.append(", end=");
        sbLIZ.append(this.end);
        sbLIZ.append(", longText=");
        sbLIZ.append(this.longText);
        sbLIZ.append(", bubbleText=");
        sbLIZ.append(this.bubbleText);
        sbLIZ.append(", sugId=");
        sbLIZ.append(this.sugId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getBubbleText() {
        return this.bubbleText;
    }

    public final Integer getEnd() {
        return this.end;
    }

    public final String getLongText() {
        return this.longText;
    }

    public final Float getSortScore() {
        return this.sortScore;
    }

    public final Integer getStart() {
        return this.start;
    }

    public final String getSugId() {
        return this.sugId;
    }

    public TakoBubbleSugStruct(Float f, Integer num, Integer num2, String str, String str2, String str3) {
        this.sortScore = f;
        this.start = num;
        this.end = num2;
        this.longText = str;
        this.bubbleText = str2;
        this.sugId = str3;
    }
}
