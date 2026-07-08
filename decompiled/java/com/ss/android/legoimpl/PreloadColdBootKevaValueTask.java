package com.ss.android.legoimpl;

import X.C0CCZ;
import X.C0CD2;
import X.C0CM3;
import X.C0CME;
import X.C0CMJ;
import X.C0VU1;
import X.C0VZ0;
import X.C1602200rnO;
import X.C1BCA;
import X.C309220CAe;
import X.C312240CLu;
import X.EnumC309240CAg;
import X.EnumC312610CNf;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1006670cIr;
import X.InterfaceC20234614Fk;
import X.InterfaceC799590VYf;
import Y.AObjectS380S0100000_4;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC20234614Fk
public class PreloadColdBootKevaValueTask implements C0CCZ, InterfaceC799590VYf, InterfaceC1006670cIr<C1602200rnO> {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PreloadColdBootKevaValueTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
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

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return ((Boolean) C0CD2.LJJJZ.getValue()).booleanValue();
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
        EnumC309240CAg enumC309240CAg = EnumC309240CAg.KV;
        C309220CAe.LJ(enumC309240CAg, "cold_boot_keva_v2");
        C309220CAe.LIZJ(enumC309240CAg, "cold_boot_keva_v2");
        C1BCA.LJIJJLI(EnumC312610CNf.SATRTUP, this);
        C312240CLu.LIZ(new C0CM3(C0CMJ.HIGH_PRIORITY.getType(), C0CME.FIRST_VIDEO_SHOW, "", new AObjectS380S0100000_4(this, 0), true));
    }

    @Override // X.InterfaceC1006670cIr
    public final void LJIIJ(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
        if (c1602200rnO2.LIZJ()) {
            C309220CAe.LIZIZ(EnumC309240CAg.KV, "cold_boot_keva_v2");
        }
    }
}
