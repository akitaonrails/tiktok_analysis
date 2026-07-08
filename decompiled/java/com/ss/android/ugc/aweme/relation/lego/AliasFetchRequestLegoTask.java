package com.ss.android.ugc.aweme.relation.lego;

import X.AnonymousClass0956;
import X.C054G;
import X.C099G;
import X.C09A1;
import X.C0CO3;
import X.C0PEM;
import X.C0VU1;
import X.C1514430pVp;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C343230Dcv;
import X.C372601ca;
import X.C372701cb;
import X.C800010VZv;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import X.InterfaceC800130Va7;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class AliasFetchRequestLegoTask implements InterfaceC800130Va7, InterfaceC799590VYf {
    public AnonymousClass0956 LL;
    public final C054G LLILLJJLI = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AliasFetchRequestLegoTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return 2;
    }

    @Override // X.InterfaceC308150C6b
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C800010VZv.LIZIZ(this);
    }

    @Override // X.InterfaceC799590VYf
    public final int level() {
        C1514430pVp.LIZLLL().booleanValue();
        return 1;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.InterfaceC800130Va7
    public final C0CO3 type() {
        return C0CO3.BOOT_FINISH;
    }

    @Override // X.InterfaceC800130Va7
    public final void LJI(Context context, boolean z) {
        if (C343230Dcv.LIZ()) {
            C099G c099gLIZIZ = C23250099c.LIZIZ(this.LLILLJJLI, null, null, new C372701cb(null), 3);
            AnonymousClass0956 anonymousClass0956 = this.LL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LL = C23250099c.LIZLLL(this.LLILLJJLI, null, null, new C372601ca(c099gLIZIZ, null), 3);
        }
    }
}
