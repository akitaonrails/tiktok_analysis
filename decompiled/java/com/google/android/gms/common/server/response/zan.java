package com.google.android.gms.common.server.response;

import X.C0W3J;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.zal;
import com.google.android.gms.common.server.response.zan;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new Parcelable.Creator<zan>() { // from class: X.0W6F
        @Override // android.os.Parcelable.Creator
        public final zan createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            ArrayList arrayListLJIIJJI = null;
            String strLJII = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            strLJII = C0W6J.LJII(i, parcel);
                        }
                    } else {
                        arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, zal.CREATOR);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new zan(strLJII, iLJIJJLI, arrayListLJIIJJI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ zan[] newArray(int i) {
            return new zan[i];
        }
    };
    public final int LL;
    public final HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> zab;
    public final String zac;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.zab.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map<String, FastJsonResponse.Field<?, ?>> map = this.zab.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    public final Map<String, FastJsonResponse.Field<?, ?>> LJLZ(String str) {
        return this.zab.get(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        ArrayList arrayList = new ArrayList();
        for (String str : this.zab.keySet()) {
            arrayList.add(new zal(str, this.zab.get(str)));
        }
        C817940W6u.LJIL(parcel, 2, arrayList, false);
        C817940W6u.LJIJ(parcel, 3, this.zac, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zan(String str, int i, ArrayList arrayList) {
        this.LL = i;
        HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> map = new HashMap<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zalVar = (zal) ListProtector.get(arrayList, i2);
            String str2 = zalVar.LLILLJJLI;
            HashMap map2 = new HashMap();
            ArrayList<zam> arrayList2 = zalVar.LLILLL;
            C0W3J.LJIIIIZZ(arrayList2);
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zamVar = (zam) ListProtector.get(zalVar.LLILLL, i3);
                map2.put(zamVar.LLILLJJLI, zamVar.LLILLL);
            }
            map.put(str2, map2);
        }
        this.zab = map;
        C0W3J.LJIIIIZZ(str);
        this.zac = str;
        Iterator<String> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            Map<String, FastJsonResponse.Field<?, ?>> map3 = this.zab.get(it2.next());
            Iterator<String> it3 = map3.keySet().iterator();
            while (it3.hasNext()) {
                map3.get(it3.next()).zaj = this;
            }
        }
    }
}
