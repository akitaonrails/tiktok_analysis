package com.ss.android.ugc.aweme.ecommerce.dependency.log;

import X.C04TD;
import X.C1720106oR;
import X.C18C6;
import X.C1BMS;
import X.C20684815ws;
import X.C20684915wt;
import X.C2187451AjH;
import X.C2211641BhC;
import X.C2344809Gs;
import X.C443120HZe;
import X.InterfaceC19397110uf;
import X.InterfaceC20685415wy;
import X.InterfaceC2190351Anx;
import X.InterfaceC2211161BgQ;
import X.InterfaceC799320VXe;
import android.view.View;
import com.bytedance.ies.ugc.statisticlogger.btm.IBTMTrackerService;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class LogDependencyService implements ILogDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public String getInstallId() {
        return AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public String getServerDeviceId() {
        return AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public Pair<Boolean, Boolean> getBDBTMReplaceSwitch() {
        return ((IBTMTrackerService) ServiceManager.get().getService(IBTMTrackerService.class)).getBDBTMReplaceSwitch();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public ExecutorService getExecutorService() {
        return C20684815ws.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public JSONObject getHeaderCopy() {
        return AppLog.getHeaderCopy();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public String getIid() {
        return com.bytedance.applog.AppLog.getIid();
    }

    public static ILogDependencyService createILogDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(ILogDependencyService.class, z);
        if (objLIZ != null) {
            return (ILogDependencyService) objLIZ;
        }
        if (C04TD.E == null) {
            synchronized (ILogDependencyService.class) {
                if (C04TD.E == null) {
                    C04TD.E = new LogDependencyService();
                }
            }
        }
        return C04TD.E;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public void addAppLogEventPreProcessStageObserver(final C1BMS c1bms) {
        com.bytedance.applog.AppLog.addEventObserver(2, new InterfaceC2211161BgQ() { // from class: X.1BMR
            @Override // X.InterfaceC2211161BgQ
            public final void LIZ(String str, String str2) {
                c1bms.LIZ(str, str2);
            }

            @Override // X.InterfaceC2211161BgQ
            public final void LIZIZ(String str, String str2) {
                c1bms.LIZIZ();
            }

            @Override // X.InterfaceC2211161BgQ
            public final void LIZJ(long j, long j2, String str, String str2, String str3, String str4) {
                c1bms.onEvent();
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public void addAppLogEventPreProcessStageObserverV2(final InterfaceC799320VXe interfaceC799320VXe) {
        com.bytedance.applog.AppLog.addEventObserverV2(2, new InterfaceC19397110uf() { // from class: X.1BMQ
            @Override // X.InterfaceC19397110uf
            public final void LIZ(String str, String str2, JSONObject jSONObject) {
                interfaceC799320VXe.LIZ(str, str2, jSONObject);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public void addApplogTrackEventObserver(final InterfaceC2190351Anx interfaceC2190351Anx) {
        C20684815ws.LIZ(new InterfaceC20685415wy() { // from class: X.1Any
            @Override // X.InterfaceC20685415wy
            public void onEvent(String str) {
                interfaceC2190351Anx.onEvent(str);
            }

            @Override // X.InterfaceC20685415wy
            public final void LIZ(String str, Map<String, String> map) {
                interfaceC2190351Anx.LIZ(str, map);
            }

            @Override // X.InterfaceC20685415wy
            public final void onEvent(String str, JSONObject jSONObject) {
                interfaceC2190351Anx.onEvent(str, jSONObject);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public void crashlyticsWrapperCatchException(Exception exc) {
        C2344809Gs.LIZ(exc);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public void crashlyticsWrapperLogException(Throwable th) {
        C2344809Gs.LJI(th);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public List<C443120HZe<String, String, JSONObject>> getBDBTMList(View view) {
        return ((IBTMTrackerService) ServiceManager.get().getService(IBTMTrackerService.class)).getBDBTMList(view);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public List<C2211641BhC> getPageRecordChain(boolean z) {
        return ((IBTMTrackerService) ServiceManager.get().getService(IBTMTrackerService.class)).getPageRecordChain(z);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public String getPageRecordChainStringData(boolean z) {
        return ((IBTMTrackerService) ServiceManager.get().getService(IBTMTrackerService.class)).LJIILIIL(null, true);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public void commonLogE(String str, String str2) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LIZ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public void commonLogI(String str, String str2) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public Pair<C18C6, C18C6> getBTMChain(View view, String str) {
        Pair<C18C6, C18C6> pairLJIIL;
        IBTMTrackerService iBTMTrackerService = (IBTMTrackerService) PluggableExtentionKt.pluggableSpi$default(IBTMTrackerService.class, false, false, false, 14, null);
        if (iBTMTrackerService == null || (pairLJIIL = iBTMTrackerService.LJIIL(view, str)) == null) {
            return new Pair<>(new C18C6(), new C18C6());
        }
        return pairLJIIL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public List<C2211641BhC> getPageRecordChain(View view, boolean z) {
        return ((IBTMTrackerService) ServiceManager.get().getService(IBTMTrackerService.class)).getPageRecordChain(view, z);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public void mobClickCombinerEventV3(String str, Map<String, String> map) {
        C20684915wt.LJFF(str, map);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public void onEventV3(String str, Map<String, String> map) {
        C20684815ws.LJIILLIIL(str, map);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public void onEventV3WithAppLogNewUtils(String str, JSONObject jSONObject) {
        AppLogNewUtils.onEventV3(str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public void onEventV3(String str, JSONObject jSONObject) {
        C20684815ws.LJIJ(str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public void crashlyticsWrapperLog(int i, String str, String str2) {
        C2344809Gs.LIZLLL(i, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService
    public String getPageRecordChainStringDataSubPage(View view, boolean z, String str) {
        return ((IBTMTrackerService) ServiceManager.get().getService(IBTMTrackerService.class)).getPageRecordChainStringDataSubPage(view, z, str);
    }
}
