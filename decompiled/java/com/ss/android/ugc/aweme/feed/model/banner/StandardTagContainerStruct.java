package com.ss.android.ugc.aweme.feed.model.banner;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class StandardTagContainerStruct implements Serializable {

    @C09CT("tags")
    public List<StandardTagStruct> tags;

    public StandardTagContainerStruct() {
        this(null);
    }

    public final StandardTagContainerStruct copy(List<StandardTagStruct> list) {
        return new StandardTagContainerStruct(list);
    }

    public StandardTagContainerStruct(List<StandardTagStruct> list) {
        this.tags = list;
    }
}
