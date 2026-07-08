package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstruction;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class DeliveryInstruction implements Parcelable {

    @C09CT("description")
    public final String description;

    @C09CT("lynx_data")
    public final String lynxData;

    @C09CT("lynx_schema")
    public final String lynxSchema;

    @C09CT("options")
    public final List<DeliveryInstructionOption> options;

    @C09CT("drop_off_title")
    public final String title;

    @C09CT("ui_style")
    public final String uiStyle;
    public static final Parcelable.Creator<DeliveryInstruction> CREATOR = new Parcelable.Creator<DeliveryInstruction>() { // from class: X.036y
        @Override // android.os.Parcelable.Creator
        public final DeliveryInstruction createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(DeliveryInstructionOption.CREATOR.createFromParcel(parcel));
                }
            }
            return new DeliveryInstruction(string, string2, arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryInstruction[] newArray(int i) {
            return new DeliveryInstruction[i];
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
        if (!(obj instanceof DeliveryInstruction)) {
            return false;
        }
        DeliveryInstruction deliveryInstruction = (DeliveryInstruction) obj;
        return Intrinsics.LJFF(this.title, deliveryInstruction.title) && Intrinsics.LJFF(this.description, deliveryInstruction.description) && Intrinsics.LJFF(this.options, deliveryInstruction.options) && Intrinsics.LJFF(this.uiStyle, deliveryInstruction.uiStyle) && Intrinsics.LJFF(this.lynxSchema, deliveryInstruction.lynxSchema) && Intrinsics.LJFF(this.lynxData, deliveryInstruction.lynxData);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<DeliveryInstructionOption> list = this.options;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.uiStyle;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lynxSchema;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.lynxData;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeliveryInstruction(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", options=");
        sbLIZ.append(this.options);
        sbLIZ.append(", uiStyle=");
        sbLIZ.append(this.uiStyle);
        sbLIZ.append(", lynxSchema=");
        sbLIZ.append(this.lynxSchema);
        sbLIZ.append(", lynxData=");
        sbLIZ.append(this.lynxData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        List<DeliveryInstructionOption> list = this.options;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<DeliveryInstructionOption> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.uiStyle);
        parcel.writeString(this.lynxSchema);
        parcel.writeString(this.lynxData);
    }

    public DeliveryInstruction(String str, String str2, List<DeliveryInstructionOption> list, String str3, String str4, String str5) {
        this.title = str;
        this.description = str2;
        this.options = list;
        this.uiStyle = str3;
        this.lynxSchema = str4;
        this.lynxData = str5;
    }
}
