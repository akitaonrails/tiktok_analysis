package com.google.android.gms.auth.api.identity;

import X.C0W0T;
import X.C0W3J;
import X.C817940W6u;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class SavePasswordResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordResult> CREATOR = new Parcelable.Creator() { // from class: X.0Wox
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            PendingIntent pendingIntent = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 1) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    pendingIntent = (PendingIntent) C0W6J.LJI(parcel, i, PendingIntent.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new SavePasswordResult(pendingIntent);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new SavePasswordResult[i];
        }
    };
    public final PendingIntent zba;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zba});
    }

    public SavePasswordResult(PendingIntent pendingIntent) {
        C0W3J.LJIIIIZZ(pendingIntent);
        this.zba = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordResult)) {
            return false;
        }
        return C0W0T.LIZIZ(this.zba, ((SavePasswordResult) obj).zba);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 1, this.zba, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
