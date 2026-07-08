package com.ss.android.ugc.aweme.dynamic.card;

import X.C099R;
import X.C09IR;
import X.C2196408j4;
import X.C2252331DDr;
import X.C2258408t4;
import X.InterfaceC1364105Vn;
import X.InterfaceC2258508t5;
import android.util.ArrayMap;
import com.ss.android.ugc.aweme.dynamic.card.api.event.IIMDynamicCardOpenService;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class IMDynamicCardOpenServiceImpl implements IIMDynamicCardOpenService {
    public static final IMDynamicCardOpenServiceImpl LIZIZ = new IMDynamicCardOpenServiceImpl();
    public static final ArrayMap<String, InterfaceC2258508t5> LIZJ = new ArrayMap<>();
    public static final C2252331DDr LIZLLL;
    public static final C2252331DDr LJ;

    public static final class Service implements IIMDynamicCardOpenService {
        public final /* synthetic */ IMDynamicCardOpenServiceImpl LIZIZ = IMDynamicCardOpenServiceImpl.LIZIZ;

        @Override // com.ss.android.ugc.aweme.dynamic.card.api.event.IIMDynamicCardOpenService
        public final void LIZ(C2258408t4 c2258408t4) {
            this.LIZIZ.LIZ(c2258408t4);
        }

        @Override // com.ss.android.ugc.aweme.dynamic.card.api.event.IIMDynamicCardOpenService
        public final Object LIZIZ(String str, Map map, InterfaceC1364105Vn interfaceC1364105Vn) {
            return this.LIZIZ.LIZIZ(str, map, interfaceC1364105Vn);
        }
    }

    static {
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        LIZLLL = c2252331DDrLIZIZ;
        LJ = c2252331DDrLIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.dynamic.card.api.event.IIMDynamicCardOpenService
    public final void LIZ(C2258408t4 c2258408t4) {
        LIZJ.put("minis", c2258408t4);
    }

    @Override // com.ss.android.ugc.aweme.dynamic.card.api.event.IIMDynamicCardOpenService
    public final Object LIZIZ(String str, Map map, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objEmit = LIZLLL.emit(new C2196408j4(str, map), interfaceC1364105Vn);
        if (objEmit == C099R.LJFF()) {
            return objEmit;
        }
        return Unit.LIZ;
    }
}
