package com.ss.android.ugc.gamora.editor.lyric.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class LyricDependResourceResponse {

    @C09CT("depend_resource_list")
    public final List<LyricEffectDependResource> dependResourceList;

    @C09CT("recommend_size")
    public final List<Integer> recommendSize;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LyricDependResourceResponse)) {
            return false;
        }
        LyricDependResourceResponse lyricDependResourceResponse = (LyricDependResourceResponse) obj;
        return Intrinsics.LJFF(this.dependResourceList, lyricDependResourceResponse.dependResourceList) && Intrinsics.LJFF(this.recommendSize, lyricDependResourceResponse.recommendSize);
    }

    public final int hashCode() {
        List<LyricEffectDependResource> list = this.dependResourceList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Integer> list2 = this.recommendSize;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyricDependResourceResponse(dependResourceList=");
        sbLIZ.append(this.dependResourceList);
        sbLIZ.append(", recommendSize=");
        sbLIZ.append(this.recommendSize);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LyricDependResourceResponse(List<LyricEffectDependResource> list, List<Integer> list2) {
        this.dependResourceList = list;
        this.recommendSize = list2;
    }
}
