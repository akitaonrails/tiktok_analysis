package com.ss.android.ugc.aweme.legoImp.task.allProcessTask;

import X.C0CCZ;
import X.C0CD2;
import X.C0VZ0;
import X.C310450CEx;
import X.C581760Mrm;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1489690orv;
import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.quota.BDNetworkTagManager;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class InitQuotaTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitQuotaTask";
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

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return !C310450CEx.LIZ() && C0CD2.LIZLLL();
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C581760Mrm.LIZ.getClass();
        C581760Mrm.LIZLLL = 0;
        BDNetworkTagManager bDNetworkTagManagerLIZIZ = BDNetworkTagManager.LIZIZ();
        InterfaceC1489690orv interfaceC1489690orv = new InterfaceC1489690orv() { // from class: X.0orr
            @Override // X.InterfaceC1489690orv
            public final int LIZIZ() {
                C581760Mrm.LIZ.getClass();
                return C581760Mrm.LIZLLL;
            }

            @Override // X.InterfaceC1489690orv
            public final boolean LIZJ() {
                return C1514430pVp.LIZLLL().booleanValue();
            }

            @Override // X.InterfaceC1489690orv
            public final void LIZ(int i) {
                EnumC1489640orq enumC1489640orq;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            enumC1489640orq = EnumC1489640orq.NormalStart;
                        } else {
                            enumC1489640orq = EnumC1489640orq.HotStart;
                        }
                    } else {
                        enumC1489640orq = EnumC1489640orq.WarmStart;
                    }
                } else {
                    enumC1489640orq = EnumC1489640orq.ColdStart;
                }
                try {
                    C1489660ors.LIZ = enumC1489640orq;
                    int value = enumC1489640orq.getValue();
                    C1489610orn.LIZJ.set(System.currentTimeMillis() / 1000);
                    if (value != 0) {
                        if (value != 1) {
                            if (value != 2) {
                                C1489610orn.LIZ = EnumC1489630orp.NormalStart;
                            } else {
                                C1489610orn.LIZ = EnumC1489630orp.WarmStart;
                            }
                        } else {
                            C1489610orn.LIZ = EnumC1489630orp.HotStart;
                        }
                    } else {
                        C1489610orn.LIZ = EnumC1489630orp.ColdStart;
                    }
                    ICronetClient iCronetClient = C1493630oyH.LIZJ;
                    if (iCronetClient != null) {
                        int i2 = enumC1489640orq.LL;
                        Logger.debug();
                        if (i2 >= 0 && i2 <= 2) {
                            iCronetClient.setAppStartUpState(i2);
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        };
        if (bDNetworkTagManagerLIZIZ.LIZIZ.get()) {
            bDNetworkTagManagerLIZIZ.LIZ = interfaceC1489690orv;
            bDNetworkTagManagerLIZIZ.LIZIZ.compareAndSet(true, false);
        }
        BDNetworkTagManager bDNetworkTagManagerLIZIZ2 = BDNetworkTagManager.LIZIZ();
        int i = C581760Mrm.LIZLLL;
        if (!bDNetworkTagManagerLIZIZ2.LIZIZ.get()) {
            bDNetworkTagManagerLIZIZ2.LIZ.LIZ(i);
        }
    }
}
