package com.google.android.gms.wallet.wobs;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.LoyaltyPointsBalance;
import com.google.android.gms.wallet.wobs.TimeInterval;

/* JADX INFO: loaded from: classes14.dex */
public final class LoyaltyPoints extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyPoints> CREATOR = new Parcelable.Creator() { // from class: X.0Wqn
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            LoyaltyPointsBalance loyaltyPointsBalance = null;
            TimeInterval timeInterval = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 5) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            timeInterval = (TimeInterval) C0W6J.LJI(parcel, i, TimeInterval.CREATOR);
                        }
                    } else {
                        loyaltyPointsBalance = (LoyaltyPointsBalance) C0W6J.LJI(parcel, i, LoyaltyPointsBalance.CREATOR);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new LoyaltyPoints(strLJII, loyaltyPointsBalance, timeInterval);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new LoyaltyPoints[i];
        }
    };
    public String zza;
    public LoyaltyPointsBalance zzb;
    public TimeInterval zzc;

    public LoyaltyPoints() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 2, this.zza, false);
        C817940W6u.LJIIZILJ(parcel, 3, this.zzb, i, false);
        C817940W6u.LJIIZILJ(parcel, 5, this.zzc, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public LoyaltyPoints(String str, LoyaltyPointsBalance loyaltyPointsBalance, TimeInterval timeInterval) {
        this.zza = str;
        this.zzb = loyaltyPointsBalance;
        this.zzc = timeInterval;
    }
}
