package com.google.android.gms.auth.api.accounttransfer;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.zzo;
import com.google.android.gms.auth.api.accounttransfer.zzs;
import com.google.android.gms.auth.api.accounttransfer.zzu;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class zzo extends zzbz {
    public static final Parcelable.Creator<zzo> CREATOR = new Parcelable.Creator() { // from class: X.0W67
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            HashSet hashSet = new HashSet();
            ArrayList arrayListLJIIJJI = null;
            int iLJIJJLI = 0;
            zzs zzsVar = null;
            int iLJIJJLI2 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                zzsVar = (zzs) C0W6J.LJI(parcel, i, zzs.CREATOR);
                                hashSet.add(4);
                            }
                        } else {
                            iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                            hashSet.add(3);
                        }
                    } else {
                        arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, zzu.CREATOR);
                        hashSet.add(2);
                    }
                } else {
                    iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                    hashSet.add(1);
                }
            }
            if (parcel.dataPosition() == iLJJIII) {
                return new zzo(hashSet, iLJIJJLI2, arrayListLJIIJJI, iLJIJJLI, zzsVar);
            }
            throw new C816410W0x("Overread allowed size end=" + iLJJIII, parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzo[i];
        }
    };
    public static final HashMap zzc;
    public final Set LL;
    public final int LLILLJJLI;
    public ArrayList zzd;
    public int zze;
    public zzs zzf;

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map LIZ() {
        return zzc;
    }

    static {
        HashMap map = new HashMap();
        zzc = map;
        map.put("authenticatorData", new FastJsonResponse.Field(11, true, 11, true, "authenticatorData", 2, zzu.class));
        map.put("progress", new FastJsonResponse.Field(11, false, 11, false, "progress", 4, zzs.class));
    }

    public zzo() {
        this.LL = new HashSet(1);
        this.LLILLJJLI = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object LIZIZ(FastJsonResponse.Field field) {
        int i = field.zaf;
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    return this.zzf;
                }
                throw new IllegalStateException("Unknown SafeParcelable id=" + field.zaf);
            }
            return this.zzd;
        }
        return Integer.valueOf(this.LLILLJJLI);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean LIZLLL(FastJsonResponse.Field field) {
        return this.LL.contains(Integer.valueOf(field.zaf));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        Set set = this.LL;
        if (set.contains(1)) {
            C817940W6u.LJIIJ(parcel, 1, this.LLILLJJLI);
        }
        if (set.contains(2)) {
            C817940W6u.LJIL(parcel, 2, this.zzd, true);
        }
        if (set.contains(3)) {
            C817940W6u.LJIIJ(parcel, 3, this.zze);
        }
        if (set.contains(4)) {
            C817940W6u.LJIIZILJ(parcel, 4, this.zzf, i, true);
        }
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzo(Set set, int i, ArrayList arrayList, int i2, zzs zzsVar) {
        this.LL = set;
        this.LLILLJJLI = i;
        this.zzd = arrayList;
        this.zze = i2;
        this.zzf = zzsVar;
    }
}
