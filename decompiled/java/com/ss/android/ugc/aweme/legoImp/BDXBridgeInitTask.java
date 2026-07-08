package com.ss.android.ugc.aweme.legoImp;

import X.C0CCZ;
import X.C0VZ0;
import X.C1063910dnB;
import X.C1543410qGZ;
import X.C1544010qHX;
import X.C1544100qHg;
import X.C1544110qHh;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1297560js2;
import android.content.Context;
import com.ss.android.ugc.aweme.settings.SparkLynxBridgeThreadDispatcherSettings;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class BDXBridgeInitTask implements C0CCZ {
    public final EnumC799870VZh LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "BDXBridgeInitTask";
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
        return this.LL;
    }

    public BDXBridgeInitTask(EnumC799870VZh enumC799870VZh) {
        this.LL = enumC799870VZh;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C1544100qHg.LIZ.getClass();
        if (C1544100qHg.LIZLLL) {
            return;
        }
        C1544010qHX.LIZ.getClass();
        C1544010qHX.LIZLLL();
        C1544010qHX.LIZ();
        if (SparkLynxBridgeThreadDispatcherSettings.LIZ().enable) {
            InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
            C1543410qGZ.LJIIL = new C1544110qHh();
        }
        C1544010qHX.LIZIZ();
        C1544010qHX.LIZJ();
        C1063910dnB.LIZ("true", "BDXBridgeInitTask_finish");
    }
}
