package com.google.android.gms.wallet;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.InstrumentInfo;
import com.google.android.gms.wallet.PaymentMethodToken;
import com.google.android.gms.wallet.zza;
import com.google.android.gms.wallet.zzaj;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes14.dex */
public final class FullWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new Parcelable.Creator() { // from class: X.0WpE
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            String strLJII2 = null;
            zzaj zzajVar = null;
            String strLJII3 = null;
            zza zzaVar = null;
            zza zzaVar2 = null;
            String[] strArrLJIIIIZZ = null;
            UserAddress userAddress = null;
            UserAddress userAddress2 = null;
            InstrumentInfo[] instrumentInfoArr = null;
            PaymentMethodToken paymentMethodToken = null;
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
                        zzajVar = (zzaj) C0W6J.LJI(parcel, i, zzaj.CREATOR);
                        break;
                    case 5:
                        strLJII3 = C0W6J.LJII(i, parcel);
                        break;
                    case 6:
                        zzaVar = (zza) C0W6J.LJI(parcel, i, zza.CREATOR);
                        break;
                    case 7:
                        zzaVar2 = (zza) C0W6J.LJI(parcel, i, zza.CREATOR);
                        break;
                    case '\b':
                        strArrLJIIIIZZ = C0W6J.LJIIIIZZ(i, parcel);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        userAddress = (UserAddress) C0W6J.LJI(parcel, i, UserAddress.CREATOR);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        userAddress2 = (UserAddress) C0W6J.LJI(parcel, i, UserAddress.CREATOR);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        instrumentInfoArr = (InstrumentInfo[]) C0W6J.LJIIJ(parcel, i, InstrumentInfo.CREATOR);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        paymentMethodToken = (PaymentMethodToken) C0W6J.LJI(parcel, i, PaymentMethodToken.CREATOR);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new FullWallet(strLJII, strLJII2, zzajVar, strLJII3, zzaVar, zzaVar2, strArrLJIIIIZZ, userAddress, userAddress2, instrumentInfoArr, paymentMethodToken);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new FullWallet[i];
        }
    };
    public final String LL;
    public final String LLILLJJLI;
    public final zzaj LLILLL;
    public final String LLILZ;
    public final zza LLILZIL;
    public final zza LLILZLL;
    public final String[] LLIZ;
    public final UserAddress LLIZLLLIL;
    public final UserAddress LLJ;
    public final InstrumentInfo[] LLJI;
    public final PaymentMethodToken LLJIJIL;

    public FullWallet() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 2, this.LL, false);
        C817940W6u.LJIJ(parcel, 3, this.LLILLJJLI, false);
        C817940W6u.LJIIZILJ(parcel, 4, this.LLILLL, i, false);
        C817940W6u.LJIJ(parcel, 5, this.LLILZ, false);
        C817940W6u.LJIIZILJ(parcel, 6, this.LLILZIL, i, false);
        C817940W6u.LJIIZILJ(parcel, 7, this.LLILZLL, i, false);
        C817940W6u.LJIJI(parcel, 8, this.LLIZ);
        C817940W6u.LJIIZILJ(parcel, 9, this.LLIZLLLIL, i, false);
        C817940W6u.LJIIZILJ(parcel, 10, this.LLJ, i, false);
        C817940W6u.LJIJJLI(parcel, 11, this.LLJI, i);
        C817940W6u.LJIIZILJ(parcel, 12, this.LLJIJIL, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public FullWallet(String str, String str2, zzaj zzajVar, String str3, zza zzaVar, zza zzaVar2, String[] strArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr, PaymentMethodToken paymentMethodToken) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = zzajVar;
        this.LLILZ = str3;
        this.LLILZIL = zzaVar;
        this.LLILZLL = zzaVar2;
        this.LLIZ = strArr;
        this.LLIZLLLIL = userAddress;
        this.LLJ = userAddress2;
        this.LLJI = instrumentInfoArr;
        this.LLJIJIL = paymentMethodToken;
    }
}
