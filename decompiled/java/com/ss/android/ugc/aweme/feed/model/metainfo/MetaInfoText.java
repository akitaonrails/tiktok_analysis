package com.ss.android.ugc.aweme.feed.model.metainfo;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class MetaInfoText implements Serializable {

    @C09CT("body")
    public String body;

    public MetaInfoText() {
        this("");
    }

    public MetaInfoText(String str) {
        this.body = str;
    }
}
