package com.google.android.gms.wallet;

import X.C817940W6u;
import X.InterfaceC834950WpB;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.CardInfo;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentMethodToken;

/* JADX INFO: loaded from: classes14.dex */
public final class PaymentData extends AbstractSafeParcelable implements InterfaceC834950WpB {
    public static final Parcelable.Creator<PaymentData> CREATOR = new Parcelable.Creator() { // from class: X.0WpA
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            CardInfo cardInfo = null;
            UserAddress userAddress = null;
            PaymentMethodToken paymentMethodToken = null;
            String strLJII2 = null;
            Bundle bundleLIZIZ = null;
            String strLJII3 = null;
            Bundle bundleLIZIZ2 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 1:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 2:
                        cardInfo = (CardInfo) C0W6J.LJI(parcel, i, CardInfo.CREATOR);
                        break;
                    case 3:
                        userAddress = (UserAddress) C0W6J.LJI(parcel, i, UserAddress.CREATOR);
                        break;
                    case 4:
                        paymentMethodToken = (PaymentMethodToken) C0W6J.LJI(parcel, i, PaymentMethodToken.CREATOR);
                        break;
                    case 5:
                        strLJII2 = C0W6J.LJII(i, parcel);
                        break;
                    case 6:
                        bundleLIZIZ = C0W6J.LIZIZ(i, parcel);
                        break;
                    case 7:
                        strLJII3 = C0W6J.LJII(i, parcel);
                        break;
                    case '\b':
                        bundleLIZIZ2 = C0W6J.LIZIZ(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new PaymentData(strLJII, cardInfo, userAddress, paymentMethodToken, strLJII2, bundleLIZIZ, strLJII3, bundleLIZIZ2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new PaymentData[i];
        }
    };
    public String zza;
    public CardInfo zzb;
    public UserAddress zzc;
    public PaymentMethodToken zzd;
    public String zze;
    public Bundle zzf;
    public String zzg;
    public Bundle zzh;

    public PaymentData() {
    }

    @Override // X.InterfaceC834950WpB
    public final void LJJIL(Intent intent) {
        Parcel parcelObtain = Parcel.obtain();
        writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        intent.putExtra("com.google.android.gms.wallet.PaymentData", bArrMarshall);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 1, this.zza, false);
        C817940W6u.LJIIZILJ(parcel, 2, this.zzb, i, false);
        C817940W6u.LJIIZILJ(parcel, 3, this.zzc, i, false);
        C817940W6u.LJIIZILJ(parcel, 4, this.zzd, i, false);
        C817940W6u.LJIJ(parcel, 5, this.zze, false);
        C817940W6u.LIZJ(parcel, 6, this.zzf);
        C817940W6u.LJIJ(parcel, 7, this.zzg, false);
        C817940W6u.LIZJ(parcel, 8, this.zzh);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public PaymentData(String str, CardInfo cardInfo, UserAddress userAddress, PaymentMethodToken paymentMethodToken, String str2, Bundle bundle, String str3, Bundle bundle2) {
        this.zza = str;
        this.zzb = cardInfo;
        this.zzc = userAddress;
        this.zzd = paymentMethodToken;
        this.zze = str2;
        this.zzf = bundle;
        this.zzg = str3;
        this.zzh = bundle2;
    }
}
