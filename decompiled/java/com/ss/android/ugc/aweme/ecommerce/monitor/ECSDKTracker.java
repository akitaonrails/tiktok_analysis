package com.ss.android.ugc.aweme.ecommerce.monitor;

import X.C01GW;
import X.C034S;
import X.C09AE;
import X.C1120604Zw;
import X.C1121804a8;
import X.C1508470pMD;
import X.C1508480pME;
import X.C1508490pMF;
import X.C1508500pMG;
import X.C1508520pMI;
import X.C1AQS;
import X.C2097608Jq;
import X.C23250099c;
import X.C452501pT;
import X.C817503Hh;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class ECSDKTracker implements Application.ActivityLifecycleCallbacks {
    public static boolean register;
    public static C09AE serviceReportJob;
    public static final ECSDKTracker INSTANCE = new ECSDKTracker();
    public static final C01GW configData$delegate = C452501pT.LIZIZ(new C1508520pMI());
    public static final C01GW logService$delegate = C452501pT.LIZIZ(new C1121804a8());
    public static final C01GW coldBootBeginTimeStamp$delegate = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(229));
    public static final C01GW MAX_RECORD$delegate = C452501pT.LIZIZ(new C1508500pMG());
    public static final C01GW REPORT_RATE$delegate = C452501pT.LIZIZ(new C1508490pMF());
    public static final CopyOnWriteArrayList<C1508480pME> serviceTrackList = new CopyOnWriteArrayList<>();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    private final long getColdBootBeginTimeStamp() {
        return ((Number) coldBootBeginTimeStamp$delegate.getValue()).longValue();
    }

    private final int getMAX_RECORD() {
        return ((Number) MAX_RECORD$delegate.getValue()).intValue();
    }

    private final void register() {
        IECommerceHostService iECommerceHostService;
        if (register) {
            return;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        ((IApplicationDependencyService) iECommerceHostService).getApplication().registerActivityLifecycleCallbacks(this);
        register = true;
    }

    public final ECSDKMonitorConfigData getConfigData() {
        return (ECSDKMonitorConfigData) configData$delegate.getValue();
    }

    public final ILogDependencyService getLogService() {
        return (ILogDependencyService) logService$delegate.getValue();
    }

    public final float getREPORT_RATE() {
        return ((Number) REPORT_RATE$delegate.getValue()).floatValue();
    }

    private final void reportGetServiceLog(List<C1508480pME> list) {
        if (list.isEmpty()) {
            return;
        }
        C09AE c09ae = serviceReportJob;
        if (c09ae == null || !c09ae.isActive()) {
            serviceReportJob = C23250099c.LIZLLL(C817503Hh.LL, null, null, new C1508470pMD(list, null), 3);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        reportGetServiceLog(serviceTrackList);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSdkInit(long r16) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.monitor.ECSDKTracker.onSdkInit(long):void");
    }

    public final void onSparkPluginStart(String str, String str2, String str3) {
        if (!Intrinsics.LJFF(getConfigData().enableTrack, Boolean.TRUE)) {
            return;
        }
        getLogService().onEventV3("rd_tiktokec_saas_spark_plugin_start", C2097608Jq.LJIIIIZZ(new Pair("schema", str), new Pair("plugin_name", str2), new Pair("target_handler", str3)));
    }

    public final void onSparkPluginEnd(String str, String str2, String str3, long j, int i) {
        if (!Intrinsics.LJFF(getConfigData().enableTrack, Boolean.TRUE)) {
            return;
        }
        getLogService().onEventV3("rd_tiktokec_saas_spark_plugin_end", C2097608Jq.LJIIIIZZ(new Pair("schema", str), new Pair("plugin_name", str2), new Pair("target_handler", str3), new Pair("cost_time", String.valueOf(j)), new Pair("sub_interceptor_size", String.valueOf(i))));
    }

    public final void onGetService(boolean z, Boolean bool, String str, int i, long j, String str2) {
        if (!Intrinsics.LJFF(getConfigData().enableTrack, Boolean.TRUE)) {
            return;
        }
        CopyOnWriteArrayList<C1508480pME> copyOnWriteArrayList = serviceTrackList;
        copyOnWriteArrayList.add(new C1508480pME(z, bool, str, i, j, str2));
        if (copyOnWriteArrayList.size() > getMAX_RECORD()) {
            reportGetServiceLog(copyOnWriteArrayList);
            copyOnWriteArrayList.clear();
        }
    }

    public final void onSaaSSchemaRedirect(String str, String str2, String str3, long j, String str4, boolean z) {
        if (!Intrinsics.LJFF(getConfigData().enableTrack, Boolean.TRUE)) {
            return;
        }
        getLogService().onEventV3("rd_tiktokec_saas_schema_redirect", C2097608Jq.LJIIIIZZ(new Pair("original_schema", str), new Pair("redirect_schema", str2), new Pair("target_handler", str3), new Pair("cost_time", String.valueOf(j)), new Pair("channel", str4), new Pair("is_webcast", String.valueOf(z ? 1 : 0))));
    }
}
