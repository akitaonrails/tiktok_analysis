package com.tencent.wcdb;

import X.C1B7R;
import X.C1D13;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes35.dex */
public final class BulkCursorDescriptor implements Parcelable {
    public static final Parcelable.Creator<BulkCursorDescriptor> CREATOR = new C1D13(28);
    public String[] columnNames;
    public int count;
    public C1B7R cursor;
    public boolean wantsAllOnMoveCalls;
    public CursorWindow window;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.cursor.asBinder());
        parcel.writeStringArray(this.columnNames);
        parcel.writeInt(this.wantsAllOnMoveCalls ? 1 : 0);
        parcel.writeInt(this.count);
        if (this.window != null) {
            parcel.writeInt(1);
            this.window.writeToParcel(parcel, i);
        } else {
            parcel.writeInt(0);
        }
    }
}
