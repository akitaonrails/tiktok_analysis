package com.google.android.gms.location;

import X.C0W0T;
import X.C0W3J;
import X.C786410Ut5;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes14.dex */
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new Parcelable.Creator<ActivityTransitionRequest>() { // from class: X.0W3r
        @Override // android.os.Parcelable.Creator
        public final ActivityTransitionRequest createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            ArrayList arrayListLJIIJJI = null;
            String strLJII = null;
            ArrayList arrayListLJIIJJI2 = null;
            String strLJII2 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                strLJII2 = C0W6J.LJII(i, parcel);
                            }
                        } else {
                            arrayListLJIIJJI2 = C0W6J.LJIIJJI(parcel, i, ClientIdentity.CREATOR);
                        }
                    } else {
                        strLJII = C0W6J.LJII(i, parcel);
                    }
                } else {
                    arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, ActivityTransition.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new ActivityTransitionRequest(arrayListLJIIJJI, strLJII, arrayListLJIIJJI2, strLJII2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ActivityTransitionRequest[] newArray(int i) {
            return new ActivityTransitionRequest[i];
        }
    };
    public static final Comparator<ActivityTransition> IS_SAME_TRANSITION = new Comparator<ActivityTransition>() { // from class: X.0W3s
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(ActivityTransition activityTransition, ActivityTransition activityTransition2) {
            ActivityTransition activityTransition3 = activityTransition;
            ActivityTransition activityTransition4 = activityTransition2;
            C0W3J.LJIIIIZZ(activityTransition3);
            C0W3J.LJIIIIZZ(activityTransition4);
            int i = activityTransition3.zza;
            int i2 = activityTransition4.zza;
            if (i != i2) {
                if (i < i2) {
                    return -1;
                }
                return 1;
            }
            int i3 = activityTransition3.zzb;
            int i4 = activityTransition4.zzb;
            if (i3 == i4) {
                return 0;
            }
            if (i3 < i4) {
                return -1;
            }
            return 1;
        }
    };
    public final List<ActivityTransition> zza;
    public final String zzb;
    public final List<ClientIdentity> zzc;
    public String zzd;

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() * 31;
        String str = this.zzb;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<ClientIdentity> list = this.zzc;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.zzd;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zza);
        String str = this.zzb;
        String strValueOf2 = String.valueOf(this.zzc);
        String str2 = this.zzd;
        int length = strValueOf.length();
        int length2 = String.valueOf(str).length();
        int length3 = strValueOf2.length();
        StringBuilder sb = new StringBuilder(length + 79 + length2 + length3 + String.valueOf(str2).length());
        sb.append("ActivityTransitionRequest [mTransitions=");
        sb.append(strValueOf);
        sb.append(", mTag='");
        sb.append(str);
        sb.append("', mClients=");
        sb.append(strValueOf2);
        sb.append(", mAttributionTag=");
        sb.append(str2);
        sb.append(']');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            if (C0W0T.LIZIZ(this.zza, activityTransitionRequest.zza) && C0W0T.LIZIZ(this.zzb, activityTransitionRequest.zzb) && C0W0T.LIZIZ(this.zzd, activityTransitionRequest.zzd) && C0W0T.LIZIZ(this.zzc, activityTransitionRequest.zzc)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C0W3J.LJIIIIZZ(parcel);
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIL(parcel, 1, this.zza, false);
        C817940W6u.LJIJ(parcel, 2, this.zzb, false);
        C817940W6u.LJIL(parcel, 3, this.zzc, false);
        C817940W6u.LJIJ(parcel, 4, this.zzd, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public ActivityTransitionRequest(List<ActivityTransition> list, String str, List<ClientIdentity> list2, String str2) {
        boolean z;
        List<ClientIdentity> listUnmodifiableList;
        C0W3J.LJIIIZ(list, "transitions can't be null");
        if (list.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        C0W3J.LIZ("transitions can't be empty.", z);
        TreeSet treeSet = new TreeSet(IS_SAME_TRANSITION);
        for (ActivityTransition activityTransition : list) {
            C0W3J.LIZ(C786410Ut5.j4("Found duplicated transition: %s.", new Object[]{activityTransition}), treeSet.add(activityTransition));
        }
        this.zza = Collections.unmodifiableList(list);
        this.zzb = str;
        if (list2 == null) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(list2);
        }
        this.zzc = listUnmodifiableList;
        this.zzd = str2;
    }
}
