package com.ss.android.ugc.aweme.widget.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class SuggestedVideoItemInfo {

    @C09CT("caption")
    public final String caption;

    @C09CT("cover_image")
    public final SuggestedVideoImage coverImage;

    @C09CT("item_tag")
    public final String itemTag;

    public SuggestedVideoItemInfo() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestedVideoItemInfo)) {
            return false;
        }
        SuggestedVideoItemInfo suggestedVideoItemInfo = (SuggestedVideoItemInfo) obj;
        return Intrinsics.LJFF(this.caption, suggestedVideoItemInfo.caption) && Intrinsics.LJFF(this.coverImage, suggestedVideoItemInfo.coverImage) && Intrinsics.LJFF(this.itemTag, suggestedVideoItemInfo.itemTag);
    }

    public int hashCode() {
        String str = this.caption;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        SuggestedVideoImage suggestedVideoImage = this.coverImage;
        int iHashCode2 = (iHashCode + (suggestedVideoImage == null ? 0 : suggestedVideoImage.hashCode())) * 31;
        String str2 = this.itemTag;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuggestedVideoItemInfo(caption=");
        sbLIZ.append(this.caption);
        sbLIZ.append(", coverImage=");
        sbLIZ.append(this.coverImage);
        sbLIZ.append(", itemTag=");
        sbLIZ.append(this.itemTag);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SuggestedVideoItemInfo(String str, SuggestedVideoImage suggestedVideoImage, String str2) {
        this.caption = str;
        this.coverImage = suggestedVideoImage;
        this.itemTag = str2;
    }
}
