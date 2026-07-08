package com.google.android.gms.auth.api.accounttransfer;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.zzu;
import com.google.android.gms.auth.api.accounttransfer.zzw;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class zzu extends zzbz {
    public static final Parcelable.Creator<zzu> CREATOR = new Parcelable.Creator() { // from class: X.0W66
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            HashSet hashSet = new HashSet();
            zzw zzwVar = null;
            String strLJII = null;
            String strLJII2 = null;
            String strLJII3 = null;
            int iLJIJJLI = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                if (c != 5) {
                                    C0W6J.LJJII(i, parcel);
                                } else {
                                    strLJII3 = C0W6J.LJII(i, parcel);
                                    hashSet.add(5);
                                }
                            } else {
                                strLJII2 = C0W6J.LJII(i, parcel);
                                hashSet.add(4);
                            }
                        } else {
                            strLJII = C0W6J.LJII(i, parcel);
                            hashSet.add(3);
                        }
                    } else {
                        zzwVar = (zzw) C0W6J.LJI(parcel, i, zzw.CREATOR);
                        hashSet.add(2);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                    hashSet.add(1);
                }
            }
            if (parcel.dataPosition() == iLJJIII) {
                return new zzu(hashSet, iLJIJJLI, zzwVar, strLJII, strLJII2, strLJII3);
            }
            throw new C816410W0x("Overread allowed size end=" + iLJJIII, parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzu[i];
        }
    };
    public static final HashMap zzc;
    public final Set LL;
    public final int LLILLJJLI;
    public zzw zzd;
    public String zze;
    public String zzf;
    public String zzg;

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map LIZ() {
        return zzc;
    }

    static {
        HashMap map = new HashMap();
        zzc = map;
        map.put("authenticatorInfo", new FastJsonResponse.Field(11, false, 11, false, "authenticatorInfo", 2, zzw.class));
        map.put("signature", new FastJsonResponse.Field(7, false, 7, false, "signature", 3, null));
        map.put("package", new FastJsonResponse.Field(7, false, 7, false, "package", 4, null));
    }

    public zzu() {
        this.LL = new HashSet(3);
        this.LLILLJJLI = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object LIZIZ(FastJsonResponse.Field field) {
        int i = field.zaf;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return this.zzf;
                    }
                    throw new IllegalStateException("Unknown SafeParcelable id=" + field.zaf);
                }
                return this.zze;
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
            C817940W6u.LJIIZILJ(parcel, 2, this.zzd, i, true);
        }
        if (set.contains(3)) {
            C817940W6u.LJIJ(parcel, 3, this.zze, true);
        }
        if (set.contains(4)) {
            C817940W6u.LJIJ(parcel, 4, this.zzf, true);
        }
        if (set.contains(5)) {
            C817940W6u.LJIJ(parcel, 5, this.zzg, true);
        }
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzu(Set set, int i, zzw zzwVar, String str, String str2, String str3) {
        this.LL = set;
        this.LLILLJJLI = i;
        this.zzd = zzwVar;
        this.zze = str;
        this.zzf = str2;
        this.zzg = str3;
    }
}
