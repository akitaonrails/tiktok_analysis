package com.google.android.gms.maps.model;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.PolygonOptions;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class PolygonOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolygonOptions> CREATOR = new Parcelable.Creator() { // from class: X.0Wqw
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayListLJIIJJI = null;
            float fLJIJ = 0.0f;
            int iLJIJJLI = 0;
            int iLJIJJLI2 = 0;
            boolean zLJIILIIL = false;
            boolean zLJIILIIL2 = false;
            boolean zLJIILIIL3 = false;
            int iLJIJJLI3 = 0;
            float fLJIJ2 = 0.0f;
            ArrayList arrayListLJIIJJI2 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 2:
                        arrayListLJIIJJI2 = C0W6J.LJIIJJI(parcel, i, LatLng.CREATOR);
                        break;
                    case 3:
                        ClassLoader classLoader = C836040Wqw.class.getClassLoader();
                        int iLJJIFFI = C0W6J.LJJIFFI(i, parcel);
                        int iDataPosition = parcel.dataPosition();
                        if (iLJJIFFI != 0) {
                            parcel.readList(arrayList, classLoader);
                            parcel.setDataPosition(iDataPosition + iLJJIFFI);
                        }
                        break;
                    case 4:
                        fLJIJ2 = C0W6J.LJIJ(i, parcel);
                        break;
                    case 5:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 6:
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 7:
                        fLJIJ = C0W6J.LJIJ(i, parcel);
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
                        iLJIJJLI3 = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, PatternItem.CREATOR);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new PolygonOptions(arrayListLJIIJJI2, arrayList, fLJIJ2, iLJIJJLI, iLJIJJLI2, fLJIJ, zLJIILIIL, zLJIILIIL2, zLJIILIIL3, iLJIJJLI3, arrayListLJIIJJI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new PolygonOptions[i];
        }
    };
    public final List zza;
    public final List zzb;
    public float zzc;
    public int zzd;
    public int zze;
    public float zzf;
    public boolean zzg;
    public boolean zzh;
    public boolean zzi;
    public int zzj;
    public List zzk;

    public PolygonOptions() {
        this.zzc = 10.0f;
        this.zzd = -16777216;
        this.zzg = true;
        this.zza = new ArrayList();
        this.zzb = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIL(parcel, 2, this.zza, false);
        List list = this.zzb;
        if (list != null) {
            int iLJJ2 = C817940W6u.LJJ(3, parcel);
            parcel.writeList(list);
            C817940W6u.LJJI(iLJJ2, parcel);
        }
        C817940W6u.LJII(parcel, 4, this.zzc);
        C817940W6u.LJIIJ(parcel, 5, this.zzd);
        C817940W6u.LJIIJ(parcel, 6, this.zze);
        C817940W6u.LJII(parcel, 7, this.zzf);
        C817940W6u.LIZ(parcel, 8, this.zzg);
        C817940W6u.LIZ(parcel, 9, this.zzh);
        C817940W6u.LIZ(parcel, 10, this.zzi);
        C817940W6u.LJIIJ(parcel, 11, this.zzj);
        C817940W6u.LJIL(parcel, 12, this.zzk, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public PolygonOptions(List list, List list2, float f, int i, int i2, float f2, boolean z, boolean z2, boolean z3, int i3, List list3) {
        this.zza = list;
        this.zzb = list2;
        this.zzc = f;
        this.zzd = i;
        this.zze = i2;
        this.zzf = f2;
        this.zzg = z;
        this.zzh = z2;
        this.zzi = z3;
        this.zzj = i3;
        this.zzk = list3;
    }
}
