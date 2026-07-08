package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0CD2;
import X.C0VZ0;
import X.C0WQX;
import X.C1150504el;
import X.C1189704l5;
import X.C19489211Ms;
import X.C2126108Up;
import X.C302820Btw;
import X.C810560Vqw;
import X.C823050WQl;
import X.C823060WQm;
import X.C823070WQn;
import X.C823110WQr;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1487280oo2;
import X.InterfaceC823030WQj;
import X.RunnableC823120WQs;
import Y.ARunnableS88S0000000_9;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class ThreadPoolInjectTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ThreadPoolInjectTask";
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
        C1150504el.LIZ().LIZLLL("method_thread_pool_inject_duration", false);
        if (!((Boolean) C0CD2.LJIIIZ.getValue()).booleanValue()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(C0WQX.IO);
            arrayList.add(C0WQX.DEFAULT);
            arrayList.add(C0WQX.SERIAL);
            arrayList.add(C0WQX.BACKGROUND);
            C823070WQn c823070WQn = new C823070WQn();
            c823070WQn.LIZ = false;
            c823070WQn.LIZIZ = arrayList;
            List<String> list = C1189704l5.LIZ;
            C823060WQm.LIZ(list);
            c823070WQn.LIZJ = list;
            TimeUnit timeUnit = TimeUnit.MINUTES;
            long millis = timeUnit.toMillis(5L);
            C823060WQm.LIZIZ(millis);
            c823070WQn.LIZLLL = millis;
            long millis2 = timeUnit.toMillis(5L);
            C823060WQm.LIZIZ(millis2);
            c823070WQn.LJ = millis2;
            long millis3 = timeUnit.toMillis(15L);
            C823060WQm.LIZIZ(millis3);
            c823070WQn.LJFF = millis3;
            C823050WQl.LIZ = new C823060WQm(c823070WQn);
        }
        if (!C302820Btw.LIZ()) {
            C823050WQl.LIZIZ = new InterfaceC823030WQj() { // from class: X.0WQp
                @Override // X.InterfaceC823030WQj
                public final boolean LIZ() {
                    return C791900V4q.LIZ("task_execute_timeout");
                }

                @Override // X.InterfaceC823030WQj
                public final boolean LIZIZ() {
                    return C791900V4q.LIZ("task_rejected");
                }

                @Override // X.InterfaceC823030WQj
                public final boolean LJ() {
                    return C791900V4q.LIZ("task_blocked");
                }

                @Override // X.InterfaceC823030WQj
                public final boolean LJI() {
                    return C791900V4q.LIZ("task_wait_timeout");
                }

                @Override // X.InterfaceC823030WQj
                public final void LIZJ(JSONObject jSONObject) {
                    C794240VDq.LIZJ("task_wait_timeout", jSONObject);
                }

                @Override // X.InterfaceC823030WQj
                public final void LIZLLL(JSONObject jSONObject) {
                    C794240VDq.LIZJ("task_blocked", jSONObject);
                }

                @Override // X.InterfaceC823030WQj
                public final void LJFF(JSONObject jSONObject) {
                    C794240VDq.LIZJ("task_rejected", jSONObject);
                }

                @Override // X.InterfaceC823030WQj
                public final void LJII(JSONObject jSONObject) {
                    C794240VDq.LIZJ("task_execute_timeout", jSONObject);
                }
            };
        }
        C823110WQr.LIZ = C823050WQl.LIZLLL();
        C810560Vqw.LJ(new ARunnableS88S0000000_9(26));
        ExecutorService executorServiceLIZLLL = C823050WQl.LIZLLL();
        RunnableC823120WQs.LLILLL = executorServiceLIZLLL;
        RunnableC823120WQs.LLILZ = executorServiceLIZLLL;
        C2126108Up.LIZ = C823050WQl.LIZJ();
        C19489211Ms.LIZIZ = new InterfaceC1487280oo2() { // from class: X.08hK
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                ExecutorService executorServiceLIZLLL2 = C823050WQl.LIZLLL();
                C11RO c11ro = C11S5.LIZ;
                return new C19501611Rm(executorServiceLIZLLL2);
            }
        };
        C1150504el.LIZ().LJI("method_thread_pool_inject_duration", false);
    }
}
