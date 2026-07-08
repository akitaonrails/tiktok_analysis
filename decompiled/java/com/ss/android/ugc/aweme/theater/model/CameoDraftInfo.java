package com.ss.android.ugc.aweme.theater.model;

import X.C09CT;
import X.C13BV;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.theater.model.CameoDraftInfo;
import com.ss.android.ugc.aweme.theater.model.CameoInfoItem;
import com.ss.android.ugc.aweme.theater.model.CoverModel;
import com.ss.android.ugc.aweme.theater.model.VideoModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CameoDraftInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<CameoDraftInfo> CREATOR = new Parcelable.Creator<CameoDraftInfo>() { // from class: X.02to
        @Override // android.os.Parcelable.Creator
        public final CameoDraftInfo createFromParcel(Parcel parcel) {
            Long lValueOf;
            VideoModel videoModelCreateFromParcel;
            CoverModel coverModelCreateFromParcel;
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Long lValueOf2 = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                videoModelCreateFromParcel = null;
            } else {
                videoModelCreateFromParcel = VideoModel.CREATOR.createFromParcel(parcel);
            }
            VideoModel videoModel = videoModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                coverModelCreateFromParcel = null;
            } else {
                coverModelCreateFromParcel = CoverModel.CREATOR.createFromParcel(parcel);
            }
            CoverModel coverModel = coverModelCreateFromParcel;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(CameoInfoItem.CREATOR.createFromParcel(parcel));
                }
            }
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            return new CameoDraftInfo(string, string2, string3, string4, lValueOf, videoModel, coverModel, arrayListCreateStringArrayList, string5, arrayList, string6, lValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final CameoDraftInfo[] newArray(int i) {
            return new CameoDraftInfo[i];
        }
    };

    @C09CT("business")
    public final String business;

    @C09CT("cameo_ids")
    public final List<String> cameoIds;

    @C09CT("cameo_infos")
    public final List<CameoInfoItem> cameoInfos;

    @C09CT("cover")
    public final CoverModel cover;

    @C09CT("create_time")
    public final Long createTime;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("prompt_text")
    public final String promptText;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("seed")
    public final Long seed;

    @C09CT("task_id")
    public final String taskId;

    @C09CT("tenant")
    public final String tenant;

    @C09CT("video")
    public final VideoModel video;

    public CameoDraftInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public final CameoDraftInfo copy(String str, String str2, String str3, String str4, Long l, VideoModel videoModel, CoverModel coverModel, List<String> list, String str5, List<CameoInfoItem> list2, String str6, Long l2) {
        return new CameoDraftInfo(str, str2, str3, str4, l, videoModel, coverModel, list, str5, list2, str6, l2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameoDraftInfo)) {
            return false;
        }
        CameoDraftInfo cameoDraftInfo = (CameoDraftInfo) obj;
        return Intrinsics.LJFF(this.tenant, cameoDraftInfo.tenant) && Intrinsics.LJFF(this.business, cameoDraftInfo.business) && Intrinsics.LJFF(this.scene, cameoDraftInfo.scene) && Intrinsics.LJFF(this.id, cameoDraftInfo.id) && Intrinsics.LJFF(this.createTime, cameoDraftInfo.createTime) && Intrinsics.LJFF(this.video, cameoDraftInfo.video) && Intrinsics.LJFF(this.cover, cameoDraftInfo.cover) && Intrinsics.LJFF(this.cameoIds, cameoDraftInfo.cameoIds) && Intrinsics.LJFF(this.taskId, cameoDraftInfo.taskId) && Intrinsics.LJFF(this.cameoInfos, cameoDraftInfo.cameoInfos) && Intrinsics.LJFF(this.promptText, cameoDraftInfo.promptText) && Intrinsics.LJFF(this.seed, cameoDraftInfo.seed);
    }

    public int hashCode() {
        String str = this.tenant;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.business;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scene;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.id;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.createTime;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        VideoModel videoModel = this.video;
        int iHashCode6 = (iHashCode5 + (videoModel == null ? 0 : videoModel.hashCode())) * 31;
        CoverModel coverModel = this.cover;
        int iHashCode7 = (iHashCode6 + (coverModel == null ? 0 : coverModel.hashCode())) * 31;
        List<String> list = this.cameoIds;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.taskId;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<CameoInfoItem> list2 = this.cameoInfos;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str6 = this.promptText;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l2 = this.seed;
        return iHashCode11 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        return "CameoDraftInfo(tenant=" + this.tenant + ", business=" + this.business + ", scene=" + this.scene + ", id=" + this.id + ", createTime=" + this.createTime + ", video=" + this.video + ", cover=" + this.cover + ", cameoIds=" + this.cameoIds + ", taskId=" + this.taskId + ", cameoInfos=" + this.cameoInfos + ", promptText=" + this.promptText + ", seed=" + this.seed + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.tenant);
        parcel.writeString(this.business);
        parcel.writeString(this.scene);
        parcel.writeString(this.id);
        Long l = this.createTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        VideoModel videoModel = this.video;
        if (videoModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoModel.writeToParcel(parcel, i);
        }
        CoverModel coverModel = this.cover;
        if (coverModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            coverModel.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.cameoIds);
        parcel.writeString(this.taskId);
        List<CameoInfoItem> list = this.cameoInfos;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<CameoInfoItem> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.promptText);
        Long l2 = this.seed;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
    }

    public final String getBusiness() {
        return this.business;
    }

    public final List<String> getCameoIds() {
        return this.cameoIds;
    }

    public final List<CameoInfoItem> getCameoInfos() {
        return this.cameoInfos;
    }

    public final CoverModel getCover() {
        return this.cover;
    }

    public final Long getCreateTime() {
        return this.createTime;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPromptText() {
        return this.promptText;
    }

    public final String getScene() {
        return this.scene;
    }

    public final Long getSeed() {
        return this.seed;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final String getTenant() {
        return this.tenant;
    }

    public final VideoModel getVideo() {
        return this.video;
    }

    public CameoDraftInfo(String str, String str2, String str3, String str4, Long l, VideoModel videoModel, CoverModel coverModel, List<String> list, String str5, List<CameoInfoItem> list2, String str6, Long l2) {
        this.tenant = str;
        this.business = str2;
        this.scene = str3;
        this.id = str4;
        this.createTime = l;
        this.video = videoModel;
        this.cover = coverModel;
        this.cameoIds = list;
        this.taskId = str5;
        this.cameoInfos = list2;
        this.promptText = str6;
        this.seed = l2;
    }

    public CameoDraftInfo(String str, String str2, String str3, String str4, Long l, VideoModel videoModel, CoverModel coverModel, List list, String str5, List list2, String str6, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? 0L : l, (i & 32) != 0 ? null : videoModel, (i & 64) != 0 ? null : coverModel, (i & 128) != 0 ? C13BV.INSTANCE : list, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? C13BV.INSTANCE : list2, (i & 1024) == 0 ? str6 : null, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? -1L : l2);
    }
}
