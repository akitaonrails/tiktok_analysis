package com.ss.android.ugc.aweme.notice.api.lego;

import X.C09JN;
import X.C0CCZ;
import X.C0VZ0;
import X.C0X4D;
import X.C1906580ziK;
import X.C19212010Ec;
import X.C799570VYd;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class InitNoticeTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitNoticeTask";
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

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C0X4D.LIZ.getClass();
        if (!C0X4D.LIZIZ) {
            C1906580ziK.LIZJ().LJIIIZ().LJJLJLI(C0X4D.LIZLLL);
            C1906580ziK.LIZJ().LJIIJ().LJJLJLI(C0X4D.LJ);
            C1906580ziK.LIZJ().LJIIIIZZ().LJJLJLI(new C09JN() { // from class: X.0X46
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("NoticeCountFetchManager@b197.init$1");
                    C0X4D.LIZLLL.LL = true;
                    C1C7U.LIZIZ("NoticeCountFetchManager@b197.init$1");
                }
            });
            C799570VYd.LJFF(false).execute(new Runnable() { // from class: X.0Vyo
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("NoticeCountFetchManager@b197.init$2");
                    try {
                        C622680Oba.LIZJ(C0X4D.LIZ);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("NoticeCountFetchManager@b197.init$2");
                }
            });
            C0X4D.LIZIZ = true;
        }
        C19212010Ec.LIZJ.LLF();
    }
}
