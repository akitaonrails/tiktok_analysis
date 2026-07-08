package com.ss.android.ugc.aweme.tools.sticker.core.lyric.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class LyricMiniDraftData {

    @C09CT("canvas")
    public final CanvasInfo canvas;

    @C09CT("composites")
    public final List<Composite> composites;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LyricMiniDraftData)) {
            return false;
        }
        LyricMiniDraftData lyricMiniDraftData = (LyricMiniDraftData) obj;
        return Intrinsics.LJFF(this.canvas, lyricMiniDraftData.canvas) && Intrinsics.LJFF(this.composites, lyricMiniDraftData.composites);
    }

    public final int hashCode() {
        CanvasInfo canvasInfo = this.canvas;
        int iHashCode = (canvasInfo == null ? 0 : canvasInfo.hashCode()) * 31;
        List<Composite> list = this.composites;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyricMiniDraftData(canvas=");
        sbLIZ.append(this.canvas);
        sbLIZ.append(", composites=");
        sbLIZ.append(this.composites);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LyricMiniDraftData(CanvasInfo canvasInfo, List<Composite> list) {
        this.canvas = canvasInfo;
        this.composites = list;
    }
}
