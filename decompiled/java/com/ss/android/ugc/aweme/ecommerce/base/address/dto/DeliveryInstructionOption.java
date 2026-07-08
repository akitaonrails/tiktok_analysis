package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionOption;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class DeliveryInstructionOption implements Parcelable {

    @C09CT("instruction_en")
    public final String daInstruction;

    @C09CT("hint")
    public final String hint;

    @C09CT("instruction")
    public final String instruction;

    @C09CT("instruction_type")
    public final Integer instructionType;

    @C09CT("max_length")
    public final Integer maxLength;

    @C09CT("rule")
    public final List<Rule> rules;
    public static final Parcelable.Creator<DeliveryInstructionOption> CREATOR = new Parcelable.Creator<DeliveryInstructionOption>() { // from class: X.02xw
        @Override // android.os.Parcelable.Creator
        public final DeliveryInstructionOption createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Rule.CREATOR.createFromParcel(parcel));
                }
            }
            return new DeliveryInstructionOption(numValueOf, string, numValueOf2, string2, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryInstructionOption[] newArray(int i) {
            return new DeliveryInstructionOption[i];
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
        if (!(obj instanceof DeliveryInstructionOption)) {
            return false;
        }
        DeliveryInstructionOption deliveryInstructionOption = (DeliveryInstructionOption) obj;
        return Intrinsics.LJFF(this.instructionType, deliveryInstructionOption.instructionType) && Intrinsics.LJFF(this.instruction, deliveryInstructionOption.instruction) && Intrinsics.LJFF(this.maxLength, deliveryInstructionOption.maxLength) && Intrinsics.LJFF(this.hint, deliveryInstructionOption.hint) && Intrinsics.LJFF(this.rules, deliveryInstructionOption.rules) && Intrinsics.LJFF(this.daInstruction, deliveryInstructionOption.daInstruction);
    }

    public final int hashCode() {
        Integer num = this.instructionType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.instruction;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.maxLength;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.hint;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Rule> list = this.rules;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.daInstruction;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeliveryInstructionOption(instructionType=");
        sbLIZ.append(this.instructionType);
        sbLIZ.append(", instruction=");
        sbLIZ.append(this.instruction);
        sbLIZ.append(", maxLength=");
        sbLIZ.append(this.maxLength);
        sbLIZ.append(", hint=");
        sbLIZ.append(this.hint);
        sbLIZ.append(", rules=");
        sbLIZ.append(this.rules);
        sbLIZ.append(", daInstruction=");
        sbLIZ.append(this.daInstruction);
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
        Integer num2 = this.maxLength;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.hint);
        List<Rule> list = this.rules;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Rule> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.daInstruction);
    }

    public DeliveryInstructionOption(Integer num, String str, Integer num2, String str2, List<Rule> list, String str3) {
        this.instructionType = num;
        this.instruction = str;
        this.maxLength = num2;
        this.hint = str2;
        this.rules = list;
        this.daInstruction = str3;
    }
}
