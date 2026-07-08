package com.ss.android.ugc.aweme.socialavatar.network;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.aigc.AIGCStyle;
import com.ss.android.ugc.aweme.socialavatar.network.AIGCResultType;
import com.ss.android.ugc.aweme.socialavatar.network.AIGCResultUrl;
import com.ss.android.ugc.aweme.socialavatar.network.AIGCTaskResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCTaskResult implements Parcelable {

    @C09CT("aigc_id")
    public final String aigcId;

    @C09CT("aigc_style")
    public final AIGCStyle aigcStyle;

    @C09CT("create_time")
    public final Long createTime;

    @C09CT("extra")
    public final String extra;

    @C09CT("result_type")
    public final AIGCResultType resultType;

    @C09CT("result_urls")
    public final List<AIGCResultUrl> resultUrls;
    public static final Parcelable.Creator<AIGCTaskResult> CREATOR = new Parcelable.Creator<AIGCTaskResult>() { // from class: X.0LXG
        @Override // android.os.Parcelable.Creator
        public final AIGCTaskResult createFromParcel(Parcel parcel) {
            ArrayList arrayList;
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
            AIGCStyle aIGCStyle = (AIGCStyle) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                aIGCResultTypeValueOf = null;
            } else {
                aIGCResultTypeValueOf = AIGCResultType.valueOf(parcel.readString());
            }
            if (parcel.readInt() != 0) {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new AIGCTaskResult(arrayList, aIGCStyle, aIGCResultTypeValueOf, lValueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIGCTaskResult[] newArray(int i) {
            return new AIGCTaskResult[i];
        }
    };
    public static final int $stable = 8;

    public final AIGCTaskResult copy(List<AIGCResultUrl> list, AIGCStyle aIGCStyle, AIGCResultType aIGCResultType, Long l, String str, String str2) {
        return new AIGCTaskResult(list, aIGCStyle, aIGCResultType, l, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCTaskResult)) {
            return false;
        }
        AIGCTaskResult aIGCTaskResult = (AIGCTaskResult) obj;
        return Intrinsics.LJFF(this.resultUrls, aIGCTaskResult.resultUrls) && Intrinsics.LJFF(this.aigcStyle, aIGCTaskResult.aigcStyle) && this.resultType == aIGCTaskResult.resultType && Intrinsics.LJFF(this.createTime, aIGCTaskResult.createTime) && Intrinsics.LJFF(this.extra, aIGCTaskResult.extra) && Intrinsics.LJFF(this.aigcId, aIGCTaskResult.aigcId);
    }

    public int hashCode() {
        List<AIGCResultUrl> list = this.resultUrls;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        AIGCStyle aIGCStyle = this.aigcStyle;
        int iHashCode2 = (iHashCode + (aIGCStyle == null ? 0 : aIGCStyle.hashCode())) * 31;
        AIGCResultType aIGCResultType = this.resultType;
        int iHashCode3 = (iHashCode2 + (aIGCResultType == null ? 0 : aIGCResultType.hashCode())) * 31;
        Long l = this.createTime;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.extra;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.aigcId;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
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
        parcel.writeSerializable(this.aigcStyle);
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

    public final String getAigcId() {
        return this.aigcId;
    }

    public final AIGCStyle getAigcStyle() {
        return this.aigcStyle;
    }

    public final Long getCreateTime() {
        return this.createTime;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final AIGCResultType getResultType() {
        return this.resultType;
    }

    public final List<AIGCResultUrl> getResultUrls() {
        return this.resultUrls;
    }

    public AIGCTaskResult(List<AIGCResultUrl> list, AIGCStyle aIGCStyle, AIGCResultType aIGCResultType, Long l, String str, String str2) {
        this.resultUrls = list;
        this.aigcStyle = aIGCStyle;
        this.resultType = aIGCResultType;
        this.createTime = l;
        this.extra = str;
        this.aigcId = str2;
    }
}
