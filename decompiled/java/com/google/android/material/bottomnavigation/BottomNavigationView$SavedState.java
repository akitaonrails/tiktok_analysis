package com.google.android.material.bottomnavigation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.bottomnavigation.BottomNavigationView$SavedState;

/* JADX INFO: loaded from: classes34.dex */
public class BottomNavigationView$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<BottomNavigationView$SavedState> CREATOR = new Parcelable.ClassLoaderCreator<BottomNavigationView$SavedState>() { // from class: X.19UZ
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new BottomNavigationView$SavedState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BottomNavigationView$SavedState[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final BottomNavigationView$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new BottomNavigationView$SavedState(parcel, classLoader);
        }
    };
    public Bundle LL;

    public BottomNavigationView$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public BottomNavigationView$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.LL = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.LL);
    }
}
