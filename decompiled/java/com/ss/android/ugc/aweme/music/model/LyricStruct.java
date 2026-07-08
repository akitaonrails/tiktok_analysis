package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class LyricStruct implements Serializable {
    public static final Companion Companion = new Companion();
    public static final long serialVersionUID = 1;

    @C09CT("lyric_id")
    public final long lyricId;

    @C09CT("lyric_type")
    public final int lyricType;

    @C09CT("lyric_url")
    public final String lyricUrl;

    public static final class Companion {
    }

    public LyricStruct() {
        this(0L, 0, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LyricStruct)) {
            return false;
        }
        LyricStruct lyricStruct = (LyricStruct) obj;
        return this.lyricId == lyricStruct.lyricId && this.lyricType == lyricStruct.lyricType && Intrinsics.LJFF(this.lyricUrl, lyricStruct.lyricUrl);
    }

    public int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.lyricId) * 31) + this.lyricType) * 31;
        String str = this.lyricUrl;
        return iY2 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyricStruct(lyricId=");
        sbLIZ.append(this.lyricId);
        sbLIZ.append(", lyricType=");
        sbLIZ.append(this.lyricType);
        sbLIZ.append(", lyricUrl=");
        sbLIZ.append(this.lyricUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LyricStruct(long j, int i, String str) {
        this.lyricId = j;
        this.lyricType = i;
        this.lyricUrl = str;
    }
}
