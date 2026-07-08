package com.ss.android.ugc.aweme.detail.transition;

import X.C1864730ycp;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes28.dex */
public class FeedShareElementInfo<T extends Parcelable> implements Parcelable {
    public static final Parcelable.Creator<FeedShareElementInfo> CREATOR = new C1864730ycp(8);
    public final boolean LL;
    public Parcelable mSnapshot;
    public transient View mView;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public FeedShareElementInfo(Parcel parcel) {
        boolean z;
        this.mSnapshot = parcel.readParcelable(Parcelable.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LL = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mSnapshot, i);
        parcel.writeByte(this.LL ? (byte) 1 : (byte) 0);
    }
}
