package com.google.android.gms.wallet;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.InstrumentInfo;
import com.google.android.gms.wallet.LoyaltyWalletObject;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.OfferWalletObject;
import com.google.android.gms.wallet.zza;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes14.dex */
public final class MaskedWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new Parcelable.Creator() { // from class: X.0WpF
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            String strLJII2 = null;
            String[] strArrLJIIIIZZ = null;
            String strLJII3 = null;
            zza zzaVar = null;
            zza zzaVar2 = null;
            LoyaltyWalletObject[] loyaltyWalletObjectArr = null;
            OfferWalletObject[] offerWalletObjectArr = null;
            UserAddress userAddress = null;
            UserAddress userAddress2 = null;
            InstrumentInfo[] instrumentInfoArr = null;
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
                        strArrLJIIIIZZ = C0W6J.LJIIIIZZ(i, parcel);
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
                        loyaltyWalletObjectArr = (LoyaltyWalletObject[]) C0W6J.LJIIJ(parcel, i, LoyaltyWalletObject.CREATOR);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        offerWalletObjectArr = (OfferWalletObject[]) C0W6J.LJIIJ(parcel, i, OfferWalletObject.CREATOR);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        userAddress = (UserAddress) C0W6J.LJI(parcel, i, UserAddress.CREATOR);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        userAddress2 = (UserAddress) C0W6J.LJI(parcel, i, UserAddress.CREATOR);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        instrumentInfoArr = (InstrumentInfo[]) C0W6J.LJIIJ(parcel, i, InstrumentInfo.CREATOR);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new MaskedWallet(strLJII, strLJII2, strArrLJIIIIZZ, strLJII3, zzaVar, zzaVar2, loyaltyWalletObjectArr, offerWalletObjectArr, userAddress, userAddress2, instrumentInfoArr);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new MaskedWallet[i];
        }
    };
    public final String LL;
    public final String LLILLJJLI;
    public final String[] LLILLL;
    public final String LLILZ;
    public final zza LLILZIL;
    public final zza LLILZLL;
    public final LoyaltyWalletObject[] LLIZ;
    public final OfferWalletObject[] LLIZLLLIL;
    public final UserAddress LLJ;
    public final UserAddress LLJI;
    public final InstrumentInfo[] LLJIJIL;

    public MaskedWallet() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 2, this.LL, false);
        C817940W6u.LJIJ(parcel, 3, this.LLILLJJLI, false);
        C817940W6u.LJIJI(parcel, 4, this.LLILLL);
        C817940W6u.LJIJ(parcel, 5, this.LLILZ, false);
        C817940W6u.LJIIZILJ(parcel, 6, this.LLILZIL, i, false);
        C817940W6u.LJIIZILJ(parcel, 7, this.LLILZLL, i, false);
        C817940W6u.LJIJJLI(parcel, 8, this.LLIZ, i);
        C817940W6u.LJIJJLI(parcel, 9, this.LLIZLLLIL, i);
        C817940W6u.LJIIZILJ(parcel, 10, this.LLJ, i, false);
        C817940W6u.LJIIZILJ(parcel, 11, this.LLJI, i, false);
        C817940W6u.LJIJJLI(parcel, 12, this.LLJIJIL, i);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public MaskedWallet(String str, String str2, String[] strArr, String str3, zza zzaVar, zza zzaVar2, LoyaltyWalletObject[] loyaltyWalletObjectArr, OfferWalletObject[] offerWalletObjectArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = strArr;
        this.LLILZ = str3;
        this.LLILZIL = zzaVar;
        this.LLILZLL = zzaVar2;
        this.LLIZ = loyaltyWalletObjectArr;
        this.LLIZLLLIL = offerWalletObjectArr;
        this.LLJ = userAddress;
        this.LLJI = userAddress2;
        this.LLJIJIL = instrumentInfoArr;
    }
}
