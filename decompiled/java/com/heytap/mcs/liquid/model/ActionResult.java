package com.heytap.mcs.liquid.model;

import X.C854630Xfp;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes14.dex */
public class ActionResult implements Parcelable {
    public static final Parcelable.Creator<ActionResult> CREATOR = new C854630Xfp(16);
    public int currentStatus;

    public ActionResult() {
    }

    public ActionResult(int i) {
        this.currentStatus = -1;
    }

    public ActionResult(Parcel parcel) {
        this.currentStatus = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.currentStatus);
    }
}
