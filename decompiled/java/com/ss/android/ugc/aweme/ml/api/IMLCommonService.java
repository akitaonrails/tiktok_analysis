package com.ss.android.ugc.aweme.ml.api;

import X.C1510130pOt;
import X.InterfaceC582820MtU;
import X.InterfaceC588340N5s;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public interface IMLCommonService {
    void addCommonEventListener(String str, InterfaceC588340N5s interfaceC588340N5s);

    void checkAndInit(int i);

    boolean containFlashFeedConfig(String str);

    boolean containTTMFeatureScene(String str);

    InterfaceC582820MtU getAwemeAdapter();

    JSONObject getCacheFeatureSetVersion();

    NetworkPartner.RequestHandler getFeatureInsertHandler();

    void onBeforeLoadMore(String str);

    void onNotifyCommonEvent(String str, C1510130pOt c1510130pOt);

    void onPlayFinishFirst(Aweme aweme, String str);

    void onPlayFirstFrame(Aweme aweme, String str);

    void onPlayPause(Aweme aweme, String str, boolean z);

    void onPlayPrepare(Aweme aweme, String str, String str2, InterfaceC582820MtU interfaceC582820MtU);

    void onPlayResume(Aweme aweme, String str);

    void onPlayStop(String str, Aweme aweme, String str2);

    void onPlayStopCallPlayTime(Aweme aweme, long j, String str);

    void onViewPagerSelected(Aweme aweme, String str, int i, JSONObject jSONObject);

    void parseFeatureSet(HashMap<String, String> map, n nVar);

    void removeCommonEventListener(String str, InterfaceC588340N5s interfaceC588340N5s);

    void reportEvent(String str, JSONObject jSONObject);

    void tryInitFeatureCetnerAndFlashCommonConfig();

    void updateFeedItemFeatureInfo(Aweme aweme, Map<String, ? extends Object> map);
}
