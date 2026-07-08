package com.google.android.gms.location;

import X.C0W3J;
import X.C817940W6u;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new Parcelable.Creator<ActivityTransitionResult>() { // from class: X.0W3H
        @Override // android.os.Parcelable.Creator
        public final ActivityTransitionResult createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            ArrayList arrayListLJIIJJI = null;
            Bundle bundleLIZIZ = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        bundleLIZIZ = C0W6J.LIZIZ(i, parcel);
                    }
                } else {
                    arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, ActivityTransitionEvent.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new ActivityTransitionResult(bundleLIZIZ, arrayListLJIIJJI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ActivityTransitionResult[] newArray(int i) {
            return new ActivityTransitionResult[i];
        }
    };
    public final List<ActivityTransitionEvent> zza;
    public Bundle zzb;

    public ActivityTransitionResult() {
        throw null;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.zza.equals(((ActivityTransitionResult) obj).zza);
        }
        return false;
    }

    public ActivityTransitionResult(Bundle bundle, List list) {
        boolean z;
        C0W3J.LJIIIZ(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i = 1; i < list.size(); i++) {
                if (((ActivityTransitionEvent) ListProtector.get(list, i)).zzc >= ((ActivityTransitionEvent) ListProtector.get(list, i - 1)).zzc) {
                    z = true;
                } else {
                    z = false;
                }
                C0W3J.LIZIZ(z);
            }
        }
        this.zza = Collections.unmodifiableList(list);
        this.zzb = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C0W3J.LJIIIIZZ(parcel);
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIL(parcel, 1, this.zza, false);
        C817940W6u.LIZJ(parcel, 2, this.zzb);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
