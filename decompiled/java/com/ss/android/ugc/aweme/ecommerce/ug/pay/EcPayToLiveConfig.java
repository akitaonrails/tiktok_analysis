package com.ss.android.ugc.aweme.ecommerce.ug.pay;

import X.C09CT;
import X.C0C64;
import X.C13BV;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class EcPayToLiveConfig {
    public static final Config LIZ;
    public static final Config LIZIZ;

    static {
        Config config = new Config(null, 1, null);
        LIZ = config;
        try {
            Config config2 = (Config) C0C64.LJIILLIIL().LJJII(Config.class, config, "ec_live_diversion_info", true);
            if (config2 != null) {
                config = config2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            config = LIZ;
        }
        LIZIZ = config;
    }

    public static final class Config {

        @C09CT("enter_from_list")
        public final List<String> enterFromList;

        public Config() {
            this(null, 1, null);
        }

        public Config(List<String> list) {
            this.enterFromList = list;
        }

        public Config(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
