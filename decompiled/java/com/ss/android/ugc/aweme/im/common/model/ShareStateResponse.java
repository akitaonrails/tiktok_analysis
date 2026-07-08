package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class ShareStateResponse extends BaseResponse {

    @C09CT("share_user")
    public ShareUserStruct[] shareUsers;

    public static final class ShareUserStruct implements Serializable {

        @C09CT("experiment_version")
        public ExperimentVersion experimentVersion;

        @C09CT("sec_user_id")
        public String secUserId;

        @C09CT("user_id")
        public String userId;

        @C09CT("follow_status")
        public int followStatus = -1;

        @C09CT("share_status")
        public int shareStatus = 2;

        public final String toUidString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ShareUserStruct{sec_user_id=");
            sbLIZ.append(this.secUserId);
            sbLIZ.append(", follow_status=");
            sbLIZ.append(this.followStatus);
            sbLIZ.append(", share_status=");
            sbLIZ.append(this.shareStatus);
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final ExperimentVersion getExperimentVersion() {
            return this.experimentVersion;
        }

        public final int getFollowStatus() {
            return this.followStatus;
        }

        public final String getSecUserId() {
            return this.secUserId;
        }

        public final int getShareStatus() {
            return this.shareStatus;
        }

        public final String getUserId() {
            return this.userId;
        }

        public final void setExperimentVersion(ExperimentVersion experimentVersion) {
            this.experimentVersion = experimentVersion;
        }

        public final void setFollowStatus(int i) {
            this.followStatus = i;
        }

        public final void setSecUserId(String str) {
            this.secUserId = str;
        }

        public final void setShareStatus(int i) {
            this.shareStatus = i;
        }

        public final void setUserId(String str) {
            this.userId = str;
        }
    }

    public static final class ExperimentVersion implements Serializable {

        @C09CT("internal_share_holdout_receiver_receiver_side")
        public String internalShareHoldoutVersion;

        public final String getInternalShareHoldoutVersion() {
            return this.internalShareHoldoutVersion;
        }

        public final void setInternalShareHoldoutVersion(String str) {
            this.internalShareHoldoutVersion = str;
        }
    }

    public final ShareUserStruct[] getShareUsers() {
        return this.shareUsers;
    }

    public final void setShareUsers(ShareUserStruct[] shareUserStructArr) {
        this.shareUsers = shareUserStructArr;
    }
}
