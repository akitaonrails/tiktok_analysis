package com.ss.android.ugc.aweme.nimblecard.tako.model;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class LoopVariables {

    @C09CT("indexKey")
    public final String indexKey;

    @C09CT("itemKey")
    public final String itemKey;

    public LoopVariables() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoopVariables)) {
            return false;
        }
        LoopVariables loopVariables = (LoopVariables) obj;
        return Intrinsics.LJFF(this.indexKey, loopVariables.indexKey) && Intrinsics.LJFF(this.itemKey, loopVariables.itemKey);
    }

    public final int hashCode() {
        String str = this.indexKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.itemKey;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public LoopVariables(String str, String str2) {
        this.indexKey = str;
        this.itemKey = str2;
    }
}
