package com.ss.android.ugc.aweme.benchmark;

import X.C09GA;
import X.C0CCZ;
import X.C0VSJ;
import X.C0VU1;
import X.C0VZ0;
import X.C1449640npK;
import X.C1655580tBU;
import X.C20684815ws;
import X.C212350188e;
import X.C21308918aF;
import X.C21309018aG;
import X.C21309218aI;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1294060jmO;
import X.InterfaceC21309318aJ;
import X.InterfaceC799590VYf;
import android.content.Context;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class BenchmarkInitRequest implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public /* bridge */ /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public String key() {
        return "BenchmarkInitRequest";
    }

    @Override // X.InterfaceC799590VYf
    public /* bridge */ /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public /* bridge */ /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public /* bridge */ /* synthetic */ int priority() {
        return 1;
    }

    @Override // X.C0CCZ
    @InterfaceC1294060jmO
    public /* bridge */ /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public /* bridge */ /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    private final String getWordSpace() {
        String path;
        if (C1655580tBU.LIZ()) {
            C844470XAv.LIZ.getClass();
            path = null;
            File fileY2 = C786410Ut5.y2(C844470XAv.LIZ(), null);
            if (fileY2 != null) {
                path = fileY2.getPath();
            }
        } else {
            path = C1449640npK.LIZ;
        }
        return new C0VSJ(path, "bytebench").getAbsolutePath();
    }

    private final void initStrategy() {
        C212350188e c212350188eLIZJ = C212350188e.LIZJ();
        C844470XAv.LIZ.getClass();
        C09GA c09gaLIZIZ = c212350188eLIZJ.LIZIZ(C844470XAv.LJIIJ);
        C21309018aG c21309018aG = new C21309018aG();
        c21309018aG.LIZ = "a5fafb0vf8ba061000qzbwg0irxc02afaf4";
        c21309018aG.LIZIZ = "00qzdilcy900ojjtxy674bozlqmt0yja";
        c21309018aG.LIZJ = 1233;
        c09gaLIZIZ.LJ(new C21308918aF(c21309018aG));
    }

    @Override // X.InterfaceC799590VYf
    public C0VU1 threadType() {
        return C0VU1.IO;
    }

    @Override // X.C0CCZ
    public EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public void run(Context context) {
        C21309218aI.LIZ = new AnonymousClass1();
        initStrategy();
        new BenckmarkCollection().run(context);
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.benchmark.BenchmarkInitRequest$run$1, reason: invalid class name */
    public final class AnonymousClass1 implements InterfaceC21309318aJ {
        @Override // X.InterfaceC21309318aJ
        public boolean isHitSample(String str, float f) {
            return C20684815ws.LJI(str);
        }
    }
}
