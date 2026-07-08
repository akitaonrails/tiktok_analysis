package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AIRemixInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<AIRemixInfo> CREATOR = new Creator();

    @C09CT("cameo_ids")
    public List<String> cameoIds;

    @C09CT("cameo_infos")
    public List<CameoInfo> cameoInfos;

    @C09CT("airemix_first_gid")
    public String firstGid;

    @C09CT("airemix_gameplay")
    public String gamePlay;

    @C09CT("has_entrance")
    public Boolean hasEntrance;

    @C09CT("is_ref_image")
    public boolean isRefImage;

    @C09CT("prompt_id")
    public String promptId;

    @C09CT("prompt_source")
    public String promptSource;

    @C09CT("task_id")
    public String taskId;

    public static final class Creator implements Parcelable.Creator<AIRemixInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AIRemixInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(CameoInfo.CREATOR.createFromParcel(parcel));
                }
            }
            return new AIRemixInfo(boolValueOf, string, string2, arrayListCreateStringArrayList, string3, string4, z, string5, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AIRemixInfo[] newArray(int i) {
            return new AIRemixInfo[i];
        }
    }

    public AIRemixInfo() {
        this(null, null, null, null, null, null, false, null, null);
    }

    public final AIRemixInfo copy(Boolean bool, String str, String str2, List<String> list, String str3, String str4, boolean z, String str5, List<CameoInfo> list2) {
        return new AIRemixInfo(bool, str, str2, list, str3, str4, z, str5, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIRemixInfo)) {
            return false;
        }
        AIRemixInfo aIRemixInfo = (AIRemixInfo) obj;
        return Intrinsics.LJFF(this.hasEntrance, aIRemixInfo.hasEntrance) && Intrinsics.LJFF(this.promptId, aIRemixInfo.promptId) && Intrinsics.LJFF(this.taskId, aIRemixInfo.taskId) && Intrinsics.LJFF(this.cameoIds, aIRemixInfo.cameoIds) && Intrinsics.LJFF(this.firstGid, aIRemixInfo.firstGid) && Intrinsics.LJFF(this.gamePlay, aIRemixInfo.gamePlay) && this.isRefImage == aIRemixInfo.isRefImage && Intrinsics.LJFF(this.promptSource, aIRemixInfo.promptSource) && Intrinsics.LJFF(this.cameoInfos, aIRemixInfo.cameoInfos);
    }

    public int hashCode() {
        Boolean bool = this.hasEntrance;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.promptId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.taskId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.cameoIds;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.firstGid;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.gamePlay;
        int iHashCode6 = (((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + C786410Ut5.Z2(this.isRefImage)) * 31;
        String str5 = this.promptSource;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<CameoInfo> list2 = this.cameoInfos;
        return iHashCode7 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIRemixInfo(hasEntrance=");
        sbLIZ.append(this.hasEntrance);
        sbLIZ.append(", promptId=");
        sbLIZ.append(this.promptId);
        sbLIZ.append(", taskId=");
        sbLIZ.append(this.taskId);
        sbLIZ.append(", cameoIds=");
        sbLIZ.append(this.cameoIds);
        sbLIZ.append(", firstGid=");
        sbLIZ.append(this.firstGid);
        sbLIZ.append(", gamePlay=");
        sbLIZ.append(this.gamePlay);
        sbLIZ.append(", isRefImage=");
        sbLIZ.append(this.isRefImage);
        sbLIZ.append(", promptSource=");
        sbLIZ.append(this.promptSource);
        sbLIZ.append(", cameoInfos=");
        sbLIZ.append(this.cameoInfos);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.hasEntrance;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.promptId);
        parcel.writeString(this.taskId);
        parcel.writeStringList(this.cameoIds);
        parcel.writeString(this.firstGid);
        parcel.writeString(this.gamePlay);
        parcel.writeInt(this.isRefImage ? 1 : 0);
        parcel.writeString(this.promptSource);
        List<CameoInfo> list = this.cameoInfos;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<CameoInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public final List<String> getCameoIds() {
        return this.cameoIds;
    }

    public final List<CameoInfo> getCameoInfos() {
        return this.cameoInfos;
    }

    public final String getFirstGid() {
        return this.firstGid;
    }

    public final String getGamePlay() {
        return this.gamePlay;
    }

    public final Boolean getHasEntrance() {
        return this.hasEntrance;
    }

    public final String getPromptId() {
        return this.promptId;
    }

    public final String getPromptSource() {
        return this.promptSource;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final boolean isRefImage() {
        return this.isRefImage;
    }

    public final void setCameoIds(List<String> list) {
        this.cameoIds = list;
    }

    public final void setHasEntrance(Boolean bool) {
        this.hasEntrance = bool;
    }

    public final void setPromptId(String str) {
        this.promptId = str;
    }

    public final void setTaskId(String str) {
        this.taskId = str;
    }

    public AIRemixInfo(Boolean bool, String str, String str2, List<String> list, String str3, String str4, boolean z, String str5, List<CameoInfo> list2) {
        this.hasEntrance = bool;
        this.promptId = str;
        this.taskId = str2;
        this.cameoIds = list;
        this.firstGid = str3;
        this.gamePlay = str4;
        this.isRefImage = z;
        this.promptSource = str5;
        this.cameoInfos = list2;
    }
}
