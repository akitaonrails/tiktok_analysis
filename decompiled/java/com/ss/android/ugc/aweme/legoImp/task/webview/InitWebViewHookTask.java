package com.ss.android.ugc.aweme.legoImp.task.webview;

import X.C01GW;
import X.C04TZ;
import X.C07M1;
import X.C098200Yq;
import X.C0CAH;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1492110ovp;
import X.C1543410qGZ;
import X.C1544010qHX;
import X.C1544520qIM;
import X.C1546140qKy;
import X.C189200o6;
import X.C1973707oF;
import X.C1BLW;
import X.C1E21;
import X.C2268741Dr6;
import X.C2407009bw;
import X.C2517809to;
import X.C2517909tp;
import X.C452501pT;
import X.C828090We7;
import X.C844470XAv;
import X.C846480XIo;
import X.C846490XIp;
import X.C846500XIq;
import X.C846510XIr;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC2203391BLl;
import X.InterfaceC799590VYf;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.lynx.hybrid.webkit.WebViewClientMetricsExt;
import com.bytedance.lynx.hybrid.webkit.WebViewHooker;
import com.bytedance.lynx.hybrid.webkit.ttwebview.TTWebViewHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.hybridkit.web.hooks.WebMonitorExt;
import com.ss.android.ugc.aweme.hybridkit.web.ttp.TTPWebService;
import com.ss.android.ugc.aweme.offline.hybriddevtool.IHybridDevtoolService;
import com.ss.android.ugc.aweme.settings.TTWebViewEnableStatusSettings;
import com.ss.android.ugc.tiktok.security.IClientSecurityService;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class InitWebViewHookTask implements C0CCZ, InterfaceC799590VYf {
    public static final C01GW<Boolean> LL = C452501pT.LIZIZ(new C846480XIo());

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitWebViewHookTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        Object objLIZJ = C1492110ovp.LIZJ("initWebviewhook_io", new C846500XIq(), new C846510XIr(), ((Boolean) C07M1.LJFF.getValue()).booleanValue());
        if (objLIZJ != null) {
            return (C0VU1) objLIZJ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return !C1E21.LIZIZ();
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) throws Throwable {
        Unit unit;
        Long lLJJ;
        Context contextLIZ = context;
        C2407009bw.LIZ();
        if (C1973707oF.LIZ()) {
            C1973707oF.LIZJ();
        }
        C1544520qIM.LIZIZ(Boolean.TRUE, "web_hook_sdk_init_start");
        C1544520qIM.LIZIZ(Long.valueOf(System.currentTimeMillis()), "web_hook_sdk_init_start_tmp");
        TTWebViewEnableStatusSettings.LIZ.getClass();
        TTWebViewEnableStatusSettings.TikTokTTWebViewStatusModel tikTokTTWebViewStatusModelLIZ = TTWebViewEnableStatusSettings.LIZ();
        Unit unit2 = null;
        try {
            IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
            if (iPluginService != null && (lLJJ = iPluginService.LJJ()) != null) {
                TTWebViewHelper.splitCompatInstallTimeCost = Long.valueOf(lLJJ.longValue());
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (tikTokTTWebViewStatusModelLIZ.isTTWebViewEnabled) {
            TTWebViewHelper tTWebViewHelper = TTWebViewHelper.INSTANCE;
            if (contextLIZ == null) {
                C844470XAv.LIZ.getClass();
                contextLIZ = C844470XAv.LIZ();
            }
            C1546140qKy c1546140qKy = C1546140qKy.LIZ;
            C844470XAv.LIZ.getClass();
            String strValueOf = String.valueOf(C844470XAv.LJ());
            long j = C844470XAv.LJIJJLI;
            IHybridDevtoolService iHybridDevtoolService = (IHybridDevtoolService) ServiceManager.get().getService(IHybridDevtoolService.class, false, false);
            if (iHybridDevtoolService != null) {
                iHybridDevtoolService.isOpen();
            }
            tTWebViewHelper.initTTWebView(contextLIZ, "com.ss.android.ugc.aweme.ttwebview.TTWebViewRuntimeService", c1546140qKy, tikTokTTWebViewStatusModelLIZ, strValueOf, j, false, 0);
        }
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        C846490XIp c846490XIp = new C846490XIp();
        c846490XIp.LIZJ = C2517809to.LIZ;
        c846490XIp.LIZ = LL.getValue().booleanValue();
        c846490XIp.LIZIZ = C2517909tp.LIZ;
        c846490XIp.LIZLLL = new C0CAH();
        try {
            if (!WebViewHooker.LJI.getAndSet(true)) {
                WebViewHooker.LJIIIZ = c846490XIp;
                WebViewHooker.LJIIJ = c846490XIp.LIZLLL;
                WebViewHooker.LIZJ();
                WebViewHooker.LIZIZ();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (C2268741Dr6.LIZ() && WebViewHooker.LJIILJJIL == null) {
            WebViewHooker.LJIILJJIL = WebViewClientMetricsExt.class;
        }
        AtomicBoolean atomicBoolean = WebMonitorExt.LLJ;
        C828090We7.LIZ();
        IClientSecurityService iClientSecurityService = (IClientSecurityService) ServiceManager.get().getService(IClientSecurityService.class);
        if (iClientSecurityService != null) {
            iClientSecurityService.init();
        }
        if (TTPWebService.LIZJ().LIZIZ()) {
            TTPWebService.LIZJ().LIZ();
        } else {
            ((ISandboxService) ServiceManager.get().getService(ISandboxService.class)).LIZLLL();
        }
        C04TZ.LIZIZ.LIZ();
        C1544520qIM.LIZIZ(Long.valueOf(System.currentTimeMillis()), "web_hook_sdk_init_end_tmp");
        C1544520qIM.LIZIZ(Boolean.TRUE, "web_hook_sdk_init_end");
        C1544520qIM.LIZIZ(Boolean.valueOf(WebViewHooker.LJIIIIZZ), "web_hook_sdk_init_state");
        if (tikTokTTWebViewStatusModelLIZ.isTTWebViewEnabled || tikTokTTWebViewStatusModelLIZ.isDownloadEnabled) {
            TTWebViewHelper.INSTANCE.presetTTWebViewService(tikTokTTWebViewStatusModelLIZ);
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                IPluginService iPluginService2 = (IPluginService) ServiceManager.get().getService(IPluginService.class);
                if (iPluginService2 != null && iPluginService2.LIZLLL() != null) {
                    C1BLW.LIZJ("com.ss.android.ugc.aweme.df_ttwebview", new InterfaceC2203391BLl() { // from class: X.0XIv
                        public long LIZ = SystemClock.elapsedRealtime();

                        @Override // X.InterfaceC2203391BLl
                        public final void LIZIZ() {
                            this.LIZ = SystemClock.elapsedRealtime();
                            TTWebViewHelper.doCommonReport$default(TTWebViewHelper.INSTANCE, "ttwebview_install_trigger", false, jElapsedRealtime, "prepare", null, false, null, 64, null);
                        }

                        @Override // X.InterfaceC2425409eu
                        public final void LIZ(AbstractC2457909k9 abstractC2457909k9) throws JSONException {
                            String string;
                            AbstractC2457909k9 abstractC2457909k92 = abstractC2457909k9;
                            TTWebViewHelper tTWebViewHelper2 = TTWebViewHelper.INSTANCE;
                            long j2 = this.LIZ;
                            Integer numValueOf = Integer.valueOf(abstractC2457909k92.LJII());
                            if (numValueOf == null) {
                                string = "Fused";
                            } else if (numValueOf.intValue() == 0) {
                                string = "Unknown";
                            } else if (numValueOf.intValue() == 1) {
                                string = "Pending";
                            } else if (numValueOf.intValue() == 8) {
                                string = "Confirming";
                            } else if (numValueOf.intValue() == 2) {
                                string = "Downloading";
                            } else if (numValueOf.intValue() == 3) {
                                string = "Downloaded";
                            } else if (numValueOf.intValue() == 4) {
                                string = "Installing";
                            } else if (numValueOf.intValue() == 5) {
                                string = "Installed";
                            } else if (numValueOf.intValue() == 6) {
                                string = "Failed";
                            } else if (numValueOf.intValue() == 9) {
                                string = "Canceling";
                            } else if (numValueOf.intValue() == 7) {
                                string = "Canceled";
                            } else {
                                string = numValueOf.toString();
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("total_bytes", abstractC2457909k92.LJIIIIZZ());
                            jSONObject.put("download_bytes", abstractC2457909k92.LIZ());
                            jSONObject.put("error_code", abstractC2457909k92.LIZJ());
                            TTWebViewHelper.doCommonReport$default(tTWebViewHelper2, "ttwebview_install_state", false, j2, string, jSONObject, false, null, 64, null);
                        }
                    });
                    unit2 = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(unit2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
        C1544010qHX c1544010qHX = C1544010qHX.LIZ;
        boolean z = WebViewHooker.LJIIIIZZ;
        c1544010qHX.getClass();
        C1543410qGZ.LJIJI = !z;
    }
}
