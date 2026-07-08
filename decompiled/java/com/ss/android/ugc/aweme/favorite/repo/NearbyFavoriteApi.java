package com.ss.android.ugc.aweme.favorite.repo;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public interface NearbyFavoriteApi {
    @InterfaceC1501200pAU("/tiktok/poi/collections/v1")
    Object LIZ(@InterfaceC1501120pAM("cursor") int i, @InterfaceC1501120pAM("count") int i2, @InterfaceC1501120pAM("enter_from") String str, InterfaceC1364105Vn<? super NearbyFavoriteListResponse> interfaceC1364105Vn);

    public static final class NearbyFavoriteListResponse extends BaseResponse {

        @C09CT("cursor")
        public final int cursor;

        @C09CT("has_more")
        public final int hasMore;

        @C09CT("poi_list")
        public final List<PoiDetail> poiList;

        public NearbyFavoriteListResponse() {
            this(0, null, 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NearbyFavoriteListResponse)) {
                return false;
            }
            NearbyFavoriteListResponse nearbyFavoriteListResponse = (NearbyFavoriteListResponse) obj;
            return this.cursor == nearbyFavoriteListResponse.cursor && Intrinsics.LJFF(this.poiList, nearbyFavoriteListResponse.poiList) && this.hasMore == nearbyFavoriteListResponse.hasMore;
        }

        public final int hashCode() {
            int i = this.cursor * 31;
            List<PoiDetail> list = this.poiList;
            return ((i + (list == null ? 0 : list.hashCode())) * 31) + this.hasMore;
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NearbyFavoriteListResponse(cursor=");
            sbLIZ.append(this.cursor);
            sbLIZ.append(", poiList=");
            sbLIZ.append(this.poiList);
            sbLIZ.append(", hasMore=");
            sbLIZ.append(this.hasMore);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public NearbyFavoriteListResponse(int i, List<PoiDetail> list, int i2) {
            this.cursor = i;
            this.poiList = list;
            this.hasMore = i2;
        }
    }

    public static final class PoiDetail {

        @C09CT("location")
        public final PoiLocation location;

        @C09CT("formatted_address")
        public final String poiAddress;

        @C09CT("poi_id")
        public final String poiId;

        @C09CT("poi_info_source")
        public final String poiInfoSource;

        @C09CT("poi_name")
        public final String poiName;

        @C09CT("type_level")
        public final String typeLevel;

        public PoiDetail() {
            this(null, null, null, null, null, null);
        }

        public PoiDetail(String str, String str2, String str3, PoiLocation poiLocation, String str4, String str5) {
            this.poiName = str;
            this.poiAddress = str2;
            this.poiId = str3;
            this.location = poiLocation;
            this.typeLevel = str4;
            this.poiInfoSource = str5;
        }
    }
}
