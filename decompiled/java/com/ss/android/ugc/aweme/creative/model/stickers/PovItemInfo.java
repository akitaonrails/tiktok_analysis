package com.ss.android.ugc.aweme.creative.model.stickers;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.stickers.PovItemInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PovItemInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<PovItemInfo> CREATOR = new Parcelable.Creator<PovItemInfo>() { // from class: X.0n5i
        @Override // android.os.Parcelable.Creator
        public final PovItemInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new PovItemInfo(string, string2, numValueOf, string3, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final PovItemInfo[] newArray(int i) {
            return new PovItemInfo[i];
        }
    };

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("is_star")
    public Boolean isStar;

    @C09CT("pov_type")
    public final Integer povType;

    @C09CT("text")
    public String text;

    @C09CT("TypeMessage")
    public final String typeMessage;

    public PovItemInfo() {
        this(null, null, null, null, Boolean.FALSE);
    }

    public final PovItemInfo copy(String str, String str2, Integer num, String str3, Boolean bool) {
        return new PovItemInfo(str, str2, num, str3, bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PovItemInfo(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", iconUrl=");
        sbLIZ.append(this.iconUrl);
        sbLIZ.append(", povType=");
        sbLIZ.append(this.povType);
        sbLIZ.append(", typeMessage=");
        sbLIZ.append(this.typeMessage);
        sbLIZ.append(", isStar=");
        sbLIZ.append(this.isStar);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.iconUrl);
        Integer num = this.povType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.typeMessage);
        Boolean bool = this.isStar;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public int hashCode() {
        String str = this.text;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final Integer getPovType() {
        return this.povType;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTypeMessage() {
        return this.typeMessage;
    }

    public final Boolean isStar() {
        return this.isStar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PovItemInfo)) {
            return false;
        }
        return Intrinsics.LJFF(this.text, ((PovItemInfo) obj).text);
    }

    public final void setStar(Boolean bool) {
        this.isStar = bool;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public PovItemInfo(String str, String str2, Integer num, String str3, Boolean bool) {
        this.text = str;
        this.iconUrl = str2;
        this.povType = num;
        this.typeMessage = str3;
        this.isStar = bool;
    }
}
