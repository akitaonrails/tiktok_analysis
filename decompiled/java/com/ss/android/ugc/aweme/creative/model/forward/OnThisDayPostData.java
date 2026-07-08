package com.ss.android.ugc.aweme.creative.model.forward;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.forward.OnThisDayPostData;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class OnThisDayPostData implements Parcelable, Serializable {
    public static final Parcelable.Creator<OnThisDayPostData> CREATOR = new Parcelable.Creator<OnThisDayPostData>() { // from class: X.0L3W
        @Override // android.os.Parcelable.Creator
        public final OnThisDayPostData createFromParcel(Parcel parcel) {
            return new OnThisDayPostData(parcel.readString(), parcel.readInt(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final OnThisDayPostData[] newArray(int i) {
            return new OnThisDayPostData[i];
        }
    };

    @C09CT("aid")
    public final String aid;

    @C09CT("recall_type")
    public final int recallType;

    @C09CT("resource_list")
    public final ArrayList<String> resList;

    public OnThisDayPostData() {
        this("", 0, null);
    }

    public final OnThisDayPostData copy(String str, int i, ArrayList<String> arrayList) {
        return new OnThisDayPostData(str, i, arrayList);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnThisDayPostData)) {
            return false;
        }
        OnThisDayPostData onThisDayPostData = (OnThisDayPostData) obj;
        return Intrinsics.LJFF(this.aid, onThisDayPostData.aid) && this.recallType == onThisDayPostData.recallType && Intrinsics.LJFF(this.resList, onThisDayPostData.resList);
    }

    public int hashCode() {
        int iHashCode = ((this.aid.hashCode() * 31) + this.recallType) * 31;
        ArrayList<String> arrayList = this.resList;
        return iHashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnThisDayPostData(aid=");
        sbLIZ.append(this.aid);
        sbLIZ.append(", recallType=");
        sbLIZ.append(this.recallType);
        sbLIZ.append(", resList=");
        sbLIZ.append(this.resList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.aid);
        parcel.writeInt(this.recallType);
        parcel.writeStringList(this.resList);
    }

    public final String getAid() {
        return this.aid;
    }

    public final int getRecallType() {
        return this.recallType;
    }

    public final ArrayList<String> getResList() {
        return this.resList;
    }

    public OnThisDayPostData(String str, int i, ArrayList<String> arrayList) {
        this.aid = str;
        this.recallType = i;
        this.resList = arrayList;
    }
}
