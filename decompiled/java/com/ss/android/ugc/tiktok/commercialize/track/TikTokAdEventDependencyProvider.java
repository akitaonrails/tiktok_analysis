package com.ss.android.ugc.tiktok.commercialize.track;

import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public interface TikTokAdEventDependencyProvider {
    void LIZ(String str, String str2, String str3, String str4, String str5, Map<String, ? extends Object> map);

    AwemeRawAd LIZIZ(Aweme aweme);

    void LIZJ(String str, String str2, CommonAdData commonAdData, Map<String, ? extends Object> map);
}
