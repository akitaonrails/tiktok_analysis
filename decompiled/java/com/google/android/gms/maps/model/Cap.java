package com.google.android.gms.maps.model;

import X.C0W0T;
import X.C0W3J;
import X.C786410Ut5;
import X.C817940W6u;
import X.C837010WsV;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.Cap;
import java.util.Arrays;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public class Cap extends AbstractSafeParcelable {
    public final int zzb;
    public final C837010WsV zzc;
    public final Float zzd;
    public static final String zza = "Cap";
    public static final Parcelable.Creator<Cap> CREATOR = new Parcelable.Creator() { // from class: X.0WsW
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            C837010WsV c837010WsV = null;
            IBinder iBinderLJIJJ = null;
            Float fLJIJI = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            fLJIJI = C0W6J.LJIJI(i, parcel);
                        }
                    } else {
                        iBinderLJIJJ = C0W6J.LJIJJ(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            if (iBinderLJIJJ != null) {
                c837010WsV = new C837010WsV(AbstractBinderC828770WfD.LLILLIZIL(iBinderLJIJJ));
            }
            return new Cap(iLJIJJLI, c837010WsV, fLJIJI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new Cap[i];
        }
    };

    public Cap() {
        throw null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final Cap LJLZ() {
        int i = this.zzb;
        if (i == 0) {
            return new ButtCap();
        }
        if (i == 1) {
            return new SquareCap();
        }
        if (i == 2) {
            return new RoundCap();
        }
        if (i != 3) {
            return this;
        }
        C0W3J.LJIIJ("bitmapDescriptor must not be null", this.zzc != null);
        C0W3J.LJIIJ("bitmapRefWidth must not be null", this.zzd != null);
        return new CustomCap(this.zzc, this.zzd.floatValue());
    }

    public String toString() {
        return "[Cap: type=" + this.zzb + e3.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        if (this.zzb == cap.zzb && C0W0T.LIZIZ(this.zzc, cap.zzc) && C0W0T.LIZIZ(this.zzd, cap.zzd)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinderAsBinder;
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 2, this.zzb);
        C837010WsV c837010WsV = this.zzc;
        if (c837010WsV == null) {
            iBinderAsBinder = null;
        } else {
            iBinderAsBinder = c837010WsV.LIZ.asBinder();
        }
        C817940W6u.LJIIIZ(parcel, 3, iBinderAsBinder);
        C817940W6u.LJIIIIZZ(parcel, 4, this.zzd);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public Cap(int i, C837010WsV c837010WsV, Float f) {
        boolean z;
        boolean z2;
        if (f != null && f.floatValue() > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (i == 3) {
            if (c837010WsV != null && z) {
                z2 = true;
            } else {
                z2 = false;
            }
            i = 3;
        } else {
            z2 = true;
        }
        C0W3J.LIZ(C786410Ut5.j4("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", new Object[]{Integer.valueOf(i), c837010WsV, f}), z2);
        this.zzb = i;
        this.zzc = c837010WsV;
        this.zzd = f;
    }
}
