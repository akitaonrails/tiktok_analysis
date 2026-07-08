package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C1059990dgr;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.services.MainServiceForJsb;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class SetupMainServiceForJsb implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "SetupMainServiceForJsb";
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
        return 16777215;
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
        MainServiceForJsb mainServiceForJsb = new MainServiceForJsb();
        synchronized (C1059990dgr.class) {
            C1059990dgr c1059990dgr = C1059990dgr.LIZIZ;
            if (c1059990dgr == null) {
                C1059990dgr.LIZIZ = new C1059990dgr(mainServiceForJsb);
            } else {
                c1059990dgr.LIZ = mainServiceForJsb;
            }
        }
    }
}
