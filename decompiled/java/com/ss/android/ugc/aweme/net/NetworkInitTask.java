package com.ss.android.ugc.aweme.net;

import X.C09JN;
import X.C0CCZ;
import X.C0CD2;
import X.C0CO1;
import X.C0VZ0;
import X.C15O7;
import X.C19489211Ms;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C312780CNw;
import X.C805380Via;
import X.C823050WQl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1294060jmO;
import X.InterfaceC1495070p0b;
import Y.ACallableS237S0200000_3;
import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.crash.Npth;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IEcomSecApi;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.OrbuBinderHookInitTask;
import com.ss.android.ugc.aweme.legoImp.OrbuInitTask;
import com.ss.android.ugc.aweme.net.NetworkInitTask;
import com.ss.android.ugc.aweme.net.control.DispatchConfig;
import com.ss.android.ugc.aweme.network.INetwork;
import com.ss.android.ugc.aweme.secapi.ISecApi;
import com.ss.android.ugc.aweme.settings.TTWebViewEnableStatusSettings;
import com.ss.android.ugc.aweme.util.IFeedCacheLoaderService;
import com.ss.android.ugc.aweme.utils.InterceptorHolder;
import com.tiktok.ttf.network.zstd.ZstdDownToTTNetInitTask;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1294060jmO
public final class NetworkInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "NetworkInitTask";
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
        return 16777215;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return ((Boolean) C0CD2.LJJIJLIJ.getValue()).booleanValue() ? EnumC799870VZh.BACKGROUND : EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(final Context context) {
        IFeedCacheLoaderService iFeedCacheLoaderService;
        ExecutorService executorServiceLIZLLL;
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("network_set_rxjava_error_handler", true)) {
            try {
                if (C19489211Ms.LIZ == null) {
                    C19489211Ms.LIZ = new C09JN() { // from class: X.07yA
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("NetworkInitTask@431c.setDefaultRxErrorHandler$1");
                            this.LL.LIZ("RxJavaPlugins.ErrorHandler caught!", (Throwable) obj);
                            C1C7U.LIZIZ("NetworkInitTask@431c.setDefaultRxErrorHandler$1");
                        }
                    };
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C15O7.LIZJ(new ACallableS237S0200000_3(this, th, 8));
            }
        }
        INetwork iNetworkLIZ = C0CO1.LIZ();
        InterfaceC1495070p0b interfaceC1495070p0b = new InterfaceC1495070p0b() { // from class: X.0p6i
            @Override // X.InterfaceC1495070p0b
            public final void LIZJ() {
                C1150504el.LIZ().LIZLLL("feed_network_init_to_init_ttnet", false);
                if (((Boolean) C1776806xa.LIZJ.getValue()).booleanValue()) {
                    this.LIZ.getClass();
                    C310420CEu.LIZ.getClass();
                    DispatchConfig dispatchConfig = (DispatchConfig) C310420CEu.LIZLLL.getValue();
                    C1490190osj c1490190osj = C1490190osj.LIZIZ;
                    EnumC2262571Dh9 enumC2262571Dh9 = EnumC2262571Dh9.BIZ_STARTUP;
                    c1490190osj.LIZIZ(enumC2262571Dh9, dispatchConfig);
                    c1490190osj.LIZ(enumC2262571Dh9);
                    C0CN5.LIZIZ(Long.valueOf(dispatchConfig.delayDisableTimeMs), new Runnable() { // from class: X.0Il1
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("NetworkInitTask@431c.coldStartNetworkControl$1");
                            try {
                                C1490190osj.LIZIZ.LIZJ(EnumC2262571Dh9.BIZ_STARTUP);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("NetworkInitTask@431c.coldStartNetworkControl$1");
                        }
                    });
                }
                this.LIZ.getClass();
                C0S78.LIZJ(new C1485950olt(), true);
                IEcomSecApi iEcomSecApi = (IEcomSecApi) PluggableExtentionKt.pluggableSpi$default(IEcomSecApi.class, false, false, false, 14, null);
                if (iEcomSecApi != null) {
                    C844470XAv.LIZ.getClass();
                    iEcomSecApi.LIZ(C844470XAv.LIZ());
                }
            }

            @Override // X.InterfaceC1495070p0b
            public final void LIZ(C1495130p0h c1495130p0h) {
                LJFF(true, c1495130p0h, null);
                C19266210Yy.LIZIZ.init();
                this.LIZ.getClass();
                C844470XAv.LIZ.getClass();
                C1493400oxu.LJIIJ(C844470XAv.LIZ()).LJIILLIIL(C0X4M.LIZIZ());
                List<InterfaceC836900WsK> listLIZJ = InterceptorHolder.LIZLLL().LIZJ();
                if (!C086I.LIZIZ(listLIZJ) && listLIZJ != null) {
                    Iterator<InterfaceC836900WsK> it2 = listLIZJ.iterator();
                    while (it2.hasNext()) {
                        C842260X2i.LIZJ.LIZIZ(it2.next());
                    }
                }
                C844470XAv.LIZ.getClass();
                if (!C2104008Mc.LIZIZ(C844470XAv.LIZ())) {
                    C1494230ozF.LIZIZ = c1495130p0h.LJIIIIZZ;
                    C1494570ozn.LJLL = C1493800oyY.LIZ;
                }
                if (C08Q0.LJ(context, "pns_slardar_route_opt_enable_ttnet", true)) {
                    Npth.setUseLocalDomain(true);
                    Npth.setDomainName("https://mon.tiktokv.com");
                    C0W1D.LIZ = new C0W1Q();
                }
                this.LIZ.getClass();
                C0S78.LIZJ(new C1498890p6l(), true);
            }

            @Override // X.InterfaceC1495070p0b
            public final void LIZIZ(boolean z) {
                if (z) {
                    new ZstdDownToTTNetInitTask();
                    C1496400p2k.LIZ.getClass();
                    C1496400p2k.LIZIZ();
                } else {
                    C799900VZk.LIZ.getClass();
                    C799890VZj c799890VZj = new C799890VZj();
                    c799890VZj.LIZ(new ZstdDownToTTNetInitTask());
                    c799890VZj.LIZIZ();
                }
            }

            @Override // X.InterfaceC1495070p0b
            public final void LIZLLL(C1495130p0h c1495130p0h) {
                C1150504el.LIZ().LJI("feed_network_init_ttnet_duration", false);
                C1150504el.LIZ().LJI("feed_boot_to_init_ttnet_end", false);
                C1150504el.LIZ().LIZLLL("feed_init_ttnet_end_to_network", false);
                C1150504el.LIZ().LIZLLL("feed_network_init_sec_duration", false);
                NetworkInitTask networkInitTask = this.LIZ;
                C844470XAv.LIZ.getClass();
                Context contextLIZ = C844470XAv.LIZ();
                networkInitTask.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                final C746930TRr c746930TRr = new C746930TRr();
                if (C2162308dZ.LJI(contextLIZ)) {
                    String str = c1495130p0h.LJFF;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = c1495130p0h.LJI;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = str;
                    ((ISecApi) ServiceManager.get().getService(ISecApi.class)).initSec(contextLIZ, (String) c746930TRr.invoke(), c1495130p0h.LJ, str3, str2, true, new C149B() { // from class: X.0p6k
                        @Override // X.C149B
                        public final String getLanguage() {
                            return c746930TRr.invoke();
                        }

                        @Override // X.C149B
                        public final String getSessionId() {
                            try {
                                return C1BYN.LIZIZ.getSessionId();
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                return "";
                            }
                        }

                        @Override // X.C149B
                        public final String getUserId() {
                            return C0XQ7.LJFF().getCurUserId();
                        }
                    });
                }
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("sec_init_time", jElapsedRealtime2);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C794240VDq.LIZIZ("sec_init_time", "", jSONObject);
                IEcomSecApi iEcomSecApi = (IEcomSecApi) PluggableExtentionKt.pluggableSpi$default(IEcomSecApi.class, false, false, false, 14, null);
                if (iEcomSecApi != null) {
                    C844470XAv.LIZ.getClass();
                    iEcomSecApi.LIZIZ(C844470XAv.LIZ());
                }
                C1150504el.LIZ().LJI("feed_network_init_sec_duration", false);
                this.LIZ.getClass();
                C912260Zqa.LIZIZ.init();
                InterceptorHolder.LIZLLL().LIZIZ();
                boolean z = true;
                C0XKT.LIZIZ = 1;
                if (C0XKT.LIZIZ() != 0) {
                    z = false;
                }
                C0XKT.LIZ(0, z);
                if (z) {
                    C799900VZk.LIZ.getClass();
                    C799890VZj c799890VZj = new C799890VZj();
                    c799890VZj.LIZ(new OrbuInitTask());
                    c799890VZj.LIZIZ();
                }
                C799900VZk.LIZ.getClass();
                C799890VZj c799890VZj2 = new C799890VZj();
                c799890VZj2.LIZ(new OrbuBinderHookInitTask());
                c799890VZj2.LIZIZ();
            }

            @Override // X.InterfaceC1495070p0b
            public final void LJI(C1495130p0h c1495130p0h) {
                C1490400ot4.LIZ.getClass();
                C1490400ot4.LIZ();
            }

            @Override // X.InterfaceC1495070p0b
            public final void LJII(C1495130p0h c1495130p0h) {
                IFeedCacheLoaderService iFeedCacheLoaderService2;
                TTWebViewEnableStatusSettings.LIZ.getClass();
                TTWebViewEnableStatusSettings.TikTokTTWebViewStatusModel tikTokTTWebViewStatusModelLIZ = TTWebViewEnableStatusSettings.LIZ();
                if (tikTokTTWebViewStatusModelLIZ.isTTWebViewEnabled) {
                    C830730WiN c830730WiN = C830730WiN.LIZ;
                    Context context2 = context;
                    c830730WiN.getClass();
                    C830730WiN.LIZ(context2, tikTokTTWebViewStatusModelLIZ);
                }
                if (((Boolean) C1230104rb.LIZIZ.getValue()).booleanValue() && (iFeedCacheLoaderService2 = (IFeedCacheLoaderService) PluggableExtentionKt.pluggableSpi$default(IFeedCacheLoaderService.class, false, false, false, 14, null)) != null && iFeedCacheLoaderService2.LIZLLL() && C2456309jt.LIZ()) {
                    C592890NNf.LIZIZ().LIZ(C1230104rb.LIZ());
                    C202094145s.LJIJ = SystemClock.uptimeMillis();
                }
                C1150504el.LIZ().LJI("feed_network_init_to_init_ttnet", false);
                C1150504el.LIZ().LIZLLL("feed_network_init_ttnet_duration", false);
                C1150504el.LIZ().LJI("feed_boot_to_init_ttnet", false);
            }

            @Override // X.InterfaceC1495070p0b
            public final void LJ(C1495130p0h c1495130p0h, Throwable th2) {
                LJFF(false, c1495130p0h, th2);
            }

            public static void LJFF(boolean z, C1495130p0h c1495130p0h, Throwable th2) {
                JSONObject jSONObjectLJ;
                C2241008qG c2241008qG = new C2241008qG();
                c2241008qG.LIZ.put("is_success", Integer.valueOf(z ? 1 : 0));
                c2241008qG.LIZ.put("process_name", C2162308dZ.LIZ(c1495130p0h.LIZ));
                JSONObject jSONObjectLJ2 = c2241008qG.LJ();
                if (th2 == null) {
                    jSONObjectLJ = null;
                } else {
                    C2241008qG c2241008qG2 = new C2241008qG();
                    c2241008qG2.LIZ.put("error_msg", Log.getStackTraceString(th2));
                    jSONObjectLJ = c2241008qG2.LJ();
                }
                C793770VBv.LJII("TTNetInitStatus", jSONObjectLJ2, null, jSONObjectLJ);
            }
        };
        if (!C0CD2.LIZIZ() && (iFeedCacheLoaderService = (IFeedCacheLoaderService) PluggableExtentionKt.pluggableSpi$default(IFeedCacheLoaderService.class, false, false, false, 14, null)) != null && iFeedCacheLoaderService.LIZIZ() && ((Boolean) C312780CNw.LIZLLL.getValue()).booleanValue()) {
            executorServiceLIZLLL = C823050WQl.LIZJ();
        } else {
            executorServiceLIZLLL = C823050WQl.LIZLLL();
        }
        iNetworkLIZ.LJFF(interfaceC1495070p0b, executorServiceLIZLLL);
    }

    public final void LIZ(String str, Throwable th) {
        C2344809Gs.LJI(th);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(th.getMessage());
        C805380Via.LIZJ(th, C2188811AlT.LIZIZ(sbLIZ));
    }
}
