package com.ss.android.ugc.aweme.im.sticker.api.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TypingRecommendationBlocklistResponse extends BaseResponse {

    @C09CT("sticker_ids")
    public final List<String> stickerIds;

    public TypingRecommendationBlocklistResponse() {
        this(null, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TypingRecommendationBlocklistResponse) && Intrinsics.LJFF(this.stickerIds, ((TypingRecommendationBlocklistResponse) obj).stickerIds);
    }

    public final int hashCode() {
        return this.stickerIds.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TypingRecommendationBlocklistResponse(stickerIds=");
        sbLIZ.append(this.stickerIds);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TypingRecommendationBlocklistResponse(List<String> list) {
        this.stickerIds = list;
    }

    public TypingRecommendationBlocklistResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
