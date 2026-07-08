package com.google.android.gms.internal.location;

import X.C817000W3e;
import X.C817030W3h;
import X.C817940W6u;
import X.InterfaceC817050W3j;
import X.InterfaceC817060W3k;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzj;
import com.google.android.gms.internal.location.zzl;

/* JADX INFO: loaded from: classes14.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new Parcelable.Creator<zzl>() { // from class: X.0W3i
        @Override // android.os.Parcelable.Creator
        public final zzl createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            zzj zzjVar = null;
            int iLJIJJLI = 1;
            IBinder iBinderLJIJJ = null;
            IBinder iBinderLJIJJ2 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                iBinderLJIJJ2 = C0W6J.LJIJJ(i, parcel);
                            }
                        } else {
                            iBinderLJIJJ = C0W6J.LJIJJ(i, parcel);
                        }
                    } else {
                        zzjVar = (zzj) C0W6J.LJI(parcel, i, zzj.CREATOR);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzl(iLJIJJLI, zzjVar, iBinderLJIJJ, iBinderLJIJJ2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ zzl[] newArray(int i) {
            return new zzl[i];
        }
    };
    public final int LL;
    public final zzj LLILLJJLI;
    public final InterfaceC817060W3k LLILLL;
    public final InterfaceC817050W3j LLILZ;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinderAsBinder;
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIIZILJ(parcel, 2, this.LLILLJJLI, i, false);
        InterfaceC817060W3k interfaceC817060W3k = this.LLILLL;
        IBinder iBinderAsBinder2 = null;
        if (interfaceC817060W3k == null) {
            iBinderAsBinder = null;
        } else {
            iBinderAsBinder = interfaceC817060W3k.asBinder();
        }
        C817940W6u.LJIIIZ(parcel, 3, iBinderAsBinder);
        InterfaceC817050W3j interfaceC817050W3j = this.LLILZ;
        if (interfaceC817050W3j != null) {
            iBinderAsBinder2 = interfaceC817050W3j.asBinder();
        }
        C817940W6u.LJIIIZ(parcel, 4, iBinderAsBinder2);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzl(int i, zzj zzjVar, IBinder iBinder, IBinder iBinder2) {
        InterfaceC817060W3k c817030W3h;
        this.LL = i;
        this.LLILLJJLI = zzjVar;
        InterfaceC817050W3j c817000W3e = null;
        if (iBinder == null) {
            c817030W3h = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
            if (iInterfaceQueryLocalInterface instanceof InterfaceC817060W3k) {
                c817030W3h = (InterfaceC817060W3k) iInterfaceQueryLocalInterface;
            } else {
                c817030W3h = new C817030W3h(iBinder);
            }
        }
        this.LLILLL = c817030W3h;
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (iInterfaceQueryLocalInterface2 instanceof InterfaceC817050W3j) {
                c817000W3e = (InterfaceC817050W3j) iInterfaceQueryLocalInterface2;
            } else {
                c817000W3e = new C817000W3e(iBinder2);
            }
        }
        this.LLILZ = c817000W3e;
    }
}
