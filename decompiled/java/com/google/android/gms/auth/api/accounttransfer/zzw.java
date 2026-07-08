package com.google.android.gms.auth.api.accounttransfer;

import X.C817940W6u;
import X.C835410Wpv;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzw;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class zzw extends zzbz {
    public static final Parcelable.Creator<zzw> CREATOR = new Parcelable.Creator() { // from class: X.0W64
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            HashSet hashSet = new HashSet();
            String strLJII = null;
            int iLJIJJLI = 0;
            byte[] bArrLIZJ = null;
            PendingIntent pendingIntent = null;
            DeviceMetaData deviceMetaData = null;
            int iLJIJJLI2 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 1:
                        iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                        hashSet.add(1);
                        break;
                    case 2:
                        strLJII = C0W6J.LJII(i, parcel);
                        hashSet.add(2);
                        break;
                    case 3:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        hashSet.add(3);
                        break;
                    case 4:
                        bArrLIZJ = C0W6J.LIZJ(i, parcel);
                        hashSet.add(4);
                        break;
                    case 5:
                        pendingIntent = (PendingIntent) C0W6J.LJI(parcel, i, PendingIntent.CREATOR);
                        hashSet.add(5);
                        break;
                    case 6:
                        deviceMetaData = (DeviceMetaData) C0W6J.LJI(parcel, i, DeviceMetaData.CREATOR);
                        hashSet.add(6);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            if (parcel.dataPosition() == iLJJIII) {
                return new zzw(hashSet, iLJIJJLI2, strLJII, iLJIJJLI, bArrLIZJ, pendingIntent, deviceMetaData);
            }
            throw new C816410W0x("Overread allowed size end=" + iLJJIII, parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzw[i];
        }
    };
    public static final HashMap zzc;
    public final Set LL;
    public final int LLILLJJLI;
    public String zzd;
    public int zze;
    public byte[] zzf;
    public PendingIntent zzg;
    public DeviceMetaData zzh;

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map LIZ() {
        return zzc;
    }

    static {
        HashMap map = new HashMap();
        zzc = map;
        map.put("accountType", new FastJsonResponse.Field(7, false, 7, false, "accountType", 2, null));
        map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, new FastJsonResponse.Field(0, false, 0, false, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 3, null));
        map.put("transferBytes", new FastJsonResponse.Field(8, false, 8, false, "transferBytes", 4, null));
    }

    public zzw() {
        this.LL = new C835410Wpv(3);
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
                return Integer.valueOf(this.zze);
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
            C817940W6u.LJIJ(parcel, 2, this.zzd, true);
        }
        if (set.contains(3)) {
            C817940W6u.LJIIJ(parcel, 3, this.zze);
        }
        if (set.contains(4)) {
            C817940W6u.LJ(parcel, 4, this.zzf, true);
        }
        if (set.contains(5)) {
            C817940W6u.LJIIZILJ(parcel, 5, this.zzg, i, true);
        }
        if (set.contains(6)) {
            C817940W6u.LJIIZILJ(parcel, 6, this.zzh, i, true);
        }
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public zzw(Set set, int i, String str, int i2, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.LL = set;
        this.LLILLJJLI = i;
        this.zzd = str;
        this.zze = i2;
        this.zzf = bArr;
        this.zzg = pendingIntent;
        this.zzh = deviceMetaData;
    }
}
