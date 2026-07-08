package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class BcmStandardTrackData implements Serializable {

    @C09CT("chain_param")
    public String chainParam;

    @C09CT("track_param")
    public String trackParam;

    public final String getChainParam() {
        return this.chainParam;
    }

    public final String getTrackParam() {
        return this.trackParam;
    }

    public final void setChainParam(String str) {
        this.chainParam = str;
    }

    public final void setTrackParam(String str) {
        this.trackParam = str;
    }
}
