package kotlin.jvm.internal;

import X.AbstractC1433570nPP;
import X.C09AY;
import X.C0FNG;
import X.C0LAB;
import X.C13LP;
import X.C1409560mmg;
import X.C1419590n2r;
import X.C1422560n7e;
import X.C1422640n7m;
import X.C1424920nBS;
import X.C1459920o5u;
import X.C1593720rZi;
import X.InterfaceC1460000o62;
import Y.ALAdapterS3S0100000_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public class AwS129S0101000_22 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS129S0101000_22 awS129S0101000_22, Object obj) {
        ((C1422560n7e) awS129S0101000_22.l0).i3(new C1422640n7m(awS129S0101000_22.i1, ((Boolean) obj).booleanValue()));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS129S0101000_22 awS129S0101000_22, Object obj) {
        C1409560mmg c1409560mmg = (C1409560mmg) awS129S0101000_22.l0;
        return C0FNG.LIZ((C0FNG) obj, C13LP.LL(c1409560mmg.LLJLILLLLZIIL, c1409560mmg.n5()), null, null, awS129S0101000_22.i1, 6);
    }

    public static final Object invoke$2(AwS129S0101000_22 awS129S0101000_22, Object obj) {
        View view = (View) obj;
        C1459920o5u.LLIZLLLIL.getClass();
        ObjectAnimator objectAnimatorLIZ = C1593720rZi.LIZ(view, 1.0f, 0.7f, 200L);
        ObjectAnimator objectAnimatorLIZ2 = C1593720rZi.LIZ(view, 0.7f, 1.1f, 250L);
        ObjectAnimator objectAnimatorLIZ3 = C1593720rZi.LIZ(view, 1.1f, 0.98f, 200L);
        ObjectAnimator objectAnimatorLIZ4 = C1593720rZi.LIZ(view, 0.98f, 1.1f, 150L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(objectAnimatorLIZ, objectAnimatorLIZ2, objectAnimatorLIZ3, objectAnimatorLIZ4);
        animatorSet.addListener(new ALAdapterS3S0100000_6(view, 18));
        animatorSet.start();
        InterfaceC1460000o62 interfaceC1460000o62 = (InterfaceC1460000o62) ((C1459920o5u) awS129S0101000_22.l0).LLILZIL.getValue();
        if (interfaceC1460000o62 != null) {
            int i = awS129S0101000_22.i1;
            ((C1459920o5u) awS129S0101000_22.l0).getClass();
            interfaceC1460000o62.KK0(i, "star_lottie.json");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS129S0101000_22 awS129S0101000_22, Object obj) {
        return Boolean.valueOf(((List) obj).addAll(awS129S0101000_22.i1, (Collection) awS129S0101000_22.l0));
    }

    public static final Object invoke$4(AwS129S0101000_22 awS129S0101000_22, Object obj) {
        ((C1424920nBS) awS129S0101000_22.l0).LLILZLL.LIZJ(awS129S0101000_22.i1, (C1419590n2r) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS129S0101000_22 awS129S0101000_22, Object obj) {
        ((AbstractC1433570nPP) obj).onProgress(awS129S0101000_22.i1, awS129S0101000_22.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS129S0101000_22 awS129S0101000_22, Object obj) {
        C0LAB c0lab = (C0LAB) obj;
        c0lab.LJ("method", String.valueOf(awS129S0101000_22.i1));
        return ((Function1) awS129S0101000_22.l0).invoke(c0lab);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S0101000_22(int i, Object obj, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS129S0101000_22(int i, int i2, Collection<? extends T> collection) {
        super(1);
        this.$t = collection;
        this.i1 = i;
        this.l0 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S0101000_22(int i, AwS601S0100000_22 awS601S0100000_22, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = awS601S0100000_22;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S0101000_22(C1409560mmg c1409560mmg, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1409560mmg;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S0101000_22(C1422560n7e c1422560n7e, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1422560n7e;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S0101000_22(C1424920nBS c1424920nBS, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1424920nBS;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S0101000_22(C1459920o5u c1459920o5u, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1459920o5u;
        this.i1 = i;
    }
}
