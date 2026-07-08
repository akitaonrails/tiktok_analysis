package com.ss.android.ugc.aweme.im.push.api.alerttone.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneItem;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.GetAlertToneResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class GetAlertToneResponse extends BaseResponse implements Parcelable {
    public static final Parcelable.Creator<GetAlertToneResponse> CREATOR = new Parcelable.Creator<GetAlertToneResponse>() { // from class: X.0Yxy
        @Override // android.os.Parcelable.Creator
        public final GetAlertToneResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(AlertToneItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new GetAlertToneResponse(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GetAlertToneResponse[] newArray(int i) {
            return new GetAlertToneResponse[i];
        }
    };

    @C09CT("alert_tone_info")
    public final List<AlertToneItem> alertToneInfo;

    public GetAlertToneResponse() {
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
        return (obj instanceof GetAlertToneResponse) && Intrinsics.LJFF(this.alertToneInfo, ((GetAlertToneResponse) obj).alertToneInfo);
    }

    public final int hashCode() {
        List<AlertToneItem> list = this.alertToneInfo;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetAlertToneResponse(alertToneInfo=");
        sbLIZ.append(this.alertToneInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<AlertToneItem> list = this.alertToneInfo;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<AlertToneItem> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public GetAlertToneResponse(List<AlertToneItem> list) {
        this.alertToneInfo = list;
    }
}
