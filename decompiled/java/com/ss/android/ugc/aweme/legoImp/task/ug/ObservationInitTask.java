package com.ss.android.ugc.aweme.legoImp.task.ug;

import X.C01GW;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1514430pVp;
import X.C19251510Th;
import X.C19251610Ti;
import X.C452501pT;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC19251410Tg;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.newusermode.INewUserModeService;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class ObservationInitTask implements C0CCZ, InterfaceC799590VYf {
    public final C01GW LL = C452501pT.LIZIZ(new C19251510Th());
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C19251610Ti());

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ObservationInitTask";
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
    public final /* synthetic */ int priority() {
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
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (C1514430pVp.LIZLLL().booleanValue()) {
            Iterator it2 = ((List) this.LL.getValue()).iterator();
            while (it2.hasNext()) {
                ((InterfaceC19251410Tg) it2.next()).run();
            }
        }
        INewUserModeService iNewUserModeService = (INewUserModeService) PluggableExtentionKt.pluggableSpi$default(INewUserModeService.class, false, false, false, 14, null);
        if (iNewUserModeService != null && iNewUserModeService.LIZIZ()) {
            return;
        }
        Iterator it3 = ((List) this.LLILLJJLI.getValue()).iterator();
        while (it3.hasNext()) {
            ((InterfaceC19251410Tg) it3.next()).run();
        }
    }
}
