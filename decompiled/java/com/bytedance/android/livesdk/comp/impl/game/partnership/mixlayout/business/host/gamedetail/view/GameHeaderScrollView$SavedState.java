package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.view;

import X.C21591119ef;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.view.GameHeaderScrollView$SavedState;

/* JADX INFO: loaded from: classes34.dex */
public final class GameHeaderScrollView$SavedState extends AbsSavedState {
    public int state;
    public static final C21591119ef Companion = new Object() { // from class: X.19ef
    };
    public static final int $stable = 8;
    public static final Parcelable.Creator<GameHeaderScrollView$SavedState> CREATOR = new Parcelable.ClassLoaderCreator<GameHeaderScrollView$SavedState>() { // from class: X.19ee
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new GameHeaderScrollView$SavedState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GameHeaderScrollView$SavedState[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final GameHeaderScrollView$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new GameHeaderScrollView$SavedState(parcel, classLoader);
        }
    };

    public GameHeaderScrollView$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public GameHeaderScrollView$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.state = parcel.readInt();
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.state);
    }
}
