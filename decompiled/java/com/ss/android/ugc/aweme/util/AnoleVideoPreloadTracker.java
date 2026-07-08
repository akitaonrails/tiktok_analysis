package com.ss.android.ugc.aweme.util;

import X.C1004070cEf;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.IAnoleVideoPreloadTracker;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleVideoPreloadTracker implements IAnoleVideoPreloadTracker {
    @Override // com.ss.android.ugc.aweme.IAnoleVideoPreloadTracker
    public final void LIZ(AnoleComponentModel anoleComponentModel, long j, AwemeRawAd awemeRawAd, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("video_id", str);
        linkedHashMap.put("res_url", str2);
        C1004070cEf.LIZ("anole_video_load_skip", anoleComponentModel, j, awemeRawAd, linkedHashMap, 32);
    }

    @Override // com.ss.android.ugc.aweme.IAnoleVideoPreloadTracker
    public final void LIZJ(AnoleComponentModel anoleComponentModel, long j, AwemeRawAd awemeRawAd, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("video_id", str);
        linkedHashMap.put("res_url", str2);
        C1004070cEf.LIZ("anole_video_load_start", anoleComponentModel, j, awemeRawAd, linkedHashMap, 32);
    }

    @Override // com.ss.android.ugc.aweme.IAnoleVideoPreloadTracker
    public final void LIZIZ(boolean z, long j, AnoleComponentModel anoleComponentModel, long j2, AwemeRawAd awemeRawAd, String str, String str2, String str3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trackVideoLoadResult() success = ");
        sbLIZ.append(z);
        sbLIZ.append(", startLoadTime = ");
        sbLIZ.append(j);
        sbLIZ.append(",failReason = ");
        sbLIZ.append(str3);
        C2188811AlT.LIZIZ(sbLIZ);
        long jCurrentTimeMillis = System.currentTimeMillis();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("video_id", str);
        linkedHashMap.put("res_url", str2);
        linkedHashMap.put("is_success", Integer.valueOf(z ? 1 : 0));
        linkedHashMap.put("video_load_start", Long.valueOf(j));
        linkedHashMap.put("video_load_end", Long.valueOf(jCurrentTimeMillis));
        linkedHashMap.put("video_load_duration", Long.valueOf(jCurrentTimeMillis - j));
        linkedHashMap.put("load_failed_reason", str3);
        C1004070cEf.LIZ("anole_video_load_result", anoleComponentModel, j2, awemeRawAd, linkedHashMap, 32);
    }
}
