package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class DynamicVideo implements Serializable {

    @C09CT("gecko_channel")
    public final List<String> geckoChannel;

    @C09CT("lynx_scheme")
    public final String lynxScheme;

    public DynamicVideo(String str, List<String> list) {
        this.lynxScheme = str;
        this.geckoChannel = list;
    }
}
