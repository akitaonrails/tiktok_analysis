package com.ss.android.ugc.aweme.legoImp.task.allProcessTask;

import X.C0CCZ;
import X.C0VZ0;
import X.C1150504el;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.app.IInitAllService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class InitAwemeRuntime implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitAwemeRuntime";
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
        C1150504el.LIZ().LIZLLL("method_init_aweme_runtime_duration", false);
        ((IInitAllService) ServiceManager.get().getService(IInitAllService.class)).LJIIIZ();
        C1150504el.LIZ().LJI("method_init_aweme_runtime_duration", false);
    }
}
