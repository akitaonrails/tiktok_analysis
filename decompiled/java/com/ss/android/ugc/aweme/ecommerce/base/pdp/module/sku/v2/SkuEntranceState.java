package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2;

import X.C004I;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuEntranceState implements C004I {
    public static final int $stable = 8;
    public final Object forceRefresh;
    public final ImageSelectData selectImage;

    public SkuEntranceState() {
        this(null, new Object());
    }

    public final SkuEntranceState copy(ImageSelectData imageSelectData, Object obj) {
        return new SkuEntranceState(imageSelectData, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuEntranceState)) {
            return false;
        }
        SkuEntranceState skuEntranceState = (SkuEntranceState) obj;
        return Intrinsics.LJFF(this.selectImage, skuEntranceState.selectImage) && Intrinsics.LJFF(this.forceRefresh, skuEntranceState.forceRefresh);
    }

    public int hashCode() {
        ImageSelectData imageSelectData = this.selectImage;
        return ((imageSelectData == null ? 0 : imageSelectData.hashCode()) * 31) + this.forceRefresh.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuEntranceState(selectImage=");
        sbLIZ.append(this.selectImage);
        sbLIZ.append(", forceRefresh=");
        sbLIZ.append(this.forceRefresh);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Object getForceRefresh() {
        return this.forceRefresh;
    }

    public final ImageSelectData getSelectImage() {
        return this.selectImage;
    }

    public SkuEntranceState(ImageSelectData imageSelectData, Object obj) {
        this.selectImage = imageSelectData;
        this.forceRefresh = obj;
    }
}
