package com.ss.android.ugc.aweme.setting.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.setting.model.UpdateSmsConsentStatusRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UpdateSmsConsentStatusRequest implements Parcelable {

    @C09CT("fields")
    public final List<SmsSettingItem> fields;
    public static final Parcelable.Creator<UpdateSmsConsentStatusRequest> CREATOR = new Parcelable.Creator<UpdateSmsConsentStatusRequest>() { // from class: X.02td
        @Override // android.os.Parcelable.Creator
        public final UpdateSmsConsentStatusRequest createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readSerializable());
            }
            return new UpdateSmsConsentStatusRequest(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final UpdateSmsConsentStatusRequest[] newArray(int i) {
            return new UpdateSmsConsentStatusRequest[i];
        }
    };
    public static final int $stable = 8;

    public UpdateSmsConsentStatusRequest() {
        this(null, 1, null);
    }

    public final UpdateSmsConsentStatusRequest copy(List<SmsSettingItem> list) {
        return new UpdateSmsConsentStatusRequest(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateSmsConsentStatusRequest) && Intrinsics.LJFF(this.fields, ((UpdateSmsConsentStatusRequest) obj).fields);
    }

    public int hashCode() {
        return this.fields.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateSmsConsentStatusRequest(fields=");
        sbLIZ.append(this.fields);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<SmsSettingItem> list = this.fields;
        parcel.writeInt(list.size());
        Iterator<SmsSettingItem> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeSerializable(it2.next());
        }
    }

    public final List<SmsSettingItem> getFields() {
        return this.fields;
    }

    public UpdateSmsConsentStatusRequest(List<SmsSettingItem> list) {
        this.fields = list;
    }

    public UpdateSmsConsentStatusRequest(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
