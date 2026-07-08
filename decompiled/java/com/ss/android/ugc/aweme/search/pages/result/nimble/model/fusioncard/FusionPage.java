package com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class FusionPage implements Serializable {

    @C09CT("blocks")
    public final List<FusionBlock> blocks;

    public FusionPage() {
        this(null);
    }

    public final FusionPage copy(List<FusionBlock> list) {
        return new FusionPage(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FusionPage) && Intrinsics.LJFF(this.blocks, ((FusionPage) obj).blocks);
    }

    public int hashCode() {
        List<FusionBlock> list = this.blocks;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public FusionPage(List<FusionBlock> list) {
        this.blocks = list;
    }
}
