package com.google.android.gms.tapandpay.issuer;

import X.C817940W6u;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.UserAddress;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes14.dex */
public class PushTokenizeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PushTokenizeRequest> CREATOR = new Parcelable.Creator() { // from class: X.0WnD
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            byte[] bArrLIZJ = null;
            String strLJII = null;
            String strLJII2 = null;
            UserAddress userAddress = null;
            int[] iArrLIZLLL = null;
            IBinder iBinderLJIJJ = null;
            int iLJIJJLI = 0;
            int iLJIJJLI2 = 0;
            boolean zLJIILIIL = false;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 2:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 3:
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 4:
                        bArrLIZJ = C0W6J.LIZJ(i, parcel);
                        break;
                    case 5:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 6:
                        strLJII2 = C0W6J.LJII(i, parcel);
                        break;
                    case 7:
                        userAddress = (UserAddress) C0W6J.LJI(parcel, i, UserAddress.CREATOR);
                        break;
                    case '\b':
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        iArrLIZLLL = C0W6J.LIZLLL(i, parcel);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        iBinderLJIJJ = C0W6J.LJIJJ(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new PushTokenizeRequest(iLJIJJLI, iLJIJJLI2, bArrLIZJ, strLJII, strLJII2, userAddress, zLJIILIIL, iArrLIZLLL, iBinderLJIJJ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new PushTokenizeRequest[i];
        }
    };
    public final int LL;
    public final int LLILLJJLI;
    public final byte[] LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final UserAddress LLILZLL;
    public final boolean LLIZ;
    public final int[] LLIZLLLIL;
    public final IBinder LLJ;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 2, this.LL);
        C817940W6u.LJIIJ(parcel, 3, this.LLILLJJLI);
        C817940W6u.LJ(parcel, 4, this.LLILLL, false);
        C817940W6u.LJIJ(parcel, 5, this.LLILZ, false);
        C817940W6u.LJIJ(parcel, 6, this.LLILZIL, false);
        C817940W6u.LJIIZILJ(parcel, 7, this.LLILZLL, i, false);
        C817940W6u.LIZ(parcel, 8, this.LLIZ);
        C817940W6u.LJIIJJI(parcel, 9, this.LLIZLLLIL);
        C817940W6u.LJIIIZ(parcel, 10, this.LLJ);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public PushTokenizeRequest(int i, int i2, byte[] bArr, String str, String str2, UserAddress userAddress, boolean z, int[] iArr, IBinder iBinder) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = bArr;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = userAddress;
        this.LLIZ = z;
        this.LLIZLLLIL = iArr;
        this.LLJ = iBinder;
    }
}
