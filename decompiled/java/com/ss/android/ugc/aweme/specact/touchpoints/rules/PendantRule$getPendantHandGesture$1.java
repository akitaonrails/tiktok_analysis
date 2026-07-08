package com.ss.android.ugc.aweme.specact.touchpoints.rules;

import X.C01RL;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C0PEM;
import X.C155000ia;
import X.C1C7U;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import com.bytedance.pitaya.api.PTYMessageHandler;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.specact.touchpoints.rules.PendantRule$getPendantHandGesture$1", f = "PendantRule.kt", l = {}, m = "invokeSuspend")
public final class PendantRule$getPendantHandGesture$1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<JSONObject, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PendantRule$getPendantHandGesture$1(Function1<? super JSONObject, Unit> function1, InterfaceC1364105Vn<? super PendantRule$getPendantHandGesture$1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new PendantRule$getPendantHandGesture$1(this.LL, interfaceC1364105Vn);
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.specact.touchpoints.rules.PendantRule$getPendantHandGesture$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements PTYMessageHandler {
        public final /* synthetic */ Function1<JSONObject, Unit> $action;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super JSONObject, Unit> function1) {
            this.$action = function1;
        }

        @Override // com.bytedance.pitaya.api.PTYMessageHandler
        public JSONObject onMessage(JSONObject jSONObject) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C01RL(this.$action, jSONObject, null), 3);
            return jSONObject;
        }
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PendantRule@7bb1.getPendantHandGesture$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ISpecActService iSpecActService = (ISpecActService) PluggableExtentionKt.pluggableSpi$default(ISpecActService.class, false, false, false, 14, null);
        if (iSpecActService != null) {
            iSpecActService.LJLIIL();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PendantRule@7bb1.getPendantHandGesture$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
