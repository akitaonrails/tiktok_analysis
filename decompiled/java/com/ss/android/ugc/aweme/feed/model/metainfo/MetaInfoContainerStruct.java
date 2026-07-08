package com.ss.android.ugc.aweme.feed.model.metainfo;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class MetaInfoContainerStruct implements Serializable {

    @C09CT("meta_components")
    public List<MetaInfoCommonStruct> metaInfos;

    public MetaInfoContainerStruct() {
        this(null);
    }

    public MetaInfoContainerStruct(List<MetaInfoCommonStruct> list) {
        this.metaInfos = list;
    }
}
