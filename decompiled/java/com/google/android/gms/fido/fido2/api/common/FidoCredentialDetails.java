package com.google.android.gms.fido.fido2.api.common;

import X.C0W0T;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class FidoCredentialDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FidoCredentialDetails> CREATOR = new Parcelable.Creator() { // from class: X.0W0M
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            long jLJJ = 0;
            boolean zLJIILIIL = false;
            boolean zLJIILIIL2 = false;
            String strLJII2 = null;
            byte[] bArrLIZJ = null;
            byte[] bArrLIZJ2 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 1:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 2:
                        strLJII2 = C0W6J.LJII(i, parcel);
                        break;
                    case 3:
                        bArrLIZJ = C0W6J.LIZJ(i, parcel);
                        break;
                    case 4:
                        bArrLIZJ2 = C0W6J.LIZJ(i, parcel);
                        break;
                    case 5:
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case 6:
                        zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case 7:
                        jLJJ = C0W6J.LJJ(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new FidoCredentialDetails(strLJII, strLJII2, bArrLIZJ, bArrLIZJ2, zLJIILIIL, zLJIILIIL2, jLJJ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new FidoCredentialDetails[i];
        }
    };
    public final String zza;
    public final String zzb;
    public final byte[] zzc;
    public final byte[] zzd;
    public final boolean zze;
    public final boolean zzf;
    public final long zzg;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, Boolean.valueOf(this.zze), Boolean.valueOf(this.zzf), Long.valueOf(this.zzg)});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FidoCredentialDetails)) {
            return false;
        }
        FidoCredentialDetails fidoCredentialDetails = (FidoCredentialDetails) obj;
        if (!C0W0T.LIZIZ(this.zza, fidoCredentialDetails.zza) || !C0W0T.LIZIZ(this.zzb, fidoCredentialDetails.zzb) || !Arrays.equals(this.zzc, fidoCredentialDetails.zzc) || !Arrays.equals(this.zzd, fidoCredentialDetails.zzd) || this.zze != fidoCredentialDetails.zze || this.zzf != fidoCredentialDetails.zzf || this.zzg != fidoCredentialDetails.zzg) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 1, this.zza, false);
        C817940W6u.LJIJ(parcel, 2, this.zzb, false);
        C817940W6u.LJ(parcel, 3, this.zzc, false);
        C817940W6u.LJ(parcel, 4, this.zzd, false);
        C817940W6u.LIZ(parcel, 5, this.zze);
        C817940W6u.LIZ(parcel, 6, this.zzf);
        C817940W6u.LJIILJJIL(7, this.zzg, parcel);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public FidoCredentialDetails(String str, String str2, byte[] bArr, byte[] bArr2, boolean z, boolean z2, long j) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bArr;
        this.zzd = bArr2;
        this.zze = z;
        this.zzf = z2;
        this.zzg = j;
    }
}
