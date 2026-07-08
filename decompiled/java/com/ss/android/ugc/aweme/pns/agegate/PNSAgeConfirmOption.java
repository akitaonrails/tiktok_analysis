package com.ss.android.ugc.aweme.pns.agegate;

import X.C09CT;
import X.EnumC19301010fA;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class PNSAgeConfirmOption implements Serializable {

    @C09CT("option_content")
    public final String optionContent;

    @C09CT("option_type")
    public final int optionType;

    @C09CT("option_url")
    public final String optionUrl;

    public PNSAgeConfirmOption() {
        this("", null, EnumC19301010fA.DISMISS.getType());
    }

    public PNSAgeConfirmOption(String str, String str2, int i) {
        this.optionContent = str;
        this.optionUrl = str2;
        this.optionType = i;
    }
}
