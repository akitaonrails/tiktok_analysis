package com.ss.android.ugc.aweme.ecommerce.api.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.AddressLocation;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class DialogContent implements Parcelable {
    public static final Parcelable.Creator<DialogContent> CREATOR = new Parcelable.Creator<DialogContent>() { // from class: X.02kY
        @Override // android.os.Parcelable.Creator
        public final DialogContent createFromParcel(Parcel parcel) {
            Integer numValueOf;
            boolean z;
            Boolean boolValueOf;
            Integer numValueOf2;
            ArrayList arrayList;
            Integer numValueOf3;
            Integer numValueOf4;
            AddressLocation addressLocationCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf5 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
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
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(DialogButton.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                addressLocationCreateFromParcel = null;
            } else {
                addressLocationCreateFromParcel = AddressLocation.CREATOR.createFromParcel(parcel);
            }
            AddressLocation addressLocation = addressLocationCreateFromParcel;
            if (parcel.readInt() != 0) {
                numValueOf5 = Integer.valueOf(parcel.readInt());
            }
            return new DialogContent(string, string2, numValueOf, boolValueOf, numValueOf2, arrayList, numValueOf3, numValueOf4, string3, string4, string5, addressLocation, numValueOf5);
        }

        @Override // android.os.Parcelable.Creator
        public final DialogContent[] newArray(int i) {
            return new DialogContent[i];
        }
    };

    @C09CT("address_location")
    public AddressLocation addressLocation;

    @C09CT("button_direction")
    public Integer buttonDirection;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("da_info_type")
    public Integer daInfoType;

    @C09CT("dark_icon")
    public String darkIcon;

    @C09CT("dialog_button")
    public List<DialogButton> dialogButtons;

    @C09CT("dialog_level")
    public Integer dialogLevel;

    @C09CT("dialog_type")
    public Integer dialogType;

    @C09CT("has_close_button")
    public Boolean hasCloseButton;

    @C09CT("light_icon")
    public String lightIcon;

    @C09CT("mask_style")
    public Integer maskStyle;

    @C09CT("message")
    public String message;

    @C09CT("title")
    public String title;

    public DialogContent() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogContent)) {
            return false;
        }
        DialogContent dialogContent = (DialogContent) obj;
        return Intrinsics.LJFF(this.title, dialogContent.title) && Intrinsics.LJFF(this.message, dialogContent.message) && Intrinsics.LJFF(this.dialogType, dialogContent.dialogType) && Intrinsics.LJFF(this.hasCloseButton, dialogContent.hasCloseButton) && Intrinsics.LJFF(this.buttonDirection, dialogContent.buttonDirection) && Intrinsics.LJFF(this.dialogButtons, dialogContent.dialogButtons) && Intrinsics.LJFF(this.dialogLevel, dialogContent.dialogLevel) && Intrinsics.LJFF(this.daInfoType, dialogContent.daInfoType) && Intrinsics.LJFF(this.daInfo, dialogContent.daInfo) && Intrinsics.LJFF(this.lightIcon, dialogContent.lightIcon) && Intrinsics.LJFF(this.darkIcon, dialogContent.darkIcon) && Intrinsics.LJFF(this.addressLocation, dialogContent.addressLocation) && Intrinsics.LJFF(this.maskStyle, dialogContent.maskStyle);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.message.hashCode()) * 31;
        Integer num = this.dialogType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.hasCloseButton;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.buttonDirection;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<DialogButton> list = this.dialogButtons;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num3 = this.dialogLevel;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.daInfoType;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.daInfo;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lightIcon;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.darkIcon;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AddressLocation addressLocation = this.addressLocation;
        int iHashCode11 = (iHashCode10 + (addressLocation == null ? 0 : addressLocation.hashCode())) * 31;
        Integer num5 = this.maskStyle;
        return iHashCode11 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        return "DialogContent(title=" + this.title + ", message=" + this.message + ", dialogType=" + this.dialogType + ", hasCloseButton=" + this.hasCloseButton + ", buttonDirection=" + this.buttonDirection + ", dialogButtons=" + this.dialogButtons + ", dialogLevel=" + this.dialogLevel + ", daInfoType=" + this.daInfoType + ", daInfo=" + this.daInfo + ", lightIcon=" + this.lightIcon + ", darkIcon=" + this.darkIcon + ", addressLocation=" + this.addressLocation + ", maskStyle=" + this.maskStyle + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.message);
        Integer num = this.dialogType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool = this.hasCloseButton;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num2 = this.buttonDirection;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        List<DialogButton> list = this.dialogButtons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<DialogButton> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Integer num3 = this.dialogLevel;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.daInfoType;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeString(this.daInfo);
        parcel.writeString(this.lightIcon);
        parcel.writeString(this.darkIcon);
        AddressLocation addressLocation = this.addressLocation;
        if (addressLocation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addressLocation.writeToParcel(parcel, i);
        }
        Integer num5 = this.maskStyle;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
    }

    public DialogContent(String str, String str2, Integer num, Boolean bool, Integer num2, List<DialogButton> list, Integer num3, Integer num4, String str3, String str4, String str5, AddressLocation addressLocation, Integer num5) {
        this.title = str;
        this.message = str2;
        this.dialogType = num;
        this.hasCloseButton = bool;
        this.buttonDirection = num2;
        this.dialogButtons = list;
        this.dialogLevel = num3;
        this.daInfoType = num4;
        this.daInfo = str3;
        this.lightIcon = str4;
        this.darkIcon = str5;
        this.addressLocation = addressLocation;
        this.maskStyle = num5;
    }
}
