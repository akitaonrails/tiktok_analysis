package com.google.android.gms.common.server.converter;

import X.C0W6C;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zac;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes14.dex */
public final class StringToIntConverter extends AbstractSafeParcelable implements C0W6C<String, Integer> {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new Parcelable.Creator<StringToIntConverter>() { // from class: X.0W6D
        @Override // android.os.Parcelable.Creator
        public final StringToIntConverter createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            ArrayList arrayListLJIIJJI = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, zac.CREATOR);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new StringToIntConverter(iLJIJJLI, arrayListLJIIJJI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StringToIntConverter[] newArray(int i) {
            return new StringToIntConverter[i];
        }
    };
    public final int LL;
    public final HashMap<String, Integer> zab;
    public final SparseArray<String> zac;

    public StringToIntConverter() {
        this.LL = 1;
        this.zab = new HashMap<>();
        this.zac = new SparseArray<>();
    }

    public final /* bridge */ /* synthetic */ Object LJLZ(Object obj) {
        String str = this.zac.get(((Integer) obj).intValue());
        if (str == null && this.zab.containsKey("gms_unknown")) {
            return "gms_unknown";
        }
        return str;
    }

    public StringToIntConverter(int i, ArrayList<zac> arrayList) {
        this.LL = i;
        this.zab = new HashMap<>();
        this.zac = new SparseArray<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zac zacVar = (zac) ListProtector.get(arrayList, i2);
            String str = zacVar.LLILLJJLI;
            int i3 = zacVar.LLILLL;
            this.zab.put(str, Integer.valueOf(i3));
            this.zac.put(i3, str);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        ArrayList arrayList = new ArrayList();
        for (String str : this.zab.keySet()) {
            arrayList.add(new zac(str, this.zab.get(str).intValue()));
        }
        C817940W6u.LJIL(parcel, 2, arrayList, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
