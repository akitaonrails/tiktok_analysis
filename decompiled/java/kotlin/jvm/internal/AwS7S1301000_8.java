package kotlin.jvm.internal;

import X.C09AY;
import X.C0M2E;
import X.C1397620mTQ;
import X.C297750Bll;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.tools.mvtemplate.ugcpreview.preload.UgcPreloadTemplateServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public class AwS7S1301000_8 extends C09AY implements Function1 {
    public final int $t;
    public int i4;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000f A[PHI: r2
      0x000f: PHI (r2v2 java.lang.String) = (r2v0 java.lang.String), (r2v3 java.lang.String) binds: [B:7:0x000d, B:5:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS7S1301000_8 r19, java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS7S1301000_8.invoke$0(kotlin.jvm.internal.AwS7S1301000_8, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS7S1301000_8 awS7S1301000_8, Object obj) {
        int i;
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        C0M2E c0m2e = C0M2E.LIZ;
        Context context = (Context) awS7S1301000_8.l1;
        c0m2e.getClass();
        c1397620mTQ.LIZJ(2, context.getString(2131832437), new AwS21S1101000_8(awS7S1301000_8.s0, awS7S1301000_8.i4, (Function0) awS7S1301000_8.l2, 0));
        Context context2 = (Context) awS7S1301000_8.l1;
        if (C297750Bll.LIZ()) {
            i = 2131832439;
        } else {
            i = 2131832438;
        }
        c1397620mTQ.LIZJ(1, context2.getString(i), new AwS21S1101000_8(awS7S1301000_8.s0, awS7S1301000_8.i4, (Function0) awS7S1301000_8.l3, 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S1301000_8(Context context, int i, String str, AwS552S0100000_8 awS552S0100000_8, Function0 function0, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = context;
        this.i4 = i;
        this.s0 = str;
        this.l2 = awS552S0100000_8;
        this.l3 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS7S1301000_8(String str, String str2, Function2<? super String, ? super String, Unit> function2, UgcPreloadTemplateServiceImpl ugcPreloadTemplateServiceImpl, Activity activity, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = function2;
        this.l3 = ugcPreloadTemplateServiceImpl;
        this.i4 = activity;
    }
}
