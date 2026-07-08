package kotlin.jvm.internal;

import X.C09AY;
import X.C0C5Q;
import X.C0CJ1;
import X.C0CJ4;
import X.C0CJ5;
import X.C0CKZ;
import X.C19EG;
import X.C2155308cR;
import X.C296780BkC;
import X.C799890VZj;
import X.C799900VZk;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.settingsrequest.FetchABCDNConfig;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService;
import com.ss.android.ugc.aweme.settingsrequest.api.optimized.FetchABTestCommonOptimizedTask;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public class AwS150S1200000_4 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS150S1200000_4 awS150S1200000_4, Object obj, Object obj2) {
        final n nVar = (n) obj;
        final Set set = (Set) obj2;
        FetchABTestCommonOptimizedTask fetchABTestCommonOptimizedTask = (FetchABTestCommonOptimizedTask) awS150S1200000_4.l1;
        n nVar2 = (n) awS150S1200000_4.l2;
        fetchABTestCommonOptimizedTask.getClass();
        try {
            if (C296780BkC.LIZ()) {
                if (!nVar2.LJJIJIIJIL("__CDN_URL__")) {
                    Iterator<T> it2 = fetchABTestCommonOptimizedTask.LLILLJJLI.LJFF.LIZ().iterator();
                    while (it2.hasNext()) {
                        fetchABTestCommonOptimizedTask.LJ((String) it2.next());
                    }
                } else {
                    h hVarLJJIIZI = nVar2.LJJIIZI("__CDN_URL__");
                    HashMap map = new HashMap();
                    int size = hVarLJJIIZI.size();
                    for (int i = 0; i < size; i++) {
                        if (((q) hVarLJJIIZI.LJJIIJZLJL(i)).LL instanceof String) {
                            C0CJ5 c0cj5 = new C0CJ5(hVarLJJIIZI.LJJIIJZLJL(i).LJIL());
                            String str = c0cj5.LIZJ;
                            Object arrayList = map.get(str);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                map.put(str, arrayList);
                            }
                            ((List) arrayList).add(c0cj5);
                        }
                    }
                    for (String str2 : fetchABTestCommonOptimizedTask.LLILLJJLI.LJFF.LIZ()) {
                        if (!map.containsKey(str2)) {
                            fetchABTestCommonOptimizedTask.LJ(str2);
                            C0CJ1 c0cj1 = fetchABTestCommonOptimizedTask.LLILLJJLI.LJFF;
                            Set<String> setLIZ = c0cj1.LIZ();
                            setLIZ.remove(str2);
                            ((Keva) c0cj1.LJFF.getValue()).storeStringSet(c0cj1.LIZLLL, setLIZ);
                        }
                    }
                    if (!map.isEmpty()) {
                        final HashMap map2 = new HashMap();
                        Iterator it3 = map.entrySet().iterator();
                        while (it3.hasNext()) {
                            map2.put(((Map.Entry) it3.next()).getKey(), Boolean.FALSE);
                        }
                        for (final Map.Entry entry : map.entrySet()) {
                            C799900VZk.LIZ.getClass();
                            C799890VZj c799890VZj = new C799890VZj();
                            c799890VZj.LIZ(new FetchABCDNConfig((List) entry.getValue(), new C0CJ4() { // from class: X.0C71
                                @Override // X.C0CJ4
                                public final void onFailed() {
                                }

                                @Override // X.C0CJ4
                                public final void LIZ() {
                                    HashMap<String, Boolean> map3 = map2;
                                    String key = entry.getKey();
                                    Boolean bool = Boolean.TRUE;
                                    map3.put(key, bool);
                                    if (Intrinsics.LJFF(map2.get(entry.getKey()), bool)) {
                                        Collection<Boolean> collectionValues = map2.values();
                                        if (!collectionValues.isEmpty()) {
                                            Iterator<T> it4 = collectionValues.iterator();
                                            while (it4.hasNext()) {
                                                if (!Intrinsics.LJFF(it4.next(), Boolean.TRUE)) {
                                                    return;
                                                }
                                            }
                                        }
                                        Set<String> set2 = set;
                                        if (set2 == null || set2.isEmpty()) {
                                            Map<String, Integer> map4 = C308300C6q.LIZ;
                                            C308300C6q.LIZJ(nVar);
                                        } else {
                                            Map<String, Integer> map5 = C308300C6q.LIZ;
                                            C308300C6q.LIZLLL(nVar, set);
                                        }
                                    }
                                }
                            }));
                            c799890VZj.LIZIZ();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        FetchABTestCommonOptimizedTask fetchABTestCommonOptimizedTask2 = (FetchABTestCommonOptimizedTask) awS150S1200000_4.l1;
        String str3 = awS150S1200000_4.s0;
        fetchABTestCommonOptimizedTask2.getClass();
        C0CKZ c0ckz = C0CKZ.LIZLLL;
        c0ckz.LJI("ab_common_request_save_config_data");
        c0ckz.LJ("ab_common_request_save_config_data_finish_to_end");
        C2155308cR.LIZ();
        ISettingsRequestService iSettingsRequestService = (ISettingsRequestService) PluggableExtentionKt.pluggableSpi$default(ISettingsRequestService.class, false, false, false, 14, null);
        if (iSettingsRequestService != null) {
            iSettingsRequestService.LJIILIIL(str3);
        }
        C0C5Q.LIZ = null;
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS150S1200000_4 r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r5 = r10
            X.0tpg r5 = (X.InterfaceC1680500tpg) r5
            java.lang.Number r11 = (java.lang.Number) r11
            int r0 = r11.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r5.LIZ()
            if (r0 == 0) goto L1a
            r5.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131851998(0x7f117ade, float:1.9337602E38)
            java.lang.String r6 = X.C0MBB.LIZIZ(r0, r5)
            r8 = 1
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r9.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r5.LJJIIJ(r0)
            java.lang.Object r1 = r9.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r7 = r5.LJJ()
            if (r0 != 0) goto L43
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto L4d
        L43:
            kotlin.jvm.internal.AwS548S0100000_4 r7 = new kotlin.jvm.internal.AwS548S0100000_4
            r0 = 568(0x238, float:7.96E-43)
            r7.<init>(r1, r0)
            r5.LJJIJIIJI(r7)
        L4d:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5.LJ()
            r3 = 48
            r4 = 0
            X.C1668330tW3.LJIIIIZZ(r3, r4, r5, r6, r7, r8)
            r0 = 2131858226(0x7f119332, float:1.9350234E38)
            java.lang.String r6 = X.C0MBB.LIZIZ(r0, r5)
            r0 = -1746271574(0xffffffff97ea02aa, float:-1.5122568E-24)
            r5.LJJIIJZLJL(r0)
            java.lang.Object r0 = r9.l2
            X.19EG r0 = (X.C19EG) r0
            boolean r4 = r5.LJII(r0)
            java.lang.String r0 = r9.s0
            boolean r0 = r5.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r0 = r9.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r5.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r3 = r9.l2
            X.19EG r3 = (X.C19EG) r3
            java.lang.String r2 = r9.s0
            java.lang.Object r1 = r9.l1
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r7 = r5.LJJ()
            if (r4 != 0) goto L96
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto L9f
        L96:
            kotlin.jvm.internal.AwS121S1200000_4 r7 = new kotlin.jvm.internal.AwS121S1200000_4
            r0 = 5
            r7.<init>(r3, r2, r1, r0)
            r5.LJJIJIIJI(r7)
        L9f:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r5.LJ()
            r3 = 48
            r4 = 0
            X.C1668330tW3.LJIIIZ(r3, r4, r5, r6, r7, r8)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS150S1200000_4.invoke$1(kotlin.jvm.internal.AwS150S1200000_4, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS150S1200000_4(C19EG c19eg, String str, Function0 function0, int i) {
        super(2);
        this.$t = i;
        this.l1 = function0;
        this.l2 = c19eg;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS150S1200000_4(FetchABTestCommonOptimizedTask fetchABTestCommonOptimizedTask, n nVar, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = fetchABTestCommonOptimizedTask;
        this.l2 = nVar;
        this.s0 = str;
    }
}
