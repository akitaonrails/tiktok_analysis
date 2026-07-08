package com.google.android.gms.common.stats;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.google.android.gms.common.stats.WakeLockEvent;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new Parcelable.Creator() { // from class: X.0W0L
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            int iLJIJJLI = 0;
            int iLJIJJLI2 = 0;
            int iLJIJJLI3 = 0;
            int iLJIJJLI4 = 0;
            boolean zLJIILIIL = false;
            long jLJJ = 0;
            long jLJJ2 = 0;
            long jLJJ3 = 0;
            ArrayList arrayListLJIIIZ = null;
            String strLJII2 = null;
            String strLJII3 = null;
            String strLJII4 = null;
            String strLJII5 = null;
            float fLJIJ = 0.0f;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 1:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 2:
                        jLJJ = C0W6J.LJJ(i, parcel);
                        break;
                    case 3:
                    case 7:
                    case BdTuring.TYPE_ECAF /* 9 */:
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                    case 4:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 5:
                        iLJIJJLI3 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 6:
                        arrayListLJIIIZ = C0W6J.LJIIIZ(i, parcel);
                        break;
                    case '\b':
                        jLJJ2 = C0W6J.LJJ(i, parcel);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        strLJII3 = C0W6J.LJII(i, parcel);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        strLJII2 = C0W6J.LJII(i, parcel);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        strLJII4 = C0W6J.LJII(i, parcel);
                        break;
                    case 14:
                        iLJIJJLI4 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 15:
                        fLJIJ = C0W6J.LJIJ(i, parcel);
                        break;
                    case 16:
                        jLJJ3 = C0W6J.LJJ(i, parcel);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        strLJII5 = C0W6J.LJII(i, parcel);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new WakeLockEvent(iLJIJJLI, jLJJ, iLJIJJLI2, strLJII, iLJIJJLI3, arrayListLJIIIZ, strLJII2, jLJJ2, iLJIJJLI4, strLJII3, strLJII4, fLJIJ, jLJJ3, strLJII5, zLJIILIIL);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new WakeLockEvent[i];
        }
    };
    public final int LL;
    public final long zzb;
    public int zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final int zzg;
    public final List zzh;
    public final String zzi;
    public final long zzj;
    public int zzk;
    public final String zzl;
    public final float zzm;
    public final long zzn;
    public final boolean zzo;
    public long zzp = -1;

    public WakeLockEvent(int i, long j, int i2, String str, int i3, List list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5, boolean z) {
        this.LL = i;
        this.zzb = j;
        this.zzc = i2;
        this.zzd = str;
        this.zze = str3;
        this.zzf = str5;
        this.zzg = i3;
        this.zzh = list;
        this.zzi = str2;
        this.zzj = j2;
        this.zzk = i4;
        this.zzl = str4;
        this.zzm = f;
        this.zzn = j3;
        this.zzo = z;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int LJLZ() {
        return this.zzc;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long LLFFF() {
        return this.zzp;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long LLI() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String LLIFFJFJJ() {
        List list = this.zzh;
        String str = this.zzd;
        int i = this.zzg;
        String strJoin = list == null ? "" : TextUtils.join(",", list);
        int i2 = this.zzk;
        String str2 = this.zze;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.zzl;
        if (str3 == null) {
            str3 = "";
        }
        float f = this.zzm;
        String str4 = this.zzf;
        return "\t" + str + "\t" + i + "\t" + strJoin + "\t" + i2 + "\t" + str2 + "\t" + str3 + "\t" + f + "\t" + (str4 != null ? str4 : "") + "\t" + this.zzo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIILJJIL(2, this.zzb, parcel);
        C817940W6u.LJIJ(parcel, 4, this.zzd, false);
        C817940W6u.LJIIJ(parcel, 5, this.zzg);
        C817940W6u.LJIJJ(parcel, 6, this.zzh);
        C817940W6u.LJIILJJIL(8, this.zzj, parcel);
        C817940W6u.LJIJ(parcel, 10, this.zze, false);
        C817940W6u.LJIIJ(parcel, 11, this.zzc);
        C817940W6u.LJIJ(parcel, 12, this.zzi, false);
        C817940W6u.LJIJ(parcel, 13, this.zzl, false);
        C817940W6u.LJIIJ(parcel, 14, this.zzk);
        C817940W6u.LJII(parcel, 15, this.zzm);
        C817940W6u.LJIILJJIL(16, this.zzn, parcel);
        C817940W6u.LJIJ(parcel, 17, this.zzf, false);
        C817940W6u.LIZ(parcel, 18, this.zzo);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
