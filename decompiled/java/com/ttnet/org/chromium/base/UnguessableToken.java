package com.ttnet.org.chromium.base;

import X.C1D13;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes35.dex */
public class UnguessableToken implements Parcelable {
    public static final Parcelable.Creator<UnguessableToken> CREATOR = new C1D13(29);
    public final long mHigh;
    public final long mLow;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        long j = this.mLow;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.mHigh;
        return (i * 31) + ((int) ((j2 >>> 32) ^ j2));
    }

    private UnguessableToken parcelAndUnparcelForTesting() {
        Parcel parcelObtain = Parcel.obtain();
        writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        UnguessableToken unguessableTokenCreateFromParcel = CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return unguessableTokenCreateFromParcel;
    }

    public long getHighForSerialization() {
        return this.mHigh;
    }

    public long getLowForSerialization() {
        return this.mLow;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UnguessableToken unguessableToken = (UnguessableToken) obj;
        if (unguessableToken.mHigh != this.mHigh || unguessableToken.mLow != this.mLow) {
            return false;
        }
        return true;
    }

    public UnguessableToken(long j, long j2) {
        this.mHigh = j;
        this.mLow = j2;
    }

    public static UnguessableToken create(long j, long j2) {
        return new UnguessableToken(j, j2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mHigh);
        parcel.writeLong(this.mLow);
    }
}
