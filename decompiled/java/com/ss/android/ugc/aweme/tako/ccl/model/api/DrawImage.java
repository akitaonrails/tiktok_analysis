package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class DrawImage {

    @C09CT("place_holder")
    public final String placeholder;

    @C09CT("sug")
    public final TakoSug sug;

    public DrawImage() {
        this(null, null);
    }

    public final int hashCode() {
        TakoSug takoSug = this.sug;
        int iHashCode = (takoSug == null ? 0 : takoSug.hashCode()) * 31;
        String str = this.placeholder;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public DrawImage(TakoSug takoSug, String str) {
        this.sug = takoSug;
        this.placeholder = str;
    }
}
