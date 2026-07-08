package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productinterlink;

import X.C033W;
import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC718502rH;
import X.InterfaceC746802vq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productinterlink.ProductInterlinkModuleVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productinterlink.ProductInterlinkVO;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ProductInterlinkVO implements Parcelable, InterfaceC718502rH {

    @C09CT("product_link")
    public final ProductInterlinkModuleVO productLink;
    public static final Parcelable.Creator<ProductInterlinkVO> CREATOR = new Parcelable.Creator<ProductInterlinkVO>() { // from class: X.03vO
        @Override // android.os.Parcelable.Creator
        public final ProductInterlinkVO createFromParcel(Parcel parcel) {
            ProductInterlinkModuleVO productInterlinkModuleVOCreateFromParcel;
            if (parcel.readInt() == 0) {
                productInterlinkModuleVOCreateFromParcel = null;
            } else {
                productInterlinkModuleVOCreateFromParcel = ProductInterlinkModuleVO.CREATOR.createFromParcel(parcel);
            }
            return new ProductInterlinkVO(productInterlinkModuleVOCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ProductInterlinkVO[] newArray(int i) {
            return new ProductInterlinkVO[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductInterlinkVO) && Intrinsics.LJFF(this.productLink, ((ProductInterlinkVO) obj).productLink);
    }

    public final int hashCode() {
        ProductInterlinkModuleVO productInterlinkModuleVO = this.productLink;
        if (productInterlinkModuleVO == null) {
            return 0;
        }
        return productInterlinkModuleVO.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductInterlinkVO(productLink=");
        sbLIZ.append(this.productLink);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ProductInterlinkModuleVO productInterlinkModuleVO = this.productLink;
        if (productInterlinkModuleVO == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            productInterlinkModuleVO.writeToParcel(parcel, i);
        }
    }

    public ProductInterlinkVO(ProductInterlinkModuleVO productInterlinkModuleVO) {
        this.productLink = productInterlinkModuleVO;
    }

    @Override // X.InterfaceC718502rH
    public final List<InterfaceC746802vq> LIZ(C033W c033w) {
        ProductInterlinkModuleVO productInterlinkModuleVO;
        ArrayList arrayList = new ArrayList();
        if ((!c033w.LIZ) && (productInterlinkModuleVO = this.productLink) != null) {
            arrayList.add(productInterlinkModuleVO);
        }
        return arrayList;
    }
}
