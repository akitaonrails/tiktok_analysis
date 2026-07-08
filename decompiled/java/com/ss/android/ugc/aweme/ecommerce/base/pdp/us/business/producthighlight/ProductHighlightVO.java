package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.producthighlight;

import X.C04DW;
import X.C09CT;
import X.C2188811AlT;
import X.C703902ov;
import X.InterfaceC1891350zJl;
import X.InterfaceC746802vq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.producthighlight.ProductHighlightData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.producthighlight.ProductHighlightUIConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.producthighlight.ProductHighlightVO;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ProductHighlightVO implements Parcelable, InterfaceC746802vq, C04DW {
    public String godaGroupId = "undefined";
    public String godaNodeId = "undefined";

    @C09CT("module_data")
    public final ProductHighlightData moduleData;

    @C09CT("ui_config")
    public final ProductHighlightUIConfig uiConfig;
    public static final Parcelable.Creator<ProductHighlightVO> CREATOR = new Parcelable.Creator<ProductHighlightVO>() { // from class: X.0mhE
        @Override // android.os.Parcelable.Creator
        public final ProductHighlightVO createFromParcel(Parcel parcel) {
            ProductHighlightData productHighlightDataCreateFromParcel;
            ProductHighlightUIConfig productHighlightUIConfigCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                productHighlightDataCreateFromParcel = null;
            } else {
                productHighlightDataCreateFromParcel = ProductHighlightData.CREATOR.createFromParcel(parcel);
            }
            ProductHighlightData productHighlightData = productHighlightDataCreateFromParcel;
            if (parcel.readInt() != 0) {
                productHighlightUIConfigCreateFromParcel = ProductHighlightUIConfig.CREATOR.createFromParcel(parcel);
            }
            return new ProductHighlightVO(productHighlightData, productHighlightUIConfigCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ProductHighlightVO[] newArray(int i) {
            return new ProductHighlightVO[i];
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
        if (!(obj instanceof ProductHighlightVO)) {
            return false;
        }
        ProductHighlightVO productHighlightVO = (ProductHighlightVO) obj;
        return Intrinsics.LJFF(this.moduleData, productHighlightVO.moduleData) && Intrinsics.LJFF(this.uiConfig, productHighlightVO.uiConfig);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC746802vq
    public final String getItemId() {
        return null;
    }

    public final int hashCode() {
        ProductHighlightData productHighlightData = this.moduleData;
        int iHashCode = (productHighlightData == null ? 0 : productHighlightData.hashCode()) * 31;
        ProductHighlightUIConfig productHighlightUIConfig = this.uiConfig;
        return iHashCode + (productHighlightUIConfig != null ? productHighlightUIConfig.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductHighlightVO(moduleData=");
        sbLIZ.append(this.moduleData);
        sbLIZ.append(", uiConfig=");
        sbLIZ.append(this.uiConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ProductHighlightData productHighlightData = this.moduleData;
        if (productHighlightData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            productHighlightData.writeToParcel(parcel, i);
        }
        ProductHighlightUIConfig productHighlightUIConfig = this.uiConfig;
        if (productHighlightUIConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            productHighlightUIConfig.writeToParcel(parcel, i);
        }
    }

    @Override // X.C04DW
    public final String getGodaNodeId() {
        return this.godaNodeId;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C703902ov.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.C04DW
    public final void setGodaGroupId(String str) {
        this.godaGroupId = str;
    }

    @Override // X.C04DW
    public final void setGodaNodeId(String str) {
        this.godaNodeId = str;
    }

    public ProductHighlightVO(ProductHighlightData productHighlightData, ProductHighlightUIConfig productHighlightUIConfig) {
        this.moduleData = productHighlightData;
        this.uiConfig = productHighlightUIConfig;
    }
}
