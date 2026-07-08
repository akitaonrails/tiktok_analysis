package com.ss.android.ugc.aweme.portrait.network;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class PortraitStylesResponse {

    @C09CT("cursor")
    public final Integer cursor;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("aigc_styles")
    public final List<PortraitStyleItem> styles;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PortraitStylesResponse)) {
            return false;
        }
        PortraitStylesResponse portraitStylesResponse = (PortraitStylesResponse) obj;
        return Intrinsics.LJFF(this.styles, portraitStylesResponse.styles) && Intrinsics.LJFF(this.cursor, portraitStylesResponse.cursor) && Intrinsics.LJFF(this.hasMore, portraitStylesResponse.hasMore);
    }

    public final int hashCode() {
        List<PortraitStyleItem> list = this.styles;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.cursor;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.hasMore;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PortraitStylesResponse(styles=");
        sbLIZ.append(this.styles);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PortraitStylesResponse(List<PortraitStyleItem> list, Integer num, Boolean bool) {
        this.styles = list;
        this.cursor = num;
        this.hasMore = bool;
    }
}
