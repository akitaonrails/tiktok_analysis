package kotlin.jvm.internal;

import X.C013C;
import X.C086F;
import X.C098200Yq;
import X.C09AY;
import X.C1533480q0Y;
import X.C1533790q13;
import X.C1533900q1E;
import X.C1534110q1Z;
import X.C1534250q1n;
import X.C1534490q2B;
import X.C1534570q2J;
import X.C1535250q3P;
import X.C189200o6;
import X.C1942307jB;
import X.C2188811AlT;
import X.C259800zU;
import android.net.Uri;
import com.bytedance.forest.experiments.ForestExperiment;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes24.dex */
public class AwS0S1410000_23 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public boolean z5;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS0S1410000_23 awS0S1410000_23, Object obj) {
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        C1533790q13 c1533790q13ReuseResponse$forest_release = ((C1533900q1E) awS0S1410000_23.l1).LIZ.reuseResponse$forest_release(c1533790q13, (C1534570q2J) ((C259800zU) awS0S1410000_23.l2).element, (RequestParams) awS0S1410000_23.l3, System.currentTimeMillis());
        ((C1533900q1E) awS0S1410000_23.l1).LIZ.triggerCallback$forest_release(awS0S1410000_23.z5, (Function1) awS0S1410000_23.l4, c1533790q13ReuseResponse$forest_release);
        C1534250q1n.LIZ.LJIIJ(new AwS172S1100000_23(awS0S1410000_23.s0, c1533790q13, 11));
        C1534490q2B.LIZ(c1533790q13ReuseResponse$forest_release);
        Function2<? super String, ? super C1535250q3P, Unit> function2 = C1533480q0Y.LIZ;
        C1533480q0Y.LJ(c1533790q13ReuseResponse$forest_release, null);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.util.Map<java.lang.String, java.lang.String>] */
    public static final Object invoke$1(AwS0S1410000_23 awS0S1410000_23, Object obj) {
        Object obj2;
        T t;
        boolean z;
        C1534110q1Z c1534110q1Z = (C1534110q1Z) obj;
        String str = c1534110q1Z.LIZIZ;
        C1534250q1n c1534250q1n = C1534250q1n.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cache key: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1534250q1n.getClass();
        C1534250q1n.LJIIIZ("ResponseCacheManager", "traverseAndFetchCacheIf", strLIZIZ, null, false);
        if (a0.LJJJIL(str)) {
            C1533480q0Y.LIZJ("ResponseCacheManager", null, null, null, "hash cache key is blank", null, null, null, null, null, null, 7918);
            return Boolean.FALSE;
        }
        if (!c1534110q1Z.LIZ()) {
            return Boolean.FALSE;
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = c1534110q1Z.LJI;
        Uri uri = (Uri) awS0S1410000_23.l1;
        boolean z2 = false;
        if (uri != null) {
            boolean z3 = awS0S1410000_23.z5;
            Set set = (Set) awS0S1410000_23.l4;
            if (ForestExperiment.INSTANCE.getOptimizeCacheStructure()) {
                if (z3) {
                    Map<String, String> map = c1534110q1Z.LJI;
                    if (map != null && map.isEmpty()) {
                        z2 = true;
                    }
                    z2 = !z2;
                } else {
                    Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
                    T t2 = c259800zU.element;
                    if (t2 == 0) {
                        try {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (String str2 : UriProtector.getQueryParameterNames(uri)) {
                                String strLIZIZ2 = C1942307jB.LIZIZ(uri, str2);
                                if (strLIZIZ2 == null) {
                                    strLIZIZ2 = "";
                                }
                                linkedHashMap.put(str2, strLIZIZ2);
                            }
                            C189200o6.m2constructorimpl(linkedHashMap);
                            obj2 = linkedHashMap;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C098200Yq c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                            obj2 = c098200Yq;
                        }
                        boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj2);
                        Object obj3 = obj2;
                        if (zM7isFailureimpl) {
                            obj3 = null;
                        }
                        if (obj3 == null) {
                            return Boolean.FALSE;
                        }
                        z2 = true;
                        t = obj3;
                    } else {
                        z2 = false;
                        t = t2;
                    }
                    c259800zU.element = t;
                    int i = 0;
                    for (String str3 : queryParameterNames) {
                        if (set != null && set.contains(str3)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            if (z2 || ((Map) c259800zU.element).containsKey(str3)) {
                                z2 = true;
                            }
                        } else {
                            String strLIZIZ3 = C1942307jB.LIZIZ(uri, str3);
                            if (strLIZIZ3 == null) {
                                strLIZIZ3 = "";
                            }
                            if (Intrinsics.LJFF(strLIZIZ3, ((Map) c259800zU.element).get(str3))) {
                                i++;
                            } else {
                                return Boolean.FALSE;
                            }
                        }
                    }
                    if (set != null) {
                        Iterator it2 = set.iterator();
                        while (it2.hasNext()) {
                            if (((Map) c259800zU.element).containsKey(it2.next())) {
                                i++;
                            }
                        }
                    }
                    if (i != ((Map) c259800zU.element).size()) {
                        return Boolean.FALSE;
                    }
                }
            }
        }
        if (z2) {
            C086F c086f = C086F.LIZ;
            AwS12S1310000_23 awS12S1310000_23 = new AwS12S1310000_23(awS0S1410000_23.z5, (boolean) c1534110q1Z, (C1534110q1Z) c259800zU, (C259800zU<Map<String, String>>) awS0S1410000_23.l4, (Set<String>) awS0S1410000_23.s0, (String) 2);
            c086f.getClass();
            C086F.LJI(awS12S1310000_23);
        }
        if (((Boolean) ((Function1) awS0S1410000_23.l2).invoke(c1534110q1Z)).booleanValue()) {
            ((C013C) awS0S1410000_23.l3).element = true;
            C1534250q1n c1534250q1n2 = C1534250q1n.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("hit cache key: ");
            sbLIZ2.append(str);
            String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ2);
            c1534250q1n2.getClass();
            C1534250q1n.LJIIIZ("ResponseCacheManager", "traverseAndFetchCacheIf", strLIZIZ4, null, false);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S1410000_23(C1533900q1E c1533900q1E, C1533900q1E c1533900q1E2, C259800zU<C1534570q2J> c259800zU, RequestParams requestParams, boolean z, Function1<? super C1533790q13, Unit> function1, String str) {
        super(1);
        this.$t = str;
        this.l1 = c1533900q1E;
        this.l2 = c1533900q1E2;
        this.l3 = c259800zU;
        this.z5 = requestParams;
        this.l4 = z;
        this.s0 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S1410000_23(Uri uri, Uri uri2, Function1<? super C1534110q1Z, Boolean> function1, C013C c013c, boolean z, Set<String> set, String str) {
        super(1);
        this.$t = str;
        this.l1 = uri;
        this.l2 = uri2;
        this.l3 = function1;
        this.z5 = c013c;
        this.l4 = z;
        this.s0 = set;
    }
}
