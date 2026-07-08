package com.google.android.gms.wallet;

import X.C817940W6u;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.CardRequirements;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import com.google.android.gms.wallet.ShippingAddressRequirements;
import com.google.android.gms.wallet.TransactionInfo;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class PaymentDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentDataRequest> CREATOR = new Parcelable.Creator() { // from class: X.0WoO
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            CardRequirements cardRequirements = null;
            boolean zLJIILIIL = false;
            boolean zLJIILIIL2 = false;
            boolean zLJIILIIL3 = false;
            ShippingAddressRequirements shippingAddressRequirements = null;
            ArrayList arrayListLJ = null;
            PaymentMethodTokenizationParameters paymentMethodTokenizationParameters = null;
            TransactionInfo transactionInfo = null;
            String strLJII = null;
            Bundle bundleLIZIZ = null;
            boolean zLJIILIIL4 = true;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 1:
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case 2:
                        zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case 3:
                        cardRequirements = (CardRequirements) C0W6J.LJI(parcel, i, CardRequirements.CREATOR);
                        break;
                    case 4:
                        zLJIILIIL3 = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case 5:
                        shippingAddressRequirements = (ShippingAddressRequirements) C0W6J.LJI(parcel, i, ShippingAddressRequirements.CREATOR);
                        break;
                    case 6:
                        arrayListLJ = C0W6J.LJ(i, parcel);
                        break;
                    case 7:
                        paymentMethodTokenizationParameters = (PaymentMethodTokenizationParameters) C0W6J.LJI(parcel, i, PaymentMethodTokenizationParameters.CREATOR);
                        break;
                    case '\b':
                        transactionInfo = (TransactionInfo) C0W6J.LJI(parcel, i, TransactionInfo.CREATOR);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        zLJIILIIL4 = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        bundleLIZIZ = C0W6J.LIZIZ(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new PaymentDataRequest(zLJIILIIL, zLJIILIIL2, cardRequirements, zLJIILIIL3, shippingAddressRequirements, arrayListLJ, paymentMethodTokenizationParameters, transactionInfo, zLJIILIIL4, strLJII, bundleLIZIZ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new PaymentDataRequest[i];
        }
    };
    public boolean zza;
    public boolean zzb;
    public CardRequirements zzc;
    public boolean zzd;
    public ShippingAddressRequirements zze;
    public ArrayList zzf;
    public PaymentMethodTokenizationParameters zzg;
    public TransactionInfo zzh;
    public boolean zzi;
    public String zzj;
    public Bundle zzk;

    public PaymentDataRequest() {
        this.zzi = true;
    }

    public static PaymentDataRequest LJLZ(String str) {
        PaymentDataRequest paymentDataRequest = new PaymentDataRequest();
        paymentDataRequest.zzj = str;
        return paymentDataRequest;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LIZ(parcel, 1, this.zza);
        C817940W6u.LIZ(parcel, 2, this.zzb);
        C817940W6u.LJIIZILJ(parcel, 3, this.zzc, i, false);
        C817940W6u.LIZ(parcel, 4, this.zzd);
        C817940W6u.LJIIZILJ(parcel, 5, this.zze, i, false);
        C817940W6u.LJIIL(parcel, 6, this.zzf);
        C817940W6u.LJIIZILJ(parcel, 7, this.zzg, i, false);
        C817940W6u.LJIIZILJ(parcel, 8, this.zzh, i, false);
        C817940W6u.LIZ(parcel, 9, this.zzi);
        C817940W6u.LJIJ(parcel, 10, this.zzj, false);
        C817940W6u.LIZJ(parcel, 11, this.zzk);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public PaymentDataRequest(boolean z, boolean z2, CardRequirements cardRequirements, boolean z3, ShippingAddressRequirements shippingAddressRequirements, ArrayList arrayList, PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, TransactionInfo transactionInfo, boolean z4, String str, Bundle bundle) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = cardRequirements;
        this.zzd = z3;
        this.zze = shippingAddressRequirements;
        this.zzf = arrayList;
        this.zzg = paymentMethodTokenizationParameters;
        this.zzh = transactionInfo;
        this.zzi = z4;
        this.zzj = str;
        this.zzk = bundle;
    }
}
