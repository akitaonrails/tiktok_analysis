package com.ss.android.ugc.aweme.ml.api;

import X.C0NAL;
import X.C1510130pOt;
import X.C589200N9a;
import X.InterfaceC582820MtU;
import X.InterfaceC588340N5s;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class MLCommonService implements IMLCommonService {
    public static final C589200N9a Companion = new Object() { // from class: X.0N9a
    };
    public static final boolean debug = false;

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void addCommonEventListener(String str, InterfaceC588340N5s interfaceC588340N5s);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void checkAndInit(int i);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ boolean containFlashFeedConfig(String str);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ boolean containTTMFeatureScene(String str);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ InterfaceC582820MtU getAwemeAdapter();

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ JSONObject getCacheFeatureSetVersion();

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ NetworkPartner.RequestHandler getFeatureInsertHandler();

    public abstract /* synthetic */ String getFeedRequestParam();

    public abstract /* synthetic */ void onAppLaunch();

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void onBeforeLoadMore(String str);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void onNotifyCommonEvent(String str, C1510130pOt c1510130pOt);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void onPlayFinishFirst(Aweme aweme, String str);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void onPlayFirstFrame(Aweme aweme, String str);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void onPlayPause(Aweme aweme, String str, boolean z);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void onPlayPrepare(Aweme aweme, String str, String str2, InterfaceC582820MtU interfaceC582820MtU);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void onPlayResume(Aweme aweme, String str);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void onPlayStop(String str, Aweme aweme, String str2);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void onPlayStopCallPlayTime(Aweme aweme, long j, String str);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void onViewPagerSelected(Aweme aweme, String str, int i, JSONObject jSONObject);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void parseFeatureSet(HashMap<String, String> map, n nVar);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void removeCommonEventListener(String str, InterfaceC588340N5s interfaceC588340N5s);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void reportEvent(String str, JSONObject jSONObject);

    public abstract /* synthetic */ void runInMainActivityOnCreate();

    public abstract /* synthetic */ void runInMainActivityOnDestroy();

    public abstract /* synthetic */ void tryInitFeatureCenter();

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void tryInitFeatureCetnerAndFlashCommonConfig();

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void updateFeedItemFeatureInfo(Aweme aweme, Map<String, ? extends Object> map);

    public static final boolean getDebug() {
        Companion.getClass();
        return debug;
    }

    public static final IMLCommonService instance() {
        Companion.getClass();
        return C0NAL.LIZ;
    }
}
