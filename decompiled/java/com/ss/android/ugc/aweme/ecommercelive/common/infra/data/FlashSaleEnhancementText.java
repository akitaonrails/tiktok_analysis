package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FlashSaleEnhancementText {

    @C09CT("placeholder_info")
    public final List<PlaceholderInfo> placeholderInfo;

    @C09CT("type")
    public final int type;

    public FlashSaleEnhancementText() {
        this(0, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlashSaleEnhancementText)) {
            return false;
        }
        FlashSaleEnhancementText flashSaleEnhancementText = (FlashSaleEnhancementText) obj;
        return this.type == flashSaleEnhancementText.type && Intrinsics.LJFF(this.placeholderInfo, flashSaleEnhancementText.placeholderInfo);
    }

    public final int hashCode() {
        return (this.type * 31) + this.placeholderInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlashSaleEnhancementText(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", placeholderInfo=");
        sbLIZ.append(this.placeholderInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FlashSaleEnhancementText(int i, List<PlaceholderInfo> list) {
        this.type = i;
        this.placeholderInfo = list;
    }

    public FlashSaleEnhancementText(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
