package com.ss.android.ugc.aweme.base.widget;

import X.C2189641Amo;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes34.dex */
public class CanCancelRadioButton$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<CanCancelRadioButton$SavedState> CREATOR = new C2189641Amo(17);
    public boolean LL;

    public CanCancelRadioButton$SavedState(Parcel parcel) {
        boolean z;
        super(parcel);
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LL = z;
    }

    public CanCancelRadioButton$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.LL ? 1 : 0);
    }
}
