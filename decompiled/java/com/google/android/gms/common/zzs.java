package com.google.android.gms.common;

import X.AbstractBinderC828800WfG;
import X.BinderC828820WfI;
import X.C0WH6;
import X.C817940W6u;
import X.C828730Wf9;
import X.InterfaceC820590WGz;
import X.InterfaceC828830WfJ;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zzs;

/* JADX INFO: loaded from: classes14.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new Parcelable.Creator() { // from class: X.0WfH
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            boolean zLJIILIIL = false;
            boolean zLJIILIIL2 = false;
            IBinder iBinderLJIJJ = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                            }
                        } else {
                            zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                        }
                    } else {
                        iBinderLJIJJ = C0W6J.LJIJJ(i, parcel);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzs(strLJII, iBinderLJIJJ, zLJIILIIL, zLJIILIIL2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzs[i];
        }
    };
    public final String zza;
    public final AbstractBinderC828800WfG zzb;
    public final boolean zzc;
    public final boolean zzd;

    public zzs(String str, AbstractBinderC828800WfG abstractBinderC828800WfG, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = abstractBinderC828800WfG;
        this.zzc = z;
        this.zzd = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 1, this.zza, false);
        AbstractBinderC828800WfG abstractBinderC828800WfG = this.zzb;
        if (abstractBinderC828800WfG == null) {
            abstractBinderC828800WfG = null;
        }
        C817940W6u.LJIIIZ(parcel, 2, abstractBinderC828800WfG);
        C817940W6u.LIZ(parcel, 3, this.zzc);
        C817940W6u.LIZ(parcel, 4, this.zzd);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzs(String str, IBinder iBinder, boolean z, boolean z2) {
        InterfaceC828830WfJ c828730Wf9;
        byte[] bArr;
        this.zza = str;
        BinderC828820WfI binderC828820WfI = null;
        if (iBinder != null) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                if (iInterfaceQueryLocalInterface instanceof InterfaceC828830WfJ) {
                    c828730Wf9 = (InterfaceC828830WfJ) iInterfaceQueryLocalInterface;
                } else {
                    c828730Wf9 = new C828730Wf9(iBinder);
                }
                InterfaceC820590WGz interfaceC820590WGzLIZLLL = c828730Wf9.LIZLLL();
                if (interfaceC820590WGzLIZLLL != null && (bArr = (byte[]) C0WH6.LLLIIL(interfaceC820590WGzLIZLLL)) != null) {
                    binderC828820WfI = new BinderC828820WfI(bArr);
                }
            } catch (RemoteException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.zzb = binderC828820WfI;
        this.zzc = z;
        this.zzd = z2;
    }
}
