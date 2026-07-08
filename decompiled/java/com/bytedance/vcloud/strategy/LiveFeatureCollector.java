package com.bytedance.vcloud.strategy;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class LiveFeatureCollector {
    public static volatile LiveFeatureCollector sInstance;
    public JSONObject mCurCallerInfo;
    public final ReentrantLock mLock = new ReentrantLock();
    public final String KEY_FEATURES_BUNDLE = "bundle";
    public final ReentrantReadWriteLock mReadWriteLock = new ReentrantReadWriteLock(false);

    public static LiveFeatureCollector inst() {
        if (sInstance == null) {
            synchronized (LiveFeatureCollector.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new LiveFeatureCollector();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return sInstance;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0062. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b2 A[Catch: JSONException -> 0x01bd, TRY_ENTER, TRY_LEAVE, TryCatch #7 {JSONException -> 0x01bd, blocks: (B:72:0x0138, B:74:0x013e, B:85:0x0172, B:95:0x0195, B:99:0x01a4, B:102:0x01b2, B:76:0x014b, B:78:0x0153, B:79:0x015e), top: B:235:0x0138, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0220 A[Catch: Exception -> 0x022a, TRY_LEAVE, TryCatch #3 {Exception -> 0x022a, blocks: (B:130:0x0211, B:132:0x0217, B:133:0x0220), top: B:227:0x0211, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0241 A[Catch: Exception -> 0x024b, TRY_LEAVE, TryCatch #17 {Exception -> 0x024b, blocks: (B:137:0x0232, B:139:0x0238, B:140:0x0241), top: B:255:0x0232, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0262 A[Catch: Exception -> 0x026c, TRY_LEAVE, TryCatch #2 {Exception -> 0x026c, blocks: (B:144:0x0253, B:146:0x0259, B:147:0x0262), top: B:225:0x0253, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0283 A[Catch: Exception -> 0x028d, TRY_LEAVE, TryCatch #15 {Exception -> 0x028d, blocks: (B:151:0x0274, B:153:0x027a, B:154:0x0283), top: B:251:0x0274, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02a4 A[Catch: Exception -> 0x02a9, TRY_LEAVE, TryCatch #4 {Exception -> 0x02a9, blocks: (B:158:0x0295, B:160:0x029b, B:161:0x02a4), top: B:229:0x0295, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02c0 A[Catch: Exception -> 0x02c5, TRY_LEAVE, TryCatch #24 {Exception -> 0x02c5, blocks: (B:165:0x02b1, B:167:0x02b7, B:168:0x02c0), top: B:269:0x02b1, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02da A[Catch: Exception -> 0x02de, TRY_LEAVE, TryCatch #10 {Exception -> 0x02de, blocks: (B:172:0x02cc, B:174:0x02d2, B:175:0x02da), top: B:241:0x02cc, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02f3 A[Catch: Exception -> 0x02f7, TRY_LEAVE, TryCatch #6 {Exception -> 0x02f7, blocks: (B:179:0x02e5, B:181:0x02eb, B:182:0x02f3), top: B:233:0x02e5, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0337 A[Catch: Exception -> 0x033b, TRY_LEAVE, TryCatch #22 {Exception -> 0x033b, blocks: (B:199:0x0329, B:201:0x032f, B:202:0x0337), top: B:265:0x0329, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0138 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x01db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015e A[Catch: Exception -> 0x0169, TRY_LEAVE, TryCatch #5 {Exception -> 0x0169, blocks: (B:76:0x014b, B:78:0x0153, B:79:0x015e), top: B:231:0x014b, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019a  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject fillInputFeatures(org.json.JSONObject r26) {
        /*
            Method dump skipped, instruction units count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.vcloud.strategy.LiveFeatureCollector.fillInputFeatures(org.json.JSONObject):org.json.JSONObject");
    }

    public JSONArray setCurCallerInfo(JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null && (jSONObject.has("InputFeatureList") || jSONObject.has("InputSettingsParam") || jSONObject.has("EnableSmartStrategyConfig"))) {
            JSONObject jSONObject2 = new JSONObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!next.equals("InputFeatureList") && !next.equals("InputSettingsParam") && !next.equals("EnableSmartStrategyConfig")) {
                    try {
                        jSONObject2.put(next, jSONObject.get(next));
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } else if (next.equals("InputFeatureList")) {
                    try {
                        jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "InputFeatureList");
                    } catch (JSONException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
            }
            jSONObject = jSONObject2;
        }
        this.mLock.lock();
        this.mCurCallerInfo = jSONObject;
        this.mLock.unlock();
        return jSONArray;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r8.equals("stream_session_vv_id") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (r8.equals("is_preview") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r8.equals("enter_from") == false) goto L6;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> T getCallerInfo(java.lang.String r8, T r9) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.vcloud.strategy.LiveFeatureCollector.getCallerInfo(java.lang.String, java.lang.Object):java.lang.Object");
    }
}
