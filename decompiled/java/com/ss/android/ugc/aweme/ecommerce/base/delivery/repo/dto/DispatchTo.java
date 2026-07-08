package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DispatchTo;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.LogisticIcon;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class DispatchTo implements Parcelable {

    @C09CT("icon_to")
    public final LogisticIcon iconTo;

    @C09CT("text")
    public final String text;

    @C09CT("title")
    public final String title;
    public static final Parcelable.Creator<DispatchTo> CREATOR = new Parcelable.Creator<DispatchTo>() { // from class: X.03FP
        @Override // android.os.Parcelable.Creator
        public final DispatchTo createFromParcel(Parcel parcel) {
            LogisticIcon logisticIconCreateFromParcel;
            if (parcel.readInt() == 0) {
                logisticIconCreateFromParcel = null;
            } else {
                logisticIconCreateFromParcel = LogisticIcon.CREATOR.createFromParcel(parcel);
            }
            return new DispatchTo(logisticIconCreateFromParcel, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DispatchTo[] newArray(int i) {
            return new DispatchTo[i];
        }
    };
    public static final int $stable = 8;

    public DispatchTo() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DispatchTo)) {
            return false;
        }
        DispatchTo dispatchTo = (DispatchTo) obj;
        return Intrinsics.LJFF(this.iconTo, dispatchTo.iconTo) && Intrinsics.LJFF(this.title, dispatchTo.title) && Intrinsics.LJFF(this.text, dispatchTo.text);
    }

    public final int hashCode() {
        LogisticIcon logisticIcon = this.iconTo;
        int iHashCode = (logisticIcon == null ? 0 : logisticIcon.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DispatchTo(iconTo=");
        sbLIZ.append(this.iconTo);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LogisticIcon logisticIcon = this.iconTo;
        if (logisticIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            logisticIcon.writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.text);
    }

    public DispatchTo(LogisticIcon logisticIcon, String str, String str2) {
        this.iconTo = logisticIcon;
        this.title = str;
        this.text = str2;
    }
}
