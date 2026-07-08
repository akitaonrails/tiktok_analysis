package kotlin.jvm.internal;

import X.C09AY;
import X.C0L2U;
import X.C0L4A;
import X.C0L4P;
import X.C0M6N;
import X.C0M6S;
import X.C0M6V;
import X.C0MV0;
import X.C0PEM;
import X.C1390380mHk;
import X.C20642515q3;
import X.C2188811AlT;
import X.C23250099c;
import X.C536080L0s;
import X.C547930LeJ;
import X.C576420MjA;
import X.C786410Ut5;
import X.InterfaceC497601wk;
import android.app.Activity;
import android.app.ProgressDialog;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AwS148S0101000_8 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public Object l0;

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
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS148S0101000_8 awS148S0101000_8) {
        C0L2U c0l2u = (C0L2U) awS148S0101000_8.l0;
        int i = c0l2u.LJ;
        int i2 = awS148S0101000_8.i1;
        if (i < i2) {
            c0l2u.LJ = i2;
            CreativeDialogWrapper creativeDialogWrapper = c0l2u.LIZLLL;
            if (creativeDialogWrapper != null && creativeDialogWrapper.isShowing()) {
                CreativeLoadingDialog.DefaultImpls.updateProgress$default(creativeDialogWrapper, Math.min(((C0L2U) awS148S0101000_8.l0).LJ, 100), false, 2, null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS148S0101000_8 awS148S0101000_8) {
        C536080L0s c536080L0s = (C536080L0s) awS148S0101000_8.l0;
        c536080L0s.LLJ += awS148S0101000_8.i1;
        ProgressDialog progressDialog = c536080L0s.LLIZ;
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.setProgress(Math.min(((C536080L0s) awS148S0101000_8.l0).LLJ, 100));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS148S0101000_8 awS148S0101000_8) {
        C0L4A c0l4a = (C0L4A) awS148S0101000_8.l0;
        c0l4a.LIZJ = awS148S0101000_8.i1;
        CreativeDialogWrapper creativeDialogWrapper = c0l4a.LIZ;
        if (creativeDialogWrapper != null && creativeDialogWrapper.isShowing()) {
            CreativeLoadingDialog.DefaultImpls.updateProgress$default(creativeDialogWrapper, Math.min(((C0L4A) awS148S0101000_8.l0).LIZJ, 100), false, 2, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS148S0101000_8 awS148S0101000_8) {
        Function1 function1 = (Function1) awS148S0101000_8.l0;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(awS148S0101000_8.i1));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS148S0101000_8 awS148S0101000_8) {
        C0MV0 c0mv0 = (C0MV0) awS148S0101000_8.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveDraftOnV3PushShow: save completed, scene=");
        C0MV0 c0mv02 = (C0MV0) awS148S0101000_8.l0;
        int i = awS148S0101000_8.i1;
        c0mv02.getClass();
        sbLIZ.append(C0MV0.LJIJJ(i));
        C2188811AlT.LIZIZ(sbLIZ);
        c0mv0.getClass();
        CountDownLatch andSet = ((C0MV0) awS148S0101000_8.l0).LJIIIZ.getAndSet(null);
        if (andSet != null) {
            andSet.countDown();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS148S0101000_8 awS148S0101000_8) {
        Activity activity = (Activity) awS148S0101000_8.l0;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(C20642515q3.LJI(awS148S0101000_8.i1));
        C1390380mHk.LIZ(activity, 3058, creativeToastBuilder);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS148S0101000_8 awS148S0101000_8) {
        ((Function0) ListProtector.get((List) awS148S0101000_8.l0, awS148S0101000_8.i1)).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS148S0101000_8 awS148S0101000_8) {
        ((Function0) ListProtector.get((List) awS148S0101000_8.l0, awS148S0101000_8.i1)).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS148S0101000_8 awS148S0101000_8) {
        ((C576420MjA) awS148S0101000_8.l0).LLLLIL().LJFF.invoke(Integer.valueOf(awS148S0101000_8.i1));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS148S0101000_8 awS148S0101000_8) {
        ((C576420MjA) awS148S0101000_8.l0).LLLLIL().LIZLLL.invoke(Integer.valueOf(awS148S0101000_8.i1));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS148S0101000_8 awS148S0101000_8) {
        ((C576420MjA) awS148S0101000_8.l0).LLLLIL().LJ.invoke(Integer.valueOf(awS148S0101000_8.i1));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS148S0101000_8 awS148S0101000_8) {
        C0L4P c0l4p = (C0L4P) awS148S0101000_8.l0;
        int i = awS148S0101000_8.i1;
        CreativeDialogWrapper creativeDialogWrapper = c0l4p.LLILLL;
        if (creativeDialogWrapper != null && creativeDialogWrapper.isShowing()) {
            CreativeLoadingDialog.DefaultImpls.updateProgress$default(creativeDialogWrapper, Math.min(i, 100), false, 2, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS148S0101000_8 awS148S0101000_8) {
        C0M6V c0m6v = (C0M6V) awS148S0101000_8.l0;
        int i = awS148S0101000_8.i1;
        c0m6v.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateDefaultUI: count = ");
        sbLIZ.append(i);
        c0m6v.P5(C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.LJLZ(0, (ViewGroup) c0m6v.LLJ.getValue());
        C786410Ut5.LJLZ(8, c0m6v.S5());
        C786410Ut5.LJLZ(8, (ViewGroup) c0m6v.LLJI.getValue());
        if (i > 0) {
            C786410Ut5.LJLZ(0, c0m6v.R5());
            c0m6v.L5(C0M6S.NONE, i);
        } else {
            C786410Ut5.LJLZ(8, c0m6v.R5());
            C786410Ut5.LJJJJI(c0m6v.R5());
        }
        ((ArrayList) c0m6v.LLJJJJJIL).clear();
        InterfaceC497601wk interfaceC497601wk = c0m6v.LLILLJJLI;
        if (interfaceC497601wk != null) {
            C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ, null, new C0M6N(c0m6v, i, null), 2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS148S0101000_8 awS148S0101000_8) {
        int i = awS148S0101000_8.i1;
        Object[] objArr = (Object[]) awS148S0101000_8.l0;
        return C547930LeJ.LIZ(i, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S0101000_8(Object[] objArr, int i) {
        super(0);
        this.$t = i;
        this.i1 = 2131826174;
        this.l0 = objArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S0101000_8(int i, Function1 function1, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = function1;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S0101000_8(C536080L0s c536080L0s, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c536080L0s;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S0101000_8(C0L2U c0l2u, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c0l2u;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S0101000_8(C0L4A c0l4a, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c0l4a;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S0101000_8(C0L4P c0l4p, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c0l4p;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S0101000_8(C0M6V c0m6v, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c0m6v;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S0101000_8(C0MV0 c0mv0, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c0mv0;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S0101000_8(C576420MjA c576420MjA, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c576420MjA;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S0101000_8(Activity activity, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = activity;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS148S0101000_8(List list, List<? extends Function0<Unit>> list2, int i) {
        super(0);
        this.$t = i;
        this.l0 = list;
        this.i1 = list2;
    }
}
