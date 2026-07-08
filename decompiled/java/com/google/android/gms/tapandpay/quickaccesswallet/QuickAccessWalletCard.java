package com.google.android.gms.tapandpay.quickaccesswallet;

import X.C0W0T;
import X.C817940W6u;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.quickaccesswallet.CardIconMessage;
import com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard;
import com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class QuickAccessWalletCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator<QuickAccessWalletCard> CREATOR = new Parcelable.Creator() { // from class: X.0W4o
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            Bitmap bitmap = null;
            String strLJII2 = null;
            WalletCardIntent[] walletCardIntentArr = null;
            CardIconMessage[] cardIconMessageArr = null;
            String strLJII3 = null;
            long jLJJ = 0;
            long jLJJ2 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 1:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 2:
                        bitmap = (Bitmap) C0W6J.LJI(parcel, i, Bitmap.CREATOR);
                        break;
                    case 3:
                        strLJII2 = C0W6J.LJII(i, parcel);
                        break;
                    case 4:
                        walletCardIntentArr = (WalletCardIntent[]) C0W6J.LJIIJ(parcel, i, WalletCardIntent.CREATOR);
                        break;
                    case 5:
                        cardIconMessageArr = (CardIconMessage[]) C0W6J.LJIIJ(parcel, i, CardIconMessage.CREATOR);
                        break;
                    case 6:
                        jLJJ = C0W6J.LJJ(i, parcel);
                        break;
                    case 7:
                        jLJJ2 = C0W6J.LJJ(i, parcel);
                        break;
                    case '\b':
                        strLJII3 = C0W6J.LJII(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new QuickAccessWalletCard(strLJII, bitmap, strLJII2, walletCardIntentArr, cardIconMessageArr, jLJJ, jLJJ2, strLJII3);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new QuickAccessWalletCard[i];
        }
    };
    public String zza;
    public Bitmap zzb;
    public String zzc;
    public WalletCardIntent[] zzd;
    public CardIconMessage[] zze;
    public long zzf;
    public long zzg;
    public String zzh;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, Integer.valueOf(Arrays.hashCode(this.zzd)), Integer.valueOf(Arrays.hashCode(this.zze)), Long.valueOf(this.zzf), Long.valueOf(this.zzg), this.zzh});
    }

    public QuickAccessWalletCard() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QuickAccessWalletCard) {
            QuickAccessWalletCard quickAccessWalletCard = (QuickAccessWalletCard) obj;
            if (C0W0T.LIZIZ(this.zza, quickAccessWalletCard.zza) && C0W0T.LIZIZ(this.zzb, quickAccessWalletCard.zzb) && C0W0T.LIZIZ(this.zzc, quickAccessWalletCard.zzc) && Arrays.equals(this.zzd, quickAccessWalletCard.zzd) && Arrays.equals(this.zze, quickAccessWalletCard.zze) && C0W0T.LIZIZ(Long.valueOf(this.zzf), Long.valueOf(quickAccessWalletCard.zzf)) && C0W0T.LIZIZ(Long.valueOf(this.zzg), Long.valueOf(quickAccessWalletCard.zzg)) && C0W0T.LIZIZ(this.zzh, quickAccessWalletCard.zzh)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 1, this.zza, false);
        C817940W6u.LJIIZILJ(parcel, 2, this.zzb, i, false);
        C817940W6u.LJIJ(parcel, 3, this.zzc, false);
        C817940W6u.LJIJJLI(parcel, 4, this.zzd, i);
        C817940W6u.LJIJJLI(parcel, 5, this.zze, i);
        C817940W6u.LJIILJJIL(6, this.zzf, parcel);
        C817940W6u.LJIILJJIL(7, this.zzg, parcel);
        C817940W6u.LJIJ(parcel, 8, this.zzh, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public QuickAccessWalletCard(String str, Bitmap bitmap, String str2, WalletCardIntent[] walletCardIntentArr, CardIconMessage[] cardIconMessageArr, long j, long j2, String str3) {
        this.zza = str;
        this.zzb = bitmap;
        this.zzc = str2;
        this.zzd = walletCardIntentArr;
        this.zze = cardIconMessageArr;
        this.zzf = j;
        this.zzg = j2;
        this.zzh = str3;
    }
}
