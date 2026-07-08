package com.ss.android.ugc.aweme.user.lego;

import X.C0CN5;
import X.C0CO3;
import X.C0XQ7;
import X.C285090BFj;
import X.C312780CNw;
import X.C786410Ut5;
import X.C800010VZv;
import X.EnumC799980VZs;
import X.InterfaceC800130Va7;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.experiment.ColdBootTasksDegradeExperiment;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class FetchUserInfoRequest implements InterfaceC800130Va7 {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FetchUserInfoRequest";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC308150C6b
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C800010VZv.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C800010VZv.LIZIZ(this);
    }

    @Override // X.InterfaceC800130Va7
    public final C0CO3 type() {
        return ColdBootTasksDegradeExperiment.LIZ().fetchUserInfoRequest ? C0CO3.BOOT_FINISH : ((Boolean) C285090BFj.LJJJLZIJ.getValue()).booleanValue() ? C0CO3.BOOT_FINISH : C0CO3.NORMAL;
    }

    @Override // X.InterfaceC800130Va7
    public final void LJI(Context context, final boolean z) {
        boolean zLJI = MethodIDManager.LJI(137738);
        if (C0XQ7.LJFF().isLogin()) {
            if (((Boolean) C312780CNw.LIZIZ.getValue()).booleanValue()) {
                C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0CNt
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("FetchUserInfoRequest@8fa6.request$1");
                        try {
                            C0XQ7.LJFF().LJIILL();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("FetchUserInfoRequest@8fa6.request$1");
                    }
                });
            } else {
                C0XQ7.LJFF().LJIILL();
            }
            if (((Boolean) C285090BFj.LJJJLL.getValue()).booleanValue()) {
                C0CN5.LIZIZ(Long.valueOf(Mp4ScreenVideoLoadTimeout.CONTROL), new Runnable() { // from class: X.0CNs
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("FetchUserInfoRequest@8fa6.request$2");
                        try {
                            C0XQ7.LJFF().LJJIII(Boolean.valueOf(z), Boolean.FALSE);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("FetchUserInfoRequest@8fa6.request$2");
                    }
                });
            } else {
                C0XQ7.LJFF().LJJIII(Boolean.valueOf(z), Boolean.FALSE);
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
