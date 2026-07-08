package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C19EG;
import X.C2214201BlK;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1055110dYz;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ObserverTabCheckTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ObserverTabCheckTask";
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
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
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
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null && (activityLJFF instanceof C19EG)) {
            Hox.LLJILJIL.LIZ((C19EG) activityLJFF).wQ2("HOME", new InterfaceC1055110dYz() { // from class: X.0KZ0
                @Override // X.InterfaceC1583780rJg
                public final String getHoxNodeTag() {
                    return "";
                }

                @Override // X.InterfaceC1055110dYz
                public final void onNodeHide(Bundle bundle) {
                    InterfaceC519500KYy interfaceC519500KYyO4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).O4(false);
                    if (interfaceC519500KYyO4 != null) {
                        interfaceC519500KYyO4.LJIILIIL(false);
                        interfaceC519500KYyO4.LIZ("bottom_tab", false);
                    }
                }

                @Override // X.InterfaceC1055110dYz
                public final void onNodeShow(Bundle bundle) {
                    InterfaceC519500KYy interfaceC519500KYyO4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).O4(false);
                    if (interfaceC519500KYyO4 != null) {
                        interfaceC519500KYyO4.LJIILIIL(true);
                    }
                }
            });
        }
    }
}
