package com.google.android.gms.auth;

import X.C0W0T;
import X.C0W3J;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.AccountChangeEvent;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new Parcelable.Creator() { // from class: X.0W3z
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            int iLJIJJLI = 0;
            int iLJIJJLI2 = 0;
            int iLJIJJLI3 = 0;
            long jLJJ = 0;
            String strLJII2 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 1:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 2:
                        jLJJ = C0W6J.LJJ(i, parcel);
                        break;
                    case 3:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 4:
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 5:
                        iLJIJJLI3 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 6:
                        strLJII2 = C0W6J.LJII(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new AccountChangeEvent(iLJIJJLI, iLJIJJLI2, iLJIJJLI3, jLJJ, strLJII, strLJII2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new AccountChangeEvent[i];
        }
    };
    public final int LL;
    public final long LLILLJJLI;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.LL), Long.valueOf(this.LLILLJJLI), this.zzc, Integer.valueOf(this.zzd), Integer.valueOf(this.zze), this.zzf});
    }

    public final String toString() {
        int i = this.zzd;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        return "AccountChangeEvent {accountName = " + this.zzc + ", changeType = " + str + ", changeData = " + this.zzf + ", eventIndex = " + this.zze + "}";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        if (this.LL != accountChangeEvent.LL || this.LLILLJJLI != accountChangeEvent.LLILLJJLI || !C0W0T.LIZIZ(this.zzc, accountChangeEvent.zzc) || this.zzd != accountChangeEvent.zzd || this.zze != accountChangeEvent.zze || !C0W0T.LIZIZ(this.zzf, accountChangeEvent.zzf)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIILJJIL(2, this.LLILLJJLI, parcel);
        C817940W6u.LJIJ(parcel, 3, this.zzc, false);
        C817940W6u.LJIIJ(parcel, 4, this.zzd);
        C817940W6u.LJIIJ(parcel, 5, this.zze);
        C817940W6u.LJIJ(parcel, 6, this.zzf, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public AccountChangeEvent(int i, int i2, int i3, long j, String str, String str2) {
        this.LL = i;
        this.LLILLJJLI = j;
        C0W3J.LJIIIIZZ(str);
        this.zzc = str;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str2;
    }
}
