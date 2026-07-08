package com.ss.android.ugc.tools.data;

import X.C2188811AlT;
import X.EnumC1783230wVN;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.tools.data.RawIcon;
import com.ss.android.ugc.tools.data.TitleBarAppearance;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class TitleBarAppearance implements Parcelable {
    public static final Parcelable.Creator<TitleBarAppearance> CREATOR = new Parcelable.Creator<TitleBarAppearance>() { // from class: X.18Wm
        @Override // android.os.Parcelable.Creator
        public final TitleBarAppearance createFromParcel(Parcel parcel) {
            RawIcon rawIconCreateFromParcel;
            int i = parcel.readInt();
            if (parcel.readInt() == 0) {
                rawIconCreateFromParcel = null;
            } else {
                rawIconCreateFromParcel = RawIcon.CREATOR.createFromParcel(parcel);
            }
            return new TitleBarAppearance(i, rawIconCreateFromParcel, EnumC1783230wVN.valueOf(parcel.readString()), EnumC1783230wVN.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final TitleBarAppearance[] newArray(int i) {
            return new TitleBarAppearance[i];
        }
    };
    public final RawIcon icon;
    public final EnumC1783230wVN leftButton;
    public final EnumC1783230wVN rightButton;
    public final int titleResId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitleBarAppearance)) {
            return false;
        }
        TitleBarAppearance titleBarAppearance = (TitleBarAppearance) obj;
        return this.titleResId == titleBarAppearance.titleResId && Intrinsics.LJFF(this.icon, titleBarAppearance.icon) && this.leftButton == titleBarAppearance.leftButton && this.rightButton == titleBarAppearance.rightButton;
    }

    public final int hashCode() {
        int i = this.titleResId * 31;
        RawIcon rawIcon = this.icon;
        return ((((i + (rawIcon == null ? 0 : rawIcon.hashCode())) * 31) + this.leftButton.hashCode()) * 31) + this.rightButton.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TitleBarAppearance(titleResId=");
        sbLIZ.append(this.titleResId);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", leftButton=");
        sbLIZ.append(this.leftButton);
        sbLIZ.append(", rightButton=");
        sbLIZ.append(this.rightButton);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.titleResId);
        RawIcon rawIcon = this.icon;
        if (rawIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rawIcon.writeToParcel(parcel, i);
        }
        parcel.writeString(this.leftButton.name());
        parcel.writeString(this.rightButton.name());
    }

    public TitleBarAppearance(int i, RawIcon rawIcon, EnumC1783230wVN enumC1783230wVN, EnumC1783230wVN enumC1783230wVN2) {
        this.titleResId = i;
        this.icon = rawIcon;
        this.leftButton = enumC1783230wVN;
        this.rightButton = enumC1783230wVN2;
    }
}
