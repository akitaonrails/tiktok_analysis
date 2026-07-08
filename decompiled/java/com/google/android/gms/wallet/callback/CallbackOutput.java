package com.google.android.gms.wallet.callback;

import X.C812830Vub;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.callback.CallbackOutput;

/* JADX INFO: loaded from: classes14.dex */
public class CallbackOutput extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CallbackOutput> CREATOR = new Parcelable.Creator() { // from class: X.0Vx1
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            byte[] bArrLIZJ = null;
            String strLJII = null;
            int iLJIJJLI2 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                strLJII = C0W6J.LJII(i, parcel);
                            }
                        } else {
                            bArrLIZJ = C0W6J.LIZJ(i, parcel);
                        }
                    } else {
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new CallbackOutput(strLJII, iLJIJJLI, iLJIJJLI2, bArrLIZJ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new CallbackOutput[i];
        }
    };
    public int LL;
    public int LLILLJJLI;
    public final byte[] LLILLL;
    public String LLILZ;

    public static C812830Vub LJLZ() {
        return new C812830Vub(new CallbackOutput());
    }

    public CallbackOutput() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIIJ(parcel, 2, this.LLILLJJLI);
        C817940W6u.LJ(parcel, 3, this.LLILLL, false);
        C817940W6u.LJIJ(parcel, 4, this.LLILZ, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public CallbackOutput(String str, int i, int i2, byte[] bArr) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = bArr;
        this.LLILZ = str;
    }
}
