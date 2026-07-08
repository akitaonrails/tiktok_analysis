package com.google.android.material.bottomappbar;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.Toolbar$SavedState;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.bottomappbar.BottomAppBar$SavedState;

/* JADX INFO: loaded from: classes34.dex */
public class BottomAppBar$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<BottomAppBar$SavedState> CREATOR = new Parcelable.ClassLoaderCreator<BottomAppBar$SavedState>() { // from class: X.19XI
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new BottomAppBar$SavedState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BottomAppBar$SavedState[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final BottomAppBar$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new BottomAppBar$SavedState(parcel, classLoader);
        }
    };
    public int LL;
    public boolean LLILLJJLI;

    public BottomAppBar$SavedState(Toolbar$SavedState toolbar$SavedState) {
        super(toolbar$SavedState);
    }

    public BottomAppBar$SavedState(Parcel parcel, ClassLoader classLoader) {
        boolean z;
        super(parcel, classLoader);
        this.LL = parcel.readInt();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLILLJJLI = z;
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.LL);
        parcel.writeInt(this.LLILLJJLI ? 1 : 0);
    }
}
