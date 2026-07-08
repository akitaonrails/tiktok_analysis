package com.google.android.gms.fido.fido2.api.common;

import X.C08FF;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import java.util.Locale;

/* JADX INFO: loaded from: classes24.dex */
public enum ErrorCode implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);

    public static final Parcelable.Creator<ErrorCode> CREATOR = new Parcelable.Creator() { // from class: X.0pVU
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return ErrorCode.toErrorCode(parcel.readInt());
            } catch (C1490970otz e) {
                TryCatchGuardChecker.doCheck(e);
                throw new IllegalArgumentException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new ErrorCode[i];
        }
    };
    public final int zzb;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCode() {
        return this.zzb;
    }

    public static ErrorCode toErrorCode(final int i) throws Exception {
        for (ErrorCode errorCode : values()) {
            if (i == errorCode.zzb) {
                return errorCode;
            }
        }
        throw new Exception(i) { // from class: X.0otz
            {
                super(C786410Ut5.k4(Locale.US, "Error code %d is not supported", new Object[]{Integer.valueOf(i)}));
            }
        };
    }

    public static ErrorCode valueOf(String str) {
        return (ErrorCode) C08FF.LIZ(ErrorCode.class, str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzb);
    }

    ErrorCode(int i) {
        this.zzb = i;
    }
}
