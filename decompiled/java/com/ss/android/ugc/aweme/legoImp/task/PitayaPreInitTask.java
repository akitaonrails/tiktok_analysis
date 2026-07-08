package com.ss.android.ugc.aweme.legoImp.task;

import X.AnonymousClass1455;
import X.AnonymousClass1457;
import X.C0B61;
import X.C0B63;
import X.C0B64;
import X.C0B7H;
import X.C0CCZ;
import X.C0CIQ;
import X.C0CP9;
import X.C0VZ0;
import X.C10UI;
import X.C145I;
import X.C1492110ovp;
import X.C18045074x;
import X.C1BLW;
import X.C279690Axj;
import X.C279700Axk;
import X.C582560Mt4;
import X.C799900VZk;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC2203391BLl;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.pitaya.PitayaLiteModeConfig;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class PitayaPreInitTask implements C0CCZ {
    public static int LL = -1;
    public static int LLILLJJLI;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PitayaPreInitTask";
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

    public final void LIZ() {
        boolean z;
        boolean zBooleanValue = ((Boolean) C0B64.LIZ.getValue()).booleanValue();
        C799900VZk.LIZ.getClass();
        if (!C0CP9.LIZ()) {
            synchronized (C582560Mt4.LIZ) {
                z = C582560Mt4.LIZIZ;
            }
            if (!z && zBooleanValue) {
                if (LLILLJJLI < 30) {
                    C1492110ovp.LIZ("checkBootFinish", true, 500, new AwS574S0100000_30(this, 66));
                    return;
                }
                return;
            }
        }
        PitayaLiteModeConfig pitayaLiteModeConfig = new PitayaLiteModeConfig(((Number) C279700Axk.LIZ.getValue()).intValue(), Arrays.asList((Object[]) C0CIQ.LIZIZ.getValue()));
        if (!C10UI.LIZ()) {
            AnonymousClass1455.LIZ.LIZLLL("PitayaPreInitTask", pitayaLiteModeConfig, new AnonymousClass1457() { // from class: X.145L
                @Override // X.AnonymousClass1457
                public final void onFailed() {
                }

                @Override // X.AnonymousClass1457
                public final void onSuccess() {
                }
            });
            return;
        }
        IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
        if (iPluginService == null || iPluginService.LIZLLL() == null) {
            return;
        }
        C1BLW.LIZJ("com.ss.android.ugc.aweme.pitaya", new InterfaceC2203391BLl() { // from class: X.145J
            @Override // X.InterfaceC2203391BLl
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC2425409eu
            public final void LIZ(AbstractC2457909k9 abstractC2457909k9) {
                abstractC2457909k9.LJII();
            }
        });
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        int iIntValue = ((Number) C18045074x.LIZ.getValue()).intValue();
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                if (!((Boolean) C0B7H.LIZ.getValue()).booleanValue() && ((Boolean) C0B61.LIZ.getValue()).booleanValue() && ((Boolean) C0B63.LIZ.getValue()).booleanValue()) {
                    if (LL == -1) {
                        LL = ((Number) C279690Axj.LIZ.getValue()).intValue();
                    }
                    C1492110ovp.LIZ("checkBootFinish", true, Integer.valueOf(LL * LSPassThroughRecordSizeConfig.DEFAULT), new C145I(this));
                    return;
                }
                return;
            }
            AnonymousClass1455.LIZ.getClass();
            AnonymousClass1455.LIZJ();
            return;
        }
        try {
            LoadSoLancet.LIZJ("fast_engine_api");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("fast_engine_api");
            LoadSoLancet.LJ(jUptimeMillis, "fast_engine_api");
            LoadSoLancet.LIZLLL(jUptimeMillis, "fast_engine_api");
            LoadSoLancet.LIZIZ("fast_engine_api");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
