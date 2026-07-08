package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ThirdpartyStickerItem implements Serializable {

    @C09CT("third_party_sticker_type")
    public final Integer source;

    @C09CT("third_party_tenor_ext_info")
    public final ThirdPartyTenorExtInfo thirdPartyTenorExtInfo;

    public ThirdpartyStickerItem() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThirdpartyStickerItem)) {
            return false;
        }
        ThirdpartyStickerItem thirdpartyStickerItem = (ThirdpartyStickerItem) obj;
        return Intrinsics.LJFF(this.source, thirdpartyStickerItem.source) && Intrinsics.LJFF(this.thirdPartyTenorExtInfo, thirdpartyStickerItem.thirdPartyTenorExtInfo);
    }

    public int hashCode() {
        Integer num = this.source;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        ThirdPartyTenorExtInfo thirdPartyTenorExtInfo = this.thirdPartyTenorExtInfo;
        return iHashCode + (thirdPartyTenorExtInfo != null ? thirdPartyTenorExtInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThirdpartyStickerItem(source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", thirdPartyTenorExtInfo=");
        sbLIZ.append(this.thirdPartyTenorExtInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ThirdpartyStickerItem(Integer num, ThirdPartyTenorExtInfo thirdPartyTenorExtInfo) {
        this.source = num;
        this.thirdPartyTenorExtInfo = thirdPartyTenorExtInfo;
    }
}
