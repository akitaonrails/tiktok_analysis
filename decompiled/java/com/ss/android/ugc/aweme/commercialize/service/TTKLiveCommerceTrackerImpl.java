package com.ss.android.ugc.aweme.commercialize.service;

import X.C04UF;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class TTKLiveCommerceTrackerImpl implements TTKLiveCommerceTracker {
    @Override // com.ss.android.ugc.aweme.commercialize.service.TTKLiveCommerceTracker
    public final Map<String, Object> LIZ(Aweme aweme) {
        String str;
        Long adId;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (((Boolean) C04UF.LIZ.getValue()).booleanValue()) {
            boolean z = true;
            if (aweme.isAd()) {
                str = "1";
            } else {
                z = false;
                str = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_ad", str);
            if (z) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                Long creativeId = null;
                if (awemeRawAd != null) {
                    adId = awemeRawAd.getAdId();
                } else {
                    adId = null;
                }
                linkedHashMap.put("ad_id", adId);
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 != null) {
                    creativeId = awemeRawAd2.getCreativeId();
                }
                linkedHashMap.put("creative_id", creativeId);
            }
        }
        return linkedHashMap;
    }
}
