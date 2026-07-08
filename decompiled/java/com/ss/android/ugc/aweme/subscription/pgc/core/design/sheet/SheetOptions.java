package com.ss.android.ugc.aweme.subscription.pgc.core.design.sheet;

import X.C511500K4e;
import X.C521760KdC;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class SheetOptions implements Parcelable {
    public int cornerRadiusPx;
    public int sheetStyle;
    public static final C511500K4e Companion = new Object() { // from class: X.0K4e
    };
    public static final int $stable = 8;
    public static final Parcelable.Creator<SheetOptions> CREATOR = new C521760KdC(5);
    public boolean isDraggable = true;
    public int dimBehindType = 1;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.sheetStyle);
        parcel.writeInt(this.cornerRadiusPx);
        parcel.writeByte(this.isDraggable ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.dimBehindType);
    }
}
