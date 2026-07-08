package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC304970BxP;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMusicPublishBridgeService;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class BusinessAccountTask implements C0CCZ, InterfaceC799590VYf {
    public final String LL = "app_launch";
    public final String LLILLJJLI = "ab_configuration";

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "BusinessAccountTask";
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
    public final int priority() {
        return 2;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
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
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        ((IMusicPublishBridgeService) ServiceManager.get().getService(IMusicPublishBridgeService.class)).requestBusinessAccountType(this.LL);
        SettingsManager.LIZLLL().LJIIIZ(new InterfaceC304970BxP() { // from class: X.14fg
            @Override // X.InterfaceC304970BxP
            public final void LIZ() {
                ((IMusicPublishBridgeService) ServiceManager.get().getService(IMusicPublishBridgeService.class)).requestBusinessAccountType(this.LL.LLILLJJLI);
            }
        });
    }
}
