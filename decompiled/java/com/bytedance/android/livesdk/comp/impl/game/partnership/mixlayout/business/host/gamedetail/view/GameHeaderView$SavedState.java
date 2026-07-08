package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.view;

import X.C21591319eh;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.view.GameHeaderView$SavedState;

/* JADX INFO: loaded from: classes34.dex */
public final class GameHeaderView$SavedState extends AbsSavedState {
    public int state;
    public static final C21591319eh Companion = new Object() { // from class: X.19eh
    };
    public static final int $stable = 8;
    public static final Parcelable.Creator<GameHeaderView$SavedState> CREATOR = new Parcelable.ClassLoaderCreator<GameHeaderView$SavedState>() { // from class: X.19eg
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new GameHeaderView$SavedState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GameHeaderView$SavedState[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final GameHeaderView$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new GameHeaderView$SavedState(parcel, classLoader);
        }
    };

    public GameHeaderView$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public GameHeaderView$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.state = parcel.readInt();
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.state);
    }
}
