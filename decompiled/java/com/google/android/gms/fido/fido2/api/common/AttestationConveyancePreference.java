package com.google.android.gms.fido.fido2.api.common;

import X.C08FF;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;

/* JADX INFO: loaded from: classes31.dex */
public enum AttestationConveyancePreference implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");

    public static final Parcelable.Creator<AttestationConveyancePreference> CREATOR = new Parcelable.Creator() { // from class: X.12kL
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return AttestationConveyancePreference.fromString(parcel.readString());
            } catch (C19842512kJ e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new AttestationConveyancePreference[i];
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

    public static AttestationConveyancePreference fromString(final String str) throws Exception {
        for (AttestationConveyancePreference attestationConveyancePreference : values()) {
            if (str.equals(attestationConveyancePreference.zzb)) {
                return attestationConveyancePreference;
            }
        }
        throw new Exception(str) { // from class: X.12kJ
            {
                super(C786410Ut5.j4("Attestation conveyance preference %s not supported", new Object[]{str}));
            }
        };
    }

    public static AttestationConveyancePreference valueOf(String str) {
        return (AttestationConveyancePreference) C08FF.LIZ(AttestationConveyancePreference.class, str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzb);
    }

    AttestationConveyancePreference(String str) {
        this.zzb = str;
    }
}
