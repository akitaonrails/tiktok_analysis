package defpackage;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h4 {
    public static final Map<String, Double> LIZ = new LinkedHashMap();

    public static final Map<String, Double> LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        Map<String, Double> map = LIZ;
        Map<String, Double> map2 = (Map) settingsManagerLIZLLL.LJIIIIZZ("pipo_bnpl_page_screen_height", Map.class, map);
        return map2 != null ? map2 : map;
    }
}
