package com.ss.android.ugc.aweme.legoImp.task;

import X.AbstractC842290X2l;
import X.C0CCZ;
import X.C0VZ0;
import X.C1150504el;
import X.C1496480p2s;
import X.C1496500p2u;
import X.C842940X4y;
import X.C844470XAv;
import X.C846280XHu;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.ExecutorC1497250p47;
import X.InterfaceC1294060jmO;
import X.InterfaceC800080Va2;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.IFeedStrategyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.net.NetworkInitTask;
import com.ss.android.ugc.aweme.setting.IDataSaverSettingApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
@InterfaceC1294060jmO
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
        IFeedStrategyService iFeedStrategyService = (IFeedStrategyService) PluggableExtentionKt.pluggableSpi$default(IFeedStrategyService.class, false, false, false, 14, null);
        if (iFeedStrategyService != null) {
            iFeedStrategyService.LIZJ();
        }
        C1150504el.LIZ().LIZLLL("method_init_ttnet_duration", false);
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        C846280XHu.LIZ = new C842940X4y();
        AbstractC842290X2l.LIZ = new AbstractC842290X2l() { // from class: X.0X2m
            @Override // X.AbstractC842290X2l
            public final void LIZ() {
                C0CO1.LIZ().LIZJ();
            }
        };
        C1496500p2u c1496500p2u = C1496500p2u.LIZ;
        C1496480p2s c1496480p2s = new C1496480p2s() { // from class: X.0p2v
            @Override // X.C1496480p2s
            public final <T> T LIZ(Class<T> cls) {
                if (Intrinsics.LJFF(cls, InterfaceC1496590p33.class)) {
                    return (T) new InterfaceC1496590p33() { // from class: X.0p2x
                        @Override // X.InterfaceC1496590p33
                        public final int LJFF() {
                            IDataSaverSettingApi iDataSaverSettingApi = (IDataSaverSettingApi) PluggableExtentionKt.pluggableSpi$default(IDataSaverSettingApi.class, false, false, false, 14, null);
                            if (iDataSaverSettingApi != null) {
                                return iDataSaverSettingApi.LIZ() ? 1 : 0;
                            }
                            return 0;
                        }

                        @Override // X.InterfaceC1496590p33
                        public final long LJI() {
                            long j = C0XK4.LIZ;
                            if (j < 1651461897000L) {
                                return 1651461897000L;
                            }
                            return j;
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
        C1150504el.LIZ().LJI("method_init_ttnet_duration", false);
    }
}
