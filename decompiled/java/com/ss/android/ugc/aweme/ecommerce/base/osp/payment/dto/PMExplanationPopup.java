package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PMExplanationPopup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PMExplanationPopup implements Parcelable {

    @C09CT("button_direction")
    public Integer buttonDirection;

    @C09CT("dark_icon")
    public String darkIcon;

    @C09CT("description")
    public String description;

    @C09CT("dialog_button")
    public List<DialogButton> dialogButtons;

    @C09CT("icon")
    public String icon;

    @C09CT("icon_description")
    public String iconDescription;

    @C09CT("supported_methods_title")
    public String supportedMethodsTitle;

    @C09CT("title")
    public String title;
    public static final Parcelable.Creator<PMExplanationPopup> CREATOR = new Parcelable.Creator<PMExplanationPopup>() { // from class: X.02TP
        @Override // android.os.Parcelable.Creator
        public final PMExplanationPopup createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(PMExplanationPopup.class.getClassLoader()));
                }
            }
            return new PMExplanationPopup(string, string2, string3, string4, string5, string6, numValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PMExplanationPopup[] newArray(int i) {
            return new PMExplanationPopup[i];
        }
    };
    public static final int $stable = 8;

    public PMExplanationPopup() {
        this(null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PMExplanationPopup)) {
            return false;
        }
        PMExplanationPopup pMExplanationPopup = (PMExplanationPopup) obj;
        return Intrinsics.LJFF(this.title, pMExplanationPopup.title) && Intrinsics.LJFF(this.description, pMExplanationPopup.description) && Intrinsics.LJFF(this.supportedMethodsTitle, pMExplanationPopup.supportedMethodsTitle) && Intrinsics.LJFF(this.icon, pMExplanationPopup.icon) && Intrinsics.LJFF(this.darkIcon, pMExplanationPopup.darkIcon) && Intrinsics.LJFF(this.iconDescription, pMExplanationPopup.iconDescription) && Intrinsics.LJFF(this.buttonDirection, pMExplanationPopup.buttonDirection) && Intrinsics.LJFF(this.dialogButtons, pMExplanationPopup.dialogButtons);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.supportedMethodsTitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.darkIcon;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.iconDescription;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.buttonDirection;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        List<DialogButton> list = this.dialogButtons;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PMExplanationPopup(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", supportedMethodsTitle=");
        sbLIZ.append(this.supportedMethodsTitle);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", darkIcon=");
        sbLIZ.append(this.darkIcon);
        sbLIZ.append(", iconDescription=");
        sbLIZ.append(this.iconDescription);
        sbLIZ.append(", buttonDirection=");
        sbLIZ.append(this.buttonDirection);
        sbLIZ.append(", dialogButtons=");
        sbLIZ.append(this.dialogButtons);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.supportedMethodsTitle);
        parcel.writeString(this.icon);
        parcel.writeString(this.darkIcon);
        parcel.writeString(this.iconDescription);
        Integer num = this.buttonDirection;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<DialogButton> list = this.dialogButtons;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<DialogButton> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
    }

    public PMExplanationPopup(String str, String str2, String str3, String str4, String str5, String str6, Integer num, List<DialogButton> list) {
        this.title = str;
        this.description = str2;
        this.supportedMethodsTitle = str3;
        this.icon = str4;
        this.darkIcon = str5;
        this.iconDescription = str6;
        this.buttonDirection = num;
        this.dialogButtons = list;
    }
}
