package com.ss.android.ugc.aweme.legoImp.task.observer_task;

import X.AbstractC826920WcE;
import X.C05GY;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class EventTrackingConsentListenerInitTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "EventTrackingConsentListenerInitTask";
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
        C05GY.LIZIZ(ComplianceServiceProvider.LJIILJJIL().LJII(null));
        ComplianceServiceProvider.LJIILJJIL().LJIIJJI(new AbstractC826920WcE() { // from class: X.14BP
            @Override // X.InterfaceC1915870zxJ
            public final void LIZ(EnumC1876780ywG enumC1876780ywG) {
                boolean z;
                if (EnumC1876780ywG.APPROVE == enumC1876780ywG) {
                    z = true;
                } else {
                    z = false;
                }
                C05GY.LIZIZ(z);
            }
        });
    }
}
