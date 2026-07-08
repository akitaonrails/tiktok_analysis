package com.ss.android.ugc.aweme.journey.intention;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class IntentionStruct {

    @C09CT("intention_category")
    public final String intention;

    @C09CT("sub_intention")
    public final String subIntention;

    public IntentionStruct() {
        this("", null);
    }

    public IntentionStruct(String str, String str2) {
        this.intention = str;
        this.subIntention = str2;
    }
}
