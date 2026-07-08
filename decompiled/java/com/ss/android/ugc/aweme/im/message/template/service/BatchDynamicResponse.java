package com.ss.android.ugc.aweme.im.message.template.service;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.service.BatchDynamicResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BatchDynamicResponse implements Parcelable {
    public static final Parcelable.Creator<BatchDynamicResponse> CREATOR = new Parcelable.Creator<BatchDynamicResponse>() { // from class: X.06NZ
        @Override // android.os.Parcelable.Creator
        public final BatchDynamicResponse createFromParcel(Parcel parcel) {
            return new BatchDynamicResponse(parcel.readString(), parcel.readString(), (BaseTemplate) parcel.readParcelable(BatchDynamicResponse.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BatchDynamicResponse[] newArray(int i) {
            return new BatchDynamicResponse[i];
        }
    };
    public final String convId;
    public final String scene;
    public final BaseTemplate template;

    public BatchDynamicResponse() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatchDynamicResponse)) {
            return false;
        }
        BatchDynamicResponse batchDynamicResponse = (BatchDynamicResponse) obj;
        return Intrinsics.LJFF(this.convId, batchDynamicResponse.convId) && Intrinsics.LJFF(this.scene, batchDynamicResponse.scene) && Intrinsics.LJFF(this.template, batchDynamicResponse.template);
    }

    public final int hashCode() {
        String str = this.convId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.scene;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BaseTemplate baseTemplate = this.template;
        return iHashCode2 + (baseTemplate != null ? baseTemplate.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BatchDynamicResponse(convId=");
        sbLIZ.append(this.convId);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", template=");
        sbLIZ.append(this.template);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.convId);
        parcel.writeString(this.scene);
        parcel.writeParcelable(this.template, i);
    }

    public BatchDynamicResponse(String str, String str2, BaseTemplate baseTemplate) {
        this.convId = str;
        this.scene = str2;
        this.template = baseTemplate;
    }
}
