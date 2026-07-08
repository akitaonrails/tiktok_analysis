package com.ss.android.ugc.aweme.minis.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.MinisMeta;
import com.ss.android.ugc.aweme.minis.model.RecommendMinisMetasResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class RecommendMinisMetasResponse implements Parcelable {

    @C09CT("metas")
    public final List<MinisMeta> metas;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;
    public static final Parcelable.Creator<RecommendMinisMetasResponse> CREATOR = new Parcelable.Creator<RecommendMinisMetasResponse>() { // from class: X.0iHq
        @Override // android.os.Parcelable.Creator
        public final RecommendMinisMetasResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(MinisMeta.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new RecommendMinisMetasResponse(arrayList, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecommendMinisMetasResponse[] newArray(int i) {
            return new RecommendMinisMetasResponse[i];
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
        if (!(obj instanceof RecommendMinisMetasResponse)) {
            return false;
        }
        RecommendMinisMetasResponse recommendMinisMetasResponse = (RecommendMinisMetasResponse) obj;
        return Intrinsics.LJFF(this.metas, recommendMinisMetasResponse.metas) && Intrinsics.LJFF(this.statusCode, recommendMinisMetasResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, recommendMinisMetasResponse.statusMsg);
    }

    public final int hashCode() {
        List<MinisMeta> list = this.metas;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.statusCode;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.statusMsg;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendMinisMetasResponse(metas=");
        sbLIZ.append(this.metas);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<MinisMeta> list = this.metas;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<MinisMeta> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Integer num = this.statusCode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.statusMsg);
    }

    public RecommendMinisMetasResponse(List<MinisMeta> list, Integer num, String str) {
        this.metas = list;
        this.statusCode = num;
        this.statusMsg = str;
    }
}
