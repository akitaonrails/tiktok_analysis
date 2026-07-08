package com.ss.android.ugc.aweme.tako.aivideo.detail.alphaplayer;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class AlphaVideoConfig {

    @C09CT("portrait")
    public final AlphaVideoItem portrait;

    public AlphaVideoConfig() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AlphaVideoConfig) && Intrinsics.LJFF(this.portrait, ((AlphaVideoConfig) obj).portrait);
    }

    public final int hashCode() {
        AlphaVideoItem alphaVideoItem = this.portrait;
        if (alphaVideoItem == null) {
            return 0;
        }
        return alphaVideoItem.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlphaVideoConfig(portrait=");
        sbLIZ.append(this.portrait);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AlphaVideoConfig(AlphaVideoItem alphaVideoItem) {
        this.portrait = alphaVideoItem;
    }
}
