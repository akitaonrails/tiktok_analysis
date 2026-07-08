package com.ss.android.ugc.aweme.relation.consent;

import X.C1074060e3Y;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.relation.consent.SocialConsentConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class SocialConsentConfig implements Parcelable {
    public final CharSequence desc;
    public final String header;
    public final int iconRes;
    public final String leftButtonText;
    public final String rightButtonText;
    public final int socialRecType;
    public final int step;
    public final String title;
    public final String toast;
    public static final C1074060e3Y CREATOR = new Parcelable.Creator<SocialConsentConfig>() { // from class: X.0e3Y
        @Override // android.os.Parcelable.Creator
        public final SocialConsentConfig createFromParcel(Parcel parcel) {
            return new SocialConsentConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SocialConsentConfig[] newArray(int i) {
            return new SocialConsentConfig[i];
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
        if (!(obj instanceof SocialConsentConfig)) {
            return false;
        }
        SocialConsentConfig socialConsentConfig = (SocialConsentConfig) obj;
        return this.socialRecType == socialConsentConfig.socialRecType && Intrinsics.LJFF(this.header, socialConsentConfig.header) && this.iconRes == socialConsentConfig.iconRes && Intrinsics.LJFF(this.title, socialConsentConfig.title) && Intrinsics.LJFF(this.desc, socialConsentConfig.desc) && Intrinsics.LJFF(this.leftButtonText, socialConsentConfig.leftButtonText) && Intrinsics.LJFF(this.rightButtonText, socialConsentConfig.rightButtonText) && Intrinsics.LJFF(this.toast, socialConsentConfig.toast) && this.step == socialConsentConfig.step;
    }

    public final int hashCode() {
        return (((((((((((((((this.socialRecType * 31) + this.header.hashCode()) * 31) + this.iconRes) * 31) + this.title.hashCode()) * 31) + this.desc.hashCode()) * 31) + this.leftButtonText.hashCode()) * 31) + this.rightButtonText.hashCode()) * 31) + this.toast.hashCode()) * 31) + this.step;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialConsentConfig(socialRecType=");
        sbLIZ.append(this.socialRecType);
        sbLIZ.append(", header=");
        sbLIZ.append(this.header);
        sbLIZ.append(", iconRes=");
        sbLIZ.append(this.iconRes);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", desc=");
        sbLIZ.append((Object) this.desc);
        sbLIZ.append(", leftButtonText=");
        sbLIZ.append(this.leftButtonText);
        sbLIZ.append(", rightButtonText=");
        sbLIZ.append(this.rightButtonText);
        sbLIZ.append(", toast=");
        sbLIZ.append(this.toast);
        sbLIZ.append(", step=");
        sbLIZ.append(this.step);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SocialConsentConfig(Parcel parcel) {
        int i = parcel.readInt();
        String string = parcel.readString();
        string = string == null ? "" : string;
        int i2 = parcel.readInt();
        String string2 = parcel.readString();
        string2 = string2 == null ? "" : string2;
        String str = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        str = str == null ? "" : str;
        String string3 = parcel.readString();
        string3 = string3 == null ? "" : string3;
        String string4 = parcel.readString();
        string4 = string4 == null ? "" : string4;
        String string5 = parcel.readString();
        String str2 = string5 != null ? string5 : "";
        int i3 = parcel.readInt();
        this.socialRecType = i;
        this.header = string;
        this.iconRes = i2;
        this.title = string2;
        this.desc = str;
        this.leftButtonText = string3;
        this.rightButtonText = string4;
        this.toast = str2;
        this.step = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.socialRecType);
        parcel.writeString(this.header);
        parcel.writeInt(this.iconRes);
        parcel.writeString(this.title);
        TextUtils.writeToParcel(this.desc, parcel, i);
        parcel.writeString(this.leftButtonText);
        parcel.writeString(this.rightButtonText);
        parcel.writeString(this.toast);
        parcel.writeInt(this.step);
    }
}
