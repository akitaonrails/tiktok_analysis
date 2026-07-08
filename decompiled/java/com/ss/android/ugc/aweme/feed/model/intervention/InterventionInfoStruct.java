package com.ss.android.ugc.aweme.feed.model.intervention;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class InterventionInfoStruct implements Serializable {
    public static final int $stable = 8;

    @C09CT("origin_content_info")
    public List<ContentInfoStruct> originContentInfo = new ArrayList();

    public final List<ContentInfoStruct> getOriginContentInfo() {
        return this.originContentInfo;
    }

    public final void setOriginContentInfo(List<ContentInfoStruct> list) {
        this.originContentInfo = list;
    }
}
