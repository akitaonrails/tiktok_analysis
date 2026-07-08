package com.ss.android.ugc.aweme.legoImp.task.pumbaa;

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
import X.C0VRH;
import X.C0VZ0;
import X.C0W8A;
import X.C20546915ad;
import X.C786410Ut5;
import X.C794340VEa;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.experiment.ApplogAllowKeysExp;
import com.ss.android.ugc.aweme.legoImp.task.dm.ab.TrackerBlockConfigModel;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class KidsDMTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "KidsDMTask";
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
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        TrackerBlockConfigModel trackerBlockConfigModelLIZ = C794340VEa.LIZ();
        if (trackerBlockConfigModelLIZ.enable) {
            C0VJQ.LIZ.LJ(trackerBlockConfigModelLIZ.blockConfig, trackerBlockConfigModelLIZ.auditMeta);
            SDKMonitorUtils.setEventJsonInterceptor(new C0VG3());
        }
        if (((Boolean) C0W8A.LIZLLL.getValue()).booleanValue()) {
            C0VJT.LIZIZ(null, (Set) C0W8A.LJFF.getValue());
        }
        if (((Boolean) C0W8A.LJ.getValue()).booleanValue()) {
            SDKMonitorUtils.setHeaderInterceptor(new C0VJS());
        }
        C0VJU.LIZIZ(new C0VJX() { // from class: X.0VRB
            @Override // X.C0VJX
            public final Set<String> LIZ() {
                return (Set) ApplogAllowKeysExp.LIZJ.getValue();
            }
        }, (Map) ApplogAllowKeysExp.LJ.getValue());
        if (((Boolean) C20546915ad.LIZIZ.getValue()).booleanValue()) {
            C0VR5.LIZ = new C0VR6() { // from class: X.0VRE
                @Override // X.C0VR6
                public final void LIZIZ(C0W6I c0w6i) {
                }

                @Override // X.C0VR6
                public final void LIZ(Map map) {
                    AppLogNewUtils.onEventV3("blocked_by_pns", new JSONObject(map));
                }
            };
            C786410Ut5.f4(1);
            C0VR7.LIZ.LIZJ(new C0VR9(((Number) C20546915ad.LJI.getValue()).intValue(), (Map) C20546915ad.LIZJ.getValue(), ((Boolean) C20546915ad.LJ.getValue()).booleanValue(), ((Boolean) C20546915ad.LJFF.getValue()).booleanValue()), new C0VRH() { // from class: X.0VRF
                @Override // X.C0VRH
                public final boolean LIZ() {
                    return true;
                }
            }, (Map) C20546915ad.LIZLLL.getValue());
        }
    }
}
