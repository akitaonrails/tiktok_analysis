package defpackage;

import X.C0C5P;
import X.C0TA0;
import X.C13BV;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C7740030o;
import X.EnumC19241510Pl;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.tiktok.kmp.nuj.IKMPNewUserJourneyService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;

/* JADX INFO: loaded from: classes29.dex */
public final class f9 {
    public static final f9 LIZ = new f9();
    public static final Keva LIZIZ = Keva.getRepo("ug_strategy_repo");
    public static final List<i9> LIZJ = new CopyOnWriteArrayList();
    public static List<IPluginService.NUStrategy> LIZLLL;

    public final class a extends TypeToken<Map<String, ? extends IPluginService.NUStrategy>> {
    }

    public final class b extends TypeToken<List<? extends IPluginService.NUStrategy>> {
    }

    public static void LJFF() {
        List<IPluginService.NUStrategy> list;
        ArrayList arrayList = new ArrayList(C13BV.INSTANCE);
        try {
            Gson gson = C7740030o.LIZ().getGson();
            LinkedHashMap linkedHashMap = new LinkedHashMap(LIZ());
            ArrayList arrayList2 = new ArrayList(LIZLLL());
            IPluginService.NUStrategyData nUStrategyDataLIZJ = LIZJ();
            if (nUStrategyDataLIZJ != null && (list = nUStrategyDataLIZJ.strategyList) != null) {
                for (IPluginService.NUStrategy nUStrategy : list) {
                    Integer num = nUStrategy.scene;
                    int id = g9.STRATEGY_SCENE_DEEPLINK_FRAMEWORK.getId();
                    if (num == null || num.intValue() != id) {
                        Integer num2 = nUStrategy.scene;
                        linkedHashMap.put(Integer.valueOf(num2 != null ? num2.intValue() : 0), nUStrategy);
                        Integer num3 = nUStrategy.scene;
                        arrayList.add(Integer.valueOf(num3 != null ? num3.intValue() : 0));
                    } else {
                        arrayList2.add(nUStrategy);
                    }
                    IKMPNewUserJourneyService iKMPNewUserJourneyService = (IKMPNewUserJourneyService) PluggableExtentionKt.pluggableSpi$default(IKMPNewUserJourneyService.class, false, false, false, 14, null);
                    if (iKMPNewUserJourneyService != null) {
                        iKMPNewUserJourneyService.LIZLLL(nUStrategy.scene, nUStrategy.strategyData, nUStrategy.abExposeVid);
                    }
                }
            }
            LIZLLL = arrayList2;
            String strLJIILL = gson.LJIILL(linkedHashMap);
            Keva keva = LIZIZ;
            keva.storeString("strategy_list", strLJIILL);
            keva.storeString("deeplink_strategy", gson.LJIILL(arrayList2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Iterator it2 = ((CopyOnWriteArrayList) LIZJ).iterator();
        while (it2.hasNext()) {
            ((i9) it2.next()).LIZ(arrayList);
        }
    }

    public static Map LIZ() {
        Gson gson = C7740030o.LIZ().getGson();
        String string = LIZIZ.getString("strategy_list", "");
        if (TextUtils.isEmpty(string)) {
            return C2097608Jq.LJ();
        }
        try {
            Map mapLJ = (Map) gson.LJIIIIZZ(string, new a().getType());
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : mapLJ.entrySet()) {
                String str = (String) entry.getKey();
                IPluginService.NUStrategy nUStrategy = (IPluginService.NUStrategy) entry.getValue();
                Integer numLJIIJJI = C2095008Iq.LJIIJJI(str);
                Pair pair = numLJIIJJI != null ? new Pair(Integer.valueOf(numLJIIJJI.intValue()), nUStrategy) : null;
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            return C2097608Jq.LJIILLIIL(arrayList);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C2097608Jq.LJ();
        }
    }

    public static IPluginService.NUStrategyData LIZJ() {
        C0TA0 next;
        IPluginService.PluginDataWrapper value;
        Iterator<C0TA0> it2 = ((IPluginService) ServiceManager.get().getService(IPluginService.class)).getCurrentPluginList().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.getType() == EnumC19241510Pl.STRATEGY_DATA) {
                break;
            }
        }
        C0TA0 c0ta0 = next;
        if (c0ta0 == null || (value = c0ta0.getValue()) == null) {
            return null;
        }
        return value.nuStrategyData;
    }

    public static List LIZLLL() {
        Gson gson = C7740030o.LIZ().getGson();
        String string = LIZIZ.getString("deeplink_strategy", "");
        if (TextUtils.isEmpty(string)) {
            return C13BV.INSTANCE;
        }
        try {
            List list = (List) gson.LJIIIIZZ(string, new b().getType());
            return list == null ? C13BV.INSTANCE : list;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C13BV.INSTANCE;
        }
    }

    public static String LIZIZ(int i) {
        IPluginService.NUStrategy nUStrategyLJ = LJ(i);
        if (nUStrategyLJ != null) {
            String str = nUStrategyLJ.abExposeVid;
            if (str != null) {
                C0C5P.LIZJ().getClass();
                C0C5P.LIZ(str);
            }
            return nUStrategyLJ.strategyData;
        }
        return null;
    }

    public static IPluginService.NUStrategy LJ(int i) {
        List<IPluginService.NUStrategy> list;
        IPluginService.NUStrategyData nUStrategyDataLIZJ = LIZJ();
        IPluginService.NUStrategy nUStrategy = null;
        if (nUStrategyDataLIZJ != null && (list = nUStrategyDataLIZJ.strategyList) != null) {
            Iterator<IPluginService.NUStrategy> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                IPluginService.NUStrategy next = it2.next();
                Integer num = next.scene;
                if (num != null && num.intValue() == i) {
                    nUStrategy = next;
                    break;
                }
            }
            IPluginService.NUStrategy nUStrategy2 = nUStrategy;
            if (nUStrategy2 != null) {
                return nUStrategy2;
            }
        }
        return (IPluginService.NUStrategy) LIZ().get(Integer.valueOf(i));
    }
}
