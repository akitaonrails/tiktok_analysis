package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.gift.model.GiftRecommendInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class GiftRecommendationMessage extends AbstractC1136060ffY {

    @C09CT("recommend_infos")
    public Map<Long, GiftRecommendInfo> recommendInfos;

    public GiftRecommendationMessage() {
        this.type = C001A.GIFT_RECOMMENDATION_MESSAGE;
        this.recommendInfos = new LinkedHashMap();
    }
}
