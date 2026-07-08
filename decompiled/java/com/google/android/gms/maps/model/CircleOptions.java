package com.google.android.gms.maps.model;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class CircleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CircleOptions> CREATOR = new Parcelable.Creator() { // from class: X.0Wqx
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            LatLng latLng = null;
            ArrayList arrayListLJIIJJI = null;
            double dLJIILLIIL = 0.0d;
            float fLJIJ = 0.0f;
            float fLJIJ2 = 0.0f;
            int iLJIJJLI = 0;
            int iLJIJJLI2 = 0;
            boolean zLJIILIIL = false;
            boolean zLJIILIIL2 = false;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 2:
                        latLng = (LatLng) C0W6J.LJI(parcel, i, LatLng.CREATOR);
                        break;
                    case 3:
                        dLJIILLIIL = C0W6J.LJIILLIIL(i, parcel);
                        break;
                    case 4:
                        fLJIJ = C0W6J.LJIJ(i, parcel);
                        break;
                    case 5:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 6:
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 7:
                        fLJIJ2 = C0W6J.LJIJ(i, parcel);
                        break;
                    case '\b':
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, PatternItem.CREATOR);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new CircleOptions(latLng, dLJIILLIIL, fLJIJ, iLJIJJLI, iLJIJJLI2, fLJIJ2, zLJIILIIL, zLJIILIIL2, arrayListLJIIJJI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new CircleOptions[i];
        }
    };
    public LatLng zza;
    public double zzb;
    public float zzc;
    public int zzd;
    public int zze;
    public float zzf;
    public boolean zzg;
    public boolean zzh;
    public List zzi;

    public CircleOptions() {
        this.zzc = 10.0f;
        this.zzd = -16777216;
        this.zzg = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 2, this.zza, i, false);
        C817940W6u.LJFF(parcel, 3, this.zzb);
        C817940W6u.LJII(parcel, 4, this.zzc);
        C817940W6u.LJIIJ(parcel, 5, this.zzd);
        C817940W6u.LJIIJ(parcel, 6, this.zze);
        C817940W6u.LJII(parcel, 7, this.zzf);
        C817940W6u.LIZ(parcel, 8, this.zzg);
        C817940W6u.LIZ(parcel, 9, this.zzh);
        C817940W6u.LJIL(parcel, 10, this.zzi, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public CircleOptions(LatLng latLng, double d, float f, int i, int i2, float f2, boolean z, boolean z2, List list) {
        this.zza = latLng;
        this.zzb = d;
        this.zzc = f;
        this.zzd = i;
        this.zze = i2;
        this.zzf = f2;
        this.zzg = z;
        this.zzh = z2;
        this.zzi = list;
    }
}
