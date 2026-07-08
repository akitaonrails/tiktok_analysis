package com.ss.android.ugc.aweme.localservice.live.common.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ProductNumResponse extends BaseResponse {

    @C09CT("cart_link")
    public final String cartLink;

    @C09CT("total_num")
    public final Integer totalNum;

    public ProductNumResponse() {
        this(0, null);
    }

    public final ProductNumResponse copy(Integer num, String str) {
        return new ProductNumResponse(num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductNumResponse)) {
            return false;
        }
        ProductNumResponse productNumResponse = (ProductNumResponse) obj;
        return Intrinsics.LJFF(this.totalNum, productNumResponse.totalNum) && Intrinsics.LJFF(this.cartLink, productNumResponse.cartLink);
    }

    public int hashCode() {
        Integer num = this.totalNum;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.cartLink;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductNumResponse(totalNum=");
        sbLIZ.append(this.totalNum);
        sbLIZ.append(", cartLink=");
        sbLIZ.append(this.cartLink);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getCartLink() {
        return this.cartLink;
    }

    public final Integer getTotalNum() {
        return this.totalNum;
    }

    public ProductNumResponse(Integer num, String str) {
        this.totalNum = num;
        this.cartLink = str;
    }
}
