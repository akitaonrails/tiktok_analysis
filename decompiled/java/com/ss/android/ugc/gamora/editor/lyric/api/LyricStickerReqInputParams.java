package com.ss.android.ugc.gamora.editor.lyric.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LyricStickerReqInputParams {

    @C09CT("music_id")
    public final String musicId;

    @C09CT("effect_resource_id")
    public final String resourceId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LyricStickerReqInputParams)) {
            return false;
        }
        LyricStickerReqInputParams lyricStickerReqInputParams = (LyricStickerReqInputParams) obj;
        return Intrinsics.LJFF(this.musicId, lyricStickerReqInputParams.musicId) && Intrinsics.LJFF(this.resourceId, lyricStickerReqInputParams.resourceId);
    }

    public final int hashCode() {
        String str = this.musicId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.resourceId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyricStickerReqInputParams(musicId=");
        sbLIZ.append(this.musicId);
        sbLIZ.append(", resourceId=");
        sbLIZ.append(this.resourceId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LyricStickerReqInputParams(String str, String str2) {
        this.musicId = str;
        this.resourceId = str2;
    }
}
