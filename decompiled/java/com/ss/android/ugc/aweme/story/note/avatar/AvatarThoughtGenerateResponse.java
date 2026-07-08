package com.ss.android.ugc.aweme.story.note.avatar;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class AvatarThoughtGenerateResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("is_allowed_by_quota")
    public final Boolean isAllowedByQuota;

    @C09CT("is_allowed_by_rate_limit")
    public final Boolean isAllowedByRateLimit;

    @C09CT("is_allowed_by_tns")
    public final Boolean isAllowedByTnS;

    @C09CT("status_message")
    public final String statusMessage;

    @C09CT("task_id")
    public final String taskId;

    public final AvatarThoughtGenerateResponse copy(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3) {
        return new AvatarThoughtGenerateResponse(str, str2, bool, bool2, bool3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarThoughtGenerateResponse)) {
            return false;
        }
        AvatarThoughtGenerateResponse avatarThoughtGenerateResponse = (AvatarThoughtGenerateResponse) obj;
        return Intrinsics.LJFF(this.statusMessage, avatarThoughtGenerateResponse.statusMessage) && Intrinsics.LJFF(this.taskId, avatarThoughtGenerateResponse.taskId) && Intrinsics.LJFF(this.isAllowedByQuota, avatarThoughtGenerateResponse.isAllowedByQuota) && Intrinsics.LJFF(this.isAllowedByRateLimit, avatarThoughtGenerateResponse.isAllowedByRateLimit) && Intrinsics.LJFF(this.isAllowedByTnS, avatarThoughtGenerateResponse.isAllowedByTnS);
    }

    public int hashCode() {
        String str = this.statusMessage;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.taskId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isAllowedByQuota;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isAllowedByRateLimit;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isAllowedByTnS;
        return iHashCode4 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarThoughtGenerateResponse(statusMessage=");
        sbLIZ.append(this.statusMessage);
        sbLIZ.append(", taskId=");
        sbLIZ.append(this.taskId);
        sbLIZ.append(", isAllowedByQuota=");
        sbLIZ.append(this.isAllowedByQuota);
        sbLIZ.append(", isAllowedByRateLimit=");
        sbLIZ.append(this.isAllowedByRateLimit);
        sbLIZ.append(", isAllowedByTnS=");
        sbLIZ.append(this.isAllowedByTnS);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getStatusMessage() {
        return this.statusMessage;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final Boolean isAllowedByQuota() {
        return this.isAllowedByQuota;
    }

    public final Boolean isAllowedByRateLimit() {
        return this.isAllowedByRateLimit;
    }

    public final Boolean isAllowedByTnS() {
        return this.isAllowedByTnS;
    }

    public AvatarThoughtGenerateResponse(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3) {
        this.statusMessage = str;
        this.taskId = str2;
        this.isAllowedByQuota = bool;
        this.isAllowedByRateLimit = bool2;
        this.isAllowedByTnS = bool3;
    }
}
