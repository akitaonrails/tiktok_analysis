package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class DMFormCardConfig implements Serializable {

    @C09CT("gecko_channel")
    public final List<String> geckoChannel;

    public DMFormCardConfig(List<String> list) {
        this.geckoChannel = list;
    }
}
