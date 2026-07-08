package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class DynamicPhotoEcommerceDataResponse implements Serializable {

    @C09CT("interaction_stickers")
    public final List<InteractStickerStruct> interactionStickers;

    public DynamicPhotoEcommerceDataResponse() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DynamicPhotoEcommerceDataResponse) && Intrinsics.LJFF(this.interactionStickers, ((DynamicPhotoEcommerceDataResponse) obj).interactionStickers);
    }

    public int hashCode() {
        List<InteractStickerStruct> list = this.interactionStickers;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicPhotoEcommerceDataResponse(interactionStickers=");
        sbLIZ.append(this.interactionStickers);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DynamicPhotoEcommerceDataResponse(List<? extends InteractStickerStruct> list) {
        this.interactionStickers = list;
    }
}
