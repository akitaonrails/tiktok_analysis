package com.ss.android.ugc.aweme.external;

import X.C0CCZ;
import X.C0LOV;
import X.C0VZ0;
import X.C0WYG;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.airemix.api.service.IAIRemixStartupInitializer;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginService;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class AIRemixStartupInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AIRemixStartupInitTask";
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
        return EnumC799870VZh.FIRST_WINDOW_FOCUS;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        IAIRemixStartupInitializer iAIRemixStartupInitializer;
        IAIRemixStartupInitializer.LIZ.getClass();
        CreativeToolsBizPluginService.LIZ.getClass();
        CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ = C0LOV.LIZ();
        if ((creativeToolsBizPluginServiceLIZ != null && !creativeToolsBizPluginServiceLIZ.LIZ()) || (iAIRemixStartupInitializer = (IAIRemixStartupInitializer) C0WYG.LIZ(IAIRemixStartupInitializer.class, "com.ss.android.ugc.airemix.impl.startup.AIRemixStartupInitializerImpl")) == null) {
            iAIRemixStartupInitializer = new IAIRemixStartupInitializer() { // from class: X.18wZ
                @Override // com.ss.android.ugc.airemix.api.service.IAIRemixStartupInitializer
                public final void init() {
                }
            };
        }
        iAIRemixStartupInitializer.init();
    }
}
