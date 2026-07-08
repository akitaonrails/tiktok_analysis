package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.StandardSaleProps;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class StandardSaleProps implements Parcelable {

    @C09CT("default_local_sign")
    public String defaultStandardSign;

    @C09CT("sale_props")
    public Map<String, SaleProp> standardSaleProp;
    public static final Parcelable.Creator<StandardSaleProps> CREATOR = new Parcelable.Creator<StandardSaleProps>() { // from class: X.02mI
        @Override // android.os.Parcelable.Creator
        public final StandardSaleProps createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), SaleProp.CREATOR.createFromParcel(parcel));
                }
            }
            return new StandardSaleProps(string, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final StandardSaleProps[] newArray(int i) {
            return new StandardSaleProps[i];
        }
    };
    public static final int $stable = 8;

    public StandardSaleProps() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StandardSaleProps)) {
            return false;
        }
        StandardSaleProps standardSaleProps = (StandardSaleProps) obj;
        return Intrinsics.LJFF(this.defaultStandardSign, standardSaleProps.defaultStandardSign) && Intrinsics.LJFF(this.standardSaleProp, standardSaleProps.standardSaleProp);
    }

    public final int hashCode() {
        String str = this.defaultStandardSign;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, SaleProp> map = this.standardSaleProp;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StandardSaleProps(defaultStandardSign=");
        sbLIZ.append(this.defaultStandardSign);
        sbLIZ.append(", standardSaleProp=");
        sbLIZ.append(this.standardSaleProp);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.defaultStandardSign);
        Map<String, SaleProp> map = this.standardSaleProp;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, SaleProp> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            entry.getValue().writeToParcel(parcel, i);
        }
    }

    public StandardSaleProps(String str, Map<String, SaleProp> map) {
        this.defaultStandardSign = str;
        this.standardSaleProp = map;
    }
}
