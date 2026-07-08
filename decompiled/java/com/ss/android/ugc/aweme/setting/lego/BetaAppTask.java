package com.ss.android.ugc.aweme.setting.lego;

import X.C0CCZ;
import X.C0S78;
import X.C0VZ0;
import X.C12876052c;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.google.android.play.core.appupdate.b;
import com.google.android.play.core.appupdate.c;
import java.util.List;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class BetaAppTask implements C0CCZ {
    public final b LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "BetaAppTask";
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

    public BetaAppTask() {
        C844470XAv.LIZ.getClass();
        this.LL = c.LIZ(C844470XAv.LIZ());
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return C12876052c.LIZ() != -1 ? EnumC799870VZh.BOOT_FINISH : EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C0S78.LIZJ(new AwS556S0100000_12(this, 586), true);
    }
}
