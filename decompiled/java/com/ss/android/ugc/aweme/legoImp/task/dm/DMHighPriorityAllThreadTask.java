package com.ss.android.ugc.aweme.legoImp.task.dm;

import X.C07ZM;
import X.C0CCZ;
import X.C0VG3;
import X.C0VJQ;
import X.C0VJS;
import X.C0VJT;
import X.C0VJU;
import X.C0VJX;
import X.C0VR5;
import X.C0VR6;
import X.C0VR7;
import X.C0VR9;
import X.C0VRG;
import X.C0VRH;
import X.C0VU1;
import X.C0VZ0;
import X.C0W8A;
import X.C1904207d2;
import X.C20546915ad;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C794340VEa;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.experiment.ApplogAllowKeysExp;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.legoImp.task.dm.ab.TrackerBlockConfigModel;
import com.tiktok.pns.ldp.api.ILDPService;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class DMHighPriorityAllThreadTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "DMHighPriorityAllThreadTask";
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
    public final int priority() {
        return 2;
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
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C0VR5.LIZ = new C0VR6() { // from class: X.0VRD
            @Override // X.C0VR6
            public final void LIZ(Map map) {
                AppLogNewUtils.onEventV3("blocked_by_pns", new JSONObject(map));
            }

            @Override // X.C0VR6
            public final void LIZIZ(C0W6I c0w6i) {
                ILDPService iLDPService = (ILDPService) PluggableExtentionKt.pluggableSpi$default(ILDPService.class, false, false, false, 14, null);
                if (iLDPService != null) {
                    iLDPService.LIZIZ(c0w6i);
                }
            }
        };
        C786410Ut5.f4(1);
        TrackerBlockConfigModel trackerBlockConfigModelLIZ = C794340VEa.LIZ();
        if (trackerBlockConfigModelLIZ.enable) {
            C0VJQ.LIZ.LJ(trackerBlockConfigModelLIZ.blockConfig, trackerBlockConfigModelLIZ.auditMeta);
            SDKMonitorUtils.setEventJsonInterceptor(new C0VG3());
        }
        if (((Boolean) C0W8A.LIZLLL.getValue()).booleanValue()) {
            if (((Boolean) C0W8A.LJI.getValue()).booleanValue()) {
                C0VJT.LIZIZ((Map) C0W8A.LJII.getValue(), (Set) C0W8A.LJFF.getValue());
            } else {
                C0VJT.LIZIZ(null, (Set) C0W8A.LJFF.getValue());
            }
        }
        if (((Boolean) C0W8A.LJ.getValue()).booleanValue()) {
            SDKMonitorUtils.setHeaderInterceptor(new C0VJS());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DMHighPriorityAllThreadTask set up Tea Body Header Filter, only_km = ");
        sbLIZ.append(!((Boolean) ApplogAllowKeysExp.LIZIZ.getValue()).booleanValue());
        C2188811AlT.LIZIZ(sbLIZ);
        C0VJU.LIZIZ(new C0VJX() { // from class: X.0VRA
            @Override // X.C0VJX
            public final Set<String> LIZ() {
                IAccountUserService iAccountUserService = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null);
                return (iAccountUserService == null || !iAccountUserService.LIZ()) ? ((Boolean) ApplogAllowKeysExp.LIZIZ.getValue()).booleanValue() ? (Set) ApplogAllowKeysExp.LIZLLL.getValue() : C08CX.INSTANCE : (Set) ApplogAllowKeysExp.LIZJ.getValue();
            }
        }, (Map) ApplogAllowKeysExp.LJ.getValue());
        if (((Boolean) C20546915ad.LIZIZ.getValue()).booleanValue()) {
            C0VR7.LIZ.LIZJ(new C0VR9(((Number) C20546915ad.LJI.getValue()).intValue(), (Map) C20546915ad.LIZJ.getValue(), ((Boolean) C20546915ad.LJ.getValue()).booleanValue(), ((Boolean) C20546915ad.LJFF.getValue()).booleanValue()), new C0VRH() { // from class: X.0VRC
                @Override // X.C0VRH
                public final boolean LIZ() {
                    IAccountUserService iAccountUserService = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null);
                    return iAccountUserService != null && iAccountUserService.LIZ();
                }
            }, (Map) C20546915ad.LIZLLL.getValue());
        }
        if (((Boolean) C0VRG.LIZ.getValue()).booleanValue()) {
            C1904207d2 c1904207d2 = C1904207d2.LIZ;
            Map map = (Map) C0VRG.LIZIZ.getValue();
            synchronized (c1904207d2) {
                try {
                    if (C1904207d2.LIZIZ == null) {
                        Map<String, C07ZM> mapLJI = C1904207d2.LJI(map);
                        C1904207d2.LIZIZ = mapLJI;
                        C1904207d2.LJFF(mapLJI);
                    }
                    C1904207d2.LIZJ = true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
