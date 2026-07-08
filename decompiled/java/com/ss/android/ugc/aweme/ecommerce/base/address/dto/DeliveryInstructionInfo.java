package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class DeliveryInstructionInfo implements Parcelable {

    @C09CT("display_content")
    public String displayContent;

    @C09CT("extra_params")
    public String extraParams;

    @C09CT("instruction")
    public String instruction;

    @C09CT("instruction_type")
    public Integer instructionType;

    @C09CT("items")
    public List<AddressItem> items;
    public static final Parcelable.Creator<DeliveryInstructionInfo> CREATOR = new Parcelable.Creator<DeliveryInstructionInfo>() { // from class: X.02qJ
        @Override // android.os.Parcelable.Creator
        public final DeliveryInstructionInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(AddressItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new DeliveryInstructionInfo(numValueOf, string, string2, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryInstructionInfo[] newArray(int i) {
            return new DeliveryInstructionInfo[i];
        }
    };
    public static final int $stable = 8;

    public DeliveryInstructionInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryInstructionInfo)) {
            return false;
        }
        DeliveryInstructionInfo deliveryInstructionInfo = (DeliveryInstructionInfo) obj;
        return Intrinsics.LJFF(this.instructionType, deliveryInstructionInfo.instructionType) && Intrinsics.LJFF(this.instruction, deliveryInstructionInfo.instruction) && Intrinsics.LJFF(this.displayContent, deliveryInstructionInfo.displayContent) && Intrinsics.LJFF(this.items, deliveryInstructionInfo.items) && Intrinsics.LJFF(this.extraParams, deliveryInstructionInfo.extraParams);
    }

    public final int hashCode() {
        Integer num = this.instructionType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.instruction;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.displayContent;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<AddressItem> list = this.items;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.extraParams;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeliveryInstructionInfo(instructionType=");
        sbLIZ.append(this.instructionType);
        sbLIZ.append(", instruction=");
        sbLIZ.append(this.instruction);
        sbLIZ.append(", displayContent=");
        sbLIZ.append(this.displayContent);
        sbLIZ.append(", items=");
        sbLIZ.append(this.items);
        sbLIZ.append(", extraParams=");
        sbLIZ.append(this.extraParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.instructionType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.instruction);
        parcel.writeString(this.displayContent);
        List<AddressItem> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<AddressItem> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.extraParams);
    }

    public DeliveryInstructionInfo(Integer num, String str, String str2, List<AddressItem> list, String str3) {
        this.instructionType = num;
        this.instruction = str;
        this.displayContent = str2;
        this.items = list;
        this.extraParams = str3;
    }
}
