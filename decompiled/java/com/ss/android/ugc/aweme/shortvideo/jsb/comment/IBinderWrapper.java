package com.ss.android.ugc.aweme.shortvideo.jsb.comment;

import X.C20598315iv;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.jsb.comment.IBinderWrapper;

/* JADX INFO: loaded from: classes32.dex */
public final class IBinderWrapper implements Parcelable {
    public static final C20598315iv CREATOR = new Parcelable.Creator<IBinderWrapper>() { // from class: X.15iv
        @Override // android.os.Parcelable.Creator
        public final IBinderWrapper createFromParcel(Parcel parcel) {
            return new IBinderWrapper(parcel.readStrongBinder());
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

    public IBinderWrapper(IBinder iBinder) {
        this.iBinder = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.iBinder);
    }
}
