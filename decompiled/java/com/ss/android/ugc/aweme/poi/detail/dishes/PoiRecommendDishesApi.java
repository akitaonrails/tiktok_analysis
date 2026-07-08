package com.ss.android.ugc.aweme.poi.detail.dishes;

import X.C09CT;
import X.C1182970gtD;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes19.dex */
public interface PoiRecommendDishesApi {
    public static final C1182970gtD LIZ = C1182970gtD.LIZ;

    @InterfaceC1501200pAU("/tiktok/poi/recommend_dish/like/v1")
    Object LIZ(@InterfaceC1501120pAM("dish_id") String str, @InterfaceC1501120pAM("action") int i, @InterfaceC1501120pAM("poi_id") String str2, InterfaceC1364105Vn<? super LikeDishResponse> interfaceC1364105Vn);

    /* JADX INFO: loaded from: classes10.dex */
    public static final class LikeDishResponse extends BaseResponse {

        @C09CT("duplicated")
        public final boolean duplicated;

        @C09CT("success")
        public final boolean success;

        public LikeDishResponse() {
            this(false, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LikeDishResponse)) {
                return false;
            }
            LikeDishResponse likeDishResponse = (LikeDishResponse) obj;
            return this.success == likeDishResponse.success && this.duplicated == likeDishResponse.duplicated;
        }

        public final int hashCode() {
            return (C786410Ut5.Z2(this.success) * 31) + C786410Ut5.Z2(this.duplicated);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LikeDishResponse(success=");
            sbLIZ.append(this.success);
            sbLIZ.append(", duplicated=");
            sbLIZ.append(this.duplicated);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public LikeDishResponse(boolean z, boolean z2) {
            this.success = z;
            this.duplicated = z2;
        }
    }
}
