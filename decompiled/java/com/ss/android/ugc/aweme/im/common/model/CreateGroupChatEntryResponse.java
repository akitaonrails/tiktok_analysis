package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CreateGroupChatEntryResponse extends BaseResponse implements Serializable {

    @C09CT("group_rec_info")
    public final GroupChatRecommendInfo groupRecInfo;

    public CreateGroupChatEntryResponse() {
        this(null);
    }

    public final CreateGroupChatEntryResponse copy(GroupChatRecommendInfo groupChatRecommendInfo) {
        return new CreateGroupChatEntryResponse(groupChatRecommendInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreateGroupChatEntryResponse) && Intrinsics.LJFF(this.groupRecInfo, ((CreateGroupChatEntryResponse) obj).groupRecInfo);
    }

    public int hashCode() {
        GroupChatRecommendInfo groupChatRecommendInfo = this.groupRecInfo;
        if (groupChatRecommendInfo == null) {
            return 0;
        }
        return groupChatRecommendInfo.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateGroupChatEntryResponse(groupRecInfo=");
        sbLIZ.append(this.groupRecInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final GroupChatRecommendInfo getGroupRecInfo() {
        return this.groupRecInfo;
    }

    public CreateGroupChatEntryResponse(GroupChatRecommendInfo groupChatRecommendInfo) {
        this.groupRecInfo = groupChatRecommendInfo;
    }
}
