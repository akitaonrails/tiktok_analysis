package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.CheckableImageButton$SavedState;

/* JADX INFO: loaded from: classes34.dex */
public class CheckableImageButton$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<CheckableImageButton$SavedState> CREATOR = new Parcelable.ClassLoaderCreator<CheckableImageButton$SavedState>() { // from class: X.19Tl
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new CheckableImageButton$SavedState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CheckableImageButton$SavedState[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final CheckableImageButton$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new CheckableImageButton$SavedState(parcel, classLoader);
        }
    };
    public boolean LL;

    public CheckableImageButton$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public CheckableImageButton$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.LL = parcel.readInt() == 1;
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.LL ? 1 : 0);
    }
}
