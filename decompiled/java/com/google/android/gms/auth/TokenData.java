package com.google.android.gms.auth;

import X.C0W0T;
import X.C0W3J;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new Parcelable.Creator() { // from class: X.0W3N
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            int iLJIJJLI = 0;
            boolean zLJIILIIL = false;
            boolean zLJIILIIL2 = false;
            Long lLJJI = null;
            ArrayList arrayListLJIIIZ = null;
            String strLJII2 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 1:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 2:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 3:
                        lLJJI = C0W6J.LJJI(i, parcel);
                        break;
                    case 4:
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case 5:
                        zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case 6:
                        arrayListLJIIIZ = C0W6J.LJIIIZ(i, parcel);
                        break;
                    case 7:
                        strLJII2 = C0W6J.LJII(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new TokenData(iLJIJJLI, strLJII, lLJJI, zLJIILIIL, zLJIILIIL2, arrayListLJIIIZ, strLJII2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new TokenData[i];
        }
    };
    public final int LL;
    public final String zzb;
    public final Long zzc;
    public final boolean zzd;
    public final boolean zze;
    public final List zzf;
    public final String zzg;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, this.zzc, Boolean.valueOf(this.zzd), Boolean.valueOf(this.zze), this.zzf, this.zzg});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        if (!TextUtils.equals(this.zzb, tokenData.zzb) || !C0W0T.LIZIZ(this.zzc, tokenData.zzc) || this.zzd != tokenData.zzd || this.zze != tokenData.zze || !C0W0T.LIZIZ(this.zzf, tokenData.zzf) || !C0W0T.LIZIZ(this.zzg, tokenData.zzg)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIJ(parcel, 2, this.zzb, false);
        C817940W6u.LJIILLIIL(parcel, 3, this.zzc);
        C817940W6u.LIZ(parcel, 4, this.zzd);
        C817940W6u.LIZ(parcel, 5, this.zze);
        C817940W6u.LJIJJ(parcel, 6, this.zzf);
        C817940W6u.LJIJ(parcel, 7, this.zzg, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public TokenData(int i, String str, Long l, boolean z, boolean z2, List list, String str2) {
        this.LL = i;
        C0W3J.LJI(str);
        this.zzb = str;
        this.zzc = l;
        this.zzd = z;
        this.zze = z2;
        this.zzf = list;
        this.zzg = str2;
    }
}
