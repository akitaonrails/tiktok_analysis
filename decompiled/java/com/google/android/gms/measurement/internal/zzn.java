package com.google.android.gms.measurement.internal;

import X.C0W3J;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzn;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new Parcelable.Creator<zzn>() { // from class: X.0W6x
        @Override // android.os.Parcelable.Creator
        public final zzn createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            String strLJII2 = "";
            String strLJII3 = null;
            String strLJII4 = null;
            String strLJII5 = null;
            String strLJII6 = null;
            String strLJII7 = null;
            String strLJII8 = null;
            Boolean boolLJIILJJIL = null;
            ArrayList arrayListLJIIIZ = null;
            String strLJII9 = null;
            String strLJII10 = null;
            String strLJII11 = null;
            long jLJJ = 0;
            long jLJJ2 = 0;
            long jLJJ3 = 0;
            long jLJJ4 = 0;
            long jLJJ5 = 0;
            long jLJJ6 = 0;
            long jLJJ7 = 0;
            boolean zLJIILIIL = true;
            boolean zLJIILIIL2 = true;
            boolean zLJIILIIL3 = false;
            int iLJIJJLI = 0;
            boolean zLJIILIIL4 = false;
            boolean zLJIILIIL5 = false;
            int iLJIJJLI2 = 0;
            long jLJJ8 = -2147483648L;
            String strLJII12 = "";
            String strLJII13 = "";
            String strLJII14 = "";
            int iLJIJJLI3 = 100;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 2:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 3:
                        strLJII3 = C0W6J.LJII(i, parcel);
                        break;
                    case 4:
                        strLJII4 = C0W6J.LJII(i, parcel);
                        break;
                    case 5:
                        strLJII5 = C0W6J.LJII(i, parcel);
                        break;
                    case 6:
                        jLJJ = C0W6J.LJJ(i, parcel);
                        break;
                    case 7:
                        jLJJ2 = C0W6J.LJJ(i, parcel);
                        break;
                    case '\b':
                        strLJII6 = C0W6J.LJII(i, parcel);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        zLJIILIIL3 = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        jLJJ8 = C0W6J.LJJ(i, parcel);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        strLJII7 = C0W6J.LJII(i, parcel);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        jLJJ3 = C0W6J.LJJ(i, parcel);
                        break;
                    case 14:
                        jLJJ4 = C0W6J.LJJ(i, parcel);
                        break;
                    case 15:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 16:
                        zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                    case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        zLJIILIIL4 = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case 19:
                        strLJII8 = C0W6J.LJII(i, parcel);
                        break;
                    case 21:
                        boolLJIILJJIL = C0W6J.LJIILJJIL(i, parcel);
                        break;
                    case 22:
                        jLJJ5 = C0W6J.LJJ(i, parcel);
                        break;
                    case 23:
                        arrayListLJIIIZ = C0W6J.LJIIIZ(i, parcel);
                        break;
                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                        strLJII9 = C0W6J.LJII(i, parcel);
                        break;
                    case 25:
                        strLJII2 = C0W6J.LJII(i, parcel);
                        break;
                    case 26:
                        strLJII12 = C0W6J.LJII(i, parcel);
                        break;
                    case 27:
                        strLJII10 = C0W6J.LJII(i, parcel);
                        break;
                    case 28:
                        zLJIILIIL5 = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case 29:
                        jLJJ6 = C0W6J.LJJ(i, parcel);
                        break;
                    case 30:
                        iLJIJJLI3 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 31:
                        strLJII13 = C0W6J.LJII(i, parcel);
                        break;
                    case ' ':
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                        jLJJ7 = C0W6J.LJJ(i, parcel);
                        break;
                    case '#':
                        strLJII11 = C0W6J.LJII(i, parcel);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                        strLJII14 = C0W6J.LJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzn(strLJII, strLJII3, strLJII4, strLJII5, jLJJ, jLJJ2, strLJII6, zLJIILIIL, zLJIILIIL3, jLJJ8, strLJII7, jLJJ3, jLJJ4, iLJIJJLI, zLJIILIIL2, zLJIILIIL4, strLJII8, boolLJIILJJIL, jLJJ5, arrayListLJIIIZ, strLJII9, strLJII2, strLJII12, strLJII10, zLJIILIIL5, jLJJ6, iLJIJJLI3, strLJII13, iLJIJJLI2, jLJJ7, strLJII11, strLJII14);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ zzn[] newArray(int i) {
            return new zzn[i];
        }
    };
    public final String zza;
    public final int zzaa;
    public final long zzab;
    public final String zzac;
    public final String zzad;
    public final long zzae;
    public final String zzaf;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final long zze;
    public final long zzf;
    public final String zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final long zzj;
    public final String zzk;
    public final long zzl;
    public final int zzm;
    public final boolean zzn;
    public final boolean zzo;
    public final String zzp;
    public final Boolean zzq;
    public final long zzr;
    public final List<String> zzs;
    public final String zzt;
    public final String zzu;
    public final String zzv;
    public final boolean zzw;
    public final long zzx;
    public final int zzy;
    public final String zzz;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 2, this.zza, false);
        C817940W6u.LJIJ(parcel, 3, this.zzb, false);
        C817940W6u.LJIJ(parcel, 4, this.zzc, false);
        C817940W6u.LJIJ(parcel, 5, this.zzd, false);
        C817940W6u.LJIILJJIL(6, this.zze, parcel);
        C817940W6u.LJIILJJIL(7, this.zzf, parcel);
        C817940W6u.LJIJ(parcel, 8, this.zzg, false);
        C817940W6u.LIZ(parcel, 9, this.zzh);
        C817940W6u.LIZ(parcel, 10, this.zzi);
        C817940W6u.LJIILJJIL(11, this.zzj, parcel);
        C817940W6u.LJIJ(parcel, 12, this.zzk, false);
        C817940W6u.LJIILJJIL(13, this.zzae, parcel);
        C817940W6u.LJIILJJIL(14, this.zzl, parcel);
        C817940W6u.LJIIJ(parcel, 15, this.zzm);
        C817940W6u.LIZ(parcel, 16, this.zzn);
        C817940W6u.LIZ(parcel, 18, this.zzo);
        C817940W6u.LJIJ(parcel, 19, this.zzp, false);
        C817940W6u.LIZIZ(parcel, 21, this.zzq);
        C817940W6u.LJIILJJIL(22, this.zzr, parcel);
        C817940W6u.LJIJJ(parcel, 23, this.zzs);
        C817940W6u.LJIJ(parcel, 24, this.zzaf, false);
        C817940W6u.LJIJ(parcel, 25, this.zzt, false);
        C817940W6u.LJIJ(parcel, 26, this.zzu, false);
        C817940W6u.LJIJ(parcel, 27, this.zzv, false);
        C817940W6u.LIZ(parcel, 28, this.zzw);
        C817940W6u.LJIILJJIL(29, this.zzx, parcel);
        C817940W6u.LJIIJ(parcel, 30, this.zzy);
        C817940W6u.LJIJ(parcel, 31, this.zzz, false);
        C817940W6u.LJIIJ(parcel, 32, this.zzaa);
        C817940W6u.LJIILJJIL(34, this.zzab, parcel);
        C817940W6u.LJIJ(parcel, 35, this.zzac, false);
        C817940W6u.LJIJ(parcel, 36, this.zzad, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzn(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, String str7, Boolean bool, long j5, List list, String str8, String str9, String str10, boolean z5, long j6, int i2, String str11, int i3, long j7, String str12, String str13) {
        C0W3J.LJI(str);
        this.zza = str;
        this.zzb = TextUtils.isEmpty(str2) ? null : str2;
        this.zzc = str3;
        this.zzj = j;
        this.zzd = str4;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = str5;
        this.zzh = z;
        this.zzi = z2;
        this.zzk = str6;
        this.zzae = 0L;
        this.zzl = j4;
        this.zzm = i;
        this.zzn = z3;
        this.zzo = z4;
        this.zzp = str7;
        this.zzq = bool;
        this.zzr = j5;
        this.zzs = list;
        this.zzaf = null;
        this.zzt = str8;
        this.zzu = str9;
        this.zzv = str10;
        this.zzw = z5;
        this.zzx = j6;
        this.zzy = i2;
        this.zzz = str11;
        this.zzaa = i3;
        this.zzab = j7;
        this.zzac = str12;
        this.zzad = str13;
    }

    public zzn(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List<String> list, String str8, String str9, String str10, String str11, boolean z5, long j7, int i2, String str12, int i3, long j8, String str13, String str14) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzj = j3;
        this.zzd = str4;
        this.zze = j;
        this.zzf = j2;
        this.zzg = str5;
        this.zzh = z;
        this.zzi = z2;
        this.zzk = str6;
        this.zzae = j4;
        this.zzl = j5;
        this.zzm = i;
        this.zzn = z3;
        this.zzo = z4;
        this.zzp = str7;
        this.zzq = bool;
        this.zzr = j6;
        this.zzs = list;
        this.zzaf = str8;
        this.zzt = str9;
        this.zzu = str10;
        this.zzv = str11;
        this.zzw = z5;
        this.zzx = j7;
        this.zzy = i2;
        this.zzz = str12;
        this.zzaa = i3;
        this.zzab = j8;
        this.zzac = str13;
        this.zzad = str14;
    }
}
