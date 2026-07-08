package com.ss.android.ugc.aweme.services.edit;

import X.C13BV;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class MultiAnchorEditModel {
    public final List<AnchorTransData> anchorList;

    public MultiAnchorEditModel() {
        this(null, 1, null);
    }

    public MultiAnchorEditModel(List<AnchorTransData> list) {
        this.anchorList = list;
    }

    public MultiAnchorEditModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
