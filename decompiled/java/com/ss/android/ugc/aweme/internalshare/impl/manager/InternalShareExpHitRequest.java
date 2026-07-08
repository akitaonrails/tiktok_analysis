package com.ss.android.ugc.aweme.internalshare.impl.manager;

import X.C0CO3;
import X.C0PEM;
import X.C1472705pd;
import X.C2296808zG;
import X.C23250099c;
import X.C800010VZv;
import X.EnumC799980VZs;
import X.InterfaceC800130Va7;
import android.content.Context;
import com.google.gson.Gson;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class InternalShareExpHitRequest implements InterfaceC800130Va7 {
    public final Gson LL = new Gson();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InternalShareExpHitRequest";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC308150C6b
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C800010VZv.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C800010VZv.LIZIZ(this);
    }

    @Override // X.InterfaceC800130Va7
    public final C0CO3 type() {
        return C0CO3.BOOT_FINISH;
    }

    @Override // X.InterfaceC800130Va7
    public final void LJI(Context context, boolean z) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1472705pd(this, null), 3);
    }
}
