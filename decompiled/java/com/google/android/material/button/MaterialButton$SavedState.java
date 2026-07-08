package com.google.android.material.button;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.button.MaterialButton$SavedState;

/* JADX INFO: loaded from: classes34.dex */
public class MaterialButton$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<MaterialButton$SavedState> CREATOR = new Parcelable.ClassLoaderCreator<MaterialButton$SavedState>() { // from class: X.19Tn
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new MaterialButton$SavedState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MaterialButton$SavedState[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final MaterialButton$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new MaterialButton$SavedState(parcel, classLoader);
        }
    };
    public boolean LL;

    public MaterialButton$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public MaterialButton$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            getClass().getClassLoader();
        }
        this.LL = parcel.readInt() == 1;
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.LL ? 1 : 0);
    }
}
