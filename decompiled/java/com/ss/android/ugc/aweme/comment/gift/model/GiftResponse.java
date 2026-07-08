package com.ss.android.ugc.aweme.comment.gift.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class GiftResponse extends BaseResponse {
    public static final int $stable = 8;

    @C09CT("cpc_prompt_data")
    public final CPCPromptData cpcPromptData;

    @C09CT("data")
    public final GiftResult giftPageList;

    public final GiftResponse copy(GiftResult giftResult, CPCPromptData cPCPromptData) {
        return new GiftResponse(giftResult, cPCPromptData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftResponse)) {
            return false;
        }
        GiftResponse giftResponse = (GiftResponse) obj;
        return Intrinsics.LJFF(this.giftPageList, giftResponse.giftPageList) && Intrinsics.LJFF(this.cpcPromptData, giftResponse.cpcPromptData);
    }

    public int hashCode() {
        GiftResult giftResult = this.giftPageList;
        int iHashCode = (giftResult == null ? 0 : giftResult.hashCode()) * 31;
        CPCPromptData cPCPromptData = this.cpcPromptData;
        return iHashCode + (cPCPromptData != null ? cPCPromptData.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftResponse(giftPageList=");
        sbLIZ.append(this.giftPageList);
        sbLIZ.append(", cpcPromptData=");
        sbLIZ.append(this.cpcPromptData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final CPCPromptData getCpcPromptData() {
        return this.cpcPromptData;
    }

    public final GiftResult getGiftPageList() {
        return this.giftPageList;
    }

    public GiftResponse(GiftResult giftResult, CPCPromptData cPCPromptData) {
        this.giftPageList = giftResult;
        this.cpcPromptData = cPCPromptData;
    }
}
