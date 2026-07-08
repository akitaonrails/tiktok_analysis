package com.ss.android.ugc.aweme.search.pages.result.pov.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard.FusionBlock;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class AiContentInfo implements Serializable {

    @C09CT("block_segment")
    public final FusionBlock blockSegment;

    @C09CT("op")
    public final String op;

    public AiContentInfo() {
        this(null, null);
    }

    public int hashCode() {
        String str = this.op;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        FusionBlock fusionBlock = this.blockSegment;
        return iHashCode + (fusionBlock != null ? fusionBlock.hashCode() : 0);
    }

    public AiContentInfo(String str, FusionBlock fusionBlock) {
        this.op = str;
        this.blockSegment = fusionBlock;
    }
}
