package com.ss.android.ugc.aweme.ab;

import X.C01GW;
import X.C08JS;
import X.C098200Yq;
import X.C09CT;
import X.C13LP;
import X.C189200o6;
import X.C274470ApJ;
import X.C309180CAa;
import X.C309190CAb;
import X.C452501pT;
import X.C823050WQl;
import X.C844470XAv;
import android.os.Looper;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AbsABValueOptimizer {
    public boolean LIZ;
    public boolean LIZIZ;
    public final HashSet<ABInfo> LIZJ = new HashSet<>();
    public List<ABInfo> LIZLLL = new ArrayList();
    public final C01GW LJ = C452501pT.LIZIZ(new C309190CAb(this));
    public final AtomicBoolean LJFF = new AtomicBoolean(false);
    public final AtomicBoolean LJI = new AtomicBoolean(false);

    public static final class ABInfo {
        public static final /* synthetic */ int LIZ = 0;

        @C09CT("default_value")
        public final k defaultValue;

        @C09CT("key")
        public final String key;

        @C09CT("type")
        public final int type;

        public final int hashCode() {
            return this.key.hashCode();
        }

        public final boolean equals(Object obj) {
            if (obj instanceof ABInfo) {
                return Intrinsics.LJFF(((ABInfo) obj).key, this.key);
            }
            return false;
        }

        public ABInfo(String str, int i, k kVar) {
            this.key = str;
            this.type = i;
            this.defaultValue = kVar;
        }
    }

    public abstract String LIZIZ();

    public abstract boolean LIZJ();

    public void LIZLLL() {
    }

    public static long LIZ() {
        Object c098200Yq;
        try {
            C844470XAv.LIZ.getClass();
            c098200Yq = Long.valueOf(C844470XAv.LJ());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = -1L;
        }
        return ((Number) c098200Yq).longValue();
    }

    public static void LJ(final Function0 function0) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            if (((Boolean) C274470ApJ.LJI.getValue()).booleanValue()) {
                C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0CAY
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("AbsABValueOptimizer@194a.sam$java_lang_Runnable$0");
                        try {
                            function0.invoke();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("AbsABValueOptimizer@194a.sam$java_lang_Runnable$0");
                    }
                });
                return;
            } else {
                C823050WQl.LJFF().execute(new Runnable() { // from class: X.0CAY
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("AbsABValueOptimizer@194a.sam$java_lang_Runnable$0");
                        try {
                            function0.invoke();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("AbsABValueOptimizer@194a.sam$java_lang_Runnable$0");
                    }
                });
                return;
            }
        }
        function0.invoke();
    }

    public final void LJFF(int i) throws InterruptedException {
        Object c098200Yq;
        Object c098200Yq2;
        try {
            c098200Yq = C13LP.LLIIII(this.LIZJ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        List list = (List) c098200Yq;
        if (list == null) {
            if (i == 2) {
                return;
            }
            Thread.sleep(1L);
            LJFF(i + 1);
            return;
        }
        try {
            this.LIZJ.clear();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        try {
            long jLIZ = LIZ();
            if (jLIZ != -1) {
                Keva.getRepo((String) this.LJ.getValue()).storeString("ab_cache_info", C08JS.LIZLLL(new ABCacheInfo(jLIZ, list)));
            }
            c098200Yq2 = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq2 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        C189200o6.m8isSuccessimpl(c098200Yq2);
        C189200o6.m5exceptionOrNullimpl(c098200Yq2);
    }

    public static final class ABCacheInfo {

        @C09CT("ab_info_list")
        public final List<ABInfo> abInfoList;

        @C09CT("version_code")
        public final long versionCode;

        public ABCacheInfo(long j, List<ABInfo> list) {
            this.versionCode = j;
            this.abInfoList = list;
        }
    }

    public final void LJI(Object obj, Object obj2, String str, boolean z) {
        k qVar;
        if (this.LIZIZ && z && !this.LJFF.get()) {
            if (this.LIZ && !Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                return;
            }
            int iLIZ = C309180CAa.LIZ(obj);
            if (iLIZ == 0 && (iLIZ = C309180CAa.LIZ(obj2)) == 0) {
                return;
            }
            if (obj == null) {
                qVar = m.LL;
                if (qVar == null) {
                    return;
                }
            } else if (obj instanceof Boolean) {
                qVar = new q((Boolean) obj);
            } else if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Double)) {
                qVar = new q((Number) obj);
            } else if (!(obj instanceof String)) {
                return;
            } else {
                qVar = new q((String) obj);
            }
            this.LIZJ.add(new ABInfo(str, iLIZ, qVar));
        }
    }
}
