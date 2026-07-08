package com.ss.android.ugc.aweme.tools.sticker.core.lyric.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class Keyframe {

    @C09CT("frames")
    public final List<Frame> frames;

    @C09CT("property")
    public final String property;

    @C09CT("type")
    public final String type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Keyframe)) {
            return false;
        }
        Keyframe keyframe = (Keyframe) obj;
        return Intrinsics.LJFF(this.type, keyframe.type) && Intrinsics.LJFF(this.property, keyframe.property) && Intrinsics.LJFF(this.frames, keyframe.frames);
    }

    public final int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.property;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Frame> list = this.frames;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Keyframe(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", property=");
        sbLIZ.append(this.property);
        sbLIZ.append(", frames=");
        sbLIZ.append(this.frames);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Keyframe(String str, String str2, List<Frame> list) {
        this.type = str;
        this.property = str2;
        this.frames = list;
    }
}
