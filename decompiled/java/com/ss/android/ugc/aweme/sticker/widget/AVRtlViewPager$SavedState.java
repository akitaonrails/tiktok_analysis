package com.ss.android.ugc.aweme.sticker.widget;

import X.C21599219fy;
import X.InterfaceC21599319fz;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.widget.AVRtlViewPager$SavedState;

/* JADX INFO: loaded from: classes34.dex */
public class AVRtlViewPager$SavedState implements Parcelable {
    public static final Parcelable.Creator<AVRtlViewPager$SavedState> CREATOR = new C21599219fy(new InterfaceC21599319fz<AVRtlViewPager$SavedState>() { // from class: X.19fL
        @Override // X.InterfaceC21599319fz
        public final AVRtlViewPager$SavedState[] newArray(int i) {
            return new AVRtlViewPager$SavedState[i];
        }

        @Override // X.InterfaceC21599319fz
        public final AVRtlViewPager$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new AVRtlViewPager$SavedState(parcel, classLoader);
        }
    });
    public final int mLayoutDirection;
    public final Parcelable mViewPagerSavedState;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public AVRtlViewPager$SavedState(Parcel parcel, ClassLoader classLoader) {
        this.mViewPagerSavedState = parcel.readParcelable(classLoader == null ? getClass().getClassLoader() : classLoader);
        this.mLayoutDirection = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mViewPagerSavedState, i);
        parcel.writeInt(this.mLayoutDirection);
    }

    public AVRtlViewPager$SavedState(Parcelable parcelable, int i) {
        this.mViewPagerSavedState = parcelable;
        this.mLayoutDirection = i;
    }
}
