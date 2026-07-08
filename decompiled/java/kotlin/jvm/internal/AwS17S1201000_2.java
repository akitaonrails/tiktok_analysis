package kotlin.jvm.internal;

import X.C09AY;
import X.C1397620mTQ;
import X.C13IQ;
import X.C1606906Qx;
import X.C1717606o2;
import X.C696620RUe;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.fragment.ManageGroupFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS17S1201000_2 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
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
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS17S1201000_2 awS17S1201000_2, Object obj) {
        ((Assembler) obj).RQ2((RavenFragment) awS17S1201000_2.l1, new AwS20S1101000_2(awS17S1201000_2.i3, awS17S1201000_2.s0, (C13IQ) awS17S1201000_2.l2, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS17S1201000_2 awS17S1201000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.DQ2((ManageGroupFragment) awS17S1201000_2.l1, new C1717606o2(awS17S1201000_2.s0, awS17S1201000_2.i3));
        assembler.QQ2((ManageGroupFragment) awS17S1201000_2.l1, AFwS229S0000000_2.get$arr$(90));
        assembler.QQ2((ManageGroupFragment) awS17S1201000_2.l1, new AwS581S0100000_2((View) awS17S1201000_2.l2, 74));
        assembler.QQ2((ManageGroupFragment) awS17S1201000_2.l1, AFwS229S0000000_2.get$arr$(91));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS17S1201000_2 awS17S1201000_2, Object obj) {
        C696620RUe c696620RUe = (C696620RUe) obj;
        c696620RUe.LL = (C13IQ) awS17S1201000_2.l1;
        c696620RUe.LLJ = ((ViewGroup) awS17S1201000_2.l2).findViewById(awS17S1201000_2.i3);
        c696620RUe.LLILLJJLI = awS17S1201000_2.s0;
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS17S1201000_2 awS17S1201000_2, Object obj) {
        C1606906Qx c1606906Qx = (C1606906Qx) awS17S1201000_2.l1;
        String str = awS17S1201000_2.s0;
        int i = awS17S1201000_2.i3;
        c1606906Qx.getClass();
        C1606906Qx.LIZJ(i, "click", "go_live", str);
        ((Function0) awS17S1201000_2.l2).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS17S1201000_2 awS17S1201000_2, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131835194, new AwS17S1201000_2((C1606906Qx) awS17S1201000_2.l1, (C1606906Qx) awS17S1201000_2.s0, (String) awS17S1201000_2.i3, (int) awS17S1201000_2.l2, (Function0<Unit>) 3));
        c1397620mTQ.LJII(2131835193, new AwS20S1101000_2((C1606906Qx) awS17S1201000_2.l1, awS17S1201000_2.s0, awS17S1201000_2.i3, 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S1201000_2(int i, ViewGroup viewGroup, String str, C13IQ c13iq, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = c13iq;
        this.l2 = viewGroup;
        this.i3 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS17S1201000_2(C1606906Qx c1606906Qx, C1606906Qx c1606906Qx2, String str, int i, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l1 = c1606906Qx;
        this.s0 = c1606906Qx2;
        this.i3 = str;
        this.l2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS17S1201000_2(RavenFragment ravenFragment, RavenFragment<Object> ravenFragment2, C13IQ<? extends UIAssem> c13iq, int i, String str) {
        super(1);
        this.$t = str;
        this.l1 = ravenFragment;
        this.l2 = ravenFragment2;
        this.i3 = c13iq;
        this.s0 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S1201000_2(ManageGroupFragment manageGroupFragment, String str, int i, View view, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = manageGroupFragment;
        this.s0 = str;
        this.i3 = i;
        this.l2 = view;
    }
}
