package com.google.android.material.navigation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.navigation.NavigationView$SavedState;

/* JADX INFO: loaded from: classes34.dex */
public class NavigationView$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<NavigationView$SavedState> CREATOR = new Parcelable.ClassLoaderCreator<NavigationView$SavedState>() { // from class: X.19Ua
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new NavigationView$SavedState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NavigationView$SavedState[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final NavigationView$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new NavigationView$SavedState(parcel, classLoader);
        }
    };
    public Bundle menuState;

    public NavigationView$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public NavigationView$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.menuState = parcel.readBundle(classLoader);
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.menuState);
    }
}
