package com.bytedance.ies.ugc.appcontext.compact.task;

import X.C04TD;
import X.C08EH;
import X.C0CCZ;
import X.C0VZ0;
import X.C2206141BWa;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC844480XAw;
import android.app.Application;
import android.content.Context;
import com.bytedance.ies.ugc.appcontext.launch.AppContextCompactIniterImpl;
import com.bytedance.ies.ugc.appcontext.task.InitAppContextTask;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class AppContextCompactInitTask implements C0CCZ {
    public final Application LL;
    public final InterfaceC844480XAw LLILLJJLI;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AppContextCompactInitTask";
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
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        IAppContextCompactIniter iAppContextCompactIniter;
        new InitAppContextTask();
        C08EH.LIZ = this.LL;
        Object objLIZ = C04TD.LIZ(IAppContextCompactIniter.class, false);
        if (objLIZ != null) {
            iAppContextCompactIniter = (IAppContextCompactIniter) objLIZ;
        } else {
            if (C04TD.LJJIIJ == null) {
                synchronized (IAppContextCompactIniter.class) {
                    if (C04TD.LJJIIJ == null) {
                        C04TD.LJJIIJ = new AppContextCompactIniterImpl();
                    }
                }
            }
            iAppContextCompactIniter = C04TD.LJJIIJ;
        }
        iAppContextCompactIniter.LIZ(this.LL, this.LLILLJJLI);
    }

    public AppContextCompactInitTask(Application application, C2206141BWa c2206141BWa) {
        this.LL = application;
        this.LLILLJJLI = c2206141BWa;
    }
}
