package com.ss.android.ugc.aweme.utils;

import X.C098200Yq;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C13041058l;
import X.C155000ia;
import X.C189200o6;
import X.C1C7U;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import com.bytedance.pitaya.api.PTYMessageHandler;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.utils.PitayaUtils$initAntiCheatListener$1", f = "PitayaUtils.kt", l = {}, m = "invokeSuspend")
public final class PitayaUtils$initAntiCheatListener$1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PitayaUtils$initAntiCheatListener$1(String str, InterfaceC1364105Vn<? super PitayaUtils$initAntiCheatListener$1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new PitayaUtils$initAntiCheatListener$1(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PitayaUtils@b38c.initAntiCheatListener$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PitayaCoreFactory.getCore(String.valueOf(1233)).registerMessageHandler(this.LL, new PTYMessageHandler() { // from class: com.ss.android.ugc.aweme.utils.PitayaUtils$initAntiCheatListener$1.1
            @Override // com.bytedance.pitaya.api.PTYMessageHandler
            public JSONObject onMessage(JSONObject jSONObject) {
                Iterator it2 = ((LinkedHashMap) C13041058l.LIZJ).values().iterator();
                while (it2.hasNext()) {
                    ((Function1) it2.next()).invoke(jSONObject);
                }
                try {
                    jSONObject.optString("risk_type");
                    C189200o6.m2constructorimpl(Unit.LIZ);
                    return jSONObject;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                    return jSONObject;
                }
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PitayaUtils@b38c.initAntiCheatListener$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
