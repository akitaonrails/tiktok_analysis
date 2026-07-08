package com.ss.android.ugc.airemix.model;

import X.C09CT;
import X.C548860Lfo;
import X.C548920Lfu;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.airemix.model.AIRemixConsumptionModel;
import com.ss.android.ugc.aweme.feed.model.CameoInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIRemixConsumptionModel implements Parcelable {

    @C09CT("actors_ship_list")
    public final String actorsShipList;

    @C09CT("author_id")
    public final String authorId;

    @C09CT("cameo_ids")
    public final List<String> cameoIds;

    @C09CT("cameo_asset_infos")
    public final List<CameoInfo> cameoInfos;

    @C09CT("first_follow_gid")
    public final String firstFollowGid;

    @C09CT("follow_status")
    public final Integer followStatus;

    @C09CT("is_ref_image")
    public final Boolean isRefImage;

    @C09CT("item_id")
    public final String itemId;

    @C09CT("prompt")
    public final String prompt;

    @C09CT("remix_video_id")
    public final String remixVideoId;

    @C09CT("server_task_id")
    public final String serverTaskId;

    @C09CT("user_id_list")
    public final List<Long> userIdList;

    @C09CT("video_url")
    public final String videoUrl;
    public static final C548860Lfo Companion = new Object() { // from class: X.0Lfo
    };
    public static final Parcelable.Creator<AIRemixConsumptionModel> CREATOR = new Parcelable.Creator<AIRemixConsumptionModel>() { // from class: X.02xq
        @Override // android.os.Parcelable.Creator
        public final AIRemixConsumptionModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Integer numValueOf;
            boolean z;
            Boolean boolValueOf;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(AIRemixConsumptionModel.class.getClassLoader()));
                }
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(Long.valueOf(parcel.readLong()));
                }
            }
            return new AIRemixConsumptionModel(arrayList, string, string2, string3, string4, string5, numValueOf, string6, string7, boolValueOf, arrayListCreateStringArrayList, arrayList2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIRemixConsumptionModel[] newArray(int i) {
            return new AIRemixConsumptionModel[i];
        }
    };

    public AIRemixConsumptionModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIRemixConsumptionModel)) {
            return false;
        }
        AIRemixConsumptionModel aIRemixConsumptionModel = (AIRemixConsumptionModel) obj;
        return Intrinsics.LJFF(this.cameoInfos, aIRemixConsumptionModel.cameoInfos) && Intrinsics.LJFF(this.serverTaskId, aIRemixConsumptionModel.serverTaskId) && Intrinsics.LJFF(this.videoUrl, aIRemixConsumptionModel.videoUrl) && Intrinsics.LJFF(this.remixVideoId, aIRemixConsumptionModel.remixVideoId) && Intrinsics.LJFF(this.firstFollowGid, aIRemixConsumptionModel.firstFollowGid) && Intrinsics.LJFF(this.authorId, aIRemixConsumptionModel.authorId) && Intrinsics.LJFF(this.followStatus, aIRemixConsumptionModel.followStatus) && Intrinsics.LJFF(this.prompt, aIRemixConsumptionModel.prompt) && Intrinsics.LJFF(this.actorsShipList, aIRemixConsumptionModel.actorsShipList) && Intrinsics.LJFF(this.isRefImage, aIRemixConsumptionModel.isRefImage) && Intrinsics.LJFF(this.cameoIds, aIRemixConsumptionModel.cameoIds) && Intrinsics.LJFF(this.userIdList, aIRemixConsumptionModel.userIdList) && Intrinsics.LJFF(this.itemId, aIRemixConsumptionModel.itemId);
    }

    public final int hashCode() {
        List<CameoInfo> list = this.cameoInfos;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.serverTaskId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.videoUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.remixVideoId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.firstFollowGid;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.authorId;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.followStatus;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.prompt;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.actorsShipList;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.isRefImage;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list2 = this.cameoIds;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Long> list3 = this.userIdList;
        int iHashCode12 = (iHashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str8 = this.itemId;
        return iHashCode12 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        return "AIRemixConsumptionModel(cameoInfos=" + this.cameoInfos + ", serverTaskId=" + this.serverTaskId + ", videoUrl=" + this.videoUrl + ", remixVideoId=" + this.remixVideoId + ", firstFollowGid=" + this.firstFollowGid + ", authorId=" + this.authorId + ", followStatus=" + this.followStatus + ", prompt=" + this.prompt + ", actorsShipList=" + this.actorsShipList + ", isRefImage=" + this.isRefImage + ", cameoIds=" + this.cameoIds + ", userIdList=" + this.userIdList + ", itemId=" + this.itemId + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<CameoInfo> list = this.cameoInfos;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<CameoInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), i);
            }
        }
        parcel.writeString(this.serverTaskId);
        parcel.writeString(this.videoUrl);
        parcel.writeString(this.remixVideoId);
        parcel.writeString(this.firstFollowGid);
        parcel.writeString(this.authorId);
        Integer num = this.followStatus;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.prompt);
        parcel.writeString(this.actorsShipList);
        Boolean bool = this.isRefImage;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeStringList(this.cameoIds);
        List<Long> list2 = this.userIdList;
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
        parcel.writeString(this.itemId);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Lfo] */
    static {
        C548920Lfu.LIZ(AIRemixConsumptionModel.class, AFwS239S0000000_8.get$arr$(17));
    }

    public AIRemixConsumptionModel(List<CameoInfo> list, String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, Boolean bool, List<String> list2, List<Long> list3, String str8) {
        this.cameoInfos = list;
        this.serverTaskId = str;
        this.videoUrl = str2;
        this.remixVideoId = str3;
        this.firstFollowGid = str4;
        this.authorId = str5;
        this.followStatus = num;
        this.prompt = str6;
        this.actorsShipList = str7;
        this.isRefImage = bool;
        this.cameoIds = list2;
        this.userIdList = list3;
        this.itemId = str8;
    }
}
