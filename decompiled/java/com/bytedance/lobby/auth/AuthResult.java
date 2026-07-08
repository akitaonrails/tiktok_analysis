package com.bytedance.lobby.auth;

import X.C2189641Amo;
import X.C2193741AtQ;
import X.C851480Xak;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes35.dex */
public final class AuthResult implements Parcelable {
    public static final Parcelable.Creator<AuthResult> CREATOR = new C2189641Amo(14);
    public int mActionType;
    public Bundle mBundle;
    public C851480Xak mErrorCause;
    public long mExpiryDateInMillis;
    public transient boolean mIsCancelled;
    public boolean mIsSuccessful;
    public String mNonce;
    public String mProviderId;
    public String mToken;
    public String mTokenForBusiness;
    public String mTokenSecret;
    public String mUid;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return super.toString();
    }

    public AuthResult(C2193741AtQ c2193741AtQ) {
        this.mProviderId = "";
        this.mUid = "";
        this.mToken = "";
        this.mTokenSecret = "";
        this.mTokenForBusiness = "";
        boolean z = c2193741AtQ.LIZ;
        this.mIsSuccessful = z;
        boolean z2 = true;
        if (!z) {
            C851480Xak c851480Xak = c2193741AtQ.LIZIZ;
            if (c851480Xak == null) {
                this.mErrorCause = new C851480Xak(1, "Auth is unsuccessful with no Error Cause");
            } else {
                this.mErrorCause = c851480Xak;
            }
        }
        C851480Xak c851480Xak2 = this.mErrorCause;
        if (c851480Xak2 == null || (!c851480Xak2.isCancelled() && this.mErrorCause.getErrorCode() != 4)) {
            z2 = false;
        }
        this.mIsCancelled = z2;
        this.mProviderId = c2193741AtQ.LIZJ;
        this.mUid = c2193741AtQ.LIZLLL;
        this.mToken = c2193741AtQ.LJ;
        this.mTokenSecret = c2193741AtQ.LJFF;
        this.mTokenForBusiness = "";
        this.mExpiryDateInMillis = c2193741AtQ.LJI;
        this.mActionType = c2193741AtQ.LJII;
        this.mNonce = c2193741AtQ.LJIIIIZZ;
        Bundle bundle = c2193741AtQ.LJIIIZ;
        this.mBundle = bundle == null ? new Bundle() : bundle;
    }

    public AuthResult(Parcel parcel) {
        this.mProviderId = "";
        this.mUid = "";
        this.mToken = "";
        this.mTokenSecret = "";
        this.mTokenForBusiness = "";
        boolean z = parcel.readInt() == 1;
        C851480Xak c851480Xak = (C851480Xak) parcel.readSerializable();
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        long j = parcel.readLong();
        int i = parcel.readInt();
        Bundle bundle = parcel.readBundle(AuthResult.class.getClassLoader());
        C2193741AtQ c2193741AtQ = new C2193741AtQ(string, i);
        c2193741AtQ.LIZ = z;
        c2193741AtQ.LIZIZ = c851480Xak;
        c2193741AtQ.LIZLLL = string2;
        c2193741AtQ.LJ = string3;
        c2193741AtQ.LJFF = string4;
        c2193741AtQ.LJI = j;
        c2193741AtQ.LJIIIZ = bundle;
        c2193741AtQ.LIZ();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mIsSuccessful ? 1 : 0);
        parcel.writeSerializable(this.mErrorCause);
        parcel.writeString(this.mProviderId);
        parcel.writeString(this.mTokenSecret);
        parcel.writeString(this.mUid);
        parcel.writeString(this.mToken);
        parcel.writeLong(this.mExpiryDateInMillis);
        parcel.writeInt(this.mActionType);
        parcel.writeBundle(this.mBundle);
    }
}
