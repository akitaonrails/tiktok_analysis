package com.google.android.gms.tapandpay.firstparty;

import X.C0W0T;
import X.C0W3L;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class AccountInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AccountInfo> CREATOR = new Parcelable.Creator() { // from class: X.0W6b
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            String strLJII2 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        strLJII2 = C0W6J.LJII(i, parcel);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new AccountInfo(strLJII, strLJII2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new AccountInfo[i];
        }
    };
    public final String LL;
    public final String LLILLJJLI;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.LL, this.LLILLJJLI});
    }

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        c0w3l.LIZ(this.LL, "accountId");
        c0w3l.LIZ(this.LLILLJJLI, "accountName");
        return c0w3l.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AccountInfo) {
            AccountInfo accountInfo = (AccountInfo) obj;
            if (C0W0T.LIZIZ(this.LL, accountInfo.LL) && C0W0T.LIZIZ(this.LLILLJJLI, accountInfo.LLILLJJLI)) {
                return true;
            }
        }
        return false;
    }

    public AccountInfo(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 2, this.LL, false);
        C817940W6u.LJIJ(parcel, 3, this.LLILLJJLI, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
