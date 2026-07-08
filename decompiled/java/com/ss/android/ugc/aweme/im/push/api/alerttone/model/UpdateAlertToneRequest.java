package com.ss.android.ugc.aweme.im.push.api.alerttone.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.UpdateAlertToneData;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.UpdateAlertToneRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class UpdateAlertToneRequest implements Parcelable {
    public static final Parcelable.Creator<UpdateAlertToneRequest> CREATOR = new Parcelable.Creator<UpdateAlertToneRequest>() { // from class: X.0Yxq
        @Override // android.os.Parcelable.Creator
        public final UpdateAlertToneRequest createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(UpdateAlertToneData.CREATOR.createFromParcel(parcel));
                }
            }
            return new UpdateAlertToneRequest(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final UpdateAlertToneRequest[] newArray(int i) {
            return new UpdateAlertToneRequest[i];
        }
    };

    @C09CT("message_alerts")
    public final List<UpdateAlertToneData> alerts;

    public UpdateAlertToneRequest() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateAlertToneRequest) && Intrinsics.LJFF(this.alerts, ((UpdateAlertToneRequest) obj).alerts);
    }

    public final int hashCode() {
        List<UpdateAlertToneData> list = this.alerts;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateAlertToneRequest(alerts=");
        sbLIZ.append(this.alerts);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<UpdateAlertToneData> list = this.alerts;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<UpdateAlertToneData> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public UpdateAlertToneRequest(List<UpdateAlertToneData> list) {
        this.alerts = list;
    }
}
