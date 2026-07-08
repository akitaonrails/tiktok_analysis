package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ReminderItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ReminderRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ReminderRequest implements Parcelable {

    @C09CT("activity_code")
    public final String activityCode;

    @C09CT("item_list")
    public final List<ReminderItem> images;
    public static final Parcelable.Creator<ReminderRequest> CREATOR = new Parcelable.Creator<ReminderRequest>() { // from class: X.0mhN
        @Override // android.os.Parcelable.Creator
        public final ReminderRequest createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ReminderItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new ReminderRequest(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ReminderRequest[] newArray(int i) {
            return new ReminderRequest[i];
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
        if (!(obj instanceof ReminderRequest)) {
            return false;
        }
        ReminderRequest reminderRequest = (ReminderRequest) obj;
        return Intrinsics.LJFF(this.activityCode, reminderRequest.activityCode) && Intrinsics.LJFF(this.images, reminderRequest.images);
    }

    public final int hashCode() {
        String str = this.activityCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ReminderItem> list = this.images;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReminderRequest(activityCode=");
        sbLIZ.append(this.activityCode);
        sbLIZ.append(", images=");
        sbLIZ.append(this.images);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.activityCode);
        List<ReminderItem> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<ReminderItem> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public ReminderRequest(String str, List<ReminderItem> list) {
        this.activityCode = str;
        this.images = list;
    }
}
