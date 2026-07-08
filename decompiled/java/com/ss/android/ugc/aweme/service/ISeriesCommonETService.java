package com.ss.android.ugc.aweme.service;

import X.C1612610s4B;
import X.C718550SGn;
import X.EnumC1612540s44;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public interface ISeriesCommonETService {
    public static final C718550SGn LIZ = C718550SGn.LIZ;

    <T> T appendPaidContentFcpComponentParam(Aweme aweme, T t);

    <T> T appendPaidContentParam(Aweme aweme, T t);

    <T> T appendPaidContentParamForVideoPlay(Aweme aweme, T t);

    Map<String, Object> appendPaidContentParamForVideoRequest(Aweme aweme, String str);

    <T> T appendSeriesInnerFeedMobParam(Aweme aweme, T t);

    void clearFirstPlayStateForCollection(String str);

    C1612610s4B getCurrentContext();

    Pair<String, String> getDramaDNUVideoLoginContext();

    Map<String, String> getPaidContentInnerFeedSourceParam(Aweme aweme);

    EnumC1612540s44 getPlayVideoType();

    String getSeriesEnterEntrance();

    String getSeriesEnterEntrance(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str2);

    String getSeriesVideoType(Aweme aweme);

    void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    void pushSeriesContext(C1612610s4B c1612610s4B);

    void removeSeriesContext(String str);

    void setCommonETParams(C1612610s4B c1612610s4B);

    void setDramaTabETParam(Map<String, String> map);
}
