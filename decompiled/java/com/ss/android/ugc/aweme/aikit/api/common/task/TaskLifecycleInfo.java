package com.ss.android.ugc.aweme.aikit.api.common.task;

import X.C09CT;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class TaskLifecycleInfo {

    @C09CT("ai_crt_info")
    public final String aiCrtInfo;

    @C09CT("author_user_id")
    public final String authorUserId;

    @C09CT("business")
    public final String business;

    @C09CT("cameo_ids")
    public final List<String> cameoIds;

    @C09CT("client_task_id")
    public final String clientTaskId;

    @C09CT("dm_client_msg_id")
    public final String dmClientMsgId;

    @C09CT("dm_conversation_short_id")
    public final Long dmConversationShortId;

    @C09CT("dm_msg_id")
    public final String dmMsgId;

    @C09CT("dm_user_id")
    public final String dmUid;

    @C09CT("draft_id")
    public final String draftId;

    @C09CT("item_id")
    public final String itemId;

    @C09CT("music_id")
    public final String musicId;

    @C09CT("orig_item_id")
    public final String origItemId;

    @C09CT("prompt_id")
    public final String promptId;

    @C09CT("root_item_id")
    public final String rootItemId;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("seed")
    public final Long seed;

    @C09CT("task_id")
    public final String taskId;

    @C09CT("user_id_list")
    public final List<Long> userIdList;

    public TaskLifecycleInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskLifecycleInfo)) {
            return false;
        }
        TaskLifecycleInfo taskLifecycleInfo = (TaskLifecycleInfo) obj;
        return Intrinsics.LJFF(this.taskId, taskLifecycleInfo.taskId) && Intrinsics.LJFF(this.musicId, taskLifecycleInfo.musicId) && Intrinsics.LJFF(this.business, taskLifecycleInfo.business) && Intrinsics.LJFF(this.scene, taskLifecycleInfo.scene) && Intrinsics.LJFF(this.authorUserId, taskLifecycleInfo.authorUserId) && Intrinsics.LJFF(this.cameoIds, taskLifecycleInfo.cameoIds) && Intrinsics.LJFF(this.userIdList, taskLifecycleInfo.userIdList) && Intrinsics.LJFF(this.promptId, taskLifecycleInfo.promptId) && Intrinsics.LJFF(this.draftId, taskLifecycleInfo.draftId) && Intrinsics.LJFF(this.itemId, taskLifecycleInfo.itemId) && Intrinsics.LJFF(this.origItemId, taskLifecycleInfo.origItemId) && Intrinsics.LJFF(this.seed, taskLifecycleInfo.seed) && Intrinsics.LJFF(this.clientTaskId, taskLifecycleInfo.clientTaskId) && Intrinsics.LJFF(this.dmConversationShortId, taskLifecycleInfo.dmConversationShortId) && Intrinsics.LJFF(this.dmUid, taskLifecycleInfo.dmUid) && Intrinsics.LJFF(this.dmClientMsgId, taskLifecycleInfo.dmClientMsgId) && Intrinsics.LJFF(this.dmMsgId, taskLifecycleInfo.dmMsgId) && Intrinsics.LJFF(this.rootItemId, taskLifecycleInfo.rootItemId) && Intrinsics.LJFF(this.aiCrtInfo, taskLifecycleInfo.aiCrtInfo);
    }

    public int hashCode() {
        String str = this.taskId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.musicId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.business;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.scene;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.authorUserId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list = this.cameoIds;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<Long> list2 = this.userIdList;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str6 = this.promptId;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.draftId;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.itemId;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.origItemId;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l = this.seed;
        int iHashCode12 = (iHashCode11 + (l == null ? 0 : l.hashCode())) * 31;
        String str10 = this.clientTaskId;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Long l2 = this.dmConversationShortId;
        int iHashCode14 = (iHashCode13 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str11 = this.dmUid;
        int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.dmClientMsgId;
        int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.dmMsgId;
        int iHashCode17 = (iHashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.rootItemId;
        int iHashCode18 = (iHashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.aiCrtInfo;
        return iHashCode18 + (str15 != null ? str15.hashCode() : 0);
    }

    public String toString() {
        return "TaskLifecycleInfo(taskId=" + this.taskId + ", musicId=" + this.musicId + ", business=" + this.business + ", scene=" + this.scene + ", authorUserId=" + this.authorUserId + ", cameoIds=" + this.cameoIds + ", userIdList=" + this.userIdList + ", promptId=" + this.promptId + ", draftId=" + this.draftId + ", itemId=" + this.itemId + ", origItemId=" + this.origItemId + ", seed=" + this.seed + ", clientTaskId=" + this.clientTaskId + ", dmConversationShortId=" + this.dmConversationShortId + ", dmUid=" + this.dmUid + ", dmClientMsgId=" + this.dmClientMsgId + ", dmMsgId=" + this.dmMsgId + ", rootItemId=" + this.rootItemId + ", aiCrtInfo=" + this.aiCrtInfo + ')';
    }

    public final boolean isFromChat() {
        String str = this.dmUid;
        return (str == null || str.length() <= 0 || Intrinsics.LJFF(this.dmUid, CardStruct.IStatusCode.DEFAULT)) ? false : true;
    }

    public TaskLifecycleInfo(String str, String str2, String str3, String str4, String str5, List<String> list, List<Long> list2, String str6, String str7, String str8, String str9, Long l, String str10, Long l2, String str11, String str12, String str13, String str14, String str15) {
        this.taskId = str;
        this.musicId = str2;
        this.business = str3;
        this.scene = str4;
        this.authorUserId = str5;
        this.cameoIds = list;
        this.userIdList = list2;
        this.promptId = str6;
        this.draftId = str7;
        this.itemId = str8;
        this.origItemId = str9;
        this.seed = l;
        this.clientTaskId = str10;
        this.dmConversationShortId = l2;
        this.dmUid = str11;
        this.dmClientMsgId = str12;
        this.dmMsgId = str13;
        this.rootItemId = str14;
        this.aiCrtInfo = str15;
    }
}
