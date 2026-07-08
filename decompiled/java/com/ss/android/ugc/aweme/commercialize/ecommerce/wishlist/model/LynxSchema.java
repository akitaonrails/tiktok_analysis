package com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class LynxSchema implements Serializable {

    @C09CT("gecko_channel")
    public final List<String> geckoChannels;

    @C09CT("render_url")
    public final String renderUrl;

    @C09CT("web_url")
    public final String webUrl;

    public LynxSchema(String str, String str2, List<String> list) {
        this.renderUrl = str;
        this.webUrl = str2;
        this.geckoChannels = list;
    }
}
