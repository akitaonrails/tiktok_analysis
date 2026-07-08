package com.google.android.gms.fido.u2f.api.common;

import X.AbstractC19850812le;
import X.C0W0T;
import X.C0W3J;
import X.C19840412jy;
import X.C19840612k0;
import X.C19851012lg;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import java.util.Arrays;

/* JADX INFO: loaded from: classes31.dex */
public class SignResponseData extends ResponseData {
    public static final Parcelable.Creator<SignResponseData> CREATOR = new Parcelable.Creator() { // from class: X.12js
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            byte[] bArrLIZJ = null;
            String strLJII = null;
            byte[] bArrLIZJ2 = null;
            byte[] bArrLIZJ3 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                bArrLIZJ3 = C0W6J.LIZJ(i, parcel);
                            }
                        } else {
                            bArrLIZJ2 = C0W6J.LIZJ(i, parcel);
                        }
                    } else {
                        strLJII = C0W6J.LJII(i, parcel);
                    }
                } else {
                    bArrLIZJ = C0W6J.LIZJ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new SignResponseData(strLJII, bArrLIZJ, bArrLIZJ2, bArrLIZJ3);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new SignResponseData[i];
        }
    };
    public final byte[] zza;
    public final String zzb;
    public final byte[] zzc;
    public final byte[] zzd;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.zza)), this.zzb, Integer.valueOf(Arrays.hashCode(this.zzc)), Integer.valueOf(Arrays.hashCode(this.zzd))});
    }

    public final String toString() {
        C19840612k0 c19840612k0LIZ = C19840412jy.LIZ(this);
        C19851012lg c19851012lg = AbstractC19850812le.LIZ;
        byte[] bArr = this.zza;
        c19840612k0LIZ.LIZ(c19851012lg.LIZIZ(bArr, bArr.length), "keyHandle");
        c19840612k0LIZ.LIZ(this.zzb, "clientDataString");
        byte[] bArr2 = this.zzc;
        c19840612k0LIZ.LIZ(c19851012lg.LIZIZ(bArr2, bArr2.length), "signatureData");
        byte[] bArr3 = this.zzd;
        c19840612k0LIZ.LIZ(c19851012lg.LIZIZ(bArr3, bArr3.length), "application");
        return c19840612k0LIZ.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignResponseData)) {
            return false;
        }
        SignResponseData signResponseData = (SignResponseData) obj;
        if (!Arrays.equals(this.zza, signResponseData.zza) || !C0W0T.LIZIZ(this.zzb, signResponseData.zzb) || !Arrays.equals(this.zzc, signResponseData.zzc) || !Arrays.equals(this.zzd, signResponseData.zzd)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJ(parcel, 2, this.zza, false);
        C817940W6u.LJIJ(parcel, 3, this.zzb, false);
        C817940W6u.LJ(parcel, 4, this.zzc, false);
        C817940W6u.LJ(parcel, 5, this.zzd, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public SignResponseData(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        C0W3J.LJIIIIZZ(bArr);
        this.zza = bArr;
        C0W3J.LJIIIIZZ(str);
        this.zzb = str;
        C0W3J.LJIIIIZZ(bArr2);
        this.zzc = bArr2;
        C0W3J.LJIIIIZZ(bArr3);
        this.zzd = bArr3;
    }
}
