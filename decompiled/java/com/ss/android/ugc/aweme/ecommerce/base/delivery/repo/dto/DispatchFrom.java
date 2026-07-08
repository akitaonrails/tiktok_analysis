package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DispatchFrom;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.WarehouseTag;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.LogisticIcon;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class DispatchFrom implements Parcelable {

    @C09CT("arrow")
    public final LogisticIcon arrow;

    @C09CT("icon")
    public final LogisticIcon icon;

    @C09CT("text")
    public final String text;

    @C09CT("title")
    public final String title;

    @C09CT("warehouse_tag")
    public final WarehouseTag warehouseTag;
    public static final Parcelable.Creator<DispatchFrom> CREATOR = new Parcelable.Creator<DispatchFrom>() { // from class: X.03Da
        @Override // android.os.Parcelable.Creator
        public final DispatchFrom createFromParcel(Parcel parcel) {
            LogisticIcon logisticIconCreateFromParcel;
            LogisticIcon logisticIconCreateFromParcel2;
            WarehouseTag warehouseTagCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                logisticIconCreateFromParcel = null;
            } else {
                logisticIconCreateFromParcel = LogisticIcon.CREATOR.createFromParcel(parcel);
            }
            LogisticIcon logisticIcon = logisticIconCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                logisticIconCreateFromParcel2 = null;
            } else {
                logisticIconCreateFromParcel2 = LogisticIcon.CREATOR.createFromParcel(parcel);
            }
            LogisticIcon logisticIcon2 = logisticIconCreateFromParcel2;
            if (parcel.readInt() != 0) {
                warehouseTagCreateFromParcel = WarehouseTag.CREATOR.createFromParcel(parcel);
            }
            return new DispatchFrom(logisticIcon, string, string2, logisticIcon2, warehouseTagCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DispatchFrom[] newArray(int i) {
            return new DispatchFrom[i];
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
        if (!(obj instanceof DispatchFrom)) {
            return false;
        }
        DispatchFrom dispatchFrom = (DispatchFrom) obj;
        return Intrinsics.LJFF(this.icon, dispatchFrom.icon) && Intrinsics.LJFF(this.title, dispatchFrom.title) && Intrinsics.LJFF(this.text, dispatchFrom.text) && Intrinsics.LJFF(this.arrow, dispatchFrom.arrow) && Intrinsics.LJFF(this.warehouseTag, dispatchFrom.warehouseTag);
    }

    public final int hashCode() {
        LogisticIcon logisticIcon = this.icon;
        int iHashCode = (logisticIcon == null ? 0 : logisticIcon.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LogisticIcon logisticIcon2 = this.arrow;
        int iHashCode4 = (iHashCode3 + (logisticIcon2 == null ? 0 : logisticIcon2.hashCode())) * 31;
        WarehouseTag warehouseTag = this.warehouseTag;
        return iHashCode4 + (warehouseTag != null ? warehouseTag.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DispatchFrom(icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", arrow=");
        sbLIZ.append(this.arrow);
        sbLIZ.append(", warehouseTag=");
        sbLIZ.append(this.warehouseTag);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LogisticIcon logisticIcon = this.icon;
        if (logisticIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            logisticIcon.writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        LogisticIcon logisticIcon2 = this.arrow;
        if (logisticIcon2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            logisticIcon2.writeToParcel(parcel, i);
        }
        WarehouseTag warehouseTag = this.warehouseTag;
        if (warehouseTag == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            warehouseTag.writeToParcel(parcel, i);
        }
    }

    public DispatchFrom(LogisticIcon logisticIcon, String str, String str2, LogisticIcon logisticIcon2, WarehouseTag warehouseTag) {
        this.icon = logisticIcon;
        this.title = str;
        this.text = str2;
        this.arrow = logisticIcon2;
        this.warehouseTag = warehouseTag;
    }
}
