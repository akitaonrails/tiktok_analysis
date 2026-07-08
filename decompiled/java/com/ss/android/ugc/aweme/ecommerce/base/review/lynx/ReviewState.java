package com.ss.android.ugc.aweme.ecommerce.base.review.lynx;

import X.AbstractC1556060qay;
import X.AbstractC1623806Xk;
import X.C004I;
import X.C1556070qaz;
import X.C1623706Xj;
import X.C2188811AlT;
import X.EnumC1766410w4F;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ReviewState implements C004I, InterfaceC0148002o {
    public static final int $stable = 8;
    public final ProductDetailReview data;
    public final AbstractC1556060qay dataFetchStatus;
    public final AbstractC1623806Xk<Unit> lynxLoadStatus;
    public final EnumC1766410w4F networkState;
    public final String productId;
    public final String sellerId;

    public ReviewState() {
        this("", "", null, C1556070qaz.LIZ, new C1623706Xj(), EnumC1766410w4F.DEFAULT);
    }

    public final ReviewState copy(String str, String str2, ProductDetailReview productDetailReview, AbstractC1556060qay abstractC1556060qay, AbstractC1623806Xk<Unit> abstractC1623806Xk, EnumC1766410w4F enumC1766410w4F) {
        return new ReviewState(str, str2, productDetailReview, abstractC1556060qay, abstractC1623806Xk, enumC1766410w4F);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewState)) {
            return false;
        }
        ReviewState reviewState = (ReviewState) obj;
        return Intrinsics.LJFF(this.productId, reviewState.productId) && Intrinsics.LJFF(this.sellerId, reviewState.sellerId) && Intrinsics.LJFF(this.data, reviewState.data) && Intrinsics.LJFF(this.dataFetchStatus, reviewState.dataFetchStatus) && Intrinsics.LJFF(this.lynxLoadStatus, reviewState.lynxLoadStatus) && this.networkState == reviewState.networkState;
    }

    public int hashCode() {
        int iHashCode = ((this.productId.hashCode() * 31) + this.sellerId.hashCode()) * 31;
        ProductDetailReview productDetailReview = this.data;
        return ((((((iHashCode + (productDetailReview == null ? 0 : productDetailReview.hashCode())) * 31) + this.dataFetchStatus.hashCode()) * 31) + this.lynxLoadStatus.hashCode()) * 31) + this.networkState.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReviewState(productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(", sellerId=");
        sbLIZ.append(this.sellerId);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", dataFetchStatus=");
        sbLIZ.append(this.dataFetchStatus);
        sbLIZ.append(", lynxLoadStatus=");
        sbLIZ.append(this.lynxLoadStatus);
        sbLIZ.append(", networkState=");
        sbLIZ.append(this.networkState);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final ProductDetailReview getData() {
        return this.data;
    }

    public final AbstractC1556060qay getDataFetchStatus() {
        return this.dataFetchStatus;
    }

    public final AbstractC1623806Xk<Unit> getLynxLoadStatus() {
        return this.lynxLoadStatus;
    }

    public final EnumC1766410w4F getNetworkState() {
        return this.networkState;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getSellerId() {
        return this.sellerId;
    }

    public ReviewState(String str, String str2, ProductDetailReview productDetailReview, AbstractC1556060qay abstractC1556060qay, AbstractC1623806Xk<Unit> abstractC1623806Xk, EnumC1766410w4F enumC1766410w4F) {
        this.productId = str;
        this.sellerId = str2;
        this.data = productDetailReview;
        this.dataFetchStatus = abstractC1556060qay;
        this.lynxLoadStatus = abstractC1623806Xk;
        this.networkState = enumC1766410w4F;
    }
}
