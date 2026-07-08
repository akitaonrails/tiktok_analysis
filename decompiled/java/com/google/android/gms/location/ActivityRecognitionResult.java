package com.google.android.gms.location;

import X.C0W0T;
import X.C0W3J;
import X.C817940W6u;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new Parcelable.Creator<ActivityRecognitionResult>() { // from class: X.0W0B
        @Override // android.os.Parcelable.Creator
        public final ActivityRecognitionResult createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            ArrayList arrayListLJIIJJI = null;
            Bundle bundleLIZIZ = null;
            long jLJJ = 0;
            long jLJJ2 = 0;
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
                                    bundleLIZIZ = C0W6J.LIZIZ(i, parcel);
                                }
                            } else {
                                iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                            }
                        } else {
                            jLJJ2 = C0W6J.LJJ(i, parcel);
                        }
                    } else {
                        jLJJ = C0W6J.LJJ(i, parcel);
                    }
                } else {
                    arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, DetectedActivity.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new ActivityRecognitionResult(arrayListLJIIJJI, jLJJ, jLJJ2, iLJIJJLI, bundleLIZIZ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ActivityRecognitionResult[] newArray(int i) {
            return new ActivityRecognitionResult[i];
        }
    };
    public final int LL;
    public final Bundle LLILLJJLI;
    public List<DetectedActivity> zza;
    public long zzb;
    public long zzc;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zzb), Long.valueOf(this.zzc), Integer.valueOf(this.LL), this.zza, this.LLILLJJLI});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zza);
        long j = this.zzb;
        long j2 = this.zzc;
        StringBuilder sb = new StringBuilder(strValueOf.length() + 124);
        sb.append("ActivityRecognitionResult [probableActivities=");
        sb.append(strValueOf);
        sb.append(", timeMillis=");
        sb.append(j);
        sb.append(", elapsedRealtimeMillis=");
        sb.append(j2);
        sb.append(e3.f);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            if (this.zzb == activityRecognitionResult.zzb && this.zzc == activityRecognitionResult.zzc && this.LL == activityRecognitionResult.LL && C0W0T.LIZIZ(this.zza, activityRecognitionResult.zza) && LJLZ(this.LLILLJJLI, activityRecognitionResult.LLILLJJLI)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJLZ(Bundle bundle, Bundle bundle2) {
        Object obj;
        int length;
        if (bundle == null) {
            if (bundle2 == null) {
                return true;
            }
            return false;
        }
        if (bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            Object obj2 = null;
            try {
                obj = bundle.get(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj = null;
            }
            try {
                obj2 = bundle2.get(str);
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            } catch (OutOfMemoryError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            if (obj == null) {
                if (obj2 != null) {
                    return false;
                }
            } else if (obj instanceof Bundle) {
                if (!LJLZ(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else {
                if (obj.getClass().isArray()) {
                    if (obj2 != null && obj2.getClass().isArray() && (length = Array.getLength(obj)) == Array.getLength(obj2)) {
                        for (int i = 0; i < length; i++) {
                            if (C0W0T.LIZIZ(Array.get(obj, i), Array.get(obj2, i))) {
                            }
                        }
                    }
                    return false;
                }
                if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIL(parcel, 1, this.zza, false);
        C817940W6u.LJIILJJIL(2, this.zzb, parcel);
        C817940W6u.LJIILJJIL(3, this.zzc, parcel);
        C817940W6u.LJIIJ(parcel, 4, this.LL);
        C817940W6u.LIZJ(parcel, 5, this.LLILLJJLI);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public ActivityRecognitionResult(List<DetectedActivity> list, long j, long j2, int i, Bundle bundle) {
        boolean z;
        if (list != null && list.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        C0W3J.LIZ("Must have at least 1 detected activity", z);
        C0W3J.LIZ("Must set times", j > 0 && j2 > 0);
        this.zza = list;
        this.zzb = j;
        this.zzc = j2;
        this.LL = i;
        this.LLILLJJLI = bundle;
    }
}
