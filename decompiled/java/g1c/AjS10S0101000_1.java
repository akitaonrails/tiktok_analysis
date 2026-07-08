package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C03JD;
import X.C03JE;
import X.C1064604Ei;
import X.C1065404Eq;
import X.C1074304Ib;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public class AjS10S0101000_1 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC420730Ged
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$0(AjS10S0101000_1 ajS10S0101000_1, View view) {
        Function2<Integer, ReviewFilterStruct, Unit> listener;
        if (view != null && (listener = ((C1074304Ib) ajS10S0101000_1.l0).getListener()) != 0) {
            listener.invoke(Integer.valueOf(ajS10S0101000_1.i1), view.getTag());
        }
    }

    public static final void LIZ$1(AjS10S0101000_1 ajS10S0101000_1, View view) {
        if (view != null) {
            C03JE c03je = (C03JE) ajS10S0101000_1.l0;
            c03je.LL.X1(ajS10S0101000_1.i1, c03je.itemView, null);
        }
    }

    public static final void LIZ$2(AjS10S0101000_1 ajS10S0101000_1, View view) {
        if (view != null) {
            C03JD c03jd = (C03JD) ajS10S0101000_1.l0;
            c03jd.LL.X1(ajS10S0101000_1.i1, c03jd.itemView, null);
        }
    }

    public static final void LIZ$3(AjS10S0101000_1 ajS10S0101000_1, View view) {
        C1065404Eq c1065404Eq;
        C1064604Ei c1064604Ei;
        if (view != null && (c1064604Ei = (c1065404Eq = (C1065404Eq) ajS10S0101000_1.l0).LLILLJJLI) != null) {
            int i = ajS10S0101000_1.i1;
            c1064604Ei.LJJIFFI(i, c1065404Eq.LLLFZ(i));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS10S0101000_1(Object obj, int i, int i2) {
        super(700L);
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
