package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C1AWR;
import X.C1AWS;
import X.C1AWT;
import X.C1AWV;
import X.C786410Ut5;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.lobby.internal.LobbyCore;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class LobbyInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "LobbyInitTask";
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
        new Object() { // from class: X.1AWX
        }.getClass();
        C1AWT c1awt = new C1AWT() { // from class: X.1EDq
            @Override // X.C1AWT
            public final List<C2277811EDr> LIZ() {
                C2277821EDs c2277821EDs = new C2277821EDs() { // from class: X.1EDv
                };
                c2277821EDs.LIZ = 2;
                C2277821EDs c2277821EDs2 = new C2277821EDs() { // from class: X.1EDw
                };
                c2277821EDs2.LIZ = 2;
                C833600Wn0 c833600Wn0 = new C833600Wn0();
                C786410Ut5.LJJJI("google_auth_redirect_uri", "com.googleusercontent.apps.616463764658-p01hhcj82u4mqjnp1oca04i3o67fjsm1:/oauthredirect", c833600Wn0.LIZ());
                c2277821EDs2.LIZLLL = c833600Wn0.LIZ();
                C2277821EDs c2277821EDs3 = new C2277821EDs() { // from class: X.1EDu
                };
                c2277821EDs3.LIZ = 2;
                C2277821EDs c2277821EDs4 = new C2277821EDs() { // from class: X.1EDt
                };
                c2277821EDs4.LIZ = 2;
                C2277821EDs c2277821EDs5 = new C2277821EDs() { // from class: X.1EDx
                };
                c2277821EDs5.LIZ = 2;
                return C1697810uHb.LJIILJJIL(new C2277811EDr(c2277821EDs), new C2277811EDr(c2277821EDs2), new C2277811EDr(c2277821EDs3), new C2277811EDr(c2277821EDs4), new C2277811EDr(c2277821EDs5));
            }

            @Override // X.C1AWT
            public final boolean LIZIZ() {
                return !C2206241BWk.LIZ();
            }
        };
        C1AWS c1aws = new C1AWS();
        c1aws.LIZ = C786410Ut5.N3(context);
        c1aws.LIZIZ = false;
        c1aws.LIZJ = c1awt;
        c1aws.LIZLLL = new C1AWV() { // from class: X.1AWW
            public final IPluginService LIZ = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        };
        LobbyCore.initialize(new C1AWR(c1aws));
    }
}
