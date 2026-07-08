package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TiktokV1ImInboxDataGetResponse extends BaseResponse {

    @C09CT("camera_icon")
    public final CameraIconResponseBody cameraIcon;

    @C09CT("property_type")
    public final List<Integer> propertyTypes;

    @C09CT("recent_activities")
    public final RecentActivityResponseBody recentActivity;

    @C09CT("recommendations")
    public final RecommendationResponseBody recommendations;

    @C09CT("suggested_stickers")
    public final SuggestedStickersResponseBody suggestedStickers;

    public TiktokV1ImInboxDataGetResponse() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TiktokV1ImInboxDataGetResponse)) {
            return false;
        }
        TiktokV1ImInboxDataGetResponse tiktokV1ImInboxDataGetResponse = (TiktokV1ImInboxDataGetResponse) obj;
        return Intrinsics.LJFF(this.propertyTypes, tiktokV1ImInboxDataGetResponse.propertyTypes) && Intrinsics.LJFF(this.recommendations, tiktokV1ImInboxDataGetResponse.recommendations) && Intrinsics.LJFF(this.cameraIcon, tiktokV1ImInboxDataGetResponse.cameraIcon) && Intrinsics.LJFF(this.suggestedStickers, tiktokV1ImInboxDataGetResponse.suggestedStickers) && Intrinsics.LJFF(this.recentActivity, tiktokV1ImInboxDataGetResponse.recentActivity);
    }

    public final int hashCode() {
        List<Integer> list = this.propertyTypes;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        RecommendationResponseBody recommendationResponseBody = this.recommendations;
        int iHashCode2 = (iHashCode + (recommendationResponseBody == null ? 0 : recommendationResponseBody.hashCode())) * 31;
        CameraIconResponseBody cameraIconResponseBody = this.cameraIcon;
        int iHashCode3 = (iHashCode2 + (cameraIconResponseBody == null ? 0 : cameraIconResponseBody.hashCode())) * 31;
        SuggestedStickersResponseBody suggestedStickersResponseBody = this.suggestedStickers;
        int iHashCode4 = (iHashCode3 + (suggestedStickersResponseBody == null ? 0 : suggestedStickersResponseBody.hashCode())) * 31;
        RecentActivityResponseBody recentActivityResponseBody = this.recentActivity;
        return iHashCode4 + (recentActivityResponseBody != null ? recentActivityResponseBody.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TiktokV1ImInboxDataGetResponse(propertyTypes=");
        sbLIZ.append(this.propertyTypes);
        sbLIZ.append(", recommendations=");
        sbLIZ.append(this.recommendations);
        sbLIZ.append(", cameraIcon=");
        sbLIZ.append(this.cameraIcon);
        sbLIZ.append(", suggestedStickers=");
        sbLIZ.append(this.suggestedStickers);
        sbLIZ.append(", recentActivity=");
        sbLIZ.append(this.recentActivity);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TiktokV1ImInboxDataGetResponse(List<Integer> list, RecommendationResponseBody recommendationResponseBody, CameraIconResponseBody cameraIconResponseBody, SuggestedStickersResponseBody suggestedStickersResponseBody, RecentActivityResponseBody recentActivityResponseBody) {
        this.propertyTypes = list;
        this.recommendations = recommendationResponseBody;
        this.cameraIcon = cameraIconResponseBody;
        this.suggestedStickers = suggestedStickersResponseBody;
        this.recentActivity = recentActivityResponseBody;
    }
}
