package com.ss.android.ugc.tools.view.widget;

import X.C2189641Amo;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes34.dex */
public class AbstractLoadingLayout$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<AbstractLoadingLayout$SavedState> CREATOR = new C2189641Amo(23);
    public int LL;

    public AbstractLoadingLayout$SavedState(Parcel parcel) {
        super(parcel);
        this.LL = parcel.readInt();
    }

    public AbstractLoadingLayout$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.LL);
    }
}
