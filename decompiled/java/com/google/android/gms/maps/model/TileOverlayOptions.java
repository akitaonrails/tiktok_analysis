package com.google.android.gms.maps.model;

import X.C817940W6u;
import X.C837060Wsa;
import X.InterfaceC837070Wsb;
import X.InterfaceC837080Wsc;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.TileOverlayOptions;

/* JADX INFO: loaded from: classes14.dex */
public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new Parcelable.Creator() { // from class: X.0WsY
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            IBinder iBinderLJIJJ = null;
            boolean zLJIILIIL = false;
            float fLJIJ = 0.0f;
            float fLJIJ2 = 0.0f;
            boolean zLJIILIIL2 = true;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                if (c != 6) {
                                    C0W6J.LJJII(i, parcel);
                                } else {
                                    fLJIJ2 = C0W6J.LJIJ(i, parcel);
                                }
                            } else {
                                zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                            }
                        } else {
                            fLJIJ = C0W6J.LJIJ(i, parcel);
                        }
                    } else {
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                    }
                } else {
                    iBinderLJIJJ = C0W6J.LJIJJ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new TileOverlayOptions(iBinderLJIJJ, zLJIILIIL, fLJIJ, zLJIILIIL2, fLJIJ2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new TileOverlayOptions[i];
        }
    };
    public InterfaceC837070Wsb zza;
    public InterfaceC837080Wsc zzb;
    public boolean zzc;
    public float zzd;
    public boolean zze;
    public float zzf;

    public TileOverlayOptions() {
        this.zzc = true;
        this.zze = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinderAsBinder;
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        InterfaceC837070Wsb interfaceC837070Wsb = this.zza;
        if (interfaceC837070Wsb == null) {
            iBinderAsBinder = null;
        } else {
            iBinderAsBinder = interfaceC837070Wsb.asBinder();
        }
        C817940W6u.LJIIIZ(parcel, 2, iBinderAsBinder);
        C817940W6u.LIZ(parcel, 3, this.zzc);
        C817940W6u.LJII(parcel, 4, this.zzd);
        C817940W6u.LIZ(parcel, 5, this.zze);
        C817940W6u.LJII(parcel, 6, this.zzf);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public TileOverlayOptions(IBinder iBinder, boolean z, float f, boolean z2, float f2) {
        InterfaceC837070Wsb c837060Wsa;
        this.zzc = true;
        this.zze = true;
        if (iBinder == null) {
            c837060Wsa = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            if (iInterfaceQueryLocalInterface instanceof InterfaceC837070Wsb) {
                c837060Wsa = (InterfaceC837070Wsb) iInterfaceQueryLocalInterface;
            } else {
                c837060Wsa = new C837060Wsa(iBinder);
            }
        }
        this.zza = c837060Wsa;
        this.zzb = c837060Wsa != null ? new InterfaceC837080Wsc(this) { // from class: X.0WsZ
            public final InterfaceC837070Wsb LIZ;

            {
                this.LIZ = this.zza;
            }
        } : null;
        this.zzc = z;
        this.zzd = f;
        this.zze = z2;
        this.zzf = f2;
    }
}
