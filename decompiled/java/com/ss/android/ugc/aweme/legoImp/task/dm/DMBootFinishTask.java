package com.ss.android.ugc.aweme.legoImp.task.dm;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C805130ViB;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.legoImp.task.dm.ai.KvAiTaskThrottlerModel;
import com.ss.bytertc.base.data.IRTCPnsInterface;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes14.dex */
public final class DMBootFinishTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "DMBootFinishTask";
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
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("pns_rtc_control", true)) {
            ServiceManager.get().bind(IRTCPnsInterface.class, new ServiceProvider() { // from class: X.0ViH
                @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                public final Object get() {
                    return new IRTCPnsInterface() { // from class: X.0ViA
                        @Override // com.ss.bytertc.base.data.IRTCPnsInterface
                        public final ArrayList<String> processFiles(ArrayList<String> arrayList) {
                            return arrayList;
                        }

                        @Override // com.ss.bytertc.base.data.IRTCPnsInterface
                        public final boolean isValid() {
                            if (C10EU.LJIILIIL()) {
                                int i = C2187451AjH.LIZ;
                                C1720106oR.LJI("pns_rtc_log", "rtc cloudcommand deny, app in cild mode");
                                return false;
                            }
                            if (!C05GY.LIZ()) {
                                int i2 = C2187451AjH.LIZ;
                                C1720106oR.LJI("pns_rtc_log", "rtc cloudcommand deny, app is not consent");
                                return false;
                            }
                            if (C2214201BlK.LJIIJJI) {
                                int i3 = C2187451AjH.LIZ;
                                C1720106oR.LJI("pns_rtc_log", "rtc cloudcommand deny, app in background");
                                return false;
                            }
                            if (!C2273401Dyc.LIZIZ()) {
                                return true;
                            }
                            int i4 = C2187451AjH.LIZ;
                            C1720106oR.LJI("pns_rtc_log", "rtc cloudcommand deny, current env is ttp");
                            return false;
                        }
                    };
                }
            }).asSingleton();
        }
        ConcurrentHashMap<String, JSONArray> concurrentHashMap = C805130ViB.LIZ;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("pns_kvai_control", false)) {
            C805130ViB.LIZLLL.execute(new Runnable() { // from class: X.0ViF
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("KVAIManager@6a61.preloadResources$1");
                    try {
                        C830920Wig c830920Wig = new C830920Wig();
                        c830920Wig.LIZIZ = true;
                        TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey("pns_kv_data_prediction", null, c830920Wig.LIZ(), new AbstractC830880Wic() { // from class: X.0ViE
                            @Override // X.AbstractC830880Wic
                            public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                                if (enumC2213771Bkd == EnumC2213771Bkd.TTMStateCodeSuccess) {
                                    C805130ViB.LIZJ = interfaceC830890Wid;
                                    SettingsManager.LIZLLL().getClass();
                                    C805130ViB.LIZIZ = SettingsManager.LJ("tiktok_pns_jsb_kv_ai_without_cache_sample_rate", 10);
                                    SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                                    KvAiTaskThrottlerModel kvAiTaskThrottlerModel = C805180ViG.LIZ;
                                    KvAiTaskThrottlerModel kvAiTaskThrottlerModel2 = (KvAiTaskThrottlerModel) settingsManagerLIZLLL.LJIIIIZZ("pns_kvai_throttler_config", KvAiTaskThrottlerModel.class, kvAiTaskThrottlerModel);
                                    if (kvAiTaskThrottlerModel2 != null) {
                                        kvAiTaskThrottlerModel = kvAiTaskThrottlerModel2;
                                    }
                                    C805130ViB.LJ = new C805140ViC(kvAiTaskThrottlerModel.intervalSeconds, kvAiTaskThrottlerModel.maxTasks);
                                    C805130ViB.LJFF = true;
                                    return;
                                }
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("pns_kv_data_prediction task start failed with code  ");
                                sbLIZ.append(enumC2213771Bkd);
                                C2188811AlT.LIZIZ(sbLIZ);
                            }
                        });
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("KVAIManager@6a61.preloadResources$1");
                }
            });
        }
    }
}
