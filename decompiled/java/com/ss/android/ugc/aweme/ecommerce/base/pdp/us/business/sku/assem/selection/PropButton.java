package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection;

import X.C09CT;
import X.C2188811AlT;
import X.C742502v9;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.PropButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.PropButtonExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PropButton implements Parcelable {

    @C09CT("button_action")
    public final Integer buttonAction;

    @C09CT("button_text")
    public final ECRichText buttonText;

    @C09CT("button_type")
    public final Integer buttonType;

    @C09CT("extra_info")
    public final PropButtonExtraInfo extraInfo;

    @C09CT("schema")
    public final String schema;
    public static final C742502v9 Companion = new Object() { // from class: X.02v9
    };
    public static final Parcelable.Creator<PropButton> CREATOR = new Parcelable.Creator<PropButton>() { // from class: X.02v8
        @Override // android.os.Parcelable.Creator
        public final PropButton createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(PropButton.class.getClassLoader());
            String string = parcel.readString();
            PropButtonExtraInfo propButtonExtraInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                propButtonExtraInfoCreateFromParcel = PropButtonExtraInfo.CREATOR.createFromParcel(parcel);
            }
            return new PropButton(eCRichText, string, numValueOf, numValueOf2, propButtonExtraInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PropButton[] newArray(int i) {
            return new PropButton[i];
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
        if (!(obj instanceof PropButton)) {
            return false;
        }
        PropButton propButton = (PropButton) obj;
        return Intrinsics.LJFF(this.buttonText, propButton.buttonText) && Intrinsics.LJFF(this.schema, propButton.schema) && Intrinsics.LJFF(this.buttonAction, propButton.buttonAction) && Intrinsics.LJFF(this.buttonType, propButton.buttonType) && Intrinsics.LJFF(this.extraInfo, propButton.extraInfo);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.buttonText;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        String str = this.schema;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.buttonAction;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.buttonType;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        PropButtonExtraInfo propButtonExtraInfo = this.extraInfo;
        return iHashCode4 + (propButtonExtraInfo != null ? propButtonExtraInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PropButton(buttonText=");
        sbLIZ.append(this.buttonText);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", buttonAction=");
        sbLIZ.append(this.buttonAction);
        sbLIZ.append(", buttonType=");
        sbLIZ.append(this.buttonType);
        sbLIZ.append(", extraInfo=");
        sbLIZ.append(this.extraInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.buttonText, i);
        parcel.writeString(this.schema);
        Integer num = this.buttonAction;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.buttonType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        PropButtonExtraInfo propButtonExtraInfo = this.extraInfo;
        if (propButtonExtraInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            propButtonExtraInfo.writeToParcel(parcel, i);
        }
    }

    public PropButton(ECRichText eCRichText, String str, Integer num, Integer num2, PropButtonExtraInfo propButtonExtraInfo) {
        this.buttonText = eCRichText;
        this.schema = str;
        this.buttonAction = num;
        this.buttonType = num2;
        this.extraInfo = propButtonExtraInfo;
    }
}
