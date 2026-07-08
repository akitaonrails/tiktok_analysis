package com.ss.android.ugc.aweme.search.pages.result.aidisclaimer;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class SearchLLMCardCommonInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("disclaimer_text")
    public final String disclaimerText;

    @C09CT("disclaimer_type")
    public final String disclaimerType;

    @C09CT("tako_extra_disclaimer_text")
    public final String takoExtraDisclaimerText;

    public SearchLLMCardCommonInfo() {
        this(null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchLLMCardCommonInfo(disclaimerText=");
        sbLIZ.append(this.disclaimerText);
        sbLIZ.append(", disclaimerType=");
        sbLIZ.append(this.disclaimerType);
        sbLIZ.append(", takoExtraDisclaimerText=");
        sbLIZ.append(this.takoExtraDisclaimerText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SearchLLMCardCommonInfo(String str, String str2, String str3) {
        this.disclaimerText = str;
        this.disclaimerType = str2;
        this.takoExtraDisclaimerText = str3;
    }
}
