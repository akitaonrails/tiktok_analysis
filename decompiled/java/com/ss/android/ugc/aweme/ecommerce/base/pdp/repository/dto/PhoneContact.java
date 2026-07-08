package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PhoneContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PhoneContact implements Parcelable {

    @C09CT("button_text")
    public String buttonText;

    @C09CT("copy_icon")
    public Icon copyIcon;

    @C09CT("message")
    public String message;

    @C09CT("phone_num")
    public String phoneNum;

    @C09CT("title")
    public String title;
    public static final Parcelable.Creator<PhoneContact> CREATOR = new Parcelable.Creator<PhoneContact>() { // from class: X.02km
        @Override // android.os.Parcelable.Creator
        public final PhoneContact createFromParcel(Parcel parcel) {
            return new PhoneContact(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Icon) parcel.readParcelable(PhoneContact.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PhoneContact[] newArray(int i) {
            return new PhoneContact[i];
        }
    };
    public static final int $stable = 8;

    public PhoneContact() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneContact)) {
            return false;
        }
        PhoneContact phoneContact = (PhoneContact) obj;
        return Intrinsics.LJFF(this.title, phoneContact.title) && Intrinsics.LJFF(this.message, phoneContact.message) && Intrinsics.LJFF(this.phoneNum, phoneContact.phoneNum) && Intrinsics.LJFF(this.buttonText, phoneContact.buttonText) && Intrinsics.LJFF(this.copyIcon, phoneContact.copyIcon);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phoneNum;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buttonText;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Icon icon = this.copyIcon;
        return iHashCode4 + (icon != null ? icon.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhoneContact(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", phoneNum=");
        sbLIZ.append(this.phoneNum);
        sbLIZ.append(", buttonText=");
        sbLIZ.append(this.buttonText);
        sbLIZ.append(", copyIcon=");
        sbLIZ.append(this.copyIcon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.message);
        parcel.writeString(this.phoneNum);
        parcel.writeString(this.buttonText);
        parcel.writeParcelable(this.copyIcon, i);
    }

    public PhoneContact(String str, String str2, String str3, String str4, Icon icon) {
        this.title = str;
        this.message = str2;
        this.phoneNum = str3;
        this.buttonText = str4;
        this.copyIcon = icon;
    }
}
