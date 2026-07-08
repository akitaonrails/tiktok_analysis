package com.google.android.gms.identity.intents.model;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes14.dex */
public final class UserAddress extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new Parcelable.Creator<UserAddress>() { // from class: X.0WpJ
        @Override // android.os.Parcelable.Creator
        public final UserAddress createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            String strLJII2 = null;
            String strLJII3 = null;
            String strLJII4 = null;
            String strLJII5 = null;
            String strLJII6 = null;
            String strLJII7 = null;
            String strLJII8 = null;
            String strLJII9 = null;
            String strLJII10 = null;
            String strLJII11 = null;
            String strLJII12 = null;
            String strLJII13 = null;
            String strLJII14 = null;
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
                        strLJII3 = C0W6J.LJII(i, parcel);
                        break;
                    case 5:
                        strLJII4 = C0W6J.LJII(i, parcel);
                        break;
                    case 6:
                        strLJII5 = C0W6J.LJII(i, parcel);
                        break;
                    case 7:
                        strLJII6 = C0W6J.LJII(i, parcel);
                        break;
                    case '\b':
                        strLJII7 = C0W6J.LJII(i, parcel);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        strLJII8 = C0W6J.LJII(i, parcel);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        strLJII9 = C0W6J.LJII(i, parcel);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        strLJII10 = C0W6J.LJII(i, parcel);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        strLJII11 = C0W6J.LJII(i, parcel);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        strLJII12 = C0W6J.LJII(i, parcel);
                        break;
                    case 14:
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case 15:
                        strLJII13 = C0W6J.LJII(i, parcel);
                        break;
                    case 16:
                        strLJII14 = C0W6J.LJII(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new UserAddress(strLJII, strLJII2, strLJII3, strLJII4, strLJII5, strLJII6, strLJII7, strLJII8, strLJII9, strLJII10, strLJII11, strLJII12, zLJIILIIL, strLJII13, strLJII14);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ UserAddress[] newArray(int i) {
            return new UserAddress[i];
        }
    };
    public String zza;
    public String zzb;
    public String zzc;
    public String zzd;
    public String zze;
    public String zzf;
    public String zzg;
    public String zzh;
    public String zzi;
    public String zzj;
    public String zzk;
    public String zzl;
    public boolean zzm;
    public String zzn;
    public String zzo;

    public UserAddress() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 2, this.zza, false);
        C817940W6u.LJIJ(parcel, 3, this.zzb, false);
        C817940W6u.LJIJ(parcel, 4, this.zzc, false);
        C817940W6u.LJIJ(parcel, 5, this.zzd, false);
        C817940W6u.LJIJ(parcel, 6, this.zze, false);
        C817940W6u.LJIJ(parcel, 7, this.zzf, false);
        C817940W6u.LJIJ(parcel, 8, this.zzg, false);
        C817940W6u.LJIJ(parcel, 9, this.zzh, false);
        C817940W6u.LJIJ(parcel, 10, this.zzi, false);
        C817940W6u.LJIJ(parcel, 11, this.zzj, false);
        C817940W6u.LJIJ(parcel, 12, this.zzk, false);
        C817940W6u.LJIJ(parcel, 13, this.zzl, false);
        C817940W6u.LIZ(parcel, 14, this.zzm);
        C817940W6u.LJIJ(parcel, 15, this.zzn, false);
        C817940W6u.LJIJ(parcel, 16, this.zzo, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, String str14) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = str9;
        this.zzj = str10;
        this.zzk = str11;
        this.zzl = str12;
        this.zzm = z;
        this.zzn = str13;
        this.zzo = str14;
    }
}
