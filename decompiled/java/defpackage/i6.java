package defpackage;

import X.C2097608Jq;
import X.C7740030o;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.k;
import com.google.gson.n;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class i6 {
    public static final i6 LIZ = new i6();
    public static final n LIZIZ = new n();

    public static final class a {
        public final Map<String, Integer> LIZ = new LinkedHashMap();
    }

    public static final a LIZ() {
        Map map = (Map) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), (k) SettingsManager.LIZLLL().LJIIIIZZ("my_music_audtion_times", n.class, LIZIZ), (Type) Map.class);
        a aVar = new a();
        Map<String, Integer> map2 = aVar.LIZ;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), Integer.valueOf((int) ((Number) entry.getValue()).doubleValue())));
        }
        C2097608Jq.LJIILJJIL(arrayList, map2);
        return aVar;
    }
}
