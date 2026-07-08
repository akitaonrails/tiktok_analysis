package com.ss.android.ugc.aweme.widget.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class SuggestedVideoItem {

    @C09CT("item_info")
    public final SuggestedVideoItemInfo itemInfo;

    @C09CT("link_info")
    public final SuggestedVideoLinkInfo linkInfo;

    public SuggestedVideoItem() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestedVideoItem)) {
            return false;
        }
        SuggestedVideoItem suggestedVideoItem = (SuggestedVideoItem) obj;
        return Intrinsics.LJFF(this.itemInfo, suggestedVideoItem.itemInfo) && Intrinsics.LJFF(this.linkInfo, suggestedVideoItem.linkInfo);
    }

    public int hashCode() {
        SuggestedVideoItemInfo suggestedVideoItemInfo = this.itemInfo;
        int iHashCode = (suggestedVideoItemInfo == null ? 0 : suggestedVideoItemInfo.hashCode()) * 31;
        SuggestedVideoLinkInfo suggestedVideoLinkInfo = this.linkInfo;
        return iHashCode + (suggestedVideoLinkInfo != null ? suggestedVideoLinkInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuggestedVideoItem(itemInfo=");
        sbLIZ.append(this.itemInfo);
        sbLIZ.append(", linkInfo=");
        sbLIZ.append(this.linkInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SuggestedVideoItem(SuggestedVideoItemInfo suggestedVideoItemInfo, SuggestedVideoLinkInfo suggestedVideoLinkInfo) {
        this.itemInfo = suggestedVideoItemInfo;
        this.linkInfo = suggestedVideoLinkInfo;
    }
}
