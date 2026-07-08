package com.ss.android.ugc.aweme.ad.recording;

import X.C01GW;
import X.C07N1;
import X.C083Y;
import X.C1042260dEG;
import X.C1227904rF;
import X.C13LQ;
import X.C1AF0;
import X.C20557083n;
import X.C20559083p;
import X.C452501pT;
import X.C786410Ut5;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.recording.AdLandPageEngageInfoProvider;
import com.ss.android.ugc.aweme.ad.recording.engageinfo.IAdLandPageEngageInfoProvider;
import com.ss.android.ugc.aweme.ad.recording.model.EngageInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class AdLandPageEngageInfoProvider implements IAdLandPageEngageInfoProvider {
    public final Map<String, C20559083p> LIZ = Collections.synchronizedMap(new LinkedHashMap<String, C20559083p>() { // from class: X.083q
        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<String, C20559083p>> entrySet() {
            return getEntries();
        }

        public /* bridge */ Set<Map.Entry<String, C20559083p>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<String> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<C20559083p> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<String> keySet() {
            return getKeys();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<C20559083p> values() {
            return getValues();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof C20559083p)) {
                return false;
            }
            return containsValue((C20559083p) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ C20559083p get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ C20559083p remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, C20559083p> entry) {
            if (size() > 5) {
                return true;
            }
            return false;
        }

        public /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public /* bridge */ boolean containsValue(C20559083p c20559083p) {
            return super.containsValue((Object) c20559083p);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        public /* bridge */ C20559083p get(String str) {
            return (C20559083p) super.get((Object) str);
        }

        public /* bridge */ C20559083p remove(String str) {
            return (C20559083p) super.remove((Object) str);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof String)) {
                return obj2;
            }
            return getOrDefault((String) obj, (C20559083p) obj2);
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (!(obj instanceof String) || !(obj2 instanceof C20559083p)) {
                return false;
            }
            return remove((String) obj, (C20559083p) obj2);
        }

        public final /* bridge */ C20559083p getOrDefault(Object obj, C20559083p c20559083p) {
            if (!(obj instanceof String)) {
                return c20559083p;
            }
            return getOrDefault((String) obj, c20559083p);
        }

        public /* bridge */ boolean remove(String str, C20559083p c20559083p) {
            return super.remove((Object) str, (Object) c20559083p);
        }

        public /* bridge */ C20559083p getOrDefault(String str, C20559083p c20559083p) {
            return (C20559083p) super.getOrDefault((Object) str, c20559083p);
        }
    });
    public final Set<String> LIZIZ = C13LQ.LJLIIL(new String[]{"click", "realtime_click"});
    public final C01GW LIZJ = C452501pT.LIZIZ(new C20557083n());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C083Y(this));
    public final C01GW LJ = C452501pT.LIZIZ(new C07N1());

    @Override // com.ss.android.ugc.aweme.ad.recording.engageinfo.IAdLandPageEngageInfoProvider
    public final String LIZIZ(String str) {
        boolean z;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z || !C1042260dEG.LIZ().enableGenerateEngagedInfo) {
            return "";
        }
        try {
            C20559083p c20559083p = this.LIZ.get(str);
            if (c20559083p != null) {
                if (c20559083p.LIZJ.get()) {
                    C1227904rF.LIZ.getClass();
                    c20559083p.LIZIZ = GsonProtectorUtils.toJson(C1227904rF.LIZLLL(), c20559083p.LIZ);
                }
                String str2 = c20559083p.LIZIZ;
                if (str2 != null) {
                    return str2;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.ad.recording.engageinfo.IAdLandPageEngageInfoProvider
    public final void LIZ(final String str, final String str2, final String str3, final String str4) {
        if (a0.LJJJIL(str) || a0.LJJJIL(str2) || !C1042260dEG.LIZ().enableGenerateEngagedInfo) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: X.083o
            public final void LIZ() {
                C20559083p c20559083p;
                if (Intrinsics.LJFF(str2, "show")) {
                    Map<String, C20559083p> map = this.LIZ;
                    String str5 = str;
                    C20559083p c20559083p2 = map.get(str5);
                    if (c20559083p2 == null) {
                        c20559083p2 = new C20559083p();
                        map.put(str5, c20559083p2);
                    }
                    c20559083p = c20559083p2;
                } else {
                    AdLandPageEngageInfoProvider adLandPageEngageInfoProvider = this;
                    String str6 = str2;
                    String str7 = str3;
                    String str8 = str4;
                    if (!adLandPageEngageInfoProvider.LIZIZ.contains(str6)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str6);
                        if (!a0.LJJJIL(str7)) {
                            sb.append("+");
                            sb.append(str7);
                        }
                        if (str8 != null && !a0.LJJJIL(str8)) {
                            sb.append("+");
                            sb.append(str8);
                        }
                        if (!((Set) adLandPageEngageInfoProvider.LJ.getValue()).contains(sb.toString())) {
                            return;
                        }
                    }
                    c20559083p = this.LIZ.get(str);
                }
                if (c20559083p != null) {
                    String str9 = str2;
                    String str10 = str3;
                    String str11 = str4;
                    String str12 = str;
                    if (Intrinsics.LJFF(str9, "realtime_click")) {
                        str9 = "click";
                    }
                    ((ArrayList) c20559083p.LIZ).add(new EngageInfo(str10, str9, str11, str12, Long.valueOf(System.currentTimeMillis())));
                    c20559083p.LIZJ.set(true);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AdLandPageEngageInfoProvider@cb5c.onAdEvent$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AdLandPageEngageInfoProvider@cb5c.onAdEvent$1");
            }
        };
        if (Intrinsics.LJFF(Looper.myLooper(), C786410Ut5.W2((HandlerThread) this.LIZJ.getValue()))) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII((Handler) this.LIZLLL.getValue(), runnable);
        }
    }
}
