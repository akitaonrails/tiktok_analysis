package com.google.android.gms.tapandpay.issuer;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes14.dex */
public final class TokenInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TokenInfo> CREATOR = new Parcelable.Creator() { // from class: X.0W6o
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            String strLJII2 = null;
            String strLJII3 = null;
            String strLJII4 = null;
            String strLJII5 = null;
            int iLJIJJLI = 0;
            int iLJIJJLI2 = 0;
            int iLJIJJLI3 = 0;
            boolean zLJIILIIL = false;
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
                        strLJII3 = C0W6J.LJII(i, parcel);
                        break;
                    case 4:
                        strLJII4 = C0W6J.LJII(i, parcel);
                        break;
                    case 5:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 6:
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 7:
                        iLJIJJLI3 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case '\b':
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        strLJII5 = C0W6J.LJII(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new TokenInfo(strLJII, strLJII2, strLJII3, strLJII4, iLJIJJLI, iLJIJJLI2, iLJIJJLI3, zLJIILIIL, strLJII5);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new TokenInfo[i];
        }
    };
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final boolean zzh;
    public final String zzi;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 1, this.zza, false);
        C817940W6u.LJIJ(parcel, 2, this.zzb, false);
        C817940W6u.LJIJ(parcel, 3, this.zzc, false);
        C817940W6u.LJIJ(parcel, 4, this.zzd, false);
        C817940W6u.LJIIJ(parcel, 5, this.zze);
        C817940W6u.LJIIJ(parcel, 6, this.zzf);
        C817940W6u.LJIIJ(parcel, 7, this.zzg);
        C817940W6u.LIZ(parcel, 8, this.zzh);
        C817940W6u.LJIJ(parcel, 9, this.zzi, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public TokenInfo(String str, String str2, String str3, String str4, int i, int i2, int i3, boolean z, String str5) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = i;
        this.zzf = i2;
        this.zzg = i3;
        this.zzh = z;
        this.zzi = str5;
    }
}
