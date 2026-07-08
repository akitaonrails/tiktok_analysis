package com.ss.android.ugc.aweme.im.sticker.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.common.model.IMStickerSetItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class GetAvatarDuoResp extends BaseResponse {

    @C09CT("sticker_set")
    public final IMStickerSetItem setInfo;

    public GetAvatarDuoResp() {
        this(null);
    }

    public final GetAvatarDuoResp copy(IMStickerSetItem iMStickerSetItem) {
        return new GetAvatarDuoResp(iMStickerSetItem);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetAvatarDuoResp) && Intrinsics.LJFF(this.setInfo, ((GetAvatarDuoResp) obj).setInfo);
    }

    public int hashCode() {
        IMStickerSetItem iMStickerSetItem = this.setInfo;
        if (iMStickerSetItem == null) {
            return 0;
        }
        return iMStickerSetItem.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetAvatarDuoResp(setInfo=");
        sbLIZ.append(this.setInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final IMStickerSetItem getSetInfo() {
        return this.setInfo;
    }

    public GetAvatarDuoResp(IMStickerSetItem iMStickerSetItem) {
        this.setInfo = iMStickerSetItem;
    }
}
