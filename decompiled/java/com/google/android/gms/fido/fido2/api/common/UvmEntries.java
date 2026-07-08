package com.google.android.gms.fido.fido2.api.common;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.UvmEntries;
import com.google.android.gms.fido.fido2.api.common.UvmEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes14.dex */
public class UvmEntries extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UvmEntries> CREATOR = new Parcelable.Creator() { // from class: X.0W6N
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            ArrayList arrayListLJIIJJI = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 1) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, UvmEntry.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new UvmEntries(arrayListLJIIJJI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new UvmEntries[i];
        }
    };
    public final List zza;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.zza)});
    }

    public final JSONArray LJLZ() {
        try {
            JSONArray jSONArray = new JSONArray();
            if (this.zza != null) {
                for (int i = 0; i < this.zza.size(); i++) {
                    UvmEntry uvmEntry = (UvmEntry) ListProtector.get(this.zza, i);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) uvmEntry.zzc);
                    jSONArray2.put((int) uvmEntry.zzb);
                    jSONArray2.put((int) uvmEntry.zzc);
                    jSONArray.put(i, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("Error encoding UvmEntries to JSON object", e);
        }
    }

    public UvmEntries(List list) {
        this.zza = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UvmEntries)) {
            return false;
        }
        UvmEntries uvmEntries = (UvmEntries) obj;
        List list = this.zza;
        if (list == null) {
            if (uvmEntries.zza == null) {
                return true;
            }
        } else {
            List list2 = uvmEntries.zza;
            if (list2 != null && list.containsAll(list2) && uvmEntries.zza.containsAll(this.zza)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIL(parcel, 1, this.zza, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
