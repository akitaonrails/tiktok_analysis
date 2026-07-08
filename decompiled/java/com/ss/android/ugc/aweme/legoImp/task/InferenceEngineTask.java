package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C1491980ovc;
import X.C1491990ovd;
import X.C1492120ovq;
import X.EnumC1492100ovo;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import Y.AObjectS73S0000000_23;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inferenceengine.IInferenceEngineService;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class InferenceEngineTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InferenceEngineTask";
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
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        ((IInferenceEngineService) ServiceManager.get().getService(IInferenceEngineService.class)).init(context);
        AObjectS73S0000000_23 aObjectS73S0000000_23 = new AObjectS73S0000000_23(6);
        C1491980ovc.LIZ.LIZ(new C1491990ovd("Portrait_init", true, EnumC1492100ovo.ASYNC, 2), null, new C1492120ovq(aObjectS73S0000000_23));
    }
}
