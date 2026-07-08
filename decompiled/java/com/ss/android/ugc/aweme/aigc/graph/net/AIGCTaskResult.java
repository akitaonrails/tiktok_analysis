package com.ss.android.ugc.aweme.aigc.graph.net;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.aigc.graph.net.AIGCResultUrl;
import com.ss.android.ugc.aweme.aigc.graph.net.AIGCStyle;
import com.ss.android.ugc.aweme.aigc.graph.net.AIGCTaskResult;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCResultType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCTaskResult implements Parcelable {
    public static final Parcelable.Creator<AIGCTaskResult> CREATOR = new Parcelable.Creator<AIGCTaskResult>() { // from class: X.0LXC
        @Override // android.os.Parcelable.Creator
        public final AIGCTaskResult createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            AIGCResultType aIGCResultTypeValueOf;
            Long lValueOf = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(AIGCResultUrl.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(AIGCStyle.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                aIGCResultTypeValueOf = null;
            } else {
                aIGCResultTypeValueOf = AIGCResultType.valueOf(parcel.readString());
            }
            if (parcel.readInt() != 0) {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new AIGCTaskResult(arrayList, arrayList2, aIGCResultTypeValueOf, lValueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIGCTaskResult[] newArray(int i) {
            return new AIGCTaskResult[i];
        }
    };

    @C09CT("aigc_id")
    public final String aigcId;

    @C09CT("aigc_style")
    public final List<AIGCStyle> aigcStyle;

    @C09CT("create_time")
    public final Long createTime;

    @C09CT("extra")
    public final String extra;

    @C09CT("result_type")
    public final AIGCResultType resultType;

    @C09CT("result_urls")
    public final List<AIGCResultUrl> resultUrls;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCTaskResult)) {
            return false;
        }
        AIGCTaskResult aIGCTaskResult = (AIGCTaskResult) obj;
        return Intrinsics.LJFF(this.resultUrls, aIGCTaskResult.resultUrls) && Intrinsics.LJFF(this.aigcStyle, aIGCTaskResult.aigcStyle) && this.resultType == aIGCTaskResult.resultType && Intrinsics.LJFF(this.createTime, aIGCTaskResult.createTime) && Intrinsics.LJFF(this.extra, aIGCTaskResult.extra) && Intrinsics.LJFF(this.aigcId, aIGCTaskResult.aigcId);
    }

    public final int hashCode() {
        List<AIGCResultUrl> list = this.resultUrls;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<AIGCStyle> list2 = this.aigcStyle;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        AIGCResultType aIGCResultType = this.resultType;
        int iHashCode3 = (iHashCode2 + (aIGCResultType == null ? 0 : aIGCResultType.hashCode())) * 31;
        Long l = this.createTime;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.extra;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.aigcId;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCTaskResult(resultUrls=");
        sbLIZ.append(this.resultUrls);
        sbLIZ.append(", aigcStyle=");
        sbLIZ.append(this.aigcStyle);
        sbLIZ.append(", resultType=");
        sbLIZ.append(this.resultType);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.createTime);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", aigcId=");
        sbLIZ.append(this.aigcId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<AIGCResultUrl> list = this.resultUrls;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<AIGCResultUrl> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        List<AIGCStyle> list2 = this.aigcStyle;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<AIGCStyle> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        AIGCResultType aIGCResultType = this.resultType;
        if (aIGCResultType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aIGCResultType.name());
        }
        Long l = this.createTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.extra);
        parcel.writeString(this.aigcId);
    }

    public AIGCTaskResult(List<AIGCResultUrl> list, List<AIGCStyle> list2, AIGCResultType aIGCResultType, Long l, String str, String str2) {
        this.resultUrls = list;
        this.aigcStyle = list2;
        this.resultType = aIGCResultType;
        this.createTime = l;
        this.extra = str;
        this.aigcId = str2;
    }
}
