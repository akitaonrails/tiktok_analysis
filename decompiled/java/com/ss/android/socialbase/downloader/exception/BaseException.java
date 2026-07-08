package com.ss.android.socialbase.downloader.exception;

import X.C1339250kxH;
import X.C2188811AlT;
import X.C2199671B7d;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes24.dex */
public class BaseException extends Exception implements Parcelable {
    public static final Parcelable.Creator<BaseException> CREATOR = new C1339250kxH(4);
    public int errorCode;
    public String errorMsg;
    public String extraInfo;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BaseException() {
        this.extraInfo = "";
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseException{errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(", errorMsg='");
        sbLIZ.append(this.errorMsg);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMsg;
    }

    public String getExtraInfo() {
        return this.extraInfo;
    }

    public BaseException(Parcel parcel) {
        this.extraInfo = "";
        readFromParcel(parcel);
    }

    public void readFromParcel(Parcel parcel) {
        this.errorCode = parcel.readInt();
        this.errorMsg = parcel.readString();
        this.extraInfo = parcel.readString();
    }

    public void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    public void setExtraInfo(String str) {
        this.extraInfo = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BaseException(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[d-ex]:");
        sbLIZ.append(str);
        super(C2188811AlT.LIZIZ(sbLIZ));
        this.extraInfo = "";
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[d-ex]:");
        sbLIZ2.append(str);
        this.errorMsg = C2188811AlT.LIZIZ(sbLIZ2);
        this.errorCode = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.errorCode);
        parcel.writeString(this.errorMsg);
        parcel.writeString(this.extraInfo);
    }

    public BaseException(int i, Throwable th) {
        this(i, C2199671B7d.LJIILLIIL(th));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BaseException(int i, String str, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[d-ex]:");
        sbLIZ.append(str);
        super(C2188811AlT.LIZIZ(sbLIZ), th);
        this.extraInfo = "";
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[d-ex]:");
        sbLIZ2.append(str);
        this.errorMsg = C2188811AlT.LIZIZ(sbLIZ2);
        this.errorCode = i;
    }
}
