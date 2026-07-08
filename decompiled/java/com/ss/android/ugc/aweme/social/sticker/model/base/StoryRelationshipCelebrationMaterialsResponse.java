package com.ss.android.ugc.aweme.social.sticker.model.base;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.social.sticker.model.StorySocialEventStickerData;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class StoryRelationshipCelebrationMaterialsResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("materials")
    public final Map<String, StorySocialEventStickerData> materials;

    public final StoryRelationshipCelebrationMaterialsResponse copy(Map<String, StorySocialEventStickerData> map) {
        return new StoryRelationshipCelebrationMaterialsResponse(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoryRelationshipCelebrationMaterialsResponse) && Intrinsics.LJFF(this.materials, ((StoryRelationshipCelebrationMaterialsResponse) obj).materials);
    }

    public int hashCode() {
        return this.materials.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryRelationshipCelebrationMaterialsResponse(materials=");
        sbLIZ.append(this.materials);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StoryRelationshipCelebrationMaterialsResponse() {
        this(C2097608Jq.LJ());
    }

    public final Map<String, StorySocialEventStickerData> getMaterials() {
        return this.materials;
    }

    public StoryRelationshipCelebrationMaterialsResponse(Map<String, StorySocialEventStickerData> map) {
        this.materials = map;
    }
}
