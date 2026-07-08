package com.google.android.gms.measurement.internal;

import X.C0W3J;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzno;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes31.dex */
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new Parcelable.Creator<zzac>() { // from class: X.0WH9
        @Override // android.os.Parcelable.Creator
        public final zzac createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            String strLJII2 = null;
            zzno zznoVar = null;
            String strLJII3 = null;
            zzbf zzbfVar = null;
            zzbf zzbfVar2 = null;
            zzbf zzbfVar3 = null;
            long jLJJ = 0;
            long jLJJ2 = 0;
            long jLJJ3 = 0;
            boolean zLJIILIIL = false;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 2:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 3:
                        strLJII2 = C0W6J.LJII(i, parcel);
                        break;
                    case 4:
                        zznoVar = (zzno) C0W6J.LJI(parcel, i, zzno.CREATOR);
                        break;
                    case 5:
                        jLJJ = C0W6J.LJJ(i, parcel);
                        break;
                    case 6:
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case 7:
                        strLJII3 = C0W6J.LJII(i, parcel);
                        break;
                    case '\b':
                        zzbfVar = (zzbf) C0W6J.LJI(parcel, i, zzbf.CREATOR);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        jLJJ2 = C0W6J.LJJ(i, parcel);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        zzbfVar2 = (zzbf) C0W6J.LJI(parcel, i, zzbf.CREATOR);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        jLJJ3 = C0W6J.LJJ(i, parcel);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        zzbfVar3 = (zzbf) C0W6J.LJI(parcel, i, zzbf.CREATOR);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzac(strLJII, strLJII2, zznoVar, jLJJ, zLJIILIIL, strLJII3, zzbfVar, jLJJ2, zzbfVar2, jLJJ3, zzbfVar3);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ zzac[] newArray(int i) {
            return new zzac[i];
        }
    };
    public String zza;
    public String zzb;
    public zzno zzc;
    public long zzd;
    public boolean zze;
    public String zzf;
    public zzbf zzg;
    public long zzh;
    public zzbf zzi;
    public long zzj;
    public zzbf zzk;

    public zzac(zzac zzacVar) {
        C0W3J.LJIIIIZZ(zzacVar);
        this.zza = zzacVar.zza;
        this.zzb = zzacVar.zzb;
        this.zzc = zzacVar.zzc;
        this.zzd = zzacVar.zzd;
        this.zze = zzacVar.zze;
        this.zzf = zzacVar.zzf;
        this.zzg = zzacVar.zzg;
        this.zzh = zzacVar.zzh;
        this.zzi = zzacVar.zzi;
        this.zzj = zzacVar.zzj;
        this.zzk = zzacVar.zzk;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 2, this.zza, false);
        C817940W6u.LJIJ(parcel, 3, this.zzb, false);
        C817940W6u.LJIIZILJ(parcel, 4, this.zzc, i, false);
        C817940W6u.LJIILJJIL(5, this.zzd, parcel);
        C817940W6u.LIZ(parcel, 6, this.zze);
        C817940W6u.LJIJ(parcel, 7, this.zzf, false);
        C817940W6u.LJIIZILJ(parcel, 8, this.zzg, i, false);
        C817940W6u.LJIILJJIL(9, this.zzh, parcel);
        C817940W6u.LJIIZILJ(parcel, 10, this.zzi, i, false);
        C817940W6u.LJIILJJIL(11, this.zzj, parcel);
        C817940W6u.LJIIZILJ(parcel, 12, this.zzk, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzac(String str, String str2, zzno zznoVar, long j, boolean z, String str3, zzbf zzbfVar, long j2, zzbf zzbfVar2, long j3, zzbf zzbfVar3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zznoVar;
        this.zzd = j;
        this.zze = z;
        this.zzf = str3;
        this.zzg = zzbfVar;
        this.zzh = j2;
        this.zzi = zzbfVar2;
        this.zzj = j3;
        this.zzk = zzbfVar3;
    }
}
