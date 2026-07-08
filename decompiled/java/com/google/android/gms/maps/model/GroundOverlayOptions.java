package com.google.android.gms.maps.model;

import X.AbstractBinderC828770WfD;
import X.C817940W6u;
import X.C837010WsV;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes14.dex */
public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new Parcelable.Creator() { // from class: X.0WsX
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            IBinder iBinderLJIJJ = null;
            LatLng latLng = null;
            LatLngBounds latLngBounds = null;
            float fLJIJ = 0.0f;
            float fLJIJ2 = 0.0f;
            float fLJIJ3 = 0.0f;
            float fLJIJ4 = 0.0f;
            float fLJIJ5 = 0.0f;
            float fLJIJ6 = 0.0f;
            float fLJIJ7 = 0.0f;
            boolean zLJIILIIL = false;
            boolean zLJIILIIL2 = false;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 2:
                        iBinderLJIJJ = C0W6J.LJIJJ(i, parcel);
                        break;
                    case 3:
                        latLng = (LatLng) C0W6J.LJI(parcel, i, LatLng.CREATOR);
                        break;
                    case 4:
                        fLJIJ = C0W6J.LJIJ(i, parcel);
                        break;
                    case 5:
                        fLJIJ2 = C0W6J.LJIJ(i, parcel);
                        break;
                    case 6:
                        latLngBounds = (LatLngBounds) C0W6J.LJI(parcel, i, LatLngBounds.CREATOR);
                        break;
                    case 7:
                        fLJIJ3 = C0W6J.LJIJ(i, parcel);
                        break;
                    case '\b':
                        fLJIJ4 = C0W6J.LJIJ(i, parcel);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        fLJIJ5 = C0W6J.LJIJ(i, parcel);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        fLJIJ6 = C0W6J.LJIJ(i, parcel);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        fLJIJ7 = C0W6J.LJIJ(i, parcel);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new GroundOverlayOptions(iBinderLJIJJ, latLng, fLJIJ, fLJIJ2, latLngBounds, fLJIJ3, fLJIJ4, zLJIILIIL, fLJIJ5, fLJIJ6, fLJIJ7, zLJIILIIL2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new GroundOverlayOptions[i];
        }
    };
    public C837010WsV zza;
    public LatLng zzb;
    public float zzc;
    public float zzd;
    public LatLngBounds zze;
    public float zzf;
    public float zzg;
    public boolean zzh;
    public float zzi;
    public float zzj;
    public float zzk;
    public boolean zzl;

    public GroundOverlayOptions() {
        this.zzh = true;
        this.zzj = 0.5f;
        this.zzk = 0.5f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIIZ(parcel, 2, this.zza.LIZ.asBinder());
        C817940W6u.LJIIZILJ(parcel, 3, this.zzb, i, false);
        C817940W6u.LJII(parcel, 4, this.zzc);
        C817940W6u.LJII(parcel, 5, this.zzd);
        C817940W6u.LJIIZILJ(parcel, 6, this.zze, i, false);
        C817940W6u.LJII(parcel, 7, this.zzf);
        C817940W6u.LJII(parcel, 8, this.zzg);
        C817940W6u.LIZ(parcel, 9, this.zzh);
        C817940W6u.LJII(parcel, 10, this.zzi);
        C817940W6u.LJII(parcel, 11, this.zzj);
        C817940W6u.LJII(parcel, 12, this.zzk);
        C817940W6u.LIZ(parcel, 13, this.zzl);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public GroundOverlayOptions(IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7, boolean z2) {
        this.zzh = true;
        this.zzj = 0.5f;
        this.zzk = 0.5f;
        this.zza = new C837010WsV(AbstractBinderC828770WfD.LLILLIZIL(iBinder));
        this.zzb = latLng;
        this.zzc = f;
        this.zzd = f2;
        this.zze = latLngBounds;
        this.zzf = f3;
        this.zzg = f4;
        this.zzh = z;
        this.zzi = f5;
        this.zzj = f6;
        this.zzk = f7;
        this.zzl = z2;
    }
}
