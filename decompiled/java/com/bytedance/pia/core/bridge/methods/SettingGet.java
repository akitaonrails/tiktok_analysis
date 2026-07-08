package com.bytedance.pia.core.bridge.methods;

import X.C09CT;
import X.C1BP0;
import X.C1BP1;
import X.C1BP6;
import X.C1BPO;
import X.C2203961BNq;
import X.C2204041BNy;
import X.C2204191BOn;
import X.C2204431BPl;
import X.InterfaceC1537230q6b;
import X.InterfaceC2204471BPp;
import com.bytedance.pia.core.bridge.methods.SettingGet;
import com.bytedance.pia.core.setting.Config;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public final class SettingGet implements InterfaceC2204471BPp<Void, Result> {
    public static final C1BP1<Void, Result> LIZ = new C1BP1<>("pia.internal.setting.get", C1BP0.All, new InterfaceC1537230q6b() { // from class: X.1BQH
        @Override // X.InterfaceC1537230q6b
        public final Object create() {
            return new SettingGet();
        }

        @Override // X.InterfaceC1537230q6b
        public final Object LIZ(Object obj) {
            return create();
        }
    });

    public static class Result {

        @C09CT("base")
        public Map<String, Boolean> base;

        @C09CT("feature")
        public Map<String, Boolean> feature;

        @C09CT("pageSetting")
        public Config pageSetting;

        public Result(Map<String, Boolean> map, Map<String, Boolean> map2, Config config) {
            this.base = map;
            this.feature = map2;
            this.pageSetting = config;
        }
    }

    @Override // X.InterfaceC2204471BPp
    public final void LIZ(C1BP6 c1bp6, Object obj, C1BPO c1bpo, C2204431BPl c2204431BPl) {
        try {
            c1bpo.accept(new Result((Map) C2203961BNq.LIZ().LIZIZ.getValue(), (Map) C2203961BNq.LIZ().LIZJ.getValue(), ((C2204041BNy) c1bp6.LIZIZ).LIZLLL));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c2204431BPl.accept(new C2204191BOn(th.toString()));
        }
    }
}
