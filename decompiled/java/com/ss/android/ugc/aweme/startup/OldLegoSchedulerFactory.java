package com.ss.android.ugc.aweme.startup;

import X.C0CCZ;
import X.C0VZ0;
import X.C1BY3;
import X.C2206521BXm;
import X.C2206651BXz;
import X.C799890VZj;
import X.C799900VZk;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC2206491BXj;
import X.InterfaceC2206501BXk;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.lego.wrapper.IBootFinishTaskConfig;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class OldLegoSchedulerFactory implements InterfaceC2206491BXj {
    @Override // X.InterfaceC2206491BXj
    public final InterfaceC2206501BXk create() {
        return new InterfaceC2206501BXk() { // from class: com.ss.android.ugc.aweme.startup.OldLegoSchedulerFactory.create.1
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.InterfaceC2206501BXk
            public final void LIZ(final C1BY3 c1by3, final C2206651BXz c2206651BXz) {
                IBootFinishTaskConfig iBootFinishTaskConfig;
                IBootFinishTaskConfig iBootFinishTaskConfig2;
                IBootFinishTaskConfig iBootFinishTaskConfig3;
                IBootFinishTaskConfig iBootFinishTaskConfig4;
                String str = c2206651BXz.LIZJ;
                if (str != null) {
                    switch (str.hashCode()) {
                        case 2528:
                            if (str.equals("P0") && (iBootFinishTaskConfig = (IBootFinishTaskConfig) PluggableExtentionKt.pluggableSpi$default(IBootFinishTaskConfig.class, false, false, false, 14, null)) != null) {
                                iBootFinishTaskConfig.LIZ(c2206651BXz.LIZLLL);
                            }
                            break;
                        case 2529:
                            if (str.equals("P1") && (iBootFinishTaskConfig2 = (IBootFinishTaskConfig) PluggableExtentionKt.pluggableSpi$default(IBootFinishTaskConfig.class, false, false, false, 14, null)) != null) {
                                iBootFinishTaskConfig2.LJI(c2206651BXz.LIZLLL);
                            }
                            break;
                        case 2530:
                            if (str.equals("P2") && (iBootFinishTaskConfig3 = (IBootFinishTaskConfig) PluggableExtentionKt.pluggableSpi$default(IBootFinishTaskConfig.class, false, false, false, 14, null)) != null) {
                                iBootFinishTaskConfig3.LIZJ(c2206651BXz.LIZLLL);
                            }
                            break;
                        case 2531:
                            if (str.equals("P3") && (iBootFinishTaskConfig4 = (IBootFinishTaskConfig) PluggableExtentionKt.pluggableSpi$default(IBootFinishTaskConfig.class, false, false, false, 14, null)) != null) {
                                iBootFinishTaskConfig4.LJ(c2206651BXz.LIZLLL);
                            }
                            break;
                    }
                }
                C799900VZk.LIZ.getClass();
                C799890VZj c799890VZj = new C799890VZj();
                c799890VZj.LIZ(new C0CCZ() { // from class: com.ss.android.ugc.aweme.startup.OldLegoSchedulerFactory$create$1$schedule$1
                    @Override // X.InterfaceC800080Va2
                    public final /* synthetic */ List finalizedBy() {
                        return null;
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

                    @Override // X.InterfaceC800080Va2
                    public final String key() {
                        return c2206651BXz.LIZLLL;
                    }

                    @Override // X.C0CCZ
                    public final EnumC799870VZh type() {
                        return EnumC799870VZh.BOOT_FINISH;
                    }

                    @Override // X.InterfaceC308150C6b
                    public final void run(Context context) {
                        ((C2206521BXm) c1by3).LIZJ(c2206651BXz);
                    }
                });
                c799890VZj.LIZIZ();
            }
        };
    }
}
