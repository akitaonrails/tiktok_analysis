package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes3.dex */
public final class InboxEntranceBizParams {

    @C09CT("keep_bubble_style")
    public int keepBubbleStyle;

    @C09CT("total_preview_users_count")
    public int totalPreviewUsersCount;

    public InboxEntranceBizParams() {
        this(0, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboxEntranceBizParams)) {
            return false;
        }
        InboxEntranceBizParams inboxEntranceBizParams = (InboxEntranceBizParams) obj;
        return this.keepBubbleStyle == inboxEntranceBizParams.keepBubbleStyle && this.totalPreviewUsersCount == inboxEntranceBizParams.totalPreviewUsersCount;
    }

    public int hashCode() {
        return (this.keepBubbleStyle * 31) + this.totalPreviewUsersCount;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxEntranceBizParams(keepBubbleStyle=");
        sbLIZ.append(this.keepBubbleStyle);
        sbLIZ.append(", totalPreviewUsersCount=");
        sbLIZ.append(this.totalPreviewUsersCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setKeepBubbleStyle(int i) {
        this.keepBubbleStyle = i;
    }

    public final void setTotalPreviewUsersCount(int i) {
        this.totalPreviewUsersCount = i;
    }

    public InboxEntranceBizParams(int i, int i2) {
        this.keepBubbleStyle = i;
        this.totalPreviewUsersCount = i2;
    }
}
