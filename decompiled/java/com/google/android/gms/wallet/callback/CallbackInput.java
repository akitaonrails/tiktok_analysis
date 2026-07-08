package com.google.android.gms.wallet.callback;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.callback.CallbackInput;

/* JADX INFO: loaded from: classes14.dex */
public class CallbackInput extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CallbackInput> CREATOR = new Parcelable.Creator() { // from class: X.0Vx2
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            byte[] bArrLIZJ = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        bArrLIZJ = C0W6J.LIZJ(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new CallbackInput(iLJIJJLI, bArrLIZJ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new CallbackInput[i];
        }
    };
    public final byte[] LL;
    public int zza;

    public CallbackInput() {
    }

    public CallbackInput(int i, byte[] bArr) {
        this.zza = i;
        this.LL = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.zza);
        C817940W6u.LJ(parcel, 2, this.LL, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
