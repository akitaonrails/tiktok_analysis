package defpackage;

import X.C1227904rF;
import X.C2097608Jq;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.util.Map;
import kotlin.Pair;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes27.dex */
public final class z4 {
    public static final Map<String, CurrencyFormat> LIZ;

    public final class a extends TypeToken<CurrencyFormat> {
    }

    static {
        new z4();
        LIZ = C2097608Jq.LJIIJ(new Pair("VND", new CurrencyFormat("VND", "₫", "suffix", e3.d, ",", null, null)));
    }

    public static final CurrencyFormat LIZ(String str) {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        Map<String, CurrencyFormat> map = LIZ;
        Map<String, CurrencyFormat> map2 = (Map) settingsManagerLIZLLL.LJIIIIZZ("pipo_cashier_currency_map", Map.class, map);
        if (map2 != null) {
            map = map2;
        }
        try {
            CurrencyFormat currencyFormat = map.get(str);
            if (currencyFormat != null) {
                C1227904rF.LIZ.getClass();
                CurrencyFormat currencyFormat2 = (CurrencyFormat) C1227904rF.LIZJ(C1227904rF.LJI(currencyFormat), new a().getType());
                if (currencyFormat2 != null) {
                    return currencyFormat2;
                }
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
