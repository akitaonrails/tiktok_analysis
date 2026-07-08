package com.ss.android.ugc.aweme.ecommerce.api.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.ToastContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ToastContent implements Parcelable {
    public static final Parcelable.Creator<ToastContent> CREATOR = new Parcelable.Creator<ToastContent>() { // from class: X.02kn
        @Override // android.os.Parcelable.Creator
        public final ToastContent createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            Integer numValueOf4;
            Integer numValueOf5;
            Integer numValueOf6;
            Integer numValueOf7 = null;
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
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
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
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf5 = null;
            } else {
                numValueOf5 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf6 = null;
            } else {
                numValueOf6 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf7 = Integer.valueOf(parcel.readInt());
            }
            return new ToastContent(numValueOf, numValueOf2, string, string2, string3, numValueOf3, numValueOf4, string4, string5, numValueOf5, numValueOf6, numValueOf7);
        }

        @Override // android.os.Parcelable.Creator
        public final ToastContent[] newArray(int i) {
            return new ToastContent[i];
        }
    };

    @C09CT("action_type")
    public Integer actionType;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("schema_disclosure_text")
    public String disclosureText;

    @C09CT("duration")
    public Integer duration;

    @C09CT("icon_height")
    public Integer iconHeight;

    @C09CT("icon")
    public String iconRes;

    @C09CT("icon_type")
    public Integer iconType;

    @C09CT("icon_weight")
    public Integer iconWidth;

    @C09CT("message")
    public String message;

    @C09CT("position")
    public Integer position;

    @C09CT("schema")
    public String schema;

    @C09CT("toast_type")
    public Integer toastType;

    public ToastContent() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToastContent)) {
            return false;
        }
        ToastContent toastContent = (ToastContent) obj;
        return Intrinsics.LJFF(this.toastType, toastContent.toastType) && Intrinsics.LJFF(this.duration, toastContent.duration) && Intrinsics.LJFF(this.message, toastContent.message) && Intrinsics.LJFF(this.daInfo, toastContent.daInfo) && Intrinsics.LJFF(this.iconRes, toastContent.iconRes) && Intrinsics.LJFF(this.iconWidth, toastContent.iconWidth) && Intrinsics.LJFF(this.iconHeight, toastContent.iconHeight) && Intrinsics.LJFF(this.disclosureText, toastContent.disclosureText) && Intrinsics.LJFF(this.schema, toastContent.schema) && Intrinsics.LJFF(this.position, toastContent.position) && Intrinsics.LJFF(this.actionType, toastContent.actionType) && Intrinsics.LJFF(this.iconType, toastContent.iconType);
    }

    public final int hashCode() {
        Integer num = this.toastType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.duration;
        int iHashCode2 = (((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31) + this.message.hashCode()) * 31;
        String str = this.daInfo;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconRes;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.iconWidth;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.iconHeight;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.disclosureText;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.schema;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num5 = this.position;
        int iHashCode9 = (iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.actionType;
        int iHashCode10 = (iHashCode9 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.iconType;
        return iHashCode10 + (num7 != null ? num7.hashCode() : 0);
    }

    public final String toString() {
        return "ToastContent(toastType=" + this.toastType + ", duration=" + this.duration + ", message=" + this.message + ", daInfo=" + this.daInfo + ", iconRes=" + this.iconRes + ", iconWidth=" + this.iconWidth + ", iconHeight=" + this.iconHeight + ", disclosureText=" + this.disclosureText + ", schema=" + this.schema + ", position=" + this.position + ", actionType=" + this.actionType + ", iconType=" + this.iconType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.toastType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.duration;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.message);
        parcel.writeString(this.daInfo);
        parcel.writeString(this.iconRes);
        Integer num3 = this.iconWidth;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.iconHeight;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeString(this.disclosureText);
        parcel.writeString(this.schema);
        Integer num5 = this.position;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Integer num6 = this.actionType;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        Integer num7 = this.iconType;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num7.intValue());
        }
    }

    public ToastContent(Integer num, Integer num2, String str, String str2, String str3, Integer num3, Integer num4, String str4, String str5, Integer num5, Integer num6, Integer num7) {
        this.toastType = num;
        this.duration = num2;
        this.message = str;
        this.daInfo = str2;
        this.iconRes = str3;
        this.iconWidth = num3;
        this.iconHeight = num4;
        this.disclosureText = str4;
        this.schema = str5;
        this.position = num5;
        this.actionType = num6;
        this.iconType = num7;
    }
}
