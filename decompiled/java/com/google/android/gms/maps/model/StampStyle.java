package com.google.android.gms.maps.model;

import X.AbstractBinderC828770WfD;
import X.C817940W6u;
import X.C837010WsV;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.StampStyle;

/* JADX INFO: loaded from: classes14.dex */
public class StampStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StampStyle> CREATOR = new Parcelable.Creator() { // from class: X.0WsU
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            IBinder iBinderLJIJJ = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 2) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    iBinderLJIJJ = C0W6J.LJIJJ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new StampStyle(iBinderLJIJJ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new StampStyle[i];
        }
    };
    public final C837010WsV zza;

    public StampStyle(IBinder iBinder) {
        this.zza = new C837010WsV(AbstractBinderC828770WfD.LLILLIZIL(iBinder));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIIZ(parcel, 2, this.zza.LIZ.asBinder());
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
