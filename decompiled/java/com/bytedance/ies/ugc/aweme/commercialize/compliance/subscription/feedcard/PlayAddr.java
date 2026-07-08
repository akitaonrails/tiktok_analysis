package com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.feedcard;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class PlayAddr {

    @C09CT("uri")
    public final String uri;

    @C09CT("url_list")
    public final List<String> urlList;

    public PlayAddr() {
        this(null, null);
    }

    public PlayAddr(String str, List<String> list) {
        this.uri = str;
        this.urlList = list;
    }
}
