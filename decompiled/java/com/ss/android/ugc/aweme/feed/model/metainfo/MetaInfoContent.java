package com.ss.android.ugc.aweme.feed.model.metainfo;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class MetaInfoContent implements Serializable {

    @C09CT("texts")
    public List<MetaInfoText> texts;

    public MetaInfoContent() {
        this(null);
    }

    public MetaInfoContent(List<MetaInfoText> list) {
        this.texts = list;
    }
}
