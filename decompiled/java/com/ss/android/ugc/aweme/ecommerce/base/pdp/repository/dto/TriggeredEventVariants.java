package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TriggeredEventVariants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class TriggeredEventVariants implements Parcelable {

    @C09CT("click_events")
    public final List<String> clickEvents;

    @C09CT("show_events")
    public final List<String> showEvents;
    public static final Parcelable.Creator<TriggeredEventVariants> CREATOR = new Parcelable.Creator<TriggeredEventVariants>() { // from class: X.0vib
        @Override // android.os.Parcelable.Creator
        public final TriggeredEventVariants createFromParcel(Parcel parcel) {
            return new TriggeredEventVariants(parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final TriggeredEventVariants[] newArray(int i) {
            return new TriggeredEventVariants[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TriggeredEventVariants)) {
            return false;
        }
        TriggeredEventVariants triggeredEventVariants = (TriggeredEventVariants) obj;
        return Intrinsics.LJFF(this.showEvents, triggeredEventVariants.showEvents) && Intrinsics.LJFF(this.clickEvents, triggeredEventVariants.clickEvents);
    }

    public final int hashCode() {
        List<String> list = this.showEvents;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.clickEvents;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TriggeredEventVariants(showEvents=");
        sbLIZ.append(this.showEvents);
        sbLIZ.append(", clickEvents=");
        sbLIZ.append(this.clickEvents);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.showEvents);
        parcel.writeStringList(this.clickEvents);
    }

    public TriggeredEventVariants(List<String> list, List<String> list2) {
        this.showEvents = list;
        this.clickEvents = list2;
    }
}
