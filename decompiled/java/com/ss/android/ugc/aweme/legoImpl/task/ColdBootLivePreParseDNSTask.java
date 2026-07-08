package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1514430pVp;
import X.C2407009bw;
import X.C305930Byx;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ColdBootLivePreParseDNSTask implements C0CCZ, InterfaceC799590VYf {
    public static final ColdBootLivePreParseDNSTask LL = new ColdBootLivePreParseDNSTask();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ColdBootLivePreParseDNSTask";
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

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return ((Boolean) C305930Byx.LIZ.getValue()).booleanValue() ? 2 : 1;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return ((Boolean) C305930Byx.LIZ.getValue()).booleanValue() ? EnumC799870VZh.BOOT_FINISH : EnumC799870VZh.BACKGROUND;
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

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C2407009bw.LIZ();
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).W5();
    }
}
