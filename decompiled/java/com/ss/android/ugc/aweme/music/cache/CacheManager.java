package com.ss.android.ugc.aweme.music.cache;

import X.C01GW;
import X.C452501pT;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class CacheManager {
    public static final CacheManager LIZ = new CacheManager();
    public static int LIZIZ = 15;
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(241));

    public static Keva LIZ() {
        return (Keva) LIZJ.getValue();
    }

    public static final class CacheEntry<T> {
        public final long cachedTime;
        public final String key;
        public final T value;

        public CacheEntry(String str, T t, long j) {
            this.key = str;
            this.value = t;
            this.cachedTime = j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LIZIZ(com.ss.android.ugc.aweme.music.cache.CacheManager r8, java.lang.String r9, java.lang.Long r10, java.lang.reflect.Type r11, kotlin.jvm.functions.Function0 r12) {
        /*
            r8.getClass()
            r5 = 0
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = X.C7740030o.LIZ()     // Catch: com.google.gson.s -> L1d com.google.gson.l -> L22
            com.google.gson.Gson r2 = r0.getGson()     // Catch: com.google.gson.s -> L1d com.google.gson.l -> L22
            com.bytedance.keva.Keva r1 = LIZ()     // Catch: com.google.gson.s -> L1d com.google.gson.l -> L22
            java.lang.String r0 = "[]"
            java.lang.String r0 = r1.getString(r9, r0)     // Catch: com.google.gson.s -> L1d com.google.gson.l -> L22
            java.lang.Object r6 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r2, r0, r11)     // Catch: com.google.gson.s -> L1d com.google.gson.l -> L22
            com.ss.android.ugc.aweme.music.cache.CacheManager$CacheEntry r6 = (com.ss.android.ugc.aweme.music.cache.CacheManager.CacheEntry) r6     // Catch: com.google.gson.s -> L1d com.google.gson.l -> L22
            goto L27
        L1d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L26
        L22:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L26:
            r6 = r5
        L27:
            if (r6 == 0) goto L67
            long r1 = r6.cachedTime
        L2b:
            if (r10 == 0) goto L62
            r10.longValue()
            long r7 = r10.longValue()
            r3 = 0
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 <= 0) goto L5d
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L5d
            com.ss.android.ugc.aweme.music.cache.CacheManager r0 = com.ss.android.ugc.aweme.music.cache.CacheManager.LIZ
            r0.getClass()
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            long r1 = r10.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5d
            kotlin.jvm.internal.AwS94S1000000_9 r1 = new kotlin.jvm.internal.AwS94S1000000_9
            r0 = 5
            r1.<init>(r9, r0)
            X.C0CNO.LIZIZ(r1)
            r12.invoke()
        L5c:
            return r5
        L5d:
            if (r6 == 0) goto L5c
            T r5 = r6.value
            return r5
        L62:
            if (r6 == 0) goto L5c
            T r5 = r6.value
            return r5
        L67:
            r1 = -1
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.cache.CacheManager.LIZIZ(com.ss.android.ugc.aweme.music.cache.CacheManager, java.lang.String, java.lang.Long, java.lang.reflect.Type, kotlin.jvm.functions.Function0):java.lang.Object");
    }
}
