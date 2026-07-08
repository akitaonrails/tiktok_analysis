package com.google.android.gms.wallet.wobs;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;

/* JADX INFO: loaded from: classes14.dex */
public final class WalletObjectMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WalletObjectMessage> CREATOR = new Parcelable.Creator() { // from class: X.0Wqq
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            String strLJII2 = null;
            TimeInterval timeInterval = null;
            UriData uriData = null;
            UriData uriData2 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                if (c != 6) {
                                    C0W6J.LJJII(i, parcel);
                                } else {
                                    uriData2 = (UriData) C0W6J.LJI(parcel, i, UriData.CREATOR);
                                }
                            } else {
                                uriData = (UriData) C0W6J.LJI(parcel, i, UriData.CREATOR);
                            }
                        } else {
                            timeInterval = (TimeInterval) C0W6J.LJI(parcel, i, TimeInterval.CREATOR);
                        }
                    } else {
                        strLJII2 = C0W6J.LJII(i, parcel);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new WalletObjectMessage(strLJII, strLJII2, timeInterval, uriData, uriData2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new WalletObjectMessage[i];
        }
    };
    public String zza;
    public String zzb;
    public TimeInterval zzc;
    public UriData zzd;
    public UriData zze;

    public WalletObjectMessage() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 2, this.zza, false);
        C817940W6u.LJIJ(parcel, 3, this.zzb, false);
        C817940W6u.LJIIZILJ(parcel, 4, this.zzc, i, false);
        C817940W6u.LJIIZILJ(parcel, 5, this.zzd, i, false);
        C817940W6u.LJIIZILJ(parcel, 6, this.zze, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public WalletObjectMessage(String str, String str2, TimeInterval timeInterval, UriData uriData, UriData uriData2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = timeInterval;
        this.zzd = uriData;
        this.zze = uriData2;
    }
}
