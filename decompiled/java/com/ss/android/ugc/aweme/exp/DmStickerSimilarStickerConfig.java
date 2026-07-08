package com.ss.android.ugc.aweme.exp;

import X.C09CT;
import X.C1697810uHb;
import X.C2188811AlT;
import X.EnumC451180Hme;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class DmStickerSimilarStickerConfig implements Serializable {

    @C09CT("sticker_types")
    public final List<Integer> stickerTypes;

    public DmStickerSimilarStickerConfig() {
        this(C1697810uHb.LJIIJJI(Integer.valueOf(EnumC451180Hme.STATIC.getType()), Integer.valueOf(EnumC451180Hme.ANIMATED.getType()), Integer.valueOf(EnumC451180Hme.GIPHY.getType()), Integer.valueOf(EnumC451180Hme.THIRD_PARTY_GIPHY.getType()), Integer.valueOf(EnumC451180Hme.THIRD_PARTY_TENOR.getType()), Integer.valueOf(EnumC451180Hme.INHOUSE_TENOR.getType())));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DmStickerSimilarStickerConfig) && Intrinsics.LJFF(this.stickerTypes, ((DmStickerSimilarStickerConfig) obj).stickerTypes);
    }

    public int hashCode() {
        return this.stickerTypes.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DmStickerSimilarStickerConfig(stickerTypes=");
        sbLIZ.append(this.stickerTypes);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DmStickerSimilarStickerConfig(List<Integer> list) {
        this.stickerTypes = list;
    }
}
