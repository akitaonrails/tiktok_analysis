package com.ss.android.ugc.aweme.unifiedauth.push.tracking.api;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.unifiedauth.push.tracking.api.UploadPopupEventsRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UploadPopupEventsRequest implements Parcelable {
    public static final Parcelable.Creator<UploadPopupEventsRequest> CREATOR = new Parcelable.Creator<UploadPopupEventsRequest>() { // from class: X.02sm
        @Override // android.os.Parcelable.Creator
        public final UploadPopupEventsRequest createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readSerializable());
            }
            return new UploadPopupEventsRequest(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final UploadPopupEventsRequest[] newArray(int i) {
            return new UploadPopupEventsRequest[i];
        }
    };

    @C09CT("data")
    public final List<PopupEvent> records;

    public final UploadPopupEventsRequest copy(List<PopupEvent> list) {
        return new UploadPopupEventsRequest(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UploadPopupEventsRequest) && Intrinsics.LJFF(this.records, ((UploadPopupEventsRequest) obj).records);
    }

    public int hashCode() {
        return this.records.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadPopupEventsRequest(records=");
        sbLIZ.append(this.records);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<PopupEvent> list = this.records;
        parcel.writeInt(list.size());
        Iterator<PopupEvent> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeSerializable(it2.next());
        }
    }

    public final List<PopupEvent> getRecords() {
        return this.records;
    }

    public UploadPopupEventsRequest(List<PopupEvent> list) {
        this.records = list;
    }
}
