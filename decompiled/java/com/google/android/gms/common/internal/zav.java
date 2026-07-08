package com.google.android.gms.common.internal;

import X.C0W0T;
import X.C817940W6u;
import X.C828740WfA;
import X.InterfaceC828880WfO;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;

/* JADX INFO: loaded from: classes14.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new Parcelable.Creator<zav>() { // from class: X.0Wjv
        @Override // android.os.Parcelable.Creator
        public final zav createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            IBinder iBinderLJIJJ = null;
            int iLJIJJLI = 0;
            boolean zLJIILIIL = false;
            boolean zLJIILIIL2 = false;
            ConnectionResult connectionResult = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                if (c != 5) {
                                    C0W6J.LJJII(i, parcel);
                                } else {
                                    zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                                }
                            } else {
                                zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                            }
                        } else {
                            connectionResult = (ConnectionResult) C0W6J.LJI(parcel, i, ConnectionResult.CREATOR);
                        }
                    } else {
                        iBinderLJIJJ = C0W6J.LJIJJ(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zav(iLJIJJLI, iBinderLJIJJ, connectionResult, zLJIILIIL, zLJIILIIL2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ zav[] newArray(int i) {
            return new zav[i];
        }
    };
    public final int LL;
    public final IBinder LLILLJJLI;
    public final ConnectionResult zac;
    public final boolean zad;
    public final boolean zae;

    public final boolean equals(Object obj) {
        IInterface iInterfaceQueryLocalInterface;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zavVar = (zav) obj;
        if (this.zac.equals(zavVar.zac)) {
            IBinder iBinder = this.LLILLJJLI;
            IInterface iInterfaceQueryLocalInterface2 = null;
            if (iBinder == null) {
                iInterfaceQueryLocalInterface = null;
            } else {
                iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (!(iInterfaceQueryLocalInterface instanceof InterfaceC828880WfO)) {
                    iInterfaceQueryLocalInterface = new C828740WfA(iBinder);
                }
            }
            IBinder iBinder2 = zavVar.LLILLJJLI;
            if (iBinder2 != null) {
                iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (!(iInterfaceQueryLocalInterface2 instanceof InterfaceC828880WfO)) {
                    iInterfaceQueryLocalInterface2 = new C828740WfA(iBinder2);
                }
            }
            if (C0W0T.LIZIZ(iInterfaceQueryLocalInterface, iInterfaceQueryLocalInterface2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIIIZ(parcel, 2, this.LLILLJJLI);
        C817940W6u.LJIIZILJ(parcel, 3, this.zac, i, false);
        C817940W6u.LIZ(parcel, 4, this.zad);
        C817940W6u.LIZ(parcel, 5, this.zae);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zav(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.LL = i;
        this.LLILLJJLI = iBinder;
        this.zac = connectionResult;
        this.zad = z;
        this.zae = z2;
    }
}
