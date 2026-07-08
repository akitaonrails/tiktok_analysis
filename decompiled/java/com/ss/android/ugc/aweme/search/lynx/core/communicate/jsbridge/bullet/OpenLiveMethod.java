package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.C098200Yq;
import X.C0Q0W;
import X.C1051660dTQ;
import X.C189200o6;
import X.C651970Phj;
import X.C651980Phk;
import X.C663340Q0e;
import X.EnumC1051570dTH;
import X.EnumC663360Q0g;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class OpenLiveMethod extends BaseBridgeMethod {
    public EnumC1051570dTH access;
    public final C663340Q0e helper;
    public final String name;
    public String reactId;
    public static final C0Q0W Companion = new Object() { // from class: X.0Q0W
    };
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC1051750dTZ, X.InterfaceC1051460dT6
    public EnumC1051570dTH getAccess() {
        return this.access;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public OpenLiveMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "open_live";
        this.helper = new C663340Q0e(c1051660dTQ, getName(), EnumC663360Q0g.STABLE);
        this.access = EnumC1051570dTH.PRIVATE;
        this.reactId = "";
    }

    private final Map<String, String> jsonObjToMap(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            linkedHashMap.put(next, JSONObjectProtectorUtils.getString(jSONObject, next));
        }
        return linkedHashMap;
    }

    private final void putExtraData(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("log_extra");
        if (jSONObjectOptJSONObject != null) {
            linkedHashMap.putAll(jsonObjToMap(jSONObjectOptJSONObject));
        }
        C651970Phj.LLILLL.getClass();
        C651980Phk.LJFF(linkedHashMap, false);
    }

    @Override // X.AbstractC1051750dTZ
    public void setAccess(EnumC1051570dTH enumC1051570dTH) {
        this.access = enumC1051570dTH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0202 A[Catch: Exception -> 0x0356, TryCatch #1 {Exception -> 0x0356, blocks: (B:94:0x01be, B:96:0x01c4, B:98:0x01ca, B:100:0x01d4, B:103:0x01dd, B:105:0x01ff, B:108:0x020c, B:112:0x0218, B:120:0x0230, B:124:0x023c, B:132:0x0254, B:135:0x025e, B:137:0x0284, B:139:0x028c, B:141:0x0290, B:142:0x0296, B:144:0x029a, B:150:0x02a5, B:153:0x02ad, B:155:0x02b1, B:156:0x02b5, B:159:0x02bc, B:161:0x02c2, B:163:0x02c6, B:165:0x02cc, B:168:0x02d4, B:170:0x02da, B:152:0x02a9, B:171:0x02dd, B:173:0x02e5, B:174:0x02ea, B:176:0x02f2, B:178:0x02f8, B:128:0x0248, B:116:0x0224, B:106:0x0202), top: B:197:0x01be }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0218 A[Catch: Exception -> 0x0356, PHI: r15
      0x0218: PHI (r15v13 java.lang.String) = (r15v0 java.lang.String), (r15v14 java.lang.String) binds: [B:111:0x0216, B:109:0x0212] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x0356, blocks: (B:94:0x01be, B:96:0x01c4, B:98:0x01ca, B:100:0x01d4, B:103:0x01dd, B:105:0x01ff, B:108:0x020c, B:112:0x0218, B:120:0x0230, B:124:0x023c, B:132:0x0254, B:135:0x025e, B:137:0x0284, B:139:0x028c, B:141:0x0290, B:142:0x0296, B:144:0x029a, B:150:0x02a5, B:153:0x02ad, B:155:0x02b1, B:156:0x02b5, B:159:0x02bc, B:161:0x02c2, B:163:0x02c6, B:165:0x02cc, B:168:0x02d4, B:170:0x02da, B:152:0x02a9, B:171:0x02dd, B:173:0x02e5, B:174:0x02ea, B:176:0x02f2, B:178:0x02f8, B:128:0x0248, B:116:0x0224, B:106:0x0202), top: B:197:0x01be }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0220 A[PHI: r15
      0x0220: PHI (r15v12 java.lang.String) = (r15v0 java.lang.String), (r15v13 java.lang.String) binds: [B:111:0x0216, B:113:0x021e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0224 A[Catch: Exception -> 0x0356, PHI: r12 r15
      0x0224: PHI (r12v2 java.lang.String) = (r12v13 java.lang.String), (r12v14 java.lang.String) binds: [B:115:0x0222, B:113:0x021e] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r15v1 java.lang.String) = (r15v12 java.lang.String), (r15v13 java.lang.String) binds: [B:115:0x0222, B:113:0x021e] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x0356, blocks: (B:94:0x01be, B:96:0x01c4, B:98:0x01ca, B:100:0x01d4, B:103:0x01dd, B:105:0x01ff, B:108:0x020c, B:112:0x0218, B:120:0x0230, B:124:0x023c, B:132:0x0254, B:135:0x025e, B:137:0x0284, B:139:0x028c, B:141:0x0290, B:142:0x0296, B:144:0x029a, B:150:0x02a5, B:153:0x02ad, B:155:0x02b1, B:156:0x02b5, B:159:0x02bc, B:161:0x02c2, B:163:0x02c6, B:165:0x02cc, B:168:0x02d4, B:170:0x02da, B:152:0x02a9, B:171:0x02dd, B:173:0x02e5, B:174:0x02ea, B:176:0x02f2, B:178:0x02f8, B:128:0x0248, B:116:0x0224, B:106:0x0202), top: B:197:0x01be }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x022c A[PHI: r12 r15
      0x022c: PHI (r12v12 java.lang.String) = (r12v2 java.lang.String), (r12v13 java.lang.String) binds: [B:117:0x022a, B:115:0x0222] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r15v11 java.lang.String) = (r15v1 java.lang.String), (r15v12 java.lang.String) binds: [B:117:0x022a, B:115:0x0222] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0230 A[Catch: Exception -> 0x0356, PHI: r10 r12 r15
      0x0230: PHI (r10v15 java.lang.String) = (r10v0 java.lang.String), (r10v16 java.lang.String) binds: [B:117:0x022a, B:119:0x022e] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r12v11 java.lang.String) = (r12v2 java.lang.String), (r12v12 java.lang.String) binds: [B:117:0x022a, B:119:0x022e] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r15v10 java.lang.String) = (r15v1 java.lang.String), (r15v11 java.lang.String) binds: [B:117:0x022a, B:119:0x022e] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x0356, blocks: (B:94:0x01be, B:96:0x01c4, B:98:0x01ca, B:100:0x01d4, B:103:0x01dd, B:105:0x01ff, B:108:0x020c, B:112:0x0218, B:120:0x0230, B:124:0x023c, B:132:0x0254, B:135:0x025e, B:137:0x0284, B:139:0x028c, B:141:0x0290, B:142:0x0296, B:144:0x029a, B:150:0x02a5, B:153:0x02ad, B:155:0x02b1, B:156:0x02b5, B:159:0x02bc, B:161:0x02c2, B:163:0x02c6, B:165:0x02cc, B:168:0x02d4, B:170:0x02da, B:152:0x02a9, B:171:0x02dd, B:173:0x02e5, B:174:0x02ea, B:176:0x02f2, B:178:0x02f8, B:128:0x0248, B:116:0x0224, B:106:0x0202), top: B:197:0x01be }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0238 A[PHI: r10 r12 r15
      0x0238: PHI (r10v1 java.lang.String) = (r10v15 java.lang.String), (r10v16 java.lang.String) binds: [B:121:0x0236, B:119:0x022e] A[DONT_GENERATE, DONT_INLINE]
      0x0238: PHI (r12v3 java.lang.String) = (r12v11 java.lang.String), (r12v12 java.lang.String) binds: [B:121:0x0236, B:119:0x022e] A[DONT_GENERATE, DONT_INLINE]
      0x0238: PHI (r15v2 java.lang.String) = (r15v10 java.lang.String), (r15v11 java.lang.String) binds: [B:121:0x0236, B:119:0x022e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x023c A[Catch: Exception -> 0x0356, PHI: r9 r10 r12 r15
      0x023c: PHI (r9v10 java.lang.String) = (r9v1 java.lang.String), (r9v11 java.lang.String) binds: [B:123:0x023a, B:121:0x0236] A[DONT_GENERATE, DONT_INLINE]
      0x023c: PHI (r10v14 java.lang.String) = (r10v1 java.lang.String), (r10v15 java.lang.String) binds: [B:123:0x023a, B:121:0x0236] A[DONT_GENERATE, DONT_INLINE]
      0x023c: PHI (r12v10 java.lang.String) = (r12v3 java.lang.String), (r12v11 java.lang.String) binds: [B:123:0x023a, B:121:0x0236] A[DONT_GENERATE, DONT_INLINE]
      0x023c: PHI (r15v9 java.lang.String) = (r15v2 java.lang.String), (r15v10 java.lang.String) binds: [B:123:0x023a, B:121:0x0236] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x0356, blocks: (B:94:0x01be, B:96:0x01c4, B:98:0x01ca, B:100:0x01d4, B:103:0x01dd, B:105:0x01ff, B:108:0x020c, B:112:0x0218, B:120:0x0230, B:124:0x023c, B:132:0x0254, B:135:0x025e, B:137:0x0284, B:139:0x028c, B:141:0x0290, B:142:0x0296, B:144:0x029a, B:150:0x02a5, B:153:0x02ad, B:155:0x02b1, B:156:0x02b5, B:159:0x02bc, B:161:0x02c2, B:163:0x02c6, B:165:0x02cc, B:168:0x02d4, B:170:0x02da, B:152:0x02a9, B:171:0x02dd, B:173:0x02e5, B:174:0x02ea, B:176:0x02f2, B:178:0x02f8, B:128:0x0248, B:116:0x0224, B:106:0x0202), top: B:197:0x01be }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0244 A[PHI: r9 r10 r12 r15
      0x0244: PHI (r9v9 java.lang.String) = (r9v1 java.lang.String), (r9v10 java.lang.String) binds: [B:123:0x023a, B:125:0x0242] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r10v13 java.lang.String) = (r10v1 java.lang.String), (r10v14 java.lang.String) binds: [B:123:0x023a, B:125:0x0242] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r12v9 java.lang.String) = (r12v3 java.lang.String), (r12v10 java.lang.String) binds: [B:123:0x023a, B:125:0x0242] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r15v8 java.lang.String) = (r15v2 java.lang.String), (r15v9 java.lang.String) binds: [B:123:0x023a, B:125:0x0242] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0248 A[Catch: Exception -> 0x0356, PHI: r8 r9 r10 r12 r15
      0x0248: PHI (r8v1 java.lang.String) = (r8v14 java.lang.String), (r8v15 java.lang.String) binds: [B:127:0x0246, B:125:0x0242] A[DONT_GENERATE, DONT_INLINE]
      0x0248: PHI (r9v2 java.lang.String) = (r9v9 java.lang.String), (r9v10 java.lang.String) binds: [B:127:0x0246, B:125:0x0242] A[DONT_GENERATE, DONT_INLINE]
      0x0248: PHI (r10v2 java.lang.String) = (r10v13 java.lang.String), (r10v14 java.lang.String) binds: [B:127:0x0246, B:125:0x0242] A[DONT_GENERATE, DONT_INLINE]
      0x0248: PHI (r12v4 java.lang.String) = (r12v9 java.lang.String), (r12v10 java.lang.String) binds: [B:127:0x0246, B:125:0x0242] A[DONT_GENERATE, DONT_INLINE]
      0x0248: PHI (r15v3 java.lang.String) = (r15v8 java.lang.String), (r15v9 java.lang.String) binds: [B:127:0x0246, B:125:0x0242] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x0356, blocks: (B:94:0x01be, B:96:0x01c4, B:98:0x01ca, B:100:0x01d4, B:103:0x01dd, B:105:0x01ff, B:108:0x020c, B:112:0x0218, B:120:0x0230, B:124:0x023c, B:132:0x0254, B:135:0x025e, B:137:0x0284, B:139:0x028c, B:141:0x0290, B:142:0x0296, B:144:0x029a, B:150:0x02a5, B:153:0x02ad, B:155:0x02b1, B:156:0x02b5, B:159:0x02bc, B:161:0x02c2, B:163:0x02c6, B:165:0x02cc, B:168:0x02d4, B:170:0x02da, B:152:0x02a9, B:171:0x02dd, B:173:0x02e5, B:174:0x02ea, B:176:0x02f2, B:178:0x02f8, B:128:0x0248, B:116:0x0224, B:106:0x0202), top: B:197:0x01be }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0250 A[PHI: r8 r9 r10 r12 r15
      0x0250: PHI (r8v13 java.lang.String) = (r8v1 java.lang.String), (r8v14 java.lang.String) binds: [B:129:0x024e, B:127:0x0246] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r9v8 java.lang.String) = (r9v2 java.lang.String), (r9v9 java.lang.String) binds: [B:129:0x024e, B:127:0x0246] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r10v12 java.lang.String) = (r10v2 java.lang.String), (r10v13 java.lang.String) binds: [B:129:0x024e, B:127:0x0246] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r12v8 java.lang.String) = (r12v4 java.lang.String), (r12v9 java.lang.String) binds: [B:129:0x024e, B:127:0x0246] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r15v7 java.lang.String) = (r15v3 java.lang.String), (r15v8 java.lang.String) binds: [B:129:0x024e, B:127:0x0246] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0254 A[Catch: Exception -> 0x0356, PHI: r3 r8 r9 r10 r12 r15
      0x0254: PHI (r3v18 java.lang.String) = (r3v2 java.lang.String), (r3v19 java.lang.String) binds: [B:129:0x024e, B:131:0x0252] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r8v12 java.lang.String) = (r8v1 java.lang.String), (r8v13 java.lang.String) binds: [B:129:0x024e, B:131:0x0252] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r9v7 java.lang.String) = (r9v2 java.lang.String), (r9v8 java.lang.String) binds: [B:129:0x024e, B:131:0x0252] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r10v11 java.lang.String) = (r10v2 java.lang.String), (r10v12 java.lang.String) binds: [B:129:0x024e, B:131:0x0252] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r12v7 java.lang.String) = (r12v4 java.lang.String), (r12v8 java.lang.String) binds: [B:129:0x024e, B:131:0x0252] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r15v6 java.lang.String) = (r15v3 java.lang.String), (r15v7 java.lang.String) binds: [B:129:0x024e, B:131:0x0252] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x0356, blocks: (B:94:0x01be, B:96:0x01c4, B:98:0x01ca, B:100:0x01d4, B:103:0x01dd, B:105:0x01ff, B:108:0x020c, B:112:0x0218, B:120:0x0230, B:124:0x023c, B:132:0x0254, B:135:0x025e, B:137:0x0284, B:139:0x028c, B:141:0x0290, B:142:0x0296, B:144:0x029a, B:150:0x02a5, B:153:0x02ad, B:155:0x02b1, B:156:0x02b5, B:159:0x02bc, B:161:0x02c2, B:163:0x02c6, B:165:0x02cc, B:168:0x02d4, B:170:0x02da, B:152:0x02a9, B:171:0x02dd, B:173:0x02e5, B:174:0x02ea, B:176:0x02f2, B:178:0x02f8, B:128:0x0248, B:116:0x0224, B:106:0x0202), top: B:197:0x01be }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x025c A[PHI: r3 r8 r9 r10 r12 r15
      0x025c: PHI (r3v3 java.lang.String) = (r3v18 java.lang.String), (r3v19 java.lang.String) binds: [B:133:0x025a, B:131:0x0252] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r8v2 java.lang.String) = (r8v12 java.lang.String), (r8v13 java.lang.String) binds: [B:133:0x025a, B:131:0x0252] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r9v3 java.lang.String) = (r9v7 java.lang.String), (r9v8 java.lang.String) binds: [B:133:0x025a, B:131:0x0252] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r10v3 java.lang.String) = (r10v11 java.lang.String), (r10v12 java.lang.String) binds: [B:133:0x025a, B:131:0x0252] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r12v5 java.lang.String) = (r12v7 java.lang.String), (r12v8 java.lang.String) binds: [B:133:0x025a, B:131:0x0252] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r15v4 java.lang.String) = (r15v6 java.lang.String), (r15v7 java.lang.String) binds: [B:133:0x025a, B:131:0x0252] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02b1 A[Catch: Exception -> 0x0356, TryCatch #1 {Exception -> 0x0356, blocks: (B:94:0x01be, B:96:0x01c4, B:98:0x01ca, B:100:0x01d4, B:103:0x01dd, B:105:0x01ff, B:108:0x020c, B:112:0x0218, B:120:0x0230, B:124:0x023c, B:132:0x0254, B:135:0x025e, B:137:0x0284, B:139:0x028c, B:141:0x0290, B:142:0x0296, B:144:0x029a, B:150:0x02a5, B:153:0x02ad, B:155:0x02b1, B:156:0x02b5, B:159:0x02bc, B:161:0x02c2, B:163:0x02c6, B:165:0x02cc, B:168:0x02d4, B:170:0x02da, B:152:0x02a9, B:171:0x02dd, B:173:0x02e5, B:174:0x02ea, B:176:0x02f2, B:178:0x02f8, B:128:0x0248, B:116:0x0224, B:106:0x0202), top: B:197:0x01be }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02da A[Catch: Exception -> 0x0356, TryCatch #1 {Exception -> 0x0356, blocks: (B:94:0x01be, B:96:0x01c4, B:98:0x01ca, B:100:0x01d4, B:103:0x01dd, B:105:0x01ff, B:108:0x020c, B:112:0x0218, B:120:0x0230, B:124:0x023c, B:132:0x0254, B:135:0x025e, B:137:0x0284, B:139:0x028c, B:141:0x0290, B:142:0x0296, B:144:0x029a, B:150:0x02a5, B:153:0x02ad, B:155:0x02b1, B:156:0x02b5, B:159:0x02bc, B:161:0x02c2, B:163:0x02c6, B:165:0x02cc, B:168:0x02d4, B:170:0x02da, B:152:0x02a9, B:171:0x02dd, B:173:0x02e5, B:174:0x02ea, B:176:0x02f2, B:178:0x02f8, B:128:0x0248, B:116:0x0224, B:106:0x0202), top: B:197:0x01be }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handle(org.json.JSONObject r21, X.InterfaceC1019840ce6 r22) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet.OpenLiveMethod.handle(org.json.JSONObject, X.0ce6):void");
    }

    private final void setBtmCD(String str, View view, Map<String, String> map) {
        Object c098200Yq;
        Object c098200Yq2;
        if (str != null && str.length() != 0) {
            Uri uri = UriProtector.parse(str);
            try {
                c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "btm_c_code");
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Object obj = null;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            String str2 = (String) c098200Yq;
            try {
                c098200Yq2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "btm_d_code");
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                obj = c098200Yq2;
            }
            String str3 = (String) obj;
            if (view != null) {
                if (str2 != null || str3 != null || map != null) {
                    IEcomSearchService iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
                    if (str2 == null) {
                        str2 = "c0";
                    }
                    if (str3 == null) {
                        str3 = "d0";
                    }
                    iEcomSearchService.LJJLIIJ(view, str2, str3, map, null);
                }
            }
        }
    }
}
