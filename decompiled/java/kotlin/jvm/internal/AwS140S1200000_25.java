package kotlin.jvm.internal;

import X.C09AY;
import X.C1389890mGx;
import X.C1652400t6M;
import X.C1653210t7f;
import X.C20145813s8;
import X.C2341909Fp;
import X.C2344009Gk;
import X.C2344809Gs;
import X.C838130WuJ;
import X.InterfaceC2342209Fs;
import android.content.Context;
import android.view.View;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.refine.ICreativeRefineService;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes26.dex */
public class AwS140S1200000_25 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS140S1200000_25 awS140S1200000_25) {
        try {
            C20145813s8.LIZ("user_info", awS140S1200000_25.s0, (Context) awS140S1200000_25.l1, CertProviderManagerKt.findCert("bpea-213", 1476399119));
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LIZ(e);
        }
        C1389890mGx c1389890mGx = new C1389890mGx((View) awS140S1200000_25.l2);
        c1389890mGx.LJIIIZ(2131828861);
        c1389890mGx.LJIIJJI();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS140S1200000_25 awS140S1200000_25) {
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_name", awS140S1200000_25.s0);
        C1653210t7f c1653210t7f = (C1653210t7f) awS140S1200000_25.l1;
        Map map = (Map) awS140S1200000_25.l2;
        long j = c1653210t7f.LIZIZ;
        if (j > 0) {
            c2344009Gk.LIZLLL(j - c1653210t7f.LIZ, "react_ui_duration");
        }
        long j2 = c1653210t7f.LIZJ;
        if (j2 > 0) {
            c2344009Gk.LIZLLL(j2 - c1653210t7f.LIZ, "react_response_duration");
        }
        if (map != null) {
            c2344009Gk.LJII(map);
        }
        C2341909Fp.LIZ("tool_performance_ui_react_event", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS140S1200000_25 awS140S1200000_25) {
        ((C1652400t6M) awS140S1200000_25.l1).FO1((AVMusic) awS140S1200000_25.l2, awS140S1200000_25.s0);
        ((C1652400t6M) awS140S1200000_25.l1).P3();
        ICreativeRefineService iCreativeRefineService = (ICreativeRefineService) PluggableExtentionKt.pluggableSpi$default(ICreativeRefineService.class, false, false, false, 14, null);
        if (iCreativeRefineService != null) {
            iCreativeRefineService.LIZ(true);
            return Unit.LIZ;
        }
        return null;
    }

    public static final Object invoke$3(AwS140S1200000_25 awS140S1200000_25) {
        if ((!a0.LJJJIL(awS140S1200000_25.s0)) && ((Boolean) ((Function1) awS140S1200000_25.l1).invoke(awS140S1200000_25.s0)).booleanValue()) {
            ((Function0) awS140S1200000_25.l2).invoke();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1200000_25(C1652400t6M c1652400t6M, AVMusic aVMusic, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1652400t6M;
        this.l2 = aVMusic;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1200000_25(Context context, View view, String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = context;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS140S1200000_25(String str, String str2, C1653210t7f c1653210t7f, Map<String, String> map) {
        super(0);
        this.$t = map;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = c1653210t7f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S1200000_25(String str, Function0 function0, Function1 function1, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = function1;
        this.l2 = function0;
    }
}
