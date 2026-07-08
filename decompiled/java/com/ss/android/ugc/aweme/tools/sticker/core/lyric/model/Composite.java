package com.ss.android.ugc.aweme.tools.sticker.core.lyric.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.InitialTrimInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TimeRange;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class Composite {

    @C09CT("fallback_font")
    public List<LyricFailbackFont> fallbackFonts;

    @C09CT("keyframes")
    public final List<Keyframe> keyframes;

    @C09CT("rotation")
    public final Float rotation;

    @C09CT("scale_xy")
    public final ScaleXY scaleXy;

    @C09CT("texts")
    public final List<TextElement> texts;

    @C09CT("timerange")
    public final TimeRange timerange;

    @C09CT("transform")
    public final Transform transform;

    @C09CT("trim")
    public final InitialTrimInfo trim;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Composite)) {
            return false;
        }
        Composite composite = (Composite) obj;
        return Intrinsics.LJFF(this.transform, composite.transform) && Intrinsics.LJFF(this.scaleXy, composite.scaleXy) && Intrinsics.LJFF(this.rotation, composite.rotation) && Intrinsics.LJFF(this.timerange, composite.timerange) && Intrinsics.LJFF(this.trim, composite.trim) && Intrinsics.LJFF(this.keyframes, composite.keyframes) && Intrinsics.LJFF(this.fallbackFonts, composite.fallbackFonts) && Intrinsics.LJFF(this.texts, composite.texts);
    }

    public final int hashCode() {
        Transform transform = this.transform;
        int iHashCode = (transform == null ? 0 : transform.hashCode()) * 31;
        ScaleXY scaleXY = this.scaleXy;
        int iHashCode2 = (iHashCode + (scaleXY == null ? 0 : scaleXY.hashCode())) * 31;
        Float f = this.rotation;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        TimeRange timeRange = this.timerange;
        int iHashCode4 = (iHashCode3 + (timeRange == null ? 0 : timeRange.hashCode())) * 31;
        InitialTrimInfo initialTrimInfo = this.trim;
        int iHashCode5 = (iHashCode4 + (initialTrimInfo == null ? 0 : initialTrimInfo.hashCode())) * 31;
        List<Keyframe> list = this.keyframes;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<LyricFailbackFont> list2 = this.fallbackFonts;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TextElement> list3 = this.texts;
        return iHashCode7 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Composite(transform=");
        sbLIZ.append(this.transform);
        sbLIZ.append(", scaleXy=");
        sbLIZ.append(this.scaleXy);
        sbLIZ.append(", rotation=");
        sbLIZ.append(this.rotation);
        sbLIZ.append(", timerange=");
        sbLIZ.append(this.timerange);
        sbLIZ.append(", trim=");
        sbLIZ.append(this.trim);
        sbLIZ.append(", keyframes=");
        sbLIZ.append(this.keyframes);
        sbLIZ.append(", fallbackFonts=");
        sbLIZ.append(this.fallbackFonts);
        sbLIZ.append(", texts=");
        sbLIZ.append(this.texts);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Composite(Transform transform, ScaleXY scaleXY, Float f, TimeRange timeRange, InitialTrimInfo initialTrimInfo, List<Keyframe> list, List<LyricFailbackFont> list2, List<TextElement> list3) {
        this.transform = transform;
        this.scaleXy = scaleXY;
        this.rotation = f;
        this.timerange = timeRange;
        this.trim = initialTrimInfo;
        this.keyframes = list;
        this.fallbackFonts = list2;
        this.texts = list3;
    }
}
