package com.ss.android.ugc.aweme.request_combine.request.p0;

import X.C0CCZ;
import X.C0CD2;
import X.C0CN5;
import X.C0CNS;
import X.C0VU1;
import X.C0VZ0;
import X.C1514430pVp;
import X.C1602200rnO;
import X.C1BCA;
import X.EnumC312610CNf;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1006670cIr;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.bytedance.keva.Keva;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class FetchCombineSettingTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FetchCombineSettingTask";
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
    public final int level() {
        C1514430pVp.LIZLLL().booleanValue();
        return 1;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return C0CD2.LIZJ() == 1 ? EnumC799870VZh.FIRST_WINDOW_FOCUS : C0CD2.LIZJ() == 2 ? EnumC799870VZh.BOOT_FINISH : EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C0CD2.LIZJ();
        if (!C0CNS.LIZIZ()) {
            new FetchCombineSettingRequest().LJI(context, false);
            return;
        }
        final AwS548S0100000_4 awS548S0100000_4 = new AwS548S0100000_4(context, 197);
        int i = Keva.getRepo("plugin_repo").getInt("reinstall_check_result", -1);
        if (C0CN5.LJII() && i == 2) {
            awS548S0100000_4.invoke();
        } else {
            C1BCA.LJIJJLI(EnumC312610CNf.SATRTUP, new InterfaceC1006670cIr<C1602200rnO>() { // from class: X.0CNQ
                @Override // X.InterfaceC1006670cIr
                public final void LJIIJ(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
                    if (c1602200rnO2.LIZJ()) {
                        Function0<Unit> function0 = awS548S0100000_4;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, this);
                    }
                }
            });
        }
    }
}
