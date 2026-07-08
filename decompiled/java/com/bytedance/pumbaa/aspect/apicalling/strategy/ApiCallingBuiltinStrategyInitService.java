package com.bytedance.pumbaa.aspect.apicalling.strategy;

import X.C825390WZl;
import X.C825400WZm;
import X.C825480WZu;
import com.bytedance.pns.engine.builtin.BuiltinNativeStrategyConfig;
import com.bytedance.pns.engine.builtin.BuiltinStrategyInitService;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class ApiCallingBuiltinStrategyInitService implements BuiltinStrategyInitService {
    @Override // com.bytedance.pns.engine.builtin.BuiltinStrategyInitService
    public final void init() {
        C825480WZu.LIZIZ(C825390WZl.LIZ);
        C825480WZu.LIZIZ(C825400WZm.LIZ);
        C825480WZu.LIZ(new BuiltinNativeStrategyConfig() { // from class: X.0WZw
            @Override // com.bytedance.pns.engine.builtin.BuiltinNativeStrategyConfig
            public final C825570Wa3 config() {
                List listLJIIJJI = C1697810uHb.LJIIJJI(new C825560Wa2("system_api_local_strategy", Collections.singletonList("system_api_local_strategy")), new C825560Wa2("sdk_local_strategy", Collections.singletonList("sdk_local_strategy")));
                List listSingletonList = Collections.singletonList("40000");
                EnumC825520WZy enumC825520WZy = EnumC825520WZy.AFTER_REMOTE;
                return new C825570Wa3(listLJIIJJI, C1697810uHb.LJIIJJI(new C825540Wa0(listSingletonList, "system_api_local_strategy", enumC825520WZy), new C825540Wa0(Collections.singletonList("40001"), "sdk_local_strategy", enumC825520WZy)));
            }
        });
    }
}
