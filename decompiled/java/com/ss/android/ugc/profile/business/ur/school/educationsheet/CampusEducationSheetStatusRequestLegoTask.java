package com.ss.android.ugc.profile.business.ur.school.educationsheet;

import X.C0CO3;
import X.C0VU1;
import X.C0XQ7;
import X.C1246160iX8;
import X.C2165208e2;
import X.C2165508e5;
import X.C2165608e6;
import X.C23250099c;
import X.C800010VZv;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import X.InterfaceC800130Va7;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class CampusEducationSheetStatusRequestLegoTask implements InterfaceC800130Va7, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "CampusEducationSheetStatusRequestLegoTask";
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

    @Override // X.InterfaceC308150C6b
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C800010VZv.LIZIZ(this);
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.InterfaceC800130Va7
    public final C0CO3 type() {
        return C0CO3.BOOT_FINISH;
    }

    @Override // X.InterfaceC800130Va7
    public final void LJI(Context context, boolean z) {
        if (C1246160iX8.LIZ() && ((Number) C2165608e6.LIZ.getValue()).intValue() != 0) {
            C2165508e5.LIZ.getClass();
            if (!C2165508e5.LIZIZ.getAndSet(true)) {
                C0XQ7.LJ();
                C0XQ7.LIZ.LJIILL(C2165508e5.LJFF);
                C23250099c.LIZLLL(C2165508e5.LJ, null, null, new C2165208e2(null), 3);
            }
        }
    }
}
