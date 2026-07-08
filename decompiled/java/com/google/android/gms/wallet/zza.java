package com.google.android.gms.wallet;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.zza;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes14.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new Parcelable.Creator() { // from class: X.0WpH
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
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
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        strLJII10 = C0W6J.LJII(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zza(strLJII, strLJII2, strLJII3, strLJII4, strLJII5, strLJII6, strLJII7, strLJII8, strLJII9, strLJII10, zLJIILIIL);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zza[i];
        }
    };
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final boolean LLJI;
    public final String LLJIJIL;

    public zza() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 2, this.LL, false);
        C817940W6u.LJIJ(parcel, 3, this.LLILLJJLI, false);
        C817940W6u.LJIJ(parcel, 4, this.LLILLL, false);
        C817940W6u.LJIJ(parcel, 5, this.LLILZ, false);
        C817940W6u.LJIJ(parcel, 6, this.LLILZIL, false);
        C817940W6u.LJIJ(parcel, 7, this.LLILZLL, false);
        C817940W6u.LJIJ(parcel, 8, this.LLIZ, false);
        C817940W6u.LJIJ(parcel, 9, this.LLIZLLLIL, false);
        C817940W6u.LJIJ(parcel, 10, this.LLJ, false);
        C817940W6u.LIZ(parcel, 11, this.LLJI);
        C817940W6u.LJIJ(parcel, 12, this.LLJIJIL, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zza(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
        this.LLIZ = str7;
        this.LLIZLLLIL = str8;
        this.LLJ = str9;
        this.LLJI = z;
        this.LLJIJIL = str10;
    }
}
