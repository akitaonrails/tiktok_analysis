package com.ss.android.ugc.aweme.requesttask.idle;

import X.C0C64;
import X.C0CCZ;
import X.C0VZ0;
import X.C786410Ut5;
import X.C799570VYd;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.ml.api.IClientAIStrategyCenterService;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class CAITTMStrategyCenterRequest implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "CAITTMStrategyCenterRequest";
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
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        long jLJIJJ = C0C64.LJIILLIIL().LJIJJ(31744, 2, true, "client_ai_request_delay_time", 0L);
        if (jLJIJJ > 0) {
            C786410Ut5.LJLIIL(jLJIJJ, C799570VYd.LIZIZ(), new Runnable() { // from class: X.0CFZ
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CAITTMStrategyCenterRequest@2659.run$1");
                    try {
                        IClientAIStrategyCenterService iClientAIStrategyCenterService = (IClientAIStrategyCenterService) PluggableExtentionKt.pluggableSpi$default(IClientAIStrategyCenterService.class, false, false, false, 14, null);
                        if (iClientAIStrategyCenterService != null) {
                            iClientAIStrategyCenterService.LIZ();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CAITTMStrategyCenterRequest@2659.run$1");
                }
            });
            return;
        }
        IClientAIStrategyCenterService iClientAIStrategyCenterService = (IClientAIStrategyCenterService) PluggableExtentionKt.pluggableSpi$default(IClientAIStrategyCenterService.class, false, false, false, 14, null);
        if (iClientAIStrategyCenterService == null) {
            return;
        }
        iClientAIStrategyCenterService.LIZ();
    }
}
