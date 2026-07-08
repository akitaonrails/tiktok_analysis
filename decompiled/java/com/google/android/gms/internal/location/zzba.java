package com.google.android.gms.internal.location;

import X.C0W0T;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzba;
import com.google.android.gms.location.LocationRequest;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class zzba extends AbstractSafeParcelable {
    public final LocationRequest LL;
    public final List<ClientIdentity> LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final String LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public final String LLJI;
    public final long LLJIJIL;
    public static final List<ClientIdentity> LLJILJIL = Collections.emptyList();
    public static final Parcelable.Creator<zzba> CREATOR = new Parcelable.Creator<zzba>() { // from class: X.0W3Z
        @Override // android.os.Parcelable.Creator
        public final zzba createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            List<ClientIdentity> listLJIIJJI = zzba.LLJILJIL;
            LocationRequest locationRequest = null;
            String strLJII = null;
            String strLJII2 = null;
            String strLJII3 = null;
            boolean zLJIILIIL = false;
            boolean zLJIILIIL2 = false;
            boolean zLJIILIIL3 = false;
            boolean zLJIILIIL4 = false;
            boolean zLJIILIIL5 = false;
            long jLJJ = Long.MAX_VALUE;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    switch (c) {
                        case 5:
                            listLJIIJJI = C0W6J.LJIIJJI(parcel, i, ClientIdentity.CREATOR);
                            break;
                        case 6:
                            strLJII = C0W6J.LJII(i, parcel);
                            break;
                        case 7:
                            zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                            break;
                        case '\b':
                            zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            zLJIILIIL3 = C0W6J.LJIILIIL(i, parcel);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            strLJII2 = C0W6J.LJII(i, parcel);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            zLJIILIIL4 = C0W6J.LJIILIIL(i, parcel);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            zLJIILIIL5 = C0W6J.LJIILIIL(i, parcel);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            strLJII3 = C0W6J.LJII(i, parcel);
                            break;
                        case 14:
                            jLJJ = C0W6J.LJJ(i, parcel);
                            break;
                        default:
                            C0W6J.LJJII(i, parcel);
                            break;
                    }
                } else {
                    locationRequest = (LocationRequest) C0W6J.LJI(parcel, i, LocationRequest.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzba(locationRequest, listLJIIJJI, strLJII, zLJIILIIL, zLJIILIIL2, zLJIILIIL3, strLJII2, zLJIILIIL4, zLJIILIIL5, strLJII3, jLJJ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ zzba[] newArray(int i) {
            return new zzba[i];
        }
    };

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.LL);
        if (this.LLILLL != null) {
            sb.append(" tag=");
            sb.append(this.LLILLL);
        }
        if (this.LLIZ != null) {
            sb.append(" moduleId=");
            sb.append(this.LLIZ);
        }
        if (this.LLJI != null) {
            sb.append(" contextAttributionTag=");
            sb.append(this.LLJI);
        }
        sb.append(" hideAppOps=");
        sb.append(this.LLILZ);
        sb.append(" clients=");
        sb.append(this.LLILLJJLI);
        sb.append(" forceCoarseLocation=");
        sb.append(this.LLILZIL);
        if (this.LLILZLL) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        if (this.LLIZLLLIL) {
            sb.append(" locationSettingsIgnored");
        }
        if (this.LLJ) {
            sb.append(" inaccurateLocationsDelayed");
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzba) {
            zzba zzbaVar = (zzba) obj;
            if (C0W0T.LIZIZ(this.LL, zzbaVar.LL) && C0W0T.LIZIZ(this.LLILLJJLI, zzbaVar.LLILLJJLI) && C0W0T.LIZIZ(this.LLILLL, zzbaVar.LLILLL) && this.LLILZ == zzbaVar.LLILZ && this.LLILZIL == zzbaVar.LLILZIL && this.LLILZLL == zzbaVar.LLILZLL && C0W0T.LIZIZ(this.LLIZ, zzbaVar.LLIZ) && this.LLIZLLLIL == zzbaVar.LLIZLLLIL && this.LLJ == zzbaVar.LLJ && C0W0T.LIZIZ(this.LLJI, zzbaVar.LLJI)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 1, this.LL, i, false);
        C817940W6u.LJIL(parcel, 5, this.LLILLJJLI, false);
        C817940W6u.LJIJ(parcel, 6, this.LLILLL, false);
        C817940W6u.LIZ(parcel, 7, this.LLILZ);
        C817940W6u.LIZ(parcel, 8, this.LLILZIL);
        C817940W6u.LIZ(parcel, 9, this.LLILZLL);
        C817940W6u.LJIJ(parcel, 10, this.LLIZ, false);
        C817940W6u.LIZ(parcel, 11, this.LLIZLLLIL);
        C817940W6u.LIZ(parcel, 12, this.LLJ);
        C817940W6u.LJIJ(parcel, 13, this.LLJI, false);
        C817940W6u.LJIILJJIL(14, this.LLJIJIL, parcel);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzba(LocationRequest locationRequest, List<ClientIdentity> list, String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, String str3, long j) {
        this.LL = locationRequest;
        this.LLILLJJLI = list;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = z3;
        this.LLIZ = str2;
        this.LLIZLLLIL = z4;
        this.LLJ = z5;
        this.LLJI = str3;
        this.LLJIJIL = j;
    }
}
