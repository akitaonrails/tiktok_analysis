package com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceLynxCardComponentData {

    @C09CT("gecko_channel")
    public List<String> geckoChannel;

    @C09CT("lynx_schema")
    public String lynxSchema;

    public CommerceLynxCardComponentData() {
        this(null, null);
    }

    public CommerceLynxCardComponentData(String str, List<String> list) {
        this.lynxSchema = str;
        this.geckoChannel = list;
    }
}
