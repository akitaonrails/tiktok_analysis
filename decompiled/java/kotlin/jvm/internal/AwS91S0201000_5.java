package kotlin.jvm.internal;

import X.C09AY;
import X.C0E1T;
import X.C0E48;
import X.C0E6L;
import X.C0EGC;
import X.C0EM5;
import X.C0ET4;
import X.C0ET8;
import X.C0FGS;
import X.C0FGZ;
import X.C113G;
import X.C12WG;
import X.C1397620mTQ;
import X.C1426800nEU;
import X.C1DRG;
import X.C259800zU;
import X.C360610EBv;
import X.C364040EPa;
import X.C365100ETc;
import X.C368300EcG;
import X.C375830EoP;
import X.C382840Ezi;
import X.C382850Ezj;
import X.C387180FGa;
import X.C387490FHf;
import X.C559610Lx9;
import android.app.Activity;
import android.os.SystemClock;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS91S0201000_5 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS91S0201000_5 awS91S0201000_5, Object obj) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C365100ETc c365100ETc = (C365100ETc) awS91S0201000_5.l1;
        C1426800nEU c1426800nEU = new C1426800nEU(c365100ETc, (C1DRG) obj, awS91S0201000_5.i2, c365100ETc.LLJJJJ, c365100ETc.LLJJJIL);
        ((C365100ETc) awS91S0201000_5.l1).LLLILZLLLI = c1426800nEU;
        ((C559610Lx9) awS91S0201000_5.l0).getClass();
        c1426800nEU.afterInit$als_release(jUptimeMillis);
        return c1426800nEU;
    }

    public static final Object invoke$1(AwS91S0201000_5 awS91S0201000_5, Object obj) {
        return C387490FHf.LIZ((C387490FHf) obj, null, (List) ((C259800zU) awS91S0201000_5.l0).element, (List) ((C259800zU) awS91S0201000_5.l1).element, Integer.valueOf(awS91S0201000_5.i2), new C387180FGa("", null), false, false, null, null, new C375830EoP(0), null, 0, 3457);
    }

    public static final Object invoke$2(AwS91S0201000_5 awS91S0201000_5, Object obj) {
        C382840Ezi c382840Ezi = (C382840Ezi) obj;
        Integer numValueOf = Integer.valueOf(awS91S0201000_5.i2);
        Integer num = (Integer) awS91S0201000_5.l0;
        if (num == null) {
            num = ((C382850Ezj) awS91S0201000_5.l1).T2().LJJIFFI;
        }
        return C382840Ezi.LIZ(c382840Ezi, null, false, null, null, null, null, null, null, false, numValueOf, null, null, 0, false, false, false, false, false, null, null, null, null, num, 33550335);
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS91S0201000_5 awS91S0201000_5, Object obj) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C0ET8 c0et8 = (C0ET8) awS91S0201000_5.l1;
        C364040EPa c364040EPa = new C364040EPa(c0et8, C12WG.LJ(c0et8), (C1DRG) obj, awS91S0201000_5.i2);
        ((C0ET8) awS91S0201000_5.l1).LLJJLIIIJLLLLLLLZ = c364040EPa;
        ((C559610Lx9) awS91S0201000_5.l0).getClass();
        c364040EPa.afterInit$als_release(jUptimeMillis);
        return c364040EPa;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS91S0201000_5 awS91S0201000_5, Object obj) {
        C113G c113gId2;
        C1DRG c1drg = (C1DRG) obj;
        long jUptimeMillis = SystemClock.uptimeMillis();
        C0ET8 c0et8 = (C0ET8) awS91S0201000_5.l1;
        int i = awS91S0201000_5.i2;
        C364040EPa c364040EPa = c0et8.LLJJLIIIJLLLLLLLZ;
        if (c364040EPa != null) {
            c113gId2 = c364040EPa.Id2();
        } else {
            c113gId2 = null;
        }
        EditModelProvider.Companion.getClass();
        C1426800nEU c1426800nEU = new C1426800nEU(c0et8, c1drg, i, c113gId2, C0E1T.LIZ().getEditModel());
        ((C0ET8) awS91S0201000_5.l1).LLJL = c1426800nEU;
        ((C559610Lx9) awS91S0201000_5.l0).getClass();
        c1426800nEU.afterInit$als_release(jUptimeMillis);
        return c1426800nEU;
    }

    public static final Object invoke$5(AwS91S0201000_5 awS91S0201000_5, Object obj) {
        int i;
        long jLongValue = ((Number) obj).longValue();
        float fLIZJ = C360610EBv.LIZJ();
        C368300EcG c368300EcG = (C368300EcG) awS91S0201000_5.l0;
        NLETrackSlot nLETrackSlot = (NLETrackSlot) awS91S0201000_5.l1;
        c368300EcG.getClass();
        float startTime = fLIZJ * (jLongValue + (nLETrackSlot.getStartTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
        float f = C360610EBv.LIZIZ / 2.0f;
        int i2 = (int) (startTime - f);
        int i3 = (int) (startTime + f);
        int i4 = awS91S0201000_5.i2;
        if (i4 < i2) {
            i = 1;
        } else if (i4 > i3) {
            i = -1;
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    public static final Object invoke$6(AwS91S0201000_5 awS91S0201000_5, Object obj) {
        C0EGC c0egcLJIILL = ((C0E6L) awS91S0201000_5.l0).LJIILL();
        if (c0egcLJIILL != null) {
            final C0E48 c0e48 = (C0E48) awS91S0201000_5.l1;
            final int i = awS91S0201000_5.i2;
            final C0E6L c0e6l = (C0E6L) awS91S0201000_5.l0;
            c0egcLJIILL.e1(null, false, false, true, new C0EM5() { // from class: X.0E6M
                @Override // X.C0EM5
                public final void onFailed() {
                }

                @Override // X.C0EM5
                public final void onSuccess() {
                    c0e6l.LJJ(c0e48.Rn().getSortedSlots().get(i));
                    Activity activityLJIIIZ = c0e6l.LJIIIZ();
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131850360);
                    C1390380mHk.LIZ(activityLJIIIZ, 1063, creativeToastBuilder);
                }
            });
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS91S0201000_5 awS91S0201000_5, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131833393, new AwS91S0201000_5(awS91S0201000_5.i2, (C0E6L) awS91S0201000_5.l0, (C0E48) awS91S0201000_5.l1, 6));
        c1397620mTQ.LJII(2131833383, AFwS234S0000000_5.get$arr$(524));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS91S0201000_5(int i, C0E6L c0e6l, C0E48 c0e48, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c0e6l;
        this.l1 = c0e48;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS91S0201000_5(int i, Integer num, C382850Ezj c382850Ezj, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = num;
        this.l1 = c382850Ezj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS91S0201000_5(C259800zU c259800zU, C259800zU<List<C0FGS>> c259800zU2, C259800zU<List<C0FGZ>> c259800zU3, int i) {
        super(1);
        this.$t = i;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.i2 = c259800zU3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS91S0201000_5(C368300EcG c368300EcG, NLETrackSlot nLETrackSlot, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c368300EcG;
        this.l1 = nLETrackSlot;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS91S0201000_5(C0ET4 c0et4, C559610Lx9 c559610Lx9, C0ET8 c0et8, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c559610Lx9;
        this.l1 = c0et8;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS91S0201000_5(C0ET4 c0et4, C559610Lx9 c559610Lx9, C365100ETc c365100ETc, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c559610Lx9;
        this.l1 = c365100ETc;
        this.i2 = i;
    }
}
