package com.ss.android.ugc.aweme.feed.model.banner;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class StandardInfoBarContainerStruct implements Serializable {

    @C09CT("info_bars")
    public List<StandardElementStruct> elements;

    public StandardInfoBarContainerStruct() {
        this(null);
    }

    public StandardInfoBarContainerStruct(List<StandardElementStruct> list) {
        this.elements = list;
    }
}
