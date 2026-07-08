package com.ss.android.ugc.aweme.minis.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.minis.model.MinisMetaBulkResponse;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class MinisMetaBulkResponse extends BaseResponse implements Parcelable {

    @C09CT("meta_infos")
    public final List<MinisMetaResp> metaInfos;
    public static final Parcelable.Creator<MinisMetaBulkResponse> CREATOR = new Parcelable.Creator<MinisMetaBulkResponse>() { // from class: X.0hva
        @Override // android.os.Parcelable.Creator
        public final MinisMetaBulkResponse createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(MinisMetaResp.CREATOR.createFromParcel(parcel));
            }
            return new MinisMetaBulkResponse(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MinisMetaBulkResponse[] newArray(int i) {
            return new MinisMetaBulkResponse[i];
        }
    };
    public static final int $stable = 8;

    public MinisMetaBulkResponse() {
        this(null, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MinisMetaBulkResponse) && Intrinsics.LJFF(this.metaInfos, ((MinisMetaBulkResponse) obj).metaInfos);
    }

    public final int hashCode() {
        return this.metaInfos.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisMetaBulkResponse(metaInfos=");
        sbLIZ.append(this.metaInfos);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<MinisMetaResp> list = this.metaInfos;
        parcel.writeInt(list.size());
        Iterator<MinisMetaResp> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public MinisMetaBulkResponse(List<MinisMetaResp> list) {
        this.metaInfos = list;
    }

    public MinisMetaBulkResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
