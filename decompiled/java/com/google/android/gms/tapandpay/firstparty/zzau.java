package com.google.android.gms.tapandpay.firstparty;

import X.C0W0T;
import X.C0W3L;
import X.C817940W6u;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
import com.google.android.gms.tapandpay.firstparty.zzan;
import com.google.android.gms.tapandpay.firstparty.zzau;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new Parcelable.Creator() { // from class: X.0W6Q
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            int iLJIJJLI = 0;
            int iLJIJJLI2 = 0;
            boolean zLJIILIIL = false;
            String strLJII2 = null;
            TokenStatus tokenStatus = null;
            String strLJII3 = null;
            Uri uri = null;
            byte[] bArrLIZJ = null;
            zzan[] zzanVarArr = null;
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
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 4:
                        tokenStatus = (TokenStatus) C0W6J.LJI(parcel, i, TokenStatus.CREATOR);
                        break;
                    case 5:
                        strLJII3 = C0W6J.LJII(i, parcel);
                        break;
                    case 6:
                        uri = (Uri) C0W6J.LJI(parcel, i, Uri.CREATOR);
                        break;
                    case 7:
                        bArrLIZJ = C0W6J.LIZJ(i, parcel);
                        break;
                    case '\b':
                        zzanVarArr = (zzan[]) C0W6J.LJIIJ(parcel, i, zzan.CREATOR);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzau(strLJII, strLJII2, iLJIJJLI, tokenStatus, strLJII3, uri, bArrLIZJ, zzanVarArr, iLJIJJLI2, zLJIILIIL);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzau[i];
        }
    };
    public final String LL;
    public final String LLILLJJLI;
    public final int LLILLL;
    public final TokenStatus LLILZ;
    public final String LLILZIL;
    public final Uri LLILZLL;
    public final byte[] LLIZ;
    public final zzan[] LLIZLLLIL;
    public final int LLJ;
    public final boolean LLJI;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.LL, this.LLILLJJLI, Integer.valueOf(this.LLILLL), this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, Integer.valueOf(this.LLJ), Boolean.valueOf(this.LLJI)});
    }

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        c0w3l.LIZ(this.LL, "billingCardId");
        c0w3l.LIZ(this.LLILLJJLI, "displayName");
        c0w3l.LIZ(Integer.valueOf(this.LLILLL), "cardNetwork");
        c0w3l.LIZ(this.LLILZ, "tokenStatus");
        c0w3l.LIZ(this.LLILZIL, "panLastDigits");
        c0w3l.LIZ(this.LLILZLL, "cardImageUrl");
        byte[] bArr = this.LLIZ;
        c0w3l.LIZ(bArr == null ? null : Arrays.toString(bArr), "inAppCardToken");
        zzan[] zzanVarArr = this.LLIZLLLIL;
        c0w3l.LIZ(zzanVarArr != null ? Arrays.toString(zzanVarArr) : null, "onlineAccountCardLinkInfos");
        c0w3l.LIZ(Integer.valueOf(this.LLJ), "tokenType");
        c0w3l.LIZ(Boolean.valueOf(this.LLJI), "supportsOdaTransit");
        return c0w3l.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzau) {
            zzau zzauVar = (zzau) obj;
            if (C0W0T.LIZIZ(this.LL, zzauVar.LL) && C0W0T.LIZIZ(this.LLILLJJLI, zzauVar.LLILLJJLI) && this.LLILLL == zzauVar.LLILLL && C0W0T.LIZIZ(this.LLILZ, zzauVar.LLILZ) && C0W0T.LIZIZ(this.LLILZIL, zzauVar.LLILZIL) && C0W0T.LIZIZ(this.LLILZLL, zzauVar.LLILZLL) && Arrays.equals(this.LLIZ, zzauVar.LLIZ) && Arrays.equals(this.LLIZLLLIL, zzauVar.LLIZLLLIL) && this.LLJ == zzauVar.LLJ && this.LLJI == zzauVar.LLJI) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 1, this.LL, false);
        C817940W6u.LJIJ(parcel, 2, this.LLILLJJLI, false);
        C817940W6u.LJIIJ(parcel, 3, this.LLILLL);
        C817940W6u.LJIIZILJ(parcel, 4, this.LLILZ, i, false);
        C817940W6u.LJIJ(parcel, 5, this.LLILZIL, false);
        C817940W6u.LJIIZILJ(parcel, 6, this.LLILZLL, i, false);
        C817940W6u.LJ(parcel, 7, this.LLIZ, false);
        C817940W6u.LJIJJLI(parcel, 8, this.LLIZLLLIL, i);
        C817940W6u.LJIIJ(parcel, 9, this.LLJ);
        C817940W6u.LIZ(parcel, 10, this.LLJI);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzau(String str, String str2, int i, TokenStatus tokenStatus, String str3, Uri uri, byte[] bArr, zzan[] zzanVarArr, int i2, boolean z) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = i;
        this.LLILZ = tokenStatus;
        this.LLILZIL = str3;
        this.LLILZLL = uri;
        this.LLIZ = bArr;
        this.LLIZLLLIL = zzanVarArr;
        this.LLJ = i2;
        this.LLJI = z;
    }
}
