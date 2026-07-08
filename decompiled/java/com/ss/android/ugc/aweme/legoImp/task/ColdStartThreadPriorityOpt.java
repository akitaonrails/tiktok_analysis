package com.ss.android.ugc.aweme.legoImp.task;

import X.C01GW;
import X.C0CCZ;
import X.C0VZ0;
import X.C1602860roS;
import X.C2187801Ajq;
import X.C2187891Ajz;
import X.C2188811AlT;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import android.os.Process;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class ColdStartThreadPriorityOpt implements C0CCZ {
    public final EnumC799870VZh LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ColdStartThreadPriorityOpt";
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
        return this.LL;
    }

    public ColdStartThreadPriorityOpt(EnumC799870VZh enumC799870VZh) {
        this.LL = enumC799870VZh;
        Process.myTid();
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        Thread thread;
        C1602860roS.LIZ.getClass();
        if (!C1602860roS.LJ()) {
            EnumC799870VZh enumC799870VZh = this.LL;
            if (enumC799870VZh == EnumC799870VZh.BACKGROUND) {
                C01GW c01gw = C2187891Ajz.LIZIZ;
                if (((Boolean) c01gw.getValue()).booleanValue() || ((Boolean) C2187891Ajz.LIZJ.getValue()).booleanValue() || ((Boolean) C2187891Ajz.LIZLLL.getValue()).booleanValue()) {
                    C2187801Ajq.LIZJ();
                }
                if (((Boolean) c01gw.getValue()).booleanValue()) {
                    C2187801Ajq.LJII("APM_light-weight-task");
                }
                if (((Boolean) C2187891Ajz.LIZJ.getValue()).booleanValue()) {
                    C2187801Ajq.LJII("ActionReaper");
                    C2187801Ajq.LJII("TeaThread");
                    C2187801Ajq.LJII("mdl_log_handler");
                }
                if (((Boolean) C2187891Ajz.LIZLLL.getValue()).booleanValue()) {
                    C2187801Ajq.LJI("acceleratePlayHandlerThread");
                    return;
                }
                return;
            }
            if (enumC799870VZh != EnumC799870VZh.BOOT_FINISH) {
                return;
            }
            if (((Boolean) C2187891Ajz.LIZIZ.getValue()).booleanValue()) {
                C2187801Ajq.LJIIIIZZ("APM_light-weight-task");
            }
            if (((Boolean) C2187891Ajz.LIZJ.getValue()).booleanValue()) {
                C2187801Ajq.LJIIIIZZ("ActionReaper");
                C2187801Ajq.LJIIIIZZ("TeaThread");
                C2187801Ajq.LJIIIIZZ("mdl_log_handler");
            }
            if (((Boolean) C2187891Ajz.LIZLLL.getValue()).booleanValue()) {
                C2187801Ajq.LJIIIIZZ("acceleratePlayHandlerThread");
            }
            C01GW c01gw2 = C2187891Ajz.LJII;
            if (((Boolean) c01gw2.getValue()).booleanValue() || ((Boolean) C2187891Ajz.LJFF.getValue()).booleanValue()) {
                C2187801Ajq.LIZJ();
            }
            if (((Boolean) c01gw2.getValue()).booleanValue() && (thread = (Thread) ((LinkedHashMap) C2187801Ajq.LIZIZ).get("RenderThread")) != null) {
                ThreadMethodProxy.setPriority(thread, 10);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setThreadPriorityMaxByName ");
                sbLIZ.append("RenderThread");
                sbLIZ.append(' ');
                C2188811AlT.LIZIZ(sbLIZ);
            }
            if (((Boolean) C2187891Ajz.LJFF.getValue()).booleanValue()) {
                C2187801Ajq.LJI("play_thread_0");
                C2187801Ajq.LJI("play_thread_1");
                C2187801Ajq.LJI("play_thread_2");
                C2187801Ajq.LJI("explay_thread_0");
                C2187801Ajq.LJI("explay_thread_1");
                C2187801Ajq.LJI("explay_thread_2");
                C2187801Ajq.LJI("main");
            }
            if (C2187891Ajz.LIZIZ()) {
                C2187801Ajq.LIZLLL("RenderThread");
                C2187801Ajq.LIZLLL("play_thread_0");
                C2187801Ajq.LIZLLL("play_thread_1");
                C2187801Ajq.LIZLLL("play_thread_2");
                C2187801Ajq.LIZLLL("explay_thread_0");
                C2187801Ajq.LIZLLL("explay_thread_1");
                C2187801Ajq.LIZLLL("explay_thread_2");
                C2187801Ajq.LIZLLL("main");
            }
            ((LinkedHashMap) C2187801Ajq.LIZIZ).clear();
            C2187801Ajq.LJII = false;
        }
    }
}
