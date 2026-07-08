package com.bytedance.lottie;

import X.C1339250kxH;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes21.dex */
public class LottieAnimationView$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<LottieAnimationView$SavedState> CREATOR = new C1339250kxH(2);
    public String LL;
    public int LLILLJJLI;
    public float LLILLL;
    public boolean LLILZ;
    public String LLILZIL;
    public int LLILZLL;
    public int LLIZ;

    public LottieAnimationView$SavedState(Parcel parcel) {
        super(parcel);
        this.LL = parcel.readString();
        this.LLILLL = parcel.readFloat();
        this.LLILZ = parcel.readInt() == 1;
        this.LLILZIL = parcel.readString();
        this.LLILZLL = parcel.readInt();
        this.LLIZ = parcel.readInt();
    }

    public LottieAnimationView$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.LL);
        parcel.writeFloat(this.LLILLL);
        parcel.writeInt(this.LLILZ ? 1 : 0);
        parcel.writeString(this.LLILZIL);
        parcel.writeInt(this.LLILZLL);
        parcel.writeInt(this.LLIZ);
    }
}
