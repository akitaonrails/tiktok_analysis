package com.ss.android.ugc.aweme.tools.mvtemplate.mvpreview;

import X.C21599219fy;
import X.C2188811AlT;
import X.InterfaceC21599319fz;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.ss.android.ugc.aweme.tools.mvtemplate.mvpreview.VerticalViewPager$SavedState;

/* JADX INFO: loaded from: classes34.dex */
public class VerticalViewPager$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<VerticalViewPager$SavedState> CREATOR = new C21599219fy(new InterfaceC21599319fz<VerticalViewPager$SavedState>() { // from class: X.19fr
        @Override // X.InterfaceC21599319fz
        public final VerticalViewPager$SavedState[] newArray(int i) {
            return new VerticalViewPager$SavedState[i];
        }

        @Override // X.InterfaceC21599319fz
        public final VerticalViewPager$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new VerticalViewPager$SavedState(parcel, classLoader);
        }
    });
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

    public VerticalViewPager$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public VerticalViewPager$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel);
        classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
        this.LL = parcel.readInt();
        this.LLILLJJLI = parcel.readParcelable(classLoader);
        this.LLILLL = classLoader;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.LL);
        parcel.writeParcelable(this.LLILLJJLI, i);
    }
}
