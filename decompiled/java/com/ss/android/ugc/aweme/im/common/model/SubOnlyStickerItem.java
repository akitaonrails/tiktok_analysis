package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SubOnlyStickerItem implements Serializable {

    @C09CT("sticker_sub_type")
    public final Integer subType;

    @C09CT("tier_id")
    public final String tierId;

    public SubOnlyStickerItem() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubOnlyStickerItem)) {
            return false;
        }
        SubOnlyStickerItem subOnlyStickerItem = (SubOnlyStickerItem) obj;
        return Intrinsics.LJFF(this.subType, subOnlyStickerItem.subType) && Intrinsics.LJFF(this.tierId, subOnlyStickerItem.tierId);
    }

    public int hashCode() {
        Integer num = this.subType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.tierId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public SubOnlyStickerItem(Integer num, String str) {
        this.subType = num;
        this.tierId = str;
    }
}
