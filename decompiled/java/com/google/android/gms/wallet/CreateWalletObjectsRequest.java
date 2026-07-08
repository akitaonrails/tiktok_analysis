package com.google.android.gms.wallet;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.GiftCardWalletObject;
import com.google.android.gms.wallet.LoyaltyWalletObject;
import com.google.android.gms.wallet.OfferWalletObject;

/* JADX INFO: loaded from: classes14.dex */
public final class CreateWalletObjectsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreateWalletObjectsRequest> CREATOR = new Parcelable.Creator() { // from class: X.0Wqm
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            LoyaltyWalletObject loyaltyWalletObject = null;
            GiftCardWalletObject giftCardWalletObject = null;
            int iLJIJJLI = 0;
            OfferWalletObject offerWalletObject = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                            }
                        } else {
                            giftCardWalletObject = (GiftCardWalletObject) C0W6J.LJI(parcel, i, GiftCardWalletObject.CREATOR);
                        }
                    } else {
                        offerWalletObject = (OfferWalletObject) C0W6J.LJI(parcel, i, OfferWalletObject.CREATOR);
                    }
                } else {
                    loyaltyWalletObject = (LoyaltyWalletObject) C0W6J.LJI(parcel, i, LoyaltyWalletObject.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new CreateWalletObjectsRequest(loyaltyWalletObject, offerWalletObject, giftCardWalletObject, iLJIJJLI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new CreateWalletObjectsRequest[i];
        }
    };
    public LoyaltyWalletObject zza;
    public OfferWalletObject zzb;
    public GiftCardWalletObject zzc;
    public int zzd;

    public CreateWalletObjectsRequest() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 2, this.zza, i, false);
        C817940W6u.LJIIZILJ(parcel, 3, this.zzb, i, false);
        C817940W6u.LJIIZILJ(parcel, 4, this.zzc, i, false);
        C817940W6u.LJIIJ(parcel, 5, this.zzd);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public CreateWalletObjectsRequest(LoyaltyWalletObject loyaltyWalletObject, OfferWalletObject offerWalletObject, GiftCardWalletObject giftCardWalletObject, int i) {
        this.zza = loyaltyWalletObject;
        this.zzb = offerWalletObject;
        this.zzc = giftCardWalletObject;
        this.zzd = i;
    }
}
