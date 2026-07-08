package com.ss.android.ugc.aweme.simreporter.service;

import X.C1481340oeS;
import X.C1481560oeo;
import X.C1481580oeq;
import X.C1481690of1;
import X.C1481720of4;
import X.C1481790ofB;
import X.C585520Mxq;
import X.InterfaceC1482240ofu;
import X.InterfaceC1482510ogL;
import com.ss.android.ugc.aweme.playereventreporter.VideoInfo;
import com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public interface IPlayerEventReportService {
    public static final C1481790ofB LIZ = C1481790ofB.LIZ;

    void initConfig(ISimReporterConfig iSimReporterConfig);

    void reportEngineOnePlay(String str, JSONObject jSONObject);

    void reportPlayFailed(String str, Callable<C1481720of4> callable, HashMap<String, Object> map, Callable<HashMap<String, Object>> callable2, boolean z);

    void reportRenderFirstFrame(String str, Callable<C1481560oeo> callable, HashMap<String, Object> map, Callable<HashMap<String, Object>> callable2, boolean z);

    void reportSeekEnd(String str);

    void reportSeekStart(String str, double d);

    void reportVideoBuffering(String str, boolean z, boolean z2, Callable<C1481690of1> callable, InterfaceC1482510ogL interfaceC1482510ogL);

    void reportVideoOnResume(String str, VideoInfo videoInfo);

    void reportVideoPause(String str, C585520Mxq c585520Mxq);

    void reportVideoPause(String str, Callable<C1481690of1> callable, C585520Mxq c585520Mxq);

    void reportVideoPlayStart(String str, Callable<C1481580oeq> callable);

    void reportVideoPlaying(String str);

    void reportVideoStop(String str, Callable<C1481340oeS> callable, HashMap<String, Object> map, Callable<HashMap<String, Object>> callable2, boolean z);

    void setTaskIScheduler(InterfaceC1482240ofu interfaceC1482240ofu);
}
