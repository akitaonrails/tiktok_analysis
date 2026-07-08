package com.ss.android.ugc.aweme.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.flow.PageSession;

/* JADX INFO: loaded from: classes36.dex */
public class PageSession implements Parcelable {
    public static final Parcelable.Creator<PageSession> CREATOR = new Parcelable.Creator<PageSession>() { // from class: X.1DOF
        @Override // android.os.Parcelable.Creator
        public final PageSession createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new PageSession();
        }

        @Override // android.os.Parcelable.Creator
        public final PageSession[] newArray(int i) {
            return new PageSession[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
