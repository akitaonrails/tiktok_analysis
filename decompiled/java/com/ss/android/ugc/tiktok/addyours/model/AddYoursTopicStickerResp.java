package com.ss.android.ugc.tiktok.addyours.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class AddYoursTopicStickerResp extends BaseResponse {

    @C09CT("sticker")
    public final AddYoursStickerStruct sticker;

    public AddYoursTopicStickerResp() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddYoursTopicStickerResp) && Intrinsics.LJFF(this.sticker, ((AddYoursTopicStickerResp) obj).sticker);
    }

    public final int hashCode() {
        AddYoursStickerStruct addYoursStickerStruct = this.sticker;
        if (addYoursStickerStruct == null) {
            return 0;
        }
        return addYoursStickerStruct.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddYoursTopicStickerResp(sticker=");
        sbLIZ.append(this.sticker);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AddYoursTopicStickerResp(AddYoursStickerStruct addYoursStickerStruct) {
        this.sticker = addYoursStickerStruct;
    }
}
