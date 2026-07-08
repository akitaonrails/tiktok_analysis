package com.ss.ugc.clientai.core.api;

import X.C13LP;
import X.C1510310pPB;
import X.C1697810uHb;
import X.C1923007g4;
import X.C2188811AlT;
import X.InterfaceC1510080pOo;
import X.InterfaceC1510280pP8;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import com.ss.ugc.clientai.core.api.meta.FlattenConfig;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class FeatureProducer {
    public static final C1510310pPB Companion = new Object() { // from class: X.0pPB
    };
    public InterfaceC1510080pOo globalFeatureChangeNotifier;
    public int sourceType;
    public String producerName = "";
    public final ConcurrentHashMap<String, Object> memoryCache = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Long> cacheTime = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<HashSet<String>, InterfaceC1510280pP8> featureChangeListeners = new ConcurrentHashMap<>();

    public void enableProducer(List<FeatureItem> list) {
    }

    public Object getFeatureInternal(String str, JSONObject jSONObject, String str2, ReturnCode returnCode) {
        return null;
    }

    public boolean saveValueToProducer(String str, Object obj) {
        return false;
    }

    public final ConcurrentHashMap<HashSet<String>, InterfaceC1510280pP8> getFeatureChangeListeners() {
        return this.featureChangeListeners;
    }

    public String getProducerName() {
        return this.producerName;
    }

    public int getSourceType() {
        return this.sourceType;
    }

    public void enableProducer(String str) {
        try {
            List<FeatureItem> list = (List) new Gson().LJIIIIZZ(str, new TypeToken<List<? extends FeatureItem>>() { // from class: X.0pP5
            }.getType());
            if (list != null) {
                enableProducer(list);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void registerFeatureChangeListener(InterfaceC1510280pP8 interfaceC1510280pP8) {
        this.featureChangeListeners.put(C13LP.LLIFFJFJJ(interfaceC1510280pP8.LIZIZ()), interfaceC1510280pP8);
    }

    public final void setGlobalFeatureChangeNotifier(InterfaceC1510080pOo interfaceC1510080pOo) {
        this.globalFeatureChangeNotifier = interfaceC1510080pOo;
    }

    public void setProducerName(String str) {
        this.producerName = str;
    }

    public void setSourceType(int i) {
        this.sourceType = i;
    }

    public final void triggerFeatureChangeListener(String str) {
        for (Map.Entry<HashSet<String>, InterfaceC1510280pP8> entry : this.featureChangeListeners.entrySet()) {
            if (entry.getKey().contains(str)) {
                entry.getValue().LIZ();
            }
        }
    }

    public final void unRegisterFeatureChangeListener(InterfaceC1510280pP8 interfaceC1510280pP8) {
        this.featureChangeListeners.remove(C13LP.LLIFFJFJJ(interfaceC1510280pP8.LIZIZ()));
    }

    public final void notifyGlobalFeatureChange(String str, int i) {
        InterfaceC1510080pOo interfaceC1510080pOo = this.globalFeatureChangeNotifier;
        if (interfaceC1510080pOo != null) {
            interfaceC1510080pOo.notifyGlobalFeatureChange(getProducerName(), str, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045 A[PHI: r3 r5
      0x0045: PHI (r3v4 java.lang.String) = (r3v1 java.lang.String), (r3v5 java.lang.String) binds: [B:8:0x0031, B:13:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0045: PHI (r5v3 org.json.JSONObject) = (r5v1 org.json.JSONObject), (r5v4 org.json.JSONObject) binds: [B:8:0x0031, B:13:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject getBatchFeature(java.util.List<com.ss.ugc.clientai.core.api.meta.FeatureItem> r19, com.ss.ugc.clientai.core.api.meta.FlattenConfig r20, java.lang.String r21, boolean r22) {
        /*
            r18 = this;
            long r9 = java.lang.System.currentTimeMillis()
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.util.Iterator r8 = r19.iterator()
            java.lang.String r3 = ""
        L14:
            boolean r0 = r8.hasNext()
            r14 = r21
            if (r0 == 0) goto L99
            java.lang.Object r2 = r8.next()
            com.ss.ugc.clientai.core.api.meta.FeatureItem r2 = (com.ss.ugc.clientai.core.api.meta.FeatureItem) r2
            com.ss.ugc.clientai.core.api.meta.ReturnCode r15 = new com.ss.ugc.clientai.core.api.meta.ReturnCode
            r6 = 0
            r0 = -1
            r15.<init>(r0, r0)
            java.lang.String r12 = r2.name
            r11 = r18
            if (r12 == 0) goto L4e
            java.lang.String r1 = r2.params
            if (r1 == 0) goto L45
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r3)
            if (r0 != 0) goto L3f
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>(r1)
            r3 = r1
        L3f:
            java.lang.Object r6 = r11.getFeature(r12, r5, r14, r15)
            if (r6 != 0) goto L4e
        L45:
            r16 = 2
            r13 = 0
            r17 = r13
            java.lang.Object r6 = getFeature$default(r11, r12, r13, r14, r15, r16, r17)
        L4e:
            r7 = r20
            if (r7 == 0) goto L8e
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r7.prefix
            r1.append(r0)
            java.lang.String r0 = r7.separator
            r1.append(r0)
            java.lang.String r0 = r2.trans
            if (r0 != 0) goto L66
            java.lang.String r0 = r2.name
        L66:
            r1.append(r0)
            java.lang.String r13 = X.C2188811AlT.LIZIZ(r1)
            java.util.HashSet<java.lang.String> r1 = r7.reverseProducers
            if (r1 == 0) goto L8c
            java.lang.String r0 = r11.getProducerName()
            boolean r1 = r1.contains(r0)
            r0 = 1
            if (r1 != r0) goto L8c
            int r1 = r15.sequenceIndex
        L7e:
            boolean r0 = r7.flattedRecursive
            r11 = r11
            r14 = r2
            r15 = r6
            r16 = r0
            r17 = r1
            r12 = r4
            r11.putRecursive(r12, r13, r14, r15, r16, r17)
            goto L14
        L8c:
            r1 = -1
            goto L7e
        L8e:
            java.lang.String r0 = r2.trans
            if (r0 != 0) goto L94
            java.lang.String r0 = r2.name
        L94:
            r4.put(r0, r6)
            goto L14
        L99:
            X.0pPA r3 = X.C1510320pPC.LIZ
            if (r3 == 0) goto La9
            int r2 = r19.size()
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r9
            r3.LIZIZ(r2, r0, r14)
        La9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.clientai.core.api.FeatureProducer.getBatchFeature(java.util.List, com.ss.ugc.clientai.core.api.meta.FlattenConfig, java.lang.String, boolean):org.json.JSONObject");
    }

    public final Boolean getBooleanFeature(String str, String str2, String str3, ReturnCode returnCode) {
        return C1923007g4.LIZ(getFeature(str, str2, str3, returnCode));
    }

    public final JSONObject getDictFeature(String str, String str2, String str3, ReturnCode returnCode) {
        Object feature = getFeature(str, str2, str3, returnCode);
        if (feature instanceof JSONObject) {
            return (JSONObject) feature;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getFeature(java.lang.String r19, org.json.JSONObject r20, java.lang.String r21, com.ss.ugc.clientai.core.api.meta.ReturnCode r22) throws org.json.JSONException {
        /*
            r18 = this;
            X.0pPA r10 = X.C1510320pPC.LIZ
            r15 = r22
            r13 = r21
            r5 = r20
            r12 = r19
            r3 = r18
            if (r10 == 0) goto L87
            long r8 = java.lang.System.currentTimeMillis()
            java.util.Set<java.lang.String> r4 = X.C1510260pP6.LIZ
            java.lang.String r0 = r3.getProducerName()
            boolean r1 = r4.contains(r0)
            r0 = 0
            if (r1 == 0) goto L54
            java.lang.String r2 = "general_cache"
            if (r5 == 0) goto L27
            java.lang.Object r0 = r5.get(r2)
        L27:
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto L54
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r0 = r3.cacheTime
            java.lang.Object r0 = r0.get(r12)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L54
            long r6 = java.lang.System.currentTimeMillis()
            long r0 = r0.longValue()
            long r6 = r6 - r0
            java.lang.Object r0 = r5.get(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            long r1 = r0.longValue()
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L54
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r3.memoryCache
            java.lang.Object r14 = r0.get(r12)
            if (r14 != 0) goto L76
        L54:
            java.lang.Object r14 = r3.getFeatureInternal(r12, r5, r13, r15)
            java.lang.String r0 = r3.getProducerName()
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L76
            if (r14 == 0) goto L76
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r2 = r3.cacheTime
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r12, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r3.memoryCache
            r0.put(r12, r14)
        L76:
            long r16 = java.lang.System.currentTimeMillis()
            long r16 = r16 - r8
            r3.getSourceType()
            java.lang.String r11 = r3.getProducerName()
            r10.LIZ(r11, r12, r13, r14, r15, r16)
            return r14
        L87:
            java.lang.Object r0 = r3.getFeatureInternal(r12, r5, r13, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.clientai.core.api.FeatureProducer.getFeature(java.lang.String, org.json.JSONObject, java.lang.String, com.ss.ugc.clientai.core.api.meta.ReturnCode):java.lang.Object");
    }

    public final List<Object> getListFeature(String str, String str2, String str3, ReturnCode returnCode) {
        Object feature = getFeature(str, str2, str3, returnCode);
        if (feature instanceof List) {
            return (List) feature;
        }
        return null;
    }

    public final Map<Object, Object> getMapFeature(String str, String str2, String str3, ReturnCode returnCode) {
        Object feature = getFeature(str, str2, str3, returnCode);
        if (feature instanceof Map) {
            return (Map) feature;
        }
        return null;
    }

    public final Number getNumericFeature(String str, String str2, String str3, ReturnCode returnCode) {
        return C1923007g4.LIZIZ(getFeature(str, str2, str3, returnCode));
    }

    public final String getStringFeature(String str, String str2, String str3, ReturnCode returnCode) {
        Object feature = getFeature(str, str2, str3, returnCode);
        if (feature != null) {
            return feature.toString();
        }
        return null;
    }

    public final Boolean getBooleanFeature(String str, JSONObject jSONObject, String str2, ReturnCode returnCode) {
        return C1923007g4.LIZ(getFeature(str, jSONObject, str2, returnCode));
    }

    public final JSONObject getDictFeature(String str, JSONObject jSONObject, String str2, ReturnCode returnCode) throws JSONException {
        Object feature = getFeature(str, jSONObject, str2, returnCode);
        if (feature instanceof JSONObject) {
            return (JSONObject) feature;
        }
        return null;
    }

    public final Object getFeature(String str, String str2, String str3, ReturnCode returnCode) {
        try {
            return getFeature(str, new JSONObject(str2), str3, returnCode);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final List<Object> getListFeature(String str, JSONObject jSONObject, String str2, ReturnCode returnCode) throws JSONException {
        Object feature = getFeature(str, jSONObject, str2, returnCode);
        if (feature instanceof List) {
            return (List) feature;
        }
        return null;
    }

    public final Map<Object, Object> getMapFeature(String str, JSONObject jSONObject, String str2, ReturnCode returnCode) throws JSONException {
        Object feature = getFeature(str, jSONObject, str2, returnCode);
        if (feature instanceof Map) {
            return (Map) feature;
        }
        return null;
    }

    public final Number getNumericFeature(String str, JSONObject jSONObject, String str2, ReturnCode returnCode) {
        return C1923007g4.LIZIZ(getFeature(str, jSONObject, str2, returnCode));
    }

    public final String getStringFeature(String str, JSONObject jSONObject, String str2, ReturnCode returnCode) throws JSONException {
        Object feature = getFeature(str, jSONObject, str2, returnCode);
        if (feature != null) {
            return feature.toString();
        }
        return null;
    }

    public final boolean getBooleanFeature(String str, boolean z, String str2, String str3, ReturnCode returnCode) {
        Boolean booleanFeature = getBooleanFeature(str, str2, str3, returnCode);
        if (booleanFeature != null) {
            return booleanFeature.booleanValue();
        }
        return z;
    }

    public final Number getNumericFeature(String str, Number number, String str2, String str3, ReturnCode returnCode) {
        Number numericFeature = getNumericFeature(str, str2, str3, returnCode);
        if (numericFeature != null) {
            return numericFeature;
        }
        return number;
    }

    public final String getStringFeature(String str, String str2, String str3, String str4, ReturnCode returnCode) {
        String stringFeature = getStringFeature(str, str3, str4, returnCode);
        if (stringFeature != null) {
            return stringFeature;
        }
        return str2;
    }

    public final boolean getBooleanFeature(String str, boolean z, JSONObject jSONObject, String str2, ReturnCode returnCode) {
        Boolean booleanFeature = getBooleanFeature(str, jSONObject, str2, returnCode);
        if (booleanFeature != null) {
            return booleanFeature.booleanValue();
        }
        return z;
    }

    public final Number getNumericFeature(String str, Number number, JSONObject jSONObject, String str2, ReturnCode returnCode) {
        Number numericFeature = getNumericFeature(str, jSONObject, str2, returnCode);
        if (numericFeature != null) {
            return numericFeature;
        }
        return number;
    }

    public final String getStringFeature(String str, String str2, String str3, JSONObject jSONObject, ReturnCode returnCode) throws JSONException {
        String stringFeature = getStringFeature(str, jSONObject, str3, returnCode);
        if (stringFeature != null) {
            return stringFeature;
        }
        return str2;
    }

    public void putRecursive(JSONObject jSONObject, String str, FeatureItem featureItem, Object obj, boolean z, int i) throws JSONException {
        int i2;
        if (obj == null) {
            return;
        }
        int i3 = 0;
        if (obj instanceof List) {
            for (Object jSONObject2 : (Iterable) obj) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    if (i >= ((List) obj).size()) {
                        i3 = (i - 1) - i3;
                    }
                    if (z) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        sbLIZ.append('_');
                        sbLIZ.append(i3);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        if (jSONObject2 == null) {
                            jSONObject2 = new JSONObject();
                        }
                        putRecursive$default(this, jSONObject, strLIZIZ, featureItem, jSONObject2, true, 0, 32, null);
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(str);
                        sbLIZ2.append('_');
                        sbLIZ2.append(i3);
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        if (jSONObject2 == null) {
                            jSONObject2 = new JSONObject();
                        }
                        jSONObject.put(strLIZIZ2, jSONObject2);
                    }
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return;
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i5 = 0; i5 < length; i5++) {
                if (i >= jSONArray.length()) {
                    i2 = (i - 1) - i5;
                } else {
                    i2 = i5;
                }
                if (z) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(str);
                    sbLIZ3.append('_');
                    sbLIZ3.append(i2);
                    String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                    Object objOpt = jSONArray.opt(i5);
                    if (objOpt == null) {
                        objOpt = new JSONObject();
                    }
                    putRecursive$default(this, jSONObject, strLIZIZ3, featureItem, objOpt, true, 0, 32, null);
                } else {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(str);
                    sbLIZ4.append('_');
                    sbLIZ4.append(i2);
                    String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
                    Object objOpt2 = jSONArray.opt(i5);
                    if (objOpt2 == null) {
                        objOpt2 = new JSONObject();
                    }
                    jSONObject.put(strLIZIZ4, objOpt2);
                }
            }
            return;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(str);
                sbLIZ5.append('_');
                sbLIZ5.append(obj2);
                jSONObject.put(C2188811AlT.LIZIZ(sbLIZ5), map.get(obj2));
            }
            return;
        }
        jSONObject.put(str, obj);
    }

    public static /* synthetic */ JSONObject getBatchFeature$default(FeatureProducer featureProducer, List list, FlattenConfig flattenConfig, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                flattenConfig = null;
            }
            if ((i & 8) != 0) {
                z = false;
            }
            return featureProducer.getBatchFeature(list, flattenConfig, str, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBatchFeature");
    }

    public static /* synthetic */ Boolean getBooleanFeature$default(FeatureProducer featureProducer, String str, JSONObject jSONObject, String str2, ReturnCode returnCode, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                jSONObject = null;
            }
            if ((i & 8) != 0) {
                returnCode = new ReturnCode(-1, -1);
            }
            return featureProducer.getBooleanFeature(str, jSONObject, str2, returnCode);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBooleanFeature");
    }

    public static /* synthetic */ JSONObject getDictFeature$default(FeatureProducer featureProducer, String str, JSONObject jSONObject, String str2, ReturnCode returnCode, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                jSONObject = null;
            }
            if ((i & 8) != 0) {
                returnCode = new ReturnCode(-1, -1);
            }
            return featureProducer.getDictFeature(str, jSONObject, str2, returnCode);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDictFeature");
    }

    public static /* synthetic */ Object getFeature$default(FeatureProducer featureProducer, String str, JSONObject jSONObject, String str2, ReturnCode returnCode, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                jSONObject = null;
            }
            if ((i & 8) != 0) {
                returnCode = new ReturnCode(-1, -1);
            }
            return featureProducer.getFeature(str, jSONObject, str2, returnCode);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFeature");
    }

    public static /* synthetic */ List getListFeature$default(FeatureProducer featureProducer, String str, JSONObject jSONObject, String str2, ReturnCode returnCode, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                jSONObject = null;
            }
            if ((i & 8) != 0) {
                returnCode = new ReturnCode(-1, -1);
            }
            return featureProducer.getListFeature(str, jSONObject, str2, returnCode);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getListFeature");
    }

    public static /* synthetic */ Map getMapFeature$default(FeatureProducer featureProducer, String str, JSONObject jSONObject, String str2, ReturnCode returnCode, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                jSONObject = null;
            }
            if ((i & 8) != 0) {
                returnCode = new ReturnCode(-1, -1);
            }
            return featureProducer.getMapFeature(str, jSONObject, str2, returnCode);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMapFeature");
    }

    public static /* synthetic */ Number getNumericFeature$default(FeatureProducer featureProducer, String str, JSONObject jSONObject, String str2, ReturnCode returnCode, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                jSONObject = null;
            }
            if ((i & 8) != 0) {
                returnCode = new ReturnCode(-1, -1);
            }
            return featureProducer.getNumericFeature(str, jSONObject, str2, returnCode);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNumericFeature");
    }

    public static /* synthetic */ String getStringFeature$default(FeatureProducer featureProducer, String str, JSONObject jSONObject, String str2, ReturnCode returnCode, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                jSONObject = null;
            }
            if ((i & 8) != 0) {
                returnCode = new ReturnCode(-1, -1);
            }
            return featureProducer.getStringFeature(str, jSONObject, str2, returnCode);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStringFeature");
    }

    public static /* synthetic */ Object getFeature$default(FeatureProducer featureProducer, String str, String str2, String str3, ReturnCode returnCode, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                returnCode = new ReturnCode(-1, -1);
            }
            return featureProducer.getFeature(str, str2, str3, returnCode);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFeature");
    }

    public static /* synthetic */ Number getNumericFeature$default(FeatureProducer featureProducer, String str, String str2, String str3, ReturnCode returnCode, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                returnCode = new ReturnCode(-1, -1);
            }
            return featureProducer.getNumericFeature(str, str2, str3, returnCode);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNumericFeature");
    }

    public static /* synthetic */ String getStringFeature$default(FeatureProducer featureProducer, String str, String str2, String str3, ReturnCode returnCode, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                returnCode = new ReturnCode(-1, -1);
            }
            return featureProducer.getStringFeature(str, str2, str3, returnCode);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStringFeature");
    }

    public static /* synthetic */ Number getNumericFeature$default(FeatureProducer featureProducer, String str, Number number, JSONObject jSONObject, String str2, ReturnCode returnCode, int i, Object obj) {
        ReturnCode returnCode2 = returnCode;
        if (obj == null) {
            JSONObject jSONObject2 = null;
            if ((i & 4) == 0) {
                jSONObject2 = jSONObject;
            }
            if ((i & 16) != 0) {
                returnCode2 = new ReturnCode(-1, -1);
            }
            return featureProducer.getNumericFeature(str, number, jSONObject2, str2, returnCode2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNumericFeature");
    }

    public static /* synthetic */ void putRecursive$default(FeatureProducer featureProducer, JSONObject jSONObject, String str, FeatureItem featureItem, Object obj, boolean z, int i, int i2, Object obj2) throws JSONException {
        if (obj2 == null) {
            if ((i2 & 16) != 0) {
                z = false;
            }
            if ((i2 & 32) != 0) {
                i = -1;
            }
            featureProducer.putRecursive(jSONObject, str, featureItem, obj, z, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: putRecursive");
    }
}
