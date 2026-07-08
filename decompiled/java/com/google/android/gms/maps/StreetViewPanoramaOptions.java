package com.google.android.gms.maps;

import X.C0W3L;
import X.C817940W6u;
import X.C837180Wsm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes14.dex */
public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new Parcelable.Creator() { // from class: X.0Wsk
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            StreetViewPanoramaCamera streetViewPanoramaCamera = null;
            String strLJII = null;
            LatLng latLng = null;
            Integer numLJIL = null;
            StreetViewSource streetViewSource = null;
            byte bLJIILL = 0;
            byte bLJIILL2 = 0;
            byte bLJIILL3 = 0;
            byte bLJIILL4 = 0;
            byte bLJIILL5 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 2:
                        streetViewPanoramaCamera = (StreetViewPanoramaCamera) C0W6J.LJI(parcel, i, StreetViewPanoramaCamera.CREATOR);
                        break;
                    case 3:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 4:
                        latLng = (LatLng) C0W6J.LJI(parcel, i, LatLng.CREATOR);
                        break;
                    case 5:
                        numLJIL = C0W6J.LJIL(i, parcel);
                        break;
                    case 6:
                        bLJIILL = C0W6J.LJIILL(i, parcel);
                        break;
                    case 7:
                        bLJIILL2 = C0W6J.LJIILL(i, parcel);
                        break;
                    case '\b':
                        bLJIILL3 = C0W6J.LJIILL(i, parcel);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        bLJIILL4 = C0W6J.LJIILL(i, parcel);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        bLJIILL5 = C0W6J.LJIILL(i, parcel);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        streetViewSource = (StreetViewSource) C0W6J.LJI(parcel, i, StreetViewSource.CREATOR);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new StreetViewPanoramaOptions(streetViewPanoramaCamera, strLJII, latLng, numLJIL, bLJIILL, bLJIILL2, bLJIILL3, bLJIILL4, bLJIILL5, streetViewSource);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new StreetViewPanoramaOptions[i];
        }
    };
    public StreetViewPanoramaCamera zza;
    public String zzb;
    public LatLng zzc;
    public Integer zzd;
    public Boolean zze;
    public Boolean zzf;
    public Boolean zzg;
    public Boolean zzh;
    public Boolean zzi;
    public StreetViewSource zzj;

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        c0w3l.LIZ(this.zzb, "PanoramaId");
        c0w3l.LIZ(this.zzc, "Position");
        c0w3l.LIZ(this.zzd, "Radius");
        c0w3l.LIZ(this.zzj, "Source");
        c0w3l.LIZ(this.zza, "StreetViewPanoramaCamera");
        c0w3l.LIZ(this.zze, "UserNavigationEnabled");
        c0w3l.LIZ(this.zzf, "ZoomGesturesEnabled");
        c0w3l.LIZ(this.zzg, "PanningGesturesEnabled");
        c0w3l.LIZ(this.zzh, "StreetNamesEnabled");
        c0w3l.LIZ(this.zzi, "UseViewLifecycleInFragment");
        return c0w3l.toString();
    }

    public StreetViewPanoramaOptions() {
        Boolean bool = Boolean.TRUE;
        this.zze = bool;
        this.zzf = bool;
        this.zzg = bool;
        this.zzh = bool;
        this.zzj = StreetViewSource.DEFAULT;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 2, this.zza, i, false);
        C817940W6u.LJIJ(parcel, 3, this.zzb, false);
        C817940W6u.LJIIZILJ(parcel, 4, this.zzc, i, false);
        C817940W6u.LJIILIIL(parcel, 5, this.zzd);
        C817940W6u.LIZLLL(parcel, 6, C837180Wsm.LIZ(this.zze));
        C817940W6u.LIZLLL(parcel, 7, C837180Wsm.LIZ(this.zzf));
        C817940W6u.LIZLLL(parcel, 8, C837180Wsm.LIZ(this.zzg));
        C817940W6u.LIZLLL(parcel, 9, C837180Wsm.LIZ(this.zzh));
        C817940W6u.LIZLLL(parcel, 10, C837180Wsm.LIZ(this.zzi));
        C817940W6u.LJIIZILJ(parcel, 11, this.zzj, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public StreetViewPanoramaOptions(StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b, byte b2, byte b3, byte b4, byte b5, StreetViewSource streetViewSource) {
        Boolean bool = Boolean.TRUE;
        this.zze = bool;
        this.zzf = bool;
        this.zzg = bool;
        this.zzh = bool;
        this.zzj = StreetViewSource.DEFAULT;
        this.zza = streetViewPanoramaCamera;
        this.zzc = latLng;
        this.zzd = num;
        this.zzb = str;
        this.zze = C837180Wsm.LIZIZ(b);
        this.zzf = C837180Wsm.LIZIZ(b2);
        this.zzg = C837180Wsm.LIZIZ(b3);
        this.zzh = C837180Wsm.LIZIZ(b4);
        this.zzi = C837180Wsm.LIZIZ(b5);
        this.zzj = streetViewSource;
    }
}
