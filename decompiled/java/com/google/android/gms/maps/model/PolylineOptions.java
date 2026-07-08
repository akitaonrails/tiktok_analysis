package com.google.android.gms.maps.model;

import X.C817940W6u;
import X.C836980WsS;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.StyleSpan;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class PolylineOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new Parcelable.Creator() { // from class: X.0WsQ
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            ArrayList arrayListLJIIJJI = null;
            Cap cap = null;
            Cap cap2 = null;
            ArrayList arrayListLJIIJJI2 = null;
            ArrayList arrayListLJIIJJI3 = null;
            float fLJIJ = 0.0f;
            float fLJIJ2 = 0.0f;
            int iLJIJJLI = 0;
            boolean zLJIILIIL = false;
            boolean zLJIILIIL2 = false;
            boolean zLJIILIIL3 = false;
            int iLJIJJLI2 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 2:
                        arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, LatLng.CREATOR);
                        break;
                    case 3:
                        fLJIJ = C0W6J.LJIJ(i, parcel);
                        break;
                    case 4:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 5:
                        fLJIJ2 = C0W6J.LJIJ(i, parcel);
                        break;
                    case 6:
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case 7:
                        zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case '\b':
                        zLJIILIIL3 = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        cap = (Cap) C0W6J.LJI(parcel, i, Cap.CREATOR);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        cap2 = (Cap) C0W6J.LJI(parcel, i, Cap.CREATOR);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        arrayListLJIIJJI2 = C0W6J.LJIIJJI(parcel, i, PatternItem.CREATOR);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        arrayListLJIIJJI3 = C0W6J.LJIIJJI(parcel, i, StyleSpan.CREATOR);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new PolylineOptions(arrayListLJIIJJI, fLJIJ, iLJIJJLI, fLJIJ2, zLJIILIIL, zLJIILIIL2, zLJIILIIL3, cap, cap2, iLJIJJLI2, arrayListLJIIJJI2, arrayListLJIIJJI3);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new PolylineOptions[i];
        }
    };
    public final List zza;
    public float zzb;
    public int zzc;
    public float zzd;
    public boolean zze;
    public boolean zzf;
    public boolean zzg;
    public Cap zzh;
    public Cap zzi;
    public int zzj;
    public List zzk;
    public List zzl;

    public PolylineOptions() {
        this.zzb = 10.0f;
        this.zzc = -16777216;
        this.zze = true;
        this.zzh = new ButtCap();
        this.zzi = new ButtCap();
        this.zzj = 0;
        this.zzk = null;
        this.zzl = new ArrayList();
        this.zza = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIL(parcel, 2, this.zza, false);
        C817940W6u.LJII(parcel, 3, this.zzb);
        C817940W6u.LJIIJ(parcel, 4, this.zzc);
        C817940W6u.LJII(parcel, 5, this.zzd);
        C817940W6u.LIZ(parcel, 6, this.zze);
        C817940W6u.LIZ(parcel, 7, this.zzf);
        C817940W6u.LIZ(parcel, 8, this.zzg);
        C817940W6u.LJIIZILJ(parcel, 9, this.zzh.LJLZ(), i, false);
        C817940W6u.LJIIZILJ(parcel, 10, this.zzi.LJLZ(), i, false);
        C817940W6u.LJIIJ(parcel, 11, this.zzj);
        C817940W6u.LJIL(parcel, 12, this.zzk, false);
        ArrayList arrayList = new ArrayList(this.zzl.size());
        for (StyleSpan styleSpan : this.zzl) {
            C836980WsS c836980WsS = new C836980WsS(styleSpan.zza);
            c836980WsS.LIZ = this.zzb;
            c836980WsS.LIZLLL = this.zze;
            arrayList.add(new StyleSpan(new StrokeStyle(c836980WsS.LIZ, c836980WsS.LIZIZ, c836980WsS.LIZJ, c836980WsS.LIZLLL, c836980WsS.LJ), styleSpan.zzb));
        }
        C817940W6u.LJIL(parcel, 13, arrayList, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public PolylineOptions(List list, float f, int i, float f2, boolean z, boolean z2, boolean z3, Cap cap, Cap cap2, int i2, List list2, List list3) {
        this.zzb = 10.0f;
        this.zzc = -16777216;
        this.zze = true;
        this.zzh = new ButtCap();
        this.zzi = new ButtCap();
        this.zzj = 0;
        this.zzk = null;
        this.zzl = new ArrayList();
        this.zza = list;
        this.zzb = f;
        this.zzc = i;
        this.zzd = f2;
        this.zze = z;
        this.zzf = z2;
        this.zzg = z3;
        if (cap != null) {
            this.zzh = cap;
        }
        if (cap2 != null) {
            this.zzi = cap2;
        }
        this.zzj = i2;
        this.zzk = list2;
        if (list3 != null) {
            this.zzl = list3;
        }
    }
}
