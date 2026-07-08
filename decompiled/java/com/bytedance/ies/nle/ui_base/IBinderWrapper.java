package com.bytedance.ies.nle.ui_base;

import X.C1BZQ;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.nle.ui_base.IBinderWrapper;

/* JADX INFO: loaded from: classes35.dex */
public final class IBinderWrapper implements Parcelable {
    public static final C1BZQ CREATOR = new Parcelable.Creator<IBinderWrapper>() { // from class: X.1BZQ
        @Override // android.os.Parcelable.Creator
        public final IBinderWrapper createFromParcel(Parcel parcel) {
            return new IBinderWrapper(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final IBinderWrapper[] newArray(int i) {
            return new IBinderWrapper[i];
        }
    };
    public final IBinder iBinder;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public IBinderWrapper(Parcel parcel) {
        this.iBinder = parcel.readStrongBinder();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.iBinder);
    }
}
