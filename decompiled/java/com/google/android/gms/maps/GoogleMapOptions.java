package com.google.android.gms.maps;

import X.C0W3L;
import X.C19M6;
import X.C786410Ut5;
import X.C817940W6u;
import X.C837180Wsm;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes34.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new Parcelable.Creator() { // from class: X.0Wsf
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            CameraPosition cameraPosition = null;
            byte bLJIILL = -1;
            byte bLJIILL2 = -1;
            byte bLJIILL3 = -1;
            byte bLJIILL4 = -1;
            byte bLJIILL5 = -1;
            byte bLJIILL6 = -1;
            byte bLJIILL7 = -1;
            byte bLJIILL8 = -1;
            byte bLJIILL9 = -1;
            byte bLJIILL10 = -1;
            byte bLJIILL11 = -1;
            byte bLJIILL12 = -1;
            int iLJIJJLI = 0;
            Float fLJIJI = null;
            Float fLJIJI2 = null;
            LatLngBounds latLngBounds = null;
            Integer numLJIL = null;
            String strLJII = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 2:
                        bLJIILL = C0W6J.LJIILL(i, parcel);
                        break;
                    case 3:
                        bLJIILL2 = C0W6J.LJIILL(i, parcel);
                        break;
                    case 4:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 5:
                        cameraPosition = (CameraPosition) C0W6J.LJI(parcel, i, CameraPosition.CREATOR);
                        break;
                    case 6:
                        bLJIILL3 = C0W6J.LJIILL(i, parcel);
                        break;
                    case 7:
                        bLJIILL4 = C0W6J.LJIILL(i, parcel);
                        break;
                    case '\b':
                        bLJIILL5 = C0W6J.LJIILL(i, parcel);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        bLJIILL6 = C0W6J.LJIILL(i, parcel);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        bLJIILL7 = C0W6J.LJIILL(i, parcel);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        bLJIILL8 = C0W6J.LJIILL(i, parcel);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        bLJIILL9 = C0W6J.LJIILL(i, parcel);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                    case 14:
                        bLJIILL10 = C0W6J.LJIILL(i, parcel);
                        break;
                    case 15:
                        bLJIILL11 = C0W6J.LJIILL(i, parcel);
                        break;
                    case 16:
                        fLJIJI = C0W6J.LJIJI(i, parcel);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        fLJIJI2 = C0W6J.LJIJI(i, parcel);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        latLngBounds = (LatLngBounds) C0W6J.LJI(parcel, i, LatLngBounds.CREATOR);
                        break;
                    case 19:
                        bLJIILL12 = C0W6J.LJIILL(i, parcel);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        numLJIL = C0W6J.LJIL(i, parcel);
                        break;
                    case 21:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new GoogleMapOptions(bLJIILL, bLJIILL2, iLJIJJLI, cameraPosition, bLJIILL3, bLJIILL4, bLJIILL5, bLJIILL6, bLJIILL7, bLJIILL8, bLJIILL9, bLJIILL10, bLJIILL11, fLJIJI, fLJIJI2, latLngBounds, bLJIILL12, numLJIL, strLJII);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new GoogleMapOptions[i];
        }
    };
    public static final Integer zza = Integer.valueOf(Color.argb(255, 236, 233, 225));
    public Boolean zzb;
    public Boolean zzc;
    public int zzd;
    public CameraPosition zze;
    public Boolean zzf;
    public Boolean zzg;
    public Boolean zzh;
    public Boolean zzi;
    public Boolean zzj;
    public Boolean zzk;
    public Boolean zzl;
    public Boolean zzm;
    public Boolean zzn;
    public Float zzo;
    public Float zzp;
    public LatLngBounds zzq;
    public Boolean zzr;
    public Integer zzs;
    public String zzt;

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        c0w3l.LIZ(Integer.valueOf(this.zzd), "MapType");
        c0w3l.LIZ(this.zzl, "LiteMode");
        c0w3l.LIZ(this.zze, "Camera");
        c0w3l.LIZ(this.zzg, "CompassEnabled");
        c0w3l.LIZ(this.zzf, "ZoomControlsEnabled");
        c0w3l.LIZ(this.zzh, "ScrollGesturesEnabled");
        c0w3l.LIZ(this.zzi, "ZoomGesturesEnabled");
        c0w3l.LIZ(this.zzj, "TiltGesturesEnabled");
        c0w3l.LIZ(this.zzk, "RotateGesturesEnabled");
        c0w3l.LIZ(this.zzr, "ScrollGesturesEnabledDuringRotateOrZoom");
        c0w3l.LIZ(this.zzm, "MapToolbarEnabled");
        c0w3l.LIZ(this.zzn, "AmbientEnabled");
        c0w3l.LIZ(this.zzo, "MinZoomPreference");
        c0w3l.LIZ(this.zzp, "MaxZoomPreference");
        c0w3l.LIZ(this.zzs, "BackgroundColor");
        c0w3l.LIZ(this.zzq, "LatLngBoundsForCameraTarget");
        c0w3l.LIZ(this.zzb, "ZOrderOnTop");
        c0w3l.LIZ(this.zzc, "UseViewLifecycleInFragment");
        return c0w3l.toString();
    }

    public GoogleMapOptions() {
        this.zzd = -1;
    }

    public static GoogleMapOptions LJLZ(Context context, AttributeSet attributeSet) {
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        Float fValueOf4;
        float f;
        float f2;
        String strXd;
        LatLngBounds latLngBounds = null;
        if (context == null || attributeSet == null) {
            return null;
        }
        Resources resources = context.getResources();
        int[] iArr = com.ss.android.ugc.aweme.app.R$styleable.MapAttrs;
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, iArr);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (typedArrayObtainAttributes.hasValue(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_mapType)) {
            googleMapOptions.zzd = typedArrayObtainAttributes.getInt(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_mapType, -1);
        }
        if (typedArrayObtainAttributes.hasValue(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_zOrderOnTop)) {
            googleMapOptions.zzb = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_zOrderOnTop, false));
        }
        if (typedArrayObtainAttributes.hasValue(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_useViewLifecycle)) {
            googleMapOptions.zzc = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_useViewLifecycle, false));
        }
        if (typedArrayObtainAttributes.hasValue(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_uiCompass)) {
            googleMapOptions.zzg = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_uiCompass, true));
        }
        if (typedArrayObtainAttributes.hasValue(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_uiRotateGestures)) {
            googleMapOptions.zzk = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_uiRotateGestures, true));
        }
        if (typedArrayObtainAttributes.hasValue(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom)) {
            googleMapOptions.zzr = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom, true));
        }
        if (typedArrayObtainAttributes.hasValue(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_uiScrollGestures)) {
            googleMapOptions.zzh = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_uiScrollGestures, true));
        }
        if (typedArrayObtainAttributes.hasValue(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_uiTiltGestures)) {
            googleMapOptions.zzj = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_uiTiltGestures, true));
        }
        if (typedArrayObtainAttributes.hasValue(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_uiZoomGestures)) {
            googleMapOptions.zzi = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_uiZoomGestures, true));
        }
        if (typedArrayObtainAttributes.hasValue(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_uiZoomControls)) {
            googleMapOptions.zzf = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_uiZoomControls, true));
        }
        if (typedArrayObtainAttributes.hasValue(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_liteMode)) {
            googleMapOptions.zzl = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_liteMode, false));
        }
        if (typedArrayObtainAttributes.hasValue(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_uiMapToolbar)) {
            googleMapOptions.zzm = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_uiMapToolbar, true));
        }
        if (typedArrayObtainAttributes.hasValue(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_ambientEnabled)) {
            googleMapOptions.zzn = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_ambientEnabled, false));
        }
        if (typedArrayObtainAttributes.hasValue(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.zzo = Float.valueOf(typedArrayObtainAttributes.getFloat(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_cameraMinZoomPreference, Float.NEGATIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.zzp = Float.valueOf(typedArrayObtainAttributes.getFloat(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_backgroundColor)) {
            googleMapOptions.zzs = Integer.valueOf(typedArrayObtainAttributes.getColor(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_backgroundColor, zza.intValue()));
        }
        if (typedArrayObtainAttributes.hasValue(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_mapId) && (strXd = C786410Ut5.Xd(typedArrayObtainAttributes, com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_mapId)) != null && !strXd.isEmpty()) {
            googleMapOptions.zzt = strXd;
        }
        TypedArray typedArrayObtainAttributes2 = context.getResources().obtainAttributes(attributeSet, iArr);
        if (typedArrayObtainAttributes2.hasValue(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_latLngBoundsSouthWestLatitude)) {
            fValueOf = Float.valueOf(typedArrayObtainAttributes2.getFloat(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_latLngBoundsSouthWestLatitude, 0.0f));
        } else {
            fValueOf = null;
        }
        if (typedArrayObtainAttributes2.hasValue(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_latLngBoundsSouthWestLongitude)) {
            fValueOf2 = Float.valueOf(typedArrayObtainAttributes2.getFloat(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_latLngBoundsSouthWestLongitude, 0.0f));
        } else {
            fValueOf2 = null;
        }
        if (typedArrayObtainAttributes2.hasValue(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_latLngBoundsNorthEastLatitude)) {
            fValueOf3 = Float.valueOf(typedArrayObtainAttributes2.getFloat(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_latLngBoundsNorthEastLatitude, 0.0f));
        } else {
            fValueOf3 = null;
        }
        if (typedArrayObtainAttributes2.hasValue(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_latLngBoundsNorthEastLongitude)) {
            fValueOf4 = Float.valueOf(typedArrayObtainAttributes2.getFloat(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_latLngBoundsNorthEastLongitude, 0.0f));
        } else {
            fValueOf4 = null;
        }
        typedArrayObtainAttributes2.recycle();
        if (fValueOf != null && fValueOf2 != null && fValueOf3 != null && fValueOf4 != null) {
            latLngBounds = new LatLngBounds(new LatLng(fValueOf.floatValue(), fValueOf2.floatValue()), new LatLng(fValueOf3.floatValue(), fValueOf4.floatValue()));
        }
        googleMapOptions.zzq = latLngBounds;
        TypedArray typedArrayObtainAttributes3 = context.getResources().obtainAttributes(attributeSet, iArr);
        if (typedArrayObtainAttributes3.hasValue(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_cameraTargetLat)) {
            f = typedArrayObtainAttributes3.getFloat(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_cameraTargetLat, 0.0f);
        } else {
            f = 0.0f;
        }
        if (typedArrayObtainAttributes3.hasValue(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_cameraTargetLng)) {
            f2 = typedArrayObtainAttributes3.getFloat(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_cameraTargetLng, 0.0f);
        } else {
            f2 = 0.0f;
        }
        LatLng latLng = new LatLng(f, f2);
        C19M6 c19m6 = new C19M6();
        c19m6.LIZ = latLng;
        if (typedArrayObtainAttributes3.hasValue(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_cameraZoom)) {
            c19m6.LIZIZ = typedArrayObtainAttributes3.getFloat(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_cameraZoom, 0.0f);
        }
        if (typedArrayObtainAttributes3.hasValue(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_cameraBearing)) {
            c19m6.LIZLLL = typedArrayObtainAttributes3.getFloat(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_cameraBearing, 0.0f);
        }
        if (typedArrayObtainAttributes3.hasValue(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_cameraTilt)) {
            c19m6.LIZJ = typedArrayObtainAttributes3.getFloat(com.ss.android.ugc.aweme.app.R$styleable.MapAttrs_cameraTilt, 0.0f);
        }
        typedArrayObtainAttributes3.recycle();
        googleMapOptions.zze = new CameraPosition(c19m6.LIZ, c19m6.LIZIZ, c19m6.LIZJ, c19m6.LIZLLL);
        typedArrayObtainAttributes.recycle();
        return googleMapOptions;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LIZLLL(parcel, 2, C837180Wsm.LIZ(this.zzb));
        C817940W6u.LIZLLL(parcel, 3, C837180Wsm.LIZ(this.zzc));
        C817940W6u.LJIIJ(parcel, 4, this.zzd);
        C817940W6u.LJIIZILJ(parcel, 5, this.zze, i, false);
        C817940W6u.LIZLLL(parcel, 6, C837180Wsm.LIZ(this.zzf));
        C817940W6u.LIZLLL(parcel, 7, C837180Wsm.LIZ(this.zzg));
        C817940W6u.LIZLLL(parcel, 8, C837180Wsm.LIZ(this.zzh));
        C817940W6u.LIZLLL(parcel, 9, C837180Wsm.LIZ(this.zzi));
        C817940W6u.LIZLLL(parcel, 10, C837180Wsm.LIZ(this.zzj));
        C817940W6u.LIZLLL(parcel, 11, C837180Wsm.LIZ(this.zzk));
        C817940W6u.LIZLLL(parcel, 12, C837180Wsm.LIZ(this.zzl));
        C817940W6u.LIZLLL(parcel, 14, C837180Wsm.LIZ(this.zzm));
        C817940W6u.LIZLLL(parcel, 15, C837180Wsm.LIZ(this.zzn));
        C817940W6u.LJIIIIZZ(parcel, 16, this.zzo);
        C817940W6u.LJIIIIZZ(parcel, 17, this.zzp);
        C817940W6u.LJIIZILJ(parcel, 18, this.zzq, i, false);
        C817940W6u.LIZLLL(parcel, 19, C837180Wsm.LIZ(this.zzr));
        C817940W6u.LJIILIIL(parcel, 20, this.zzs);
        C817940W6u.LJIJ(parcel, 21, this.zzt, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public GoogleMapOptions(byte b, byte b2, int i, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds, byte b12, Integer num, String str) {
        this.zzd = -1;
        this.zzb = C837180Wsm.LIZIZ(b);
        this.zzc = C837180Wsm.LIZIZ(b2);
        this.zzd = i;
        this.zze = cameraPosition;
        this.zzf = C837180Wsm.LIZIZ(b3);
        this.zzg = C837180Wsm.LIZIZ(b4);
        this.zzh = C837180Wsm.LIZIZ(b5);
        this.zzi = C837180Wsm.LIZIZ(b6);
        this.zzj = C837180Wsm.LIZIZ(b7);
        this.zzk = C837180Wsm.LIZIZ(b8);
        this.zzl = C837180Wsm.LIZIZ(b9);
        this.zzm = C837180Wsm.LIZIZ(b10);
        this.zzn = C837180Wsm.LIZIZ(b11);
        this.zzo = f;
        this.zzp = f2;
        this.zzq = latLngBounds;
        this.zzr = C837180Wsm.LIZIZ(b12);
        this.zzs = num;
        this.zzt = str;
    }
}
