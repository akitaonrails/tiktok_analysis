package com.ss.android.ugc.aweme.tools.beauty.views;

import X.C2189641Amo;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes34.dex */
public class SwitchButton$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<SwitchButton$SavedState> CREATOR = new C2189641Amo(21);
    public CharSequence LL;
    public CharSequence LLILLJJLI;

    public SwitchButton$SavedState(Parcel parcel) {
        super(parcel);
        this.LL = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.LLILLJJLI = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
    }

    public SwitchButton$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.LL, parcel, i);
        TextUtils.writeToParcel(this.LLILLJJLI, parcel, i);
    }
}
