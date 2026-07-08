package com.google.android.material.bottomnavigation;

import X.C19748612Om;
import X.C19V6;
import X.C19V7;
import X.C21538919Rb;
import X.C21546019Tu;
import X.C21548219Uq;
import X.SubMenuC21548419Us;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationPresenter;
import com.google.android.material.internal.ParcelableSparseArray;

/* JADX INFO: loaded from: classes34.dex */
public final class BottomNavigationPresenter implements C19V7 {
    public C21546019Tu LL;
    public boolean LLILLJJLI;
    public int LLILLL;

    @Override // X.C19V7
    public final void LIZ(C19V6 c19v6, boolean z) {
    }

    @Override // X.C19V7
    public final boolean LIZJ(C21548219Uq c21548219Uq) {
        return false;
    }

    @Override // X.C19V7
    public final boolean LIZLLL(SubMenuC21548419Us subMenuC21548419Us) {
        return false;
    }

    @Override // X.C19V7
    public final boolean LJ(C21548219Uq c21548219Uq) {
        return false;
    }

    @Override // X.C19V7
    public final boolean LJFF() {
        return false;
    }

    @Override // X.C19V7
    public final Parcelable LIZIZ() {
        SavedState savedState = new SavedState();
        savedState.LL = this.LL.getSelectedItemId();
        SparseArray<BadgeDrawable> badgeDrawables = this.LL.getBadgeDrawables();
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int iKeyAt = badgeDrawables.keyAt(i);
            BadgeDrawable badgeDrawableValueAt = badgeDrawables.valueAt(i);
            if (badgeDrawableValueAt == null) {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
            parcelableSparseArray.put(iKeyAt, badgeDrawableValueAt.LLIZLLLIL);
        }
        savedState.LLILLJJLI = parcelableSparseArray;
        return savedState;
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: X.19U9
            @Override // android.os.Parcelable.Creator
            public final BottomNavigationPresenter.SavedState createFromParcel(Parcel parcel) {
                return new BottomNavigationPresenter.SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final BottomNavigationPresenter.SavedState[] newArray(int i) {
                return new BottomNavigationPresenter.SavedState[i];
            }
        };
        public int LL;
        public ParcelableSparseArray LLILLJJLI;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.LL = parcel.readInt();
            this.LLILLJJLI = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.LL);
            parcel.writeParcelable(this.LLILLJJLI, 0);
        }
    }

    @Override // X.C19V7
    public final int getId() {
        return this.LLILLL;
    }

    @Override // X.C19V7
    public final void LJII(boolean z) {
        boolean z2;
        if (this.LLILLJJLI) {
            return;
        }
        if (z) {
            this.LL.LIZ();
            return;
        }
        C21546019Tu c21546019Tu = this.LL;
        C19V6 c19v6 = c21546019Tu.LLJJL;
        if (c19v6 == null || c21546019Tu.LLJILJIL == null) {
            return;
        }
        int size = c19v6.size();
        if (size != c21546019Tu.LLJILJIL.length) {
            c21546019Tu.LIZ();
            return;
        }
        int i = c21546019Tu.LLJILJILJ;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = c21546019Tu.LLJJL.getItem(i2);
            if (item.isChecked()) {
                c21546019Tu.LLJILJILJ = item.getItemId();
                c21546019Tu.LLJILLL = i2;
            }
        }
        if (i != c21546019Tu.LLJILJILJ) {
            C19748612Om.LIZ(c21546019Tu, c21546019Tu.LL);
        }
        int i3 = c21546019Tu.LLJIJIL;
        int size2 = c21546019Tu.LLJJL.LJIIJJI().size();
        if (i3 != -1 ? i3 == 0 : size2 > 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        for (int i4 = 0; i4 < size; i4++) {
            c21546019Tu.LLJJJJLIIL.LLILLJJLI = true;
            c21546019Tu.LLJILJIL[i4].setLabelVisibilityMode(c21546019Tu.LLJIJIL);
            c21546019Tu.LLJILJIL[i4].setShifting(z2);
            c21546019Tu.LLJILJIL[i4].LJIIJJI((C21548219Uq) c21546019Tu.LLJJL.getItem(i4));
            c21546019Tu.LLJJJJLIIL.LLILLJJLI = false;
        }
    }

    @Override // X.C19V7
    public final void LJIIIZ(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            C21546019Tu c21546019Tu = this.LL;
            SavedState savedState = (SavedState) parcelable;
            int i = savedState.LL;
            int size = c21546019Tu.LLJJL.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item = c21546019Tu.LLJJL.getItem(i2);
                if (i == item.getItemId()) {
                    c21546019Tu.LLJILJILJ = i;
                    c21546019Tu.LLJILLL = i2;
                    item.setChecked(true);
                    break;
                }
                i2++;
            }
            Context context = this.LL.getContext();
            ParcelableSparseArray parcelableSparseArray = savedState.LLILLJJLI;
            SparseArray<BadgeDrawable> sparseArray = new SparseArray<>(parcelableSparseArray.size());
            for (int i3 = 0; i3 < parcelableSparseArray.size(); i3++) {
                int iKeyAt = parcelableSparseArray.keyAt(i3);
                BadgeDrawable.SavedState savedState2 = (BadgeDrawable.SavedState) parcelableSparseArray.valueAt(i3);
                if (savedState2 != null) {
                    BadgeDrawable badgeDrawable = new BadgeDrawable(context);
                    badgeDrawable.LJII(savedState2.maxCharacterCount);
                    int i4 = savedState2.number;
                    if (i4 != -1) {
                        int iMax = Math.max(0, i4);
                        BadgeDrawable.SavedState savedState3 = badgeDrawable.LLIZLLLIL;
                        if (savedState3.number != iMax) {
                            savedState3.number = iMax;
                            badgeDrawable.LLILLL.LIZLLL = true;
                            badgeDrawable.LJIIIZ();
                            badgeDrawable.invalidateSelf();
                        }
                    }
                    int i5 = savedState2.backgroundColor;
                    badgeDrawable.LLIZLLLIL.backgroundColor = i5;
                    ColorStateList colorStateListValueOf = ColorStateList.valueOf(i5);
                    C21538919Rb c21538919Rb = badgeDrawable.LLILLJJLI;
                    if (c21538919Rb.LL.LIZJ != colorStateListValueOf) {
                        c21538919Rb.LJIIJJI(colorStateListValueOf);
                        badgeDrawable.invalidateSelf();
                    }
                    int i6 = savedState2.badgeTextColor;
                    badgeDrawable.LLIZLLLIL.badgeTextColor = i6;
                    if (badgeDrawable.LLILLL.LIZ.getColor() != i6) {
                        badgeDrawable.LLILLL.LIZ.setColor(i6);
                        badgeDrawable.invalidateSelf();
                    }
                    badgeDrawable.LJI(savedState2.badgeGravity);
                    badgeDrawable.LLIZLLLIL.horizontalOffset = savedState2.horizontalOffset;
                    badgeDrawable.LJIIIZ();
                    badgeDrawable.LLIZLLLIL.verticalOffset = savedState2.verticalOffset;
                    badgeDrawable.LJIIIZ();
                    boolean z = savedState2.isVisible;
                    badgeDrawable.setVisible(z, false);
                    badgeDrawable.LLIZLLLIL.isVisible = z;
                    sparseArray.put(iKeyAt, badgeDrawable);
                } else {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
            }
            this.LL.setBadgeDrawables(sparseArray);
        }
    }

    @Override // X.C19V7
    public final void LJIIIIZZ(Context context, C19V6 c19v6) {
        this.LL.LLJJL = c19v6;
    }
}
