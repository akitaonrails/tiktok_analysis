package com.ss.android.ugc.aweme.keva;

import X.AbstractC19994813Le;
import X.C07DG;
import X.C0CCZ;
import X.C0VZ0;
import X.C1AF0;
import X.C20684815ws;
import X.C307730C4l;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ABKevaRepoCompareTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ABKevaRepoCompareTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        try {
            if (AbstractC19994813Le.Default.nextFloat() <= ((Number) C07DG.LIZ.getValue()).floatValue()) {
                C307730C4l c307730C4l = C307730C4l.LIZLLL;
                Map<String, ?> all = c307730C4l.LJIIIZ().getAll();
                Map<String, ?> all2 = c307730C4l.LJIIIZ().getAll();
                boolean z = false;
                if (all != null && !all.isEmpty() && all2 != null && !all2.isEmpty()) {
                    HashMap map = new HashMap();
                    HashMap map2 = new HashMap();
                    Iterator<T> it2 = all.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        String str = (String) entry.getKey();
                        if (str != null) {
                            Object obj = all2.get(str);
                            Object value = entry.getValue();
                            if (!Intrinsics.LJFF(obj, value) && (!(obj instanceof Object[]) || !(((Object[]) obj) instanceof String[]) || !(value instanceof Object[]) || !(((Object[]) value) instanceof String[]) || !Arrays.equals((Object[]) value, (Object[]) obj))) {
                                map.put(str, new Pair(value, obj));
                                z = true;
                            }
                        }
                    }
                    Iterator<T> it3 = all2.entrySet().iterator();
                    while (it3.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it3.next();
                        String str2 = (String) entry2.getKey();
                        if (str2 != null) {
                            Object value2 = entry2.getValue();
                            Object obj2 = all.get(str2);
                            if (!Intrinsics.LJFF(value2, obj2) && (!(value2 instanceof Object[]) || !(((Object[]) value2) instanceof String[]) || !(obj2 instanceof Object[]) || !(((Object[]) obj2) instanceof String[]) || !Arrays.equals((Object[]) obj2, (Object[]) value2))) {
                                map2.put(str2, new Pair(value2, obj2));
                                z = true;
                            }
                        }
                    }
                    C20684815ws.LJIJ("ab_keva_repo_diff_event", new JSONObject().put("has_diff", z).put("libra_config_cnt", all.size()).put("config_cnt", all2.size()).put("diff_detail_1", map.toString()).put("diff_detail_2", map2.toString()));
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, "ABKevaRepoCompareTask");
        }
    }
}
