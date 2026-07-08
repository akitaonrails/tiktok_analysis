package com.ss.android.ugc.aweme.freqcontrol.sdk;

import X.C01GW;
import X.C053W;
import X.C06R9;
import X.C06RH;
import X.C12909053j;
import X.C12912053m;
import X.C12913053n;
import X.C12914053o;
import X.C12918053s;
import X.C1419505h3;
import X.C1419705h5;
import X.C452501pT;
import X.EnumC12927054b;
import X.EnumC12928054c;
import X.EnumC12929054d;
import X.EnumC12931054f;
import X.EnumC1502105uN;
import X.InterfaceC1411705fn;
import X.InterfaceC1513805wG;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.frequencycontrol.api.IFrequencyControlService;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUFCFrequencySDKHelper;
import com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class PromptUFCFrequencySDKHelper implements IPromptUFCFrequencySDKHelper {
    public final C01GW LIZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 200));
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 202));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 199));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 201));

    public static long LIZJ() {
        InterfaceC1513805wG interfaceC1513805wG = (InterfaceC1513805wG) PluggableExtentionKt.pluggableSpiForReal(ILightInteractionPlatformService.class);
        if (interfaceC1513805wG != null && interfaceC1513805wG.LJIIJ()) {
            return System.currentTimeMillis();
        }
        IMHostApi.LIZ.getClass();
        IMHostApi iMHostApiLIZ = C1419705h5.LIZ();
        if (iMHostApiLIZ != null) {
            return iMHostApiLIZ.LIZIZ();
        }
        return -1L;
    }

    public static InterfaceC1411705fn LIZ(boolean z) {
        String key;
        int i;
        IFrequencyControlService iFrequencyControlService = (IFrequencyControlService) PluggableExtentionKt.pluggableSpiForReal(IFrequencyControlService.class);
        if (iFrequencyControlService != null) {
            if (z) {
                key = EnumC12931054f.UNIFY_CHATROOM_PROMPTS_DAILY_LIMIT_P2.getKey();
            } else {
                key = EnumC12931054f.UNIFY_CHATROOM_PROMPTS_DAILY_LIMIT_P3.getKey();
            }
            C12918053s c12918053s = new C12918053s(null, EnumC12928054c.UID, EnumC1502105uN.CHATROOM_PROMPTS, EnumC12929054d.APP, 1);
            if (z) {
                C1419505h3.LIZ.getClass();
                i = C1419505h3.LIZ().p2DailyLimit;
            } else {
                C1419505h3.LIZ.getClass();
                i = C1419505h3.LIZ().p3DailyLimit;
            }
            return iFrequencyControlService.LIZIZ(new C053W(key, c12918053s, new C12909053j(i), new C12913053n()));
        }
        return null;
    }

    public static InterfaceC1411705fn LIZIZ(boolean z) {
        String key;
        int i;
        IFrequencyControlService iFrequencyControlService = (IFrequencyControlService) PluggableExtentionKt.pluggableSpiForReal(IFrequencyControlService.class);
        if (iFrequencyControlService != null) {
            if (z) {
                key = EnumC12931054f.UNIFY_CHATROOM_PROMPTS_RECENT_LIMIT_P2.getKey();
            } else {
                key = EnumC12931054f.UNIFY_CHATROOM_PROMPTS_RECENT_LIMIT_P3.getKey();
            }
            C12918053s c12918053s = new C12918053s(null, EnumC12928054c.UID, EnumC1502105uN.CHATROOM_PROMPTS, EnumC12929054d.APP, 1);
            C12912053m c12912053m = new C12912053m(1);
            if (z) {
                C1419505h3.LIZ.getClass();
                i = C1419505h3.LIZ().p2IntervalTime;
            } else {
                C1419505h3.LIZ.getClass();
                i = C1419505h3.LIZ().p3IntervalTime;
            }
            return iFrequencyControlService.LIZIZ(new C053W(key, c12918053s, c12912053m, new C12914053o(i, EnumC12927054b.SECOND)));
        }
        return null;
    }

    public static void LIZLLL(String str) {
        IPromptUnifiedFrequencyController.LIZ.getClass();
        C06R9.LIZ().LJ(C06RH.SDK, str, "Shared", false);
    }

    public final void LJ(long j) {
        InterfaceC1411705fn interfaceC1411705fn = (InterfaceC1411705fn) this.LIZ.getValue();
        if (interfaceC1411705fn != null) {
            interfaceC1411705fn.LIZJ("");
        }
        InterfaceC1411705fn interfaceC1411705fn2 = (InterfaceC1411705fn) this.LIZIZ.getValue();
        if (interfaceC1411705fn2 != null) {
            interfaceC1411705fn2.LIZJ("");
        }
        InterfaceC1411705fn interfaceC1411705fn3 = (InterfaceC1411705fn) this.LIZ.getValue();
        if (interfaceC1411705fn3 != null) {
            interfaceC1411705fn3.LIZLLL(j, j, "");
        }
        InterfaceC1411705fn interfaceC1411705fn4 = (InterfaceC1411705fn) this.LIZIZ.getValue();
        if (interfaceC1411705fn4 != null) {
            interfaceC1411705fn4.LIZLLL(j, j, "");
        }
    }
}
