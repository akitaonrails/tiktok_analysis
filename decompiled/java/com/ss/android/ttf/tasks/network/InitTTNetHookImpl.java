package com.ss.android.ttf.tasks.network;

import X.AbstractC842290X2l;
import X.C086I;
import X.C08Q0;
import X.C0CD2;
import X.C0CN5;
import X.C0S78;
import X.C0W1D;
import X.C0W1Q;
import X.C0XKT;
import X.C1150504el;
import X.C1230104rb;
import X.C1490190osj;
import X.C1490400ot4;
import X.C1495130p0h;
import X.C1496440p2o;
import X.C149B;
import X.C1776806xa;
import X.C19266210Yy;
import X.C1954807lC;
import X.C202094145s;
import X.C2162308dZ;
import X.C2456309jt;
import X.C310420CEu;
import X.C312780CNw;
import X.C592890NNf;
import X.C794240VDq;
import X.C799890VZj;
import X.C799900VZk;
import X.C823050WQl;
import X.C830730WiN;
import X.C842260X2i;
import X.C842940X4y;
import X.C844470XAv;
import X.C846280XHu;
import X.C912260Zqa;
import X.EnumC1496430p2n;
import X.EnumC2262571Dh9;
import X.InterfaceC836900WsK;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IEcomSecApi;
import com.ss.android.ugc.aweme.feed.IFeedStrategyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.OrbuBinderHookInitTask;
import com.ss.android.ugc.aweme.legoImp.OrbuInitTask;
import com.ss.android.ugc.aweme.net.control.DispatchConfig;
import com.ss.android.ugc.aweme.secapi.ISecApi;
import com.ss.android.ugc.aweme.setting.IDataSaverSettingApi;
import com.ss.android.ugc.aweme.settings.TTWebViewEnableStatusSettings;
import com.ss.android.ugc.aweme.util.IFeedCacheLoaderService;
import com.ss.android.ugc.aweme.utils.InterceptorHolder;
import com.tiktok.ttf.network.task.IInitTTNetHook;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS212S0000000_23;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class InitTTNetHookImpl implements IInitTTNetHook {
    @Override // com.tiktok.ttf.network.task.IInitTTNetHook
    public final void LJ(C1495130p0h c1495130p0h, Throwable th) {
    }

    @Override // com.tiktok.ttf.network.task.IInitTTNetHook
    public final void LJIIJJI(Context context) {
    }

    @Override // com.tiktok.ttf.network.task.IInitTTNetHook
    public final void LIZJ() {
        if (((Boolean) C1776806xa.LIZJ.getValue()).booleanValue()) {
            C310420CEu.LIZ.getClass();
            DispatchConfig dispatchConfig = (DispatchConfig) C310420CEu.LIZLLL.getValue();
            C1490190osj c1490190osj = C1490190osj.LIZIZ;
            EnumC2262571Dh9 enumC2262571Dh9 = EnumC2262571Dh9.BIZ_STARTUP;
            c1490190osj.LIZIZ(enumC2262571Dh9, dispatchConfig);
            c1490190osj.LIZ(enumC2262571Dh9);
            C0CN5.LIZIZ(Long.valueOf(dispatchConfig.delayDisableTimeMs), new Runnable() { // from class: X.0Il0
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("InitTTNetHookImpl@90a8.coldStartNetworkControl$1");
                    try {
                        C1490190osj.LIZIZ.LIZJ(EnumC2262571Dh9.BIZ_STARTUP);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("InitTTNetHookImpl@90a8.coldStartNetworkControl$1");
                }
            });
        }
        C0S78.LIZJ(AFwS212S0000000_23.get$arr$(184), true);
        IEcomSecApi iEcomSecApi = (IEcomSecApi) PluggableExtentionKt.pluggableSpi$default(IEcomSecApi.class, false, false, false, 14, null);
        if (iEcomSecApi != null) {
            C844470XAv.LIZ.getClass();
            iEcomSecApi.LIZ(C844470XAv.LIZ());
        }
    }

    @Override // com.tiktok.ttf.network.task.IInitTTNetHook
    public final int LJFF() {
        IDataSaverSettingApi iDataSaverSettingApi = (IDataSaverSettingApi) PluggableExtentionKt.pluggableSpi$default(IDataSaverSettingApi.class, false, false, false, 14, null);
        if (iDataSaverSettingApi != null) {
            return iDataSaverSettingApi.LIZ() ? 1 : 0;
        }
        return 0;
    }

    @Override // com.tiktok.ttf.network.task.IInitTTNetHook
    public final boolean LJIIIZ() {
        return ((Boolean) C0CD2.LJJIJLIJ.getValue()).booleanValue();
    }

    @Override // com.tiktok.ttf.network.task.IInitTTNetHook
    public final Executor LIZIZ() {
        if (C0CD2.LIZIZ()) {
            return C823050WQl.LIZLLL();
        }
        IFeedCacheLoaderService iFeedCacheLoaderService = (IFeedCacheLoaderService) PluggableExtentionKt.pluggableSpi$default(IFeedCacheLoaderService.class, false, false, false, 14, null);
        return (iFeedCacheLoaderService != null && iFeedCacheLoaderService.LIZIZ() && ((Boolean) C312780CNw.LIZLLL.getValue()).booleanValue()) ? C823050WQl.LIZJ() : C823050WQl.LIZLLL();
    }

    @Override // com.tiktok.ttf.network.task.IInitTTNetHook
    public final void LIZ(C1495130p0h c1495130p0h) {
        List<InterfaceC836900WsK> listLIZJ = InterceptorHolder.LIZLLL().LIZJ();
        if (!C086I.LIZIZ(listLIZJ) && listLIZJ != null) {
            Iterator<InterfaceC836900WsK> it2 = listLIZJ.iterator();
            while (it2.hasNext()) {
                C842260X2i.LIZJ.LIZIZ(it2.next());
            }
        }
        C844470XAv.LIZ.getClass();
        if (C08Q0.LJ(C844470XAv.LIZ(), "pns_slardar_route_opt_enable_ttnet", true)) {
            Npth.setUseLocalDomain(true);
            Npth.setDomainName("https://mon.tiktokv.com");
            C0W1D.LIZ = new C0W1Q();
        }
        C0S78.LIZJ(AFwS212S0000000_23.get$arr$(183), true);
    }

    @Override // com.tiktok.ttf.network.task.IInitTTNetHook
    public final void LIZLLL(C1495130p0h c1495130p0h) {
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

    @Override // com.tiktok.ttf.network.task.IInitTTNetHook
    public final void LJI(C1495130p0h c1495130p0h) {
        C1490400ot4.LIZ.getClass();
        C1490400ot4.LIZ();
    }

    @Override // com.tiktok.ttf.network.task.IInitTTNetHook
    public final void LJII(C1495130p0h c1495130p0h) {
        IFeedCacheLoaderService iFeedCacheLoaderService;
        TTWebViewEnableStatusSettings.LIZ.getClass();
        TTWebViewEnableStatusSettings.TikTokTTWebViewStatusModel tikTokTTWebViewStatusModelLIZ = TTWebViewEnableStatusSettings.LIZ();
        if (tikTokTTWebViewStatusModelLIZ.isTTWebViewEnabled) {
            C830730WiN c830730WiN = C830730WiN.LIZ;
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            c830730WiN.getClass();
            C830730WiN.LIZ(contextLIZ, tikTokTTWebViewStatusModelLIZ);
        }
        if (((Boolean) C1230104rb.LIZIZ.getValue()).booleanValue() && (iFeedCacheLoaderService = (IFeedCacheLoaderService) PluggableExtentionKt.pluggableSpi$default(IFeedCacheLoaderService.class, false, false, false, 14, null)) != null && iFeedCacheLoaderService.LIZLLL() && C2456309jt.LIZ()) {
            C592890NNf.LIZIZ().LIZ(C1230104rb.LIZ());
            C202094145s.LJIJ = SystemClock.uptimeMillis();
        }
    }

    @Override // com.tiktok.ttf.network.task.IInitTTNetHook
    public final void LJIIIIZZ(C1495130p0h c1495130p0h) {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        final AFwS199S0000000_12 aFwS199S0000000_12 = AFwS199S0000000_12.get$arr$(371);
        if (C2162308dZ.LJI(contextLIZ)) {
            String str = c1495130p0h.LJFF;
            if (str == null) {
                str = "";
            }
            String str2 = c1495130p0h.LJI;
            if (str2 == null) {
                str2 = "";
            }
            ((ISecApi) ServiceManager.get().getService(ISecApi.class)).initSec(contextLIZ, (String) aFwS199S0000000_12.invoke(), c1495130p0h.LJ, str, str2, true, new C149B() { // from class: X.0p6j
                @Override // X.C149B
                public final String getLanguage() {
                    return aFwS199S0000000_12.invoke();
                }

                @Override // X.C149B
                public final String getSessionId() {
                    try {
                        return C1BYN.LIZIZ.getSessionId();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
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
    }

    @Override // com.tiktok.ttf.network.task.IInitTTNetHook
    public final void LJIIL(C1495130p0h c1495130p0h) {
        C19266210Yy.LIZIZ.init();
    }

    @Override // com.tiktok.ttf.network.task.IInitTTNetHook
    public final void LJIILIIL(Context context) {
        IFeedStrategyService iFeedStrategyService = (IFeedStrategyService) PluggableExtentionKt.pluggableSpi$default(IFeedStrategyService.class, false, false, false, 14, null);
        if (iFeedStrategyService != null) {
            iFeedStrategyService.LIZJ();
        }
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        C846280XHu.LIZ = new C842940X4y();
        AbstractC842290X2l.LIZ = new AbstractC842290X2l() { // from class: X.0p2z
            @Override // X.AbstractC842290X2l
            public final void LIZ() {
                C1499670p81.LIZIZ.LIZJ();
            }
        };
    }

    @Override // com.tiktok.ttf.network.task.IInitTTNetHook
    public final void LJIIJ(EnumC1496430p2n enumC1496430p2n, boolean z) {
        switch (C1496440p2o.LIZ[enumC1496430p2n.ordinal()]) {
            case 1:
                if (z) {
                    C1150504el.LIZ().LJI("method_init_ttnet_duration", false);
                    return;
                } else {
                    C1150504el.LIZ().LIZLLL("method_init_ttnet_duration", false);
                    return;
                }
            case 2:
                if (z) {
                    C1150504el.LIZ().LJI("feed_network_init_to_init_ttnet", false);
                    return;
                } else {
                    C1150504el.LIZ().LIZLLL("feed_network_init_to_init_ttnet", false);
                    return;
                }
            case 3:
                if (z) {
                    C1150504el.LIZ().LJI("feed_network_init_ttnet_duration", false);
                    return;
                } else {
                    C1150504el.LIZ().LIZLLL("feed_network_init_ttnet_duration", false);
                    return;
                }
            case 4:
                if (z) {
                    C1150504el.LIZ().LJI("feed_boot_to_init_ttnet", false);
                    return;
                } else {
                    C1150504el.LIZ().LIZLLL("feed_boot_to_init_ttnet", false);
                    return;
                }
            case 5:
                if (z) {
                    C1150504el.LIZ().LJI("feed_boot_to_init_ttnet_end", false);
                    return;
                } else {
                    C1150504el.LIZ().LIZLLL("feed_boot_to_init_ttnet_end", false);
                    return;
                }
            case 6:
                if (z) {
                    C1150504el.LIZ().LJI("feed_init_ttnet_end_to_network", false);
                    return;
                } else {
                    C1150504el.LIZ().LIZLLL("feed_init_ttnet_end_to_network", false);
                    return;
                }
            case 7:
                if (z) {
                    C1150504el.LIZ().LJI("feed_network_init_sec_duration", false);
                    return;
                } else {
                    C1150504el.LIZ().LIZLLL("feed_network_init_sec_duration", false);
                    return;
                }
            default:
                throw new C1954807lC();
        }
    }
}
