package com.ss.android.ugc.aweme.music.understanding;

import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class CacheKey {
    public final PipelineTag pipelineTag;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CacheKey) && Intrinsics.LJFF(this.pipelineTag, ((CacheKey) obj).pipelineTag);
    }

    public int hashCode() {
        return this.pipelineTag.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CacheKey(pipelineTag=");
        sbLIZ.append(this.pipelineTag);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CacheKey(PipelineTag pipelineTag) {
        this.pipelineTag = pipelineTag;
    }
}
