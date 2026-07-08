package com.ss.android.ugc.aweme.ttkvideoplayer;

import X.C1479100oaq;
import X.C1479110oar;
import X.C741820T8a;
import X.EnumC1483050ohD;
import X.InterfaceC1478200oZO;
import Y.ARunnableS88S0000000_9;
import Y.ARunnableS98S0000000_23;
import com.ss.android.ugc.aweme.video.simkit.SimKitConfigImpl;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes24.dex */
public class StrategyCenterService implements InterfaceC1478200oZO {
    public final C741820T8a LIZ = new C741820T8a();

    @Override // X.InterfaceC1478200oZO
    public final C741820T8a LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1478200oZO
    public final void LIZIZ(SimKitConfigImpl simKitConfigImpl) {
        C1479100oaq c1479100oaq = C1479110oar.LIZ;
        c1479100oaq.LIZ = simKitConfigImpl;
        EnumC1483050ohD enumC1483050ohD = EnumC1483050ohD.INS;
        enumC1483050ohD.init();
        if (c1479100oaq.LIZ.getAdaptiveRuleConfig().LIZIZ) {
            enumC1483050ohD.post(new ARunnableS88S0000000_9(0));
        }
        if (c1479100oaq.LIZ.getAdaptiveRuleConfig().LIZ) {
            enumC1483050ohD.postDelay(new ARunnableS98S0000000_23(0), r1.LJ, TimeUnit.SECONDS);
        }
    }
}
