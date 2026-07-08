package com.google.android.gms.fido.u2f.api.common;

import X.C08FF;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes31.dex */
public enum ProtocolVersion implements Parcelable {
    UNKNOWN("UNKNOWN"),
    V1("U2F_V1"),
    V2("U2F_V2");

    public static final Parcelable.Creator<ProtocolVersion> CREATOR = new Parcelable.Creator() { // from class: X.12jx
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return ProtocolVersion.fromString(parcel.readString());
            } catch (C19840112jv e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new ProtocolVersion[i];
        }
    };
    public final String zzb;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.zzb;
    }

    public static ProtocolVersion fromBytes(byte[] bArr) {
        try {
            return fromString(new String(bArr, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    public static ProtocolVersion fromString(final String str) throws Exception {
        if (str == null) {
            return UNKNOWN;
        }
        for (ProtocolVersion protocolVersion : values()) {
            if (str.equals(protocolVersion.zzb)) {
                return protocolVersion;
            }
        }
        throw new Exception(str) { // from class: X.12jv
            {
                super(C786410Ut5.j4("Protocol version %s not supported", new Object[]{str}));
            }
        };
    }

    public static ProtocolVersion valueOf(String str) {
        return (ProtocolVersion) C08FF.LIZ(ProtocolVersion.class, str);
    }

    public boolean isCompatible(ProtocolVersion protocolVersion) {
        ProtocolVersion protocolVersion2 = UNKNOWN;
        if (!equals(protocolVersion2) && !protocolVersion.equals(protocolVersion2)) {
            return equals(protocolVersion);
        }
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzb);
    }

    ProtocolVersion(String str) {
        this.zzb = str;
    }
}
