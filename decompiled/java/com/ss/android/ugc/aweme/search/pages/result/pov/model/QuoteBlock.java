package com.ss.android.ugc.aweme.search.pages.result.pov.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class QuoteBlock {

    @C09CT("ref_list")
    public final List<String> refList;

    public QuoteBlock() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof QuoteBlock) && Intrinsics.LJFF(this.refList, ((QuoteBlock) obj).refList);
    }

    public final int hashCode() {
        List<String> list = this.refList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuoteBlock(refList=");
        sbLIZ.append(this.refList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public QuoteBlock(List<String> list) {
        this.refList = list;
    }
}
