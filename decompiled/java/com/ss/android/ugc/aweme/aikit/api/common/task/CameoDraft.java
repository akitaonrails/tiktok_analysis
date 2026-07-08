package com.ss.android.ugc.aweme.aikit.api.common.task;

import X.C09CT;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CameoDraft implements Serializable {

    @C09CT("author_info")
    public final UserBaseInfo authorInfo;

    @C09CT("business")
    public final String business;

    @C09CT("cameo_ids")
    public final List<String> cameoIds;

    @C09CT("cameo_infos")
    public final List<CameoInfo> cameoInfos;

    @C09CT("cover")
    public final MediaInfo cover;

    @C09CT("create_time")
    public final Long createTime;

    @C09CT("draft_author_id")
    public final String draftAuthorId;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("is_deleted")
    public final Boolean isDeleted;

    @C09CT("auto_generate")
    public final Boolean isFirstAISelfAutoCast;

    @C09CT("music_id")
    public final String musicId;

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
    public final MediaInfo video;

    public CameoDraft() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameoDraft)) {
            return false;
        }
        CameoDraft cameoDraft = (CameoDraft) obj;
        return Intrinsics.LJFF(this.tenant, cameoDraft.tenant) && Intrinsics.LJFF(this.business, cameoDraft.business) && Intrinsics.LJFF(this.scene, cameoDraft.scene) && Intrinsics.LJFF(this.id, cameoDraft.id) && Intrinsics.LJFF(this.createTime, cameoDraft.createTime) && Intrinsics.LJFF(this.video, cameoDraft.video) && Intrinsics.LJFF(this.cover, cameoDraft.cover) && Intrinsics.LJFF(this.cameoIds, cameoDraft.cameoIds) && Intrinsics.LJFF(this.taskId, cameoDraft.taskId) && Intrinsics.LJFF(this.musicId, cameoDraft.musicId) && Intrinsics.LJFF(this.cameoInfos, cameoDraft.cameoInfos) && Intrinsics.LJFF(this.promptText, cameoDraft.promptText) && Intrinsics.LJFF(this.seed, cameoDraft.seed) && Intrinsics.LJFF(this.draftAuthorId, cameoDraft.draftAuthorId) && Intrinsics.LJFF(this.authorInfo, cameoDraft.authorInfo) && Intrinsics.LJFF(this.isDeleted, cameoDraft.isDeleted) && Intrinsics.LJFF(this.isFirstAISelfAutoCast, cameoDraft.isFirstAISelfAutoCast);
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
        MediaInfo mediaInfo = this.video;
        int iHashCode6 = (iHashCode5 + (mediaInfo == null ? 0 : mediaInfo.hashCode())) * 31;
        MediaInfo mediaInfo2 = this.cover;
        int iHashCode7 = (iHashCode6 + (mediaInfo2 == null ? 0 : mediaInfo2.hashCode())) * 31;
        List<String> list = this.cameoIds;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.taskId;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.musicId;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<CameoInfo> list2 = this.cameoInfos;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str7 = this.promptText;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l2 = this.seed;
        int iHashCode13 = (iHashCode12 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str8 = this.draftAuthorId;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        UserBaseInfo userBaseInfo = this.authorInfo;
        int iHashCode15 = (iHashCode14 + (userBaseInfo == null ? 0 : userBaseInfo.hashCode())) * 31;
        Boolean bool = this.isDeleted;
        int iHashCode16 = (iHashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isFirstAISelfAutoCast;
        return iHashCode16 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "CameoDraft(tenant=" + this.tenant + ", business=" + this.business + ", scene=" + this.scene + ", id=" + this.id + ", createTime=" + this.createTime + ", video=" + this.video + ", cover=" + this.cover + ", cameoIds=" + this.cameoIds + ", taskId=" + this.taskId + ", musicId=" + this.musicId + ", cameoInfos=" + this.cameoInfos + ", promptText=" + this.promptText + ", seed=" + this.seed + ", draftAuthorId=" + this.draftAuthorId + ", authorInfo=" + this.authorInfo + ", isDeleted=" + this.isDeleted + ", isFirstAISelfAutoCast=" + this.isFirstAISelfAutoCast + ')';
    }

    public final Boolean isDeleted() {
        return this.isDeleted;
    }

    public final Boolean isFirstAISelfAutoCast() {
        return this.isFirstAISelfAutoCast;
    }

    public CameoDraft(String str, String str2, String str3, String str4, Long l, MediaInfo mediaInfo, MediaInfo mediaInfo2, List<String> list, String str5, String str6, List<CameoInfo> list2, String str7, Long l2, String str8, UserBaseInfo userBaseInfo, Boolean bool, Boolean bool2) {
        this.tenant = str;
        this.business = str2;
        this.scene = str3;
        this.id = str4;
        this.createTime = l;
        this.video = mediaInfo;
        this.cover = mediaInfo2;
        this.cameoIds = list;
        this.taskId = str5;
        this.musicId = str6;
        this.cameoInfos = list2;
        this.promptText = str7;
        this.seed = l2;
        this.draftAuthorId = str8;
        this.authorInfo = userBaseInfo;
        this.isDeleted = bool;
        this.isFirstAISelfAutoCast = bool2;
    }
}
