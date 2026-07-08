package com.google.android.gms.auth.blockstore;

import X.C0W3J;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class DeleteBytesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeleteBytesRequest> CREATOR = new Parcelable.Creator() { // from class: X.0W3O
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            boolean zLJIILIIL = false;
            ArrayList arrayListLJIIIZ = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                    }
                } else {
                    arrayListLJIIIZ = C0W6J.LJIIIZ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new DeleteBytesRequest(arrayListLJIIIZ, zLJIILIIL);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new DeleteBytesRequest[i];
        }
    };
    public final List zza;
    public final boolean zzb;

    public DeleteBytesRequest(List list, boolean z) {
        boolean z2;
        if (z) {
            if (list != null && !list.isEmpty()) {
                z2 = false;
            } else {
                z2 = true;
            }
            C0W3J.LJIIJ("deleteAll was set to true but other constraint(s) was also provided: keys", z2);
        }
        this.zzb = z;
        this.zza = new ArrayList();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                C0W3J.LJFF("Element in keys cannot be null or empty", str);
                this.zza.add(str);
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJJ(parcel, 1, Collections.unmodifiableList(this.zza));
        C817940W6u.LIZ(parcel, 2, this.zzb);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
