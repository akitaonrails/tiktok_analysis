package com.ss.android.ugc.aweme.tools.sticker.core.lyric.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Subtitle {

    @C09CT("duration")
    public final Long duration;

    @C09CT("is_key")
    public final Boolean isKey;

    @C09CT("start")
    public final Long start;

    @C09CT("text")
    public final String text;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Subtitle)) {
            return false;
        }
        Subtitle subtitle = (Subtitle) obj;
        return Intrinsics.LJFF(this.text, subtitle.text) && Intrinsics.LJFF(this.start, subtitle.start) && Intrinsics.LJFF(this.duration, subtitle.duration) && Intrinsics.LJFF(this.isKey, subtitle.isKey);
    }

    public final int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.start;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.duration;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.isKey;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Subtitle(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", start=");
        sbLIZ.append(this.start);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", isKey=");
        sbLIZ.append(this.isKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Subtitle(String str, Long l, Long l2, Boolean bool) {
        this.text = str;
        this.start = l;
        this.duration = l2;
        this.isKey = bool;
    }
}
