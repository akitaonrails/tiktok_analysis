package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import com.google.android.material.internal.ParcelableSparseBooleanArray;

/* JADX INFO: loaded from: classes31.dex */
public class ParcelableSparseBooleanArray extends SparseBooleanArray implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseBooleanArray> CREATOR = new Parcelable.Creator<ParcelableSparseBooleanArray>() { // from class: X.14b1
        @Override // android.os.Parcelable.Creator
        public final ParcelableSparseBooleanArray createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ParcelableSparseBooleanArray parcelableSparseBooleanArray = new ParcelableSparseBooleanArray(i);
            int[] iArr = new int[i];
            boolean[] zArr = new boolean[i];
            parcel.readIntArray(iArr);
            parcel.readBooleanArray(zArr);
            for (int i2 = 0; i2 < i; i2++) {
                parcelableSparseBooleanArray.put(iArr[i2], zArr[i2]);
            }
            return parcelableSparseBooleanArray;
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableSparseBooleanArray[] newArray(int i) {
            return new ParcelableSparseBooleanArray[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ParcelableSparseBooleanArray() {
    }

    public ParcelableSparseBooleanArray(int i) {
        super(i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int[] iArr = new int[size()];
        boolean[] zArr = new boolean[size()];
        for (int i2 = 0; i2 < size(); i2++) {
            iArr[i2] = keyAt(i2);
            zArr[i2] = valueAt(i2);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeBooleanArray(zArr);
    }
}
