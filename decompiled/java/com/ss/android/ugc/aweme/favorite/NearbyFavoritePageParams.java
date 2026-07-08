package com.ss.android.ugc.aweme.favorite;

import X.C09CT;
import X.C2188811AlT;
import X.EnumC1157530gEB;
import X.InterfaceC2753014t;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.placediscovery.param.NearbyPoiCategoryResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyFavoritePageParams implements Serializable, InterfaceC2753014t {

    @C09CT("category_response")
    public final NearbyPoiCategoryResponse categoryResponse;

    @C09CT(Scene.SCENE_SERVICE)
    public final EnumC1157530gEB scene;

    public NearbyFavoritePageParams() {
        this(null, EnumC1157530gEB.NORMAL_LIST);
    }

    public final NearbyFavoritePageParams copy(NearbyPoiCategoryResponse nearbyPoiCategoryResponse, EnumC1157530gEB enumC1157530gEB) {
        return new NearbyFavoritePageParams(nearbyPoiCategoryResponse, enumC1157530gEB);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyFavoritePageParams)) {
            return false;
        }
        NearbyFavoritePageParams nearbyFavoritePageParams = (NearbyFavoritePageParams) obj;
        return Intrinsics.LJFF(this.categoryResponse, nearbyFavoritePageParams.categoryResponse) && this.scene == nearbyFavoritePageParams.scene;
    }

    public String getSourceId() {
        return "NearbyFavoritePageParams";
    }

    public int hashCode() {
        NearbyPoiCategoryResponse nearbyPoiCategoryResponse = this.categoryResponse;
        return ((nearbyPoiCategoryResponse == null ? 0 : nearbyPoiCategoryResponse.hashCode()) * 31) + this.scene.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NearbyFavoritePageParams(categoryResponse=");
        sbLIZ.append(this.categoryResponse);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final NearbyPoiCategoryResponse getCategoryResponse() {
        return this.categoryResponse;
    }

    public final EnumC1157530gEB getScene() {
        return this.scene;
    }

    public NearbyFavoritePageParams(NearbyPoiCategoryResponse nearbyPoiCategoryResponse, EnumC1157530gEB enumC1157530gEB) {
        this.categoryResponse = nearbyPoiCategoryResponse;
        this.scene = enumC1157530gEB;
    }
}
