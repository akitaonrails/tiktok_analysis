package com.bytedance.tux.sheet.sidesheet;

import X.C21587919e9;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import com.bytedance.tux.sheet.sidesheet.SavedState;

/* JADX INFO: loaded from: classes34.dex */
public final class SavedState extends AbsSavedState {
    public final int state;
    public static final C21587919e9 Companion = new Object() { // from class: X.19e9
    };
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: X.19e8
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new SavedState(parcel, (ClassLoader) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SavedState[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new SavedState(parcel, classLoader);
        }
    };

    public SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.state = parcel.readInt();
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.state);
    }

    public SavedState(Parcelable parcelable, SideSheetBehavior<?> sideSheetBehavior) {
        super(parcelable);
        this.state = sideSheetBehavior.LIZJ;
    }
}
