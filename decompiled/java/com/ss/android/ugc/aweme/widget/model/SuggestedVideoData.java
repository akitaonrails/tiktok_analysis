package com.ss.android.ugc.aweme.widget.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SuggestedVideoData {

    @C09CT("suggest_videos")
    public final List<SuggestedVideoItem> suggestVideos;

    public SuggestedVideoData() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SuggestedVideoData) && Intrinsics.LJFF(this.suggestVideos, ((SuggestedVideoData) obj).suggestVideos);
    }

    public int hashCode() {
        List<SuggestedVideoItem> list = this.suggestVideos;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuggestedVideoData(suggestVideos=");
        sbLIZ.append(this.suggestVideos);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SuggestedVideoData(List<SuggestedVideoItem> list) {
        this.suggestVideos = list;
    }
}
