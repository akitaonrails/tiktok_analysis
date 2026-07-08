package com.ss.android.ugc.aweme.ml.feature;

import X.AbstractC19994813Le;
import X.C09CT;
import X.C0C64;
import X.C0NAL;
import X.C1337780kuu;
import X.C1349505Px;
import X.C13LP;
import X.C1509290pNX;
import X.C1509310pNZ;
import X.C1510050pOl;
import X.C1510130pOt;
import X.C1510150pOv;
import X.C1510230pP3;
import X.C1511690pRP;
import X.C1512130pS7;
import X.C1512190pSD;
import X.C198400pa;
import X.C20684815ws;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1510030pOj;
import X.InterfaceC588340N5s;
import Y.ARunnableS123S0100000_23;
import Y.ARunnableS6S2200000_23;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig;
import com.ss.android.ugc.aweme.ml.ab.SmartDataTrackConfig;
import com.ss.android.ugc.aweme.ml.ab.TriggerEventInfo;
import com.ss.android.ugc.aweme.ml.api.IMLDataCenterService;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.aweme.ml.api.MLDataCenterService;
import com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartDataTrackerServiceImpl extends SmartDataTrackerService implements InterfaceC588340N5s, InterfaceC1510030pOj {
    public static final /* synthetic */ int LJIIJ = 0;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public final Map<String, C1512130pS7> LIZIZ = new ConcurrentHashMap();
    public final HashSet<String> LJIIIZ = new HashSet<>();

    public static final class SaveContent {

        @C09CT("list")
        public List<SaveContentItem> list;
    }

    public static final class SaveContentItem {

        @C09CT("data")
        public TrackerMonitorData data;

        @C09CT(Scene.SCENE_SERVICE)
        public String scene;
    }

    public static final class TrackerMonitorData {
        public boolean LIZ;

        @C09CT("jsonData")
        public JSONObject jsonData;

        @C09CT("key")
        public String key;

        @C09CT("waitNextRealCnt")
        public int waitNextRealCnt;

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("(key:");
            sbLIZ.append(this.key);
            sbLIZ.append(", waitNextRealCnt=");
            sbLIZ.append(this.waitNextRealCnt);
            sbLIZ.append(", jsonData=");
            sbLIZ.append(this.jsonData);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService, com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public final void checkAndInit() {
        List<OneSmartDataTrackConfig> configList;
        if (this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        SmartDataTrackerService.Companion.getClass();
        if (SmartDataTrackerService.debug) {
            System.currentTimeMillis();
        }
        if (!C1512190pSD.LIZ) {
            C1512190pSD.LIZIZ = (SmartDataTrackConfig) C0C64.LJIILLIIL().LJJII(SmartDataTrackConfig.class, null, "smart_data_track_config_v2", true);
            C1512190pSD.LIZ = true;
        }
        SmartDataTrackConfig smartDataTrackConfig = C1512190pSD.LIZIZ;
        if (smartDataTrackConfig != null && (configList = smartDataTrackConfig.getConfigList()) != null) {
            Iterator<OneSmartDataTrackConfig> it2 = configList.iterator();
            while (it2.hasNext()) {
                configOneNewTrack(it2.next());
            }
        }
        C1511690pRP.LIZIZ(new ARunnableS123S0100000_23(this, 31));
        SmartDataTrackerService.Companion.getClass();
    }

    @Override // X.InterfaceC1510030pOj
    public final Set<String> events() {
        return this.LJIIIZ;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService, com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public final void configOneNewTrack(OneSmartDataTrackConfig oneSmartDataTrackConfig) {
        String scene;
        String str;
        String str2;
        SmartDataTrackerService.Companion.getClass();
        if (oneSmartDataTrackConfig == null || (scene = oneSmartDataTrackConfig.getScene()) == null || ((ConcurrentHashMap) this.LIZIZ).containsKey(scene)) {
            return;
        }
        C1512130pS7 c1512130pS7 = new C1512130pS7(scene, oneSmartDataTrackConfig);
        ((ConcurrentHashMap) this.LIZIZ).put(scene, c1512130pS7);
        MLDataCenterService.Companion.getClass();
        IMLDataCenterService iMLDataCenterService = C1349505Px.LIZ;
        iMLDataCenterService.addSceneModelConfig(c1512130pS7.LJFF);
        iMLDataCenterService.addSceneModelConfig(c1512130pS7.LJI);
        TriggerEventInfo triggerEventInfo = oneSmartDataTrackConfig.getTriggerEventInfo();
        if (triggerEventInfo != null) {
            str = triggerEventInfo.eventName;
        } else {
            str = null;
        }
        if (str != null && (oneSmartDataTrackConfig.getTrackType() == 200 || oneSmartDataTrackConfig.getRealTriggerType() == 200)) {
            TriggerEventInfo triggerEventInfo2 = oneSmartDataTrackConfig.getTriggerEventInfo();
            if (triggerEventInfo2 != null && (str2 = triggerEventInfo2.eventName) != null) {
                this.LJIIIZ.add(str2);
            }
            if (!this.LJIIIIZZ) {
                this.LJIIIIZZ = true;
                FeatureServiceManager.Companion.getClass();
                C1510050pOl.LIZ().addAppLogListener(this);
            }
        }
        if (!this.LIZLLL && (oneSmartDataTrackConfig.getTrackType() == 100 || oneSmartDataTrackConfig.getRealTriggerType() == 100)) {
            this.LIZLLL = true;
            MLCommonService.Companion.getClass();
            C0NAL.LIZ.addCommonEventListener("play_prepare", this);
        }
        if (!this.LJ && (oneSmartDataTrackConfig.getTrackType() == 102 || oneSmartDataTrackConfig.getRealTriggerType() == 102)) {
            this.LJ = true;
            MLCommonService.Companion.getClass();
            C0NAL.LIZ.addCommonEventListener("play_first_frame", this);
        }
        if (!this.LJFF && (oneSmartDataTrackConfig.getTrackType() == 101 || oneSmartDataTrackConfig.getRealTriggerType() == 101)) {
            this.LJFF = true;
            MLCommonService.Companion.getClass();
            C0NAL.LIZ.addCommonEventListener("play_call_playtime", this);
        }
        if (!this.LJI && (oneSmartDataTrackConfig.getTrackType() == 103 || oneSmartDataTrackConfig.getRealTriggerType() == 103)) {
            this.LJI = true;
            MLCommonService.Companion.getClass();
            C0NAL.LIZ.addCommonEventListener("play_stop", this);
        }
        if (!this.LJII) {
            if (oneSmartDataTrackConfig.getTrackType() == 105 || oneSmartDataTrackConfig.getRealTriggerType() == 105) {
                this.LJII = true;
                MLCommonService.Companion.getClass();
                C0NAL.LIZ.addCommonEventListener("before_recommend_load_more", this);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService, com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public final boolean enable(String str) {
        if (str != null && ((ConcurrentHashMap) this.LIZIZ).containsKey(str)) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(C1509310pNZ c1509310pNZ, C1512130pS7 c1512130pS7) {
        Map<String, Object> map;
        int i;
        C1510230pP3 c1510230pP3 = c1512130pS7.LJI;
        if (c1510230pP3 == null || c1512130pS7.LIZLLL.isEmpty()) {
            return;
        }
        try {
            ArrayList<TrackerMonitorData> arrayList = new ArrayList();
            for (TrackerMonitorData trackerMonitorData : c1512130pS7.LIZLLL) {
                int i2 = trackerMonitorData.waitNextRealCnt - 1;
                trackerMonitorData.waitNextRealCnt = i2;
                if (i2 <= 0) {
                    arrayList.add(trackerMonitorData);
                }
            }
            if (!arrayList.isEmpty()) {
                HashMap map2 = new HashMap(128);
                if (c1509310pNZ != null) {
                    c1509310pNZ.LIZLLL = true;
                }
                C1509290pNX.LIZIZ(c1510230pP3, c1509310pNZ);
                if (c1509310pNZ == null) {
                    map = null;
                } else {
                    map = c1509310pNZ.LJ;
                }
                C198400pa.LIZ(map2, map);
                JSONObject jSONObject = new JSONObject(map2);
                for (TrackerMonitorData trackerMonitorData2 : arrayList) {
                    JSONObject jSONObject2 = trackerMonitorData2.jsonData;
                    if (jSONObject2 != null) {
                        if (trackerMonitorData2.LIZ) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        jSONObject.put("seq_tail", i);
                        jSONObject2.put("real", C786410Ut5.J3(jSONObject));
                        C20684815ws.LJIJ("ml_track_data_rpt", jSONObject2);
                    }
                }
                c1512130pS7.LIZLLL.removeAll(C13LP.LLIIJI(arrayList));
                SmartDataTrackerService.Companion.getClass();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1337780kuu.LIZ(th, null, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1509310pNZ r8, X.C1512130pS7 r9) {
        /*
            r7 = this;
            X.0pP3 r1 = r9.LJFF
            if (r1 != 0) goto L5
            return
        L5:
            r2 = 0
            java.lang.String r6 = ""
            if (r8 == 0) goto L1a
            java.lang.String r3 = r8.LIZIZ     // Catch: java.lang.Throwable -> Lbb
            if (r3 != 0) goto L1d
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = X.C1511360pQs.LIZ(r8)     // Catch: java.lang.Throwable -> Lbb
            if (r0 == 0) goto L1a
            java.lang.String r3 = r0.getAid()     // Catch: java.lang.Throwable -> Lbb
            if (r3 != 0) goto L1b
        L1a:
            r3 = r6
        L1b:
            if (r8 == 0) goto L22
        L1d:
            java.lang.String r0 = r8.LIZJ     // Catch: java.lang.Throwable -> Lbb
            if (r0 == 0) goto L22
            r6 = r0
        L22:
            java.util.HashMap r5 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lbb
            r0 = 128(0x80, float:1.8E-43)
            r5.<init>(r0)     // Catch: java.lang.Throwable -> Lbb
            if (r8 == 0) goto L2e
            r0 = 1
            r8.LIZLLL = r0     // Catch: java.lang.Throwable -> Lbb
        L2e:
            X.C1509290pNX.LIZIZ(r1, r8)     // Catch: java.lang.Throwable -> Lbb
            if (r8 == 0) goto L34
            goto L36
        L34:
            r0 = r2
            goto L38
        L36:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.LJ     // Catch: java.lang.Throwable -> Lbb
        L38:
            X.C198400pa.LIZ(r5, r0)     // Catch: java.lang.Throwable -> Lbb
            com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig r0 = r9.LIZIZ     // Catch: java.lang.Throwable -> Lbb
            boolean r0 = r0.getZipZero()     // Catch: java.lang.Throwable -> Lbb
            if (r0 == 0) goto L46
            X.C198400pa.LIZIZ(r5)     // Catch: java.lang.Throwable -> Lbb
        L46:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lbb
            r4.<init>()     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r1 = "scene"
            java.lang.String r0 = r9.LIZ     // Catch: java.lang.Throwable -> Lbb
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r1 = "track_type"
            com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig r0 = r9.LIZIZ     // Catch: java.lang.Throwable -> Lbb
            int r0 = r0.getTrackType()     // Catch: java.lang.Throwable -> Lbb
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r0 = "enter_type"
            r4.put(r0, r6)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r0 = "run_key"
            r4.put(r0, r3)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r1 = "predict"
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lbb
            r0.<init>(r5)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r0 = X.C786410Ut5.J3(r0)     // Catch: java.lang.Throwable -> Lbb
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r1 = "run_count"
            int r0 = r9.LIZJ     // Catch: java.lang.Throwable -> Lbb
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> Lbb
            java.util.LinkedList<com.ss.android.ugc.aweme.ml.feature.SmartDataTrackerServiceImpl$TrackerMonitorData> r0 = r9.LIZLLL     // Catch: java.lang.Throwable -> Lbb
            int r1 = r0.size()     // Catch: java.lang.Throwable -> Lbb
            int r0 = r9.LJ     // Catch: java.lang.Throwable -> Lbb
            if (r1 <= r0) goto L8b
            java.util.LinkedList<com.ss.android.ugc.aweme.ml.feature.SmartDataTrackerServiceImpl$TrackerMonitorData> r0 = r9.LIZLLL     // Catch: java.lang.Throwable -> Lbb
            r0.removeFirst()     // Catch: java.lang.Throwable -> Lbb
        L8b:
            com.ss.android.ugc.aweme.ml.feature.SmartDataTrackerServiceImpl$TrackerMonitorData r1 = new com.ss.android.ugc.aweme.ml.feature.SmartDataTrackerServiceImpl$TrackerMonitorData     // Catch: java.lang.Throwable -> Lbb
            r1.<init>()     // Catch: java.lang.Throwable -> Lbb
            r1.key = r3     // Catch: java.lang.Throwable -> Lbb
            r1.jsonData = r4     // Catch: java.lang.Throwable -> Lbb
            com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig r0 = r9.LIZIZ     // Catch: java.lang.Throwable -> Lbb
            int r0 = r0.getNextRealCnt()     // Catch: java.lang.Throwable -> Lbb
            r1.waitNextRealCnt = r0     // Catch: java.lang.Throwable -> Lbb
            java.util.LinkedList<com.ss.android.ugc.aweme.ml.feature.SmartDataTrackerServiceImpl$TrackerMonitorData> r0 = r9.LIZLLL     // Catch: java.lang.Throwable -> Lbb
            r0.addLast(r1)     // Catch: java.lang.Throwable -> Lbb
            X.0pSC r0 = com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService.Companion     // Catch: java.lang.Throwable -> Lbb
            r0.getClass()     // Catch: java.lang.Throwable -> Lbb
            com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig r0 = r9.LIZIZ     // Catch: java.lang.Throwable -> Lbb
            int r1 = r0.getTrackType()     // Catch: java.lang.Throwable -> Lbb
            r0 = 105(0x69, float:1.47E-43)
            if (r1 != r0) goto Lc3
            Y.ARunnableS123S0100000_23 r1 = new Y.ARunnableS123S0100000_23     // Catch: java.lang.Throwable -> Lbb
            r0 = 32
            r1.<init>(r7, r0)     // Catch: java.lang.Throwable -> Lbb
            X.C1511690pRP.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lbb
            return
        Lbb:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            r0 = 4
            X.C1337780kuu.LIZ(r1, r2, r0)
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ml.feature.SmartDataTrackerServiceImpl.LIZ(X.0pNZ, X.0pS7):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC588340N5s
    public final void LIZJ(String str, C1510130pOt c1510130pOt) {
        String aid;
        Aweme awemeLIZ;
        User author;
        Aweme awemeLIZ2;
        SmartDataTrackerService.Companion.getClass();
        if (SmartDataTrackerService.debug) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onEvent type:");
            sbLIZ.append(str);
            sbLIZ.append(" aweme:");
            String nickname = null;
            if (c1510130pOt != null && (awemeLIZ2 = C1510150pOv.LIZ(c1510130pOt)) != null) {
                aid = awemeLIZ2.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            sbLIZ.append('-');
            if (c1510130pOt != null && (awemeLIZ = C1510150pOv.LIZ(c1510130pOt)) != null && (author = awemeLIZ.getAuthor()) != null) {
                nickname = author.getNickname();
            }
            sbLIZ.append(nickname);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (c1510130pOt == null) {
        }
        switch (str.hashCode()) {
            case -1877535187:
                if (str.equals("play_stop")) {
                    for (Map.Entry entry : ((ConcurrentHashMap) this.LIZIZ).entrySet()) {
                        OneSmartDataTrackConfig oneSmartDataTrackConfig = ((C1512130pS7) entry.getValue()).LIZIZ;
                        String str2 = (String) entry.getKey();
                        if (oneSmartDataTrackConfig.getRealTriggerType() == 103) {
                            C1509310pNZ c1509310pNZ = new C1509310pNZ(0);
                            c1509310pNZ.LJIIIIZZ = C1510150pOv.LIZ(c1510130pOt);
                            c1509310pNZ.LIZJ = c1510130pOt.LIZLLL("enterType");
                            onSceneRealCheckAndReport(str2, c1509310pNZ);
                        }
                        if (oneSmartDataTrackConfig.getTrackType() == 103) {
                            C1509310pNZ c1509310pNZ2 = new C1509310pNZ(0);
                            c1509310pNZ2.LJIIIIZZ = C1510150pOv.LIZ(c1510130pOt);
                            c1509310pNZ2.LIZJ = c1510130pOt.LIZLLL("enterType");
                            onScenePredictCheckOrRun(str2, c1509310pNZ2);
                        }
                    }
                }
                break;
            case -1704536429:
                if (str.equals("play_first_frame")) {
                    for (Map.Entry entry2 : ((ConcurrentHashMap) this.LIZIZ).entrySet()) {
                        OneSmartDataTrackConfig oneSmartDataTrackConfig2 = ((C1512130pS7) entry2.getValue()).LIZIZ;
                        String str3 = (String) entry2.getKey();
                        if (oneSmartDataTrackConfig2.getRealTriggerType() == 102) {
                            C1509310pNZ c1509310pNZ3 = new C1509310pNZ(0);
                            c1509310pNZ3.LJIIIIZZ = C1510150pOv.LIZ(c1510130pOt);
                            c1509310pNZ3.LIZJ = c1510130pOt.LIZLLL("enterType");
                            onSceneRealCheckAndReport(str3, c1509310pNZ3);
                        }
                        if (oneSmartDataTrackConfig2.getTrackType() == 102) {
                            C1509310pNZ c1509310pNZ4 = new C1509310pNZ(0);
                            c1509310pNZ4.LJIIIIZZ = C1510150pOv.LIZ(c1510130pOt);
                            c1509310pNZ4.LIZJ = c1510130pOt.LIZLLL("enterType");
                            onScenePredictCheckOrRun(str3, c1509310pNZ4);
                        }
                    }
                }
                break;
            case 1168529143:
                if (str.equals("play_call_playtime")) {
                    for (Map.Entry entry3 : ((ConcurrentHashMap) this.LIZIZ).entrySet()) {
                        OneSmartDataTrackConfig oneSmartDataTrackConfig3 = ((C1512130pS7) entry3.getValue()).LIZIZ;
                        String str4 = (String) entry3.getKey();
                        if (oneSmartDataTrackConfig3.getRealTriggerType() == 101) {
                            C1509310pNZ c1509310pNZ5 = new C1509310pNZ(0);
                            c1509310pNZ5.LJIIIIZZ = C1510150pOv.LIZ(c1510130pOt);
                            c1509310pNZ5.LIZJ = c1510130pOt.LIZLLL("enterType");
                            onSceneRealCheckAndReport(str4, c1509310pNZ5);
                        }
                        if (oneSmartDataTrackConfig3.getTrackType() == 101) {
                            C1509310pNZ c1509310pNZ6 = new C1509310pNZ(0);
                            c1509310pNZ6.LJIIIIZZ = C1510150pOv.LIZ(c1510130pOt);
                            c1509310pNZ6.LIZJ = c1510130pOt.LIZLLL("enterType");
                            onScenePredictCheckOrRun(str4, c1509310pNZ6);
                        }
                    }
                }
                break;
            case 1274399484:
                if (str.equals("play_prepare")) {
                    for (Map.Entry entry4 : ((ConcurrentHashMap) this.LIZIZ).entrySet()) {
                        OneSmartDataTrackConfig oneSmartDataTrackConfig4 = ((C1512130pS7) entry4.getValue()).LIZIZ;
                        String str5 = (String) entry4.getKey();
                        if (oneSmartDataTrackConfig4.getRealTriggerType() == 100) {
                            C1509310pNZ c1509310pNZ7 = new C1509310pNZ(0);
                            c1509310pNZ7.LJIIIIZZ = C1510150pOv.LIZ(c1510130pOt);
                            c1509310pNZ7.LIZJ = c1510130pOt.LIZLLL("enterType");
                            onSceneRealCheckAndReport(str5, c1509310pNZ7);
                        }
                        if (oneSmartDataTrackConfig4.getTrackType() == 100) {
                            C1509310pNZ c1509310pNZ8 = new C1509310pNZ(0);
                            c1509310pNZ8.LJIIIIZZ = C1510150pOv.LIZ(c1510130pOt);
                            c1509310pNZ8.LIZJ = c1510130pOt.LIZLLL("enterType");
                            onScenePredictCheckOrRun(str5, c1509310pNZ8);
                        }
                    }
                }
                break;
            case 1643886219:
                if (str.equals("before_recommend_load_more")) {
                    for (Map.Entry entry5 : ((ConcurrentHashMap) this.LIZIZ).entrySet()) {
                        OneSmartDataTrackConfig oneSmartDataTrackConfig5 = ((C1512130pS7) entry5.getValue()).LIZIZ;
                        String str6 = (String) entry5.getKey();
                        if (oneSmartDataTrackConfig5.getRealTriggerType() == 105) {
                            C1509310pNZ c1509310pNZ9 = new C1509310pNZ(0);
                            c1509310pNZ9.LIZJ = c1510130pOt.LIZLLL("enterType");
                            onSceneRealCheckAndReport(str6, c1509310pNZ9);
                        }
                        if (oneSmartDataTrackConfig5.getTrackType() == 105) {
                            C1509310pNZ c1509310pNZ10 = new C1509310pNZ(0);
                            c1509310pNZ10.LIZJ = c1510130pOt.LIZLLL("enterType");
                            onScenePredictCheckOrRun(str6, c1509310pNZ10);
                        }
                    }
                }
                break;
        }
    }

    @Override // X.InterfaceC1510030pOj
    public final void handleAppLogEvent(String str, C1510130pOt c1510130pOt) {
        OneSmartDataTrackConfig oneSmartDataTrackConfig;
        TriggerEventInfo triggerEventInfo;
        String str2;
        if (this.LIZJ && this.LJIIIZ.contains(str)) {
            for (String str3 : ((ConcurrentHashMap) this.LIZIZ).keySet()) {
                C1512130pS7 c1512130pS7 = (C1512130pS7) ((ConcurrentHashMap) this.LIZIZ).get(str3);
                if (c1512130pS7 != null && (oneSmartDataTrackConfig = c1512130pS7.LIZIZ) != null && (triggerEventInfo = oneSmartDataTrackConfig.getTriggerEventInfo()) != null && (str2 = triggerEventInfo.eventName) != null && Intrinsics.LJFF(str2, str)) {
                    String str4 = triggerEventInfo.paramName;
                    Object obj = triggerEventInfo.paramValue;
                    if (str4 == null || str4.length() == 0 || obj == null || Intrinsics.LJFF(c1510130pOt.LIZ(str4), obj)) {
                        if (oneSmartDataTrackConfig.getTrackType() == 200) {
                            onScenePredictCheckOrRun(str3, new C1509310pNZ(0));
                        }
                        if (oneSmartDataTrackConfig.getRealTriggerType() == 200) {
                            onSceneRealCheckAndReport(str3, new C1509310pNZ(0));
                        }
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService, com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public final void onScenePredictCheckOrRun(String str, C1509310pNZ c1509310pNZ) {
        if (c1509310pNZ != null && str != null) {
            try {
                C1512130pS7 c1512130pS7 = (C1512130pS7) ((ConcurrentHashMap) this.LIZIZ).get(str);
                if (c1512130pS7 == null) {
                    return;
                }
                c1512130pS7.LIZJ++;
                if (AbstractC19994813Le.Default.nextFloat() >= c1512130pS7.LIZIZ.getReportRate()) {
                    return;
                }
                LIZ(c1509310pNZ, c1512130pS7);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1337780kuu.LIZ(th, null, 6);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService, com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public final void onSceneRealCheckAndReport(String str, C1509310pNZ c1509310pNZ) {
        if (c1509310pNZ != null && str != null) {
            try {
                C1512130pS7 c1512130pS7 = (C1512130pS7) ((ConcurrentHashMap) this.LIZIZ).get(str);
                if (c1512130pS7 == null) {
                    return;
                }
                LIZIZ(c1509310pNZ, c1512130pS7);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1337780kuu.LIZ(th, null, 6);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService
    public final void putExtData(String str, String str2, String str3, Object obj) {
        C1512130pS7 c1512130pS7;
        if (str == null || (c1512130pS7 = (C1512130pS7) ((ConcurrentHashMap) this.LIZIZ).get(str)) == null || c1512130pS7.LIZLLL.isEmpty()) {
            return;
        }
        C1511690pRP.LIZIZ(new ARunnableS6S2200000_23(c1512130pS7, str2, obj, str3, 1));
    }
}
