package com.google.android.gms.fido.fido2.api.common;

import X.C0W3J;
import X.C1633830scP;
import X.C19843512kT;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import java.util.Arrays;

/* JADX INFO: loaded from: classes31.dex */
public class PublicKeyCredentialParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialParameters> CREATOR = new Parcelable.Creator() { // from class: X.12kK
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            Integer numLJIL = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        numLJIL = C0W6J.LJIL(i, parcel);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new PublicKeyCredentialParameters(strLJII, numLJIL.intValue());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new PublicKeyCredentialParameters[i];
        }
    };
    public final PublicKeyCredentialType zza;
    public final COSEAlgorithmIdentifier zzb;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        if (!this.zza.equals(publicKeyCredentialParameters.zza) || !this.zzb.equals(publicKeyCredentialParameters.zzb)) {
            return false;
        }
        return true;
    }

    public PublicKeyCredentialParameters(String str, int i) {
        C0W3J.LJIIIIZZ(str);
        try {
            this.zza = PublicKeyCredentialType.fromString(str);
            C0W3J.LJIIIIZZ(Integer.valueOf(i));
            try {
                this.zzb = COSEAlgorithmIdentifier.LIZ(i);
            } catch (C1633830scP e) {
                TryCatchGuardChecker.doCheck(e);
                throw new IllegalArgumentException(e);
            }
        } catch (C19843512kT e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new IllegalArgumentException(e2);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 2, this.zza.toString(), false);
        C817940W6u.LJIILIIL(parcel, 3, Integer.valueOf(this.zzb.LIZIZ()));
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
