package dmt.viewpager;

import X.C21599219fy;
import X.InterfaceC21599319fz;
import android.os.Parcel;
import android.os.Parcelable;
import dmt.viewpager.DmtRtlViewPager$SavedState;

/* JADX INFO: loaded from: classes34.dex */
public class DmtRtlViewPager$SavedState implements Parcelable {
    public static final Parcelable.Creator<DmtRtlViewPager$SavedState> CREATOR = new C21599219fy(new InterfaceC21599319fz<DmtRtlViewPager$SavedState>() { // from class: X.19g2
        @Override // X.InterfaceC21599319fz
        public final DmtRtlViewPager$SavedState[] newArray(int i) {
            return new DmtRtlViewPager$SavedState[i];
        }

        @Override // X.InterfaceC21599319fz
        public final DmtRtlViewPager$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new DmtRtlViewPager$SavedState(parcel, classLoader);
        }
    });
    public final int mLayoutDirection;
    public final Parcelable mViewPagerSavedState;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public DmtRtlViewPager$SavedState(Parcel parcel, ClassLoader classLoader) {
        this.mViewPagerSavedState = parcel.readParcelable(classLoader == null ? getClass().getClassLoader() : classLoader);
        this.mLayoutDirection = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mViewPagerSavedState, i);
        parcel.writeInt(this.mLayoutDirection);
    }

    public DmtRtlViewPager$SavedState(DmtViewPager$SavedState dmtViewPager$SavedState, int i) {
        this.mViewPagerSavedState = dmtViewPager$SavedState;
        this.mLayoutDirection = i;
    }
}
