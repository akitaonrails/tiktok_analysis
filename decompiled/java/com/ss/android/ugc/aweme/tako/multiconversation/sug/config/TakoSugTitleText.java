package com.ss.android.ugc.aweme.tako.multiconversation.sug.config;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoSugTitleText {

    @C09CT("title_double_line_main_title")
    public final String titleDoubleLineMainTitle;

    @C09CT("title_double_line_sub_title")
    public final String titleDoubleLineSubTitle;

    @C09CT("title_single_line")
    public final String titleSingleLine;

    public TakoSugTitleText() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoSugTitleText)) {
            return false;
        }
        TakoSugTitleText takoSugTitleText = (TakoSugTitleText) obj;
        return Intrinsics.LJFF(this.titleSingleLine, takoSugTitleText.titleSingleLine) && Intrinsics.LJFF(this.titleDoubleLineMainTitle, takoSugTitleText.titleDoubleLineMainTitle) && Intrinsics.LJFF(this.titleDoubleLineSubTitle, takoSugTitleText.titleDoubleLineSubTitle);
    }

    public final int hashCode() {
        String str = this.titleSingleLine;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.titleDoubleLineMainTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.titleDoubleLineSubTitle;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoSugTitleText(titleSingleLine=");
        sbLIZ.append(this.titleSingleLine);
        sbLIZ.append(", titleDoubleLineMainTitle=");
        sbLIZ.append(this.titleDoubleLineMainTitle);
        sbLIZ.append(", titleDoubleLineSubTitle=");
        sbLIZ.append(this.titleDoubleLineSubTitle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoSugTitleText(String str, String str2, String str3) {
        this.titleSingleLine = str;
        this.titleDoubleLineMainTitle = str2;
        this.titleDoubleLineSubTitle = str3;
    }
}
