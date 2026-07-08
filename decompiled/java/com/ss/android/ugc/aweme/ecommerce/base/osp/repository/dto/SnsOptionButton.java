package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsOptionButton;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SnsOptionButton implements Parcelable {

    @C09CT("button_name")
    public String buttonName;

    @C09CT("button_text")
    public ECRichText buttonText;

    @C09CT("is_selected")
    public Boolean isSelected;
    public static final Parcelable.Creator<SnsOptionButton> CREATOR = new Parcelable.Creator<SnsOptionButton>() { // from class: X.02i3
        @Override // android.os.Parcelable.Creator
        public final SnsOptionButton createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(SnsOptionButton.class.getClassLoader());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new SnsOptionButton(eCRichText, string, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final SnsOptionButton[] newArray(int i) {
            return new SnsOptionButton[i];
        }
    };
    public static final int $stable = 8;

    public SnsOptionButton() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnsOptionButton)) {
            return false;
        }
        SnsOptionButton snsOptionButton = (SnsOptionButton) obj;
        return Intrinsics.LJFF(this.buttonText, snsOptionButton.buttonText) && Intrinsics.LJFF(this.buttonName, snsOptionButton.buttonName) && Intrinsics.LJFF(this.isSelected, snsOptionButton.isSelected);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.buttonText;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        String str = this.buttonName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isSelected;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SnsOptionButton(buttonText=");
        sbLIZ.append(this.buttonText);
        sbLIZ.append(", buttonName=");
        sbLIZ.append(this.buttonName);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.isSelected);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeParcelable(this.buttonText, i);
        parcel.writeString(this.buttonName);
        Boolean bool = this.isSelected;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public SnsOptionButton(ECRichText eCRichText, String str, Boolean bool) {
        this.buttonText = eCRichText;
        this.buttonName = str;
        this.isSelected = bool;
    }
}
