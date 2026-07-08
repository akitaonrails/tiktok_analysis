package com.tiktok.ttf.network.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C1496450p2p;
import X.C1496480p2s;
import X.C1496500p2u;
import X.EnumC1496430p2n;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.ExecutorC1497250p47;
import X.InterfaceC800080Va2;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class InitTTNetTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitTTNetTask";
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

    @Override // X.InterfaceC800080Va2
    public final List<InterfaceC800080Va2> finalizedBy() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NetworkInitTask());
        return arrayList;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C1496450p2p c1496450p2p = C1496450p2p.LIZIZ;
        EnumC1496430p2n enumC1496430p2n = EnumC1496430p2n.NETWORK_METHOD_INIT_TTNET_DURATION;
        c1496450p2p.LJIIJ(enumC1496430p2n, false);
        c1496450p2p.LJIILIIL(context);
        C1496500p2u c1496500p2u = C1496500p2u.LIZ;
        C1496480p2s c1496480p2s = new C1496480p2s() { // from class: X.0p2r
            @Override // X.C1496480p2s
            public final <T> T LIZ(Class<T> cls) {
                if (Intrinsics.LJFF(cls, InterfaceC1496590p33.class)) {
                    return (T) new InterfaceC1496590p33() { // from class: X.0p2q
                        @Override // X.InterfaceC1496590p33
                        public final int LJFF() {
                            return C1496450p2p.LIZIZ.LJFF();
                        }

                        @Override // X.InterfaceC1496590p33
                        public final long LJI() {
                            long jLJ = C1499670p81.LIZIZ.LJ();
                            if (jLJ < 1651461897000L) {
                                return 1651461897000L;
                            }
                            return jLJ;
                        }
                    };
                }
                return null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C1496480p2s
            public final void LIZIZ(C0X52 c0x52, String str, Object obj) {
                BaseResponse baseResponse;
                Map<String, Object> localExtra;
                T t = c0x52.LIZIZ;
                if ((t instanceof BaseResponse) && (baseResponse = (BaseResponse) t) != null && (localExtra = baseResponse.getLocalExtra()) != null) {
                    localExtra.put(str, obj);
                }
            }
        };
        if (C1496500p2u.LIZIZ) {
            synchronized (c1496500p2u) {
                try {
                    if (C1496500p2u.LIZIZ) {
                        C1496500p2u.LIZJ = c1496480p2s;
                        C1496500p2u.LIZIZ = false;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        ExecutorC1497250p47.LLIZ.set(true);
        c1496450p2p.LJIIJJI(context);
        c1496450p2p.LJIIJ(enumC1496430p2n, true);
    }
}
