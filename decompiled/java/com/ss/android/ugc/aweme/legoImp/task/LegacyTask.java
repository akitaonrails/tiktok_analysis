package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0CPH;
import X.C0VZ0;
import X.C2203431BLp;
import X.C799900VZk;
import X.C827070WcT;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.app.Application;
import android.content.Context;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoCheckInRequest;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoHighPriorityCheckInRequest;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class LegacyTask implements C0CCZ {
    public Application LL;
    public boolean LLILLJJLI;
    public String LLILLL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "LegacyTask";
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

    public LegacyTask() {
        C827070WcT.LIZ.getClass();
        this.LLILLL = C827070WcT.LIZJ();
    }

    public class DeviceIdChangeTask implements C0CCZ {
        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ List finalizedBy() {
            return null;
        }

        @Override // X.InterfaceC800080Va2
        public final String key() {
            return "LegacyTask$DeviceIdChangeTask";
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
            return EnumC799870VZh.BOOT_FINISH;
        }

        @Override // X.InterfaceC308150C6b
        public final void run(Context context) {
            C799900VZk.LIZ.getClass();
            C0CPH c0cph = new C0CPH();
            c0cph.LIZ(new GeckoHighPriorityCheckInRequest());
            c0cph.LIZ(new GeckoCheckInRequest());
            c0cph.LIZIZ();
            C2203431BLp.LIZIZ.LJ("did_change");
        }
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC308150C6b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run(android.content.Context r9) {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.LegacyTask.run(android.content.Context):void");
    }
}
