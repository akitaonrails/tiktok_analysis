package com.ttkmedia.datacenter.settings;

import X.AbstractC1309040kAY;
import X.C0W9W;
import X.C1306900k76;
import X.C1307030k7J;
import X.C1308970kAR;
import X.C1309070kAb;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1308150k97;
import X.InterfaceC1307040k7K;
import X.InterfaceC1308990kAT;
import X.InterfaceC1309140kAi;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.android.starship.strategy.DecisionConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class StarShipFetcher implements InterfaceC1309140kAi {
    public long mConfigVersion;
    public long mFetchCount;
    public int mFetchVideoRetryTimes;
    public long mLastFetchTime;
    public final InterfaceC1308990kAT mListener;
    public boolean mOpenDebug;
    public int mMaxRetryTimes = 10;
    public int mFetchInterval = 86400;
    public int mMaxFetchTimes = 100;
    public final int mRetryDelay = 5;

    public static JSONObject getLiveConfig() {
        try {
            Map<String, DecisionConfig> mapLIZ = C1306900k76.LIZIZ.LIZ("live");
            if (mapLIZ == null || mapLIZ.isEmpty()) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, DecisionConfig> entry : mapLIZ.entrySet()) {
                String key = entry.getKey();
                DecisionConfig value = entry.getValue();
                EnumC1308150k97 enumC1308150k97 = value.type;
                if (enumC1308150k97 == EnumC1308150k97.LEGACY_JSON_OBJECT || enumC1308150k97 == EnumC1308150k97.JSON_OBJECT) {
                    Object obj = value.data;
                    jSONObject.put(key, obj instanceof JSONObject ? (JSONObject) obj : new JSONObject(String.valueOf(obj)));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[Starship] result put key:");
                    sbLIZ.append(key);
                    C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[Starship] Unsupported types key:");
                    sbLIZ2.append(key);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("[Starship] result:");
            sbLIZ3.append(C786410Ut5.J3(jSONObject));
            C2188811AlT.LIZIZ(sbLIZ3);
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC1309140kAi
    public InterfaceC1309140kAi setNet(AbstractC1309040kAY abstractC1309040kAY) {
        return this;
    }

    public static JSONObject getExtraConfig() {
        DecisionConfig decisionConfig;
        Object obj;
        EnumC1308150k97 enumC1308150k97;
        try {
            JSONObject jSONObject = new JSONObject();
            Map<String, DecisionConfig> mapLIZ = C1306900k76.LIZIZ.LIZ("vod");
            if (mapLIZ != null && mapLIZ.containsKey("multi_media_fetch_config") && (decisionConfig = mapLIZ.get("multi_media_fetch_config")) != null && (obj = decisionConfig.data) != null && ((enumC1308150k97 = decisionConfig.type) == EnumC1308150k97.LEGACY_JSON_OBJECT || enumC1308150k97 == EnumC1308150k97.JSON_OBJECT)) {
                jSONObject = (JSONObject) obj;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get extra config: ");
            sbLIZ.append(C786410Ut5.J3(jSONObject));
            C2188811AlT.LIZIZ(sbLIZ);
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" get extra config failed: ");
            sbLIZ2.append(e.toString());
            C2188811AlT.LIZIZ(sbLIZ2);
            return null;
        }
    }

    public static JSONObject updateLiveConfig() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("live_stream_strategy_engine");
        jSONObject.put("live_project_keys", jSONArray);
        jSONObject.put("webcast_sdk_version", "3810");
        ArrayList arrayList = new ArrayList();
        arrayList.add("live");
        JSONObject jSONObject2 = new JSONObject();
        C1306900k76.LIZIZ.LIZIZ(jSONObject, arrayList, new InterfaceC1307040k7K() { // from class: X.0kAQ
            @Override // X.InterfaceC1307040k7K
            public final void LIZ(C1307030k7J c1307030k7J) {
            }
        });
        return jSONObject2;
    }

    public int getFetchInterval() {
        return this.mFetchInterval;
    }

    public StarShipFetcher(InterfaceC1308990kAT interfaceC1308990kAT) {
        this.mListener = interfaceC1308990kAT;
    }

    public static JSONObject getVodConfig(List<String> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : list) {
                C1306900k76 c1306900k76 = C1306900k76.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("vod.");
                sbLIZ.append(str);
                Map<String, DecisionConfig> mapLIZ = c1306900k76.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                if (!mapLIZ.isEmpty()) {
                    jSONObject.put(str, _convertConfig(str, mapLIZ));
                }
            }
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" get vod config failed: ");
            sbLIZ2.append(e.toString());
            C2188811AlT.LIZIZ(sbLIZ2);
            return null;
        }
    }

    @Override // X.InterfaceC1309140kAi
    public InterfaceC1309140kAi setConfigVersion(long j) {
        this.mConfigVersion = j;
        return this;
    }

    @Override // X.InterfaceC1309140kAi
    public InterfaceC1309140kAi setDebug(boolean z) {
        this.mOpenDebug = z;
        return this;
    }

    @Override // X.InterfaceC1309140kAi
    public InterfaceC1309140kAi setFetchInterval(int i) {
        this.mFetchInterval = i;
        return this;
    }

    @Override // X.InterfaceC1309140kAi
    public InterfaceC1309140kAi setMaxFetchTimes(int i) {
        this.mMaxFetchTimes = i;
        return this;
    }

    public InterfaceC1309140kAi setMaxRetryTimes(int i) {
        this.mMaxRetryTimes = i;
        return this;
    }

    public static /* synthetic */ void LIZIZ(C1307030k7J c1307030k7J) {
    }

    public static /* synthetic */ void lambda$updateLiveConfig$1(C1307030k7J c1307030k7J) {
    }

    public static JSONArray _convertConfig(String str, Map<String, DecisionConfig> map) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (Map.Entry<String, DecisionConfig> entry : map.entrySet()) {
                entry.getKey();
                DecisionConfig value = entry.getValue();
                EnumC1308150k97 enumC1308150k97 = value.type;
                if (enumC1308150k97 == EnumC1308150k97.LEGACY_JSON_OBJECT || enumC1308150k97 == EnumC1308150k97.JSON_OBJECT) {
                    jSONArray.put(new JSONObject(value.data.toString()));
                }
            }
            return jSONArray;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private void fetchIfNeeded(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try to fetch, module = ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.mLastFetchTime;
        if (j < 1 || jCurrentTimeMillis - j >= ((long) this.mFetchInterval) * 1000) {
            startFetch(str, str2);
        }
    }

    public void startFetch(final String str, final String str2) {
        int i = this.mMaxFetchTimes;
        if (i > 0 && this.mFetchCount > i) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetch reach max count, maxFetchTimes = ");
            sbLIZ.append(this.mMaxFetchTimes);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        long j = this.mFetchCount;
        if (j == Long.MAX_VALUE) {
            this.mFetchCount = 1L;
        } else {
            this.mFetchCount = j + 1;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("start to fetch, module = ");
        sbLIZ2.append(str);
        sbLIZ2.append(", fetch count = ");
        sbLIZ2.append(this.mFetchCount);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (TextUtils.isEmpty(C1308970kAR.LIZIZ(C1308970kAR.LIZJ))) {
            InterfaceC1308990kAT interfaceC1308990kAT = this.mListener;
            if (interfaceC1308990kAT != null) {
                ((C1309070kAb) interfaceC1308990kAT).LIZ(-998, "host is null");
                return;
            }
            return;
        }
        this.mFetchVideoRetryTimes++;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("caller_name", "datacenter");
            jSONObject.put("platform", "2");
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("os_api", String.valueOf(Build.VERSION.SDK_INT));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("");
            sbLIZ3.append(this.mConfigVersion);
            jSONObject.put("config_version", C2188811AlT.LIZIZ(sbLIZ3));
            if (!jSONObject.has("device_brand")) {
                jSONObject.put("device_brand", Build.BRAND);
            }
            if (!jSONObject.has("device_type")) {
                jSONObject.put("device_type", Build.MODEL.toLowerCase());
            }
            if (!TextUtils.isEmpty(str) && !str.equals("all")) {
                jSONObject.put("module", str);
            }
            if (this.mOpenDebug) {
                jSONObject.put("debug", "1");
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("config_key", str2);
            }
            if (C1308970kAR.LIZ(C1308970kAR.LIZLLL) != null) {
                for (Map.Entry<String, String> entry : C1308970kAR.LIZ(C1308970kAR.LIZLLL).entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            if (C1308970kAR.LIZ(C1308970kAR.LJ) != null) {
                for (Map.Entry<String, String> entry2 : C1308970kAR.LIZ(C1308970kAR.LJ).entrySet()) {
                    jSONObject.put(entry2.getKey(), entry2.getValue());
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        if (!TextUtils.isEmpty(str) && !str.equals("all")) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("vod.");
            sbLIZ4.append(str);
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ4));
            arrayList2.add(str);
        } else {
            arrayList.add("vod");
            arrayList2.add("playback");
            arrayList2.add("mdl");
        }
        try {
            C1306900k76.LIZIZ.LIZIZ(jSONObject, arrayList, new InterfaceC1307040k7K() { // from class: X.0kAS
                @Override // X.InterfaceC1307040k7K
                public final void LIZ(C1307030k7J c1307030k7J) {
                    this.LIZ.lambda$startFetch$0(arrayList2, str, str2, c1307030k7J);
                }
            });
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(" update config failed: ");
            sbLIZ5.append(e2.toString());
            C2188811AlT.LIZIZ(sbLIZ5);
        }
    }

    private void delayFetch(final String str, final String str2, long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("retry fetch, count = ");
        sbLIZ.append(this.mFetchCount);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.mFetchVideoRetryTimes > this.mMaxRetryTimes) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fetch fail, module = ");
            sbLIZ2.append(str);
            sbLIZ2.append(", retry times = ");
            sbLIZ2.append(this.mFetchVideoRetryTimes);
            C2188811AlT.LIZIZ(sbLIZ2);
            InterfaceC1308990kAT interfaceC1308990kAT = this.mListener;
            if (interfaceC1308990kAT != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("fetch fail. try times = ");
                sbLIZ3.append(this.mFetchVideoRetryTimes);
                sbLIZ3.append(", max = ");
                sbLIZ3.append(this.mMaxRetryTimes);
                ((C1309070kAb) interfaceC1308990kAT).LIZ(-999, C2188811AlT.LIZIZ(sbLIZ3));
            }
            this.mFetchVideoRetryTimes = 0;
            return;
        }
        new PthreadTimer("StarShipFetcher").schedule(new C0W9W() { // from class: X.0T5J
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("StarShipFetcher@7f53.delayFetch$1");
                boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                try {
                    this.LLILLL.startFetch(str, str2);
                } finally {
                }
                if (zLJ) {
                    C0W9U.LJFF();
                }
                C1C7U.LIZIZ("StarShipFetcher@7f53.delayFetch$1");
            }
        }, j * 1000);
    }

    @Override // X.InterfaceC1309140kAi
    public void fetch(String str, String str2, boolean z) {
        this.mFetchVideoRetryTimes = 0;
        if (z) {
            startFetch(str, str2);
        } else {
            fetchIfNeeded(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startFetch$0(ArrayList arrayList, String str, String str2, C1307030k7J c1307030k7J) {
        JSONObject extraConfig;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" process fetch callback, suc: ");
        sbLIZ.append(c1307030k7J.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1307030k7J.LIZ) {
            this.mLastFetchTime = System.currentTimeMillis();
            JSONObject jSONObject = null;
            try {
                JSONObject vodConfig = getVodConfig(arrayList);
                extraConfig = getExtraConfig();
                if (vodConfig != null) {
                    try {
                        if (vodConfig.length() > 0) {
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put("vod", vodConfig);
                                jSONObject = jSONObject2;
                            } catch (Exception e) {
                                e = e;
                                jSONObject = jSONObject2;
                                TryCatchGuardChecker.doCheck(e);
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("exception: ");
                                sbLIZ2.append(e.toString());
                                C2188811AlT.LIZIZ(sbLIZ2);
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                extraConfig = null;
            }
            if (this.mOpenDebug) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("fetch suc, fetch count = ");
                sbLIZ3.append(this.mFetchCount);
                sbLIZ3.append(", response = ");
                sbLIZ3.append(C786410Ut5.J3(jSONObject));
                C2188811AlT.LIZIZ(sbLIZ3);
            }
            InterfaceC1308990kAT interfaceC1308990kAT = this.mListener;
            if (interfaceC1308990kAT != null) {
                ((C1309070kAb) interfaceC1308990kAT).LIZIZ(0, "starship config", jSONObject, extraConfig, str, str2);
                return;
            }
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("fetch config failed: ");
        sbLIZ4.append(c1307030k7J.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ4);
        delayFetch(str, str2, 5L);
    }
}
