package com.ss.android.ugc.aweme.discover.adapter;

import X.C21608319hR;
import X.C2189641Amo;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes34.dex */
public final class AbstractLoadingLayout$SavedState extends View.BaseSavedState {
    public int state;
    public static final C21608319hR Companion = new Object() { // from class: X.19hR
    };
    public static final Parcelable.Creator<AbstractLoadingLayout$SavedState> CREATOR = new C2189641Amo(19);

    public AbstractLoadingLayout$SavedState(Parcel parcel) {
        super(parcel);
        this.state = parcel.readInt();
    }

    public AbstractLoadingLayout$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.state);
    }
}
