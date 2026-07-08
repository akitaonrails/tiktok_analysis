package com.google.android.gms.internal.location;

import X.C816990W3d;
import X.C817000W3e;
import X.C817010W3f;
import X.C817940W6u;
import X.InterfaceC817050W3j;
import X.InterfaceC817070W3l;
import X.InterfaceC817080W3m;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzba;
import com.google.android.gms.internal.location.zzbc;

/* JADX INFO: loaded from: classes14.dex */
public final class zzbc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbc> CREATOR = new Parcelable.Creator<zzbc>() { // from class: X.0W3c
        @Override // android.os.Parcelable.Creator
        public final zzbc createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            zzba zzbaVar = null;
            int iLJIJJLI = 1;
            IBinder iBinderLJIJJ = null;
            PendingIntent pendingIntent = null;
            IBinder iBinderLJIJJ2 = null;
            IBinder iBinderLJIJJ3 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 1:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 2:
                        zzbaVar = (zzba) C0W6J.LJI(parcel, i, zzba.CREATOR);
                        break;
                    case 3:
                        iBinderLJIJJ = C0W6J.LJIJJ(i, parcel);
                        break;
                    case 4:
                        pendingIntent = (PendingIntent) C0W6J.LJI(parcel, i, PendingIntent.CREATOR);
                        break;
                    case 5:
                        iBinderLJIJJ2 = C0W6J.LJIJJ(i, parcel);
                        break;
                    case 6:
                        iBinderLJIJJ3 = C0W6J.LJIJJ(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzbc(iLJIJJLI, zzbaVar, iBinderLJIJJ, pendingIntent, iBinderLJIJJ2, iBinderLJIJJ3);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ zzbc[] newArray(int i) {
            return new zzbc[i];
        }
    };
    public final int LL;
    public final zzba LLILLJJLI;
    public final InterfaceC817080W3m LLILLL;
    public final PendingIntent LLILZ;
    public final InterfaceC817070W3l LLILZIL;
    public final InterfaceC817050W3j LLILZLL;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinderAsBinder;
        IBinder iBinderAsBinder2;
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIIZILJ(parcel, 2, this.LLILLJJLI, i, false);
        InterfaceC817080W3m interfaceC817080W3m = this.LLILLL;
        IBinder iBinderAsBinder3 = null;
        if (interfaceC817080W3m == null) {
            iBinderAsBinder = null;
        } else {
            iBinderAsBinder = interfaceC817080W3m.asBinder();
        }
        C817940W6u.LJIIIZ(parcel, 3, iBinderAsBinder);
        C817940W6u.LJIIZILJ(parcel, 4, this.LLILZ, i, false);
        InterfaceC817070W3l interfaceC817070W3l = this.LLILZIL;
        if (interfaceC817070W3l == null) {
            iBinderAsBinder2 = null;
        } else {
            iBinderAsBinder2 = interfaceC817070W3l.asBinder();
        }
        C817940W6u.LJIIIZ(parcel, 5, iBinderAsBinder2);
        InterfaceC817050W3j interfaceC817050W3j = this.LLILZLL;
        if (interfaceC817050W3j != null) {
            iBinderAsBinder3 = interfaceC817050W3j.asBinder();
        }
        C817940W6u.LJIIIZ(parcel, 6, iBinderAsBinder3);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzbc(int i, zzba zzbaVar, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        InterfaceC817080W3m c817010W3f;
        InterfaceC817070W3l c816990W3d;
        this.LL = i;
        this.LLILLJJLI = zzbaVar;
        InterfaceC817050W3j c817000W3e = null;
        if (iBinder == null) {
            c817010W3f = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            if (iInterfaceQueryLocalInterface instanceof InterfaceC817080W3m) {
                c817010W3f = (InterfaceC817080W3m) iInterfaceQueryLocalInterface;
            } else {
                c817010W3f = new C817010W3f(iBinder);
            }
        }
        this.LLILLL = c817010W3f;
        this.LLILZ = pendingIntent;
        if (iBinder2 == null) {
            c816990W3d = null;
        } else {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            if (iInterfaceQueryLocalInterface2 instanceof InterfaceC817070W3l) {
                c816990W3d = (InterfaceC817070W3l) iInterfaceQueryLocalInterface2;
            } else {
                c816990W3d = new C816990W3d(iBinder2);
            }
        }
        this.LLILZIL = c816990W3d;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (iInterfaceQueryLocalInterface3 instanceof InterfaceC817050W3j) {
                c817000W3e = (InterfaceC817050W3j) iInterfaceQueryLocalInterface3;
            } else {
                c817000W3e = new C817000W3e(iBinder3);
            }
        }
        this.LLILZLL = c817000W3e;
    }
}
