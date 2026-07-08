package com.google.android.gms.auth.api.accounttransfer;

import X.C817940W6u;
import X.C830490Whz;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.zzs;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class zzs extends zzbz {
    public static final Parcelable.Creator<zzs> CREATOR = new Parcelable.Creator() { // from class: X.0W68
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            ArrayList arrayListLJIIIZ = null;
            int iLJIJJLI = 0;
            ArrayList arrayListLJIIIZ2 = null;
            ArrayList arrayListLJIIIZ3 = null;
            ArrayList arrayListLJIIIZ4 = null;
            ArrayList arrayListLJIIIZ5 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 1:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 2:
                        arrayListLJIIIZ = C0W6J.LJIIIZ(i, parcel);
                        break;
                    case 3:
                        arrayListLJIIIZ2 = C0W6J.LJIIIZ(i, parcel);
                        break;
                    case 4:
                        arrayListLJIIIZ3 = C0W6J.LJIIIZ(i, parcel);
                        break;
                    case 5:
                        arrayListLJIIIZ4 = C0W6J.LJIIIZ(i, parcel);
                        break;
                    case 6:
                        arrayListLJIIIZ5 = C0W6J.LJIIIZ(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zzs(iLJIJJLI, arrayListLJIIIZ, arrayListLJIIIZ2, arrayListLJIIIZ3, arrayListLJIIIZ4, arrayListLJIIIZ5);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzs[i];
        }
    };
    public static final C830490Whz zzb;
    public final int LL;
    public List zzc;
    public List zzd;
    public List zze;
    public List zzf;
    public List zzg;

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map LIZ() {
        return zzb;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean LIZLLL(FastJsonResponse.Field field) {
        return true;
    }

    static {
        C830490Whz c830490Whz = new C830490Whz();
        zzb = c830490Whz;
        c830490Whz.put("registered", FastJsonResponse.Field.LJLZ(2, "registered"));
        c830490Whz.put("in_progress", FastJsonResponse.Field.LJLZ(3, "in_progress"));
        c830490Whz.put("success", FastJsonResponse.Field.LJLZ(4, "success"));
        c830490Whz.put("failed", FastJsonResponse.Field.LJLZ(5, "failed"));
        c830490Whz.put("escrowed", FastJsonResponse.Field.LJLZ(6, "escrowed"));
    }

    public zzs() {
        this.LL = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object LIZIZ(FastJsonResponse.Field field) {
        switch (field.zaf) {
            case 1:
                return Integer.valueOf(this.LL);
            case 2:
                return this.zzc;
            case 3:
                return this.zzd;
            case 4:
                return this.zze;
            case 5:
                return this.zzf;
            case 6:
                return this.zzg;
            default:
                throw new IllegalStateException("Unknown SafeParcelable id=" + field.zaf);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIJJ(parcel, 2, this.zzc);
        C817940W6u.LJIJJ(parcel, 3, this.zzd);
        C817940W6u.LJIJJ(parcel, 4, this.zze);
        C817940W6u.LJIJJ(parcel, 5, this.zzf);
        C817940W6u.LJIJJ(parcel, 6, this.zzg);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzs(int i, List list, List list2, List list3, List list4, List list5) {
        this.LL = i;
        this.zzc = list;
        this.zzd = list2;
        this.zze = list3;
        this.zzf = list4;
        this.zzg = list5;
    }
}
