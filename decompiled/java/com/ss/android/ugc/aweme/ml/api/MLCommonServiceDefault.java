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
public final class MLCommonServiceDefault extends MLCommonService {
    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void addCommonEventListener(String str, InterfaceC588340N5s interfaceC588340N5s) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void checkAndInit(int i) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final boolean containFlashFeedConfig(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final boolean containTTMFeatureScene(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final InterfaceC582820MtU getAwemeAdapter() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final NetworkPartner.RequestHandler getFeatureInsertHandler() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService
    public final String getFeedRequestParam() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService
    public final void onAppLaunch() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onBeforeLoadMore(String str) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onNotifyCommonEvent(String str, C1510130pOt c1510130pOt) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayFinishFirst(Aweme aweme, String str) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayFirstFrame(Aweme aweme, String str) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayPause(Aweme aweme, String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayPrepare(Aweme aweme, String str, String str2, InterfaceC582820MtU interfaceC582820MtU) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayResume(Aweme aweme, String str) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayStop(String str, Aweme aweme, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayStopCallPlayTime(Aweme aweme, long j, String str) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onViewPagerSelected(Aweme aweme, String str, int i, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void parseFeatureSet(HashMap<String, String> map, n nVar) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void removeCommonEventListener(String str, InterfaceC588340N5s interfaceC588340N5s) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void reportEvent(String str, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService
    public final void runInMainActivityOnCreate() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService
    public final void runInMainActivityOnDestroy() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService
    public final void tryInitFeatureCenter() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void tryInitFeatureCetnerAndFlashCommonConfig() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void updateFeedItemFeatureInfo(Aweme aweme, Map<String, ? extends Object> map) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final JSONObject getCacheFeatureSetVersion() {
        return new JSONObject();
    }
}
