package com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.model;

import X.C09CT;
import X.C20227514Cr;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class ReferenceItemBridge implements Serializable {
    public static final C20227514Cr Companion = new Object() { // from class: X.14Cr
    };

    @C09CT("link")
    public final ReferenceLinkItemBridge link;

    @C09CT("rank")
    public final int rank;

    @C09CT("source_type")
    public final int type;

    @C09CT("item")
    public final ReferenceVideoItemBridge video;

    public ReferenceItemBridge() {
        this(0, -1, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReferenceItemBridge(rank=");
        sbLIZ.append(this.rank);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", link=");
        sbLIZ.append(this.link);
        sbLIZ.append(", video=");
        sbLIZ.append(this.video);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ReferenceItemBridge(int i, int i2, ReferenceLinkItemBridge referenceLinkItemBridge, ReferenceVideoItemBridge referenceVideoItemBridge) {
        this.rank = i;
        this.type = i2;
        this.link = referenceLinkItemBridge;
        this.video = referenceVideoItemBridge;
    }
}
