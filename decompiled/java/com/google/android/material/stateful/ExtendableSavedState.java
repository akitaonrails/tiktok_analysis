package com.google.android.material.stateful;

import X.C2188811AlT;
import X.C830530Wi3;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.stateful.ExtendableSavedState;

/* JADX INFO: loaded from: classes33.dex */
public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new Parcelable.ClassLoaderCreator<ExtendableSavedState>() { // from class: X.19Fo
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new ExtendableSavedState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExtendableSavedState[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final ExtendableSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader);
        }
    };
    public final C830530Wi3<String, Bundle> extendableStates;

    public /* synthetic */ ExtendableSavedState() {
        throw null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExtendableSavedState{");
        sbLIZ.append(Integer.toHexString(System.identityHashCode(this)));
        sbLIZ.append(" states=");
        sbLIZ.append(this.extendableStates);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.extendableStates = new C830530Wi3<>();
    }

    public ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.extendableStates = new C830530Wi3<>(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.extendableStates.put(strArr[i2], bundleArr[i2]);
        }
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int i2 = this.extendableStates.LLILLL;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = this.extendableStates.LJFF(i3);
            bundleArr[i3] = this.extendableStates.LJIIIIZZ(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
