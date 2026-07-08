package dmt.viewpager;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import dmt.viewpager.DmtViewPager$SavedState;

/* JADX INFO: loaded from: classes34.dex */
public class DmtViewPager$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<DmtViewPager$SavedState> CREATOR = new Parcelable.ClassLoaderCreator<DmtViewPager$SavedState>() { // from class: X.19cD
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new DmtViewPager$SavedState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DmtViewPager$SavedState[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final DmtViewPager$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new DmtViewPager$SavedState(parcel, classLoader);
        }
    };
    public int LL;
    public Parcelable LLILLJJLI;
    public final ClassLoader LLILLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FragmentPager.SavedState{");
        sbLIZ.append(Integer.toHexString(System.identityHashCode(this)));
        sbLIZ.append(" position=");
        sbLIZ.append(this.LL);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DmtViewPager$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public DmtViewPager$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
        this.LL = parcel.readInt();
        this.LLILLJJLI = parcel.readParcelable(classLoader);
        this.LLILLL = classLoader;
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.LL);
        parcel.writeParcelable(this.LLILLJJLI, i);
    }
}
