package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productinterlink;

import X.C04DV;
import X.C04DW;
import X.C04FN;
import X.C09CT;
import X.C2188811AlT;
import X.C703902ov;
import X.InterfaceC1891350zJl;
import X.InterfaceC746802vq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productinterlink.ProductInterlinkItemVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productinterlink.ProductInterlinkModuleVO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ProductInterlinkModuleVO implements Parcelable, InterfaceC746802vq, C04DW, C04DV {

    @C09CT("module_da_info")
    public final String daInfo;
    public C04FN goda2Node;
    public String godaGroupId = "undefined";
    public String godaNodeId = "undefined";

    @C09CT("property_values")
    public final List<ProductInterlinkItemVO> propertyValues;

    @C09CT("property_name")
    public final String title;
    public static final Parcelable.Creator<ProductInterlinkModuleVO> CREATOR = new Parcelable.Creator<ProductInterlinkModuleVO>() { // from class: X.03xA
        @Override // android.os.Parcelable.Creator
        public final ProductInterlinkModuleVO createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ProductInterlinkItemVO.CREATOR.createFromParcel(parcel));
                }
            }
            return new ProductInterlinkModuleVO(string, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ProductInterlinkModuleVO[] newArray(int i) {
            return new ProductInterlinkModuleVO[i];
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
        if (!(obj instanceof ProductInterlinkModuleVO)) {
            return false;
        }
        ProductInterlinkModuleVO productInterlinkModuleVO = (ProductInterlinkModuleVO) obj;
        return Intrinsics.LJFF(this.title, productInterlinkModuleVO.title) && Intrinsics.LJFF(this.propertyValues, productInterlinkModuleVO.propertyValues) && Intrinsics.LJFF(this.daInfo, productInterlinkModuleVO.daInfo);
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
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ProductInterlinkItemVO> list = this.propertyValues;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.daInfo;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductInterlinkModuleVO(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", propertyValues=");
        sbLIZ.append(this.propertyValues);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        List<ProductInterlinkItemVO> list = this.propertyValues;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ProductInterlinkItemVO> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.daInfo);
    }

    @Override // X.C04DV
    public final C04FN LJIIIIZZ() {
        return this.goda2Node;
    }

    @Override // X.C04DW
    public final String getGodaNodeId() {
        return this.godaNodeId;
    }

    @Override // X.C04DV
    public final void LIZIZ(C04FN c04fn) {
        this.goda2Node = c04fn;
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

    public ProductInterlinkModuleVO(String str, List<ProductInterlinkItemVO> list, String str2) {
        this.title = str;
        this.propertyValues = list;
        this.daInfo = str2;
    }
}
