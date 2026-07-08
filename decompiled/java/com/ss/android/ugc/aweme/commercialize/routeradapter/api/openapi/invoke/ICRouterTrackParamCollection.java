package com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public interface ICRouterTrackParamCollection {
    void LIZ(Aweme aweme, Map<String, Object> map, long j, String str);

    void LIZIZ(Aweme aweme, Map<String, Object> map, String str, String str2, boolean z);

    void LIZJ(Aweme aweme, Map<String, Object> map, long j);

    void LIZLLL(Aweme aweme, Map<String, Object> map);

    boolean isChattingMessageUri(String str);
}
