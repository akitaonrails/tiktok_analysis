package com.google.android.gms.wallet;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.GiftCardWalletObject;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes14.dex */
public final class GiftCardWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GiftCardWalletObject> CREATOR = new Parcelable.Creator() { // from class: X.0Wql
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            CommonWalletObject commonWalletObject = null;
            String strLJII = null;
            String strLJII2 = null;
            String strLJII3 = null;
            String strLJII4 = null;
            String strLJII5 = null;
            long jLJJ = 0;
            long jLJJ2 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 2:
                        commonWalletObject = (CommonWalletObject) C0W6J.LJI(parcel, i, CommonWalletObject.CREATOR);
                        break;
                    case 3:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 4:
                        strLJII2 = C0W6J.LJII(i, parcel);
                        break;
                    case 5:
                        strLJII3 = C0W6J.LJII(i, parcel);
                        break;
                    case 6:
                        jLJJ = C0W6J.LJJ(i, parcel);
                        break;
                    case 7:
                        strLJII4 = C0W6J.LJII(i, parcel);
                        break;
                    case '\b':
                        jLJJ2 = C0W6J.LJJ(i, parcel);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        strLJII5 = C0W6J.LJII(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new GiftCardWalletObject(commonWalletObject, strLJII, strLJII2, strLJII3, jLJJ, strLJII4, jLJJ2, strLJII5);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new GiftCardWalletObject[i];
        }
    };
    public final CommonWalletObject LL;
    public String zzb;
    public String zzc;
    public String zzd;
    public long zze;
    public String zzf;
    public long zzg;
    public String zzh;

    public GiftCardWalletObject() {
        this.LL = new CommonWalletObject();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 2, this.LL, i, false);
        C817940W6u.LJIJ(parcel, 3, this.zzb, false);
        C817940W6u.LJIJ(parcel, 4, this.zzc, false);
        C817940W6u.LJIJ(parcel, 5, this.zzd, false);
        C817940W6u.LJIILJJIL(6, this.zze, parcel);
        C817940W6u.LJIJ(parcel, 7, this.zzf, false);
        C817940W6u.LJIILJJIL(8, this.zzg, parcel);
        C817940W6u.LJIJ(parcel, 9, this.zzh, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public GiftCardWalletObject(CommonWalletObject commonWalletObject, String str, String str2, String str3, long j, String str4, long j2, String str5) {
        new CommonWalletObject();
        this.LL = commonWalletObject;
        this.zzb = str;
        this.zzc = str2;
        this.zze = j;
        this.zzf = str4;
        this.zzg = j2;
        this.zzh = str5;
        this.zzd = str3;
    }
}
