package com.ss.android.ugc.aweme.compliance.consent.deviceconsent.config;

import X.C0CM3;
import X.C0CME;
import X.C0CMJ;
import X.C0VU1;
import X.C1514430pVp;
import X.C294580Bge;
import X.C312240CLu;
import X.EnumC799870VZh;
import X.InterfaceC799590VYf;
import android.content.Context;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class DelayedConsentConfigInitTask extends AbstractConsentConfigInitTask implements InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "DelayedConsentConfigInitTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
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
        if (C1514430pVp.LIZLLL().booleanValue() || !C294580Bge.LIZ()) {
            return;
        }
        C312240CLu.LIZ(new C0CM3(C0CMJ.NORMAL_PRIORITY.getType(), C0CME.FIRST_UI_FRAME, "", new AwS572S0100000_28(this, 162), true));
    }
}
