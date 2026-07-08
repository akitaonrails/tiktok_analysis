package com.ss.android.ugc.aweme.commercialize.live.leadgen;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class BALeadsGenModel {

    @C09CT("card_button_text")
    public final String cardButtonText;

    @C09CT("card_intro")
    public final String cardIntro;

    @C09CT("card_title")
    public final String cardTitle;

    @C09CT("is_pinned")
    public final boolean isPinned;

    @C09CT("schema")
    public final String leadsGenSchema;

    @C09CT("cta_text")
    public final String leadsGenText;

    @C09CT("pin_period")
    public final int pinPeriod;

    public BALeadsGenModel() {
        this(null, null, false, -1, null, null, null);
    }

    public BALeadsGenModel(String str, String str2, boolean z, int i, String str3, String str4, String str5) {
        this.leadsGenSchema = str;
        this.leadsGenText = str2;
        this.isPinned = z;
        this.pinPeriod = i;
        this.cardTitle = str3;
        this.cardIntro = str4;
        this.cardButtonText = str5;
    }
}
