package com.ss.android.ugc.aweme.feed.component;

import X.C09C2;
import X.C0BPR;
import X.C0BX7;
import X.C0C64;
import X.C0CCZ;
import X.C0S78;
import X.C0T5M;
import X.C0T6L;
import X.C0VU1;
import X.C0VZ0;
import X.C1602700roC;
import X.C1602860roS;
import X.C1967407nE;
import X.C1DD6;
import X.C1DDC;
import X.C20336114hj;
import X.C204660156k;
import X.C204662156m;
import X.C204730159c;
import X.C20551415bM;
import X.C20571715ed;
import X.C20589415hU;
import X.C20646715qj;
import X.C20646915ql;
import X.C20647815qu;
import X.C20650415rK;
import X.C2188811AlT;
import X.C282000B3m;
import X.C308190C6f;
import X.C314140CTc;
import X.C314160CTe;
import X.C444830HcP;
import X.C487280J9a;
import X.C700590Rdx;
import X.C707650RpL;
import X.C823050WQl;
import X.C866950Xzh;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.anchor.expriment.AnchorMonitorSettings;
import com.ss.android.ugc.aweme.feed.model.ServerBaseFcpConfig;
import com.ss.android.ugc.aweme.feed.popup.FeedPopupService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.outreach.dispersion.data.DispersionModel;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachMultiGroupListModel;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachStorageConfig;
import com.ss.android.ugc.feed.funnel.api.IFcpFunnelCacheFlushAbility;
import com.ss.android.ugc.feed.platform.metric.model.DeviceInfo;
import com.ss.android.ugc.feed.platform.popup.exp.DynamicPopupExp;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class InitFeedPlatformTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitFeedPlatformTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
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
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        ServerBaseFcpConfig serverBaseFcpConfig;
        C1967407nE.LIZ();
        C700590Rdx.LIZ.getValue();
        C1602700roC c1602700roC = C1602700roC.LIZ;
        C1602860roS.LIZ.getClass();
        boolean zLJ = C1602860roS.LJ();
        c1602700roC.getClass();
        if (!C0BX7.LIZ()) {
            C1602700roC.LIZIZ.storeBoolean("nu_fcp_exp_hit", zLJ);
        }
        boolean z = false;
        if (C314160CTe.LIZ() != 0) {
            C314140CTc.LIZ.getClass();
            C314140CTc.LIZJ.getValue();
        }
        DynamicPopupExp dynamicPopupExp = (DynamicPopupExp) C204730159c.LIZ.getValue();
        if (dynamicPopupExp != null && dynamicPopupExp.dynamicPopupEnable) {
            if (C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "delay_init_dynamic_popup_gecko", true, false)) {
                C20589415hU.LIZIZ("initDynamicPopup scheduled after first video show");
                C0S78.LIZJ(AFwS221S0000000_31.get$arr$(181), true);
            } else {
                C20589415hU.LIZIZ("initDynamicPopup executing immediately during startup");
                FeedPopupService feedPopupService = (FeedPopupService) PluggableExtentionKt.pluggableSpi$default(FeedPopupService.class, false, false, false, 14, null);
                if (feedPopupService != null) {
                    feedPopupService.LIZJ();
                }
            }
        }
        C20551415bM.LIZ();
        C0T5M.LIZ.getClass();
        C0T5M.LIZIZ(new Callable() { // from class: X.05ZE
            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Object call() {
                C1C7U.LIZ("InsertionDataRepository@5e2f.initExecutor$1");
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("InsertionDataRepository@5e2f.initExecutor$1");
                return unit;
            }
        });
        if (AnchorMonitorSettings.LIZ()) {
            C204660156k c204660156k = C204662156m.LIZ;
            if (AnchorMonitorSettings.LIZ()) {
                ((ExecutorService) C204662156m.LIZLLL.getValue()).execute(new Runnable() { // from class: X.0Uw7
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1C7U.LIZ("AnchorMonitor@9c78.initExecutor$1");
                        C1C7U.LIZIZ("AnchorMonitor@9c78.initExecutor$1");
                    }
                });
            }
        }
        if (C0BPR.LIZ()) {
            C308190C6f.LIZ.getValue();
        }
        C444830HcP.LJIIJJI = false;
        if (C707650RpL.LIZ.compareAndSet(false, true)) {
            try {
                serverBaseFcpConfig = (ServerBaseFcpConfig) C09C2.LIZ().LJII(((Keva) C707650RpL.LIZJ.getValue()).getString("server_base_config_cache_key", "{}"), ServerBaseFcpConfig.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                serverBaseFcpConfig = null;
            }
            C707650RpL.LIZIZ = serverBaseFcpConfig;
        }
        C20647815qu.LIZ.getClass();
        if (C282000B3m.LIZ()) {
            C20650415rK.LIZ.getClass();
            DispersionModel dispersionModelLIZ = C20650415rK.LIZ();
            if (dispersionModelLIZ == null) {
                C20571715ed.LIZ.getClass();
            } else {
                List<OutreachMultiGroupListModel> list = dispersionModelLIZ.multiGroupList;
                if (list != null && C866950Xzh.LIZIZ(list)) {
                    z = true;
                }
                C20647815qu.LIZJ = z;
                C20571715ed c20571715ed = C20571715ed.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("init. use new idl:");
                sbLIZ.append(C20647815qu.LIZJ);
                C2188811AlT.LIZIZ(sbLIZ);
                c20571715ed.getClass();
                if (!((OutreachStorageConfig) C20646915ql.LIZIZ.getValue()).outreachInitDelay) {
                    C20647815qu.LJFF(dispersionModelLIZ);
                } else {
                    C0S78.LIZJ(new C20646715qj(dispersionModelLIZ), true);
                }
            }
        }
        C1DDC c1ddc = C1DDC.LL;
        C487280J9a.LIZ(-c1ddc.hashCode(), c1ddc);
        C0T6L.LIZLLL();
        final C1DD6 c1dd6 = new C1DD6();
        C823050WQl.LIZLLL().submit(new Runnable() { // from class: X.18KY
            public final void LIZ() {
                DeviceInfo deviceInfo;
                synchronized (C21265818Ka.LIZ) {
                    deviceInfo = (DeviceInfo) C105700ad.LIZ((String) C12848051a.LIZ((Keva) C21265818Ka.LIZIZ.getValue(), "{}", "device_info"), DeviceInfo.class);
                }
                if (deviceInfo == null) {
                    deviceInfo = new DeviceInfo(0, 0, 0, 0.0f, "", 0);
                }
                c1dd6.invoke(deviceInfo);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("DeviceInfoCache@50ae.recovery$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("DeviceInfoCache@50ae.recovery$1");
            }
        });
        C20336114hj.LIZ.getClass();
        C20336114hj.LIZIZ();
        IFcpFunnelCacheFlushAbility iFcpFunnelCacheFlushAbility = (IFcpFunnelCacheFlushAbility) PluggableExtentionKt.pluggableSpi$default(IFcpFunnelCacheFlushAbility.class, false, false, false, 14, null);
        if (iFcpFunnelCacheFlushAbility != null) {
            iFcpFunnelCacheFlushAbility.LIZ();
        }
    }
}
