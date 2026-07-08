package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.AbstractC723102s1;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class USPackedSku extends AbstractC723102s1 {
    public static final int $stable = 8;
    public final String groupId = "ineligible_items";
    public final PackedSku originPackedSku;

    public final USPackedSku copy(PackedSku packedSku) {
        return new USPackedSku(packedSku);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof USPackedSku) && Intrinsics.LJFF(this.originPackedSku, ((USPackedSku) obj).originPackedSku);
    }

    public int hashCode() {
        return this.originPackedSku.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("USPackedSku(originPackedSku=");
        sbLIZ.append(this.originPackedSku);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC723102s1
    public String getItemId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("us_unavailable_sku_item_");
        PackedSku packedSku = this.originPackedSku;
        String str = packedSku.uniqueKey;
        if (str == null && (str = packedSku.cartItemId) == null && (str = packedSku.skuId) == null) {
            str = "";
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC723102s1
    public String getGroupId() {
        return this.groupId;
    }

    public final PackedSku getOriginPackedSku() {
        return this.originPackedSku;
    }

    public USPackedSku(PackedSku packedSku) {
        this.originPackedSku = packedSku;
    }
}
