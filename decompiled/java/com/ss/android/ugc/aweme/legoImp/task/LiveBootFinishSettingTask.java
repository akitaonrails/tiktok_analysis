package com.ss.android.ugc.aweme.legoImp.task;

import X.C01GW;
import X.C0C64;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C0XE1;
import X.C0XEZ;
import X.C1619110sEf;
import X.C1788806zW;
import X.C1908480zlO;
import X.C1AKM;
import X.C2203431BLp;
import X.C259390AEn;
import X.C452501pT;
import X.C821280WJq;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20673515v3;
import X.InterfaceC799590VYf;
import Y.ARunnableS131S0100000_31;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.experiment.LiveInnerPushShowTimeExperiment;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.task.LiveBootFinishSettingTask;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class LiveBootFinishSettingTask implements C0CCZ, InterfaceC799590VYf, C0XEZ {
    public boolean LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1721));
    public final C01GW LLILLL = C452501pT.LIZIZ(new C259390AEn());

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "LiveBootFinishSettingTask";
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
        return C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "live_inner_push_downgrade", true, false) ? EnumC799870VZh.APP_BACKGROUND : EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    public final void LJ(boolean z) {
        boolean zIsLogin = ((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin();
        if (((Boolean) this.LLILLJJLI.getValue()).booleanValue() && this.LL && zIsLogin) {
            C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
            if (!c2203431BLp.isConnected()) {
                if (z) {
                    if (LiveInnerPushShowTimeExperiment.INSTANCE.enable()) {
                        c2203431BLp.LJ("live_push_init_task");
                    }
                    c2203431BLp.LIZLLL(this);
                    return;
                }
                return;
            }
            this.LL = false;
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LLFII("cold_start", new C1AKM() { // from class: X.15qH
                @Override // X.C1AKM
                public final void onFailed() {
                }

                @Override // X.C1AKM
                public final void onSuccess() {
                }
            });
        }
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        InterfaceC20673515v3 interfaceC20673515v3K42;
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).O4(!((Boolean) C1788806zW.LIZ.getValue()).booleanValue()).LJIIL();
        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        if (iLiveOuterService != null && (interfaceC20673515v3K42 = iLiveOuterService.k4()) != null) {
            interfaceC20673515v3K42.reportAbnormalLive(context);
        }
        ILiveOuterService iLiveOuterService2 = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        if (iLiveOuterService2 != null && (interfaceC20673515v3K4 = iLiveOuterService2.k4()) != null) {
            interfaceC20673515v3K4.notifyHostAppBoot();
        }
        if (((Boolean) this.LLILLJJLI.getValue()).booleanValue()) {
            C1908480zlO.LIZIZ.LJIIIIZZ(new C1619110sEf() { // from class: X.15qD
                @Override // X.C1619110sEf, X.InterfaceC20643015q8
                public final void LJII(EnumC20643215qA enumC20643215qA, boolean z) {
                    if (enumC20643215qA == EnumC20643215qA.COLD_START || enumC20643215qA == EnumC20643215qA.WARM_START || enumC20643215qA == EnumC20643215qA.ACCOUNT_LOGIN) {
                        LiveBootFinishSettingTask liveBootFinishSettingTask = this.LL;
                        liveBootFinishSettingTask.LL = true;
                        if (z) {
                            Looper looperMyLooper = Looper.myLooper();
                            if (looperMyLooper == null) {
                                looperMyLooper = Looper.getMainLooper();
                            }
                            BPEAHandler bPEAHandler = new BPEAHandler(looperMyLooper);
                            LiveBootFinishSettingTask liveBootFinishSettingTask2 = this.LL;
                            C786410Ut5.LJLIIL(((Number) liveBootFinishSettingTask2.LLILLL.getValue()).longValue(), bPEAHandler, new ARunnableS131S0100000_31(liveBootFinishSettingTask2, 64));
                            return;
                        }
                        liveBootFinishSettingTask.LJ(true);
                    }
                }
            });
        }
    }

    @Override // X.C0XEZ
    public final void LIZ(C821280WJq c821280WJq, JSONObject jSONObject) {
        if (C0XE1.CONNECTED == c821280WJq.LIZIZ) {
            LJ(false);
        }
    }
}
