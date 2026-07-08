package com.ss.android.ugc.aweme.im.sticker.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class IMStickerMeta implements Serializable {

    @C09CT("size")
    public final Integer size;

    @C09CT("stickers")
    public final List<SetSticker> stickers;

    public IMStickerMeta() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMStickerMeta)) {
            return false;
        }
        IMStickerMeta iMStickerMeta = (IMStickerMeta) obj;
        return Intrinsics.LJFF(this.stickers, iMStickerMeta.stickers) && Intrinsics.LJFF(this.size, iMStickerMeta.size);
    }

    public int hashCode() {
        List<SetSticker> list = this.stickers;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.size;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMStickerMeta(stickers=");
        sbLIZ.append(this.stickers);
        sbLIZ.append(", size=");
        sbLIZ.append(this.size);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IMStickerMeta(List<SetSticker> list, Integer num) {
        this.stickers = list;
        this.size = num;
    }
}
