package com.ss.android.ugc.aweme.search.pages.result.pov.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SummaryFooter implements Serializable {

    @C09CT("display_text")
    public final String displayText;

    @C09CT("hot_area_end_index")
    public final Integer hotAreaEndIndex;

    @C09CT("hot_area_start_index")
    public final Integer hotAreaStartIndex;

    @C09CT("link")
    public final String link;

    public final SummaryFooter copy(String str, Integer num, Integer num2, String str2) {
        return new SummaryFooter(str, num, num2, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummaryFooter)) {
            return false;
        }
        SummaryFooter summaryFooter = (SummaryFooter) obj;
        return Intrinsics.LJFF(this.displayText, summaryFooter.displayText) && Intrinsics.LJFF(this.hotAreaStartIndex, summaryFooter.hotAreaStartIndex) && Intrinsics.LJFF(this.hotAreaEndIndex, summaryFooter.hotAreaEndIndex) && Intrinsics.LJFF(this.link, summaryFooter.link);
    }

    public int hashCode() {
        String str = this.displayText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.hotAreaStartIndex;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.hotAreaEndIndex;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.link;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SummaryFooter(displayText=");
        sbLIZ.append(this.displayText);
        sbLIZ.append(", hotAreaStartIndex=");
        sbLIZ.append(this.hotAreaStartIndex);
        sbLIZ.append(", hotAreaEndIndex=");
        sbLIZ.append(this.hotAreaEndIndex);
        sbLIZ.append(", link=");
        sbLIZ.append(this.link);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getDisplayText() {
        return this.displayText;
    }

    public final Integer getHotAreaEndIndex() {
        return this.hotAreaEndIndex;
    }

    public final Integer getHotAreaStartIndex() {
        return this.hotAreaStartIndex;
    }

    public final String getLink() {
        return this.link;
    }

    public SummaryFooter(String str, Integer num, Integer num2, String str2) {
        this.displayText = str;
        this.hotAreaStartIndex = num;
        this.hotAreaEndIndex = num2;
        this.link = str2;
    }
}
