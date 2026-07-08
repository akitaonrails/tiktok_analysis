package com.ss.android.ugc.aweme.compliance.privacy.sdk;

import X.AnonymousClass1057;
import X.C0CCZ;
import X.C0VZ0;
import X.C103A;
import X.C105S;
import X.C1207604ny;
import X.C191819102n;
import X.C191821102p;
import X.C191880104w;
import X.C19334210kW;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class SdkLaunchTask implements C0CCZ {
    public final C191880104w LL = C191821102p.LIZIZ();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "SdkLaunchTask";
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
        return EnumC799870VZh.BACKGROUND;
    }

    public final void LIZ(String str) {
        if (C1207604ny.LIZ()) {
            C191880104w.LJFF(this.LL, str);
            return;
        }
        this.LL.getClass();
        C191880104w.LIZIZ(str, null);
        this.LL.getClass();
        C191880104w.LIZLLL(str, null, true);
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        boolean zLJI = MethodIDManager.LJI(196670);
        AnonymousClass1057.LIZ.getClass();
        C191819102n.LIZ.getClass();
        if (C191819102n.LIZJ()) {
            C105S.LIZ.LIZ(System.currentTimeMillis());
        }
        if (C191819102n.LIZJ()) {
            LIZ("app_launch");
        }
        C103A.LIZJ(null, "app_launch", null, null);
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(new C19334210kW(this, 0));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
