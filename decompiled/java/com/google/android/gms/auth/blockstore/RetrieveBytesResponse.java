package com.google.android.gms.auth.blockstore;

import X.C817940W6u;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class RetrieveBytesResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RetrieveBytesResponse> CREATOR = new Parcelable.Creator() { // from class: X.0WpK
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            Bundle bundleLIZIZ = null;
            ArrayList arrayListLJIIJJI = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, RetrieveBytesResponse.BlockstoreData.CREATOR);
                    }
                } else {
                    bundleLIZIZ = C0W6J.LIZIZ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new RetrieveBytesResponse(bundleLIZIZ, arrayListLJIIJJI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new RetrieveBytesResponse[i];
        }
    };
    public final Bundle zza;
    public final List zzb;
    public final Map zzc;

    public final Map<String, BlockstoreData> LJLZ() {
        return Collections.unmodifiableMap(this.zzc);
    }

    public static class BlockstoreData extends AbstractSafeParcelable {
        public static final Parcelable.Creator<BlockstoreData> CREATOR = new Parcelable.Creator() { // from class: X.0WpL
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int iLJJIII = C0W6J.LJJIII(parcel);
                byte[] bArrLIZJ = null;
                String strLJII = null;
                while (parcel.dataPosition() < iLJJIII) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c != 1) {
                        if (c != 2) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            strLJII = C0W6J.LJII(i, parcel);
                        }
                    } else {
                        bArrLIZJ = C0W6J.LIZJ(i, parcel);
                    }
                }
                C0W6J.LJIIL(iLJJIII, parcel);
                return new RetrieveBytesResponse.BlockstoreData(bArrLIZJ, strLJII);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return new RetrieveBytesResponse.BlockstoreData[i];
            }
        };
        public final byte[] zza;
        public final String zzb;

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.zza))});
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof BlockstoreData)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return Arrays.equals(this.zza, ((BlockstoreData) obj).zza);
        }

        public BlockstoreData(byte[] bArr, String str) {
            this.zza = bArr;
            this.zzb = str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iLJJ = C817940W6u.LJJ(20293, parcel);
            C817940W6u.LJ(parcel, 1, this.zza, false);
            C817940W6u.LJIJ(parcel, 2, this.zzb, false);
            C817940W6u.LJJI(iLJJ, parcel);
        }
    }

    public RetrieveBytesResponse(Bundle bundle, List list) {
        this.zza = bundle;
        this.zzb = list;
        HashMap map = new HashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            BlockstoreData blockstoreData = (BlockstoreData) it2.next();
            map.put(blockstoreData.zzb, blockstoreData);
        }
        this.zzc = map;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LIZJ(parcel, 1, this.zza);
        C817940W6u.LJIL(parcel, 2, this.zzb, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
