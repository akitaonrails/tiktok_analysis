package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C1230940i8a;
import X.C197039127h;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.fangroup.view.FanGroupAssemCell;

/* JADX INFO: loaded from: classes20.dex */
public class AbS66S0310000_19 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS66S0310000_19 abS66S0310000_19, View view) {
        if (view != null) {
            ((FanGroupAssemCell) abS66S0310000_19.l0).op((C197039127h) abS66S0310000_19.l1, (C1230940i8a) abS66S0310000_19.l2, abS66S0310000_19.z3);
        }
    }

    public static final void LIZ$1(AbS66S0310000_19 abS66S0310000_19, View view) {
        if (view != null) {
            ((FanGroupAssemCell) abS66S0310000_19.l0).op((ConstraintLayout) abS66S0310000_19.l1, (C1230940i8a) abS66S0310000_19.l2, abS66S0310000_19.z3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS66S0310000_19(Object obj, Object obj2, Object obj3, boolean z, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.z3 = z;
    }
}
