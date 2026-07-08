package com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource;

import X.C09CT;
import X.C2188811AlT;
import X.C439020HJk;
import X.C786410Ut5;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarAssets;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarQueueStatusResult;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface SocialAvatarFastFlowApi {
    public static final C439020HJk LIZ = C439020HJk.LIZ;

    @InterfaceC1501160pAQ("/tiktok/v1/social_avatar/batch_status")
    Object batchGetSocialAvatarTaskStatus(@InterfaceC1501070pAH("uid") List<String> list, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("users_by_type") String str, InterfaceC1364105Vn<? super BatchSocialAvatarTaskStatusResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/social_avatar/queue/stats")
    Object getSocialAvatarQueueStatus(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, InterfaceC1364105Vn<? super SocialAvatarQueueStatusResult> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/social_avatar/progress")
    Object getSocialAvatarTaskProgress(@InterfaceC1501070pAH("task_id") String str, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, InterfaceC1364105Vn<? super SocialAvatarTaskProgressResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/social_avatar/status")
    Object getSocialAvatarTaskStatus(@InterfaceC1501070pAH("task_id") String str, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, InterfaceC1364105Vn<? super SocialAvatarTaskStatusResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/social_avatar/send_notification")
    Object sendSocialAvatarNotification(@InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i, InterfaceC1364105Vn<? super SocialAvatarSendNotificationResponse> interfaceC1364105Vn);

    /* JADX INFO: loaded from: classes3.dex */
    public static final class BatchSocialAvatarTaskStatusResponse extends BaseResponse {
        public static final int $stable = 8;

        @C09CT("statuses")
        public final List<BatchSocialAvatarTaskStatus> status;

        @C09CT("statuses_by_type")
        public final List<SocialAvatarBatchTaskStatusWithIdType> statusesWithIdType;

        public BatchSocialAvatarTaskStatusResponse() {
            this(null, null);
        }

        public final BatchSocialAvatarTaskStatusResponse copy(List<BatchSocialAvatarTaskStatus> list, List<SocialAvatarBatchTaskStatusWithIdType> list2) {
            return new BatchSocialAvatarTaskStatusResponse(list, list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BatchSocialAvatarTaskStatusResponse)) {
                return false;
            }
            BatchSocialAvatarTaskStatusResponse batchSocialAvatarTaskStatusResponse = (BatchSocialAvatarTaskStatusResponse) obj;
            return Intrinsics.LJFF(this.status, batchSocialAvatarTaskStatusResponse.status) && Intrinsics.LJFF(this.statusesWithIdType, batchSocialAvatarTaskStatusResponse.statusesWithIdType);
        }

        public int hashCode() {
            List<BatchSocialAvatarTaskStatus> list = this.status;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<SocialAvatarBatchTaskStatusWithIdType> list2 = this.statusesWithIdType;
            return iHashCode + (list2 != null ? list2.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BatchSocialAvatarTaskStatusResponse(status=");
            sbLIZ.append(this.status);
            sbLIZ.append(", statusesWithIdType=");
            sbLIZ.append(this.statusesWithIdType);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final List<BatchSocialAvatarTaskStatus> getStatus() {
            return this.status;
        }

        public final List<SocialAvatarBatchTaskStatusWithIdType> getStatusesWithIdType() {
            return this.statusesWithIdType;
        }

        public BatchSocialAvatarTaskStatusResponse(List<BatchSocialAvatarTaskStatus> list, List<SocialAvatarBatchTaskStatusWithIdType> list2) {
            this.status = list;
            this.statusesWithIdType = list2;
        }
    }

    public static final class SocialAvatarSendNotificationResponse extends BaseResponse {
        public static final int $stable = 8;

        @C09CT("had_sent")
        public final boolean hadSent;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public final boolean status;

        public SocialAvatarSendNotificationResponse() {
            this(false, false);
        }

        public final SocialAvatarSendNotificationResponse copy(boolean z, boolean z2) {
            return new SocialAvatarSendNotificationResponse(z, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SocialAvatarSendNotificationResponse)) {
                return false;
            }
            SocialAvatarSendNotificationResponse socialAvatarSendNotificationResponse = (SocialAvatarSendNotificationResponse) obj;
            return this.status == socialAvatarSendNotificationResponse.status && this.hadSent == socialAvatarSendNotificationResponse.hadSent;
        }

        public int hashCode() {
            return (C786410Ut5.Z2(this.status) * 31) + C786410Ut5.Z2(this.hadSent);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SocialAvatarSendNotificationResponse(status=");
            sbLIZ.append(this.status);
            sbLIZ.append(", hadSent=");
            sbLIZ.append(this.hadSent);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final boolean getHadSent() {
            return this.hadSent;
        }

        public final boolean getStatus() {
            return this.status;
        }

        public SocialAvatarSendNotificationResponse(boolean z, boolean z2) {
            this.status = z;
            this.hadSent = z2;
        }
    }

    public static final class SocialAvatarTaskStatusExtra implements Serializable {
        public static final int $stable = 0;

        @C09CT("ai_self_preview_url")
        public final String aiSelfPreviewUrl;

        @C09CT("generation_uri")
        public final String generationUri;

        @C09CT("is_aiself_side_task")
        public final boolean isAISelfSideTask;

        @C09CT("social_avatar_preview_url")
        public final String socialAvatarPreviewUrl;

        public SocialAvatarTaskStatusExtra() {
            this(false, null, null, null);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SocialAvatarTaskStatusExtra(isAISelfSideTask=");
            sbLIZ.append(this.isAISelfSideTask);
            sbLIZ.append(", aiSelfPreviewUrl=");
            sbLIZ.append(this.aiSelfPreviewUrl);
            sbLIZ.append(", socialAvatarPreviewUrl=");
            sbLIZ.append(this.socialAvatarPreviewUrl);
            sbLIZ.append(", generationUri=");
            sbLIZ.append(this.generationUri);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final boolean isAISelfSideTask() {
            return this.isAISelfSideTask;
        }

        public SocialAvatarTaskStatusExtra(boolean z, String str, String str2, String str3) {
            this.isAISelfSideTask = z;
            this.aiSelfPreviewUrl = str;
            this.socialAvatarPreviewUrl = str2;
            this.generationUri = str3;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class SocialAvatarBatchStatusUidsWithIdType {

        @C09CT("id_type")
        public final Integer idType;

        @C09CT("user_ids")
        public final List<Long> uidList;

        public SocialAvatarBatchStatusUidsWithIdType() {
            this(0, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SocialAvatarBatchStatusUidsWithIdType)) {
                return false;
            }
            SocialAvatarBatchStatusUidsWithIdType socialAvatarBatchStatusUidsWithIdType = (SocialAvatarBatchStatusUidsWithIdType) obj;
            return Intrinsics.LJFF(this.idType, socialAvatarBatchStatusUidsWithIdType.idType) && Intrinsics.LJFF(this.uidList, socialAvatarBatchStatusUidsWithIdType.uidList);
        }

        public final int hashCode() {
            Integer num = this.idType;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            List<Long> list = this.uidList;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SocialAvatarBatchStatusUidsWithIdType(idType=");
            sbLIZ.append(this.idType);
            sbLIZ.append(", uidList=");
            sbLIZ.append(this.uidList);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public SocialAvatarBatchStatusUidsWithIdType(Integer num, List<Long> list) {
            this.idType = num;
            this.uidList = list;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class SocialAvatarBatchTaskStatusWithIdType {

        @C09CT("id_type")
        public final Integer idType;

        @C09CT("task_statuses")
        public final List<BatchSocialAvatarTaskStatus> statuses;

        public SocialAvatarBatchTaskStatusWithIdType() {
            this(0, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SocialAvatarBatchTaskStatusWithIdType)) {
                return false;
            }
            SocialAvatarBatchTaskStatusWithIdType socialAvatarBatchTaskStatusWithIdType = (SocialAvatarBatchTaskStatusWithIdType) obj;
            return Intrinsics.LJFF(this.idType, socialAvatarBatchTaskStatusWithIdType.idType) && Intrinsics.LJFF(this.statuses, socialAvatarBatchTaskStatusWithIdType.statuses);
        }

        public final int hashCode() {
            Integer num = this.idType;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            List<BatchSocialAvatarTaskStatus> list = this.statuses;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SocialAvatarBatchTaskStatusWithIdType(idType=");
            sbLIZ.append(this.idType);
            sbLIZ.append(", statuses=");
            sbLIZ.append(this.statuses);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public SocialAvatarBatchTaskStatusWithIdType(Integer num, List<BatchSocialAvatarTaskStatus> list) {
            this.idType = num;
            this.statuses = list;
        }
    }

    public static final class SocialAvatarTaskProgressResponse extends BaseResponse {

        @C09CT("social_avatar_assets")
        public final SocialAvatarAssets assetDetail;

        @C09CT("has_more_update")
        public final Boolean hasMoreUpdate;

        @C09CT("polling_interval")
        public final long pollingIntervalMs;

        @C09CT("task_detail")
        public final SocialAvatarTaskProgress taskDetail;

        public SocialAvatarTaskProgressResponse() {
            this(new SocialAvatarTaskProgress(null, null, null, null, null, null, null, null), 10000L, Boolean.FALSE, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SocialAvatarTaskProgressResponse)) {
                return false;
            }
            SocialAvatarTaskProgressResponse socialAvatarTaskProgressResponse = (SocialAvatarTaskProgressResponse) obj;
            return Intrinsics.LJFF(this.taskDetail, socialAvatarTaskProgressResponse.taskDetail) && this.pollingIntervalMs == socialAvatarTaskProgressResponse.pollingIntervalMs && Intrinsics.LJFF(this.hasMoreUpdate, socialAvatarTaskProgressResponse.hasMoreUpdate) && Intrinsics.LJFF(this.assetDetail, socialAvatarTaskProgressResponse.assetDetail);
        }

        public final int hashCode() {
            int iHashCode = ((this.taskDetail.hashCode() * 31) + C786410Ut5.Y2(this.pollingIntervalMs)) * 31;
            Boolean bool = this.hasMoreUpdate;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            SocialAvatarAssets socialAvatarAssets = this.assetDetail;
            return iHashCode2 + (socialAvatarAssets != null ? socialAvatarAssets.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SocialAvatarTaskProgressResponse(taskDetail=");
            sbLIZ.append(this.taskDetail);
            sbLIZ.append(", pollingIntervalMs=");
            sbLIZ.append(this.pollingIntervalMs);
            sbLIZ.append(", hasMoreUpdate=");
            sbLIZ.append(this.hasMoreUpdate);
            sbLIZ.append(", assetDetail=");
            sbLIZ.append(this.assetDetail);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public SocialAvatarTaskProgressResponse(SocialAvatarTaskProgress socialAvatarTaskProgress, long j, Boolean bool, SocialAvatarAssets socialAvatarAssets) {
            this.taskDetail = socialAvatarTaskProgress;
            this.pollingIntervalMs = j;
            this.hasMoreUpdate = bool;
            this.assetDetail = socialAvatarAssets;
        }
    }

    public static final class SocialAvatarTaskStatusResponse extends BaseResponse {

        @C09CT("input_uri")
        public final String inputUri;

        @C09CT("bytesync_status")
        public final int status;

        @C09CT("status_extra")
        public final SocialAvatarTaskStatusExtra statusExtra;

        @C09CT("task_id")
        public final String taskId;

        @C09CT("thumbnail_url")
        public final List<String> thumbnailUrl;

        public SocialAvatarTaskStatusResponse() {
            this(0, null, null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SocialAvatarTaskStatusResponse)) {
                return false;
            }
            SocialAvatarTaskStatusResponse socialAvatarTaskStatusResponse = (SocialAvatarTaskStatusResponse) obj;
            return this.status == socialAvatarTaskStatusResponse.status && Intrinsics.LJFF(this.thumbnailUrl, socialAvatarTaskStatusResponse.thumbnailUrl) && Intrinsics.LJFF(this.statusExtra, socialAvatarTaskStatusResponse.statusExtra) && Intrinsics.LJFF(this.taskId, socialAvatarTaskStatusResponse.taskId) && Intrinsics.LJFF(this.inputUri, socialAvatarTaskStatusResponse.inputUri);
        }

        public final int hashCode() {
            int i = this.status * 31;
            List<String> list = this.thumbnailUrl;
            int iHashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
            SocialAvatarTaskStatusExtra socialAvatarTaskStatusExtra = this.statusExtra;
            int iHashCode2 = (iHashCode + (socialAvatarTaskStatusExtra == null ? 0 : socialAvatarTaskStatusExtra.hashCode())) * 31;
            String str = this.taskId;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.inputUri;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SocialAvatarTaskStatusResponse(status=");
            sbLIZ.append(this.status);
            sbLIZ.append(", thumbnailUrl=");
            sbLIZ.append(this.thumbnailUrl);
            sbLIZ.append(", statusExtra=");
            sbLIZ.append(this.statusExtra);
            sbLIZ.append(", taskId=");
            sbLIZ.append(this.taskId);
            sbLIZ.append(", inputUri=");
            sbLIZ.append(this.inputUri);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public SocialAvatarTaskStatusResponse(int i, List<String> list, SocialAvatarTaskStatusExtra socialAvatarTaskStatusExtra, String str, String str2) {
            this.status = i;
            this.thumbnailUrl = list;
            this.statusExtra = socialAvatarTaskStatusExtra;
            this.taskId = str;
            this.inputUri = str2;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class BatchSocialAvatarTaskStatus implements Serializable {
        public static final int $stable = 8;

        @C09CT("does_selfie_exist")
        public final Boolean doesSelfieExist;

        @C09CT("bytesync_status")
        public final int status;

        @C09CT("status_extra")
        public final SocialAvatarTaskStatusExtra statusExtra;

        @C09CT("task_id")
        public final String taskId;

        @C09CT("thumbnail_url")
        public final List<String> thumbnailUrl;

        @C09CT("uid")
        public final Long uid;

        public BatchSocialAvatarTaskStatus() {
            this(null, 0, null, null, null, null);
        }

        public BatchSocialAvatarTaskStatus(Long l, int i, List<String> list, SocialAvatarTaskStatusExtra socialAvatarTaskStatusExtra, String str, Boolean bool) {
            this.uid = l;
            this.status = i;
            this.thumbnailUrl = list;
            this.statusExtra = socialAvatarTaskStatusExtra;
            this.taskId = str;
            this.doesSelfieExist = bool;
        }
    }

    public static final class SocialAvatarTaskProgress {

        @C09CT("complete_percentage")
        public final Float completePercentage;

        @C09CT("create_time")
        public final Long createTimeMs;

        @C09CT("end_time")
        public final Long endTimeMs;

        @C09CT("start_time")
        public final Long startTimeMs;

        @C09CT("task_status")
        public final Integer status;

        @C09CT("status_message")
        public final String statusMessage;

        @C09CT("task_id")
        public final String taskId;

        @C09CT("waiting_time")
        public final Long waitingTimeMs;

        public SocialAvatarTaskProgress() {
            this(null, null, null, null, null, null, null, null);
        }

        public SocialAvatarTaskProgress(String str, Integer num, String str2, Float f, Long l, Long l2, Long l3, Long l4) {
            this.taskId = str;
            this.status = num;
            this.statusMessage = str2;
            this.completePercentage = f;
            this.waitingTimeMs = l;
            this.createTimeMs = l2;
            this.startTimeMs = l3;
            this.endTimeMs = l4;
        }
    }
}
