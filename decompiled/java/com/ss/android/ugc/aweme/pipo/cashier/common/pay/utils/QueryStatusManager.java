package com.ss.android.ugc.aweme.pipo.cashier.common.pay.utils;

import X.C01GW;
import X.C0PEM;
import X.C1707180uWi;
import X.C1707190uWj;
import X.C1707220uWm;
import X.C1708610uZ1;
import X.C1708710uZB;
import X.C1954807lC;
import X.C1C7U;
import X.C23250099c;
import X.C452501pT;
import X.C817503Hh;
import X.EnumC1707210uWl;
import X.InterfaceC1707160uWg;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ab.PipoQueryConfigSettings;
import com.ss.android.ugc.aweme.pipo.cashier.common.pay.api.Configuration;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class QueryStatusManager {
    public final EnumC1707210uWl LIZ;
    public final InterfaceC1707160uWg LIZIZ;
    public final String LIZJ;
    public final C1707180uWi LIZLLL;
    public final C01GW LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public Configuration LJIILIIL;
    public int LJIILJJIL;
    public long LJIILL;

    public final void LIZ() {
        String str;
        C1707180uWi c1707180uWi = this.LIZLLL;
        if (c1707180uWi != null) {
            boolean z = false;
            boolean z2 = this.LJIILJJIL >= c1707180uWi.LIZ;
            if (c1707180uWi.LIZIZ > 0 && System.currentTimeMillis() - this.LJIILL > c1707180uWi.LIZIZ) {
                z = true;
            }
            if (z2) {
                C1708710uZB.LIZ("Cashier").LIZ(5, "QueryManager, onError due to retried too many retried times}");
            }
            if (z) {
                C1708710uZB.LIZ("Cashier").LIZ(5, "QueryManager, onError due to timeout}");
            }
            if (!z2 && !z) {
                this.LJIILJJIL++;
                ((Handler) this.LJ.getValue()).sendEmptyMessageDelayed(1, 1000L);
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LJIILL;
            int i = this.LJIILJJIL;
            InterfaceC1707160uWg interfaceC1707160uWg = this.LIZIZ;
            if (interfaceC1707160uWg != null) {
                interfaceC1707160uWg.LIZ();
            }
            C1707180uWi c1707180uWi2 = this.LIZLLL;
            if (c1707180uWi2 == null || (str = c1707180uWi2.LIZJ) == null) {
                str = "";
            }
            LIZIZ(2, str, jCurrentTimeMillis, i, null, null);
        }
    }

    public static final class WorkHandler extends BPEAHandler {
        public final QueryStatusManager LL;

        public WorkHandler(QueryStatusManager queryStatusManager) {
            super(Looper.getMainLooper());
            this.LL = queryStatusManager;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("QueryStatusManager$WorkHandler@32fa.handleMessage");
            super.handleMessage(message);
            if (message.what == 1) {
                QueryStatusManager queryStatusManager = this.LL;
                if (queryStatusManager.LIZLLL != null) {
                    C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1707190uWj(queryStatusManager, null), 2);
                }
            }
            C1C7U.LIZIZ("QueryStatusManager$WorkHandler@32fa.handleMessage");
        }
    }

    public QueryStatusManager(EnumC1707210uWl enumC1707210uWl, InterfaceC1707160uWg interfaceC1707160uWg, String str) {
        C1707180uWi c1707180uWi;
        this.LIZ = enumC1707210uWl;
        this.LIZIZ = interfaceC1707160uWg;
        this.LIZJ = str;
        int i = C1707220uWm.LIZ[enumC1707210uWl.ordinal()];
        if (i != 1) {
            if (i == 2) {
                c1707180uWi = new C1707180uWi(10, 30000L, "/cashier/client/v1/get_binding_result");
            } else {
                throw new C1954807lC();
            }
        } else {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            PipoQueryConfigSettings.Config config = PipoQueryConfigSettings.LIZ;
            PipoQueryConfigSettings.Config config2 = (PipoQueryConfigSettings.Config) settingsManagerLIZLLL.LJIIIIZZ("pipo_ttls_query_config", PipoQueryConfigSettings.Config.class, config);
            Integer num = (config2 == null ? config : config2).queryTradeResultRetryCount;
            int iIntValue = num != null ? num.intValue() : 10;
            PipoQueryConfigSettings.Config config3 = (PipoQueryConfigSettings.Config) SettingsManager.LIZLLL().LJIIIIZZ("pipo_ttls_query_config", PipoQueryConfigSettings.Config.class, config);
            Long l = (config3 != null ? config3 : config).queryTradeResultTimeout;
            c1707180uWi = new C1707180uWi(iIntValue, l != null ? l.longValue() : 30000L, "/cashier/client/v1/query_trade_result");
        }
        this.LIZLLL = c1707180uWi;
        this.LJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1101));
        this.LJFF = "";
        this.LJI = "";
    }

    public final void LIZIZ(int i, String str, long j, int i2, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(i));
        linkedHashMap.put("path", str);
        linkedHashMap.put("retry_count", String.valueOf(i2));
        linkedHashMap.put("duration", String.valueOf(j));
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("error_code", str2);
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("error_msg", str3);
        C1708610uZ1.LIZIZ(this.LIZJ).LIZ("rd_pipo_query_result", linkedHashMap);
    }

    public static void LIZJ(QueryStatusManager queryStatusManager, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Configuration configuration, int i) {
        if ((i & 16) != 0) {
            str5 = null;
        }
        if ((i & 32) != 0) {
            str6 = null;
        }
        if ((i & 64) != 0) {
            str7 = null;
        }
        if ((i & 128) != 0) {
            str8 = null;
        }
        if ((i & 256) != 0) {
            configuration = null;
        }
        queryStatusManager.LJFF = str;
        queryStatusManager.LJI = str2;
        queryStatusManager.LJII = str3;
        queryStatusManager.LJIIIIZZ = str4;
        queryStatusManager.LJIIIZ = str5;
        queryStatusManager.LJIIJ = str6;
        queryStatusManager.LJIIJJI = str7;
        queryStatusManager.LJIIL = str8;
        queryStatusManager.LJIILIIL = configuration;
        queryStatusManager.LJIILL = System.currentTimeMillis();
        if (queryStatusManager.LIZLLL != null) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1707190uWj(queryStatusManager, null), 2);
        }
    }
}
