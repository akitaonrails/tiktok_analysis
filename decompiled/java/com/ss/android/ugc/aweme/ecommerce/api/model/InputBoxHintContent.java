package com.ss.android.ugc.aweme.ecommerce.api.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.InputBoxHintContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class InputBoxHintContent implements Parcelable {
    public static final Parcelable.Creator<InputBoxHintContent> CREATOR = new Parcelable.Creator<InputBoxHintContent>() { // from class: X.02Xs
        @Override // android.os.Parcelable.Creator
        public final InputBoxHintContent createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new InputBoxHintContent(numValueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final InputBoxHintContent[] newArray(int i) {
            return new InputBoxHintContent[i];
        }
    };

    @C09CT("hint_message")
    public String hintMessage;

    @C09CT("input_box_hint_type")
    public Integer inputBoxHintType;

    @C09CT("input_box_key")
    public String inputBoxKey;

    public InputBoxHintContent() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputBoxHintContent)) {
            return false;
        }
        InputBoxHintContent inputBoxHintContent = (InputBoxHintContent) obj;
        return Intrinsics.LJFF(this.inputBoxHintType, inputBoxHintContent.inputBoxHintType) && Intrinsics.LJFF(this.inputBoxKey, inputBoxHintContent.inputBoxKey) && Intrinsics.LJFF(this.hintMessage, inputBoxHintContent.hintMessage);
    }

    public final int hashCode() {
        Integer num = this.inputBoxHintType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.inputBoxKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.hintMessage;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InputBoxHintContent(inputBoxHintType=");
        sbLIZ.append(this.inputBoxHintType);
        sbLIZ.append(", inputBoxKey=");
        sbLIZ.append(this.inputBoxKey);
        sbLIZ.append(", hintMessage=");
        sbLIZ.append(this.hintMessage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.inputBoxHintType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.inputBoxKey);
        parcel.writeString(this.hintMessage);
    }

    public InputBoxHintContent(Integer num, String str, String str2) {
        this.inputBoxHintType = num;
        this.inputBoxKey = str;
        this.hintMessage = str2;
    }
}
