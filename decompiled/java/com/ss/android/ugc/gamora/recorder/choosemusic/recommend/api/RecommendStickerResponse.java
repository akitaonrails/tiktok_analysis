package com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class RecommendStickerResponse extends BaseResponse {

    @C09CT("effect_info")
    public final List<Effect> recommendStickerList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecommendStickerResponse) && Intrinsics.LJFF(this.recommendStickerList, ((RecommendStickerResponse) obj).recommendStickerList);
    }

    public final int hashCode() {
        return this.recommendStickerList.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendStickerResponse(recommendStickerList=");
        sbLIZ.append(this.recommendStickerList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendStickerResponse(List<? extends Effect> list) {
        this.recommendStickerList = list;
    }
}
