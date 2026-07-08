package com.ss.android.ugc.aweme.integrate.bootlog;

import X.C0CCZ;
import X.C0VZ0;
import X.C1336210ksN;
import X.C15O7;
import X.C20684815ws;
import X.C321540Cj2;
import X.C798480VTy;
import X.C799890VZj;
import X.C799900VZk;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.BootLogInitializer;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class BootLogInitializerImpl implements BootLogInitializer {
    @Override // com.ss.android.ugc.aweme.BootLogInitializer
    public final boolean LIZIZ() {
        return C1336210ksN.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.BootLogInitializer
    public final void LIZ(final Function0<Unit> function0) {
        C799900VZk.LIZ.getClass();
        C799890VZj c799890VZj = new C799890VZj();
        c799890VZj.LIZ(new C0CCZ() { // from class: com.ss.android.ugc.aweme.integrate.bootlog.BootLogInitializerImpl$addBackGroundLegoTask$1
            @Override // X.InterfaceC800080Va2
            public final /* synthetic */ List finalizedBy() {
                return null;
            }

            @Override // X.InterfaceC800080Va2
            public final String key() {
                return "BootLogInitializerImpl$addBackGroundLegoTask$1";
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
                return EnumC799870VZh.BACKGROUND;
            }

            @Override // X.InterfaceC308150C6b
            public final void run(Context context) {
                function0.invoke();
            }
        });
        c799890VZj.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.BootLogInitializer
    public final void LIZJ(final Map map, final C321540Cj2 c321540Cj2, final C798480VTy c798480VTy) {
        C15O7.LIZIZ(new Callable() { // from class: X.087h
            public final /* synthetic */ String LLILLJJLI = "prf_zero_video_view";

            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("BootLogInitializerImpl@f390.onAsyncEvent$1");
                try {
                    c321540Cj2.invoke();
                    C20684815ws.LJIILLIIL(this.LLILLJJLI, map);
                    c798480VTy.invoke();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BootLogInitializerImpl@f390.onAsyncEvent$1");
                return unit;
            }
        }, C20684815ws.LJFF(), null);
    }
}
