package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AiPdpJumpDataModel implements Serializable {

    @C09CT("frontend_data")
    public final Object frontendData;

    @C09CT("gecko_channel")
    public final List<String> geckoChannel;

    @C09CT("lynx_schema")
    public final String lynxSchema;

    public AiPdpJumpDataModel() {
        this(null, null, null);
    }

    public final Object getFrontendData() {
        return this.frontendData;
    }

    public final List<String> getGeckoChannel() {
        return this.geckoChannel;
    }

    public final String getLynxSchema() {
        return this.lynxSchema;
    }

    public AiPdpJumpDataModel(String str, List<String> list, Object obj) {
        this.lynxSchema = str;
        this.geckoChannel = list;
        this.frontendData = obj;
    }
}
