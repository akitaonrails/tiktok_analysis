package com.google.android.gms.wallet;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.LoyaltyWalletObject;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class LoyaltyWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyWalletObject> CREATOR = new Parcelable.Creator() { // from class: X.0Wqo
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            String strLJII = null;
            int iLJIJJLI = 0;
            boolean zLJIILIIL = false;
            String strLJII2 = null;
            String strLJII3 = null;
            String strLJII4 = null;
            String strLJII5 = null;
            String strLJII6 = null;
            String strLJII7 = null;
            String strLJII8 = null;
            String strLJII9 = null;
            String strLJII10 = null;
            TimeInterval timeInterval = null;
            String strLJII11 = null;
            String strLJII12 = null;
            LoyaltyPoints loyaltyPoints = null;
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
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        arrayList = C0W6J.LJIIJJI(parcel, i, WalletObjectMessage.CREATOR);
                        break;
                    case 14:
                        timeInterval = (TimeInterval) C0W6J.LJI(parcel, i, TimeInterval.CREATOR);
                        break;
                    case 15:
                        arrayList2 = C0W6J.LJIIJJI(parcel, i, LatLng.CREATOR);
                        break;
                    case 16:
                        strLJII11 = C0W6J.LJII(i, parcel);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        strLJII12 = C0W6J.LJII(i, parcel);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        arrayList3 = C0W6J.LJIIJJI(parcel, i, LabelValueRow.CREATOR);
                        break;
                    case 19:
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        arrayList4 = C0W6J.LJIIJJI(parcel, i, UriData.CREATOR);
                        break;
                    case 21:
                        arrayList5 = C0W6J.LJIIJJI(parcel, i, TextModuleData.CREATOR);
                        break;
                    case 22:
                        arrayList6 = C0W6J.LJIIJJI(parcel, i, UriData.CREATOR);
                        break;
                    case 23:
                        loyaltyPoints = (LoyaltyPoints) C0W6J.LJI(parcel, i, LoyaltyPoints.CREATOR);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new LoyaltyWalletObject(strLJII, strLJII2, strLJII3, strLJII4, strLJII5, strLJII6, strLJII7, strLJII8, strLJII9, strLJII10, iLJIJJLI, arrayList, timeInterval, arrayList2, strLJII11, strLJII12, arrayList3, zLJIILIIL, arrayList4, arrayList5, arrayList6, loyaltyPoints);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new LoyaltyWalletObject[i];
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
    public int zzk;
    public ArrayList zzl;
    public TimeInterval zzm;
    public ArrayList zzn;
    public String zzo;
    public String zzp;
    public ArrayList zzq;
    public boolean zzr;
    public ArrayList zzs;
    public ArrayList zzt;
    public ArrayList zzu;
    public LoyaltyPoints zzv;

    public LoyaltyWalletObject() {
        this.zzl = new ArrayList();
        this.zzn = new ArrayList();
        this.zzq = new ArrayList();
        this.zzs = new ArrayList();
        this.zzt = new ArrayList();
        this.zzu = new ArrayList();
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
        C817940W6u.LJIIJ(parcel, 12, this.zzk);
        C817940W6u.LJIL(parcel, 13, this.zzl, false);
        C817940W6u.LJIIZILJ(parcel, 14, this.zzm, i, false);
        C817940W6u.LJIL(parcel, 15, this.zzn, false);
        C817940W6u.LJIJ(parcel, 16, this.zzo, false);
        C817940W6u.LJIJ(parcel, 17, this.zzp, false);
        C817940W6u.LJIL(parcel, 18, this.zzq, false);
        C817940W6u.LIZ(parcel, 19, this.zzr);
        C817940W6u.LJIL(parcel, 20, this.zzs, false);
        C817940W6u.LJIL(parcel, 21, this.zzt, false);
        C817940W6u.LJIL(parcel, 22, this.zzu, false);
        C817940W6u.LJIIZILJ(parcel, 23, this.zzv, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public LoyaltyWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, LoyaltyPoints loyaltyPoints) {
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
        this.zzk = i;
        this.zzl = arrayList;
        this.zzm = timeInterval;
        this.zzn = arrayList2;
        this.zzo = str11;
        this.zzp = str12;
        this.zzq = arrayList3;
        this.zzr = z;
        this.zzs = arrayList4;
        this.zzt = arrayList5;
        this.zzu = arrayList6;
        this.zzv = loyaltyPoints;
    }
}
