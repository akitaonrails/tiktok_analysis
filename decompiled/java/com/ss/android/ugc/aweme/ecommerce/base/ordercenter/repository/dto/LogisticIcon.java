package com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.LogisticIcon;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LogisticIcon implements Parcelable {

    @C09CT("icon")
    public Image icon;

    @C09CT("icon_dark")
    public Image iconDark;
    public static final Parcelable.Creator<LogisticIcon> CREATOR = new Parcelable.Creator<LogisticIcon>() { // from class: X.02hL
        @Override // android.os.Parcelable.Creator
        public final LogisticIcon createFromParcel(Parcel parcel) {
            return new LogisticIcon((Image) parcel.readParcelable(LogisticIcon.class.getClassLoader()), (Image) parcel.readParcelable(LogisticIcon.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final LogisticIcon[] newArray(int i) {
            return new LogisticIcon[i];
        }
    };
    public static final int $stable = 8;

    public LogisticIcon() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogisticIcon)) {
            return false;
        }
        LogisticIcon logisticIcon = (LogisticIcon) obj;
        return Intrinsics.LJFF(this.icon, logisticIcon.icon) && Intrinsics.LJFF(this.iconDark, logisticIcon.iconDark);
    }

    public final int hashCode() {
        Image image = this.icon;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        Image image2 = this.iconDark;
        return iHashCode + (image2 != null ? image2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LogisticIcon(icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", iconDark=");
        sbLIZ.append(this.iconDark);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.icon, i);
        parcel.writeParcelable(this.iconDark, i);
    }

    public LogisticIcon(Image image, Image image2) {
        this.icon = image;
        this.iconDark = image2;
    }
}
