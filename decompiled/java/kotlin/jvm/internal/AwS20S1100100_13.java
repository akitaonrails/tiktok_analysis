package kotlin.jvm.internal;

import X.C09AY;
import X.C0XGR;
import X.C0XHP;
import X.C0XUD;
import X.C0XWJ;
import X.C13LP;
import X.C20684815ws;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.services.ClearCredScene;
import com.ss.android.ugc.aweme.services.ClearLoginCredentialsService;
import com.ss.android.ugc.aweme.trace.TraceLogWrapApiImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public class AwS20S1100100_13 extends C09AY implements Function1 {
    public final int $t;
    public long j2;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS20S1100100_13 awS20S1100100_13, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        ((TraceLogWrapApiImpl) awS20S1100100_13.l1).LIZIZ.LIZ(jLongValue + awS20S1100100_13.j2, awS20S1100100_13.s0, false);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS20S1100100_13 awS20S1100100_13, Object obj) {
        C0XUD c0xud = C0XUD.LIZ;
        List listLLIIII = C13LP.LLIIII((Iterable) obj);
        C0XHP c0xhp = C0XHP.READY;
        c0xud.getClass();
        C0XUD.LJFF(listLLIIII, c0xhp);
        C0XUD.LJIIJ = System.currentTimeMillis() - awS20S1100100_13.j2;
        C0XWJ c0xwj = C0XWJ.LIZ;
        int i = (int) C0XUD.LJIIJ;
        c0xwj.getClass();
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZ(i, "load_time");
        C20684815ws.LJIILLIIL("ocl_data_load_time", c0xgr.LIZ);
        C0XWJ.LIZLLL(awS20S1100100_13.s0, true);
        Function1 function1 = (Function1) awS20S1100100_13.l1;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS20S1100100_13 awS20S1100100_13, Object obj) {
        C0XUD.LIZ.getClass();
        List<BaseLoginMethod> listLIZ = C0XUD.LIZ((List) obj, true);
        if (!((ArrayList) listLIZ).isEmpty()) {
            ClearLoginCredentialsService clearLoginCredentialsService = ClearLoginCredentialsService.INSTANCE;
            if (clearLoginCredentialsService.shouldTryClearOclCredentials()) {
                listLIZ = clearLoginCredentialsService.getUpdatedLoginMethodList(listLIZ, ClearCredScene.CLEAR_OCL);
                C0XUD.LJ(listLIZ, null);
            }
        }
        C0XUD.LJFF(C13LP.LLIIII(listLIZ), C0XHP.READY);
        C0XUD.LJIIJ = System.currentTimeMillis() - awS20S1100100_13.j2;
        C0XWJ c0xwj = C0XWJ.LIZ;
        int i = (int) C0XUD.LJIIJ;
        c0xwj.getClass();
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZ(i, "load_time");
        C20684815ws.LJIILLIIL("ocl_data_load_time", c0xgr.LIZ);
        C0XWJ.LIZLLL(awS20S1100100_13.s0, true);
        Function1 function1 = (Function1) awS20S1100100_13.l1;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: IPUT (r3 I:long), (r1 I:kotlin.jvm.internal.AwS20S1100100_13) (LINE:67108867) kotlin.jvm.internal.AwS20S1100100_13.j2 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:java.lang.String), (r1 I:kotlin.jvm.internal.AwS20S1100100_13) (LINE:67108869) kotlin.jvm.internal.AwS20S1100100_13.s0 java.lang.String, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.internal.AwS20S1100100_13] */
    public AwS20S1100100_13(long j, long j2, String str, Function1<? super Boolean, Unit> function1) {
        long j3;
        String str2;
        c09ay.$t = function1;
        c09ay.j2 = j3;
        c09ay.s0 = str2;
        c09ay.l1 = str;
        ?? c09ay = new C09AY(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S1100100_13(TraceLogWrapApiImpl traceLogWrapApiImpl, String str, long j, int i) {
        super(1);
        this.$t = i;
        this.l1 = traceLogWrapApiImpl;
        this.s0 = str;
        this.j2 = j;
    }
}
