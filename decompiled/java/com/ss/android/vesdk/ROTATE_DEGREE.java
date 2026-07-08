package com.ss.android.vesdk;

import X.C08FF;
import X.C1864730ycp;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes28.dex */
public enum ROTATE_DEGREE implements Parcelable {
    ROTATE_NONE,
    ROTATE_90,
    ROTATE_180,
    ROTATE_270;

    public static final Parcelable.Creator<ROTATE_DEGREE> CREATOR = new C1864730ycp(13);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static int[] toIntArray(ROTATE_DEGREE[] rotate_degreeArr) {
        if (rotate_degreeArr == null) {
            return null;
        }
        int length = rotate_degreeArr.length;
        int[] iArr = new int[rotate_degreeArr.length];
        for (int i = 0; i < length; i++) {
            ROTATE_DEGREE rotate_degree = rotate_degreeArr[i];
            if (rotate_degree == null) {
                iArr[i] = 0;
            } else {
                iArr[i] = rotate_degree.ordinal();
            }
        }
        return iArr;
    }

    public static ROTATE_DEGREE valueOf(String str) {
        return (ROTATE_DEGREE) C08FF.LIZ(ROTATE_DEGREE.class, str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
