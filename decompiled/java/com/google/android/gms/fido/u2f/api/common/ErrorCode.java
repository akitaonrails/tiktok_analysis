package com.google.android.gms.fido.u2f.api.common;

import X.C08FF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ErrorCode;

/* JADX INFO: loaded from: classes31.dex */
public enum ErrorCode implements Parcelable {
    OK(0),
    OTHER_ERROR(1),
    BAD_REQUEST(2),
    CONFIGURATION_UNSUPPORTED(3),
    DEVICE_INELIGIBLE(4),
    TIMEOUT(5);

    public final int zzc;
    public static final String zza = "ErrorCode";
    public static final Parcelable.Creator<ErrorCode> CREATOR = new Parcelable.Creator() { // from class: X.12k3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return ErrorCode.toErrorCode(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new ErrorCode[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCode() {
        return this.zzc;
    }

    public static ErrorCode toErrorCode(int i) {
        for (ErrorCode errorCode : values()) {
            if (i == errorCode.zzc) {
                return errorCode;
            }
        }
        return OTHER_ERROR;
    }

    public static ErrorCode valueOf(String str) {
        return (ErrorCode) C08FF.LIZ(ErrorCode.class, str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzc);
    }

    ErrorCode(int i) {
        this.zzc = i;
    }
}
