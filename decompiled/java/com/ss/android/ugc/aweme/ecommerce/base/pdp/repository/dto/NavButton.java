package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NavButton;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class NavButton implements Parcelable {

    @C09CT("button_action")
    public final Integer action;

    @C09CT("button_name")
    public final String buttonName;

    @C09CT("click_toast")
    public final String clickToast;

    @C09CT("icon")
    public final String icon;

    @C09CT("schema")
    public final String schema;

    @C09CT("show_count")
    public final Integer showCount;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("style")
    public final Integer style;

    @C09CT("text")
    public final String text;
    public static final Parcelable.Creator<NavButton> CREATOR = new Parcelable.Creator<NavButton>() { // from class: X.0w7q
        @Override // android.os.Parcelable.Creator
        public final NavButton createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Integer numValueOf4 = null;
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
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            return new NavButton(string, string2, string3, numValueOf, numValueOf2, numValueOf3, numValueOf4, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NavButton[] newArray(int i) {
            return new NavButton[i];
        }
    };
    public static final int $stable = 8;

    public NavButton() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavButton)) {
            return false;
        }
        NavButton navButton = (NavButton) obj;
        return Intrinsics.LJFF(this.icon, navButton.icon) && Intrinsics.LJFF(this.text, navButton.text) && Intrinsics.LJFF(this.schema, navButton.schema) && Intrinsics.LJFF(this.style, navButton.style) && Intrinsics.LJFF(this.status, navButton.status) && Intrinsics.LJFF(this.action, navButton.action) && Intrinsics.LJFF(this.showCount, navButton.showCount) && Intrinsics.LJFF(this.buttonName, navButton.buttonName) && Intrinsics.LJFF(this.clickToast, navButton.clickToast);
    }

    public final int hashCode() {
        String str = this.icon;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.schema;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.style;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.status;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.action;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.showCount;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str4 = this.buttonName;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.clickToast;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NavButton(icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", style=");
        sbLIZ.append(this.style);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", action=");
        sbLIZ.append(this.action);
        sbLIZ.append(", showCount=");
        sbLIZ.append(this.showCount);
        sbLIZ.append(", buttonName=");
        sbLIZ.append(this.buttonName);
        sbLIZ.append(", clickToast=");
        sbLIZ.append(this.clickToast);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.icon);
        parcel.writeString(this.text);
        parcel.writeString(this.schema);
        Integer num = this.style;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.status;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.action;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.showCount;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeString(this.buttonName);
        parcel.writeString(this.clickToast);
    }

    public NavButton(String str, String str2, String str3, Integer num, Integer num2, Integer num3, Integer num4, String str4, String str5) {
        this.icon = str;
        this.text = str2;
        this.schema = str3;
        this.style = num;
        this.status = num2;
        this.action = num3;
        this.showCount = num4;
        this.buttonName = str4;
        this.clickToast = str5;
    }
}
