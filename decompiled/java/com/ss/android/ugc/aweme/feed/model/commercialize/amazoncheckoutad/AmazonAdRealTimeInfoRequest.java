package com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AmazonAdRealTimeInfoRequest {

    @C09CT("asins")
    public final List<String> asins;

    @C09CT("enable_bwa_pa_serving")
    public final boolean enableBWAPaServing;

    @C09CT("extra")
    public final String extra;

    public AmazonAdRealTimeInfoRequest() {
        this(null, false, null);
    }

    public AmazonAdRealTimeInfoRequest(List<String> list, boolean z, String str) {
        this.asins = list;
        this.enableBWAPaServing = z;
        this.extra = str;
    }
}
