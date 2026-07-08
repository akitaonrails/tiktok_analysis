package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AIPortraitInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<AIPortraitInfo> CREATOR = new Creator();

    @C09CT("actor_view_auth")
    public String actorViewAuth;

    @C09CT("cameo_ids")
    public List<String> cameoIds;

    @C09CT("cameo_infos")
    public List<AIPortraitCameoInfo> cameoInfo;

    @C09CT("cast_uids")
    public List<Long> castUids;

    @C09CT("image_ai_index_list")
    public List<Long> imageAIIndexList;

    @C09CT("last_face_id_act_chnl")
    public String lastFaceIdActChnl;

    @C09CT("last_face_id_act_func")
    public String lastFaceIdActFunc;

    @C09CT("orig_item_id")
    public Long origItemId;

    @C09CT("orig_prompt_id")
    public String origPromptId;

    @C09CT("prompt_id")
    public String promptId;

    @C09CT("root_item_id")
    public Long rootItemId;

    @C09CT("root_prompt_id")
    public String rootPromptId;

    @C09CT("task_id")
    public String taskId;

    public static final class Creator implements Parcelable.Creator<AIPortraitInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AIPortraitInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList arrayList3 = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(Long.valueOf(parcel.readLong()));
                }
            }
            if (parcel.readInt() != 0) {
                int i5 = parcel.readInt();
                arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(AIPortraitCameoInfo.CREATOR.createFromParcel(parcel));
                }
            }
            return new AIPortraitInfo(string, string2, lValueOf, lValueOf2, arrayList, arrayListCreateStringArrayList, string3, string4, arrayList2, arrayList3, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AIPortraitInfo[] newArray(int i) {
            return new AIPortraitInfo[i];
        }
    }

    public AIPortraitInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final AIPortraitInfo copy(String str, String str2, Long l, Long l2, List<Long> list, List<String> list2, String str3, String str4, List<Long> list3, List<AIPortraitCameoInfo> list4, String str5, String str6, String str7) {
        return new AIPortraitInfo(str, str2, l, l2, list, list2, str3, str4, list3, list4, str5, str6, str7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIPortraitInfo)) {
            return false;
        }
        AIPortraitInfo aIPortraitInfo = (AIPortraitInfo) obj;
        return Intrinsics.LJFF(this.promptId, aIPortraitInfo.promptId) && Intrinsics.LJFF(this.taskId, aIPortraitInfo.taskId) && Intrinsics.LJFF(this.rootItemId, aIPortraitInfo.rootItemId) && Intrinsics.LJFF(this.origItemId, aIPortraitInfo.origItemId) && Intrinsics.LJFF(this.castUids, aIPortraitInfo.castUids) && Intrinsics.LJFF(this.cameoIds, aIPortraitInfo.cameoIds) && Intrinsics.LJFF(this.origPromptId, aIPortraitInfo.origPromptId) && Intrinsics.LJFF(this.rootPromptId, aIPortraitInfo.rootPromptId) && Intrinsics.LJFF(this.imageAIIndexList, aIPortraitInfo.imageAIIndexList) && Intrinsics.LJFF(this.cameoInfo, aIPortraitInfo.cameoInfo) && Intrinsics.LJFF(this.lastFaceIdActChnl, aIPortraitInfo.lastFaceIdActChnl) && Intrinsics.LJFF(this.lastFaceIdActFunc, aIPortraitInfo.lastFaceIdActFunc) && Intrinsics.LJFF(this.actorViewAuth, aIPortraitInfo.actorViewAuth);
    }

    public int hashCode() {
        String str = this.promptId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.taskId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.rootItemId;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.origItemId;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List<Long> list = this.castUids;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.cameoIds;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.origPromptId;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rootPromptId;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<Long> list3 = this.imageAIIndexList;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<AIPortraitCameoInfo> list4 = this.cameoInfo;
        int iHashCode10 = (iHashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str5 = this.lastFaceIdActChnl;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.lastFaceIdActFunc;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.actorViewAuth;
        return iHashCode12 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "AIPortraitInfo(promptId=" + this.promptId + ", taskId=" + this.taskId + ", rootItemId=" + this.rootItemId + ", origItemId=" + this.origItemId + ", castUids=" + this.castUids + ", cameoIds=" + this.cameoIds + ", origPromptId=" + this.origPromptId + ", rootPromptId=" + this.rootPromptId + ", imageAIIndexList=" + this.imageAIIndexList + ", cameoInfo=" + this.cameoInfo + ", lastFaceIdActChnl=" + this.lastFaceIdActChnl + ", lastFaceIdActFunc=" + this.lastFaceIdActFunc + ", actorViewAuth=" + this.actorViewAuth + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.promptId);
        parcel.writeString(this.taskId);
        Long l = this.rootItemId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.origItemId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        List<Long> list = this.castUids;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Long> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeLong(it2.next().longValue());
            }
        }
        parcel.writeStringList(this.cameoIds);
        parcel.writeString(this.origPromptId);
        parcel.writeString(this.rootPromptId);
        List<Long> list2 = this.imageAIIndexList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<Long> it3 = list2.iterator();
            while (it3.hasNext()) {
                parcel.writeLong(it3.next().longValue());
            }
        }
        List<AIPortraitCameoInfo> list3 = this.cameoInfo;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<AIPortraitCameoInfo> it4 = list3.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.lastFaceIdActChnl);
        parcel.writeString(this.lastFaceIdActFunc);
        parcel.writeString(this.actorViewAuth);
    }

    public final String getActorViewAuth() {
        return this.actorViewAuth;
    }

    public final List<String> getCameoIds() {
        return this.cameoIds;
    }

    public final List<AIPortraitCameoInfo> getCameoInfo() {
        return this.cameoInfo;
    }

    public final List<Long> getCastUids() {
        return this.castUids;
    }

    public final List<Long> getImageAIIndexList() {
        return this.imageAIIndexList;
    }

    public final String getLastFaceIdActChnl() {
        return this.lastFaceIdActChnl;
    }

    public final String getLastFaceIdActFunc() {
        return this.lastFaceIdActFunc;
    }

    public final Long getOrigItemId() {
        return this.origItemId;
    }

    public final String getOrigPromptId() {
        return this.origPromptId;
    }

    public final String getPromptId() {
        return this.promptId;
    }

    public final Long getRootItemId() {
        return this.rootItemId;
    }

    public final String getRootPromptId() {
        return this.rootPromptId;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public AIPortraitInfo(String str, String str2, Long l, Long l2, List<Long> list, List<String> list2, String str3, String str4, List<Long> list3, List<AIPortraitCameoInfo> list4, String str5, String str6, String str7) {
        this.promptId = str;
        this.taskId = str2;
        this.rootItemId = l;
        this.origItemId = l2;
        this.castUids = list;
        this.cameoIds = list2;
        this.origPromptId = str3;
        this.rootPromptId = str4;
        this.imageAIIndexList = list3;
        this.cameoInfo = list4;
        this.lastFaceIdActChnl = str5;
        this.lastFaceIdActFunc = str6;
        this.actorViewAuth = str7;
    }
}
