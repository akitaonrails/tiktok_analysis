package com.google.android.gms.maps.model;

import X.AbstractBinderC828770WfD;
import X.C817940W6u;
import X.C837010WsV;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes14.dex */
public final class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new Parcelable.Creator() { // from class: X.0Wrm
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            LatLng latLng = null;
            String strLJII = null;
            String strLJII2 = null;
            IBinder iBinderLJIJJ = null;
            float fLJIJ = 0.0f;
            float fLJIJ2 = 0.0f;
            float fLJIJ3 = 0.0f;
            float fLJIJ4 = 0.0f;
            float fLJIJ5 = 0.0f;
            boolean zLJIILIIL = false;
            boolean zLJIILIIL2 = false;
            boolean zLJIILIIL3 = false;
            float fLJIJ6 = 0.5f;
            float fLJIJ7 = 1.0f;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 2:
                        latLng = (LatLng) C0W6J.LJI(parcel, i, LatLng.CREATOR);
                        break;
                    case 3:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 4:
                        strLJII2 = C0W6J.LJII(i, parcel);
                        break;
                    case 5:
                        iBinderLJIJJ = C0W6J.LJIJJ(i, parcel);
                        break;
                    case 6:
                        fLJIJ = C0W6J.LJIJ(i, parcel);
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
                        zLJIILIIL3 = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        fLJIJ3 = C0W6J.LJIJ(i, parcel);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        fLJIJ6 = C0W6J.LJIJ(i, parcel);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        fLJIJ4 = C0W6J.LJIJ(i, parcel);
                        break;
                    case 14:
                        fLJIJ7 = C0W6J.LJIJ(i, parcel);
                        break;
                    case 15:
                        fLJIJ5 = C0W6J.LJIJ(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new MarkerOptions(latLng, strLJII, strLJII2, iBinderLJIJJ, fLJIJ, fLJIJ2, zLJIILIIL, zLJIILIIL2, zLJIILIIL3, fLJIJ3, fLJIJ6, fLJIJ4, fLJIJ7, fLJIJ5);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new MarkerOptions[i];
        }
    };
    public LatLng zza;
    public String zzb;
    public String zzc;
    public C837010WsV zzd;
    public float zze;
    public float zzf;
    public boolean zzg;
    public boolean zzh;
    public boolean zzi;
    public float zzj;
    public float zzk;
    public float zzl;
    public float zzm;
    public float zzn;

    public MarkerOptions() {
        this.zze = 0.5f;
        this.zzf = 1.0f;
        this.zzh = true;
        this.zzk = 0.5f;
        this.zzm = 1.0f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinderAsBinder;
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 2, this.zza, i, false);
        C817940W6u.LJIJ(parcel, 3, this.zzb, false);
        C817940W6u.LJIJ(parcel, 4, this.zzc, false);
        C837010WsV c837010WsV = this.zzd;
        if (c837010WsV == null) {
            iBinderAsBinder = null;
        } else {
            iBinderAsBinder = c837010WsV.LIZ.asBinder();
        }
        C817940W6u.LJIIIZ(parcel, 5, iBinderAsBinder);
        C817940W6u.LJII(parcel, 6, this.zze);
        C817940W6u.LJII(parcel, 7, this.zzf);
        C817940W6u.LIZ(parcel, 8, this.zzg);
        C817940W6u.LIZ(parcel, 9, this.zzh);
        C817940W6u.LIZ(parcel, 10, this.zzi);
        C817940W6u.LJII(parcel, 11, this.zzj);
        C817940W6u.LJII(parcel, 12, this.zzk);
        C817940W6u.LJII(parcel, 13, this.zzl);
        C817940W6u.LJII(parcel, 14, this.zzm);
        C817940W6u.LJII(parcel, 15, this.zzn);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public MarkerOptions(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7) {
        this.zze = 0.5f;
        this.zzf = 1.0f;
        this.zzh = true;
        this.zzk = 0.5f;
        this.zzm = 1.0f;
        this.zza = latLng;
        this.zzb = str;
        this.zzc = str2;
        if (iBinder == null) {
            this.zzd = null;
        } else {
            this.zzd = new C837010WsV(AbstractBinderC828770WfD.LLILLIZIL(iBinder));
        }
        this.zze = f;
        this.zzf = f2;
        this.zzg = z;
        this.zzh = z2;
        this.zzi = z3;
        this.zzj = f3;
        this.zzk = f4;
        this.zzl = f5;
        this.zzm = f6;
        this.zzn = f7;
    }
}
