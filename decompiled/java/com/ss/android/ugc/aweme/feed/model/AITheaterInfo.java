package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AITheaterInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<AITheaterInfo> CREATOR = new Creator();

    @C09CT("cameo_ids")
    public List<String> cameoIds;

    @C09CT("cameo_infos")
    public List<CameoInfo> cameoInfo;

    @C09CT("cast_face_sel")
    public String castFaceSel;

    @C09CT("auto_generate")
    public Boolean isFirstAISelfAutoCast;

    @C09CT("is_ref_image")
    public Boolean isRefImage;

    @C09CT("orig_item_id")
    public String originItemId;

    @C09CT("prompt_id")
    public String promptId;

    @C09CT("prompt_text")
    public String promptText;

    @C09CT("root_item_id")
    public String rootItemId;

    @C09CT("task_id")
    public String taskId;

    public static final class Creator implements Parcelable.Creator<AITheaterInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AITheaterInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readInt() == 0 ? null : CameoInfo.CREATOR.createFromParcel(parcel));
                }
            }
            return new AITheaterInfo(string, arrayListCreateStringArrayList, string2, string3, string4, boolValueOf, string5, arrayList, parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AITheaterInfo[] newArray(int i) {
            return new AITheaterInfo[i];
        }
    }

    public AITheaterInfo() {
    }

    public final AITheaterInfo copy(String str, List<String> list, String str2, String str3, String str4, Boolean bool, String str5, List<CameoInfo> list2, Boolean bool2, String str6) {
        return new AITheaterInfo(str, list, str2, str3, str4, bool, str5, list2, bool2, str6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AITheaterInfo)) {
            return false;
        }
        AITheaterInfo aITheaterInfo = (AITheaterInfo) obj;
        return Intrinsics.LJFF(this.promptId, aITheaterInfo.promptId) && Intrinsics.LJFF(this.cameoIds, aITheaterInfo.cameoIds) && Intrinsics.LJFF(this.taskId, aITheaterInfo.taskId) && Intrinsics.LJFF(this.originItemId, aITheaterInfo.originItemId) && Intrinsics.LJFF(this.rootItemId, aITheaterInfo.rootItemId) && Intrinsics.LJFF(this.isRefImage, aITheaterInfo.isRefImage) && Intrinsics.LJFF(this.promptText, aITheaterInfo.promptText) && Intrinsics.LJFF(this.cameoInfo, aITheaterInfo.cameoInfo) && Intrinsics.LJFF(this.isFirstAISelfAutoCast, aITheaterInfo.isFirstAISelfAutoCast) && Intrinsics.LJFF(this.castFaceSel, aITheaterInfo.castFaceSel);
    }

    public int hashCode() {
        String str = this.promptId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.cameoIds;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.taskId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.originItemId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rootItemId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isRefImage;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.promptText;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<CameoInfo> list2 = this.cameoInfo;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool2 = this.isFirstAISelfAutoCast;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str6 = this.castFaceSel;
        return iHashCode9 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AITheaterInfo(promptId=");
        sbLIZ.append(this.promptId);
        sbLIZ.append(", cameoIds=");
        sbLIZ.append(this.cameoIds);
        sbLIZ.append(", taskId=");
        sbLIZ.append(this.taskId);
        sbLIZ.append(", originItemId=");
        sbLIZ.append(this.originItemId);
        sbLIZ.append(", rootItemId=");
        sbLIZ.append(this.rootItemId);
        sbLIZ.append(", isRefImage=");
        sbLIZ.append(this.isRefImage);
        sbLIZ.append(", promptText=");
        sbLIZ.append(this.promptText);
        sbLIZ.append(", cameoInfo=");
        sbLIZ.append(this.cameoInfo);
        sbLIZ.append(", isFirstAISelfAutoCast=");
        sbLIZ.append(this.isFirstAISelfAutoCast);
        sbLIZ.append(", castFaceSel=");
        sbLIZ.append(this.castFaceSel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.promptId);
        parcel.writeStringList(this.cameoIds);
        parcel.writeString(this.taskId);
        parcel.writeString(this.originItemId);
        parcel.writeString(this.rootItemId);
        Boolean bool = this.isRefImage;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.promptText);
        List<CameoInfo> list = this.cameoInfo;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (CameoInfo cameoInfo : list) {
                if (cameoInfo == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    cameoInfo.writeToParcel(parcel, i);
                }
            }
        }
        Boolean bool2 = this.isFirstAISelfAutoCast;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.castFaceSel);
    }

    public final List<String> getCameoIds() {
        return this.cameoIds;
    }

    public final List<CameoInfo> getCameoInfo() {
        return this.cameoInfo;
    }

    public final String getCastFaceSel() {
        return this.castFaceSel;
    }

    public final String getOriginItemId() {
        return this.originItemId;
    }

    public final String getPromptId() {
        return this.promptId;
    }

    public final String getPromptText() {
        return this.promptText;
    }

    public final String getRootItemId() {
        return this.rootItemId;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final Boolean isFirstAISelfAutoCast() {
        return this.isFirstAISelfAutoCast;
    }

    public final Boolean isRefImage() {
        return this.isRefImage;
    }

    public AITheaterInfo(String str, List<String> list, String str2, String str3, String str4, Boolean bool, String str5, List<CameoInfo> list2, Boolean bool2, String str6) {
        this.promptId = str;
        this.cameoIds = list;
        this.taskId = str2;
        this.originItemId = str3;
        this.rootItemId = str4;
        this.isRefImage = bool;
        this.promptText = str5;
        this.cameoInfo = list2;
        this.isFirstAISelfAutoCast = bool2;
        this.castFaceSel = str6;
    }
}
