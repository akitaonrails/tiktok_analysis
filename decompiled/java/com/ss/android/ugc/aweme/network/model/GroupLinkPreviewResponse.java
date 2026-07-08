package com.ss.android.ugc.aweme.network.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.publicgroup.data.GroupForPreview;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class GroupLinkPreviewResponse extends com.ss.android.ugc.aweme.base.api.BaseResponse {

    @C09CT("error")
    public final LinkPreviewError error;

    @C09CT("group_info")
    public final GroupForPreview group;

    public GroupLinkPreviewResponse() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupLinkPreviewResponse)) {
            return false;
        }
        GroupLinkPreviewResponse groupLinkPreviewResponse = (GroupLinkPreviewResponse) obj;
        return Intrinsics.LJFF(this.group, groupLinkPreviewResponse.group) && Intrinsics.LJFF(this.error, groupLinkPreviewResponse.error);
    }

    public final int hashCode() {
        GroupForPreview groupForPreview = this.group;
        int iHashCode = (groupForPreview == null ? 0 : groupForPreview.hashCode()) * 31;
        LinkPreviewError linkPreviewError = this.error;
        return iHashCode + (linkPreviewError != null ? linkPreviewError.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupLinkPreviewResponse(group=");
        sbLIZ.append(this.group);
        sbLIZ.append(", error=");
        sbLIZ.append(this.error);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GroupLinkPreviewResponse(GroupForPreview groupForPreview, LinkPreviewError linkPreviewError) {
        this.group = groupForPreview;
        this.error = linkPreviewError;
    }
}
