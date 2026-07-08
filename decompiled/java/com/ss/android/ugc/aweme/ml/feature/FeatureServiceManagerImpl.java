package com.ss.android.ugc.aweme.ml.feature;

import X.C08JS;
import X.C0R1F;
import X.C0XEJ;
import X.C1065390dpZ;
import X.C1305360k4c;
import X.C1337780kuu;
import X.C148D;
import X.C1499660p80;
import X.C1508860pMq;
import X.C1508980pN2;
import X.C1509000pN4;
import X.C1509170pNL;
import X.C1509190pNN;
import X.C1509300pNY;
import X.C1509310pNZ;
import X.C1509380pNg;
import X.C1509440pNm;
import X.C1509730pOF;
import X.C1509900pOW;
import X.C1510050pOl;
import X.C1510230pP3;
import X.C1512880pTK;
import X.C152L;
import X.C1849420yE8;
import X.C2184741Aeu;
import X.C256650A3z;
import X.C282640B5y;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.FeatureGroup;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class FeatureServiceManagerImpl extends FeatureServiceManager {
    public static final FeatureServiceManagerImpl INSTANCE = new FeatureServiceManagerImpl();
    public static final ConcurrentHashMap<String, C1510230pP3> cache = new ConcurrentHashMap<>();
    public static boolean fisrtGetFeatureSet = true;
    public static boolean fisrtGetFeatureSetFromDataSet = true;

    @Override // com.ss.ugc.clientai.core.api.FeatureServiceManager
    public FeatureProducer getCommonProducer() {
        return this;
    }

    public final void checkAndInit() {
        FeatureServiceManager.addProducer$default(this, "f_comment", C1509380pNg.LIZIZ, 0, 4, null);
        FeatureServiceManager.addProducer$default(this, "f_search", C1508980pN2.LIZIZ, 0, 4, null);
        FeatureServiceManager.addProducer$default(this, "f_bytebench", C1305360k4c.LIZIZ, 0, 4, null);
        FeatureServiceManager.addProducer$default(this, "f_social_recommend", new FeatureProducer() { // from class: X.0pN3
            public static boolean LIZJ = true;
            public static String LIZLLL = "f_social_recommend";

            @Override // com.ss.ugc.clientai.core.api.FeatureProducer
            public final String getProducerName() {
                return LIZLLL;
            }

            @Override // com.ss.ugc.clientai.core.api.FeatureProducer
            public final void enableProducer(List<FeatureItem> list) {
                if (LIZJ) {
                    LIZJ = false;
                    FeatureServiceManager.Companion.getClass();
                    C1510050pOl.LIZ().addAppLogListener(new InterfaceC1510030pOj() { // from class: X.0j09
                        public static final Set<String> LIZJ = C13LQ.LJLIIL(new String[]{"follow_recommend", "big_card_passive_react", "close_suggested_accounts_pop_up"});
                        public static final Set<String> LIZLLL = C13LQ.LJLIIL(new String[]{"1-1", "1-2", "1-4", "1-5", "1-6", "1-7", "1-8", "3-1", "3-2", "3-3", "6-1"});

                        @Override // X.InterfaceC1510030pOj
                        public final Set<String> events() {
                            return LIZJ;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
                        @Override // X.InterfaceC1510030pOj
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void handleAppLogEvent(java.lang.String r13, X.C1510130pOt r14) {
                            /*
                                Method dump skipped, instruction units count: 343
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1264150j09.handleAppLogEvent(java.lang.String, X.0pOt):void");
                        }
                    });
                }
            }

            @Override // com.ss.ugc.clientai.core.api.FeatureProducer
            public final void setProducerName(String str) {
                LIZLLL = str;
            }

            @Override // com.ss.ugc.clientai.core.api.FeatureProducer
            public final Object getFeatureInternal(String str, JSONObject jSONObject, String str2, ReturnCode returnCode) {
                if (returnCode != null) {
                    returnCode.code = 200;
                }
                Object feature = C1487520ooQ.LIZ.getFeature(str);
                if (feature == null) {
                    if (returnCode != null) {
                        returnCode.code = 1;
                    }
                    return null;
                }
                return feature;
            }
        }, 0, 4, null);
        FeatureServiceManager.addProducer$default(this, "f_vod", C1509440pNm.LIZIZ, 0, 4, null);
        FeatureServiceManager.addProducer$default(this, "f_audio", C1499660p80.LIZIZ, 0, 4, null);
        FeatureServiceManager.addProducer$default(this, "f_live", C1509000pN4.LIZIZ, 0, 4, null);
        FeatureServiceManager.addProducer$default(this, "f_live_game", C152L.LIZIZ, 0, 4, null);
        if (((Number) C256650A3z.LIZ.getValue()).intValue() == 1) {
            FeatureServiceManager.addProducer$default(this, "f_nxet_features", C1849420yE8.LIZIZ, 0, 4, null);
        }
        FeatureServiceManager.addProducer$default(this, "f_creation", C1512880pTK.LIZIZ, 0, 4, null);
        FeatureServiceManager.addProducer$default(this, "f_ug", new FeatureProducer() { // from class: X.0pPR
            public static boolean LIZJ = true;
            public static String LIZLLL = "f_ug";

            @Override // com.ss.ugc.clientai.core.api.FeatureProducer
            public final String getProducerName() {
                return LIZLLL;
            }

            @Override // com.ss.ugc.clientai.core.api.FeatureProducer
            public final void enableProducer(List<FeatureItem> list) {
                if (LIZJ) {
                    LIZJ = false;
                    C1487530ooR.LIZ.getClass();
                    C1487530ooR.LIZIZ = true;
                    FeatureServiceManager.Companion.getClass();
                    C1510050pOl.LIZ().addAppLogListener(new InterfaceC1510030pOj() { // from class: X.0pPS
                        public static final Set<String> LIZJ = C093Y.LJ("touch_point_show");

                        @Override // X.InterfaceC1510030pOj
                        public final void handleAppLogEvent(String str, C1510130pOt c1510130pOt) {
                        }

                        @Override // X.InterfaceC1510030pOj
                        public final Set<String> events() {
                            return LIZJ;
                        }
                    });
                }
            }

            @Override // com.ss.ugc.clientai.core.api.FeatureProducer
            public final void setProducerName(String str) {
                LIZLLL = str;
            }

            @Override // com.ss.ugc.clientai.core.api.FeatureProducer
            public final Object getFeatureInternal(String str, JSONObject jSONObject, String str2, ReturnCode returnCode) {
                String mediaSource;
                if (returnCode != null) {
                    returnCode.code = 200;
                }
                Object feature = C1487530ooR.LIZ.getFeature(str);
                if (feature != null) {
                    return feature;
                }
                IPluginService.ReinstallCheck deviceCheckResult = null;
                if (Intrinsics.LJFF(str, "activation_media_source")) {
                    IUgCommonService iUgCommonService = (IUgCommonService) PluggableExtentionKt.pluggableSpi$default(IUgCommonService.class, false, false, false, 14, null);
                    if (iUgCommonService != null && (mediaSource = iUgCommonService.getMediaSource()) != null) {
                        return mediaSource;
                    }
                } else if (Intrinsics.LJFF(str, "fc_nuf_reinstall_type")) {
                    IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
                    if (iPluginService != null) {
                        deviceCheckResult = iPluginService.getDeviceCheckResult();
                    }
                    if (deviceCheckResult == IPluginService.ReinstallCheck.REINSTALL) {
                        return "old";
                    }
                    return "new";
                }
                if (returnCode != null) {
                    returnCode.code = 1;
                }
                return null;
            }
        }, 0, 4, null);
        FeatureServiceManager.addProducer$default(this, "f_lemon8", C1065390dpZ.LIZIZ, 0, 4, null);
        super.init();
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureServiceManager
    public void updateListenAppLogEvents() {
        super.updateListenAppLogEvents();
        C1509900pOW.LIZ();
    }

    public final ConcurrentHashMap<String, C1510230pP3> getCache() {
        return cache;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureServiceManager
    public void tryRegisterProducer(FeatureGroup featureGroup) {
        String str;
        int i = featureGroup.sourceType;
        if (i == 1) {
            String str2 = featureGroup.groupName;
            if (str2 != null) {
                C148D.LIZ(str2);
                FeatureProducer producer = INSTANCE.getProducer(str2, 1);
                if (producer != null) {
                    producer.enableProducer((List<FeatureItem>) null);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 2 || (str = featureGroup.groupName) == null) {
            return;
        }
        FeatureServiceManager.Companion.getClass();
        if (!C1510050pOl.LIZ().containProducer(str, 2)) {
            C1510050pOl.LIZ().addProducer(str, new C0XEJ(str), 2);
        }
        C1510050pOl.LIZ().getProducer(str, 2);
        FeatureProducer producer2 = INSTANCE.getProducer(str, 2);
        if (producer2 == null) {
            return;
        }
        producer2.enableProducer(featureGroup.features);
    }

    private final JSONObject getBatchFeature(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                String strOptString = jSONObject.optString("serviceName");
                if (strOptString == null || TextUtils.isEmpty(strOptString)) {
                    return null;
                }
                ConcurrentHashMap<String, C1510230pP3> concurrentHashMap = cache;
                C1510230pP3 c1510230pP3LIZIZ = concurrentHashMap.get(strOptString);
                if (c1510230pP3LIZIZ == null) {
                    c1510230pP3LIZIZ = C1509730pOF.LIZIZ(strOptString, jSONObject);
                    if (c1510230pP3LIZIZ == null) {
                        return null;
                    }
                    concurrentHashMap.put(strOptString, c1510230pP3LIZIZ);
                    C1509170pNL c1509170pNL = C1509300pNY.LIZ;
                    if (c1509170pNL == null) {
                        c1509170pNL = C1509190pNN.LIZ;
                    }
                    c1509170pNL.LIZ(c1510230pP3LIZIZ);
                }
                C1509310pNZ c1509310pNZLIZ = C1509730pOF.LIZ(jSONObject);
                C1509170pNL c1509170pNL2 = C1509300pNY.LIZ;
                if (c1509170pNL2 == null) {
                    c1509170pNL2 = C1509190pNN.LIZ;
                }
                c1509170pNL2.LIZIZ(c1510230pP3LIZIZ, c1509310pNZLIZ);
                return new JSONObject(c1509310pNZLIZ.LIZIZ());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1337780kuu.LIZ(th, null, 6);
            }
        }
        return null;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureServiceManager
    public JSONObject getFeatureSetFromDataSet(String str, JSONObject jSONObject) {
        boolean z;
        Map<? extends String, ? extends String> map;
        if (fisrtGetFeatureSetFromDataSet) {
            HashMap<String, String> map2 = new HashMap<>();
            String strLIZIZ = C0R1F.LIZIZ("raw_dataset");
            try {
                if (strLIZIZ.length() <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && (map = (Map) C08JS.LIZIZ().LJIIIIZZ(strLIZIZ, new TypeToken<Map<String, ? extends String>>() { // from class: X.04Y1
                }.getType())) != null) {
                    map2.putAll(map);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1337780kuu.LIZ(e, null, 6);
            }
            initDataSet(map2);
            fisrtGetFeatureSetFromDataSet = false;
        }
        return super.getFeatureSetFromDataSet(str, jSONObject);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0128, code lost:
    
        return X.C1510180pOy.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0129, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if (r2.equals("common") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0075, code lost:
    
        if (r2.equals("f_phone") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009f, code lost:
    
        if (r2.equals("static") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f6, code lost:
    
        if (r2.equals("ies_basic") == false) goto L5;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.ugc.clientai.core.api.FeatureServiceManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.ss.ugc.clientai.core.api.FeatureProducer getProducer(java.lang.String r2, int r3) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ml.feature.FeatureServiceManagerImpl.getProducer(java.lang.String, int):com.ss.ugc.clientai.core.api.FeatureProducer");
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureServiceManager
    public JSONObject getFeatureSet(String str, String str2, JSONObject jSONObject) {
        if (fisrtGetFeatureSet) {
            initFeatureSet(C1508860pMq.LIZ());
            fisrtGetFeatureSet = false;
        }
        return super.getFeatureSet(str, str2, jSONObject);
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public Object getFeatureInternal(String str, JSONObject jSONObject, String str2, ReturnCode returnCode) {
        if (Intrinsics.LJFF(str, "batch_feature")) {
            return getBatchFeature(str, jSONObject);
        }
        if (Intrinsics.LJFF(str, "is_scrolling") && ((Boolean) C282640B5y.LIZ.getValue()).booleanValue()) {
            return FeatureProducer.getFeature$default(C2184741Aeu.LIZIZ, str, jSONObject, str2, (ReturnCode) null, 8, (Object) null);
        }
        Object feature$default = FeatureProducer.getFeature$default(new FeatureProducer() { // from class: X.0pOE
            @Override // com.ss.ugc.clientai.core.api.FeatureProducer
            public final Object getFeatureInternal(String str3, JSONObject jSONObject2, String str4, ReturnCode returnCode2) {
                Object feature$default2 = FeatureProducer.getFeature$default(C1510180pOy.LIZIZ, str3, jSONObject2, str4, (ReturnCode) null, 8, (Object) null);
                if (feature$default2 != null) {
                    return feature$default2;
                }
                Object feature$default3 = FeatureProducer.getFeature$default(C1509420pNk.LIZIZ, str3, jSONObject2, str4, (ReturnCode) null, 8, (Object) null);
                if (feature$default3 != null) {
                    return feature$default3;
                }
                Object feature$default4 = FeatureProducer.getFeature$default(C1509500pNs.LIZIZ, str3, jSONObject2, str4, (ReturnCode) null, 8, (Object) null);
                if (feature$default4 != null) {
                    return feature$default4;
                }
                Object feature$default5 = FeatureProducer.getFeature$default(C1510450pPP.LIZIZ, str3, jSONObject2, str4, (ReturnCode) null, 8, (Object) null);
                if (feature$default5 != null) {
                    return feature$default5;
                }
                Object feature$default6 = FeatureProducer.getFeature$default(C1510330pPD.LIZIZ, str3, jSONObject2, str4, (ReturnCode) null, 8, (Object) null);
                if (feature$default6 != null) {
                    return feature$default6;
                }
                Object feature$default7 = FeatureProducer.getFeature$default(C1509350pNd.LIZIZ, str3, jSONObject2, str4, (ReturnCode) null, 8, (Object) null);
                if (feature$default7 != null) {
                    return feature$default7;
                }
                Object feature$default8 = FeatureProducer.getFeature$default(C1509610pO3.LIZIZ, str3, jSONObject2, str4, (ReturnCode) null, 8, (Object) null);
                if (feature$default8 != null) {
                    return feature$default8;
                }
                Object feature$default9 = FeatureProducer.getFeature$default(C1510100pOq.LIZIZ, str3, jSONObject2, str4, (ReturnCode) null, 8, (Object) null);
                if (feature$default9 != null) {
                    return feature$default9;
                }
                Object feature$default10 = FeatureProducer.getFeature$default(C1509560pNy.LIZIZ, str3, jSONObject2, str4, (ReturnCode) null, 8, (Object) null);
                if (feature$default10 != null) {
                    return feature$default10;
                }
                Object feature$default11 = FeatureProducer.getFeature$default(C1512790pTB.LIZIZ, str3, jSONObject2, str4, (ReturnCode) null, 8, (Object) null);
                if (feature$default11 != null) {
                    return feature$default11;
                }
                Object feature$default12 = FeatureProducer.getFeature$default(C2184741Aeu.LIZIZ, str3, jSONObject2, str4, (ReturnCode) null, 8, (Object) null);
                if (feature$default12 == null) {
                    return null;
                }
                return feature$default12;
            }
        }, str, jSONObject, str2, (ReturnCode) null, 8, (Object) null);
        if (feature$default != null) {
            return feature$default;
        }
        Iterator<T> it2 = getSourceTypeProducers().values().iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((ConcurrentHashMap) it2.next()).entrySet().iterator();
            while (it3.hasNext()) {
                Object feature$default2 = FeatureProducer.getFeature$default((FeatureProducer) ((Map.Entry) it3.next()).getValue(), str, jSONObject, str2, (ReturnCode) null, 8, (Object) null);
                if (feature$default2 != null) {
                    return feature$default2;
                }
            }
        }
        return null;
    }
}
