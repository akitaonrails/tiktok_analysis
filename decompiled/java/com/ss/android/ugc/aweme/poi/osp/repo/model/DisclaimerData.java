package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class DisclaimerData implements Serializable {

    @C09CT("highlight_words")
    public final List<HighlightWord> highlightWords;

    @C09CT("text")
    public final String text;

    public DisclaimerData() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisclaimerData)) {
            return false;
        }
        DisclaimerData disclaimerData = (DisclaimerData) obj;
        return Intrinsics.LJFF(this.text, disclaimerData.text) && Intrinsics.LJFF(this.highlightWords, disclaimerData.highlightWords);
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<HighlightWord> list = this.highlightWords;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DisclaimerData(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", highlightWords=");
        sbLIZ.append(this.highlightWords);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DisclaimerData(String str, List<HighlightWord> list) {
        this.text = str;
        this.highlightWords = list;
    }
}
